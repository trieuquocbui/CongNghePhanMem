<!-- 
Clients 
-->
<section class="our_client">
	<hr class="soften" />
	<h4 class="title cntr">
		<span class="text">Manufactures</span>
	</h4>
	<hr class="soften" />
	<div class="row">
		<div class="span2">
			<a href="#"><img alt="" src="/templates/user/assets/img/1.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="/templates/user/assets/img/2.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="/templates/user/assets/img/3.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="/templates/user/assets/img/4.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="/templates/user/assets/img/5.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="/templates/user/assets/img/6.png"></a>
		</div>
	</div>
</section>

<!--
Footer
-->
<footer class="footer">
	<div class="row-fluid">
		<div class="span2">
			<h5>Your Account</h5>
			<a href="#">YOUR ACCOUNT</a><br> <a href="#">PERSONAL
				INFORMATION</a><br> <a href="#">ADDRESSES</a><br> <a href="#">DISCOUNT</a><br>
			<a href="#">ORDER HISTORY</a><br>
		</div>
		<div class="span2">
			<h5>Iinformation</h5>
			<a href="contact.htm">CONTACT</a><br> <a href="#">SITEMAP</a><br>
			<a href="#">LEGAL NOTICE</a><br> <a href="#">TERMS AND
				CONDITIONS</a><br> <a href="#">ABOUT US</a><br>
		</div>
		<div class="span2">
			<h5>Our Offer</h5>
			<a href="#">NEW PRODUCTS</a> <br> <a href="#">TOP SELLERS</a><br>
			<a href="#">SPECIALS</a><br> <a href="#">MANUFACTURERS</a><br>
			<a href="#">SUPPLIERS</a> <br />
		</div>
		<div class="span6">
			<h5>The standard chunk of Lorem</h5>
			The standard chunk of Lorem Ipsum used since the 1500s is reproduced
			below for those interested. Sections 1.10.32 and 1.10.33 from "de
			Finibus Bonorum et Malorum" by Cicero are also reproduced in their
			exact original form, accompanied by English versions from the 1914
			translation by H. Rackham.
		</div>
	</div>
</footer>
</div>
<!-- /container -->

<div class="copyright">
	<div class="container">
		<p class="pull-right">
			<a href="#"><img src="/templates/user/assets/img/maestro.png"
				alt="payment"></a> <a href="#"><img
				src="/templates/user/assets/img/mc.png" alt="payment"></a> <a
				href="#"><img src="/templates/user/assets/img/pp.png"
				alt="/payment"></a> <a href="#"><img
				src="/templates/user/assets/img/visa.png" alt="payment"></a> <a
				href="#"><img src="/templates/user/assets/img/disc.png"
				alt="payment"></a>
		</p>
		<span>Copyright &copy; 2013<br> bootstrap ecommerce
			shopping template
		</span>
	</div>
</div>
<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript">
	const searchInput = document.getElementById('search-input');

	searchInput.addEventListener('keypress', function(event) {
		if (event.keyCode === 13) {
			event.preventDefault(); // Ngăn chặn trình duyệt submit form mặc định
			const searchQuery = searchInput.value;
			const form = searchInput.closest('form');
			form.action = '/search?'q=${searchQuery}; // Đưa giá trị vào action của form
			form.submit(); // Submit form
		}
	});
</script>

</body>
</html>