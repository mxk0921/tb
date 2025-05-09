package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;
import tb.sf5;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sf5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, Float> A0 = new HashMap();
    public static boolean B0 = true;
    public static final long DXCARTLOTTIEVIEW_ANIMATIONJSON = -7121039522171550873L;
    public static final long DXCARTLOTTIEVIEW_ANIMATIONSPEED = -2850289834598672705L;
    public static final long DXCARTLOTTIEVIEW_CARTLOTTIEVIEW = 1334750647796108452L;
    public static final long DXCARTLOTTIEVIEW_ENDPROGRESS = -7008678693712012393L;
    public static final long DXCARTLOTTIEVIEW_IMAGEURL = 3520785955321526846L;
    public static final long DXCARTLOTTIEVIEW_ISLOOP = 9423395851292540L;
    public static final long DXCARTLOTTIEVIEW_ONFINISH = 5288693272742377286L;
    public static final long DXCARTLOTTIEVIEW_STARTPROGRESS = -3215263567528218480L;

    /* renamed from: a  reason: collision with root package name */
    public String f28004a;
    public boolean b;
    public double v0 = vu3.b.GEO_NOT_SUPPORT;
    public double w0 = 1.0d;
    public double x0 = 1.0d;
    public final Handler y0 = new Handler(Looper.getMainLooper());
    public boolean z0 = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ LottieAnimationView c;

        public a(String str, LottieAnimationView lottieAnimationView) {
            this.b = str;
            this.c = lottieAnimationView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/DXCartLottieViewWidgetNode$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            sf5.b(vav.a(c9x.CART_BIZ_NAME, "cartLottieUseCache", true));
            for (String str : sf5.l().keySet()) {
                if (str != null && str.contains(sf5.m(sf5.this))) {
                    sf5.l().remove(str);
                }
            }
            if (sf5.a()) {
                sf5.l().put(this.b, Float.valueOf(this.c.getProgress()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/DXCartLottieViewWidgetNode$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                sf5.this.postEvent(new DXEvent(5288693272742377286L));
            }
        }
    }

    static {
        t2o.a(478151080);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return B0;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        B0 = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(sf5 sf5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/DXCartLottieViewWidgetNode");
        }
    }

    public static /* synthetic */ Map l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return A0;
    }

    public static /* synthetic */ String m(sf5 sf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1243c48", new Object[]{sf5Var});
        }
        return sf5Var.f28004a;
    }

    public static /* synthetic */ void n(sf5 sf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88bd4f19", new Object[]{sf5Var});
        } else {
            sf5Var.p();
        }
    }

    public static /* synthetic */ Handler o(sf5 sf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("968d31ac", new Object[]{sf5Var});
        }
        return sf5Var.y0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new sf5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == DXCARTLOTTIEVIEW_ENDPROGRESS) {
            return 1.0d;
        }
        if (j == DXCARTLOTTIEVIEW_STARTPROGRESS) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (j == DXCARTLOTTIEVIEW_ANIMATIONSPEED) {
            return 1.0d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (view instanceof LottieAnimationView) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
            if (j == 5288693272742377286L) {
                lottieAnimationView.addAnimatorListener(new b());
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof sf5)) {
            super.onClone(dXWidgetNode, z);
            sf5 sf5Var = (sf5) dXWidgetNode;
            this.f28004a = sf5Var.f28004a;
            this.b = sf5Var.b;
            this.v0 = sf5Var.v0;
            this.w0 = sf5Var.w0;
            this.x0 = sf5Var.x0;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new LottieAnimationView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof LottieAnimationView) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
            if (this.f28004a == null) {
                return;
            }
            if (!B0 || lottieAnimationView.getComposition() == null) {
                lottieAnimationView.loop(this.b);
                lottieAnimationView.setAnimationFromUrl(this.f28004a);
                lottieAnimationView.setSpeed((float) this.x0);
                String str = this.f28004a + "_" + this.w0;
                double d = this.v0;
                double d2 = this.w0;
                if (d > d2) {
                    lottieAnimationView.reverseAnimationSpeed();
                    lottieAnimationView.setMinAndMaxProgress((float) this.w0, (float) this.v0);
                } else {
                    lottieAnimationView.setMinAndMaxProgress((float) d, (float) d2);
                }
                s();
                if (this.v0 == this.w0) {
                    Float f = (Float) ((HashMap) A0).get(str);
                    if (f != null) {
                        lottieAnimationView.setProgress(f.floatValue());
                    }
                } else if (!lottieAnimationView.isAnimating()) {
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.addAnimatorListener(new a(str, lottieAnimationView));
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXCARTLOTTIEVIEW_ANIMATIONSPEED) {
            this.x0 = d;
        } else if (j == DXCARTLOTTIEVIEW_ENDPROGRESS) {
            this.w0 = d;
        } else if (j == DXCARTLOTTIEVIEW_STARTPROGRESS) {
            this.v0 = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXCARTLOTTIEVIEW_ISLOOP) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXCARTLOTTIEVIEW_ANIMATIONJSON) {
            this.f28004a = str;
        } else if (j != 3520785955321526846L) {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().g(true).d(true).a();
        DXWidgetNode queryWidgetNodeByUserId = queryWidgetNodeByUserId("badgeRoot");
        if (queryWidgetNodeByUserId != null) {
            queryWidgetNodeByUserId.setNeedParse(a2);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (!this.z0) {
            this.z0 = true;
            kmb b2 = yn2.b(getDXRuntimeContext());
            final IDMComponent c = yn2.c(getDXRuntimeContext());
            if (b2 != null && c != null && c.getFields().containsKey("isFolded")) {
                final float floatValue = c.getFields().getFloatValue("delayBeforeUnfold");
                ((RecyclerView) b2.e().o()).addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.widget.DXCartLottieViewWidgetNode$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
                    public class a implements Runnable {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public a() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (DXCartLottieViewWidgetNode$2.a(DXCartLottieViewWidgetNode$2.this)) {
                                c.getFields().put("isFolded", (Object) Boolean.FALSE);
                                sf5.n(sf5.this);
                            }
                        }
                    }

                    public static /* synthetic */ boolean a(DXCartLottieViewWidgetNode$2 dXCartLottieViewWidgetNode$2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3008a691", new Object[]{dXCartLottieViewWidgetNode$2})).booleanValue();
                        }
                        return dXCartLottieViewWidgetNode$2.e();
                    }

                    public static /* synthetic */ Object ipc$super(DXCartLottieViewWidgetNode$2 dXCartLottieViewWidgetNode$2, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == -1177043419) {
                            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        } else if (hashCode == 1361287682) {
                            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        } else {
                            int hashCode2 = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/widget/DXCartLottieViewWidgetNode$2");
                        }
                    }

                    public final boolean e() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("4ffdb6c3", new Object[]{this})).booleanValue();
                        }
                        return c.getFields().getBooleanValue("isFolded");
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                            return;
                        }
                        super.onScrollStateChanged(recyclerView, i);
                        if (i == 1) {
                            if (!e()) {
                                c.getFields().put("isFolded", (Object) Boolean.TRUE);
                                sf5.n(sf5.this);
                            }
                            sf5.o(sf5.this).removeCallbacksAndMessages(null);
                        } else if (i == 0 && e()) {
                            sf5.o(sf5.this).postDelayed(new a(), floatValue * 1000.0f);
                        }
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        } else {
                            super.onScrolled(recyclerView, i, i2);
                        }
                    }
                });
            }
        }
    }
}
