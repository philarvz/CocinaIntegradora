<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%String context = request.getContextPath();%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <!-- Incluye Bootstrap Icons -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.3/font/bootstrap-icons.min.css" rel="stylesheet">
    <style>
        .bg-image {
            background-image: url(https://img.freepik.com/free-photo/authentic-italian-pasta_24972-886.jpg?t=st=1728762475~exp=1728766075~hmac=78c1eb4bbee085002152a02ee738fef6544e0782ab6cb30aba7fa01b5e29e031&w=900); /* URL de la imagen */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }

        .bg-image-2 {
            background-image: url(https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_website/es/cms/SEO/recipes/albondigas-caseras-de-cerdo-con-salsa-barbacoa.jpeg); /* URL de la imagen */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }

        .bg-image-3 {
            background-image: url(https://st1.uvnimg.com/af/e1/34c8d9f843b4a2d51fcd42a691d1/comida-mexicana.jpg); /* URL de la imagen */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
    </style>
</head>
<body>
<div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">
        <!-- Primer ítem del carrusel -->
        <div class="carousel-item active" data-bs-interval="10000">
            <div class="row mt-0 mb-0">
                <div class="bg-image">
                    <div class="text-white text-center col-12">
                        <h3 class="mt-3">Pilares's kitchen</h3>
                    </div>
                    <div class="d-flex flex-column align-items-start vh-100 justify-content-center">
                        <h1 class="text-start text-white">Donde cada plato es una obra de arte</h1>
                        <br>
                        <div class="text-center col-5">
                            <form>
                                <a href="listas.html"><button type="button" class="btn btn-dark mt-3">ORDENAR <i class="bi bi-bell-fill"></i></button></a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Segundo ítem del carrusel -->
        <div class="carousel-item" data-bs-interval="10000">
            <div class="row mt-0 mb-0">
                <div class="bg-image-2">
                    <div class="text-center text-black center col-12">
                        <h3 class="mt-3">Pilares's kitchen</h3>
                    </div>
                    <div class="d-flex flex-column align-items-start vh-100 justify-content-center">
                        <h1 class="text-start text-black">Donde cada plato es una obra de arte</h1>
                        <br>
                        <div class="text-center col-5">
                            <form>
                                <a href="listas.html"><button type="button" class="btn btn-dark mt-3">ORDENAR <i class="bi bi-bell-fill"></i></button></a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Tercer ítem del carrusel -->
        <div class="carousel-item" data-bs-interval="10000">
            <div class="row mt-0 mb-0">
                <div class="bg-image-3">
                    <div class="text-white text-center col-12">
                        <h3 class="mt-3">Pilares's kitchen</h3>
                    </div>
                    <div class="d-flex flex-column align-items-start vh-100 justify-content-center">
                        <h1 class="text-start text-white">Donde cada plato es una obra de arte</h1>
                        <br>
                        <div class="text-center col-5">
                            <form>
                                <a href="listas.html"><button type="button" class="btn btn-dark mt-3">ORDENAR <i class="bi bi-bell-fill"></i></button></a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Controles del carrusel -->
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
