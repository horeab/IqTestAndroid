package libgdx.implementations.iq;

import libgdx.game.Game;
import libgdx.resources.gamelabel.GameLabelUtils;
import libgdx.resources.gamelabel.SpecificPropertiesUtils;

public enum SkelGameLabel implements libgdx.resources.gamelabel.GameLabel {


    new_game,
    skip,
    answerchoice,
    finalscoreexplanation,
    verylow,
    low,
    normal,
    high,
    veryhigh,;

    @Override
    public String getText(Object... params) {
        String language = Game.getInstance().getAppInfoService().getLanguage();
        return GameLabelUtils.getText(getKey(), language, SpecificPropertiesUtils.getLabelFilePath(), params);
    }

    @Override
    public String getKey() {
        return name().toLowerCase();
    }
}
