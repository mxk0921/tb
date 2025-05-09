package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s2b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public p28 f27753a;
    public final Set<bx> b;
    public akf c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            } else {
                s2b.this.i(i, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final s2b f27755a = new s2b(null);

        static {
            t2o.a(729809825);
        }

        public static /* synthetic */ s2b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s2b) ipChange.ipc$dispatch("adce453c", new Object[0]);
            }
            return f27755a;
        }
    }

    static {
        t2o.a(729809823);
    }

    public /* synthetic */ s2b(a aVar) {
        this();
    }

    public static s2b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2b) ipChange.ipc$dispatch("61cc5a16", new Object[0]);
        }
        return b.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37bc9d", new Object[]{this});
            return;
        }
        this.c.a();
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).f();
        }
    }

    public p28 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p28) ipChange.ipc$dispatch("6ae43661", new Object[]{this});
        }
        if (this.f27753a == null) {
            this.f27753a = new p28();
        }
        return this.f27753a;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c = new akf();
        com.taobao.tao.navigation.a.h(new a());
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67ea346", new Object[]{this, context});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).g(context);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acffd587", new Object[]{this});
            return;
        }
        this.c.b();
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).h();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).i();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbcebe0", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).j();
        }
    }

    public void i(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94c42d4", new Object[]{this, new Integer(i), str});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).k(i, str);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aadc606", new Object[]{this, str});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).l(str);
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c072c6", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).m(z);
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).onPageSelected(i);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).n();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).o();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd0af", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).p();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).q();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).r();
        }
    }

    public void r(bx bxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8415c5", new Object[]{this, bxVar});
        } else {
            ((CopyOnWriteArraySet) this.b).add(bxVar);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f591da", new Object[]{this});
            return;
        }
        this.c.f();
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).s();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922d7660", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((bx) it.next()).a();
        }
    }

    public void u(bx bxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875b0e4c", new Object[]{this, bxVar});
        } else {
            ((CopyOnWriteArraySet) this.b).remove(bxVar);
        }
    }

    public s2b() {
        this.b = new CopyOnWriteArraySet();
        d();
    }
}
