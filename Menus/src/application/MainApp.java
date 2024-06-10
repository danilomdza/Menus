//Mendoza Danilo
package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage mainStage) {
        // ELEMENTOS DE MENÚ
        Menu archivoMenu = new Menu("Archivo");
        MenuItem nuevoMenuItem = new MenuItem("Nuevo");
        MenuItem abrirMenuItem = new MenuItem("Abrir");
        MenuItem guardarMenuItem = new MenuItem("Guardar");
        MenuItem salirMenuItem = new MenuItem("Salir");

        // ACCIONES EN CONSOLA
        nuevoMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Nuevo");
            }
        });

        abrirMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Abrir");
            }
        });

        guardarMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Guardar");
            }
        });

        salirMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Salir");
                mainStage.close();
            }
        });

        // MENÚ ARCHIVO CON ELEMENTOS
        archivoMenu.getItems().addAll(nuevoMenuItem, abrirMenuItem, guardarMenuItem, new SeparatorMenuItem(), salirMenuItem);

        // ELEMENTOS DEL MENÚ EDICIÓN
        Menu edicionMenu = new Menu("Edición");
        MenuItem copiarMenuItem = new MenuItem("Copiar");
        MenuItem pegarMenuItem = new MenuItem("Pegar");
        MenuItem eliminarMenuItem = new MenuItem("Eliminar");

        copiarMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Copiar");
            }
        });

        pegarMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Pegar");
            }
        });

        eliminarMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Eliminar");
            }
        });

        edicionMenu.getItems().addAll(copiarMenuItem, pegarMenuItem, eliminarMenuItem);

        // MENÚ AYUDA
        Menu ayudaMenu = new Menu("Ayuda");
        MenuItem acercaDeMenuItem = new MenuItem("Acerca de");

        acercaDeMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Seleccionaste Acerca de");
            }
        });

        ayudaMenu.getItems().add(acercaDeMenuItem);

        MenuBar barraMenu = new MenuBar();
        barraMenu.getMenus().addAll(archivoMenu, edicionMenu, ayudaMenu);

        BorderPane raiz = new BorderPane();
        raiz.setTop(barraMenu);

        // ESCENA
        Scene escena = new Scene(raiz, 600, 400);
        mainStage.setScene(escena);
        mainStage.setTitle("Sistema de Menús");
        mainStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
