package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.phz;
import tb.rgz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class whz implements rgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<qgz> f30708a;
    public final WeakReference<vgz> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737300);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737299);
        t2o.a(598737284);
    }

    public whz(qgz qgzVar, vgz vgzVar) {
        ckf.g(qgzVar, "eventDispatcher");
        ckf.g(vgzVar, "eventTarget");
        this.f30708a = new WeakReference<>(qgzVar);
        this.b = new WeakReference<>(vgzVar);
    }

    public void a(int i, sgz sgzVar, byte b, byte b2, byte b3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2030a44f", new Object[]{this, new Integer(i), sgzVar, new Byte(b), new Byte(b2), new Byte(b3)});
        } else {
            rgz.a.a(this, i, sgzVar, b, b2, b3);
        }
    }

    public final void b(int i, sgz sgzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233e56ff", new Object[]{this, new Integer(i), sgzVar});
            return;
        }
        ckf.g(sgzVar, "eventPayload");
        a(i, sgzVar, phz.a.a((byte) 0), phz.c.a((byte) 2), phz.b.a((byte) 0));
    }

    public qgz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qgz) ipChange.ipc$dispatch("a9180677", new Object[]{this});
        }
        return this.f30708a.get();
    }

    public vgz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vgz) ipChange.ipc$dispatch("5c09823", new Object[]{this});
        }
        return this.b.get();
    }
}
