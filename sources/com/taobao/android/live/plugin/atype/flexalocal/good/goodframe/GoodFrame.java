package com.taobao.android.live.plugin.atype.flexalocal.good.goodframe;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.HashMap;
import tb.bia;
import tb.ccc;
import tb.cpr;
import tb.cv1;
import tb.fkx;
import tb.fmi;
import tb.jyw;
import tb.kbc;
import tb.kkr;
import tb.mmi;
import tb.nh4;
import tb.qfa;
import tb.qha;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.vvs;
import tb.vx9;
import tb.wda;
import tb.xn8;
import tb.yga;
import tb.yqq;
import tb.zga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodFrame extends AbstractGoodFrame implements cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodFrame";
    private String behavior;
    private qha goodsPreRequestManager;
    private jyw mHandler;
    private mmi messageChannel;
    private String popId;
    private boolean vipShopMessage = false;
    private Runnable vipShopRunnable;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(GoodFrame goodFrame) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodframe/GoodFrame$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1004 || i == 1039) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ccc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(GoodFrame goodFrame) {
        }

        @Override // tb.ccc
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                GoodFrame.access$002(GoodFrame.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.fmi
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            } else if (obj instanceof JSONObject) {
                String string = ((JSONObject) obj).getString("name");
                if (!TextUtils.isEmpty(string)) {
                    string.hashCode();
                    if (string.equals("authSuccess") && !GoodFrame.access$000(GoodFrame.this)) {
                        GoodFrame.access$002(GoodFrame.this, true);
                        new HashMap().put("channel", "goods");
                        if (GoodFrame.access$100(GoodFrame.this) != null) {
                            GoodFrame.access$100(GoodFrame.this).removeCallbacksAndMessages(null);
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(295699006);
        t2o.a(806356110);
        t2o.a(806356196);
        t2o.a(806356045);
    }

    public GoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        super(activity, str, z, tBLiveDataModel, view, ux9Var);
    }

    public static /* synthetic */ boolean access$000(GoodFrame goodFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10d2565f", new Object[]{goodFrame})).booleanValue();
        }
        return goodFrame.vipShopMessage;
    }

    public static /* synthetic */ boolean access$002(GoodFrame goodFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c55ff39b", new Object[]{goodFrame, new Boolean(z)})).booleanValue();
        }
        goodFrame.vipShopMessage = z;
        return z;
    }

    public static /* synthetic */ jyw access$100(GoodFrame goodFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyw) ipChange.ipc$dispatch("ac645d86", new Object[]{goodFrame});
        }
        return goodFrame.mHandler;
    }

    private void hideGoodsSmartlanding() {
        cv1 f;
        ISmartLandingProxy.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8521d09", new Object[]{this});
        } else if (nh4.U() && (f = vx9.f(this.mFrameContext)) != null && (bVar = f.u) != null) {
            bVar.g("hideGoods", null);
        }
    }

    public static /* synthetic */ Object ipc$super(GoodFrame goodFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1615569613:
                super.show(((Boolean) objArr[0]).booleanValue(), (HashMap) objArr[1], ((Number) objArr[2]).longValue(), ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodframe/GoodFrame");
        }
    }

    private void preRequestGoodsData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ac299b", new Object[]{this});
            return;
        }
        qha qhaVar = new qha(this.mGoodLiveContext);
        this.goodsPreRequestManager = qhaVar;
        qhaVar.g();
    }

    private void updateSjsdPopStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27544d1b", new Object[]{this, new Boolean(z)});
            return;
        }
        cv1 f = vx9.f(this.mFrameContext);
        if (f != null && f.u != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "goods");
            f.u.c(this.behavior, this.popId, z, jSONObject);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        sjr.g().a(this);
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            ux9Var.z().c(uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY, "Pocket", observeUniqueIdentification());
        }
        ux9 ux9Var2 = this.mFrameContext;
        if (!(ux9Var2 == null || ux9Var2.t() == null)) {
            this.mFrameContext.t().l(this, new a(this));
        }
        this.mHandler = new jyw(new b(this));
        if (qfa.e(this.mLiveDataModel.mVideoInfo.roomStatus, isTimeShiftInDiantao()) && zga.a() && bia.a(this.mGoodLiveContext, this.mLiveId)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("glopenfrom", "timemove_recvoer");
            show(false, hashMap, 0L, true);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame
    public boolean isKandian() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ed4694b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isTimeShiftInDiantao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74032f2b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_SHOW_GOODSPACKAGE, uyg.EVENT_SHOW_GOODSPACKAGE_DISMISS, "com.taobao.taolive.room.hide_goods_list", "com.taobao.taolive.goods.open.shop_vip", "com.taobao.taolive.goods.preset.topitem", "com.taobao.taolive.room.hide_goods_list.out", "com.taobao.taolive.goods.force_goods_timeout", "com.taobao.taolive.inside.detail.open", "com.taobao.taolive.inside.detail.close", "com.taobao.taolive.goods.get.user_buy.data"};
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        goodRelatedInit();
        init();
        if (yga.i()) {
            preRequestGoodsData();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().a(this);
        }
        sjr.g().b(this);
        jyw jywVar = this.mHandler;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        mmi mmiVar = this.messageChannel;
        if (mmiVar != null) {
            mmiVar.a();
            this.messageChannel = null;
        }
        qha qhaVar = this.goodsPreRequestManager;
        if (qhaVar != null) {
            qhaVar.e("onDestroy");
            this.goodsPreRequestManager = null;
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        kbc kbcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1004) {
            hide();
        } else if (i == 1039 && (kbcVar = this.mGoodsView) != null) {
            ((GoodsView) kbcVar).s();
            this.mGoodsView = null;
        }
    }

    private void goodsOpenShopVip(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73624d09", new Object[]{this, liveItem});
            return;
        }
        this.vipShopMessage = false;
        showMemberPoplayer(liveItem.extendVal.anchorId);
        if (this.vipShopRunnable == null) {
            this.vipShopRunnable = new c();
        }
        this.mHandler.postDelayed(this.vipShopRunnable, 10000L);
        if (this.messageChannel == null) {
            this.messageChannel = new mmi(this.mContext, "member_auth_poplayer", new d());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        sjr.g().c("com.taobao.taolive.room.goods_list_showing", Boolean.FALSE, observeUniqueIdentification());
        HashMap hashMap = new HashMap();
        hashMap.put("isOpen", "false");
        if (kkr.i().g() != null) {
            kkr.i().g().i("TBLiveWeex.Event.goodListStatus", hashMap);
        }
        updateSjsdPopStatus(false);
        hideGoodsSmartlanding();
        sjr.g().c("com.taobao.taolive.room.enable_updown_switch", null, observeUniqueIdentification());
        sjr.g().c(uyg.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER, TAG, observeUniqueIdentification());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("scene", TAG);
        hashMap2.put("isMoveUp", "false");
        sjr.g().c(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap2, observeUniqueIdentification());
        new ExpansionRPGetter().d(this.mGoodLiveContext);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public void onEvent(String str, Object obj) {
        long j;
        HashMap<String, String> hashMap;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if (uyg.EVENT_SHOW_GOODSPACKAGE.equals(str)) {
            JSONArray jSONArray = null;
            if (obj instanceof HashMap) {
                HashMap<String, String> hashMap2 = (HashMap) obj;
                z = yqq.h(hashMap2.get("show_item_group"));
                hashMap = hashMap2;
                j = yqq.m(hashMap2.get("bizTopItemId"));
            } else {
                j = 0;
                hashMap = null;
                z = false;
            }
            if (!(this.mGoodLiveContext == null || hashMap == null)) {
                String str2 = hashMap.get("expansionRedPacketList");
                if ((yqq.i(hashMap.get("updateExpansionRedPacketFlag"), false) || !TextUtils.isEmpty(str2)) && wda.c()) {
                    if (!TextUtils.isEmpty(str2)) {
                        jSONArray = fkx.b(str2);
                    }
                    this.mGoodLiveContext.j().Q(jSONArray);
                }
                if (yqq.i(hashMap.get(LoginConstants.SHOW_TOAST), false)) {
                    new xn8((ViewGroup) this.mCover.getParent()).e();
                }
            }
            show(z, hashMap, j, false);
        } else if (uyg.EVENT_SHOW_GOODSPACKAGE_DISMISS.equals(str) || "com.taobao.taolive.room.hide_goods_list".equals(str)) {
            hide();
        } else if ("com.taobao.taolive.goods.open.shop_vip".equals(str)) {
            if (obj instanceof LiveItem) {
                goodsOpenShopVip((LiveItem) obj);
            }
        } else if ("com.taobao.taolive.goods.preset.topitem".equals(str)) {
            if ((obj instanceof JSONObject) && vvs.b("goodlist", "enablePresetGoodsListOpenBizTopItem", true)) {
                this.presetTopItemId = ((JSONObject) obj).getString("itemId");
            }
        } else if (str.equals("com.taobao.taolive.room.hide_goods_list.out")) {
            hide();
        } else if ("com.taobao.taolive.inside.detail.open".equals(str)) {
            sjr.g().c(uyg.EVENT_CLEAR_SCREEN_IMMERSIVE, bia.UNDER_TAKE_INSIDE_DETAIL, observeUniqueIdentification());
        } else if ("com.taobao.taolive.inside.detail.close".equals(str)) {
            sjr.g().c(uyg.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER, bia.UNDER_TAKE_INSIDE_DETAIL, observeUniqueIdentification());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.mac
    public void show(boolean z, HashMap<String, String> hashMap, long j, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb45d33", new Object[]{this, new Boolean(z), hashMap, new Long(j), new Boolean(z2)});
            return;
        }
        super.show(z, hashMap, j, z2);
        sjr.g().c("com.taobao.taolive.room.goods_list_showing", Boolean.TRUE, observeUniqueIdentification());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isOpen", "true");
        if (kkr.i().g() != null) {
            kkr.i().g().i("TBLiveWeex.Event.goodListStatus", hashMap2);
        }
        this.behavior = null;
        this.popId = null;
        if (hashMap != null && !TextUtils.isEmpty(hashMap.get("from"))) {
            this.behavior = hashMap.get("behavior");
            this.popId = hashMap.get("popId");
            "wyswyg".equals(hashMap.get("from"));
        }
        updateSjsdPopStatus(true);
        if (this.mFrameContext.A() != null) {
            this.mFrameContext.A().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
        }
        sjr.g().c(uyg.EVENT_CLEAR_SCREEN_IMMERSIVE, TAG, observeUniqueIdentification());
        HashMap hashMap3 = new HashMap();
        hashMap3.put("scene", TAG);
        hashMap3.put("isMoveUp", "true");
        sjr.g().c(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap3, observeUniqueIdentification());
    }
}
