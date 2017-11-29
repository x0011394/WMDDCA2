
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/ca2/conf/routes
// @DATE:Wed Nov 29 09:57:23 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:18
    def equipmentfreeweights(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "equipmentfreeweights")
    }
  
    // @LINE:14
    def supplements(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "supplements")
    }
  
    // @LINE:12
    def weightloss(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "weightloss")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:16
    def equipmentmachine(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "equipmentmachine")
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:20
        case (path, file) if path == "/public" && file == "logo.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "logo.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "logo.png")
      
        // @LINE:25
        case (path, file) if path == "/public/images" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "assests/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
