package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eh6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_GOODS_EXPLOSION_ITEM_CLICK_EVENT = 253104938849917020L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18576a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ xea c;

        public a(eh6 eh6Var, Context context, LiveItem liveItem, xea xeaVar) {
            this.f18576a = context;
            this.b = liveItem;
            this.c = xeaVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_goods_explosion_item_click_eventEventHandler$1");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a1u.a(this.f18576a, kkr.i().h);
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            if (!(netResponse == null || netResponse.getDataJsonObject() == null)) {
                try {
                    if (netResponse.getDataJsonObject().getBoolean("result")) {
                        a1u.a(this.f18576a, kkr.i().g);
                        JSONObject jSONObject = this.b.personalityData;
                        if (jSONObject != null) {
                            jSONObject.put("goodsSubscribeStatus", (Object) "103");
                        }
                        j3a.a(this.c, this.b);
                        wem.a(this.f18576a);
                        return;
                    }
                } catch (Throwable th) {
                    o3s.b("Handler_explosion", th.getMessage());
                }
            }
            a1u.a(this.f18576a, kkr.i().h);
        }
    }

    static {
        t2o.a(295698948);
    }

    public static /* synthetic */ Object ipc$super(eh6 eh6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_goods_explosion_item_click_eventEventHandler");
    }

    public final boolean f(ux9 ux9Var, xea xeaVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9f84deb", new Object[]{this, ux9Var, xeaVar, liveItem})).booleanValue();
        }
        if (!or.a(ux9Var, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) || !yga.p()) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        if (liveItem != null) {
            jSONObject.put("itemId", (Object) Long.valueOf(liveItem.itemId));
        }
        sjr.g().c("com.taobao.taolive.goods.pop.card.click", jSONObject, xea.E(xeaVar));
        return true;
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    public static void d(LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4243e095", new Object[]{liveItem, jSONObject});
        } else {
            iha.s("小卡", liveItem, false, jSONObject);
        }
    }

    public static void e(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6eca748", new Object[]{liveItem});
        } else {
            iha.s("小卡", liveItem, true, null);
        }
    }

    public static void g(LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac7d41d", new Object[]{liveItem, jSONObject});
        } else {
            iha.t("小卡", liveItem, false, jSONObject);
        }
    }

    public static void h(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e0bad0", new Object[]{liveItem});
        } else {
            iha.t("小卡", liveItem, true, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        char c;
        String str;
        String str2;
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
            return;
        }
        try {
            Context h = dXRuntimeContext.h();
            String str3 = (String) objArr[0];
            LiveItem liveItem2 = (LiveItem) fkx.f(((JSONObject) objArr[1]).toJSONString(), LiveItem.class);
            String p = pfa.p(liveItem2);
            ux9 d = vx9.d();
            String C = d == null ? null : d.C();
            switch (str3.hashCode()) {
                case -1149096095:
                    if (str3.equals(to8.ADD_CART)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -916322262:
                    if (str3.equals("hotItemSubscribe")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -738239289:
                    if (str3.equals("explosionGoodsClick")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -482995928:
                    if (str3.equals("closeCard")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 249802644:
                    if (str3.equals(to8.GOTO_DETAIL)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 518825989:
                    if (str3.equals("askForTimeShift")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 632969974:
                    if (str3.equals("showCaseUpdate")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 753037975:
                    if (str3.equals("showGoodsList")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str4 = "2";
            switch (c) {
                case 0:
                    if (f(d, xeaVar, liveItem2)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("msg", (Object) "店铺分发");
                        g(liveItem2, jSONObject);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("laiyuan", str4);
                    LiveItem.Ext ext = liveItem2.extendVal;
                    if (ext == null || !"secKill".equals(ext.itemBizType)) {
                        str4 = "1";
                    }
                    hashMap.put("bubbleType", str4);
                    HashMap hashMap2 = new HashMap();
                    if (dXRuntimeContext.p() != null) {
                        if (TextUtils.equals("taolive_goods_small_card", dXRuntimeContext.p().f7343a)) {
                            str = "small";
                        } else {
                            str = pg1.ATOM_EXT_big;
                        }
                        hashMap2.put("explaincard_cardtype", str);
                    }
                    liveItem2.cpsClickPos = pfa.j(liveItem2, false, null);
                    dvp.c(xeaVar, liveItem2, hashMap2);
                    if (kkr.i().d() != null) {
                        kkr.i().d().h(xeaVar == null ? null : xeaVar.q(), (Activity) h, liveItem2, z9u.CLICK_SHOW_CASE, hashMap);
                    }
                    pfa.V(liveItem2);
                    h(liveItem2);
                    return;
                case 1:
                    if (f(d, xeaVar, liveItem2)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("msg", (Object) "店铺分发");
                        d(liveItem2, jSONObject2);
                        return;
                    }
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("scene", p);
                    hashMap3.put("laiyuan", str4);
                    LiveItem.Ext ext2 = liveItem2.extendVal;
                    if (ext2 == null || !"secKill".equals(ext2.itemBizType)) {
                        str4 = "1";
                    }
                    hashMap3.put("bubbleType", str4);
                    liveItem2.clickSource = pfa.l(liveItem2, "card");
                    if (objArr.length > 3) {
                        str2 = (String) objArr[3];
                    } else {
                        str2 = "";
                    }
                    liveItem2.cpsClickPos = pfa.j(liveItem2, true, str2);
                    he7.a(xeaVar, liveItem2, false, false, "");
                    if (!kkr.i().r(xeaVar) || kkr.i().d() == null) {
                        if (liveItem2.extendVal == null || kkr.i().d() == null) {
                            liveItem = liveItem2;
                            d(liveItem, null);
                        } else {
                            if (pfa.f(liveItem2)) {
                                if (objArr.length > 3) {
                                    hashMap3.put("bottomMode", (String) objArr[3]);
                                }
                                hha.c("Handler_explosion", "handleEvent | addCart, bottomMode=" + ((String) hashMap3.get("bottomMode")) + "    liveId=" + liveItem2.liveId + "   itemId=" + liveItem2.itemId);
                                liveItem = liveItem2;
                                kkr.i().d().q(xeaVar == null ? null : xeaVar.q(), h, 10000, liveItem, hashMap3);
                            } else {
                                liveItem = liveItem2;
                                if (!pfa.H(liveItem) || !ijr.d()) {
                                    hha.c("Handler_explosion", "handleEvent | goToDetail, liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                                    kkr.i().d().h(xeaVar == null ? null : xeaVar.q(), (Activity) h, liveItem, "detail", hashMap3);
                                } else {
                                    if (objArr.length > 3) {
                                        hashMap3.put("bottomMode", (String) objArr[3]);
                                    }
                                    hha.c("Handler_explosion", "handleEvent liveShop good | addCart, bottomMode=" + ((String) hashMap3.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                                    kkr.i().d().q(xeaVar == null ? null : xeaVar.q(), h, 10000, liveItem, hashMap3);
                                }
                            }
                            e(liveItem);
                        }
                        pfa.V(liveItem);
                        return;
                    }
                    kkr.i().d().h(xeaVar == null ? null : xeaVar.q(), (Activity) h, liveItem2, "detail", hashMap3);
                    return;
                case 2:
                    new w7n(new a(this, h, liveItem2, xeaVar)).K(zqq.h(liveItem2.liveId), liveItem2.itemId, zqq.h(kkr.i().c(xeaVar)));
                    HashMap<String, String> hashMap4 = new HashMap<>();
                    hashMap4.put("item_id", String.valueOf(liveItem2.itemId));
                    hashMap4.put("scene", p);
                    if (kkr.i().o() != null) {
                        kkr.i().o().c("kaijiangtixing", hashMap4);
                        return;
                    }
                    return;
                case 3:
                    dvp.b(xeaVar, liveItem2, zqq.j(objArr[2].toString()));
                    bia.d(xeaVar, liveItem2.itemId);
                    return;
                case 4:
                    sjr.g().c("com.taobao.taolive.goods.showcase.close", null, C);
                    if (kkr.i().o() != null) {
                        HashMap<String, String> hashMap5 = new HashMap<>();
                        if (objArr.length >= 3) {
                            Object obj = objArr[2];
                            if (obj instanceof String) {
                                hashMap5.put("closeSource", (String) obj);
                            }
                        }
                        kkr.i().o().c("CloseRightCardClick", hashMap5);
                    }
                    hha.c("Handler_explosion", "closeCard");
                    return;
                case 5:
                    sjr.g().c("com.taobao.taolive.goods.showcase.update", liveItem2, C);
                    return;
                case 6:
                    if (!f(d, xeaVar, liveItem2) && nh4.r0()) {
                        noo.F(liveItem2.itemId);
                        return;
                    }
                    return;
                case 7:
                    if (nh4.W() && objArr.length >= 3) {
                        Object obj2 = objArr[2];
                        if (obj2 instanceof String) {
                            String str5 = (String) obj2;
                            o6b.c(xeaVar, liveItem2, str5);
                            o6b.d(xeaVar, liveItem2, str5);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }
}
