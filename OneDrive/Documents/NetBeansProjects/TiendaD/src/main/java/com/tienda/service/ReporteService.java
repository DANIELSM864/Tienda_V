
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;


public interface ReporteService {
    //se define la firma del metodo que genera los reportes, con los sigueintes parametros
    //1. reporte. Nombre del archivo de reportes (.jasper)
    //2. parametros: un map que contiene los parametros del reporte si los ocupa
    //3. tipo: es el tipo de reporte: vPdf, Pdf, Xls, Csv
    public ResponseEntity<Resource> generaReporte(
    String reporte,
            Map<String, Object> parametros,
            String tipo
    ) throws IOException;  
}
