package io.github.ciamcioo.habit_builder.service;

public class HabitNotPresent extends RuntimeException {
  public HabitNotPresent(String message) {
    super(message);
  }
}
