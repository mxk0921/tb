package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseType;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import java.util.HashMap;
import java.util.List;
import tb.cwp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gzp extends fv1 implements jac {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOWCASE_SOURCE_DETAIL_DEFAULT = "detailDefault";
    public static final String SHOWCASE_SOURCE_HOLD = "hold";
    public static final String SHOWCASE_SOURCE_PM = "pm";
    public static final String SHOWCASE_SOURCE_STASH_POP = "stashpop";
    public gwp h;
    public isd i;
    public b n;
    public final ux9 o;
    public final kdc p;
    public boolean q;
    public LiveItem r;
    public boolean s;
    public int j = 10;
    public int k = 30;
    public int l = 15;
    public int m = 600;
    public final Handler t = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f20329a;

        public a(boolean z) {
            this.f20329a = z;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            gzp gzpVar = gzp.this;
            gzpVar.c.a(gzpVar.f19548a);
            sjr g = sjr.g();
            if (gzp.j(gzp.this) == null) {
                str = null;
            } else {
                str = gzp.j(gzp.this).C();
            }
            g.c(cwp.EVENT_DISAPPEAR, null, str);
            gzp.this.f.c0(false);
            gzp.o(gzp.this, this.f20329a);
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
            } else {
                sjr.g().d("com.taobao.taolive.room.dismiss_sab_atmosphere");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    static {
        t2o.a(295699119);
        t2o.a(806356161);
        t2o.a(295699048);
    }

    public gzp(FrameLayout frameLayout, VideoInfo videoInfo, xea xeaVar) {
        super(frameLayout, videoInfo, xeaVar);
        JSONObject jSONObject;
        ux9 q = xeaVar.q();
        this.o = q;
        boolean z = false;
        if (yga.w().booleanValue() && !nh4.N(q)) {
            if (wda.R()) {
                hha.b("SingleGoodPlayer", "SingleGoodPlayer | AtmosphereControllerNew.");
                this.p = new eg1(xeaVar, xeaVar.i(), (FrameLayout) ((ViewGroup) frameLayout.getParent()).findViewById(R.id.view_hot_atmosphere));
            } else {
                hha.b("SingleGoodPlayer", "SingleGoodPlayer | HotAtmosphereTaskController.");
                this.p = new g6b(xeaVar, xeaVar.i(), (FrameLayout) ((ViewGroup) frameLayout.getParent()).findViewById(R.id.view_hot_atmosphere), 0);
            }
        }
        VideoInfo videoInfo2 = this.b;
        if (videoInfo2 != null && (jSONObject = videoInfo2.itemConfigInfo) != null && jSONObject.getIntValue("sabItemHitResult") == 1 && ((q == null || q.A() == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(q.A().bizCode)) && !vc.j(xeaVar.i()))) {
            z = true;
        }
        this.q = z;
    }

    public static /* synthetic */ gwp f(gzp gzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwp) ipChange.ipc$dispatch("fabfa297", new Object[]{gzpVar});
        }
        return gzpVar.h;
    }

    public static /* synthetic */ void g(gzp gzpVar, LiveItem liveItem, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c3d44a", new Object[]{gzpVar, liveItem, str, new Boolean(z)});
        } else {
            gzpVar.J(liveItem, str, z);
        }
    }

    public static /* synthetic */ long h(gzp gzpVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a5460ff", new Object[]{gzpVar, liveItem, str})).longValue();
        }
        return gzpVar.H(liveItem, str);
    }

    public static /* synthetic */ void i(gzp gzpVar, LiveItem liveItem, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38acd5f8", new Object[]{gzpVar, liveItem, str, new Long(j)});
        } else {
            gzpVar.D(liveItem, str, j);
        }
    }

    public static /* synthetic */ Object ipc$super(gzp gzpVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/SingleGoodPlayer");
    }

    public static /* synthetic */ ux9 j(gzp gzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("2f0a35d6", new Object[]{gzpVar});
        }
        return gzpVar.o;
    }

    public static /* synthetic */ kdc l(gzp gzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kdc) ipChange.ipc$dispatch("419f4efc", new Object[]{gzpVar});
        }
        return gzpVar.p;
    }

    public static /* synthetic */ void o(gzp gzpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dec652a", new Object[]{gzpVar, new Boolean(z)});
        } else {
            gzpVar.M(z);
        }
    }

    public final void A(LiveItem liveItem, boolean z) {
        gwp gwpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f9273f", new Object[]{this, liveItem, new Boolean(z)});
        } else if (yga.y() && z && (gwpVar = this.h) != null && gwpVar.c != null) {
            hea.r(gwpVar.a().parseJsonObject(), liveItem, true);
        }
    }

    public final void D(LiveItem liveItem, String str, long j) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81be964f", new Object[]{this, liveItem, str, new Long(j)});
            return;
        }
        this.r = liveItem;
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", str);
        hashMap.put("renderTime", Long.toString(j));
        if (wda.x()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("lvRender", str2);
        dvp.d(this.f, liveItem, this.b, GLRenderType.SMALL_CARD, hashMap);
    }

    public final void E(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99af66", new Object[]{this, liveItem});
            return;
        }
        jq6.n(liveItem);
        this.d.k(this.f, liveItem, this.b, "");
        jq6.c(liveItem, pfa.m());
    }

    public void F(LiveItem liveItem, boolean z) {
        gwp gwpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9459f7", new Object[]{this, liveItem, new Boolean(z)});
        } else if (liveItem != null && (gwpVar = this.h) != null && liveItem.itemId == gwpVar.f20272a) {
            A(liveItem, z);
            E(liveItem);
            this.c.c(this.f19548a, liveItem, this.h);
        }
    }

    public final void G(LiveItem liveItem, String str, boolean z, boolean z2) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bd81c7", new Object[]{this, liveItem, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        A(liveItem, z2);
        E(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", str);
        if (!z) {
            dvp.d(this.f, liveItem, this.b, GLRenderType.SMALL_CARD, hashMap);
        }
        gwp gwpVar = this.h;
        if (TextUtils.equals(str, "detailDefault") || TextUtils.equals(str, "hold")) {
            z3 = true;
        }
        this.i.d(liveItem, z3);
        this.h = new gwp(liveItem, liveItem.itemId, v(liveItem));
        this.c.c(this.f19548a, liveItem, gwpVar);
        if (!z) {
            this.e.removeCallbacksAndMessages(null);
            this.e.sendEmptyMessageDelayed(1, t(liveItem));
        }
        gwp gwpVar2 = this.h;
        pfa.m();
        gwpVar2.getClass();
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64f31e2", new Object[]{this, new Boolean(z)});
        } else if (yga.L()) {
            this.g = z;
            if (!z) {
                M(false);
            }
        }
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e54289a", new Object[]{this, new Integer(i)});
            return;
        }
        Message message = new Message();
        message.what = 1;
        if (!pfa.g(this.b)) {
            i = 1;
        }
        message.arg1 = i;
        this.e.sendMessage(message);
    }

    public void L(GoodMsgNew goodMsgNew) {
        gwp gwpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9489d0", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew != null && goodMsgNew.liveItemDO != null && (gwpVar = this.h) != null && pfa.M(gwpVar.c) && goodMsgNew.liveItemDO.itemId == this.h.f20272a) {
            K(0);
        }
    }

    public final void N(long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2008b86", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)});
        } else {
            this.t.post(new fzp(this, j, i, i2));
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
        this.h = null;
        this.n = null;
        this.r = null;
        this.q = false;
        this.s = false;
        this.f.j().V(this);
        this.c.a(this.f19548a);
        kdc kdcVar = this.p;
        if (kdcVar != null) {
            kdcVar.destroy();
        }
        isd isdVar = this.i;
        if (isdVar != null) {
            isdVar.a();
        }
        this.t.removeCallbacksAndMessages(null);
        pfa.S();
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message != null && message.what == 1) {
            kdc kdcVar = this.p;
            if (kdcVar != null) {
                kdcVar.c();
                kdc kdcVar2 = this.p;
                if (kdcVar2 instanceof eg1) {
                    ((eg1) kdcVar2).p();
                }
            }
            if (message.arg1 == 1) {
                z = false;
            }
            iha.I();
            awp.d(this.f19548a, this.o, new a(z));
        }
    }

    @Override // tb.jac
    public void n(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5433eb18", new Object[]{this, goodMsgNew});
            return;
        }
        this.i.f();
        L(goodMsgNew);
    }

    @Override // tb.jac
    public void q(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b183b31f", new Object[]{this, goodMsgNew});
        }
    }

    @Override // tb.jac
    public void s(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b857be9e", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else if (goodMsgNew != null) {
            J(goodMsgNew.liveItemDO, "pm", z);
        }
    }

    public long t(LiveItem liveItem) {
        int i;
        isd isdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7a1d6e0", new Object[]{this, liveItem})).longValue();
        }
        if (yga.W() && pfa.C(this.f) && !this.s) {
            i = this.k;
        } else if (pfa.M(liveItem)) {
            i = this.m;
        } else if (y6p.b(liveItem)) {
            i = this.l;
        } else if (!pfa.y(liveItem) || !pfa.g(this.b) || (isdVar = this.i) == null || isdVar.b() == null || this.i.b().showTime <= 0) {
            i = this.j;
        } else {
            i = this.i.b().showTime;
        }
        return i * 1000;
    }

    @Override // tb.jac
    public void u(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b640d63", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else if (goodMsgNew != null) {
            J(goodMsgNew.liveItemDO, "pm", z);
        }
    }

    public ShowcaseType v(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShowcaseType) ipChange.ipc$dispatch("2c8463f0", new Object[]{this, liveItem});
        }
        if (y6p.b(liveItem)) {
            return ShowcaseType.TYPE_SECKILL;
        }
        if (pfa.M(liveItem)) {
            return ShowcaseType.TYPE_EXPLAININT;
        }
        return ShowcaseType.TYPE_NORMAL;
    }

    public void w(List<LiveItem> list, List<LiveItem> list2, hmc hmcVar, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80c0816", new Object[]{this, list, list2, hmcVar, bVar, new Boolean(z)});
            return;
        }
        this.n = bVar;
        z();
        if (pfa.g(this.b)) {
            this.i = new t1k(list2, list, this.b, this.m, this.f.l.d);
        } else {
            wda wdaVar = this.f.l;
            this.i = new jiq(list2, this.m, wdaVar.d, wdaVar.g);
        }
        p(list, hmcVar, z);
        this.s = true;
        this.f.j().s(this);
    }

    @Override // tb.jac
    public void x(GoodMsgNew goodMsgNew) {
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b784d2cb", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew != null && (liveItem = goodMsgNew.liveItemDO) != null) {
            this.i.e(liveItem);
            L(goodMsgNew);
        }
    }

    @Override // tb.jac
    public void y(LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cbd22f1", new Object[]{this, liveItem, str, str2});
            return;
        }
        F(liveItem, false);
        this.r = liveItem;
        sjr.g().c("com.taobao.taolive.room.hot_item_subscribe_success", new String[]{fkx.i(liveItem), str, str2}, xea.E(this.f));
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33913c21", new Object[]{this});
            return;
        }
        JSONObject parseObject = JSON.parseObject(yga.m0());
        if (parseObject != null) {
            if (parseObject.containsKey("normal")) {
                this.j = parseObject.getIntValue("normal");
            }
            if (parseObject.containsKey("seckill")) {
                this.l = parseObject.getIntValue("seckill");
            }
            if (parseObject.containsKey("speaking")) {
                this.m = parseObject.getIntValue("speaking");
            }
            if (parseObject.containsKey("undertakeEnhance")) {
                this.k = parseObject.getIntValue("undertakeEnhance");
            }
            hha.c("SingleGoodPlayer", "initShowTime | normal=" + this.j + "  seckill=" + this.l + "  speaking=" + this.m + "  undertakeEnhance=" + this.k);
        }
    }

    public final void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb49911", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f19548a.setVisibility(8);
        kdc kdcVar = this.p;
        if (kdcVar != null) {
            kdcVar.c();
            kdc kdcVar2 = this.p;
            if (kdcVar2 instanceof eg1) {
                ((eg1) kdcVar2).p();
            }
        }
        if (!z) {
            this.i.a();
        }
        this.h = null;
        gwp c = this.i.c();
        if (z && c != null) {
            if (!pfa.y(c.a()) || !pfa.g(this.b) || this.i.b() == null) {
                J(c.a(), SHOWCASE_SOURCE_STASH_POP, false);
            } else {
                this.t.postDelayed(new dzp(this, c), this.i.b().delayTime * 1000);
            }
        }
    }

    @Override // tb.jac
    public void k(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314945a5", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew != null) {
            J(goodMsgNew.liveItemDO, "pm", true);
        }
    }

    public static boolean r(LiveItem liveItem, LiveItem liveItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6822e3cd", new Object[]{liveItem, liveItem2})).booleanValue();
        }
        if (liveItem == null || liveItem2 == null) {
            return true;
        }
        JSONObject jSONObject = liveItem.itemExtData;
        int i = Integer.MAX_VALUE;
        if (jSONObject != null && jSONObject.containsKey("showPriority")) {
            i = srf.e("showPriority", liveItem.itemExtData, Integer.MAX_VALUE);
        }
        JSONObject jSONObject2 = liveItem2.itemExtData;
        int i2 = Integer.MIN_VALUE;
        if (jSONObject2 != null && jSONObject2.containsKey("showPriority")) {
            i2 = srf.e("showPriority", liveItem2.itemExtData, Integer.MIN_VALUE);
        }
        return i2 <= i;
    }

    @Override // tb.jac
    public void C(long j, int i) {
        LiveItem liveItem;
        xea xeaVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f16b64", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        gwp gwpVar = this.h;
        if (gwpVar != null && (liveItem = gwpVar.c) != null && pfa.M(liveItem)) {
            hha.c("SingleGoodPlayer", "onMessageGoodHot | itemid=" + j + "   total=" + i);
            gwp gwpVar2 = this.h;
            if (j == gwpVar2.f20272a && !pfa.I(gwpVar2.c)) {
                LiveItem liveItem2 = this.h.c;
                JSONObject jSONObject = liveItem2.itemExtData;
                if (jSONObject != null) {
                    int intValue = jSONObject.getIntValue("itemSellingTotal");
                    if (intValue >= i) {
                        hha.c("SingleGoodPlayer", "updateItem | currTotal=" + intValue + "   total=" + i + " itemId=" + j);
                        return;
                    }
                    this.h.c.itemExtData.put("itemSellingTotal", (Object) String.valueOf(i));
                } else {
                    liveItem2.itemExtData = new JSONObject();
                    this.h.c.itemExtData.put("itemSellingTotal", (Object) String.valueOf(i));
                }
                if (!(!nh4.j() || (xeaVar = this.f) == null || xeaVar.q() == null || this.f.q().j() == null)) {
                    if (i > 0) {
                        z = true;
                    }
                    this.f.q().j().I("showHotAtmosphere", Boolean.valueOf(z));
                }
                G(this.h.c, "pm", true, true);
                LiveItem liveItem3 = this.h.c;
                N(liveItem3.itemId, liveItem3.itemExtData.getIntValue("itemSellingTotal"), pfa.q(this.h.c.itemExtData));
            }
        }
    }

    public final long H(LiveItem liveItem, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecbbce36", new Object[]{this, liveItem, str})).longValue();
        }
        E(liveItem);
        this.e.removeCallbacksAndMessages(null);
        b bVar = this.n;
        if (bVar != null) {
            ((cwp.a) bVar).a(liveItem);
        }
        this.f19548a.setVisibility(0);
        if (TextUtils.equals(str, "detailDefault") || TextUtils.equals(str, "hold")) {
            z = true;
        }
        this.i.d(liveItem, z);
        long currentTimeMillis = System.currentTimeMillis();
        this.c.b(this.f19548a, liveItem);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        hha.d("SingleGoodPlayer", "render | time=" + currentTimeMillis2);
        this.h = new gwp(liveItem, liveItem.itemId, v(liveItem));
        this.e.sendEmptyMessageDelayed(1, t(liveItem));
        gwp gwpVar = this.h;
        pfa.m();
        gwpVar.getClass();
        return currentTimeMillis2;
    }

    public final void J(LiveItem liveItem, String str, boolean z) {
        JSONObject jSONObject;
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d74f7dc7", new Object[]{this, liveItem, str, new Boolean(z)});
        } else if (!this.g) {
            hha.c("SingleGoodPlayer", "showProducts | showProducts=false");
        } else if (!fv1.e(this.b, liveItem, this.f)) {
            iha.D(liveItem, this.b);
        } else {
            hha.c("SingleGoodPlayer", "showProducts | id=" + liveItem.itemId + " goodIndx=" + liveItem.goodsIndex + "  name=" + liveItem.itemName);
            JSONObject jSONObject2 = liveItem.itemExtData;
            int intValue = jSONObject2 != null ? jSONObject2.getIntValue("itemSellingTotal") : 0;
            gwp gwpVar = this.h;
            boolean z2 = gwpVar != null;
            boolean z3 = gwpVar != null && gwpVar.f20272a == liveItem.itemId;
            if (z3 || (ext = liveItem.extendVal) == null || !Boolean.parseBoolean(ext.closePopItem)) {
                if (nh4.D0() && this.q && (!(liveItem.sabItemAtmosphere == null && liveItem.sabItemAtmospherePreHeat == null) && !nh4.N(this.o))) {
                    sjr.g().e("com.taobao.taolive.room.init_sab_atmosphere", liveItem);
                }
                if (nh4.r0() && (jSONObject = liveItem.itemExtData) != null && TextUtils.equals(jSONObject.getString("smallCardItemType"), "itemZone")) {
                    t6t.g("new_user_zone_card_show_count", t6t.c("new_user_zone_card_show_count", 0) + 1);
                    t6t.h("new_user_zone_card_show_time", System.currentTimeMillis());
                }
                iha.H(liveItem, str);
                if (!z2) {
                    iha.J();
                    long H = H(liveItem, str);
                    awp.e(this.f19548a, this.o, null);
                    sjr g = sjr.g();
                    ux9 ux9Var = this.o;
                    g.c(cwp.EVENT_APPEAR, null, ux9Var == null ? null : ux9Var.C());
                    this.f.c0(true);
                    D(liveItem, str, H);
                } else if (!z2 || z3) {
                    G(liveItem, str, false, z);
                    this.r = liveItem;
                } else if (!r(this.h.c, liveItem)) {
                    iha.E(this.h.c, liveItem);
                    return;
                } else {
                    iha.I();
                    awp.d(this.f19548a, this.o, new ezp(this, liveItem, str));
                }
                N(liveItem.itemId, intValue, pfa.q(liveItem.itemExtData));
                return;
            }
            hha.c("SingleGoodPlayer", "showProducts | item is filter, itemId=" + liveItem.goodsIndex);
        }
    }

    @Override // tb.jac
    public void m(JSONObject jSONObject) {
        LiveItem.Ext ext;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22e87a4", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            long h = zqq.h(jSONObject.getString("itemId"));
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("type");
            gwp gwpVar = this.h;
            if (gwpVar != null && gwpVar.c != null && gwpVar.b == ShowcaseType.TYPE_SECKILL && gwpVar.f20272a == h && "2".equals(string) && "secKillSellout".equals(string2) && (ext = this.h.c.extendVal) != null && (d = fkx.d(ext.secKillInfo)) != null) {
                d.put("status", (Object) string);
                this.h.c.extendVal.secKillInfo = d.toJSONString();
                G(this.h.c, "pm", false, true);
            }
        }
    }

    public final void p(List<LiveItem> list, hmc hmcVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e106d7", new Object[]{this, list, hmcVar, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            LiveItem liveItem = list.get(0);
            iha.F(liveItem, null, "主动展示", null);
            if (liveItem != null) {
                String l = Long.toString(liveItem.itemId);
                hha.c("SingleGoodPlayer", "checkIsNeedShow | id=" + l + "    name=" + liveItem.itemName + "  index=" + liveItem.goodsIndex);
                if (TextUtils.equals(fgv.VALUE_ITEM_HOLD_TYPE_CARD, this.b.itemHoldType)) {
                    str = SHOWCASE_SOURCE_HOLD;
                } else {
                    str = SHOWCASE_SOURCE_DETAIL_DEFAULT;
                }
                J(liveItem, str, false);
                LiveItem.Ext ext = liveItem.extendVal;
                if (ext != null && !TextUtils.isEmpty(ext.msgUuid)) {
                    hha.c("SingleGoodPlayer", "checkIsNeedShow | msgId=" + liveItem.extendVal.msgUuid);
                    hmcVar.c(liveItem.extendVal.msgUuid);
                }
            }
        } else if (z) {
            M(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.gzp.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r6
            r7[r0] = r4
            java.lang.String r0 = "d87c2d9a"
            r3.ipc$dispatch(r0, r7)
            return
        L_0x001a:
            com.taobao.taolive.sdk.model.common.LiveItem r3 = r6.r
            if (r3 != 0) goto L_0x001f
            return
        L_0x001f:
            boolean r3 = tb.noo.t(r3)
            if (r3 == 0) goto L_0x002a
            com.taobao.taolive.sdk.model.common.LiveItem r3 = r6.r
            com.taobao.taolive.sdk.model.common.LiveItem$SabItemAtmosphere r3 = r3.sabItemAtmospherePreHeat
            goto L_0x002e
        L_0x002a:
            com.taobao.taolive.sdk.model.common.LiveItem r3 = r6.r
            com.taobao.taolive.sdk.model.common.LiveItem$SabItemAtmosphere r3 = r3.sabItemAtmosphere
        L_0x002e:
            if (r3 == 0) goto L_0x008e
            tb.xea r4 = r6.f
            if (r4 == 0) goto L_0x008e
            boolean r4 = r4.S()
            if (r4 != 0) goto L_0x003b
            goto L_0x008e
        L_0x003b:
            tb.kdc r4 = r6.p
            if (r4 == 0) goto L_0x0078
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = r3.rightType
            java.lang.String r4 = "item_soldQuantity"
            boolean r7 = android.text.TextUtils.equals(r7, r4)
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = r3.rightType
            java.lang.String r5 = "item_rankAtmosphere"
            boolean r7 = android.text.TextUtils.equals(r7, r5)
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = r3.subRightType
            boolean r7 = android.text.TextUtils.equals(r7, r4)
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = r3.subRightType
            boolean r7 = android.text.TextUtils.equals(r7, r5)
            if (r7 == 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            tb.kdc r7 = r6.p
            r7.setVisibility(r1)
            goto L_0x0079
        L_0x006c:
            tb.kdc r7 = r6.p
            r0 = 8
            r7.setVisibility(r0)
            r0 = 2
            goto L_0x0079
        L_0x0075:
            r4.setVisibility(r1)
        L_0x0078:
            r0 = 0
        L_0x0079:
            com.taobao.taolive.sdk.model.common.LiveItem r7 = r6.r
            com.alibaba.fastjson.JSONObject r7 = r7.nativeConfigInfos
            if (r7 == 0) goto L_0x0089
            java.lang.String r2 = "sabItemAtmosphereState"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.put(r2, r0)
        L_0x0089:
            com.taobao.taolive.sdk.model.common.LiveItem r7 = r6.r
            r6.F(r7, r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gzp.B(boolean):void");
    }
}
