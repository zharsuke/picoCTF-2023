package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo14702d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, mo14703d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, mo14704k = 2, mo14705mv = {1, 6, 0}, mo14707xi = 48)
/* compiled from: _OneToManyTitlecaseMappings.kt */
public final class _OneToManyTitlecaseMappingsKt {
    public static final String titlecaseImpl(char $this$titlecaseImpl) {
        String uppercase = String.valueOf($this$titlecaseImpl).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(uppercase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (uppercase.length() <= 1) {
            return String.valueOf(Character.toTitleCase($this$titlecaseImpl));
        }
        if ($this$titlecaseImpl == 329) {
            return uppercase;
        }
        char charAt = uppercase.charAt(0);
        String substring = uppercase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }
}
