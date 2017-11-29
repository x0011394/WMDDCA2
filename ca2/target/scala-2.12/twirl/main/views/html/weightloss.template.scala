
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

object weightloss extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
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
  <p>Lose weight and enjoy it!</p>
  <p>Check out our new products below!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>PHD Diet Whey 2.0kg</h3>
      <img src=""""),_display_(/*70.18*/routes/*70.24*/.Assets.at("/public/images", "phddietwhey.jpeg")),format.raw/*70.72*/("""" class="img-responsive" /> 
      
  <li>This is THE product for those seeking lean muscle and great fat-free condition.</li>
  <li>Diet Whey contains a precision, slow-release protein blend to maximise satiety</li>
  <li>Diet Whey is a high-protein meal with a huge difference</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>ROS Nutrition Acetyl L- Carnitine</h3>
      <img src=""""),_display_(/*80.18*/routes/*80.24*/.Assets.at("/public/images", "ros.png")),format.raw/*80.63*/("""" class="img-responsive"/> 
      <ul>
  <li>N Acetyl L- Carnitine is produced from the amino acids lysine and methionine in the body.</li>
  <li>Carnitine has many essential roles in the body, particularly in the metabolism of fatty acids.</li>
  <br></br>
  
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
      <h3>MyProtein Sugar free syrup</h3>
      <img src=""""),_display_(/*103.18*/routes/*103.24*/.Assets.at("/public/images", "syrup.jpg")),format.raw/*103.65*/("""" class="img-responsive"/> 
      <ul>
      
  <li>Naturally flavoured syrups with zero sugar and fat.</li>
  <li>adds another dimension to your food!</li>
  <li>Great alternative to ordinary sugar dense syrup.</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>OCellucor C4 Ripped</h3>
      <style>
img """),format.raw/*115.5*/("""{"""),format.raw/*115.6*/("""
    """),format.raw/*116.5*/("""max-width: 50%;
    height: 80%;
"""),format.raw/*118.1*/("""}"""),format.raw/*118.2*/("""
"""),format.raw/*119.1*/("""</style>
      <img src=""""),_display_(/*120.18*/routes/*120.24*/.Assets.at("/public/images", "CELLUCOR%20C4%20RIPPED.png")),format.raw/*120.82*/("""" class="img-responsive"/> 
      <ul>
  <li>C4 Ripped is a pre-workout supplement that combines the explosive energy of C4 with ingredients specific to fat loss</li>
  <li> This formula helps you train harder while supporting your body’s ability to burn fat.* </li>
  
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>Kinetica Oat Gain</h3>  
      <img src=""""),_display_(/*129.18*/routes/*129.24*/.Assets.at("/public/images", "kinetica oat.png")),format.raw/*129.72*/("""" class="img-responsive"/>    
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
      <img src=""""),_display_(/*142.18*/routes/*142.24*/.Assets.at("/public/images", "impactwhey.jpg")),format.raw/*142.70*/("""" class="img-responsive"/> 
      <ul>
      
  <li>Promotes muscle repair.</li>
  <li>Manufactured to rebuild damaged muscle fibres to support recovery and enhance performance.</li>
  <li>Fast absorbing, perfect for pre and post workout meals.</li>
</ul> 
      
    </div>
    <div class="col-sm-4">
      <h3>ON Lean Whey Protein</h3>
      <img src=""""),_display_(/*153.18*/routes/*153.24*/.Assets.at("/public/images", "lean whey.png")),format.raw/*153.69*/("""" class="img-responsive"/> 
      <ul>
  <li>Optimum Nutrition's NEW Lean Whey is a delicious high protein shake.</li>
  <li>Low carb shake specially formulated to support your high protein diet.</li>
  <li>ean Whey delivers 20 g of high quality whey proteins which can be easily digested and absorbed into the body.</li>
</ul> 
    </div>
    <div class="col-sm-4">
      <h3>USN Pure protein GF-1</h3>  
      <img src=""""),_display_(/*162.18*/routes/*162.24*/.Assets.at("/public/images", "pure%20protein.jpg")),format.raw/*162.74*/("""" class="img-responsive"/>     
      <ul>
  <li>Protein contributes to the growth & maintenance of muscle mass.</li>
  <li>Pantothenic acid supports normal synthesis and metabolism of steroid hormones, Vitamin D and some neurotransmitters. </li>
  <li>Niacin contributes to normal energy-yielding metabolism. </li>
</ul> 
    </div>
  </div>
</div>

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
                  DATE: Wed Nov 29 10:28:02 GMT 2017
                  SOURCE: /home/wdd/webapps/ca2/app/views/weightloss.scala.html
                  HASH: 0ef41f89f1d3e700504597c4ced4169c33089d23
                  MATRIX: 1035->0|1586->524|1601->530|1662->570|3420->2301|3435->2307|3504->2355|3933->2757|3948->2763|4008->2802|4393->3160|4408->3166|4482->3219|4873->3582|4889->3588|4952->3629|5302->3951|5331->3952|5364->3957|5425->3990|5454->3991|5483->3992|5537->4018|5553->4024|5633->4082|6028->4449|6044->4455|6114->4503|6508->4869|6524->4875|6592->4921|6975->5276|6991->5282|7058->5327|7509->5750|7525->5756|7597->5806
                  LINES: 33->1|46->14|46->14|46->14|102->70|102->70|102->70|112->80|112->80|112->80|122->90|122->90|122->90|135->103|135->103|135->103|147->115|147->115|148->116|150->118|150->118|151->119|152->120|152->120|152->120|161->129|161->129|161->129|174->142|174->142|174->142|185->153|185->153|185->153|194->162|194->162|194->162
                  -- GENERATED --
              */
          