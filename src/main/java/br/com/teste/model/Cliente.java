package br.com.teste.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "cliente")
@EqualsAndHashCode(callSuper=false)
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produto_id")
	private Integer id;

	@NotEmpty(message = "Nome obrigatório")
	@Size(min = 5, max = 80, message = "Tamanho mínimo do nome é {min} e máximo {max}")
	private String nome;
	
	@NotNull(message = "Data de nascimento é obrigatória")
	private Date dataNascimento;
	
	@NotEmpty(message = "Rua é obrigatória")
	@Size(max = 120, message = "Tamanho máximo da rua é {max}")
	private String rua;	

	private Integer numero;

	@NotEmpty(message = "Bairro é obrigatório")
	@Size(max = 50, message = "Tamanho máximo do bairro é {max}")
	private String bairro;
	
	@NotEmpty(message = "UF é obrigatória")
	@Size(min = 2, max = 2, message = "Tamanho da UF deve ser {max}")
	private String uf;
	
	@NotEmpty(message = "Cidade é obrigatória")
	@Size(max = 80, message = "Tamanho máximo da cidade é {max}")
	private String cidade;
	
	@NotNull(message = "Ativo é obrigatório")
	private Boolean ativo;
	
	@NotEmpty(message = "Tipo é obrigatório")
	private String tipo;
	
}
