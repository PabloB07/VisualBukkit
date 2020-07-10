package us.donut.visualbukkit.blocks.statements;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import us.donut.visualbukkit.blocks.StatementBlock;
import us.donut.visualbukkit.blocks.annotations.Category;
import us.donut.visualbukkit.blocks.annotations.Description;
import us.donut.visualbukkit.blocks.syntax.SyntaxNode;
import us.donut.visualbukkit.plugin.BuildContext;

@Category("Entity")
@Description("Spawns an entity")
public class StatSpawnEntity extends StatementBlock {

    @Override
    protected SyntaxNode init() {
        return new SyntaxNode("spawn", EntityType.class, "at", Location.class);
    }

    @Override
    public String toJava() {
        BuildContext.addUtilMethod("spawnEntity");
        return "UtilMethods.spawnEntity(" + arg(0) + "," + arg(1) + ");";
    }
}
