package br.com.alura.carteira.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.*;

import br.com.alura.carteira.modelo.TipoTransacao;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoFormDto {

	@NotNull
	@NotEmpty
	@Size(min = 5, max = 6)
	@Pattern(regexp = "[a-zA-Z]{4}[0-9][0-9]?")
	private String ticker;

	@NotNull
	@DecimalMin("0.01")
	private BigDecimal preco;

	@PastOrPresent
	private LocalDate data;

	@NotNull
	private int quantidade;

	@NotNull
	private TipoTransacao tipo;

	@JsonAlias("usuario_id")
	private Long usuarioId;

}
