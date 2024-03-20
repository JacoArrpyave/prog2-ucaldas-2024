import java.util.ArrayList;

public class Classic {
    ArrayList<Shoes> classic_Shoes = new ArrayList<>();

    public ArrayList<Shoes> addClassicShoes() {
        classic_Shoes.add(new Shoes("1234", 100f, 41, "ruta1", false, 15));
        classic_Shoes.add(new Shoes("1324", 200f, 42, "ruta2", true, 8));
        classic_Shoes.add(new Shoes("0434", 150f, 43, "ruta3", false, 9));
        classic_Shoes.add(new Shoes("2434", 250f, 44, "ruta4", true, 10));

        return classic_Shoes;
    }

    public String showInformationShoes(ArrayList<Shoes> shoes) {
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

    public ArrayList<Shoes> getShoesWithSeveralColors(int cantColors) {
        ArrayList<Shoes> filteredShoes = new ArrayList<Shoes>();
        for (Shoes shoes : classic_Shoes) {
            if (shoes.cant_colours >= cantColors){
                filteredShoes.add(shoes);
            }
        }
        return filteredShoes;

    }

}
