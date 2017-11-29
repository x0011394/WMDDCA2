
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <title>DSM Fitness</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center">
	<img src=""""),_display_(/*14.13*/routes/*14.19*/.Assets.at("/public/images", "logo.png")),format.raw/*14.59*/("""" /> 
</div>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">DSM Fitness</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
	  
				<li class="dropdown"><a class=dropdown-toggle" data-toggle="dropdown" 
				href="equipment">Equipment<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="equipmentfreeweights">Free-Weights</a></li>
					<li><a href="equipmentmachine">Machines & Benches</a></li>
				</ul>
				</li>
				
				<li class="dropdown"><a class=dropdown-toggle" data-toggle="dropdown" 
				href="supplements">Supplements<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="supplements">Muscle Growth</a></li>
					<li><a href="weightloss">Weight-Loss</a></li>
				</ul>
				</li>
	
	<li><a href="about">About Us</a></li>
	<li><a href="contact">Contact</a></li>
		
	<ul class="nav navbar-nav navbar-right">
      <li><a href="signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
	  
	  <form class="navbar-form navbar-right">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
    </ul>
  </div>
</nav>
  
<div class="container">
  <div class="rounded mx-auto d-block">
  
    <div class="col-sm-6">
		<a href="supplements"><img src=""""),_display_(/*64.36*/routes/*64.42*/.Assets.at("/public/images", "muscle.png")),format.raw/*64.84*/("""" />
    </div>
	
	
    <div class="col-sm-6">
		<a href="equipmentmachine"><img src=""""),_display_(/*69.41*/routes/*69.47*/.Assets.at("/public/images", "equipment.png")),format.raw/*69.92*/("""" />
    </div>
    </div>
</div>

<div>
	<br>
</div>

<nav class="navbar navbar-nav">
<footer class="footer-distributed">
	<div class="footer-left" class="center-block">
	<p class="footer-links">
		<a href="/">Home</a>
		.
		<a href="about">About Us</a>
		.
		<a href="contact">Contact</a>
	</p>
	<p class="footer-company-name">DSM Fitness 2017</p>
	</div>
</nav>
</footer>


</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 29 10:02:04 GMT 2017
                  SOURCE: /home/wdd/webapps/ca2/app/views/index.scala.html
                  HASH: e1cfa1d44cbb2a3950a7cc4d154b11f5a6713dfa
                  MATRIX: 1030->0|1587->530|1602->536|1663->576|3340->2226|3355->2232|3418->2274|3537->2366|3552->2372|3618->2417
                  LINES: 33->1|46->14|46->14|46->14|96->64|96->64|96->64|101->69|101->69|101->69
                  -- GENERATED --
              */
          