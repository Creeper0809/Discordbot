package creeper0809.discordbot.commands.command;

import creeper0809.discordbot.commands.CommandContext;
import creeper0809.discordbot.commands.ICommand;
import net.dv8tion.jda.api.MessageBuilder;

import java.util.Arrays;
import java.util.List;

public class MagicSora implements ICommand {

    @Override
    public void handle(CommandContext context) {
        MessageBuilder mb = new MessageBuilder();
        mb.append("나는 마법의 소라당!");
        context.getChannel().sendMessage(mb.build()).queue();
    }

    @Override
    public String getHelp() {
        return "마법의 소라는 매우 굉장하다!";
    }

    @Override
    public String getName() {
        return "마법의 소라";
    }

    @Override
    public List<String> getAliases() {
        return Arrays.asList("마법","마법의소라");
    }

}
