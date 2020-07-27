package com.mantabs.app.api.dummy;

import com.ags.bo.example.entity.Product;
import com.ags.bo.example.service.ProductService;
import com.mantabs.app.api.config.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1")
public class ProductController {

//
//	@Autowired
//	AngsuranService angsuranService;
//
//	@Autowired
//	WilayahService wilayahService;
//
//	@Autowired
//	AplikasiService aplikasiService;
//
//	@PostMapping("/am")
//	ResponseEntity<ResponseDTO> jenisPencairan(){
//		TestingPojo tes = new TestingPojo();
//		tes.setAngsurans(angsuranService.findAll());
//		ResponseDTO responseDTO = ResponseDTO.builder()
//				.status(HttpStatus.OK.toString()).body(tes).build();
//
//		return ResponseEntity.ok(responseDTO);
//	}
//
//	@PostMapping("/master")
//	ResponseEntity<ResponseDTO> getWilayah(){
//		TestingPojo tes = new TestingPojo();
//		tes.setWilayah(wilayahService.findAll());
//		ResponseDTO responseDTO = ResponseDTO.builder()
//				.status(HttpStatus.OK.toString()).body(tes).build();
//
//		return ResponseEntity.ok(responseDTO);
//	}
//

	@Autowired
	private ProductService productService;
	@PostMapping("/los")
	ResponseEntity<ResponseDTO> los(){
		List<Product> products = productService.findAll();
		ResponseDTO responseDTO = ResponseDTO.builder()
				.status(HttpStatus.OK.toString()).body(products).build();

		return ResponseEntity.ok(responseDTO);
	}
}
