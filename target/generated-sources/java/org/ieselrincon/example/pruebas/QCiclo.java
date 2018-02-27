package org.ieselrincon.example.pruebas;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCiclo is a Querydsl query type for QCiclo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCiclo extends com.querydsl.sql.RelationalPathBase<QCiclo> {

    private static final long serialVersionUID = 1164473710;

    public static final QCiclo ciclo = new QCiclo("ciclo");

    public final StringPath abreviatura = createString("abreviatura");

    public final StringPath nombre = createString("nombre");

    public final NumberPath<Integer> pkId = createNumber("pkId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QCiclo> primary = createPrimaryKey(pkId);

    public QCiclo(String variable) {
        super(QCiclo.class, forVariable(variable), "null", "ciclo");
        addMetadata();
    }

    public QCiclo(String variable, String schema, String table) {
        super(QCiclo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCiclo(Path<? extends QCiclo> path) {
        super(path.getType(), path.getMetadata(), "null", "ciclo");
        addMetadata();
    }

    public QCiclo(PathMetadata metadata) {
        super(QCiclo.class, metadata, "null", "ciclo");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(abreviatura, ColumnMetadata.named("Abreviatura").withIndex(3).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(nombre, ColumnMetadata.named("Nombre").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(pkId, ColumnMetadata.named("PK_ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

