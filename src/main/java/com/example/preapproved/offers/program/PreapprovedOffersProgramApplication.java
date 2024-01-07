package com.example.preapproved.offers.program;

import com.example.preapproved.offers.program.model.ApprovedOffers;
import com.example.preapproved.offers.program.model.Offers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class PreapprovedOffersProgramApplication {

	public static void main(String[] args) {

		SpringApplication.run(PreapprovedOffersProgramApplication.class, args);
		getOffers();
	}
	public static void getOffers() {
		List<Offers> offers = new ArrayList<>();
		Offers offer1 = new Offers();
		offer1.setId(1L);
		offer1.setPrice(BigDecimal.valueOf(100));
		offer1.setProductAvailble(true);
		offer1.setProductName("credit");

		offers.add(offer1);

		Offers offers2 = new Offers();
		offers2.setId(2L);
		offers2.setPrice(BigDecimal.valueOf(55));
		offers2.setProductAvailble(false);
		offers2.setProductName("debit");
		offers.add(offers2);

		Offers offers3 = new Offers();
		offers3.setId(3L);
		offers3.setPrice(BigDecimal.valueOf(200));
		offers3.setProductAvailble(false);
		offers3.setProductName("amazon card");
		offers.add(offers3);

		Offers offers4 = new Offers();
		offers4.setId(4L);
		offers4.setPrice(BigDecimal.valueOf(89));
		offers4.setProductAvailble(true);
		offers4.setProductName("personal card");
		offers.add(offers4);

//	public void ApprovedOffers(){
		List<ApprovedOffers> approvedOffers= new ArrayList<>();
		System.out.println("before"+offers);

System.out.println("after"+ offers.stream().filter(t-> t.getProductAvailble()).collect(Collectors.toList()));

//		for ( Offers offer : offers) {
//		if(offer.getProductAvailble()){
////			ApprovedOffers approvedOffers1= new ApprovedOffers();
////			approvedOffers1.setId(offer.getId());
////			approvedOffers1.setPrice(offer.getPrice());
////			approvedOffers1.setProductAvalible(offer.getProductAvailble());
////			approvedOffers1.setProductName(offer.getProductName());
//	System.out.println("ForLoop1"+offer.toString());
//
//
//		}

//		}
//		for (ApprovedOffers aprovedOffer:approvedOffers) {
//			System.out.println("ForLoop2"+aprovedOffer.toString());
//
//		}

		}

		}








