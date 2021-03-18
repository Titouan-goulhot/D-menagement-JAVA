public class Demenagement{
    public static void main(String[] args) {
        int total = 34;
        int cartonTotal = 0;
        int carton = 9;
        while (cartonTotal < 34){
            cartonTotal = cartonTotal + carton;

            System.out.println("Et un un voyage de 9 cartons, ce qui fait " + cartonTotal+ " carton déménagé");

            if (cartonTotal+carton > 34){
                System.out.println("les gars... c'est normal qu'on en ait trop ?");
                carton = total - cartonTotal;
                System.out.println(cartonTotal);

            }
        }
    }


}