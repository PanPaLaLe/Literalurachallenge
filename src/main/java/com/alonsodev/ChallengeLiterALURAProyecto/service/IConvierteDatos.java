package com.alonsodev.ChallengeLiterALURAProyecto.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
