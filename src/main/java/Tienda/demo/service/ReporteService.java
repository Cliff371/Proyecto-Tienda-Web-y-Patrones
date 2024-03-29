package Tienda.demo.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {
    
    public ResponseEntity<Resource>
        generaReporte(
                String reporte, //El nombre dek archivo que tiene el reporte .jasper
                Map<String, Object> parametros, //Parametros, si el reporte ocupa parametros
                String tipo //Tipo de reporte PDF, XLS, CSV...
        ) throws IOException;
}
