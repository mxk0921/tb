package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.ad.impl.dx.view.MMAdLottieView;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.h6c;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o36 extends DXWidgetNode implements ulh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMMADLOTTIEVIEW_AUTOPLAY = 1174195036188518487L;
    public static final int DXMMADLOTTIEVIEW_AUTOPLAY_FALSE = 1;
    public static final int DXMMADLOTTIEVIEW_AUTOPLAY_TRUE = 0;
    public static final long DXMMADLOTTIEVIEW_FOLLOWFINGER = 8516538730314951418L;
    public static final int DXMMADLOTTIEVIEW_FOLLOWFINGER_FALSE = 1;
    public static final int DXMMADLOTTIEVIEW_FOLLOWFINGER_TRUE = 0;
    public static final long DXMMADLOTTIEVIEW_IMAGEURL = 3520785955321526846L;
    public static final long DXMMADLOTTIEVIEW_LOTTIEPROCESS = 2788943598200882813L;
    public static final long DXMMADLOTTIEVIEW_LOTTIEURL = 2098074961106059981L;
    public static final long DXMMADLOTTIEVIEW_MMADLOTTIEVIEW = -6876941172612668615L;
    public static final long DXMMADLOTTIEVIEW_PLAYCYCLEINFEED = 2344645787189096672L;
    public static final long DXMMADLOTTIEVIEW_REPEATCOUNT = 2299602847062992021L;
    public static final long DXMMADLOTTIEVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXMMADLOTTIEVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXMMADLOTTIEVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXMMADLOTTIEVIEW_SCALETYPE_FITXY = 1;
    public static final long DXMMADLOTTIEVIEW_STARTPLAYRATIOINFEED = 2826634501232401666L;
    public String c;
    public String e;
    public h6c.c j;
    public boolean k;
    public long p;
    public Rect q;

    /* renamed from: a  reason: collision with root package name */
    public int f25121a = 0;
    public int b = 1;
    public double d = vu3.b.GEO_NOT_SUPPORT;
    public double f = 0.4d;
    public int g = 0;
    public int h = 0;
    public double i = 0.5d;
    public boolean l = false;
    public int m = 0;
    public int n = 0;
    public final Rect o = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            String message;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            if (th == null) {
                message = "";
            } else {
                message = th.getMessage();
            }
            gd0.b(o36.t(o36.this), 0.0f, 0, 0, o36.u(o36.this), o36.v(o36.this), message);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6c.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            } else {
                o36.w(o36.this, i2);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(o36 o36Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/node/DXMMADLottieViewWidgetNode");
        }
    }

    public static /* synthetic */ String t(o36 o36Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e395eb0", new Object[]{o36Var});
        }
        return o36Var.e;
    }

    public static /* synthetic */ int u(o36 o36Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad94a724", new Object[]{o36Var})).intValue();
        }
        return o36Var.n;
    }

    public static /* synthetic */ int v(o36 o36Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90c05a65", new Object[]{o36Var})).intValue();
        }
        return o36Var.m;
    }

    public static /* synthetic */ void w(o36 o36Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9961bb0", new Object[]{o36Var, new Integer(i)});
        } else {
            o36Var.C(i);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d053cd5", new Object[]{this});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext != null) {
            View D = dXRuntimeContext.D();
            if (D instanceof MMAdLottieView) {
                ((MMAdLottieView) D).hideBottomImage();
            }
        }
    }

    public final void B() {
        MMAdLottieView y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (this.b != 0 && this.f25121a == 0 && !this.l && this.k && (y = y()) != null && y.isPlaying()) {
            v1.b("DXMMADLottieViewWidget", "pause");
            y.pause();
        }
    }

    public final void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e419904", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            MMAdLottieView y = y();
            if (y != null && y.getLocalVisibleRect(this.o) && y.isShown() && Math.abs(this.o.height()) >= y.getHeight() * this.i) {
                double d = this.f;
                if (d >= vu3.b.GEO_NOT_SUPPORT) {
                    y.setProcess(Math.max(0.0f, Math.min(1.0f, y.getProcess() + ((float) (i / (this.m * d))))));
                }
            }
        } catch (Throwable th) {
            v1.c("DXMMADLottieViewWidget", "playByScroll", th);
            th.printStackTrace();
        }
    }

    public final void D() {
        DXRuntimeContext dXRuntimeContext;
        cfc c;
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
            return;
        }
        try {
            if (this.b != 1 && (dXRuntimeContext = getDXRuntimeContext()) != null && (c = j18.c(dXRuntimeContext)) != null && (iMainFeedsViewService = (IMainFeedsViewService) c.a(IMainFeedsViewService.class)) != null) {
                if (this.j == null) {
                    this.j = new b();
                }
                iMainFeedsViewService.getLifeCycleRegister().h(this.j);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void E() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
            return;
        }
        try {
            if (this.b != 1 && (dXRuntimeContext = getDXRuntimeContext()) != null) {
                IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) j18.c(dXRuntimeContext).a(IMainFeedsViewService.class);
                if (this.j != null) {
                    iMainFeedsViewService.getLifeCycleRegister().v(this.j);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new o36();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == 2788943598200882813L) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (j == DXMMADLOTTIEVIEW_PLAYCYCLEINFEED) {
            return 0.4d;
        }
        if (j == DXMMADLOTTIEVIEW_STARTPLAYRATIOINFEED) {
            return 0.5d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 1174195036188518487L) {
            return 0;
        }
        if (j == DXMMADLOTTIEVIEW_FOLLOWFINGER) {
            return 1;
        }
        if (j == 2299602847062992021L || j == 1015096712691932083L) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof o36)) {
            super.onClone(dXWidgetNode, z);
            o36 o36Var = (o36) dXWidgetNode;
            this.f25121a = o36Var.f25121a;
            this.b = o36Var.b;
            this.c = o36Var.c;
            this.d = o36Var.d;
            this.e = o36Var.e;
            this.f = o36Var.f;
            this.g = o36Var.g;
            this.h = o36Var.h;
            this.i = o36Var.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new MMAdLottieView(context);
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
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 2788943598200882813L) {
            this.d = d;
        } else if (j == DXMMADLOTTIEVIEW_PLAYCYCLEINFEED) {
            this.f = d;
        } else if (j == DXMMADLOTTIEVIEW_STARTPLAYRATIOINFEED) {
            this.i = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1174195036188518487L) {
            this.f25121a = i;
        } else if (j == DXMMADLOTTIEVIEW_FOLLOWFINGER) {
            this.b = i;
        } else if (j == 2299602847062992021L) {
            this.g = i;
        } else if (j == 1015096712691932083L) {
            this.h = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 3520785955321526846L) {
            this.c = str;
        } else if (j == 2098074961106059981L) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658c788a", new Object[]{this});
        } else if (this.b != 0 && this.f25121a == 0 && this.l && this.k) {
            MMAdLottieView y = y();
            v1.b("DXMMADLottieViewWidget", "lottie_autoPlay");
            if (y != null) {
                y.play();
            }
        }
    }

    public final MMAdLottieView y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MMAdLottieView) ipChange.ipc$dispatch("1251c6eb", new Object[]{this});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return null;
        }
        View D = dXRuntimeContext.D();
        if (!(D instanceof MMAdLottieView)) {
            return null;
        }
        return (MMAdLottieView) D;
    }

    public final int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d232a829", new Object[]{this})).intValue();
        }
        try {
            MMAdLottieView y = y();
            if (y == null) {
                return 0;
            }
            if (this.q == null) {
                this.q = new Rect();
            }
            y.getGlobalVisibleRect(this.q);
            return this.q.top;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @Override // tb.ulh
    public void onCompositionLoaded(kkh kkhVar) {
        float d;
        float f;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0909eda", new Object[]{this, kkhVar});
            return;
        }
        if (kkhVar != null) {
            try {
                d = kkhVar.d();
                float i3 = kkhVar.i();
                Rect b2 = kkhVar.b();
                if (b2 != null) {
                    int width = b2.width();
                    f = i3;
                    i2 = b2.height();
                    i = width;
                } else {
                    f = i3;
                    i = 0;
                    i2 = 0;
                }
            } catch (Throwable th) {
                v1.c("DXMMADLottieViewWidget", "onCompositionLoaded", th);
                th.printStackTrace();
                return;
            }
        } else {
            i = 0;
            d = 0.0f;
            i2 = 0;
            f = 0.0f;
        }
        if (d > 0.0f && i > 0 && i2 > 0) {
            this.k = true;
            A();
            x();
        }
        if (this.p != -1) {
            float currentTimeMillis = (float) (System.currentTimeMillis() - this.p);
            this.p = -1L;
            if (this.k) {
                gd0.c(this.e, currentTimeMillis, i, i2, this.n, this.m, z(), f);
            } else {
                gd0.b(this.e, currentTimeMillis, i, i2, this.n, this.m, "lottie_check_fail");
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        boolean onEvent = super.onEvent(dXEvent);
        try {
            long eventId = dXEvent.getEventId();
            if (eventId == 5288671110273408574L) {
                v1.b("DXMMADLottieViewWidget", "receive on appear event");
                this.l = true;
                x();
                D();
            } else if (eventId == 5388973340095122049L) {
                v1.b("DXMMADLottieViewWidget", "receive on disappear event");
                this.l = false;
                B();
                E();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return onEvent;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof MMAdLottieView) {
            try {
                MMAdLottieView mMAdLottieView = (MMAdLottieView) view;
                if (!(mMAdLottieView.getLottieAnimationView() == null || mMAdLottieView.getBottomImageView() == null)) {
                    this.m = Resources.getSystem().getDisplayMetrics().heightPixels;
                    this.n = Resources.getSystem().getDisplayMetrics().widthPixels;
                    mMAdLottieView.setImageUrl(this.c);
                    if (!TextUtils.isEmpty(this.e)) {
                        mMAdLottieView.setLottieUrl(this.e);
                        mMAdLottieView.setLottieProcess((float) this.d);
                        mMAdLottieView.setRepeatCount(this.g);
                        int i = this.h;
                        if (i == 1) {
                            mMAdLottieView.setScaleType(ImageView.ScaleType.FIT_XY);
                        } else if (i != 2) {
                            mMAdLottieView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        } else {
                            mMAdLottieView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        }
                        mMAdLottieView.removeLottieOnCompositionLoadedListener(this);
                        mMAdLottieView.addLottieOnCompositionLoadedListener(this);
                        mMAdLottieView.setFailureListener(new a());
                        if (this.p != -1) {
                            this.p = System.currentTimeMillis();
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                gd0.b(this.e, 0.0f, 0, 0, this.n, this.m, th.getMessage());
                v1.c("DXMMADLottieViewWidget", "onRenderView", th);
            }
        }
    }
}
