public class Mago extends Personaje {
    private int mana;
    private int manaDisponible;

    public void lanzarHechizo(int costeMana) {

        for (int i = 0; i < costeMana; i++) {
            if(costeMana > mana) {
                System.out.println("El hechizo se ha lanzado correctamente.");
            }
        }
    }
}