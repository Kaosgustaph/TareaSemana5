package com.himarquez.petgram.db;

/**
 * Created by inavid on 06/07/16.
 */
public class ConstantesBaseDatos {

    public static final String DATABASE_NAME = "mascotas";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_MASCOTA           = "mascota";
    public static final String TABLE_MASCOTA_ID        = "id";
    public static final String TABLE_MASCOTA_NOMBRE    = "nombre";
    public static final String TABLE_MASCOTA_FOTO      = "foto";

    public static final String TABLE_MASCOTA_LIKES = "mascota_likes";
    public static final String TABLE_MASCOTA_LIKES_ID = "id";
    public static final String TABLE_MASCOTA_LIKES_ID_MASCOTA = "id_mascota";
    public static final String TABLE_MASCOTA_LIKES_LIKE = "like";

}
