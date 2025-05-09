package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class nys {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nys INSTANCE = new nys();

    /* renamed from: a  reason: collision with root package name */
    public static final String f25038a = "normalCommentEventTag";
    public static final String b = "bottomCommentEventTag";
    public static final String c = "hotSaleCommentEventTag";
    public static final String d = "atmosphereCommentEventTag";

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("852ba078", new Object[]{this});
        }
        return b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d310e195", new Object[]{this});
        }
        return d;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40a063bb", new Object[]{this});
        }
        return c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b350cb3c", new Object[]{this});
        }
        return f25038a;
    }

    static {
        t2o.a(1010827315);
    }
}
