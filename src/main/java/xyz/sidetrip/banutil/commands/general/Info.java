package xyz.sidetrip.banutil.commands.general;

import sx.blah.discord.Discord4J;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.EmbedBuilder;
import xyz.sidetrip.banutil.BanUtil;
import xyz.sidetrip.banutil.Emojis;
import xyz.sidetrip.banutil.UtilDue;
import xyz.sidetrip.banutil.commands.Command;

import java.util.Calendar;

public class Info extends Command {

    public Info() {
        super("info");
    }

    @Override
    public void execute(IMessage context, String... args) {
        EmbedBuilder info = new EmbedBuilder();
        info.withTitle(Emojis.BAN + " | <Z1500.OS>");
        info.withColor(BanUtil.BANNING_COLOUR);
        info.withDescription("I'm **Z1500** (a stateless single server moderation bot) by Iranian Bomber#4320, owned by Elite Stargaze.\n"
                + "I am Elite Stargaze's Custom Bot..."
                + " and I'm all out of bubblegum.");
        info.appendField("Z1500.OS", BanUtil.VERSION, true);
        info.appendField("Discord4J version", Discord4J.VERSION, true);
        info.appendField("Deploy in a click to Heroku!", BanUtil.REPO, false);
        info.withThumbnail(BanUtil.getClient().getApplicationIconURL());
        context.getChannel().sendMessage(info.build());
    }

    @Override
    public String toString() {
        return super.toString()+" - shows bot info";
    }

}
