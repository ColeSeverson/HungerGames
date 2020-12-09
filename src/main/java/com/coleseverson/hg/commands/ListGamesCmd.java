package com.coleseverson.hg.commands;

import com.coleseverson.hg.game.Game;
import com.coleseverson.hg.game.GameArenaData;
import com.coleseverson.hg.util.Util;

public class ListGamesCmd extends BaseCmd {

	public ListGamesCmd() {
		forcePlayer = false;
		cmdName = "listgames";
		forceInGame = false;
		argLength = 1;
	}

	@Override
	public boolean run() {
		Util.scm(sender, "&6&l Games:");
		for (Game game : plugin.getGames()) {
			GameArenaData gameArenaData = game.getGameArenaData();
			Util.scm(sender, " &4 - &6" + gameArenaData.getName() + "&4:&6" + gameArenaData.getStatus().getName());
		}
		return true;
	}
}
