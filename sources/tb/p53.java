package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class p53 extends d32<o53, yr3, CaptureManager> implements slb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ViewGroup l;
    public View m;
    public FrameLayout n;
    public TextView o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/debug/CaptureDebugView$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            p53.this.S().setVisibility(0);
            ViewGroup S = p53.this.S();
            View Q = p53.Q(p53.this);
            if (Q != null) {
                S.addView(Q);
            } else {
                ckf.y("rootView");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean d;

        public b(boolean z) {
            this.d = z;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/debug/CaptureDebugView$optionDebugStatus$1");
        }

        @Override // tb.zio
        public void c() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            View Q = p53.Q(p53.this);
            if (Q != null) {
                if (!this.d) {
                    i = 8;
                }
                Q.setVisibility(i);
                return;
            }
            ckf.y("rootView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public c(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView O = p53.O(p53.this);
            if (O != null) {
                StringBuilder sb = new StringBuilder();
                String str = this.b;
                boolean z = this.c;
                sb.append(ckf.p(str, "\n"));
                sb.append("isSilent: " + z + '\n');
                O.setText(sb.toString());
                FrameLayout P = p53.P(p53.this);
                if (P != null) {
                    P.removeAllViews();
                } else {
                    ckf.y("regionContainer");
                    throw null;
                }
            } else {
                ckf.y("infoTv");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public d(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView O = p53.O(p53.this);
            if (O != null) {
                StringBuilder sb = new StringBuilder("Alinn\n");
                boolean z = this.b;
                sb.append("isSilent: " + z + '\n');
                O.setText(sb.toString());
                FrameLayout P = p53.P(p53.this);
                if (P != null) {
                    P.removeAllViews();
                } else {
                    ckf.y("regionContainer");
                    throw null;
                }
            } else {
                ckf.y("infoTv");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public e(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView O = p53.O(p53.this);
            if (O != null) {
                StringBuilder sb = new StringBuilder("Client\n");
                boolean z = this.b;
                sb.append("isSilent: " + z + '\n');
                O.setText(sb.toString());
                FrameLayout P = p53.P(p53.this);
                if (P != null) {
                    P.removeAllViews();
                } else {
                    ckf.y("regionContainer");
                    throw null;
                }
            } else {
                ckf.y("infoTv");
                throw null;
            }
        }
    }

    static {
        t2o.a(481296618);
        t2o.a(481296625);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p53(Activity activity, rcc<yr3, CaptureManager> rccVar, ViewGroup viewGroup) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
        ckf.g(rccVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(viewGroup, "parentContainer");
        this.l = viewGroup;
        vpt.g("CaptureDebugView_initViews", new a());
    }

    public static final /* synthetic */ Activity N(p53 p53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("33c641d8", new Object[]{p53Var});
        }
        return p53Var.c;
    }

    public static final /* synthetic */ TextView O(p53 p53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d53679c6", new Object[]{p53Var});
        }
        return p53Var.o;
    }

    public static final /* synthetic */ FrameLayout P(p53 p53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("917dd3b8", new Object[]{p53Var});
        }
        return p53Var.n;
    }

    public static final /* synthetic */ View Q(p53 p53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("262697dd", new Object[]{p53Var});
        }
        return p53Var.m;
    }

    public static /* synthetic */ Object ipc$super(p53 p53Var, String str, Object... objArr) {
        if (str.hashCode() == -3136315) {
            super.K();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/debug/CaptureDebugView");
    }

    /* renamed from: R */
    public o53 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o53) ipChange.ipc$dispatch("8459487b", new Object[]{this});
        }
        return new o53();
    }

    public final ViewGroup S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6e7284d", new Object[]{this});
        }
        return this.l;
    }

    public final void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266548bd", new Object[]{this, new Boolean(z)});
        } else {
            vpt.g("optionDebugStatus", new b(z));
        }
    }

    @Override // tb.slb
    public void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0381b0", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        this.c.runOnUiThread(new c(str, z));
    }

    @Override // tb.slb
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fade7693", new Object[]{this, new Boolean(z)});
        } else {
            this.c.runOnUiThread(new e(z));
        }
    }

    @Override // tb.slb
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a59eb9e", new Object[]{this, new Boolean(z)});
        } else {
            this.c.runOnUiThread(new d(z));
        }
    }

    @Override // tb.slb
    public void s(rk1 rk1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93feb91", new Object[]{this, rk1Var});
            return;
        }
        ckf.g(rk1Var, "output");
        this.c.runOnUiThread(new f(rk1Var));
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        View inflate = LayoutInflater.from(I()).inflate(R.layout.feis_smart_debug, (ViewGroup) null, false);
        if (inflate != null) {
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.m = viewGroup;
            View findViewById = viewGroup.findViewById(R.id.fl_region_container);
            ckf.f(findViewById, "rootView.findViewById(R.id.fl_region_container)");
            this.n = (FrameLayout) findViewById;
            View view = this.m;
            if (view != null) {
                View findViewById2 = view.findViewById(R.id.tv_debug);
                ckf.f(findViewById2, "rootView.findViewById(R.id.tv_debug)");
                this.o = (TextView) findViewById2;
                m().t0(this);
                return;
            }
            ckf.y("rootView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rk1 b;

        public f(rk1 rk1Var) {
            this.b = rk1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView O = p53.O(p53.this);
            if (O != null) {
                StringBuilder sb = new StringBuilder();
                rk1 rk1Var = this.b;
                sb.append(ckf.p(rk1Var.o(), "\n"));
                sb.append(ckf.p(rk1Var.n(), "\n"));
                sb.append("costTime: " + rk1Var.c() + '\n');
                sb.append("clientCostTime: " + rk1Var.b() + '\n');
                sb.append("isInValid: " + rk1Var.s() + '\n');
                sb.append("code: " + ((Object) rk1Var.k()) + '\n');
                sb.append("tipId: " + rk1Var.l() + '\n');
                O.setText(sb.toString());
                FrameLayout P = p53.P(p53.this);
                if (P != null) {
                    P.removeAllViews();
                    List<RectF> a2 = this.b.a();
                    List<RectF> list = a2;
                    if (list != null && !list.isEmpty()) {
                        FrameLayout P2 = p53.P(p53.this);
                        if (P2 != null) {
                            int width = P2.getWidth();
                            FrameLayout P3 = p53.P(p53.this);
                            if (P3 != null) {
                                int height = P3.getHeight();
                                int size = a2.size();
                                int i = 0;
                                while (i < size) {
                                    i++;
                                    RectF rectF = a2.get(i);
                                    if (rectF != null) {
                                        float f = width;
                                        float f2 = height;
                                        RectF rectF2 = new RectF(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
                                        FrameLayout P4 = p53.P(p53.this);
                                        if (P4 != null) {
                                            TextView textView = new TextView(p53.N(p53.this));
                                            rk1 rk1Var2 = this.b;
                                            textView.setTextColor(Color.parseColor("#FFFFFF"));
                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                            gradientDrawable.setShape(0);
                                            gradientDrawable.setStroke(3, Color.parseColor("#FF8903"));
                                            textView.setBackground(gradientDrawable);
                                            StringBuilder sb2 = new StringBuilder();
                                            StringBuilder sb3 = new StringBuilder("index:");
                                            sb3.append(i);
                                            sb3.append("; label:");
                                            List<Integer> h = rk1Var2.h();
                                            sb3.append(h == null ? null : h.get(i));
                                            sb3.append("; score:");
                                            List<Double> m = rk1Var2.m();
                                            sb3.append(m == null ? null : m.get(i));
                                            sb2.append(sb3.toString());
                                            textView.setText(sb2.toString());
                                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                            layoutParams.setMargins((int) rectF2.left, (int) rectF2.top, 0, 0);
                                            xhv xhvVar = xhv.INSTANCE;
                                            P4.addView(textView, layoutParams);
                                        } else {
                                            ckf.y("regionContainer");
                                            throw null;
                                        }
                                    }
                                }
                                RectF j = this.b.j();
                                if (j != null) {
                                    p53 p53Var = p53.this;
                                    float f3 = width;
                                    float f4 = height;
                                    RectF rectF3 = new RectF(j.left * f3, j.top * f4, j.right * f3, j.bottom * f4);
                                    FrameLayout P5 = p53.P(p53Var);
                                    if (P5 != null) {
                                        TextView textView2 = new TextView(p53.N(p53Var));
                                        textView2.setTextColor(Color.parseColor("#FFFFFF"));
                                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                                        gradientDrawable2.setShape(0);
                                        gradientDrawable2.setStroke(3, Color.parseColor("#00FF00"));
                                        textView2.setBackground(gradientDrawable2);
                                        textView2.setText("result_info");
                                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                        layoutParams2.setMargins((int) rectF3.left, (int) rectF3.top, 0, 0);
                                        xhv xhvVar2 = xhv.INSTANCE;
                                        P5.addView(textView2, layoutParams2);
                                        return;
                                    }
                                    ckf.y("regionContainer");
                                    throw null;
                                }
                                return;
                            }
                            ckf.y("regionContainer");
                            throw null;
                        }
                        ckf.y("regionContainer");
                        throw null;
                    }
                    return;
                }
                ckf.y("regionContainer");
                throw null;
            }
            ckf.y("infoTv");
            throw null;
        }
    }
}
