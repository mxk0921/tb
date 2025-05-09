package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.SecCamManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29182a;
    public static final u6p b = new u6p();

    public static u6p d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u6p) ipChange.ipc$dispatch("791ac84", new Object[0]);
        }
        return b;
    }

    public synchronized int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e32ba672", new Object[]{this})).intValue();
        }
        v6p.a("SecCamInterface", "close start!");
        f29182a = false;
        return SecCamManager.h().c();
    }

    public synchronized void b(Context context, zu6 zu6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916bd814", new Object[]{this, context, zu6Var});
            return;
        }
        SecCamManager.h().l(context);
        SecCamManager.h().e(zu6Var);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[]{this});
        }
        return SecCamManager.h().g();
    }

    public synchronized s6p e(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s6p) ipChange.ipc$dispatch("cab74755", new Object[]{this, new Integer(i), bArr});
        }
        v6p.a("SecCamInterface", "getSecRawImage!");
        return SecCamManager.h().d(i, bArr, true);
    }

    public synchronized void f(Context context, byte[] bArr, n1f n1fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0dde57", new Object[]{this, context, bArr, n1fVar});
            return;
        }
        v6p.a("SecCamInterface", "init start!");
        if (!f29182a) {
            f29182a = true;
            SecCamManager.h().l(context);
            SecCamManager.h().i(bArr, n1fVar);
            v6p.a("SecCamInterface", "init end!");
        }
    }

    public synchronized void g(int i, q4l q4lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a20be7", new Object[]{this, new Integer(i), q4lVar});
            return;
        }
        v6p.a("SecCamInterface", "openSecCamera!");
        SecCamManager.h().k(i, q4lVar);
    }
}
