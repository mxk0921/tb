package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.nav.Nav;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.taolive.room.business.goodcard.GoodCardItemTppBean;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.controller2.TaoLiveGoodCardVH;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.ui.SlideMonitorFrameLayout;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.dea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fws implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f19582a;
    public cba b;
    public Context c;
    public mlc d;
    public RecModel e;
    public RecyclerView.ViewHolder f;
    public DXRuntimeContext g;
    public ATaoLiveOpenEntity h;
    public FrameLayout i;
    public JSONObject j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements SlideMonitorFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f19583a;

        public a(View view) {
            this.f19583a = view;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d2b21a6", new Object[]{this});
            } else if ((this.f19583a.getContext() instanceof Activity) && phr.a(fws.a(fws.this))) {
                ((Activity) this.f19583a.getContext()).finish();
                o3s.d("TaoLiveGoodCardController", "onLeftSlideListener finish activity");
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68f2518f", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements dea.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f19584a;

        public b(JSONObject jSONObject) {
            this.f19584a = jSONObject;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9a1bff0", new Object[]{this});
            } else {
                fws.j(fws.this, this.f19584a, "fail");
            }
        }

        public void b(org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4993033f", new Object[]{this, jSONObject});
            } else if (fws.f(fws.this) != null && fws.f(fws.this).reserveItemCardInfo != null && fws.f(fws.this).reserveItemCardInfo.cardInfo != null && fws.f(fws.this).reserveItemCardInfo.cardInfo.dxData != null && !TextUtils.isEmpty(fws.f(fws.this).reserveItemCardInfo.cardInfo.dxTemplateName)) {
                try {
                    JSONObject jSONObject2 = fws.f(fws.this).reserveItemCardInfo.cardInfo.dxData;
                    if (jSONObject2.getJSONArray("goodsList") != null) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("goodsList");
                        if (jSONArray.size() > 0) {
                            Iterator<Object> it = jSONArray.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof JSONObject) {
                                    String string = ((JSONObject) next).getString("eventId");
                                    String string2 = jSONObject.getString("activityDetailId");
                                    String string3 = jSONObject.getString("hasSubsidy");
                                    String string4 = jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT);
                                    if (string != null && string2 != null && string2.equals(string) && "true".equals(string3) && !TextUtils.isEmpty(string4)) {
                                        String g = fws.g(fws.this, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT));
                                        ((JSONObject) next).put("customizedItemRights", (Object) ("下单立减" + g + "元"));
                                        ((JSONObject) next).put("subscribeStatus", (Object) "1");
                                        ((JSONObject) next).put("subscribeLabel", (Object) "已预约");
                                    }
                                }
                            }
                        }
                    }
                    fws fwsVar = fws.this;
                    fws.h(fwsVar, fws.f(fwsVar).reserveItemCardInfo.cardInfo.dxTemplateName, jSONObject2);
                    JSONObject parseObject = JSON.parseObject(jSONObject.toString());
                    if (parseObject.containsKey(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT)) {
                        parseObject.put(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT, (Object) fws.g(fws.this, parseObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT)));
                    }
                    fws fwsVar2 = fws.this;
                    fwsVar2.X(fws.i(fwsVar2), parseObject);
                    fws.j(fws.this, this.f19584a, "succ");
                } catch (Throwable th) {
                    o3s.b("TaoLiveGoodCardController", th.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fws.k(fws.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/TaoLiveGoodCardController$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                fws.b(fws.this).setVisibility(8);
            }
        }
    }

    static {
        t2o.a(779092878);
        t2o.a(806355932);
    }

    public static /* synthetic */ cba a(fws fwsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("f8bd859b", new Object[]{fwsVar});
        }
        return fwsVar.b;
    }

    public static /* synthetic */ FrameLayout b(fws fwsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d43f699c", new Object[]{fwsVar});
        }
        return fwsVar.i;
    }

    public static /* synthetic */ DXRuntimeContext c(fws fwsVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("6749e8d", new Object[]{fwsVar, dXRuntimeContext});
        }
        fwsVar.g = dXRuntimeContext;
        return dXRuntimeContext;
    }

    public static /* synthetic */ void d(fws fwsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8ed6a", new Object[]{fwsVar});
        } else {
            fwsVar.Y();
        }
    }

    public static /* synthetic */ void e(fws fwsVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b249207", new Object[]{fwsVar, jSONObject});
        } else {
            fwsVar.M(jSONObject);
        }
    }

    public static /* synthetic */ RecModel f(fws fwsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("4107f512", new Object[]{fwsVar});
        }
        return fwsVar.e;
    }

    public static /* synthetic */ String g(fws fwsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50b48b6f", new Object[]{fwsVar, str});
        }
        return fwsVar.n(str);
    }

    public static /* synthetic */ void h(fws fwsVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9222d4c0", new Object[]{fwsVar, str, jSONObject});
        } else {
            fwsVar.L(str, jSONObject);
        }
    }

    public static /* synthetic */ Context i(fws fwsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("edbf307d", new Object[]{fwsVar});
        }
        return fwsVar.c;
    }

    public static /* synthetic */ void j(fws fwsVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910b6d16", new Object[]{fwsVar, jSONObject, str});
        } else {
            fwsVar.W(jSONObject, str);
        }
    }

    public static /* synthetic */ void k(fws fwsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cb91c3", new Object[]{fwsVar});
        } else {
            fwsVar.q();
        }
    }

    public void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        o3s.b("TaoLiveGoodCardController", "onScrollStateChanged newState:" + i);
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onStart");
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onStop");
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
        } else {
            w();
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
        } else {
            x();
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
        } else {
            J();
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onViewHolderWillDisappear");
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef86571", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onViewHolderDestroy");
        }
    }

    public void I(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1ce313", new Object[]{this, recModel});
        } else {
            u(recModel);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onWillAppear");
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onWillDisappear");
        }
    }

    public final void L(String str, JSONObject jSONObject) {
        czd czdVar;
        dzd b2;
        Float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148fe75", new Object[]{this, str, jSONObject});
            return;
        }
        int max = Math.max(xca.b, xca.c);
        int f2 = hw0.f();
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.h;
        if (!(aTaoLiveOpenEntity == null || (czdVar = aTaoLiveOpenEntity.uiCompontent) == null || (b2 = ((rbt) czdVar).b()) == null || (f = b2.f()) == null || f.floatValue() <= 0.0f)) {
            max = f.intValue();
        }
        if (jSONObject != null) {
            jSONObject.put("topOffset", (Object) String.valueOf(pb6.z(this.c, max)));
            jSONObject.put("height", (Object) String.valueOf(pb6.z(this.c, f2) + 200));
        }
        DXRootView a2 = w36.k().a(this.c, str);
        if (!(a2 == null || jSONObject == null)) {
            this.j = jSONObject;
            w36.k().h(a2, (JSONObject) jSONObject.clone());
        }
        FrameLayout frameLayout = this.f19582a;
        if (frameLayout != null && a2 != null) {
            frameLayout.removeAllViews();
            this.f19582a.addView(a2, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final void M(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592248ae", new Object[]{this, jSONObject});
        } else if ("2".equals(jSONObject.getString("subscribeStatus"))) {
            Nav.from(this.c).toUri(jSONObject.getString(rg0.JUMP_URL));
        } else if ("1".equals(jSONObject.getString("subscribeStatus"))) {
            x0u.a(this.c, "你已经预约过啦");
            W(jSONObject, "yiyuyue");
        } else {
            new dea().d(this.c, jSONObject.getString("eventId"), this.e.accountId, jSONObject, new b(jSONObject));
        }
    }

    public void N(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c924ce", new Object[]{this, cbaVar});
            return;
        }
        this.b = cbaVar;
        if (cbaVar != null && (cbaVar.r() instanceof ATaoLiveOpenEntity)) {
            this.h = (ATaoLiveOpenEntity) cbaVar.r();
        }
    }

    public final void O(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60377bf3", new Object[]{this, str, str2});
            return;
        }
        GoodCardItemTppBean goodCardItemTppBean = new GoodCardItemTppBean();
        goodCardItemTppBean.liveId = str2;
        goodCardItemTppBean.enter = String.valueOf(System.currentTimeMillis());
        goodCardItemTppBean.itemId = str;
        cba cbaVar = this.b;
        if (cbaVar instanceof dba) {
            ((ArrayList) ((dba) cbaVar).c0).add(goodCardItemTppBean);
        }
    }

    public void P(TaoLiveGoodCardVH taoLiveGoodCardVH) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21efd3", new Object[]{this, taoLiveGoodCardVH});
        } else {
            this.f = taoLiveGoodCardVH;
        }
    }

    public final void Q(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d546b50", new Object[]{this, recommendCardInfo});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!(recommendCardInfo == null || (jSONObject = recommendCardInfo.dxData) == null)) {
            hashMap.put("type", jSONObject.getString("bottomType"));
            hashMap.put("spm-cnt", rbu.r(vx9.d()));
            hashMap.put("spm-url", up6.U(vx9.d()));
        }
        if (v2s.o().E() != null) {
            v2s.o().E().track4Show("Page_TaobaoLiveWatch", "cardbottombtn_expo", hashMap);
        }
    }

    public final void R() {
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo;
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db936ba4", new Object[]{this});
            return;
        }
        RecModel recModel = this.e;
        if (recModel != null && (recommendCardInfo2 = recModel.recommendCardInfo) != null) {
            T(recommendCardInfo2);
            Q(recommendCardInfo2);
            S(recommendCardInfo2);
        } else if (recModel != null && (reserveItemCardInfo = recModel.reserveItemCardInfo) != null && (recommendCardInfo = reserveItemCardInfo.cardInfo) != null) {
            U(recommendCardInfo);
            V(this.e.reserveItemCardInfo.cardInfo);
        }
    }

    public final HashMap<String, String> T(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fa83083b", new Object[]{this, recommendCardInfo});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(recommendCardInfo == null || recommendCardInfo.dxData == null)) {
            RecyclerView.ViewHolder viewHolder = this.f;
            hashMap.put("position", String.valueOf(viewHolder != null ? viewHolder.getLayoutPosition() : -1));
            if (TextUtils.isEmpty(recommendCardInfo.dxData.getString("bizType"))) {
                str = "1";
            } else {
                str = recommendCardInfo.dxData.getString("bizType");
            }
            hashMap.put("type", str);
            hashMap.put("spm-cnt", rbu.r(vx9.d()));
            hashMap.put("spm-url", up6.U(vx9.d()));
        }
        if (v2s.o().E() != null) {
            v2s.o().E().track4Show("Page_TaobaoLiveWatch", "itemflowcard_expo", hashMap);
        }
        return hashMap;
    }

    public final void V(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c819613", new Object[]{this, recommendCardInfo});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!(recommendCardInfo == null || (jSONObject = recommendCardInfo.dxData) == null)) {
            if (TextUtils.isEmpty(jSONObject.getString("bizType"))) {
                str = "default";
            } else {
                str = recommendCardInfo.dxData.getString("bizType");
            }
            hashMap.put("item_type", str);
            hashMap.put("spm-cnt", rbu.r(vx9.d()));
            hashMap.put("spm-url", up6.U(vx9.d()));
        }
        rbu.c0(vx9.d(), "Show-page_guideCard", hashMap);
    }

    public final void W(JSONObject jSONObject, String str) {
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d2f40f", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("itemId");
            String string2 = jSONObject.getString("liveId");
            String string3 = jSONObject.getString(RequestConfig.KEY_ANCHOR_ID);
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", string);
            RecModel recModel = this.e;
            if (!(recModel == null || (reserveItemCardInfo = recModel.reserveItemCardInfo) == null || (recommendCardInfo = reserveItemCardInfo.cardInfo) == null || (jSONObject2 = recommendCardInfo.dxData) == null)) {
                hashMap.put("item_type", jSONObject2.getString("bizType"));
            }
            hashMap.put("clickSource", "1");
            hashMap.put("feed_id", string2);
            hashMap.put(z9u.KEY_ACCOUNT_ID, string3);
            hashMap.put("pop_status", str);
            hashMap.put("spm-cnt", rbu.r(vx9.d()));
            hashMap.put("spm-url", up6.U(vx9.d()));
            rbu.c0(vx9.d(), "Show-reservationPop", hashMap);
        }
    }

    public void X(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43853f5", new Object[]{this, context, jSONObject});
        } else if (jSONObject != null && jSONObject.getJSONObject("displayInfo") != null && !TextUtils.isEmpty(jSONObject.getJSONObject("displayInfo").getString("dxName"))) {
            DXRootView a2 = w36.k().a(context, jSONObject.getJSONObject("displayInfo").getString("dxName"));
            if (a2 != null) {
                w36.k().h(a2, jSONObject);
            }
            this.i = new FrameLayout(this.c);
            if (!(this.f19582a == null || a2 == null)) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, b65.a(228.0f));
                layoutParams.gravity = 80;
                this.i.addView(a2);
                this.f19582a.removeView(this.i);
                this.f19582a.addView(this.i, layoutParams);
            }
            this.i.setVisibility(0);
            this.i.animate().translationY(0.0f).setDuration(300L).start();
            this.i.postDelayed(new c(), 3000L);
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5604a1e", new Object[]{this});
            return;
        }
        f3h f3hVar = new f3h(this);
        cba cbaVar = this.b;
        if (cbaVar instanceof dba) {
            f3hVar.K(((dba) cbaVar).d0);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6f347", new Object[]{this});
            return;
        }
        ryg.b().e(this.d);
        sjr.g().c("com.taobao.taolive.room.recommend.good.card.did.disappear", null, null);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d32b46d", new Object[]{this});
            return;
        }
        cba cbaVar = this.b;
        if ((cbaVar instanceof dba) && ((dba) cbaVar).e0 != null && cbaVar != null && ((dba) cbaVar).c0 != null && ((ArrayList) ((dba) cbaVar).c0).size() > 0) {
            ((dba) this.b).e0.put(bia.UNDER_TAKE_GOODS_LIST, JSON.toJSONString(((dba) this.b).c0));
            cba cbaVar2 = this.b;
            ((dba) cbaVar2).d0 = JSON.toJSONString(((dba) cbaVar2).e0);
        }
    }

    public final String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bfd9f21", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        return zih.a(BigDecimal.valueOf(Integer.parseInt(str)).divide(BigDecimal.valueOf(100.0d))).toPlainString();
    }

    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        return null;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            x0u.a(this.c, "网络出小差了");
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            x0u.a(this.c, "网络出小差了");
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        return null;
    }

    public void r(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
        } else if (view instanceof SlideMonitorFrameLayout) {
            this.f19582a = (FrameLayout) view;
            this.c = view.getContext();
            ((SlideMonitorFrameLayout) view).setSlideListener(new a(view));
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6686f1", new Object[]{this});
            return;
        }
        this.d = new gws(this);
        ryg.b().d(this.d);
        sjr.g().c("com.taobao.taolive.room.recommend.good.card.did.appear", null, null);
    }

    public void t(naj najVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dfc9", new Object[]{this, najVar});
        }
    }

    public void u(RecModel recModel) {
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo;
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c73abac", new Object[]{this, recModel});
            return;
        }
        this.e = recModel;
        o3s.b("TaoLiveGoodCardController", "onBindView");
        if ((recModel == null || (recommendCardInfo = recModel.recommendCardInfo) == null) && (recModel == null || (reserveItemCardInfo = recModel.reserveItemCardInfo) == null || (recommendCardInfo = reserveItemCardInfo.cardInfo) == null)) {
            recommendCardInfo = null;
        }
        if (recommendCardInfo != null) {
            L(recommendCardInfo.dxTemplateName, recommendCardInfo.dxData);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(null);
        }
        o3s.b("TaoLiveGoodCardController", "onDestroy");
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onPause");
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            o3s.b("TaoLiveGoodCardController", "onResume");
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        l();
        if (vx9.d() != null) {
            vx9.d().V(false);
        }
        o3s.b("TaoLiveGoodCardController", "onDidDisappear");
    }

    public final void S(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbea6097", new Object[]{this, recommendCardInfo});
        } else if (recommendCardInfo != null && (jSONObject = recommendCardInfo.dxData) != null && jSONObject.containsKey("goodsList") && (jSONArray = recommendCardInfo.dxData.getJSONArray("goodsList")) != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String string = jSONObject2.getString("itemId");
                    String string2 = jSONObject2.getString("type");
                    String string3 = jSONObject2.getString("eventId");
                    String string4 = jSONObject2.getString("liveId");
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemid", string);
                    O(string, string4);
                    hashMap.put("type", string2);
                    hashMap.put(UserTrackDO.COLUMN_EVENT_ID, string3);
                    hashMap.put("spm-cnt", rbu.r(vx9.d()));
                    hashMap.put("spm-url", up6.U(vx9.d()));
                    if (v2s.o().E() != null) {
                        v2s.o().E().track4Show("Page_TaobaoLiveWatch", "carditem_expo", hashMap);
                    }
                }
            }
        }
    }

    public final void U(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7bd2d5", new Object[]{this, recommendCardInfo});
        } else if (recommendCardInfo != null && (jSONObject = recommendCardInfo.dxData) != null && jSONObject.containsKey("goodsList") && (jSONArray = recommendCardInfo.dxData.getJSONArray("goodsList")) != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String string = jSONObject2.getString("itemId");
                    if (TextUtils.isEmpty(recommendCardInfo.dxData.getString("bizType"))) {
                        str = "default";
                    } else {
                        str = recommendCardInfo.dxData.getString("bizType");
                    }
                    String string2 = jSONObject2.getString("liveId");
                    String string3 = jSONObject2.getString(RequestConfig.KEY_ANCHOR_ID);
                    String string4 = jSONObject2.getString("subscribeStatus");
                    HashMap hashMap = new HashMap();
                    hashMap.put("item_id", string);
                    hashMap.put("item_type", str);
                    hashMap.put("item_status", string4);
                    hashMap.put("feed_id", string2);
                    hashMap.put(z9u.KEY_ACCOUNT_ID, string3);
                    hashMap.put("spm-cnt", rbu.r(vx9.d()));
                    hashMap.put("spm-url", up6.U(vx9.d()));
                    rbu.c0(vx9.d(), "Show-guideItem", hashMap);
                }
            }
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo != null && (netBaseOutDo.getData() instanceof LiveDetailMessinfoResponseData.RecommendCardInfo)) {
            LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = (LiveDetailMessinfoResponseData.RecommendCardInfo) netBaseOutDo.getData();
            int max = Math.max(xca.b, xca.c);
            int f2 = hw0.f();
            DXRuntimeContext dXRuntimeContext = this.g;
            Context h = dXRuntimeContext != null ? dXRuntimeContext.h() : null;
            if (!(recommendCardInfo == null || h == null)) {
                JSONObject jSONObject = recommendCardInfo.dxData;
                if (jSONObject != null) {
                    jSONObject.put("topOffset", (Object) String.valueOf(pb6.z(h, max)));
                    jSONObject.put("height", (Object) String.valueOf(pb6.z(h, f2) + 200));
                    x5t.j("TaoLiveGoodCardController", "height:" + String.valueOf(pb6.z(h, f)));
                    JSONArray jSONArray = jSONObject.getJSONArray("goodsList");
                    if (jSONArray != null && jSONArray.size() > 0) {
                        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                            Object obj2 = jSONArray.get(i2);
                            if (obj2 instanceof JSONObject) {
                                JSONObject jSONObject2 = (JSONObject) obj2;
                                O(jSONObject2.getString("itemId"), jSONObject2.getString("liveId"));
                            }
                        }
                    }
                } else if (hw0.l()) {
                    x0u.a(this.c, "没有更多商品");
                    return;
                } else {
                    return;
                }
            }
            if (!(this.g == null || recommendCardInfo == null)) {
                w36.k().h(this.g.L(), recommendCardInfo.dxData);
            }
            m();
            S(recommendCardInfo);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5013a192", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "translationY", frameLayout.getHeight());
            ofFloat.setDuration(300L);
            ofFloat.addListener(new d());
            ofFloat.start();
        }
    }

    public void w() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        s();
        R();
        m();
        cba cbaVar = this.b;
        if (cbaVar instanceof dba) {
            if (com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE.equals(((dba) cbaVar).f0)) {
                HashMap hashMap = new HashMap();
                hashMap.put("direction", "goodCard");
                if (v2s.o().E() != null) {
                    v2s.o().E().track4Click("Page_TaobaoLiveWatch", "jiangjie_slide", hashMap);
                }
            }
            ((dba) this.b).f0 = "goodCard";
        }
        if (vx9.d() != null) {
            vx9.d().V(true);
        }
        o3s.b("TaoLiveGoodCardController", "onDidAppear");
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.h;
        if (aTaoLiveOpenEntity != null && (jSONObject = this.j) != null) {
            aTaoLiveOpenEntity.accessListener(AccessListenerEnum.onRecieveDetailResponse, jSONObject);
        }
    }
}
