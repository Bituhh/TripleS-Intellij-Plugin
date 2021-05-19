package uk.org.oliveira.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import uk.org.oliveira.language.TripleSLanguage;

public class TripleSElementType extends IElementType {
    public TripleSElementType(@NonNls @NotNull String debugName) {
        super(debugName, TripleSLanguage.INSTANCE);
    }
}
