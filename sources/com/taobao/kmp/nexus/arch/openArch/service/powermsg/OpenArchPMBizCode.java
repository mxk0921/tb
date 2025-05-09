package com.taobao.kmp.nexus.arch.openArch.service.powermsg;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", TLogTracker.LEVEL_INFO, "getValue", "()I", "Companion", "a", "DefaultBizCode", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchPMBizCode extends Enum<OpenArchPMBizCode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchPMBizCode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final OpenArchPMBizCode DefaultBizCode = new OpenArchPMBizCode("DefaultBizCode", 0, 1);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536650);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ OpenArchPMBizCode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchPMBizCode[]) ipChange.ipc$dispatch("fc2ed971", new Object[0]) : new OpenArchPMBizCode[]{DefaultBizCode};
    }

    static {
        OpenArchPMBizCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private OpenArchPMBizCode(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<OpenArchPMBizCode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchPMBizCode openArchPMBizCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode");
    }

    public static OpenArchPMBizCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMBizCode) ipChange.ipc$dispatch("9ae4bea6", new Object[]{str});
        }
        return (OpenArchPMBizCode) Enum.valueOf(OpenArchPMBizCode.class, str);
    }

    public static OpenArchPMBizCode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMBizCode[]) ipChange.ipc$dispatch("6b3bed15", new Object[0]);
        }
        return (OpenArchPMBizCode[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
