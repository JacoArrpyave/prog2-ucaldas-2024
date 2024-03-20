import java.util.ArrayList;

public class Running {
    ArrayList<Shoes> running_shoes = new ArrayList<>();

    public ArrayList<Shoes> addRunningShoes() {
        running_shoes.add(new Shoes("1234", 100f, 41, "ruta1", false, 15));
        running_shoes.add(new Shoes("1324", 200f, 38, "ruta2", true, 8));
        running_shoes.add(new Shoes("0434", 150f, 43, "ruta3", false, 9));
        running_shoes.add(new Shoes("2434", 250f, 44, "ruta4", true, 10));

        return running_shoes;
    }

    public String showInformationShoes(ArrayList<Shoes>shoes) {
        String Information = "";
        for (int i = 0; i < shoes.size(); i++) {
            Information += shoes.get(i).getReference() + "- Talla: " +
                    shoes.get(i).getsize() + " - Precio: " +
                    shoes.get(i).getPrice() + "- Fotos: " +
                    shoes.get(i).getphoto_route() + "- Envio a casa: " +
                    shoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    shoes.get(i).getcant_colours() + "\n________";

        }
        return Information;
    }

    public ArrayList<Shoes> shoes_size_38() {
        ArrayList<Shoes> running_shoes_38 = new ArrayList<>();
        for (Shoes shoes : running_shoes) {
            if (shoes.getsize() == 38) {
                running_shoes_38.add(shoes);
            }

        }
        return running_shoes_38;

    }
    public ArrayList<Shoes> shoes_send_house () {
        ArrayList<Shoes> sendHouese = new ArrayList<>();

        for (Shoes shoes : running_shoes) {
            if (!shoes.isSend_method()) {
                sendHouese.add(shoes);
            }
        }

        return sendHouese;
    }

}
