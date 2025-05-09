package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/ContentCommissionActionSourceType;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "ACTION_ADD_CART", "ACTION_GOTO_DETAIL", "ACTION_CREATE_ORDER", "ACTION_ENTER_LIVE", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ContentCommissionActionSourceType extends Enum<ContentCommissionActionSourceType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ ContentCommissionActionSourceType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final ContentCommissionActionSourceType ACTION_ADD_CART = new ContentCommissionActionSourceType("ACTION_ADD_CART", 0, "ACTION_ADD_CART");
    public static final ContentCommissionActionSourceType ACTION_GOTO_DETAIL = new ContentCommissionActionSourceType("ACTION_GOTO_DETAIL", 1, "ACTION_GOTO_DETAIL");
    public static final ContentCommissionActionSourceType ACTION_CREATE_ORDER = new ContentCommissionActionSourceType("ACTION_CREATE_ORDER", 2, "ACTION_CREATE_ORDER");
    public static final ContentCommissionActionSourceType ACTION_ENTER_LIVE = new ContentCommissionActionSourceType("ACTION_ENTER_LIVE", 3, "ACTION_ENTER_LIVE");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361628);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ ContentCommissionActionSourceType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentCommissionActionSourceType[]) ipChange.ipc$dispatch("40b3e11b", new Object[0]) : new ContentCommissionActionSourceType[]{ACTION_ADD_CART, ACTION_GOTO_DETAIL, ACTION_CREATE_ORDER, ACTION_ENTER_LIVE};
    }

    static {
        ContentCommissionActionSourceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ContentCommissionActionSourceType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<ContentCommissionActionSourceType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(ContentCommissionActionSourceType contentCommissionActionSourceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/ContentCommissionActionSourceType");
    }

    public static ContentCommissionActionSourceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentCommissionActionSourceType) ipChange.ipc$dispatch("2a544a90", new Object[]{str});
        }
        return (ContentCommissionActionSourceType) Enum.valueOf(ContentCommissionActionSourceType.class, str);
    }

    public static ContentCommissionActionSourceType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentCommissionActionSourceType[]) ipChange.ipc$dispatch("6be4a9bf", new Object[0]);
        }
        return (ContentCommissionActionSourceType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
