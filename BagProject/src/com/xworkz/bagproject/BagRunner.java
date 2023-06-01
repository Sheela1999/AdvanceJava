package com.xworkz.bagproject;

import java.util.LinkedList;

import com.xworkz.bagproject.dao.BagDao;
import com.xworkz.bagproject.dao.BagDaoImpl;
import com.xworkz.bagproject.dto.BagDto;

public class BagRunner {

	public static void main(String[] args) {
		
		BagDto dto = new BagDto("Skybags", 1000, "Laptop Backpack", "Black");
		
		BagDto dto1 = new BagDto("Leather Bag", 1500, "Satchel", "peach");
		
		BagDto dto2 = new BagDto("Gucci", 2000, "Travel Bag", "Red");
		
		BagDto dto3 = new BagDto("Fendi", 1400, "Hand bag", "Gray");
		
		BagDao dao = new BagDaoImpl();
		
		System.out.println("-----------------------SAVE--------------------------------");
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		
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
		
		for(BagDto dtos : result) {
			System.out.println(dtos);
		}

	}

}
