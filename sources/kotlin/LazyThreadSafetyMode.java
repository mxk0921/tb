package kotlin;

import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "<init>", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class LazyThreadSafetyMode extends Enum<LazyThreadSafetyMode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ LazyThreadSafetyMode[] $VALUES;
    public static final LazyThreadSafetyMode SYNCHRONIZED = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
    public static final LazyThreadSafetyMode PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1);
    public static final LazyThreadSafetyMode NONE = new LazyThreadSafetyMode("NONE", 2);

    private static final /* synthetic */ LazyThreadSafetyMode[] $values() {
        return new LazyThreadSafetyMode[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        LazyThreadSafetyMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private LazyThreadSafetyMode(String str, int i) {
    }

    public static fg8<LazyThreadSafetyMode> getEntries() {
        return $ENTRIES;
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) $VALUES.clone();
    }
}
