package Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.ldap.SortControl;

public class Name {
	public static void main(String[] args) throws NameExceptions {
		String[] names = {};

		try {
			names = NameReader.readNames();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		List<String> nameList = new ArrayList<>(Arrays.asList(names));

		Iterator<String> iteratorNames = nameList.iterator();

		System.out.println("Elementos en la lista mediante iterator ");
		while (iteratorNames.hasNext())
			System.out.print(iteratorNames.next() + " ");
		System.out.println();

		List<String> sortedList = nameList.stream().sorted().collect(Collectors.toList());

		Iterator<String> iteratorNamesSort = sortedList.iterator();
		System.out.println("\nElementos de la lista sorteados");
		while (iteratorNamesSort.hasNext())
			System.out.print(iteratorNamesSort.next() + " ");
		System.out.println();
	}

}
