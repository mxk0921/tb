package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.linkage.pop.small.SmallPopWVBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o4q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile o4q b;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f25142a;

    static {
        t2o.a(573571156);
    }

    public o4q(nwi nwiVar) {
        this.f25142a = nwiVar;
        SmallPopWVBridge.register();
        usg.d().b().a(new vsg(nwiVar));
    }

    public static o4q b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4q) ipChange.ipc$dispatch("d95f7089", new Object[0]);
        }
        return b;
    }

    public static o4q c(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4q) ipChange.ipc$dispatch("ac2117e9", new Object[]{nwiVar});
        }
        if (b == null) {
            synchronized (o4q.class) {
                try {
                    if (b == null) {
                        b = new o4q(nwiVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public nwi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("c27496db", new Object[]{this});
        }
        return this.f25142a;
    }
}
