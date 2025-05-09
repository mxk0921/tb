package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yn8 extends Component<FrameLayout, a> implements ol4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public n f32213a;
    public n b;
    public boolean c;
    public n e;
    public int d = -1;
    public boolean f = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int w0;
        public boolean x0;

        static {
            t2o.a(503316719);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ExpandableViewComponent$ExpandableViewParams");
        }

        @Override // tb.jfw
        public void v(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7bb1f3f", new Object[]{this, context, str, obj});
                return;
            }
            str.hashCode();
            if (str.equals("max-line-keep-one")) {
                this.x0 = nwv.o(obj, true);
            } else if (str.equals(Constants.Name.LINES)) {
                int t = nwv.t(obj, Integer.MAX_VALUE);
                this.w0 = t;
                if (t < 0) {
                    this.w0 = Integer.MAX_VALUE;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements YogaMeasureFunction {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503316720);
            t2o.a(503316503);
        }

        public b() {
        }

        public final void a(rbi rbiVar, rbi rbiVar2, n nVar) {
            rbi S;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbdd6bb", new Object[]{this, rbiVar, rbiVar2, nVar});
            } else if (rbiVar != null && rbiVar2 != null && nVar != null && (S = nVar.S()) != null) {
                int i = S.c;
                int i2 = S.d;
                int i3 = ((S.f27261a + i) + rbiVar2.f27261a) - rbiVar.f27261a;
                yn8 yn8Var = yn8.this;
                jfw q = yn8.q(yn8Var, yn8.i(yn8Var));
                if (q != null) {
                    i3 += q.h;
                }
                nVar.M0(S.f27261a - i3, S.b);
                rbi S2 = nVar.S();
                if (S2 != null) {
                    S2.c = i;
                    S2.d = i2;
                }
            }
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            rbi S;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("15b3ebfa", new Object[]{this, yogaNode, new Float(f), yogaMeasureMode, new Float(f2), yogaMeasureMode2})).longValue();
            }
            if (yn8.h(yn8.this) == null || yn8.i(yn8.this) == null || yn8.o(yn8.this) == null) {
                return YogaMeasureOutput.make(f, f2);
            }
            yn8.i(yn8.this).M0(f, f2);
            yn8.o(yn8.this).K0();
            rbi S2 = yn8.i(yn8.this).S();
            rbi S3 = yn8.o(yn8.this).S();
            if (S2 == null || S3 == null) {
                return YogaMeasureOutput.make(f, f2);
            }
            List<n> list = yn8.i(yn8.this).d;
            if (list == null) {
                return YogaMeasureOutput.make(f, f2);
            }
            ArrayList arrayList = (ArrayList) list;
            int size = arrayList.size();
            int i = -1;
            int i2 = 0;
            boolean z2 = true;
            for (int i3 = 0; i3 < size; i3++) {
                n nVar = (n) arrayList.get(i3);
                rbi S4 = nVar.S();
                if (S4 != null) {
                    if (i3 == 0 || ((S = ((n) arrayList.get(i3 - 1)).S()) != null && S.d + S.b <= S4.d)) {
                        i2++;
                    }
                    if (i2 <= ((a) yn8.p(yn8.this)).w0) {
                        yn8 yn8Var = yn8.this;
                        jfw q = yn8.q(yn8Var, yn8.i(yn8Var));
                        if (i2 < ((a) yn8.r(yn8.this)).w0) {
                            yn8.s(yn8.this, i3);
                            yn8.u(yn8.this, nVar);
                        } else if (i2 == ((a) yn8.v(yn8.this)).w0) {
                            int i4 = S4.c + S4.f27261a + S3.f27261a;
                            if (q != null) {
                                i4 += q.h;
                            }
                            if (i4 <= S2.f27261a) {
                                yn8.s(yn8.this, i3);
                                yn8.u(yn8.this, nVar);
                                yn8.x(yn8.this, false);
                            }
                            if (z2) {
                                if (((a) yn8.j(yn8.this)).x0) {
                                    yn8.s(yn8.this, i3);
                                    yn8.u(yn8.this, nVar);
                                }
                                z2 = false;
                            }
                        }
                        int i5 = S4.d + S4.b;
                        if (q != null) {
                            i5 += q.j;
                        }
                        i = Math.max(i, i5);
                    }
                }
            }
            yn8 yn8Var2 = yn8.this;
            if (i2 > ((a) yn8.m(yn8Var2)).w0) {
                z = true;
            }
            yn8.l(yn8Var2, z);
            if (yn8.k(yn8.this) && ((a) yn8.n(yn8.this)).x0 && yn8.w(yn8.this)) {
                a(S2, S3, yn8.t(yn8.this));
            }
            return YogaMeasureOutput.make(S2.f27261a, i);
        }
    }

    static {
        t2o.a(503316718);
        t2o.a(503317030);
    }

    public static /* synthetic */ jfw h(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("5dae6e36", new Object[]{yn8Var});
        }
        return yn8Var.viewParams;
    }

    public static /* synthetic */ n i(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("df615de0", new Object[]{yn8Var});
        }
        return yn8Var.f32213a;
    }

    public static /* synthetic */ Object ipc$super(yn8 yn8Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == -613926416) {
            super.onLayout();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/ExpandableViewComponent");
        }
    }

    public static /* synthetic */ jfw j(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("5328ada7", new Object[]{yn8Var});
        }
        return yn8Var.viewParams;
    }

    public static /* synthetic */ boolean k(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65161211", new Object[]{yn8Var})).booleanValue();
        }
        return yn8Var.c;
    }

    public static /* synthetic */ boolean l(yn8 yn8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6faf85a9", new Object[]{yn8Var, new Boolean(z)})).booleanValue();
        }
        yn8Var.c = z;
        return z;
    }

    public static /* synthetic */ jfw m(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("44a91e5", new Object[]{yn8Var});
        }
        return yn8Var.viewParams;
    }

    public static /* synthetic */ jfw n(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("dcdb8404", new Object[]{yn8Var});
        }
        return yn8Var.viewParams;
    }

    public static /* synthetic */ n o(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("526e5a21", new Object[]{yn8Var});
        }
        return yn8Var.b;
    }

    public static /* synthetic */ jfw p(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("e7614493", new Object[]{yn8Var});
        }
        return yn8Var.viewParams;
    }

    public static /* synthetic */ jfw q(yn8 yn8Var, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("5c3a0482", new Object[]{yn8Var, nVar});
        }
        return yn8Var.D(nVar);
    }

    public static /* synthetic */ jfw r(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("988328d1", new Object[]{yn8Var});
        }
        return yn8Var.viewParams;
    }

    public static /* synthetic */ int s(yn8 yn8Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46a4d371", new Object[]{yn8Var, new Integer(i)})).intValue();
        }
        yn8Var.d = i;
        return i;
    }

    public static /* synthetic */ n t(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("91af4766", new Object[]{yn8Var});
        }
        return yn8Var.e;
    }

    public static /* synthetic */ n u(yn8 yn8Var, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("230c87ae", new Object[]{yn8Var, nVar});
        }
        yn8Var.e = nVar;
        return nVar;
    }

    public static /* synthetic */ jfw v(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("2235ff2e", new Object[]{yn8Var});
        }
        return yn8Var.viewParams;
    }

    public static /* synthetic */ boolean w(yn8 yn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("793dcdea", new Object[]{yn8Var})).booleanValue();
        }
        return yn8Var.f;
    }

    public static /* synthetic */ boolean x(yn8 yn8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07f44f0", new Object[]{yn8Var, new Boolean(z)})).booleanValue();
        }
        yn8Var.f = z;
        return z;
    }

    /* renamed from: A */
    public a generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("679f0fbe", new Object[]{this});
        }
        return new a();
    }

    public final n B(int i) {
        List<n> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("a42cb53f", new Object[]{this, new Integer(i)});
        }
        n nVar = this.f32213a;
        if (nVar == null || (list = nVar.d) == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        if (i < 0 || i >= size) {
            return null;
        }
        return (n) arrayList.get(i);
    }

    public final rbi C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("662186d7", new Object[]{this, new Integer(i)});
        }
        n B = B(i);
        if (B == null) {
            return null;
        }
        return B.S();
    }

    public final jfw D(n nVar) {
        Component K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("769d78e9", new Object[]{this, nVar});
        }
        if (nVar == null || (K = nVar.K()) == null) {
            return null;
        }
        return K.getViewParams();
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[]{this});
            return;
        }
        z();
        this.f32213a = null;
        this.b = null;
        this.c = false;
        this.d = -1;
        this.e = null;
        this.f = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this});
        }
        return new b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        E();
        List<n> j0 = this.node.j0();
        if (j0 != null && j0.size() >= 2) {
            this.f32213a = j0.get(0);
            this.b = j0.get(1);
        }
    }

    /* renamed from: y */
    public void applyAttrForView(FrameLayout frameLayout, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b167add", new Object[]{this, frameLayout, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(frameLayout, aVar, map, z);
        n nVar = this.f32213a;
        if (!(nVar == null || this.b == null)) {
            nVar.b1(frameLayout.getContext());
            List<n> list = this.f32213a.d;
            if (list != null) {
                ArrayList arrayList = (ArrayList) list;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View w0 = ((n) arrayList.get(i)).w0();
                    if (w0 != null) {
                        if (!this.c || i <= this.d) {
                            w0.setVisibility(0);
                        } else {
                            w0.setVisibility(4);
                        }
                    }
                }
            }
            this.b.b1(frameLayout.getContext());
            View w02 = this.b.w0();
            if (w02 == null) {
                return;
            }
            if (this.c) {
                w02.setVisibility(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w02.getLayoutParams();
                if (((a) this.viewParams).x0 || !this.f) {
                    rbi C = C(this.d);
                    if (C != null) {
                        layoutParams.gravity = BadgeDrawable.BOTTOM_START;
                        layoutParams.leftMargin = C.c + C.f27261a;
                        return;
                    }
                    return;
                }
                jfw D = D(this.f32213a);
                if (D != null) {
                    layoutParams.gravity = BadgeDrawable.BOTTOM_START;
                    layoutParams.leftMargin = D.g;
                    return;
                }
                return;
            }
            w02.setVisibility(4);
        }
    }

    public final void z() {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e31a1b", new Object[]{this});
        } else if (this.c && ((a) this.viewParams).x0 && this.f && (nVar = this.e) != null && nVar.K() != null) {
            this.e.K().clearCacheSize();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public FrameLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("f97b5018", new Object[]{this, context}) : new FrameLayout(context);
    }
}
