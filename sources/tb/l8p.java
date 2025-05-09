package tb;

import android.graphics.Color;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l8p extends gr9 implements fjc, itk, f9e, NavigationTabModule.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String C = "SeekBarLayer";
    private static final int D = 2;
    private static final String E = "SeekBarLayer";
    private int A = 0;
    private final olk<c> B = new olk<>();
    private final god e;
    private final prp f;
    private final IHostAppService g;
    private ViewGroup h;
    private RangeSeekBar i;
    private TextView j;
    private TextView k;
    private View l;
    private boolean m;
    private boolean n;
    private String o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    private boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            if (l8p.P(l8p.this) != null && (l8p.P(l8p.this).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                i9 = ((ViewGroup.MarginLayoutParams) l8p.P(l8p.this).getLayoutParams()).bottomMargin;
            }
            if (l8p.Q(l8p.this) != null) {
                i9 += l8p.Q(l8p.this).getPaddingBottom();
            }
            l8p.R(l8p.this, i9);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f23177a;

        public b(int i) {
            this.f23177a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (l8p.P(l8p.this) != null) {
                ir9.b("SeekBarLayer", "VSMSG_progressChanged，开始显示: position=" + this.f23177a);
                l8p.P(l8p.this).setAlpha(0.0f);
                l8p.P(l8p.this).setVisibility(0);
                fx0.a(l8p.P(l8p.this), 300);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void l(int i);
    }

    static {
        t2o.a(468714012);
        t2o.a(468714064);
        t2o.a(468714021);
        t2o.a(468714535);
        t2o.a(502268122);
    }

    public l8p(FluidContext fluidContext, prp prpVar) {
        super(fluidContext, prpVar);
        this.f = prpVar;
        this.g = (IHostAppService) prpVar.U().getService(IHostAppService.class);
        this.e = new m8p(fluidContext);
        k0();
        fluidContext.getContext();
        int q = pr9.q(2);
        this.y = q;
        this.v = q;
        int q2 = pr9.q(26);
        this.x = q2;
        this.w = q2;
    }

    private void B0(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaad22ed", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        this.i.setThumbProgressHeight(i);
        this.i.getLeftSeekBar().H(i2);
        this.i.getLeftSeekBar().F(i2);
        this.i.setThumbEnabled(z);
    }

    public static /* synthetic */ ViewGroup P(l8p l8pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4a9a7fad", new Object[]{l8pVar});
        }
        return l8pVar.h;
    }

    public static /* synthetic */ RangeSeekBar Q(l8p l8pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RangeSeekBar) ipChange.ipc$dispatch("5f1312da", new Object[]{l8pVar});
        }
        return l8pVar.i;
    }

    public static /* synthetic */ void R(l8p l8pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55304859", new Object[]{l8pVar, new Integer(i)});
        } else {
            l8pVar.j0(i);
        }
    }

    private boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a7b9fc1", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableFixSeekBarTouch", false);
    }

    private void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543ed13c", new Object[]{this});
            return;
        }
        if (this.l == null) {
            this.l = this.h.findViewById(R.id.time_layout);
            this.j = (TextView) this.h.findViewById(R.id.total_time);
            this.k = (TextView) this.h.findViewById(R.id.current_time);
        }
        if (this.l == null) {
            View d = qrp.d(this.b.getContext());
            this.l = d;
            this.j = (TextView) d.findViewById(R.id.total_time);
            this.k = (TextView) d.findViewById(R.id.current_time);
            this.h.addView(d, 0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams.addRule(3, R.id.time_layout);
            this.i.setLayoutParams(layoutParams);
        }
    }

    private Pair<Integer, Integer> c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bee92b33", new Object[]{this});
        }
        try {
            return n0();
        } catch (Throwable th) {
            ir9.c("SeekBarLayer", "", th);
            int c2 = pr9.c(p91.a(), 20);
            return Pair.create(Integer.valueOf(c2), Integer.valueOf(c2));
        }
    }

    private long f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("743a475e", new Object[]{this})).longValue();
        }
        long orangeLongConfig = FluidSDK.getRemoteConfigAdapter().getOrangeLongConfig("translateSeekBarToFollowTabBarDelayTime", 150L);
        if (orangeLongConfig >= 0) {
            return orangeLongConfig;
        }
        return 150L;
    }

    private boolean h0(FluidContext fluidContext) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45dd95c3", new Object[]{this, fluidContext})).booleanValue();
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j == null || j.G == null) {
            return false;
        }
        Map<String, Object> i = j.i();
        ir9.b("SeekBarLayer", "halfscreen isNewGuide, halfScreenConfigAndroid=" + i);
        if (i == null) {
            return false;
        }
        boolean o = nwv.o(i.get("enable"), false);
        if (j.J != null) {
            z = false;
        } else {
            z = nwv.o(i.get("enableNewGuide"), false);
        }
        if (o || !z) {
            z2 = false;
        }
        return z2;
    }

    public static /* synthetic */ Object ipc$super(l8p l8pVar, String str, Object... objArr) {
        if (str.hashCode() == 573675291) {
            super.onBindData((uq9) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue(), (List) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/seekbar/SeekBarLayer");
    }

    private void j0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d620894", new Object[]{this, new Integer(i)});
        } else if (i != this.A) {
            this.A = i;
            for (c cVar : this.B.b()) {
                try {
                    cVar.l(i);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.b, cVar, "notifyProgressBarBottomLocChange", e);
                }
            }
        }
    }

    private void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        } else {
            this.f.F0().addVideoPlayerListener(this);
        }
    }

    private void y0(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a75fd76", new Object[]{this, new Boolean(z)});
        } else if (b93.n(this.b)) {
            ir9.b("SeekBarLayer", "命中竖版UI, 不处理进度条位置");
        } else if (this.h == null || this.n == z) {
            ir9.b("SeekBarLayer", "进度条位置不变, 不处理进度条位置");
        } else if (!f2k.d(this.b) && !hn4.o(this.b)) {
            ir9.b("SeekBarLayer", "未命中导购框架或新版UI, 不处理进度条位置");
        } else if (!pto.i(this.f.U())) {
            ir9.b("SeekBarLayer", "未命中沉浸式, 不处理进度条位置");
        } else {
            int M = this.f.M();
            if (!h0(this.f.U()) || M != 0) {
                this.n = z;
                long f0 = f0();
                int i = p91.i();
                int a0 = f2k.d(this.b) ? i - this.f.a0() : i;
                this.h.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
                if (layoutParams != null) {
                    if (this.n) {
                        ((FrameLayout.LayoutParams) layoutParams).bottomMargin += a0;
                    } else {
                        ((FrameLayout.LayoutParams) layoutParams).bottomMargin -= a0;
                    }
                    this.h.setLayoutParams(layoutParams);
                }
                ir9.b("SeekBarLayer", "VSMSG_progressChanged，隐藏 & 更改新位置 :" + this.n + "; delayTime=" + f0 + "ms, position=" + M + "; " + o83.b(this.f) + "; bottomTabBarHeight=" + i + "; change=" + a0);
                if (this.n) {
                    str = "up";
                } else {
                    str = "down";
                }
                this.o = str;
                oqi.b(this.f.U(), this.o, this.f.Y());
                prp.mHandler.postDelayed(new b(M), f0);
                return;
            }
            ir9.b("SeekBarLayer", "isNewGuide 首坑、开启新样式，不处理进度条位置");
        }
    }

    public void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709801cd", new Object[]{this, new Boolean(z)});
        } else {
            B0(z, this.v, this.y);
        }
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "SeekBarLayer";
    }

    @Override // tb.itk
    public void I(RangeSeekBar rangeSeekBar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ee0930", new Object[]{this, rangeSeekBar, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        this.e.I(rangeSeekBar, f, f2, z);
        U();
        if (this.l.getVisibility() == 0) {
            this.k.setText(vt6.f((int) f));
        }
    }

    public void S(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4bb074", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.B.a(cVar);
        }
    }

    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a7fb129", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df14e90a", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public int X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55dec815", new Object[]{this})).intValue();
        }
        return this.A;
    }

    public View Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bb64b58e", new Object[]{this});
        }
        return this.i;
    }

    public god Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (god) ipChange.ipc$dispatch("b4ee2356", new Object[]{this});
        }
        return this.e;
    }

    public String a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc1c161f", new Object[]{this});
        }
        return this.o;
    }

    public int b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d80bc51", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public View d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93b86117", new Object[]{this});
        }
        return this.h;
    }

    public int e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cea758d5", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4db8fb53", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public void l0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784f607", new Object[]{this});
            return;
        }
        RangeSeekBar rangeSeekBar = this.i;
        if (rangeSeekBar != null && (i = this.r) > 0 && !this.m && this.p > 1000) {
            rangeSeekBar.setProgress(i);
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.s(this.f);
        s19.d(this.f, "complete");
    }

    public void m0(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ff6e1", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.B.e(cVar);
        }
    }

    public void o0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca26a99", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        View d0 = d0();
        if (!this.f.j0()) {
            i2 = 8;
        }
        ahw.b(d0, i2);
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        this.h = (ViewGroup) recyclerViewHolder.itemView.findViewById(R.id.seek_bar_layout);
        RangeSeekBar rangeSeekBar = (RangeSeekBar) recyclerViewHolder.itemView.findViewById(R.id.seek_bar);
        this.i = rangeSeekBar;
        rangeSeekBar.addOnLayoutChangeListener(new a());
        if (this.i != null && f2k.d(this.b)) {
            this.i.updateProgressDefaultColor(Color.parseColor("#1AFFFFFF"));
        }
        g0(recyclerViewHolder);
    }

    @Override // tb.f9e
    public void onLoopCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a263b7", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onPreCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b35d58", new Object[]{this, uq9Var});
        } else {
            l0();
        }
    }

    @Override // tb.f9e
    public void onVideoClose(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b040494", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoComplete(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8488480d", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.f9e
    public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.f9e
    public void onVideoPause(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
        }
    }

    @Override // tb.f9e
    public void onVideoPlay(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoPrepared(uq9 uq9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
        }
    }

    @Override // tb.f9e
    public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.f9e
    public void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0fc2b5", new Object[]{this, uq9Var, dWVideoScreenType});
        }
    }

    @Override // tb.f9e
    public void onVideoSeekTo(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i)});
        }
    }

    @Override // tb.f9e
    public void onVideoStart(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoStateChanged(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4492ac", new Object[]{this, uq9Var, new Integer(i)});
        }
    }

    public void p0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddbdbd8", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void q0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105bb8", new Object[]{this, new Integer(i)});
        } else if (this.k != null && this.l.getVisibility() == 0) {
            this.k.setText(vt6.f(i));
        }
    }

    public Pair<Integer, Integer> s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("eb9a749b", new Object[]{this});
        }
        boolean x = b93.x(this.f.U());
        Pair<Integer, Integer> c0 = c0();
        if (this.f.x1().R() == null) {
            return c0;
        }
        int intValue = ((Integer) c0.first).intValue();
        int intValue2 = ((Integer) c0.second).intValue();
        if (x) {
            intValue = pr9.q(70);
            intValue2 = intValue;
        }
        return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
    }

    public void t0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0433e32", new Object[]{this, new Float(f)});
            return;
        }
        RangeSeekBar rangeSeekBar = this.i;
        if (rangeSeekBar != null) {
            rangeSeekBar.setProgress(f);
        }
    }

    public void u0(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fa17ea", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        RangeSeekBar rangeSeekBar = this.i;
        if (rangeSeekBar != null) {
            rangeSeekBar.setRange(f, f2);
        }
    }

    @Override // tb.fjc
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2907857", new Object[]{this});
        }
    }

    public void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989fbea8", new Object[]{this, new Boolean(z)});
            return;
        }
        RangeSeekBar rangeSeekBar = this.i;
        if (rangeSeekBar != null) {
            rangeSeekBar.setThumbEnabled(z);
        }
    }

    public void w0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6fb86d", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    @Override // tb.fjc
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41b2f79", new Object[]{this});
        } else if (this.f.n1().getDWInstance() != null) {
            if (this.f.n1().getDWInstance().getVideoState() == 2) {
                this.i.setThumbEnabled(true);
            }
            xau.r(this.f.U(), this.f.t1().c().o());
        }
    }

    public void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cbcacd", new Object[]{this, new Integer(i)});
            return;
        }
        this.s = i;
        if (this.j != null && this.l.getVisibility() == 0) {
            this.j.setText(vt6.f(i));
        }
    }

    public void z0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea53fcbd", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        q0(i);
        x0(i2);
    }

    private void g0(RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6afa8e", new Object[]{this, recyclerViewHolder});
            return;
        }
        this.z = b93.x(this.f.U());
        Pair<Integer, Integer> s0 = s0();
        int intValue = ((Integer) s0.first).intValue();
        int intValue2 = ((Integer) s0.second).intValue();
        if (!b93.u()) {
            if (pto.h(this.f.U()) || T()) {
                this.h.setTranslationZ(1.0f);
            } else {
                this.h.setTranslationZ(0.0f);
            }
        }
        this.i.setProgressHeight(this.v);
        if (b93.n(this.b) || this.z) {
            this.i.setThumbProgressHeight(this.v);
        } else {
            this.i.setThumbProgressHeight(pr9.q(2));
        }
        int q = pr9.q(24);
        this.i.setPadding(q, intValue, q, intValue2);
        this.i.getLeftSeekBar().H(this.v);
        this.i.getLeftSeekBar().F(this.v);
        this.i.setOnRangeChangedListener(this);
        ir9.b("SeekBarLayer", "添加底部状态监听; " + this.c.X());
        this.g.addNavigationShowHideStatusListener(this);
        this.f.t1().c().a(this);
    }

    @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.d
    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a4f1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b("SeekBarLayer", "onNavigationShowHideStatusChanged isHideStatus=" + z + " ; " + this.c.X());
        y0(z ^ true);
    }

    @Override // tb.itk
    public void m(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca2b081", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.e.m(rangeSeekBar, z);
        this.m = false;
        this.l.setVisibility(8);
        int i = this.v;
        B0(false, i, i);
        if (!(this.f.n1().getDWInstance() == null || rangeSeekBar == null)) {
            int progress = rangeSeekBar.getProgress();
            this.f.n1().getDWInstance().seekTo(progress);
            this.f.n1().getDWInstance().playVideo();
            xau.k(this.f.U(), this.t, progress);
            this.t = 0;
        }
        b5w.F(this.f, "seekEnd");
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        } else {
            super.onBindData(uq9Var, aVar, i, list);
        }
    }

    private Pair<Integer, Integer> n0() throws Exception {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9b4df0bd", new Object[]{this});
        }
        String[] split = FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("seekBarPaddingVertical", "17,17").split(",");
        int c2 = lak.c(split[0]);
        int c3 = lak.c(split[1]);
        if (c2 < 0) {
            i = pr9.c(p91.a(), 20);
        } else {
            i = pr9.q(c2);
        }
        if (c3 < 0) {
            i2 = pr9.c(p91.a(), 20);
        } else {
            i2 = pr9.q(c3);
        }
        return Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // tb.itk
    public void G(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5ae2ff", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.e.G(rangeSeekBar, z);
        this.m = true;
        U();
        B0(true, this.w, this.x);
        if (rangeSeekBar != null) {
            this.t = rangeSeekBar.getProgress();
        }
        this.l.setVisibility(0);
        x0(this.s);
        xau.P(this.f.U(), this.f.n1().isPlaying());
        b5w.F(this.f, "seekBegin");
    }

    private void r0(FrameLayout.LayoutParams layoutParams, int i, int i2) {
        int i3;
        String str;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a5894f", new Object[]{this, layoutParams, new Integer(i), new Integer(i2)});
            return;
        }
        int e0 = this.f.e0();
        if (pto.i(this.b)) {
            IHostAppService iHostAppService = (IHostAppService) this.b.getService(IHostAppService.class);
            boolean z = iHostAppService != null && iHostAppService.isTabBarHide();
            if (z) {
                int a0 = this.f.a0();
                i3 = e0 + a0;
                layoutParams.bottomMargin = (i3 - (i / 2)) - i2;
                this.n = false;
                i4 = a0;
            } else {
                layoutParams.bottomMargin = ((p91.i() + e0) - (i / 2)) - i2;
                this.n = true;
                i3 = e0;
            }
            ir9.b("SeekBarLayer", "setSeekBarMarginBottomOnNewUI, isHideStatus=" + z + ", videoBottomGap=" + e0 + ", progressBarBottomGapMore=" + i4 + ", bottom=" + i3 + ", bottomMargin=" + layoutParams.bottomMargin);
            if (this.n) {
                str = "up";
            } else {
                str = "down";
            }
            this.o = str;
            oqi.b(this.b, str, this.f.Y());
            return;
        }
        if (!pto.q(this.b)) {
            i4 = this.f.a0();
        }
        int i5 = e0 + i4;
        layoutParams.bottomMargin = (i5 - (i / 2)) - i2;
        ir9.b("SeekBarLayer", "setSeekBarMarginBottomOnNewUI, videoBottomGap=" + e0 + ", progressBarBottomGapMore=" + i4 + ", bottom=" + i5 + ", bottomMargin=" + layoutParams.bottomMargin);
    }

    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb842e66", new Object[]{this});
            return;
        }
        boolean x = b93.x(this.f.U());
        Pair<Integer, Integer> s0 = s0();
        ((Integer) s0.first).intValue();
        int intValue = ((Integer) s0.second).intValue();
        this.u = intValue;
        if (this.f.x1().R() != null) {
            int i = this.v;
            ViewGroup viewGroup = (ViewGroup) this.f.x1().R().findViewById(R.id.seek_bar_layout);
            this.h = viewGroup;
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                int M = this.f.M();
                int weexActionBarHeight = ((IContainerService) this.b.getService(IContainerService.class)).getWeexActionBarHeight();
                boolean p = this.f.D1().p();
                if (f2k.d(this.b)) {
                    r0(layoutParams, i, intValue);
                } else if (b93.n(this.b)) {
                    layoutParams.bottomMargin = (weexActionBarHeight - (i / 2)) - intValue;
                } else {
                    String str = "down";
                    if (hn4.o(this.b)) {
                        ir9.b("SeekBarLayer", "更新第" + M + "卡进度条的底部边距，bottomMargin：" + layoutParams.bottomMargin + "，actionbarHeight：" + weexActionBarHeight + "，size：" + i + "，seekBarPaddingBottom：" + intValue + "，bottomTabBarHeight：" + p91.i());
                        if (pto.i(this.f.U())) {
                            boolean isTabBarHide = ((IHostAppService) this.f.U().getService(IHostAppService.class)).isTabBarHide();
                            boolean z = h0(this.f.U()) && M == 0;
                            ir9.b("SeekBarLayer", "第" + M + "卡进度条，isNewGuideAnd0po=" + z + " isHideStatus=" + isTabBarHide);
                            if (!isTabBarHide || z) {
                                layoutParams.bottomMargin = ((p91.i() + weexActionBarHeight) - (i / 2)) - intValue;
                                this.n = true;
                            } else {
                                layoutParams.bottomMargin = (weexActionBarHeight - (i / 2)) - intValue;
                                this.n = false;
                            }
                            ir9.b("SeekBarLayer", "VSMSG_progressChanged，mSeekBarLayer.isSeekBarLocatedUp=" + this.n + " position=" + this.f.M() + "; " + o83.b(this.f));
                            if (this.n) {
                                str = "up";
                            }
                            this.o = str;
                            oqi.b(this.f.U(), this.o, this.f.Y());
                        } else {
                            layoutParams.bottomMargin = (weexActionBarHeight - (i / 2)) - intValue;
                        }
                        ir9.b("SeekBarLayer", "第" + M + "卡进度条的底部边距更新完成，bottomMargin：" + layoutParams.bottomMargin);
                    } else if (weexActionBarHeight > 0) {
                        if (p) {
                            layoutParams.bottomMargin = ((p91.i() + weexActionBarHeight) - (i / 2)) - intValue;
                            this.n = true;
                            ir9.b("SeekBarLayer", "VSMSG_progressChanged，isSecondPageUpBar,isSeekBarLocatedUp=true,position=" + this.f.M() + "; " + o83.b(this.f));
                        } else {
                            this.n = false;
                            layoutParams.bottomMargin = (weexActionBarHeight - (i / 2)) - intValue;
                        }
                        if (this.n) {
                            str = "up";
                        }
                        this.o = str;
                        oqi.b(this.f.U(), this.o, this.f.Y());
                    } else if (x) {
                        layoutParams.bottomMargin = (-intValue) - (i / 2);
                    } else {
                        layoutParams.bottomMargin = (pr9.q(70) - intValue) - (i / 2);
                    }
                }
                this.h.setLayoutParams(layoutParams);
            }
        }
    }
}
