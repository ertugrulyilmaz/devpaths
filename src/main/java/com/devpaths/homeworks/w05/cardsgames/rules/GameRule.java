package com.devpaths.homeworks.w05.cardsgames.rules;

import com.devpaths.homeworks.w05.cardsgames.base.Card;

import java.util.List;

public interface GameRule {

  int calculate(final List<Card> cards);

  int compare(List<Card> cards1, List<Card> cards2);

}
