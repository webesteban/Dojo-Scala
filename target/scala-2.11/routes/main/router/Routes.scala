
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantelis/scala/conf/routes
// @DATE:Sat Oct 08 11:46:24 COT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_4: controllers.Assets,
  // @LINE:16
  RestaurantController_3: controllers.RestaurantController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:16
    RestaurantController_3: controllers.RestaurantController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, RestaurantController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, RestaurantController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants""", """controllers.RestaurantController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.getById(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants""", """controllers.RestaurantController.save"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RestaurantController_getAll4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants")))
  )
  private[this] lazy val controllers_RestaurantController_getAll4_invoker = createInvoker(
    RestaurantController_3.getAll,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getAll",
      Nil,
      "GET",
      """""",
      this.prefix + """restaurants"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RestaurantController_getById5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getById5_invoker = createInvoker(
    RestaurantController_3.getById(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getById",
      Seq(classOf[Long]),
      "GET",
      """Get restaurant by id""",
      this.prefix + """restaurants/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RestaurantController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants")))
  )
  private[this] lazy val controllers_RestaurantController_save6_invoker = createInvoker(
    RestaurantController_3.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "save",
      Nil,
      "POST",
      """Save a restaurant""",
      this.prefix + """restaurants"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_RestaurantController_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_update7_invoker = createInvoker(
    RestaurantController_3.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """Update a restauran """,
      this.prefix + """restaurants/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RestaurantController_delete8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_delete8_invoker = createInvoker(
    RestaurantController_3.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """Delete a restaurant """,
      this.prefix + """restaurants/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_RestaurantController_getAll4_route(params) =>
      call { 
        controllers_RestaurantController_getAll4_invoker.call(RestaurantController_3.getAll)
      }
  
    // @LINE:19
    case controllers_RestaurantController_getById5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RestaurantController_getById5_invoker.call(RestaurantController_3.getById(id))
      }
  
    // @LINE:22
    case controllers_RestaurantController_save6_route(params) =>
      call { 
        controllers_RestaurantController_save6_invoker.call(RestaurantController_3.save)
      }
  
    // @LINE:25
    case controllers_RestaurantController_update7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RestaurantController_update7_invoker.call(RestaurantController_3.update(id))
      }
  
    // @LINE:28
    case controllers_RestaurantController_delete8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RestaurantController_delete8_invoker.call(RestaurantController_3.delete(id))
      }
  }
}
