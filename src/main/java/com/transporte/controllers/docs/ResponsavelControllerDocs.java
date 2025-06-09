package com.transporte.controllers.docs;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.transporte.entities.Responsavel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


public interface ResponsavelControllerDocs {
	
	@Operation(
		    summary = "Buscar todos os Responsáveis",
		    description = "Retorna a lista completa de Responsáveis",
		    tags = {"Responsável"},
		    responses = {
		        @ApiResponse(
		            description = "Sucesso",
		            responseCode = "200",
		            content = @Content(
		                mediaType = MediaType.APPLICATION_JSON_VALUE,
		                array = @ArraySchema(schema = @Schema(implementation = Responsavel.class))
		            )
		        ),
		        @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
		        @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
		        @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
		        @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
		        @ApiResponse(description = "Erro interno", responseCode = "500", content = @Content)
		    }
		)
		List<Responsavel> findAll();


		@Operation(
		    summary = "Buscar Responsável por ID",
		    description = "Retorna os dados de um Responsável pelo seu ID",
		    tags = {"Responsável"},
		    responses = {
		        @ApiResponse(
		            description = "Sucesso",
		            responseCode = "200",
		            content = @Content(schema = @Schema(implementation = Responsavel.class))
		        ),
		        @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
		        @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
		        @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
		        @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
		        @ApiResponse(description = "Erro interno", responseCode = "500", content = @Content)
		    }
		)
		Responsavel findById(@PathVariable Long id);


		@Operation(
		    summary = "Criar novo Responsável",
		    description = "Cria um novo Responsável a partir de um JSON enviado no corpo da requisição",
		    tags = {"Responsável"},
		    responses = {
		        @ApiResponse(
		            description = "Criado com sucesso",
		            responseCode = "201",
		            content = @Content(schema = @Schema(implementation = Responsavel.class))
		        ),
		        @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
		        @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
		        @ApiResponse(description = "Erro interno", responseCode = "500", content = @Content)
		    }
		)
		Responsavel create(@RequestBody Responsavel responsavel);


		@Operation(
		    summary = "Atualizar Responsável",
		    description = "Atualiza os dados de um Responsável existente",
		    tags = {"Responsável"},
		    responses = {
		        @ApiResponse(
		            description = "Atualizado com sucesso",
		            responseCode = "200",
		            content = @Content(schema = @Schema(implementation = Responsavel.class))
		        ),
		        @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
		        @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
		        @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
		        @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
		        @ApiResponse(description = "Erro interno", responseCode = "500", content = @Content)
		    }
		)
		Responsavel update(@RequestBody Responsavel responsavel);


		@Operation(
		    summary = "Excluir Responsável",
		    description = "Exclui um Responsável pelo seu ID",
		    tags = {"Responsável"},
		    responses = {
		        @ApiResponse(description = "Excluído com sucesso", responseCode = "204", content = @Content),
		        @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
		        @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
		        @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
		        @ApiResponse(description = "Erro interno", responseCode = "500", content = @Content)
		    }
		)
		ResponseEntity<?> delete(@PathVariable Long id);

}
