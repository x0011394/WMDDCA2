
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

object equipmentmachine extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
  <img src=""""),_display_(/*14.14*/routes/*14.20*/.Assets.at("/public/images", "logo.png")),format.raw/*14.60*/("""" />
</div>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">DSM Fitness</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="/">Home</a></li>
	  
				<li class="active" class="dropdown"><a class=dropdown-toggle" data-toggle="dropdown" 
				href="equipment">Equipment<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="equipmentfreeweights">Free-Weights</a></li>
					<li><li><a href="equipmentmachine">Machines & Benches</a></li>
				</ul>
				</li>
				
				<li class="dropdown"><a class=dropdown-toggle" data-toggle="dropdown" 
				href="supplements">Supplements<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="supplements">Muscle</a></li>
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

<div class="jumbotron text-center">
  <h1>Machine vs Gains!</h1>
  <p>Building muscle?</p>
  <p>Check down below and find out!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Smith Machine</h3>
      <<img src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.at("/public/images", "smithMachine.jpg")),format.raw/*70.73*/("""" />
      <ul>
      
  <li>Provides Stability</li>
  <li>Variety</li>
  <li>Direct Targeting of muscles</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>Seated Leg Press</h3>
      <img src=""""),_display_(/*81.18*/routes/*81.24*/.Assets.at("/public/images", "legpress.jpg")),format.raw/*81.68*/("""" />
      <ul>
  <li>Quads,glutes,hamstrings,calves.</li>
  <li>Supports muscle growth</li>
  <li>Helps people build a foundation for squats.</li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>Cardio Rowing Machine</h3>  
      <img src=""""),_display_(/*90.18*/routes/*90.24*/.Assets.at("/public/images", "row.jpg")),format.raw/*90.63*/("""" />
      <ul>
  <li>Total Body Workout</li>
  <li>Works upper and lower body </li>
  <li>Great for building cardio Endurance</li>
</ul> 
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Latorial Pull Down</h3>
      <img src=""""),_display_(/*103.18*/routes/*103.24*/.Assets.at("/public/images", "latpull.jpg")),format.raw/*103.67*/("""" />
      <ul>
      
  <li>Shoulders , traps , latorials</li>
  <li>Compound Workout excellent for building and maintaining muscle</li>
  <li>Builds a strong compund if you ever want to do pull ups!</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>Chest Press</h3>
      <img src=""""),_display_(/*114.18*/routes/*114.24*/.Assets.at("/public/images", "cpress.jpg")),format.raw/*114.66*/("""" />
      <ul>
  <li>Working your Chest,Biceps,Triceps</li>
  <li> Helps Create a stable workout plan</li>
  <li>Used on any level when entering the Gym</li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>Hanging Leg Press</h3>  
      <img src=""""),_display_(/*123.18*/routes/*123.24*/.Assets.at("/public/images", "legpress.jpg")),format.raw/*123.68*/("""" />
      <ul>
  <li>Core , HipFlecors, Glutes</li>
  <li>Excellent Way to Get your body in shape </li>
  <li>No strain involved and easy to use</li>
</ul> 
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Cable Bar</h3>
      <img src=""""),_display_(/*136.18*/routes/*136.24*/.Assets.at("/public/images", "cbar.jpg")),format.raw/*136.64*/("""" />
      <ul>
      
  <li>All in one Machine</li>
  <li>Manufactured to hit every public Result equipmentmachine() """),format.raw/*140.66*/("""{"""),format.raw/*140.67*/("""
        """),format.raw/*141.9*/("""return ok(equipmentmachine.render());
    """),format.raw/*142.5*/("""}"""),format.raw/*142.6*/(""" """),format.raw/*142.7*/("""part of your body while working out </li>
  <li>The Cable helps you force out them extra couple of reps.</li>
</ul> 
      

  </div>
</div>
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
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 29 10:05:15 GMT 2017
                  SOURCE: /home/wdd/webapps/ca2/app/views/equipmentmachine.scala.html
                  HASH: 36be8f98ffe080b2d722edeca1181b47be476b10
                  MATRIX: 1041->0|1586->518|1601->524|1662->564|3413->2288|3428->2294|3497->2342|3736->2554|3751->2560|3816->2604|4092->2853|4107->2859|4167->2898|4483->3186|4499->3192|4564->3235|4894->3537|4910->3543|4974->3585|5258->3841|5274->3847|5340->3891|5666->4189|5682->4195|5744->4235|5891->4353|5921->4354|5958->4363|6028->4405|6057->4406|6086->4407
                  LINES: 33->1|46->14|46->14|46->14|102->70|102->70|102->70|113->81|113->81|113->81|122->90|122->90|122->90|135->103|135->103|135->103|146->114|146->114|146->114|155->123|155->123|155->123|168->136|168->136|168->136|172->140|172->140|173->141|174->142|174->142|174->142
                  -- GENERATED --
              */
          