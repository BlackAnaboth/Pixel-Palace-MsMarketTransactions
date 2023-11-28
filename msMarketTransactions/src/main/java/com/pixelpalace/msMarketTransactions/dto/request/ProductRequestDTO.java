package com.pixelpalace.msMarketTransactions.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.pixelpalace.msMarketTransactions.model.Category;
import com.pixelpalace.msMarketTransactions.model.Platform;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ProductRequestDTO {

    @NotNull(message = "Ingrese un id valido.")
    private Long id;

    @NotNull(message = "Ingrese un nombre valido.")
    private String name;

    @NotNull(message = "Ingrese una descripcion valida.")
    private String description;

    @NotNull(message = "Ingrese una categoria valida.")
    private List<Long> categoriesId;

    @NotNull(message = "Ingrese una plataforma valida.")
    private List<Long> platformsId;

    @NotNull(message = "Ingrese una imagen valida.")
    private List<String> imageUrl;

    @Positive(message = "Ingrese un precio valido.")
    @NotNull(message = "Ingrese un precio valido.")
    @Digits(fraction = 2, message = "El precio solo puede tener 2 decimales", integer = 100)
    private Double price;

    @Positive(message = "Ingrese un stock valido.")
    @NotNull(message = "Ingrese un stock valido.")
    private Double stock;

    @NotNull(message = "Ingrese una fecha valida.")
    private Date releaseDate;
}
