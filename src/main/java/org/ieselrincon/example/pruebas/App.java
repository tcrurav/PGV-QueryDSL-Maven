package org.ieselrincon.example.pruebas;

import javax.sql.DataSource;
import com.querydsl.sql.Configuration;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Configuration configuration = Configuracion.crearConfiguracion();
        DataSource dataSource = MyDataSourceFactory.getMySQLDataSource();

        /*CrearQueryTypes.crearQueryTypes(dataSource);*/

        MisQueries misQueries = new MisQueries(configuration, dataSource);
        System.out.println(misQueries.getAbreviaturaCiclos());
    }
}
