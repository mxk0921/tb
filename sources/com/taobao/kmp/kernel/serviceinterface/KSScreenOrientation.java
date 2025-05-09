package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSScreenOrientation;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "landscape", "portrait", "unspecified", "unknown", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSScreenOrientation extends Enum<KSScreenOrientation> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSScreenOrientation[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSScreenOrientation landscape = new KSScreenOrientation("landscape", 0, "landscape");
    public static final KSScreenOrientation portrait = new KSScreenOrientation("portrait", 1, "portrait");
    public static final KSScreenOrientation unspecified = new KSScreenOrientation("unspecified", 2, "unspecified");
    public static final KSScreenOrientation unknown = new KSScreenOrientation("unknown", 3, "unknown");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438954);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ KSScreenOrientation[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSScreenOrientation[]) ipChange.ipc$dispatch("ead48392", new Object[0]) : new KSScreenOrientation[]{landscape, portrait, unspecified, unknown};
    }

    static {
        KSScreenOrientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private KSScreenOrientation(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSScreenOrientation> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSScreenOrientation kSScreenOrientation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSScreenOrientation");
    }

    public static KSScreenOrientation valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSScreenOrientation) ipChange.ipc$dispatch("4339cd7d", new Object[]{str});
        }
        return (KSScreenOrientation) Enum.valueOf(KSScreenOrientation.class, str);
    }

    public static KSScreenOrientation[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSScreenOrientation[]) ipChange.ipc$dispatch("f8af4e6e", new Object[0]);
        }
        return (KSScreenOrientation[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
