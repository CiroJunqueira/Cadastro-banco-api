package com.cadastrobancoapi.model;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Email(message = "E-mail inválido")
	@Column(name = "email")
	private String email;

	@NotNull
	@CPF
	@Column(name = "cpf")
	private String cpf;
	
	@NotNull
	@Column(name = "data_nascimento")
	@JsonFormat(pattern =  "dd/MM/yyyy")
	private LocalDate dataNascimento;
}
