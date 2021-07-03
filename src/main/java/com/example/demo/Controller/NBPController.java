package com.example.demo.Controller;

import com.example.demo.Service.NPBService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nbp")
public class NBPController {

    private NPBService nbpService;

    public NBPController(NPBService nbpService){
        this.nbpService = nbpService;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not found"),
            @ApiResponse(code = 504, message = "Internal server error")}
    )
    @ApiOperation(value = "Pobierz średnią walut z danego zakresu", notes = "Podaj waluty i daty")
    @GetMapping("/{currency}/{startDate}/{endDate}")
    public ResponseEntity<Double> getAverage(
            @ApiParam(value = "Waluta jaką checesz uzyskać", example = "eur")
            @PathVariable String currency,

            @ApiParam(value = "Data start", example = "12-01-02")
            @PathVariable String startDate,
            @ApiParam(value = "Data koniec", example = "12-01-02")
            @PathVariable String endDate
            ){
        return ResponseEntity.ok(nbpService.getAverage(currency, startDate, endDate));
    }
}
