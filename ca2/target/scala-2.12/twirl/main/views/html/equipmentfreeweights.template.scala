
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

object equipmentfreeweights extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <img src=""""),_display_(/*14.16*/routes/*14.22*/.Assets.at("/public/images", "logo.png")),format.raw/*14.62*/("""" />
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
					<li><li><a href="equipmentfreeweights">Free-Weights</a></li>
					<li><a href="equipmentmachine">Machines & Benches</a></li>
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
  <h1>Free Weights vs Gains!</h1>
  <p>How To build a solid body for a solid workout!</p>
  <p>Check down below and find out!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Bent Over Row</h3>
      <img src=""""),_display_(/*70.18*/routes/*70.24*/.Assets.at("/public/images", "bentoverrow.png")),format.raw/*70.71*/("""" />
      <ul>
      
  <li>Keep your Core tight</li>
  <li>Back Straight and raise weight to chest</li>
  <li>traps, rhomboids, lats and biceps perfect for getting you that ‘V’ shape,”.
  <li> And not only that, it'll hone in on your deltoids</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>Dumbell Clean</h3>
      <img src=""""),_display_(/*82.18*/routes/*82.24*/.Assets.at("/public/images", "dbclean.png")),format.raw/*82.67*/("""" />
      <ul>
  <li>Face forward,and bring the weight to your shoulders</li>
  <li>while jumping slightly,and slowly straighten your legs</li>
  <li>Helps build explosive power,rushes blood to glutes ,hamstrings and shoulders</li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>Bench Press free weight</h3>  
      <<img src=""""),_display_(/*91.19*/routes/*91.25*/.Assets.at("/public/images", "benchW.jpg")),format.raw/*91.67*/("""" />     
      <ul>
  <li>Straighten you back and keep shoulders pinned</li>
  <li>Extend Arms and slowly bring down to chest</li>
  <li>Recruits as many muscle fibres as possible, and builds a bigger Chest</li>
</ul> 
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Cross Body hammer Curl</h3>
      <img src=""""),_display_(/*104.18*/routes/*104.24*/.Assets.at("/public/images", "cbcurl.jpg")),format.raw/*104.66*/("""" />
      <ul>
      
  <li>One at a time curl each weight to opposing Shoulder</li>
  <li>Return to starting Position</li>
  <li>Builds muscle fibres,engages the nervous Sysytem</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>Step-ups</h3>
      <img src=""""),_display_(/*115.18*/routes/*115.24*/.Assets.at("/public/images", "stepup.png")),format.raw/*115.66*/("""" />
      <ul>
	  <li></li>
  <li>Place working foot onto elevated platform and push through your heel</li>
  <li>Repeat on other side</li>
  <li>Maximises your Glutes strength,also acts as a stabiliser </li>
  <li> to help prevent injuries </li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>Dumbell Stiff Legged Deadlift</h3>  
      <img src=""""),_display_(/*126.18*/routes/*126.24*/.Assets.at("/public/images", "stiff.png")),format.raw/*126.65*/("""" />
      <ul>
  <li>Lower the dumbbells to your feet,as far as you can go</li>
  <li>Then Slowly return to starting position </li>
  <li>Prevents hip and lower back injuries,also best free weight activity</li>
</ul> 
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>One Arm Swing</h3>
      <img src=""""),_display_(/*139.18*/routes/*139.24*/.Assets.at("/public/images", "oneswing.jpg")),format.raw/*139.68*/("""" />
      <ul>
      
  <li>Sink into a squat and swing dungbell through legs</li>
  <li>Bring weight towards head and repat on other side</li>
  <li>Builds Grip Strength,Co-ordination,Lower back muscles and Shoulders</li>
</ul> 
      

  </div>
</div>
</div>

<br>
<br>

<footer class="footer-distributed">
	<div class="footer-left" class="center-block">
	<p class="footer-links">
		<a href="index">Home</a>
		.
		<a href="about">About Us</a>
		.
		<a href="contact">Contact</a>
	</p>
	<p class="footer-company-name">DSM Fitness 2017</p>
	</div>
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
                  DATE: Wed Nov 29 10:08:22 GMT 2017
                  SOURCE: /home/wdd/webapps/ca2/app/views/equipmentfreeweights.scala.html
                  HASH: 45dff3c50007a5633d5ddb6a2fcb84fd5dfb0edc
                  MATRIX: 1045->0|1592->520|1607->526|1668->566|3453->2324|3468->2330|3536->2377|3911->2725|3926->2731|3990->2774|4354->3111|4369->3117|4432->3159|4833->3532|4849->3538|4913->3580|5219->3858|5235->3864|5299->3906|5684->4263|5700->4269|5763->4310|6154->4673|6170->4679|6236->4723
                  LINES: 33->1|46->14|46->14|46->14|102->70|102->70|102->70|114->82|114->82|114->82|123->91|123->91|123->91|136->104|136->104|136->104|147->115|147->115|147->115|158->126|158->126|158->126|171->139|171->139|171->139
                  -- GENERATED --
              */
          