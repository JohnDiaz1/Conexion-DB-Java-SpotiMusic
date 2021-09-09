/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.ClienteModel;

/**
 *
 * @author nabet
 */
public class ArchiCliente {

    public void guardar(ClienteModel cliente) throws FileNotFoundException, IOException {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("cliente.obj"))) {
            salida.writeObject(cliente);
        }
    }

    public ClienteModel recuperar() throws IOException, ClassNotFoundException {
        ClienteModel cliente;
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("cliente.obj"))) {
            cliente = (ClienteModel) entrada.readObject();
        }
        return cliente;
    }

}
