package com.taobao.kmp.nexus.arch.openArch.service.message.context;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchMessageCompensationType;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", TLogTracker.LEVEL_INFO, "getCode$nexus_release", "()I", "Companion", "a", "Unknown", "Goods", "Comment", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchMessageCompensationType extends Enum<OpenArchMessageCompensationType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchMessageCompensationType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    public static final OpenArchMessageCompensationType Unknown = new OpenArchMessageCompensationType("Unknown", 0, 0);
    public static final OpenArchMessageCompensationType Goods = new OpenArchMessageCompensationType("Goods", 1, 1);
    public static final OpenArchMessageCompensationType Comment = new OpenArchMessageCompensationType("Comment", 2, 2);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536557);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ OpenArchMessageCompensationType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchMessageCompensationType[]) ipChange.ipc$dispatch("3ea112a2", new Object[0]) : new OpenArchMessageCompensationType[]{Unknown, Goods, Comment};
    }

    static {
        OpenArchMessageCompensationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private OpenArchMessageCompensationType(String str, int i, int i2) {
        this.code = i2;
    }

    public static fg8<OpenArchMessageCompensationType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchMessageCompensationType openArchMessageCompensationType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchMessageCompensationType");
    }

    public static OpenArchMessageCompensationType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageCompensationType) ipChange.ipc$dispatch("ccabf08d", new Object[]{str});
        }
        return (OpenArchMessageCompensationType) Enum.valueOf(OpenArchMessageCompensationType.class, str);
    }

    public static OpenArchMessageCompensationType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageCompensationType[]) ipChange.ipc$dispatch("c4396d7e", new Object[0]);
        }
        return (OpenArchMessageCompensationType[]) $VALUES.clone();
    }

    public final int getCode$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36faacc0", new Object[]{this})).intValue();
        }
        return this.code;
    }
}
