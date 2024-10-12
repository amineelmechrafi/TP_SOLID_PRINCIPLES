package exo1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Facture {
    private Command command;

    public Facture(Command command) {
        this.command = command;
    }

    public void saveFacture() {
        try {
            // create a FileWriter object with the file name
            String file = "Facture".concat(String.valueOf(this.command.getId()));
            FileWriter writer = new FileWriter(file);
            writer.write(this.command.getId());
            // write the string to the file
            for (Map.Entry mapentry : this.command.getProduits().entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() );
            }
            writer.write("Prix = " + this.command.getTotal());
            writer.write("PrixTTC = " + this.command.getTotalTTC());
            // close the writer
            writer.close();

            System.out.println("Successfully wrote text to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}