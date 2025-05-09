package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class psw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static qsw f26279a = null;

    static {
        t2o.a(989856467);
    }

    public static qsw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qsw) ipChange.ipc$dispatch("a156de01", new Object[0]);
        }
        return f26279a;
    }

    public static void b(qsw qswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60995610", new Object[]{qswVar});
            return;
        }
        v7t.d("Processor", "register processor=[" + qswVar.getClass().getName() + "]");
        f26279a = qswVar;
    }
}
