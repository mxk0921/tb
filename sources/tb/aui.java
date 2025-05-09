package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class aui {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final aui INSTANCE = new aui();

    /* renamed from: a  reason: collision with root package name */
    public static quc f16011a;

    static {
        t2o.a(144703578);
    }

    public static final quc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (quc) ipChange.ipc$dispatch("4ba00474", new Object[0]);
        }
        quc qucVar = f16011a;
        if (qucVar != null) {
            return qucVar;
        }
        ckf.y("middlewareHub");
        throw null;
    }

    public static final void b(quc qucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43727e8", new Object[]{qucVar});
            return;
        }
        ckf.g(qucVar, "<set-?>");
        f16011a = qucVar;
    }
}
