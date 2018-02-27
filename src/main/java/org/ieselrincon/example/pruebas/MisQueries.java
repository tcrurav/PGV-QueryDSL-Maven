package org.ieselrincon.example.pruebas;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLQueryFactory;

import javax.sql.DataSource;
import java.util.List;

public class MisQueries {
    SQLQueryFactory queryFactory;

    public MisQueries(Configuration configuration, DataSource dataSource) {
        this.queryFactory = new SQLQueryFactory(configuration, dataSource);
    }

    public List<String> getAbreviaturaCiclos(){
        QCiclo ciclo = new QCiclo("ciclo");

        List<String> abreviaturas = queryFactory.select(ciclo.abreviatura).from(ciclo)
//		    .where(ciclo.abreviatura.eq("ASIR"))
                .fetch();

        //prueba
//		List<String> abreviaturas = new ArrayList<String>();

        return abreviaturas;
    }
}
