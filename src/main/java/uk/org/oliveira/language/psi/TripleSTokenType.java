package uk.org.oliveira.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import uk.org.oliveira.language.TripleSLanguage;

public class TripleSTokenType extends IElementType {
    public TripleSTokenType(@NonNls @NotNull String debugName) {
        super(debugName, TripleSLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TripleSTokenType." + super.toString();
    }
}
