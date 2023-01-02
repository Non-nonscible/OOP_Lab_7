package com.example.springboot;

import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FlowerController {

	@GetMapping("/")
	public StringBuilder index() {
		CactusFlower cactus = new CactusFlower();
		RomashkaFlower romashka = new RomashkaFlower();

		ArrayList<Item> res = new ArrayList<Item>();
		res.add(cactus);
		res.add(romashka);

		StringBuilder temp = new StringBuilder();

		for (Item item: res) {
			temp.append(item.getDescription());
			temp.append("\n");
		}

		return temp;
	}

}
