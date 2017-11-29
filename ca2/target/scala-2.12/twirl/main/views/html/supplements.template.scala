
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

object supplements extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
	  
				<li class="dropdown"><a class=dropdown-toggle" data-toggle="dropdown" 
				href="equipment">Equipment<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="equipmentfreeweights">Free-Weights</a></li>
					<li><a href="equipmentmachine">Machines & Benches</a></li>
				</ul>
				</li>
				
				<li class="active" class="dropdown"><a class=dropdown-toggle" data-toggle="dropdown" 
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
  <h1>Supplements</h1>
  <p>Build Muscle and enjoy it!</p>
  <p>Check out our new products below!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>ON Creatine Monohydrate</h3>
      <img src=""""),_display_(/*70.18*/routes/*70.24*/.Assets.at("/public/images", "optimum-nutrition-micronised-creatine-powder.jpg")),format.raw/*70.104*/("""" class="img-responsive" /> 
      <ul>
      
  <li>Creatine enhances performace between sets</li>
  <li>Inreases the production of ATP in the muscle</li>
  <li>Creates a better pump for the user</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>ON %100 whey</h3>
      <img src=""""),_display_(/*81.18*/routes/*81.24*/.Assets.at("/public/images", "on whey 100.jpg")),format.raw/*81.71*/("""" class="img-responsive" />
      <ul>
  <li>The world's best-selling protein powder.</li>
  <li>Supports muscle growth and maintenance.</li>
  <li>24g of premium whey protein, (5.5 g of BCAAs), but just 1.1 g of fat & 1g of sugar.</li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>Kinetica Pre Fuel</h3>  
      <img src=""""),_display_(/*90.18*/routes/*90.24*/.Assets.at("/public/images", "kinetica pre fuel.jpg")),format.raw/*90.77*/("""" class="img-responsive"/> 
      <ul>
  <li>Contains BCAA's which promote muscle repair</li>
  <li>Also contains Caffeine which acts as a stimulant</li>
  <li>Creates a better pump for the user</li>
</ul> 
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Optimum Nutrition Gold Standard Gainer 1.62kg</h3>
      <img src=""""),_display_(/*103.18*/routes/*103.24*/.Assets.at("/public/images", "weightgainer.jpg")),format.raw/*103.72*/("""" class="img-responsive"/>
      <ul>
      
  <li>55 Grams of Protein - Primarily From Isolate Sources</li>
  <li>760 Calories from Quality Ingredients</li>
  <li>2:1 Ratio of Carbohydrates to Proteins</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>Optimum Nutrition Gold Standard PRE-WORKOUT</h3>
      <img src=""""),_display_(/*114.18*/routes/*114.24*/.Assets.at("/public/images", "on preworkout.png")),format.raw/*114.73*/("""" class="img-responsive" />
  <li>Naturally sourced caffeine to improve concentration</li>
  <li> Creatine to increase high-intensity performance</li>
  <li>2B Vitamins to boost energy-yielding metabolism</li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>Kinetica Oat Gain</h3>  
      <img src=""""),_display_(/*122.18*/routes/*122.24*/.Assets.at("/public/images", "kinetica oat.png")),format.raw/*122.72*/("""" class="img-responsive" />     
      <ul>
  <li>Delivers over 600 calories from complex sources.</li>
  <li>Excellent source of low GI carbohydrate from ground oats.</li>
  <li>No added sugar.</li>
</ul> 
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>My Protein Impact Whey Protein</h3> 
      <img src=""""),_display_(/*135.18*/routes/*135.24*/.Assets.at("/public/images", "impactwhey.jpg")),format.raw/*135.70*/(""""  class="img-responsive"/>
      <ul>
      
  <li>Promotes muscle repair.</li>
  <li>Manufactured to rebuild damaged muscle fibres to support recovery and enhance performance.</li>
  <li>Fast absorbing, perfect for pre and post workout meals.</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>ON Lean Whey Protein</h3>
      <img src=""""),_display_(/*146.18*/routes/*146.24*/.Assets.at("/public/images", "lean whey.png")),format.raw/*146.69*/("""" class="img-responsive"/>
      <ul>
  <li>Optimum Nutrition's NEW Lean Whey is a delicious high protein shake.</li>
  <li>Low carb shake specially formulated to support your high protein diet.</li>
  <li>ean Whey delivers 20 g of high quality whey proteins which can be easily digested and absorbed into the body.</li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>USN Pure protein GF-1</h3>  
      <img src=""""),_display_(/*155.18*/routes/*155.24*/.Assets.at("/public/images", "pure%20protein.jpg")),format.raw/*155.74*/("""" class="img-responsive" />     
      <ul>
  <li>Protein contributes to the growth & maintenance of muscle mass.</li>
  <li>Pantothenic acid supports normal synthesis and metabolism of steroid hormones, Vitamin D and some neurotransmitters. </li>
  <li>Niacin contributes to normal energy-yielding metabolism. </li>
</ul> 
    </div>
  </div>
</div>


<br>
<br>

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
                  DATE: Wed Nov 29 10:21:48 GMT 2017
                  SOURCE: /home/wdd/webapps/ca2/app/views/supplements.scala.html
                  HASH: 5d33068a1d85876295bbc2a0860d589b5c3cac37
                  MATRIX: 1036->0|1583->520|1598->526|1659->566|3422->2302|3437->2308|3539->2388|3865->2687|3880->2693|3948->2740|4309->3074|4324->3080|4398->3133|4809->3516|4825->3522|4895->3570|5259->3906|5275->3912|5346->3961|5681->4268|5697->4274|5767->4322|6164->4691|6180->4697|6248->4743|6631->5098|6647->5104|6714->5149|7164->5571|7180->5577|7252->5627
                  LINES: 33->1|46->14|46->14|46->14|102->70|102->70|102->70|113->81|113->81|113->81|122->90|122->90|122->90|135->103|135->103|135->103|146->114|146->114|146->114|154->122|154->122|154->122|167->135|167->135|167->135|178->146|178->146|178->146|187->155|187->155|187->155
                  -- GENERATED --
              */
          