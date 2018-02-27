package org.ieselrincon.example.pruebas;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.SQLTemplates;

public class Configuracion {
    static Configuration crearConfiguracion(){
        SQLTemplates templates = new MySQLTemplates();
        Configuration configuration = new Configuration(templates);

        return configuration;
    }
}
