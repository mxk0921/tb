package kotlin.internal;

import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "<init>", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class RequireKotlinVersionKind extends Enum<RequireKotlinVersionKind> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ RequireKotlinVersionKind[] $VALUES;
    public static final RequireKotlinVersionKind LANGUAGE_VERSION = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
    public static final RequireKotlinVersionKind COMPILER_VERSION = new RequireKotlinVersionKind("COMPILER_VERSION", 1);
    public static final RequireKotlinVersionKind API_VERSION = new RequireKotlinVersionKind("API_VERSION", 2);

    private static final /* synthetic */ RequireKotlinVersionKind[] $values() {
        return new RequireKotlinVersionKind[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION};
    }

    static {
        RequireKotlinVersionKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RequireKotlinVersionKind(String str, int i) {
    }

    public static fg8<RequireKotlinVersionKind> getEntries() {
        return $ENTRIES;
    }

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) $VALUES.clone();
    }
}
