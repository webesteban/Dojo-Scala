package controllers

import javax.inject.Singleton
import javax.inject.Inject
import play.api.mvc.Controller
import play.api.libs.json.Writes
import models.CompleteRestaurant
import play.api.libs.json.JsPath
import play.api.libs.functional.syntax._
import play.api.libs.json.Reads
import models.Restaurant
import play.api.mvc.Action
import dao.Restaurants
import play.api.libs.json.Json
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class RestaurantController @Inject extends Controller{
  
  implicit val  restaurantWrites:Writes[CompleteRestaurant] = (
    (JsPath \ "id").write[Long] and 
    (JsPath \ "name").write[String] and
    (JsPath \ "city").write[String] and
    (JsPath \ "address").write[String] and
    (JsPath \ "phone").write[String]   
  )(unlift(CompleteRestaurant.unapply))
  
  implicit val restaurantReads:Reads[Restaurant] = (
    (JsPath \ "name").read[String] and
    (JsPath \ "city").read[String] and
    (JsPath \ "address").read[String] and
    (JsPath \ "phone").read[String]   
  )(Restaurant.apply _)
  
  def getAll = Action.async {
    Restaurants.list map { restaurant =>
      val json = Json.toJson(restaurant)
      Ok(json)
    }
  }
  
  def getById (id: Long) = Action.async {
    Restaurants.getById(id) map { restaurant =>
      val json = Json.toJson(restaurant)
      Ok(json)
    }
  }
  
  def save = Action.async(parse.json) { implicit request =>
    val restaurant = request.body.validate[Restaurant]
    val received = restaurant.get
    val cRestaurant = CompleteRestaurant(0, received.name, received.city, received.address, received.phone)
    Restaurants.save(cRestaurant) map { res =>
      Ok(res)
    }
  }
  
  def update(id: Long) = Action.async(parse.json) { implicit request =>
    val restaurant = request.body.validate[Restaurant]
    val received = restaurant.get
    val cRestaurant = CompleteRestaurant(id, received.name, received.city, received.address, received.phone)
    Restaurants.update(cRestaurant) map { res =>
      Ok("Update: "+ res)
    }
  }
  
  def delete(id:Long) =Action.async{
    Restaurants.delete(id) map { deleted =>
      Ok("Deleted "+deleted)      
    }
  }
  
  
  
}