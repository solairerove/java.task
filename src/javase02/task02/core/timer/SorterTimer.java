package javase02.task02.core.timer;

import javase02.task02.core.lib.Sortable;

public class SorterTimer {

	public static <T extends Comparable<T>> long getTimer(T[] variables, Sortable sort) {
		long time = System.nanoTime();
		sort.sort(variables);

		long val = System.nanoTime() - time;
		return val;
	}

	public SorterTimer() {
		System.out.println("Timer!!!");
	}
}