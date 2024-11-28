package mx.edu.utez.Dao;

import mx.edu.utez.Entities.Platillo;
import mx.edu.utez.EstructurasDeDatos.LinkedList;

public class PlatilloDao {

    //Obtener lo datos del txt y guardarlos en la linkedList

    public LinkedList<Platillo> agregarPlatillos() {
        LinkedList<Platillo> platillos = new LinkedList<>();
        platillos.add(new Platillo("Enchiladas de salsa verde", 50, "Enchiladas bañadas en salsa verde, acompañadas de crema y queso fresco."));
        platillos.add(new Platillo("Tacos al pastor", 45, "Tortillas con carne al pastor, piña, cilantro y cebolla."));
        platillos.add(new Platillo("Pozole rojo", 70, "Sopa tradicional de maíz con carne de cerdo y condimentos."));
        platillos.add(new Platillo("Mole poblano", 90, "Platillo con pollo bañado en mole poblano, acompañado de arroz."));
        platillos.add(new Platillo("Tamales de pollo", 30, "Tamales de masa de maíz rellenos de pollo y salsa roja."));
        platillos.add(new Platillo("Sopes de chorizo", 40, "Sopes gruesos con frijoles, chorizo, lechuga, crema y queso."));
        platillos.add(new Platillo("Chilaquiles verdes", 50, "Totopos bañados en salsa verde, acompañados de crema y queso."));
        platillos.add(new Platillo("Tostadas de pata", 35, "Tostadas crujientes con pata de res, lechuga y crema."));
        platillos.add(new Platillo("Barbacoa de res", 85, "Platillo tradicional de carne de res cocida al vapor con especias."));
        platillos.add(new Platillo("Quesadillas de flor de calabaza", 30, "Tortillas rellenas de flor de calabaza y queso."));
        platillos.add(new Platillo("Caldo de res", 75, "Sopa caliente con carne de res, verduras y maíz."));
        platillos.add(new Platillo("Flautas de pollo", 45, "Tortillas fritas rellenas de pollo, acompañadas de crema y salsa."));
        platillos.add(new Platillo("Pambazo", 40, "Pan relleno de papa con chorizo, bañado en salsa roja y frito."));
        platillos.add(new Platillo("Chile relleno", 60, "Chile poblano relleno de queso o picadillo, bañado en caldillo de tomate."));
        platillos.add(new Platillo("Carnitas", 80, "Carne de cerdo jugosa y crujiente, acompañada de tortillas."));
        platillos.add(new Platillo("Arroz con leche", 25, "Postre dulce con arroz, leche, canela y azúcar."));
        platillos.add(new Platillo("Cochinita pibil", 90, "Carne de cerdo marinada en achiote y cocida lentamente."));
        platillos.add(new Platillo("Tamal de elote", 25, "Tamal dulce hecho de maíz tierno."));
        platillos.add(new Platillo("Ensalada de nopales", 30, "Nopales frescos con jitomate, cebolla y queso fresco."));
        platillos.add(new Platillo("Pescado a la talla", 120, "Pescado marinado y asado con especias."));
        platillos.add(new Platillo("Carne asada", 95, "Carne a la parrilla, acompañada de guacamole y tortillas."));
        platillos.add(new Platillo("Chiles en nogada", 130, "Chile poblano relleno de picadillo, bañado en nogada y granada."));
        platillos.add(new Platillo("Gorditas de chicharrón", 35, "Masa rellena de chicharrón prensado, servida con salsa."));
        platillos.add(new Platillo("Tinga de pollo", 50, "Pollo desmenuzado cocido con tomate y chipotle, acompañado de tostadas."));
        platillos.add(new Platillo("Guacamole", 40, "Dip de aguacate con jitomate, cebolla y limón."));
        platillos.add(new Platillo("Esquites", 25, "Maíz hervido con mayonesa, queso y chile en polvo."));
        platillos.add(new Platillo("Caldo tlalpeño", 65, "Sopa de pollo con garbanzos, verduras y chipotle."));
        platillos.add(new Platillo("Tamales de dulce", 25, "Tamales dulces con masa de fresa y pasas."));
        platillos.add(new Platillo("Tlacoyos de frijol", 30, "Masa ovalada rellena de frijoles, servida con nopales y queso."));
        platillos.add(new Platillo("Huaraches de bistec", 50, "Masa alargada con bistec, frijoles y salsa."));
        platillos.add(new Platillo("Calabacitas con elote", 40, "Guiso de calabacitas tiernas con elote y queso."));
        platillos.add(new Platillo("Pipian verde", 75, "Guiso de pollo en salsa de pepita de calabaza."));
        platillos.add(new Platillo("Birria de res", 90, "Carne de res en caldo con especias tradicionales."));
        platillos.add(new Platillo("Ensalada de frutas", 25, "Mezcla de frutas frescas con crema y miel."));
        platillos.add(new Platillo("Sopa de tortilla", 60, "Caldo con tiras de tortilla frita, aguacate y queso."));
        platillos.add(new Platillo("Quesadillas de huitlacoche", 35, "Tortillas rellenas de huitlacoche y queso."));
        platillos.add(new Platillo("Ceviche de pescado", 70, "Pescado marinado en jugo de limón con jitomate, cebolla y cilantro."));
        platillos.add(new Platillo("Molletes", 35, "Pan con frijoles refritos, queso derretido y pico de gallo."));
        platillos.add(new Platillo("Rajas con crema", 50, "Chile poblano en rajas, guisado con crema y elote."));
        return platillos;
    }


}
