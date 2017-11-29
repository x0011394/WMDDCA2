
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/ca2/conf/routes
// @DATE:Wed Nov 29 09:57:23 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
