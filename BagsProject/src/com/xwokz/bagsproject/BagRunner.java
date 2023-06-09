package com.xwokz.bagsproject;

import java.util.LinkedList;

import com.xwokz.bagsproject.dao.BagDao;
import com.xwokz.bagsproject.dao.BagDaoImpl;
import com.xwokz.bagsproject.dto.BagDto;

public class BagRunner {

	public static void main(String[] args) {

		BagDto dto = new BagDto("Skybags", 1000, "Laptop Backpack", "Black");

		BagDto dto1 = new BagDto("Leather Bag", 1500, "Satchel", "peach");

		BagDto dto2 = new BagDto("Gucci", 2000, "Travel Bag", "Red");

		BagDto dto3 = new BagDto("Fendi", 1400, "Hand bag", "Gray");
		
		BagDto dto4 = new BagDto("Nika", 800, "Backpack", "Green");

		BagDao dao = new BagDaoImpl();

		System.out.println("-----------------------SAVE--------------------------------");
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);

		System.out.println("---------------------------FOUND--------------------------");
		BagDto found = dao.find(1000);
		System.out.println(found);

		System.out.println("------------------------------UPDATED------------------------");
		boolean updated = dao.update("Leather Bag", "White");
		System.out.println(updated);

		System.out.println("-------------------------DELETED-------------------------------");
		boolean deleted = dao.delete("Hand bag");
		System.out.println(deleted);

		System.out.println("----------------------------Read--------------------------");
		LinkedList<BagDto> result = dao.readAll();

		for (BagDto dtos : result) {
			System.out.println(dtos);
		}

	}

}
