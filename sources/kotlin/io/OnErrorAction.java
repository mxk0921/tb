package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class OnErrorAction extends Enum<OnErrorAction> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OnErrorAction[] $VALUES;
    public static final OnErrorAction SKIP = new OnErrorAction("SKIP", 0);
    public static final OnErrorAction TERMINATE = new OnErrorAction("TERMINATE", 1);

    private static final /* synthetic */ OnErrorAction[] $values() {
        return new OnErrorAction[]{SKIP, TERMINATE};
    }

    static {
        OnErrorAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OnErrorAction(String str, int i) {
    }

    public static fg8<OnErrorAction> getEntries() {
        return $ENTRIES;
    }

    public static OnErrorAction valueOf(String str) {
        return (OnErrorAction) Enum.valueOf(OnErrorAction.class, str);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[]) $VALUES.clone();
    }
}
