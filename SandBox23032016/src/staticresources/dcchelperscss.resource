@charset "UTF-8";
/* CSS Document */



.no-margin {margin: 0 !important ;}
.no-margin-top {margin-top: 0 !important;}
.no-padding {padding: 0 !important;}
.no-padding-left {padding-left: 0 !important;}
.no-padding-right {padding-right: 0 !important;}

.mt10 {margin-top: 10px !important;}
.mt15 {margin-top: 15px	!important;}
.mt20 {margin-top: 20px !important;}
.mt30 {margin-top: 30px !important;}
.mt40 {margin-top: 40px !important;}
.mt50 {margin-top: 50px !important;}
.mt55 {margin-top: 55px	!important;}
.mt60 {margin-top: 60px !important;}
.mt70 {margin-top: 70px !important;}
.mt80 {margin-top: 80px !important;}

.mb10 {margin-bottom: 10px !important;}
.mb20 {margin-bottom: 20px !important;}
.mb30 {margin-bottom: 30px !important;}
.mb40 {margin-bottom: 40px !important;}
.mb50 {margin-bottom: 50px !important;}
.mb60 {margin-bottom: 60px !important;}
.mb70 {margin-bottom: 70px !important;}
.mb80 {margin-bottom: 80px !important;}

.p5  {padding: 5px;}
.p10 {padding: 10px;}
.p15 {padding: 15px;}
.p20 {padding: 20px;}


/*
		BOTONES
*/

.btn {
	font-size: 13px;
	padding: 5px 20px;
	border-width: 1px;
	box-shadow: 1px 1px 4px rgba(0,0,0,.3);
	font-weight:200;
	border-radius: 4px;
}	

.btn:focus {
	box-shadow: inset 1px 1px 4px rgba(0,0,0,.3);
	outline: none;
}

.btn-primary {
	color: #fff;
	background: rgb(240,0,136); /* Old browsers */
	/* IE9 SVG, needs conditional override of 'filter' to 'none' */
	background: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iI2YwMDA4OCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiNmMjAwNzEiIHN0b3Atb3BhY2l0eT0iMSIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);
	background: -moz-linear-gradient(top,  rgba(240,0,136,1) 0%, rgba(242,0,113,1) 100%); /* FF3.6+ */
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(240,0,136,1)), color-stop(100%,rgba(242,0,113,1))); /* Chrome,Safari4+ */
	background: -webkit-linear-gradient(top,  rgba(240,0,136,1) 0%,rgba(242,0,113,1) 100%); /* Chrome10+,Safari5.1+ */
	background: -o-linear-gradient(top,  rgba(240,0,136,1) 0%,rgba(242,0,113,1) 100%); /* Opera 11.10+ */
	background: -ms-linear-gradient(top,  rgba(240,0,136,1) 0%,rgba(242,0,113,1) 100%); /* IE10+ */
	background: linear-gradient(to bottom,  rgba(240,0,136,1) 0%,rgba(242,0,113,1) 100%); /* W3C */
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f00088', endColorstr='#f20071',GradientType=0 ); /* IE6-8 */
	border: 1px solid #EA49A4;
	font-size: 15px !important;
  	font-family: "Helvetica Neue", sans-serif !important;
  	font-weight: 200;
  	transition: .3s;
}
.btn-primary:hover, .btn-primary:focus {
	background-color: #f00088;
	background-image: none;
	border: 1px solid #f00088;
}

.btn-block {
	display: block;
	width: 100%;
}
