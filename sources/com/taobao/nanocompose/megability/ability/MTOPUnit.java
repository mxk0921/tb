package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/MTOPUnit;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "UNIT_TRADE", "UNIT_GUIDE", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MTOPUnit extends Enum<MTOPUnit> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ MTOPUnit[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final MTOPUnit UNIT_TRADE = new MTOPUnit("UNIT_TRADE", 0, "UNIT_TRADE");
    public static final MTOPUnit UNIT_GUIDE = new MTOPUnit("UNIT_GUIDE", 1, "UNIT_GUIDE");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361762);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ MTOPUnit[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTOPUnit[]) ipChange.ipc$dispatch("1eda960", new Object[0]) : new MTOPUnit[]{UNIT_TRADE, UNIT_GUIDE};
    }

    static {
        MTOPUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MTOPUnit(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<MTOPUnit> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(MTOPUnit mTOPUnit, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/MTOPUnit");
    }

    public static MTOPUnit valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPUnit) ipChange.ipc$dispatch("ab250e4b", new Object[]{str});
        }
        return (MTOPUnit) Enum.valueOf(MTOPUnit.class, str);
    }

    public static MTOPUnit[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPUnit[]) ipChange.ipc$dispatch("c1bf103c", new Object[0]);
        }
        return (MTOPUnit[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
