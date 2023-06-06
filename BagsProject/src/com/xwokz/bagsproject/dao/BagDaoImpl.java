package com.xwokz.bagsproject.dao;

import java.util.Iterator;
import java.util.LinkedList;

import com.xwokz.bagsproject.dto.BagDto;

public class BagDaoImpl implements BagDao {

	LinkedList<BagDto> list = new LinkedList<BagDto>();

	@Override
	public boolean save(BagDto dto) {
		if (dto != null) {
			list.add(dto);
			System.out.println("dto is Saved");
			return true;
		}
		System.out.println("Dto is not saved");
		return false;
	}

	@Override
	public BagDto find(int price) {
		if (price >= 500) {
			for (BagDto bag : list) {
				if (bag.getPrice() == price) {
					System.out.println("seaching value is found");
					return bag;
				}
			}
		}
		System.out.println("seaching value is not found");
		return null;
	}

	@Override
	public boolean update(String bagBrand, String color) {
		if (bagBrand != null) {
			if (color != null) {
				for (BagDto bd : list) {
					if (bd.getBagBrand() != null && bd.getColor() != null) {
						if (bd.getBagBrand().equals(bagBrand)) {
							bd.setColor(color);
							System.out.println("Color is Upadated");
							return true;
						}

					}

				}
				System.out.println("taking value from the list and saving into BagDto ref");
				return false;
			}
			System.out.println("updating color is null");
			return false;
		}
		System.out.println("bag brand is null");
		return false;
	}

	@Override
	public boolean delete(String type) {
		if (type != null) {
			Iterator<BagDto> itr = list.iterator();

			while (itr.hasNext()) {
				BagDto refe = (BagDto) itr.next();
				if (refe.getType() != null) {
					if (refe.getType().equals(type)) {
						itr.remove();
						System.out.println("Type is deleted");
						return true;
					}
				}
			}
		}
		System.out.println("Type is not deleted");
		return false;
	}

	@Override
	public LinkedList<BagDto> readAll() {
		return list;
	}

}
