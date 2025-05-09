package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.media.frame.DimensionEnum;
import com.taobao.android.detail2.core.framework.base.widget.MaskImageView;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.g9e;
import tb.udi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class faw<T extends g9e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19150a;
    public final dh7 b;
    public ue7 c;
    public T d;
    public btb e;
    public udi.a f;
    public boolean h;
    public final cxj i;
    public qrc j;
    public final ViewGroup k;
    public final ImageView l;
    public final MaskImageView m;
    public final ImageView n;
    public final RoundRectCardRoot o;
    public final View p;
    public final View q;
    public final j83 s;
    public String v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;
    public final List<JSONObject> r = new ArrayList();
    public boolean t = false;
    public int u = 0;
    public final aub B = new f();
    public final j7c g = new a();
    public g A = B();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements j7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.j7c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7297cfdc", new Object[]{this});
                return;
            }
            faw fawVar = faw.this;
            fawVar.h = false;
            btb btbVar = fawVar.e;
            if (btbVar != null) {
                if (btbVar.getView() != null && (faw.this.e.getView().getParent() instanceof ViewGroup)) {
                    ((ViewGroup) faw.this.e.getView().getParent()).removeView(faw.this.e.getView());
                }
                faw fawVar2 = faw.this;
                btb btbVar2 = fawVar2.e;
                qrc qrcVar = fawVar2.j;
                btbVar2.f(qrcVar.d, qrcVar.c);
                faw fawVar3 = faw.this;
                faw.a(fawVar3, fawVar3.e.getView());
                if (faw.this.e.getVideoState() != 1 && faw.this.e.getVideoState() == 2) {
                    faw.this.e.playVideo();
                    faw.this.w = true;
                }
            }
        }

        @Override // tb.j7c
        public btb b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (btb) ipChange.ipc$dispatch("2945bf7", new Object[]{this});
            }
            return faw.this.e;
        }

        @Override // tb.j7c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b23014e", new Object[]{this});
            } else {
                faw.this.h = true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                return false;
            }
            udi.a aVar = faw.this.f;
            if (aVar != null) {
                aVar.c(succPhenixEvent, true);
            }
            if (succPhenixEvent.getDrawable() != null) {
                faw.this.n.setImageDrawable(succPhenixEvent.getDrawable());
            }
            faw.b(faw.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19153a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f19153a = str;
            this.b = str2;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            cxj cxjVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            String str = "phenixCode:";
            if (failPhenixEvent != null) {
                str = str + failPhenixEvent.getHttpCode();
            }
            if (this.f19153a != null) {
                nyj.z().K(this.b, "errMsg", "videoCoverFail;code:" + str, this.f19153a);
                nyj.z().u(this.b, this.f19153a, "loadVideoCover", false);
            }
            cxj cxjVar2 = faw.this.i;
            if (cxjVar2 != null) {
                cxjVar2.c();
            }
            if (failPhenixEvent == null) {
                return false;
            }
            faw fawVar = faw.this;
            ue7 ue7Var = fawVar.c;
            if (!(ue7Var == null || ue7Var.f31127a != 0 || (cxjVar = fawVar.i) == null)) {
                q0j.a(cxjVar.h(), "NPicFail", "phenix");
            }
            txj.f(txj.TAG_MEDIA_CONTROLLER, "封面图加载失败 index=" + faw.this.c.f31127a + ", url: " + failPhenixEvent.getUrl(), null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19154a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public d(String str, String str2, String str3) {
            this.f19154a = str;
            this.b = str2;
            this.c = str3;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                if (this.f19154a != null) {
                    nyj.z().K(this.b, "errMsg", "videoCoverSuc;eventIsNull", this.f19154a);
                    nyj.z().u(this.b, this.f19154a, "loadVideoCover", false);
                    cxj cxjVar = faw.this.i;
                    if (cxjVar != null) {
                        cxjVar.c();
                    }
                }
                return false;
            }
            String str = this.c;
            if (str != null && !str.equals(faw.this.v)) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                faw.this.v = this.c;
                if (this.f19154a != null) {
                    nyj.z().K(this.b, nyj.KEY_RESULT_MSG, "videoCoverSuc;success", this.f19154a);
                }
                udi.a aVar = faw.this.f;
                if (aVar != null) {
                    aVar.c(succPhenixEvent, false);
                }
                if (drawable != null) {
                    faw.this.l.setImageDrawable(drawable);
                    txj.e(txj.TAG_RENDER, "视频封面图设置成功, width: " + faw.this.l.getWidth() + faw.this.l);
                    ViewGroup viewGroup = faw.this.k;
                    if (viewGroup != null) {
                        viewGroup.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                        txj.e(txj.TAG_TIP, "cover APM token tagsuccess");
                    }
                }
            } else if (this.f19154a != null) {
                nyj.z().K(this.b, "errMsg", "videoCoverSuc;videoThumbnailErr", this.f19154a);
                nyj.z().u(this.b, this.f19154a, "loadVideoCover", false);
            }
            cxj cxjVar2 = faw.this.i;
            if (cxjVar2 != null) {
                cxjVar2.c();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            ue7 ue7Var = faw.this.c;
            if (ue7Var == null || ue7Var.f31127a != 0 || ue7Var.A) {
                txj.e(txj.TAG_MEDIA_CONTROLLER, faw.this.c.f31127a + "getStartTime:" + faw.this.x);
                return faw.this.x;
            }
            txj.e(txj.TAG_MEDIA_CONTROLLER, faw.this.c.f31127a + "getNavStartTime:" + faw.this.c.C().R().g);
            return faw.this.c.C().R().g;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements aub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.aub
        public void onLoopCompletion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isLoopCompletion", (Object) "true");
            faw.this.q(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g implements zxc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final faw f19157a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g.this.f19157a.s();
                btb btbVar = g.this.f19157a.e;
                if (!(btbVar == null || btbVar.getView() == null || !g.this.f19157a.i.m().h0())) {
                    g.this.f19157a.e.getView().setAlpha(1.0f);
                }
                txj.f(txj.TAG_MEDIA_CONTROLLER, "coverViewGoneVideo 隐藏mCoverImageView延迟", null);
            }
        }

        static {
            t2o.a(352321666);
            t2o.a(352321650);
        }

        public g(faw fawVar) {
            this.f19157a = fawVar;
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62b5c214", new Object[]{this});
            } else {
                this.f19157a.l.postDelayed(new a(), 30L);
            }
        }

        @Override // tb.zxc
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoClose", null);
            }
        }

        @Override // tb.zxc
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                this.f19157a.q(null);
            }
        }

        @Override // tb.zxc
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoPause", null);
            }
        }

        @Override // tb.zxc
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            } else {
                txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoScreenChanged", null);
            }
        }

        @Override // tb.zxc
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else {
                txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoSeekTo", null);
            }
        }

        @Override // tb.zxc
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                return;
            }
            txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoInfo what=" + j, null);
            if (3 == j) {
                ViewGroup viewGroup = this.f19157a.k;
                if (viewGroup != null) {
                    viewGroup.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                    txj.e(txj.TAG_TIP, "NdApmToken: onVideoInfo , ndTagSuccess ");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("firstFrameTime", (Object) Long.valueOf(System.currentTimeMillis()));
                this.f19157a.P("firstvideoframe", jSONObject, true);
                a();
                udi.a aVar = this.f19157a.f;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        @Override // tb.zxc
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoPlay", null);
            this.f19157a.P("playing", new JSONObject(), true);
            this.f19157a.g(true);
        }

        @Override // tb.zxc
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoPrepared", null);
            this.f19157a.P("prepared", new JSONObject(), true);
        }

        @Override // tb.zxc
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            faw fawVar = this.f19157a;
            int i4 = fawVar.u;
            if (i4 == 0 || i < i4 || i - i4 >= 300 || i == i3) {
                fawVar.u = i;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("totalPlayTime", (Object) Integer.valueOf(i3));
                jSONObject.put("duration", (Object) Integer.valueOf(i3));
                jSONObject.put(tmu.CURRENT_TIME, (Object) Integer.valueOf(i));
                this.f19157a.P("timeupdate", jSONObject, false);
                txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoProgressChanged currentPosition=" + i + "，bufferPercent=" + i2 + "，total=" + i3 + ",lastMsgPosition=" + this.f19157a.u, null);
            }
        }

        @Override // tb.zxc
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoError", null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) String.valueOf(i));
            jSONObject.put("subErrCode", (Object) String.valueOf(i2));
            this.f19157a.P("error", jSONObject, true);
            this.f19157a.l.setVisibility(0);
        }

        @Override // tb.zxc
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoStart", null);
            this.f19157a.P("playing", new JSONObject(), true);
            this.f19157a.g(true);
            this.f19157a.u = 0;
        }
    }

    static {
        t2o.a(352321659);
    }

    public faw(cxj cxjVar, dh7 dh7Var, ViewGroup viewGroup, j83 j83Var) {
        this.i = cxjVar;
        Activity i = cxjVar.i();
        this.f19150a = i;
        this.b = dh7Var;
        this.k = (ViewGroup) viewGroup.findViewById(R.id.video_host);
        this.l = new ImageView(i);
        this.n = (ImageView) viewGroup.findViewById(R.id.iv_blur);
        this.m = (MaskImageView) viewGroup.findViewById(R.id.mask_iv_blur);
        this.o = (RoundRectCardRoot) viewGroup.findViewById(R.id.iv_blur_round_rect);
        this.p = viewGroup.findViewById(R.id.iv_blur_mask);
        this.q = viewGroup.findViewById(R.id.imv_play_public_pause);
        this.s = j83Var;
    }

    public static /* synthetic */ void a(faw fawVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2318407f", new Object[]{fawVar, view});
        } else {
            fawVar.D(view);
        }
    }

    public static /* synthetic */ void b(faw fawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35590b52", new Object[]{fawVar});
        } else {
            fawVar.v();
        }
    }

    public abstract btb A();

    public abstract g B();

    public final void C(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3655aaf2", new Object[]{this, view});
        } else if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public void E(ue7 ue7Var, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("becc5d27", new Object[]{this, ue7Var, t});
            return;
        }
        this.c = ue7Var;
        this.d = t;
    }

    public void F() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff7b6dc", new Object[]{this});
            return;
        }
        qrc a2 = cbw.a(this.i, this.c, this.d, this.s.r(), this.s.t());
        this.j = a2;
        this.l.setScaleType(a2.h);
        ue7 ue7Var = this.c;
        if (ue7Var != null) {
            z = ue7Var.Q0();
        }
        String d2 = hsm.d(this.f19150a, this.d.e(), z);
        S(d2, z);
        D(this.l);
        t(hsm.j(this.f19150a, this.d.e()));
        txj.e(txj.TAG_RENDER, "onFillCover: " + d2);
    }

    public void G(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33d4295", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null && i >= 0) {
            btbVar.seekTo(i);
            if (z) {
                this.e.pauseVideo();
                this.w = false;
            } else {
                this.e.playVideo();
                this.w = true;
            }
            this.u = i;
        }
    }

    public void H(String str) {
        btb btbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4e759e", new Object[]{this, str});
        } else if (!this.h && (btbVar = this.e) != null) {
            btbVar.pauseVideo();
            this.w = false;
            Q(str);
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59827bf9", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            b0();
        } else {
            s();
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            C(btbVar.getView());
            txj.e(txj.TAG_MEDIA_CONTROLLER, "NdVideoRec:DwOnDestroy hCode:" + this.e.hashCode());
            this.e.destroy();
            this.e = null;
        }
    }

    public void L(String str) {
        btb btbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5bc434", new Object[]{this, str});
        } else if (!this.h && (btbVar = this.e) != null) {
            btbVar.pauseVideo();
            this.w = false;
            Q(str);
        }
    }

    public void M(HashMap<String, String> hashMap) {
        btb btbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40d69e8", new Object[]{this, hashMap});
        } else if (hashMap != null && (btbVar = this.e) != null) {
            btbVar.w(hashMap);
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7cd393", new Object[]{this});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            if (btbVar.getVideoState() != 1) {
                if (!this.z) {
                    this.e.playVideo();
                } else if (this.y) {
                    this.y = false;
                    this.e.start();
                } else {
                    this.e.playVideo();
                }
                this.w = true;
                R("click");
            } else if (oqj.a(this.i)) {
                txj.e(txj.TAG_TIP, "NdMultiWindowUtil:  页面聚焦时间内，且视频播放中，忽略本次视频击事件。");
            } else {
                this.e.pauseVideo();
                this.w = false;
                Q("click");
            }
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9216aa0a", new Object[]{this});
        } else if (!this.t) {
            this.t = true;
            p();
        }
    }

    public void P(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7f3490", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        udi.a aVar = this.f;
        if (aVar == null) {
            return;
        }
        if (this.t) {
            aVar.b(str, jSONObject);
        } else if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) str);
            jSONObject2.put("info", (Object) jSONObject);
            ((ArrayList) this.r).add(jSONObject2);
        }
    }

    public final void S(String str, boolean z) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b750cd0", new Object[]{this, str, new Boolean(z)});
            return;
        }
        cxj cxjVar = this.i;
        if (cxjVar == null || cxjVar.q() != null) {
            str3 = null;
            str2 = null;
        } else {
            str3 = this.i.j().G();
            str2 = nyj.z().e(str3, "loadVideoCover");
            this.i.D(str2);
        }
        s0m.B().T(str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).heightScale(z).succListener(new d(str2, str3, str)).failListener(new c(str2, str3)).fetch();
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            btbVar.setVideoLoop(z);
        }
    }

    public void V(udi.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cda1701", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public void W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            btbVar.mute(z);
        }
    }

    public void X(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ad02c0", new Object[]{this, hashMap});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            btbVar.c(hashMap);
        }
    }

    public void Y(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f2)});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            btbVar.setPlayRate(f2);
        }
    }

    public void Z(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
            return;
        }
        txj.e(txj.TAG_MEDIA_CONTROLLER, this.c.f31127a + "setScrollStartTime: " + j);
        this.x = j;
    }

    public void a0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            btbVar.setVolume(f2);
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0acd86", new Object[]{this});
            return;
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec35db4", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.j == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSize失效，mVideoFrameSizeObject为空");
        } else {
            btb btbVar = this.e;
            if (btbVar == null) {
                txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSize失效，mDWInstance为空");
                return;
            }
            View view = btbVar.getView();
            if (view == null) {
                txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSize失效，mDWInstance.getView()为空");
                return;
            }
            qrc qrcVar = this.j;
            int i3 = (int) (i * (qrcVar.d / qrcVar.c));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSize失效，LayoutParams类型不符");
                return;
            }
            ViewParent parent = view.getParent();
            boolean z = parent instanceof RoundRectCardRoot;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = i3;
            marginLayoutParams.height = i;
            if (!z) {
                marginLayoutParams.topMargin = i2;
            } else {
                ViewGroup.LayoutParams layoutParams2 = ((RoundRectCardRoot) parent).getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
                }
            }
            this.e.f(i3, i);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc354a2", new Object[]{this});
            return;
        }
        ue7 ue7Var = this.c;
        if (ue7Var == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，mItemNode为空");
            return;
        }
        qrc a2 = cbw.a(this.i, ue7Var, this.d, this.s.r(), this.s.t());
        qrc qrcVar = this.j;
        if (qrcVar == null || qrcVar.c != a2.c || qrcVar.d != a2.d || qrcVar.e != a2.e) {
            this.j = a2;
            btb btbVar = this.e;
            if (btbVar == null) {
                txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，mDWInstance为空");
                return;
            }
            View view = btbVar.getView();
            if (view == null) {
                txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，mDWInstance.getView()为空");
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                txj.e(txj.TAG_VIDEO_ZOOM, "adjustVideoSizeWithFrameSize失效，LayoutParams类型不符");
                return;
            }
            ViewParent parent = view.getParent();
            boolean z = parent instanceof RoundRectCardRoot;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            qrc qrcVar2 = this.j;
            marginLayoutParams.width = qrcVar2.d;
            marginLayoutParams.height = qrcVar2.c;
            if (!z) {
                marginLayoutParams.topMargin = qrcVar2.e;
            } else {
                ViewGroup.LayoutParams layoutParams2 = ((RoundRectCardRoot) parent).getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = this.j.e;
                }
            }
            btb btbVar2 = this.e;
            qrc qrcVar3 = this.j;
            btbVar2.f(qrcVar3.d, qrcVar3.c);
            t(hsm.j(this.f19150a, this.d.e()));
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e83d8b", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(Constants.Name.AUTO_PLAY, String.valueOf(z));
        this.e.e(hashMap);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e00746", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_TIP, "NdVideoSettingHelper: appendUtParamsRun.");
        udi.a aVar = this.f;
        if (aVar != null && aVar.e() != null) {
            HashMap<String, String> e2 = this.f.e();
            if (!e2.containsKey("spm-cnt")) {
                e2.put("spm-cnt", "a2141.b8745808");
            }
            if (!e2.containsKey("is_ad")) {
                e2.put("is_ad", "0");
            }
            if (!e2.containsKey("subprodType")) {
                e2.put("subprodType", "");
            }
            if (!e2.containsKey("prodType")) {
                e2.put("prodType", "");
            }
            if (e2.containsKey("cardnum")) {
                e2.put("index", e2.get("cardnum"));
            }
            e2.put("playerScene", "Page_Newdetailvideo");
            e2.put(a7m.VIDEO_PLAY_SCENES, "Page_Newdetailvideo");
            this.e.e(e2);
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65568254", new Object[]{this, new Boolean(z)});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null && btbVar.getVideoState() != 3) {
            if (z) {
                this.q.setVisibility(8);
            } else {
                this.q.setVisibility(0);
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            btbVar.b();
        }
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b71cc9", new Object[]{this})).intValue();
        }
        NewDetailScreenConfig.ScreenType a2 = this.i.j().K().a();
        if (a2 == NewDetailScreenConfig.ScreenType.NORMAL_PHONE || a2 == NewDetailScreenConfig.ScreenType.FOLD_DEVICE_PORTRAIT) {
            return this.i.j().K().j(100);
        }
        return 100;
    }

    public j7c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j7c) ipChange.ipc$dispatch("d96bf11", new Object[]{this});
        }
        return this.g;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b8459e8", new Object[]{this});
        }
        T t = this.d;
        if (t != null) {
            return t.getType();
        }
        return null;
    }

    public qrc m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("3216bef", new Object[]{this});
        }
        return this.j;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cfba7a", new Object[]{this})).intValue();
        }
        btb btbVar = this.e;
        if (btbVar != null) {
            return btbVar.hashCode();
        }
        return -1;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        T t = this.d;
        if (t != null) {
            return t.getVideoId();
        }
        return null;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("436e48d8", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964a6361", new Object[]{this});
            return;
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    public final void t(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ecc464c", new Object[]{this, str});
            return;
        }
        AtmosParams o = this.i.j().o();
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (!this.i.j().k0() || this.c.f31127a != 0) {
                this.o.setCornerRadius(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                marginLayoutParams.topMargin = 0;
            } else {
                float j = this.i.j().K().j(o.layoutInfo.borderRadius);
                this.o.setCornerRadius(new float[]{j, j, j, j, 0.0f, 0.0f, 0.0f, 0.0f});
                if (y()) {
                    i = cbw.i(this.i, o);
                } else {
                    i = cbw.h(this.i, o);
                }
                marginLayoutParams.topMargin = i;
            }
            this.n.setScaleType(ImageView.ScaleType.CENTER_CROP);
            cbw.p(this.n.getContext());
            if (x(str)) {
                s0m.B().T(str).bitmapProcessors(true, new yf2(this.n.getContext(), j(), 2)).succListener(new b()).fetch();
                u();
            }
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a06b8", new Object[]{this});
            return;
        }
        String string = this.c.B().getString("maskBackgroundColor");
        if (string != null) {
            try {
                this.p.setBackgroundColor(Color.parseColor(string));
                this.p.setVisibility(0);
            } catch (Exception e2) {
                txj.f(txj.TAG_MEDIA_CONTROLLER, "maskBackgroundColor解析失败".concat(string), e2);
            }
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4099438", new Object[]{this});
            return;
        }
        ue7 ue7Var = this.c;
        if (ue7Var != null) {
            this.m.bindMask(ue7Var.D0());
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue();
        }
        T t = this.d;
        if (t == null || !t.d() || !z()) {
            return false;
        }
        return true;
    }

    public final boolean x(String str) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7091486", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.c == null || (t = this.d) == null || !t.isDataValid()) {
            return false;
        }
        if (!DimensionEnum.NINE_SIXTEEN.getDimensionRatio().equals(this.d.b()) || this.d.j() != null || y()) {
            return this.c.z0();
        }
        return false;
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfe58b89", new Object[]{this})).booleanValue();
        }
        NewDetailScreenConfig.ScreenType a2 = this.i.j().K().a();
        if (a2 == NewDetailScreenConfig.ScreenType.NORMAL_PHONE || a2 == NewDetailScreenConfig.ScreenType.FOLD_DEVICE_PORTRAIT) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70171cc7", new Object[]{this})).booleanValue();
        }
        if (i()) {
            txj.e(txj.TAG_TIP, "NdVideoSettingHelper: checkSupport:服务端下发禁止标。");
            return true;
        }
        this.z = true;
        if (new rqj(this.i.j()).c()) {
            txj.e(txj.TAG_TIP, "NdVideoSettingHelper: checkSupport:videoCanAutoPlay-True");
            return true;
        }
        this.y = true;
        this.c.C = true;
        g(false);
        txj.e(txj.TAG_TIP, "NdVideoSettingHelper: checkSupport:videoCanAutoPlay-False");
        f();
        return false;
    }

    public final void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91586dd8", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", (Object) str);
        P("playing", jSONObject, true);
    }

    public void T(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec6ac77", new Object[]{this, jSONObject});
        } else if (this.e != null && jSONObject != null) {
            T t = this.d;
            if (t != null && t.f()) {
                float e2 = ywj.e(jSONObject.getString("gradualTime"), 0.0f);
                int g2 = ywj.g(jSONObject.getString("switchFadeIn"), 0);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("gradualTime", Float.valueOf(e2));
                hashMap.put("switchFadeIn", Integer.valueOf(g2));
                this.e.r(hashMap);
            } else if (jSONObject.containsKey("initialVolume") && jSONObject.containsKey("finalVolume")) {
                float e3 = ywj.e(jSONObject.getString("initialVolume"), 0.0f);
                float e4 = ywj.e(jSONObject.getString("finalVolume"), 1.0f);
                int g3 = ywj.g(jSONObject.getString("gradualTime"), 3000);
                int g4 = ywj.g(jSONObject.getString("fadeInInterval"), 100);
                txj.e(txj.TAG_TIP, "渐大音效 open，gradualVolumeConfig: " + jSONObject.toJSONString());
                this.e.m(e3, e4, g3, g4);
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7c3e39", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.r).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            P(jSONObject.getString("type"), jSONObject.getJSONObject("info"), false);
        }
        ((ArrayList) this.r).clear();
    }

    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe93d", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        txj.f(txj.TAG_MEDIA_CONTROLLER, "onVideoComplete", null);
        P("finish", jSONObject, true);
        P("ended", jSONObject, true);
    }

    public final void D(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5372e825", new Object[]{this, view});
        } else if (view != null) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof RoundRectCardRoot) {
                    view2 = (View) parent;
                    ((RoundRectCardRoot) parent).removeView(view);
                    parent = parent.getParent();
                } else {
                    view2 = view;
                }
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view2);
                }
            }
            qrc qrcVar = this.j;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qrcVar.d, qrcVar.c);
            layoutParams.gravity = 1;
            qrc qrcVar2 = this.j;
            layoutParams.topMargin = qrcVar2.e;
            if (qrcVar2.i != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 1;
                layoutParams2.topMargin = this.j.e;
                layoutParams.topMargin = 0;
                RoundRectCardRoot roundRectCardRoot = new RoundRectCardRoot(view.getContext());
                roundRectCardRoot.setCornerRadius(this.j.i);
                this.k.addView(roundRectCardRoot, 0, layoutParams2);
                roundRectCardRoot.addView(view, 0, layoutParams);
                txj.e(txj.TAG_RENDER, "roundLayout onCustomViewUpdated：" + view);
                return;
            }
            this.k.addView(view, 0, layoutParams);
            txj.e(txj.TAG_RENDER, "onCustomViewUpdated：" + view);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474d741c", new Object[]{this});
            return;
        }
        T t = this.d;
        if (t != null && t.isDataValid()) {
            b0();
            if (this.j == null) {
                this.j = cbw.a(this.i, this.c, this.d, this.s.r(), this.s.t());
            }
            btb A = A();
            this.e = A;
            A.x(this.A);
            txj.e(txj.TAG_MEDIA_CONTROLLER, "NdVideoRec:dw-create onRequestMediaPlayer dw hCode:" + this.e.hashCode());
            this.x = 0L;
            ue7 ue7Var = this.c;
            if (ue7Var != null && ue7Var.f31127a == 0 && !ue7Var.A) {
                this.x = ue7Var.C().R().g;
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("videoActionType", "init");
                X(hashMap);
            }
            if (w() && this.c != null) {
                txj.e(txj.TAG_MEDIA_CONTROLLER, this.c.f31127a + "setFirstRenderAdapter" + this.e);
                this.e.l(new e());
            }
            this.e.i(DWInstanceType.VIDEO);
            this.e.j(this.B);
            if (i2w.a(Boolean.valueOf(this.d.c()), false)) {
                this.e.prepareToFirstFrame();
            }
            if (this.i.m().h0() && !this.d.l()) {
                this.e.getView().setAlpha(0.0f);
            }
            D(this.e.getView());
            W(true);
            this.e.n(false);
            txj.e(txj.TAG_RENDER, "播放器创建完成: " + this.d.getVideoId());
        }
    }

    public final void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc27826", new Object[]{this, str});
            return;
        }
        if (!"scroll".equals(str)) {
            g(false);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", (Object) str);
        P("paused", jSONObject, true);
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b5b67e0", new Object[]{this})).booleanValue();
        }
        ue7 ue7Var = this.c;
        if (ue7Var == null) {
            txj.e("new_detail异常", "NdVideoSettingHelper: disableMySettingVideoPlayConfig,无法读取 mItemNode 。");
            return false;
        } else if (!"true".equals(ue7Var.B().getString("disableMySettingVideoPlayConfig"))) {
            return false;
        } else {
            txj.e(txj.TAG_TIP, "NdVideoSettingHelper: 服务端下发了禁止履约视频自动播放配置的实验标识。");
            return true;
        }
    }

    public void K(String str) {
        btb btbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59833b2", new Object[]{this, str});
        } else if (!this.h && (btbVar = this.e) != null && btbVar.getVideoState() != 1) {
            if (this.e.getVideoState() == 2) {
                this.e.playVideo();
                this.w = true;
                return;
            }
            if ("weex".equals(str) || "videoIdInconsistent".equals(str) || w()) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(atb.EXP_KEY_COMMON_PRELOAD_PLAY, "true");
                X(hashMap);
                cxj cxjVar = this.i;
                if (cxjVar != null && cxjVar.o() == null) {
                    String G = this.i.j().G();
                    String e2 = nyj.z().e(G, "firstVideoPlay");
                    nyj.z().g(G, "start_play");
                    this.i.B(e2);
                }
                this.e.start();
                txj.e(txj.TAG_RENDER, "播放器start调用: " + this.d.getVideoId());
                this.w = true;
                f();
                if ("weex".equals(str) || "videoIdInconsistent".equals(str)) {
                    e(false);
                    udi.a aVar = this.f;
                    if (aVar != null) {
                        aVar.d(false);
                    }
                } else {
                    e(true);
                    udi.a aVar2 = this.f;
                    if (aVar2 != null) {
                        aVar2.d(true);
                    }
                }
            } else {
                e(false);
            }
            this.b.N0(this.g);
        }
    }
}
