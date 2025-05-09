package com.taobao.uniinfra_kmp.common_utils.app;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/app/EnvType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "ONLINE", "PRE", "DAILY", "common_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class EnvType extends Enum<EnvType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ EnvType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final EnvType ONLINE = new EnvType("ONLINE", 0, 0);
    public static final EnvType PRE = new EnvType("PRE", 1, 1);
    public static final EnvType DAILY = new EnvType("DAILY", 2, 2);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1029701680);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ EnvType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnvType[]) ipChange.ipc$dispatch("792572ed", new Object[0]) : new EnvType[]{ONLINE, PRE, DAILY};
    }

    static {
        EnvType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private EnvType(String str, int i, int i2) {
    }

    public static fg8<EnvType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(EnvType envType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uniinfra_kmp/common_utils/app/EnvType");
    }

    public static EnvType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnvType) ipChange.ipc$dispatch("a0371698", new Object[]{str});
        }
        return (EnvType) Enum.valueOf(EnvType.class, str);
    }

    public static EnvType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnvType[]) ipChange.ipc$dispatch("409ae0c9", new Object[0]);
        }
        return (EnvType[]) $VALUES.clone();
    }
}
