package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class esi implements ytc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kae f18793a;
    public kr1 b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final zib h;
    public boolean i;

    static {
        t2o.a(993001837);
        t2o.a(993001865);
        t2o.a(993001867);
    }

    public esi(kae kaeVar) {
        this(kaeVar, null);
    }

    public static boolean j(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("274375", new Object[]{new Float(f), new Float(f2)})).booleanValue();
        }
        if (Math.abs(f - f2) <= 1.0E-5f) {
            return true;
        }
        return false;
    }

    @Override // tb.kcc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
        } else {
            this.b.a(i);
        }
    }

    @Override // tb.kcc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2da086e", new Object[]{this, new Integer(i)});
        } else {
            this.b.b(i);
        }
    }

    @Override // tb.kcc
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86368875", new Object[]{this})).intValue();
        }
        return this.b.c();
    }

    @Override // tb.kcc
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8e58d9", new Object[]{this})).booleanValue();
        }
        return this.b.d();
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int e = this.b.e(i, i2, i3);
        float h = this.b.h();
        kae kaeVar = this.f18793a;
        if (kaeVar instanceof auc) {
            ((auc) kaeVar).K0(p(), h);
        }
        if (j(h, 0.0f)) {
            l();
        } else {
            k();
        }
        return e;
    }

    @Override // tb.ytc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return this.b.f();
    }

    @Override // tb.kcc
    public void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7c587", new Object[]{this, metaLayout});
        } else {
            this.b.g(metaLayout);
        }
    }

    @Override // tb.ytc
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.b.getHeight();
    }

    @Override // tb.kcc
    public zwm getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zwm) ipChange.ipc$dispatch("2e158f9c", new Object[]{this});
        }
        return this.b.getPriority();
    }

    @Override // tb.ytc
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b.getView();
    }

    public kr1 i(kae kaeVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("6637e751", new Object[]{this, kaeVar, str});
        }
        return h(str, kaeVar.getView(), this.c);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1cce608", new Object[]{this});
            return;
        }
        this.e = true;
        u();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9691cbe", new Object[]{this});
            return;
        }
        this.e = false;
        u();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c202c9", new Object[]{this});
            return;
        }
        this.f = true;
        u();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b77c5fb", new Object[]{this});
            return;
        }
        this.f = false;
        u();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af86222", new Object[]{this});
        } else {
            this.i = true;
        }
    }

    @Override // tb.ytc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return this.b.p();
    }

    @Override // tb.ytc
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f2365a4", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0fc654", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void t(String str) {
        kr1 behavior;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            return;
        }
        kae kaeVar = this.f18793a;
        if (!(kaeVar instanceof auc) || (behavior = ((auc) kaeVar).getBehavior()) == null) {
            kr1 i = i(this.f18793a, str);
            this.b = i;
            if (i != null) {
                i.i(this);
                return;
            }
            throw new IllegalArgumentException("未知的 header 类型");
        }
        this.b = behavior;
        behavior.i(this);
    }

    public final void u() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cff32f", new Object[]{this});
            return;
        }
        if (this.e && this.f) {
            z = true;
        }
        if (z != this.g) {
            this.g = z;
            kae kaeVar = this.f18793a;
            if (kaeVar instanceof auc) {
                if (z) {
                    ((auc) kaeVar).Z0();
                } else {
                    ((auc) kaeVar).h0();
                }
            }
        }
    }

    public esi(kae kaeVar, zib zibVar) {
        this.e = true;
        this.f = false;
        this.g = false;
        this.i = false;
        this.f18793a = kaeVar;
        this.h = zibVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r8.equals("list") == false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.kr1 h(java.lang.String r8, android.view.View r9, boolean r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.esi.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0023
            java.lang.Boolean r5 = new java.lang.Boolean
            r5.<init>(r10)
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r7
            r10[r2] = r8
            r10[r1] = r9
            r10[r0] = r5
            java.lang.String r8 = "1a00c2bd"
            java.lang.Object r8 = r4.ipc$dispatch(r8, r10)
            tb.kr1 r8 = (tb.kr1) r8
            return r8
        L_0x0023:
            tb.zib r4 = r7.h
            r5 = 0
            if (r4 == 0) goto L_0x002f
            int r6 = r7.d
            tb.kr1 r4 = r4.a(r8, r9, r10, r6)
            goto L_0x0030
        L_0x002f:
            r4 = r5
        L_0x0030:
            if (r4 == 0) goto L_0x0033
            return r4
        L_0x0033:
            r8.hashCode()
            r4 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -892259863: goto L_0x0060;
                case -424367108: goto L_0x0055;
                case 3148801: goto L_0x004a;
                case 3322014: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            r0 = -1
            goto L_0x006b
        L_0x0040:
            java.lang.String r1 = "list"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x006b
            goto L_0x003e
        L_0x004a:
            java.lang.String r0 = "fold"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0053
            goto L_0x003e
        L_0x0053:
            r0 = 2
            goto L_0x006b
        L_0x0055:
            java.lang.String r0 = "halfSticky"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005e
            goto L_0x003e
        L_0x005e:
            r0 = 1
            goto L_0x006b
        L_0x0060:
            java.lang.String r0 = "sticky"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x006a
            goto L_0x003e
        L_0x006a:
            r0 = 0
        L_0x006b:
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0077;
                case 2: goto L_0x006f;
                case 3: goto L_0x006f;
                default: goto L_0x006e;
            }
        L_0x006e:
            return r5
        L_0x006f:
            tb.ltg r8 = new tb.ltg
            int r0 = r7.d
            r8.<init>(r9, r10, r0)
            return r8
        L_0x0077:
            tb.sra r8 = new tb.sra
            int r0 = r7.d
            r8.<init>(r9, r10, r0)
            return r8
        L_0x007f:
            tb.gnq r8 = new tb.gnq
            int r0 = r7.d
            r8.<init>(r9, r10, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.esi.h(java.lang.String, android.view.View, boolean):tb.kr1");
    }
}
