package tb;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.minivideo.MiniVideoType;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragLayout;
import com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView;
import com.taobao.android.detail.ttdetail.widget.video.BizMiniVideoView;
import com.taobao.android.detail.ttdetail.widget.video.MiniVideoView;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zui implements ktc<d8n, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f33021a;
    public final ze7 b;
    public List<tx9> c;
    public DragLayout d;
    public AbsMiniVideoView e;
    public ViewGroup f;
    public String g;
    public String h;
    public volatile boolean i;
    public MiniVideoType j;
    public volatile boolean k;
    public List<r4q> l;
    public boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ksk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ksk
        public void a(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f950e69", new Object[]{this, view, str});
                return;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            q84.f(zui.a(zui.this), new ShowLightOffMessage(ShowLightOffMessage.Source.MINI_VIDEO, str, new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight())));
            zui.b(zui.this, "FloatingVideo");
        }

        @Override // tb.ksk
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e040c46", new Object[]{this, view});
            } else {
                zui.c(zui.this);
            }
        }

        @Override // tb.ksk
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ksk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ksk
        public void a(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f950e69", new Object[]{this, view, str});
            }
        }

        @Override // tb.ksk
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e040c46", new Object[]{this, view});
            } else {
                zui.c(zui.this);
            }
        }

        @Override // tb.ksk
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (zui.d(zui.this) == null || zui.d(zui.this).isEmpty()) {
                zui.this.m();
            } else {
                zui.e(zui.this);
                zui.f(zui.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f33024a;

        public c(ViewGroup viewGroup) {
            this.f33024a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f33024a.removeView(zui.g(zui.this));
            }
        }
    }

    static {
        t2o.a(912262079);
        t2o.a(912261361);
    }

    public zui(Context context, ze7 ze7Var) {
        this.f33021a = context;
        this.b = ze7Var;
        s(context);
        q84.h(context, d8n.class, this);
    }

    public static /* synthetic */ Context a(zui zuiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("58de6da7", new Object[]{zuiVar});
        }
        return zuiVar.f33021a;
    }

    public static /* synthetic */ void b(zui zuiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32882d8", new Object[]{zuiVar, str});
        } else {
            zuiVar.v(str);
        }
    }

    public static /* synthetic */ void c(zui zuiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a33d56d", new Object[]{zuiVar});
        } else {
            zuiVar.l();
        }
    }

    public static /* synthetic */ List d(zui zuiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a12fe67b", new Object[]{zuiVar});
        }
        return zuiVar.c;
    }

    public static /* synthetic */ void e(zui zuiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec93f2b", new Object[]{zuiVar});
        } else {
            zuiVar.D();
        }
    }

    public static /* synthetic */ void f(zui zuiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f113f40a", new Object[]{zuiVar});
        } else {
            zuiVar.h();
        }
    }

    public static /* synthetic */ DragLayout g(zui zuiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragLayout) ipChange.ipc$dispatch("cff69503", new Object[]{zuiVar});
        }
        return zuiVar.d;
    }

    public void A(wua wuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58ebb99", new Object[]{this, wuaVar});
            return;
        }
        this.l = null;
        this.c = null;
        this.h = rcw.a(o("videoUrl"), o("videoId"));
        if (wuaVar != null) {
            try {
                if (!rcw.n(this.f33021a)) {
                    List<r4q> w = wuaVar.w();
                    if (w != null && !w.isEmpty()) {
                        this.l = w;
                        C();
                    }
                    List<tx9> x = wuaVar.x();
                    if (x != null && !x.isEmpty()) {
                        this.c = x;
                        if (this.l == null) {
                            D();
                        }
                    }
                    this.j = MiniVideoType.INDEPENDENT;
                    h();
                }
            } finally {
                h();
            }
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (t() && this.f != null && this.d.getParent() == this.f) {
            this.d.setVisibility(0);
            if (this.i) {
                this.i = false;
                AbsMiniVideoView absMiniVideoView = this.e;
                if (absMiniVideoView != null) {
                    absMiniVideoView.playWithUniqueIdentifier(this.g);
                }
            }
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592746dd", new Object[]{this});
            return;
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null) {
            absMiniVideoView.detachVideoView();
        }
        this.e = new BizMiniVideoView(this.f33021a);
        r();
        this.m = false;
        this.e.setOnMiniVideoListener(new b());
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767f75ed", new Object[]{this});
            return;
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null) {
            absMiniVideoView.detachVideoView();
        }
        this.e = new MiniVideoView(this.f33021a);
        r();
        this.m = true;
        this.e.setOnMiniVideoListener(new a());
    }

    public void j(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd03736f", new Object[]{this, viewGroup});
        } else {
            this.f = viewGroup;
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba09c3b2", new Object[]{this, str});
            return;
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null) {
            absMiniVideoView.attachVideoLastFrame(str);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce195d3", new Object[]{this});
            return;
        }
        m();
        v("FloatingVideo_Close");
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.k = false;
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null) {
            absMiniVideoView.detachVideoView();
        }
        ViewParent parent = this.d.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.isInLayout()) {
                this.b.h().g(new c(viewGroup));
            } else {
                viewGroup.removeView(this.d);
            }
        }
        q84.k(this.f33021a, this);
    }

    public Rect n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f682b1e3", new Object[]{this});
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView == null || absMiniVideoView.getWindowToken() == null) {
            return null;
        }
        return this.e.getContentScreenRect();
    }

    public final String o(String str) {
        Map<String, String> videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("439c25bc", new Object[]{this, str});
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView == null || (videoInfo = absMiniVideoView.getVideoInfo()) == null) {
            return null;
        }
        return videoInfo.get(str);
    }

    public boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f5ebeda", new Object[]{this, str})).booleanValue();
        }
        List<tx9> list = this.c;
        if (list != null && !list.isEmpty()) {
            for (tx9 tx9Var : this.c) {
                if (TextUtils.equals(str, tx9Var.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (t() && this.f != null && this.d.getParent() == this.f) {
            this.d.setVisibility(8);
            this.g = rcw.a(o("videoUrl"), o("videoId"));
            AbsMiniVideoView absMiniVideoView = this.e;
            if (absMiniVideoView != null) {
                this.i = absMiniVideoView.pause();
            }
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5a6000", new Object[]{this});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 53;
        layoutParams.topMargin = mr7.a(196.0f);
        this.e.setWindowRatio(3.75f);
        this.d.removeAllViews();
        this.d.addView(this.e, layoutParams);
        this.d.setTargetView(this.e);
    }

    public final void s(Context context) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        PreRenderManager g = PreRenderManager.g(context);
        if (g != null) {
            view = g.j(context, R.layout.tt_detail_mini_video_drag_wrapper, null, true);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.tt_detail_mini_video_drag_wrapper, (ViewGroup) null);
        }
        this.d = (DragLayout) view.findViewById(R.id.dl_mini_video_drag_container);
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a06248b", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean u(MiniVideoType miniVideoType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("618ec05a", new Object[]{this, miniVideoType})).booleanValue();
        }
        if (!t() || miniVideoType != this.j) {
            return false;
        }
        return true;
    }

    public final void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794650a5", new Object[]{this, str});
            return;
        }
        JSONObject c2 = UtUtils.c(this.b.e());
        c2.put(xau.PROPERTY_VIDEO_ID, (Object) o("videoId"));
        UtUtils.h(2101, str, c2);
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else if (t() && this.f != null && this.d.getParent() == this.f) {
            this.g = rcw.a(o("videoUrl"), o("videoId"));
            AbsMiniVideoView absMiniVideoView = this.e;
            if (absMiniVideoView != null) {
                this.i = absMiniVideoView.pause();
            }
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ea904c", new Object[]{this, str});
            return;
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null) {
            absMiniVideoView.playWithUniqueIdentifier(str);
        }
    }

    /* renamed from: y */
    public Boolean i(d8n d8nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c60ea559", new Object[]{this, d8nVar});
        }
        return Boolean.valueOf(u(d8nVar.e()));
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566f1dd5", new Object[]{this});
        } else if (t() && this.f != null && this.d.getParent() == this.f && this.i) {
            this.i = false;
            AbsMiniVideoView absMiniVideoView = this.e;
            if (absMiniVideoView != null) {
                absMiniVideoView.playWithUniqueIdentifier(this.g);
            }
        }
    }

    public final void h() {
        Object obj;
        JSONObject trackParams;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982be1ef", new Object[]{this});
            return;
        }
        if (!((this.l == null && this.c == null) || this.f == null)) {
            z = true;
        }
        this.k = z;
        if (!t()) {
            m();
            return;
        }
        q84.h(this.f33021a, d8n.class, this);
        ViewParent parent = this.d.getParent();
        if (parent != this.f) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.d);
            }
            this.f.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        }
        AbsMiniVideoView absMiniVideoView = this.e;
        if (absMiniVideoView != null) {
            absMiniVideoView.bindDetailContext(this.b);
            AbsMiniVideoView absMiniVideoView2 = this.e;
            if (this.m) {
                obj = this.c;
            } else {
                obj = this.l;
            }
            absMiniVideoView2.setVideoData(obj);
            this.e.playWithUniqueIdentifier(this.h);
            JSONObject c2 = UtUtils.c(this.b.e());
            c2.put(xau.PROPERTY_VIDEO_ID, (Object) o("videoId"));
            if (!this.m && (trackParams = this.e.getTrackParams()) != null && !trackParams.isEmpty()) {
                c2.putAll(trackParams);
            }
            UtUtils.h(2201, "FloatingVideo", c2);
        }
    }
}
