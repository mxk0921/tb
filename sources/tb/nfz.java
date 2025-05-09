package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nfz f24709a;
    public nfz b;
    public int c = wiz.a(0);
    public int d = -1;

    static {
        t2o.a(598737399);
    }

    public nfz() {
        new WeakReference(null);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38da719a", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final nfz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("a221016d", new Object[]{this});
        }
        return this.b;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9f56720", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final nfz h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("918fbb73", new Object[]{this});
        }
        return this.f24709a;
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81348848", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void j(nfz nfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc69d85", new Object[]{this, nfzVar});
        } else {
            this.b = nfzVar;
        }
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a59c612", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void l(nfz nfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b703d7", new Object[]{this, nfzVar});
        } else {
            this.f24709a = nfzVar;
        }
    }

    public final void m(viz vizVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc31ea77", new Object[]{this, vizVar});
        } else {
            new WeakReference(vizVar);
        }
    }
}
