package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ch6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_ADDTOCART = 5119113208634763883L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements deb<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17059a;
        public final /* synthetic */ xea b;
        public final /* synthetic */ LiveItem c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ Object[] e;

        public a(Context context, xea xeaVar, LiveItem liveItem, JSONObject jSONObject, Object[] objArr) {
            this.f17059a = context;
            this.b = xeaVar;
            this.c = liveItem;
            this.d = jSONObject;
            this.e = objArr;
        }

        /* renamed from: a */
        public void onResult(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63ce410a", new Object[]{this, bool});
            } else if (bool.booleanValue()) {
                ch6.d(ch6.this, this.f17059a, this.b, this.c, this.d, this.e);
            } else {
                hha.b("Handler_addToCart", "handleEvent | result is false.");
                ch6.e(this.c, null);
            }
        }

        @Override // tb.deb
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            hha.c("Handler_addToCart", "handleEvent.onError | liveId=" + this.c.liveId + "   itemId=" + this.c.itemId);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("s", (Object) str);
            jSONObject.put("s1", (Object) str2);
            ch6.e(this.c, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f17060a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Map d;

        public b(ch6 ch6Var, xea xeaVar, LiveItem liveItem, Context context, Map map) {
            this.f17060a = xeaVar;
            this.b = liveItem;
            this.c = context;
            this.d = map;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -83293931) {
                super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_addToCartEventHandler$2");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onSystemError(i, netResponse, obj);
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            super.onSuccess(i, netResponse, netBaseOutDo, obj);
            MemberCheckResponseData data = ((MemberCheckResponse) netBaseOutDo).getData();
            if (kkr.i().d() != null) {
                ux9 ux9Var = null;
                if (data == null || TextUtils.isEmpty(data.shopMember) || !"false".equalsIgnoreCase(data.shopMember)) {
                    LiveItem liveItem = this.b;
                    if (liveItem != null && liveItem.extendVal != null) {
                        beb d = kkr.i().d();
                        xea xeaVar = this.f17060a;
                        if (xeaVar != null) {
                            ux9Var = xeaVar.q();
                        }
                        d.h(ux9Var, (Activity) this.c, this.b, "detail", this.d);
                        return;
                    }
                    return;
                }
                beb d2 = kkr.i().d();
                xea xeaVar2 = this.f17060a;
                if (xeaVar2 != null) {
                    ux9Var = xeaVar2.q();
                }
                d2.j(ux9Var, this.b);
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            ux9 q;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            LiveItem liveItem = this.b;
            if (liveItem != null && liveItem.extendVal != null && kkr.i().d() != null) {
                beb d = kkr.i().d();
                xea xeaVar = this.f17060a;
                if (xeaVar == null) {
                    q = null;
                } else {
                    q = xeaVar.q();
                }
                d.h(q, (Activity) this.c, this.b, "detail", this.d);
            }
        }
    }

    static {
        t2o.a(295698945);
    }

    public static /* synthetic */ void d(ch6 ch6Var, Context context, xea xeaVar, LiveItem liveItem, JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf93c4d2", new Object[]{ch6Var, context, xeaVar, liveItem, jSONObject, objArr});
        } else {
            ch6Var.h(context, xeaVar, liveItem, jSONObject, objArr);
        }
    }

    public static /* synthetic */ void e(LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82daae7d", new Object[]{liveItem, jSONObject});
        } else {
            f(liveItem, jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(ch6 ch6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_addToCartEventHandler");
    }

    public final void h(Context context, xea xeaVar, LiveItem liveItem, JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebeeb435", new Object[]{this, context, xeaVar, liveItem, jSONObject, objArr});
            return;
        }
        String p = pfa.p(liveItem);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("scene", (Object) p);
        g(liveItem, jSONObject2);
        xeaVar.a(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("scene", p);
        String str = "2";
        hashMap.put("laiyuan", str);
        String string = jSONObject.getString("item_position");
        hashMap.put("item_position", string);
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext == null || !"secKill".equals(ext.itemBizType)) {
            str = "1";
        }
        LiveItem.Ext ext2 = liveItem.extendVal;
        if (ext2 != null) {
            hashMap.put("isYanxuan", ext2.isYanxuan);
        }
        hashMap.put("bubbleType", str);
        String str2 = objArr.length >= 2 ? (String) objArr[1] : null;
        liveItem.clickSource = pfa.l(liveItem, vrp.BIZ_GOODS_LIST);
        liveItem.cpsClickPos = pfa.j(liveItem, true, objArr.length >= 3 ? (String) objArr[2] : "");
        i(xeaVar, liveItem, str2, string);
        if (kkr.i().r(xeaVar) && kkr.i().d() != null) {
            kkr.i().d().h(xeaVar.q(), (Activity) context, liveItem, "detail", hashMap);
        } else if (!kkr.i().r(xeaVar) && !TextUtils.isEmpty(str2) && "shopVipEntrance".equals(str2)) {
            kkr.i().z(xeaVar, false);
            sjr.g().c("com.taobao.taolive.room.hide_goods_list.out", null, xea.E(xeaVar));
            j3a.b(xeaVar, liveItem);
            new iki(new b(this, xeaVar, liveItem, context, hashMap)).K(liveItem.extendVal.anchorId, liveItem.liveId);
        } else if (kkr.i().d() == null) {
        } else {
            if (pfa.f(liveItem)) {
                if (objArr.length >= 3) {
                    hashMap.put("bottomMode", (String) objArr[2]);
                }
                hha.c("Handler_addToCart", "handleEvent | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                kkr.i().d().q(xeaVar.q(), (Activity) context, 10000, liveItem, hashMap);
            } else if (!pfa.H(liveItem) || !ijr.d()) {
                hha.c("Handler_addToCart", "handleEvent | goToDetail, liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                kkr.i().d().h(xeaVar.q(), (Activity) context, liveItem, "detail", hashMap);
            } else {
                if (objArr.length >= 3) {
                    hashMap.put("bottomMode", (String) objArr[2]);
                }
                hha.c("Handler_addToCart", "handleEvent liveShop good | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                kkr.i().d().q(xeaVar.q(), context, 10000, liveItem, hashMap);
            }
        }
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

    public static void f(LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4243e095", new Object[]{liveItem, jSONObject});
        } else {
            iha.s("口袋列表", liveItem, false, jSONObject);
        }
    }

    public static void g(LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff219ca8", new Object[]{liveItem, jSONObject});
        } else {
            iha.s("口袋列表", liveItem, true, jSONObject);
        }
    }

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[0];
            Context h = dXRuntimeContext.h();
            LiveItem liveItem = (LiveItem) fkx.f(jSONObject.toJSONString(), LiveItem.class);
            pfa.b(xeaVar, liveItem);
            JSONObject jSONObject2 = liveItem.itemActionData;
            if (jSONObject2 == null || !jSONObject2.containsKey("userBehaviorEvents")) {
                h(h, xeaVar, liveItem, jSONObject, objArr);
            } else {
                String string = liveItem.itemActionData.getString("userBehaviorEvents");
                if (TextUtils.isEmpty(string) || !wg6.i(string, '@', "userbuy")) {
                    h(h, xeaVar, liveItem, jSONObject, objArr);
                } else {
                    new xa3().d(xeaVar, liveItem, new a(h, xeaVar, liveItem, jSONObject, objArr));
                }
            }
            if (nh4.T0()) {
                sjr.g().c("com.taobao.taolive.room.addcart", Long.valueOf(liveItem.itemId), xeaVar.F());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("exception", (Object) th.toString());
            f(null, jSONObject3);
        }
    }

    public final void i(xea xeaVar, LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9529ef", new Object[]{this, xeaVar, liveItem, str, str2});
        } else if ("newcart".equals(str)) {
            HashMap<String, String> hashMap = new HashMap<>();
            qfa.b(hashMap, liveItem);
            kkr.i().o().c("newcart", hashMap);
            he7.a(xeaVar, liveItem, true, true, str2);
        } else {
            he7.a(xeaVar, liveItem, true, false, str2);
        }
    }
}
