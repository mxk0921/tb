package tb;

import android.os.Message;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.LiveGoodDataCenter;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseType;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w1o extends fv1 implements qed {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOWCASE_SOURCE_DETAIL_DEFAULT = "detailDefault";
    public static final String SHOWCASE_SOURCE_HOLD = "hold";
    public final ux9 h;
    public final LiveGoodDataCenter i;
    public c j;
    public d k;
    public gwp l;
    public final Runnable m = new Runnable() { // from class: tb.u1o
        @Override // java.lang.Runnable
        public final void run() {
            w1o.this.f();
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            w1o w1oVar = w1o.this;
            if (w1oVar.e != null && w1o.g(w1oVar) != null) {
                w1o w1oVar2 = w1o.this;
                w1oVar2.e.postDelayed(w1oVar2.m, w1o.g(w1oVar2).b);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            w1o w1oVar = w1o.this;
            jqd jqdVar = w1oVar.c;
            if (jqdVar != null) {
                jqdVar.a(w1oVar.f19548a);
            }
            w1o.h(w1o.this, null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final LiveItem f30398a;
        public final long b;

        static {
            t2o.a(295699084);
        }

        public c(LiveItem liveItem, long j) {
            this.f30398a = liveItem;
            this.b = j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f30399a;
        public final long b;

        static {
            t2o.a(295699085);
        }

        public d(String str, long j) {
            this.f30399a = str;
            this.b = j;
        }
    }

    static {
        t2o.a(295699080);
        t2o.a(295699159);
    }

    public w1o(FrameLayout frameLayout, VideoInfo videoInfo, xea xeaVar) {
        super(frameLayout, videoInfo, xeaVar);
        if (xeaVar == null) {
            hha.b("ReplayPlayer", "constructor: goodLiveContext is null");
            this.h = null;
            this.i = null;
            return;
        }
        this.h = xeaVar.q();
        this.i = xeaVar.j();
    }

    public static /* synthetic */ c g(w1o w1oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("48069b4f", new Object[]{w1oVar});
        }
        return w1oVar.j;
    }

    public static /* synthetic */ c h(w1o w1oVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3290f106", new Object[]{w1oVar, cVar});
        }
        w1oVar.j = cVar;
        return cVar;
    }

    public static /* synthetic */ Object ipc$super(w1o w1oVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/ReplayPlayer");
    }

    public void A(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6790e39f", new Object[]{this, liveItem});
        } else if (liveItem == null || !i(String.valueOf(liveItem.itemId))) {
            hha.b("ReplayPlayer", "onQueryItemDataSuccess: isNeedShow=false");
        } else {
            G(liveItem, this.k.b);
        }
    }

    public void B(HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cf0023", new Object[]{this, hashMap});
        } else if (hashMap != null) {
            Object obj = hashMap.get("action");
            Object obj2 = hashMap.get("itemId");
            Object obj3 = hashMap.get("duration");
            hha.b("ReplayPlayer", "playControl | action=" + obj + "  itemId=" + obj2 + " duration=" + obj3);
            if (obj instanceof String) {
                String str = (String) obj;
                str.hashCode();
                if (str.equals("hide")) {
                    v();
                } else if (str.equals("show")) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    long j = -1;
                    if (obj3 instanceof String) {
                        j = zqq.i((String) obj3, -1L);
                    }
                    if (!TextUtils.isEmpty(str2) && j > 5000) {
                        w(str2, j);
                    }
                }
            }
        }
    }

    public final void D(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99af66", new Object[]{this, liveItem});
            return;
        }
        jq6.n(liveItem);
        jq6 jq6Var = this.d;
        if (jq6Var != null) {
            jq6Var.k(this.f, liveItem, this.b, "");
        }
        jq6.c(liveItem, pfa.m());
    }

    public final void E(LiveItem liveItem) {
        ShowcaseType showcaseType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf095278", new Object[]{this, liveItem});
            return;
        }
        D(liveItem);
        FrameLayout frameLayout = this.f19548a;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        boolean b2 = y6p.b(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", "detailDefault");
        dvp.d(this.f, liveItem, this.b, GLRenderType.SMALL_CARD, hashMap);
        boolean M = pfa.M(liveItem);
        jqd jqdVar = this.c;
        if (jqdVar != null) {
            jqdVar.b(this.f19548a, liveItem);
        }
        if (b2) {
            this.l = new gwp(liveItem, liveItem.itemId, ShowcaseType.TYPE_SECKILL);
        } else {
            long j = liveItem.itemId;
            if (M) {
                showcaseType = ShowcaseType.TYPE_EXPLAININT;
            } else {
                showcaseType = ShowcaseType.TYPE_NORMAL;
            }
            this.l = new gwp(liveItem, j, showcaseType);
        }
        gwp gwpVar = this.l;
        pfa.m();
        gwpVar.getClass();
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64f31e2", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void G(LiveItem liveItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d94fd5", new Object[]{this, liveItem, new Long(j)});
        } else if (!this.g) {
            hha.c("ReplayPlayer", "showProducts | mCanShowCard=false");
        } else if (e(this.b, liveItem, this.f)) {
            hha.b("ReplayPlayer", "showCard | id=" + liveItem.itemId + " goodIndx=" + liveItem.goodsIndex + "  name=" + liveItem.itemName);
            if (this.j != null) {
                j();
            }
            this.j = new c(liveItem, j);
            o();
        }
    }

    @Override // tb.fv1
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.b();
        this.g = true;
        this.k = null;
        this.c.a(this.f19548a);
    }

    public final /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe81801e", new Object[]{this});
        } else {
            l(true);
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public boolean i(String str) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77fdc1c5", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (dVar = this.k) != null && TextUtils.equals(dVar.f30399a, str)) {
            return true;
        }
        return false;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54261cbe", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.f19548a;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.f19548a.clearAnimation();
        }
        jyw jywVar = this.e;
        if (jywVar != null) {
            jywVar.removeCallbacks(this.m);
        }
        jqd jqdVar = this.c;
        if (jqdVar != null) {
            jqdVar.a(this.f19548a);
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fd56b3", new Object[]{this, new Boolean(z)});
        } else if (z) {
            awp.d(this.f19548a, null, new b());
        } else {
            j();
            this.j = null;
        }
    }

    public final void o() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8339279", new Object[]{this});
            return;
        }
        c cVar = this.j;
        if (cVar != null) {
            E(cVar.f30398a);
            sjr g = sjr.g();
            ux9 ux9Var = this.h;
            if (ux9Var == null) {
                str = null;
            } else {
                str = ux9Var.C();
            }
            g.c(cwp.EVENT_APPEAR, null, str);
            this.f.c0(true);
            awp.e(this.f19548a, null, new a());
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a44b2b", new Object[]{this});
            return;
        }
        hha.b("ReplayPlayer", "hideByUser");
        r(true);
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd68bafb", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = null;
        this.k = null;
        l(z);
    }

    public final void w(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debb21bb", new Object[]{this, str, new Long(j)});
            return;
        }
        hha.b("ReplayPlayer", "onEventShow: itemId=" + str + ", duration=" + j);
        if (!TextUtils.isEmpty(str) && j > 0) {
            if (this.i == null) {
                hha.b("ReplayPlayer", "onEventShow: mLiveGoodDataCenter is null");
                return;
            }
            this.k = new d(str, j);
            this.i.P(str, "liveReplay", this);
        }
    }

    public void z(String str, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4718e1c7", new Object[]{this, str, new Integer(i), netResponse, obj});
            return;
        }
        hha.b("ReplayPlayer", "onQueryItemDataError | itemId=" + str + ", i=" + i + ", netResponse=" + netResponse + ", o=" + obj);
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577a71e4", new Object[]{this});
            return;
        }
        hha.b("ReplayPlayer", "onEventHide");
        r(false);
    }

    public static boolean e(VideoInfo videoInfo, LiveItem liveItem, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2a4d283", new Object[]{videoInfo, liveItem, xeaVar})).booleanValue();
        }
        if (liveItem == null || videoInfo == null) {
            return false;
        }
        if (pfa.P(videoInfo.liveId, liveItem)) {
            return true;
        }
        hha.b("ReplayPlayer", "showProducts| liveid check fail. mVideoInfo.liveId=" + videoInfo.liveId);
        return false;
    }
}
