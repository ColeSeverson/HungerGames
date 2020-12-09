package com.coleseverson.hg.game;

import com.coleseverson.hg.HG;
import com.coleseverson.hg.data.Language;

/**
 * General class for storing different aspects of data for {@link Game Games}
 */
public abstract class Data {

    final Game game;
    final HG plugin;
    final Language lang;

    protected Data(Game game) {
        this.game = game;
        this.plugin = game.plugin;
        this.lang = game.lang;
    }

    /**
     * Get the {@link Game} this data belongs to
     *
     * @return Game this data belongs to
     */
    public Game getGame() {
        return game;
    }

    /**
     * Quick method to access the main plugin
     *
     * @return Instance of {@link HG plugin}
     */
    public HG getPlugin() {
        return plugin;
    }

}
