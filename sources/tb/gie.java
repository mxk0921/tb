package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final wdc f20020a = new c1m();

    static {
        t2o.a(481296425);
    }

    public static cme a(String str, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cme) ipChange.ipc$dispatch("d58b68a3", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        wdc wdcVar = f20020a;
        if (wdcVar != null) {
            return ((c1m) wdcVar).b(str, i, i2, i3, i4, i5);
        }
        throw new IllegalStateException("ImageAdapter is null");
    }
}
