package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class le0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements deb<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f23283a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public a(xea xeaVar, LiveItem liveItem, String str, String str2, String str3) {
            this.f23283a = xeaVar;
            this.b = liveItem;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        /* renamed from: a */
        public void onResult(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfd30c6d", new Object[]{this, str});
                return;
            }
            hha.b("AddCartHelper", "onResult | s=" + str);
            le0.a(le0.this, this.f23283a, null, this.b, this.c, this.d, this.e);
        }

        @Override // tb.deb
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            hha.b("AddCartHelper", "s=" + str + "   msg=" + str2);
            a1u.a(this.f23283a.i(), str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f23284a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Map d;

        public b(le0 le0Var, xea xeaVar, LiveItem liveItem, Context context, Map map) {
            this.f23284a = xeaVar;
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/hanlerimpl/AddCartHelper$2");
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
            if (kkr.i().d() == null) {
                return;
            }
            if (data != null && !TextUtils.isEmpty(data.shopMember) && "false".equalsIgnoreCase(data.shopMember)) {
                kkr.i().d().j(this.f23284a.q(), this.b);
            } else if (this.b.extendVal != null) {
                kkr.i().d().h(this.f23284a.q(), (Activity) this.c, this.b, "detail", this.d);
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (this.b.extendVal != null && kkr.i().d() != null) {
                kkr.i().d().h(this.f23284a.q(), (Activity) this.c, this.b, "detail", this.d);
            }
        }
    }

    static {
        t2o.a(295698972);
    }

    public static /* synthetic */ void a(le0 le0Var, xea xeaVar, JSONObject jSONObject, LiveItem liveItem, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414698", new Object[]{le0Var, xeaVar, jSONObject, liveItem, str, str2, str3});
        } else {
            le0Var.b(xeaVar, jSONObject, liveItem, str, str2, str3);
        }
    }

    public void c(xea xeaVar, LiveItem liveItem, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b0c0ea", new Object[]{this, xeaVar, liveItem, str, str2, str3});
        } else if (xeaVar == null || liveItem == null) {
            hha.b("AddCartHelper", "addCartAndCheckBySeckill | params empty.");
        } else {
            JSONObject d = fkx.d(liveItem.extendVal.secKillInfo);
            if (d == null) {
                hha.b("AddCartHelper", "addCartAndCheckBySeckill | secKillInfo is null.");
            } else {
                g7p.b(xeaVar, liveItem, d, new a(xeaVar, liveItem, str, str2, str3));
            }
        }
    }

    public final void b(xea xeaVar, JSONObject jSONObject, LiveItem liveItem, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14b6b9d", new Object[]{this, xeaVar, jSONObject, liveItem, str, str2, str3});
            return;
        }
        if (xeaVar != null) {
            try {
                if (xeaVar.i() != null) {
                    if (jSONObject == null && liveItem == null) {
                        hha.b("AddCartHelper", "addCart | liveDataJson,liveItem is null.");
                        return;
                    } else if (kkr.i().d() == null) {
                        hha.b("AddCartHelper", "addCart | adapter is null.");
                        return;
                    } else {
                        Context i = xeaVar.i();
                        if (liveItem == null) {
                            liveItem = (LiveItem) fkx.f(jSONObject.toJSONString(), LiveItem.class);
                        }
                        String p = pfa.p(liveItem);
                        HashMap hashMap = new HashMap();
                        hashMap.put("scene", p);
                        hashMap.put("item_position", str3);
                        LiveItem.Ext ext = liveItem.extendVal;
                        if (ext != null) {
                            hashMap.put("isYanxuan", ext.isYanxuan);
                        }
                        liveItem.clickSource = pfa.l(liveItem, vrp.BIZ_GOODS_LIST);
                        liveItem.cpsClickPos = pfa.j(liveItem, true, str2);
                        d(xeaVar, liveItem, str, str3);
                        if (kkr.i().r(xeaVar)) {
                            kkr.i().d().h(xeaVar.q(), (Activity) i, liveItem, "detail", hashMap);
                            return;
                        } else if (!TextUtils.isEmpty(str) && "shopVipEntrance".equals(str)) {
                            kkr.i().z(xeaVar, false);
                            sjr.g().c("com.taobao.taolive.room.hide_goods_list.out", null, xea.E(xeaVar));
                            j3a.b(xeaVar, liveItem);
                            new iki(new b(this, xeaVar, liveItem, i, hashMap)).K(liveItem.extendVal.anchorId, liveItem.liveId);
                            return;
                        } else if (pfa.f(liveItem)) {
                            if (!TextUtils.isEmpty(str2)) {
                                hashMap.put("bottomMode", str2);
                            }
                            hha.c("AddCartHelper", "handleEvent | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            kkr.i().d().q(xeaVar.q(), (Activity) i, 10000, liveItem, hashMap);
                            return;
                        } else if (!pfa.H(liveItem) || !ijr.d()) {
                            hha.c("AddCartHelper", "handleEvent | goToDetail, liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            kkr.i().d().h(xeaVar.q(), (Activity) i, liveItem, "detail", hashMap);
                            return;
                        } else {
                            if (!TextUtils.isEmpty(str2)) {
                                hashMap.put("bottomMode", str2);
                            }
                            hha.c("AddCartHelper", "handleEvent liveShop good | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            kkr.i().d().q(xeaVar.q(), (Activity) i, 10000, liveItem, hashMap);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        hha.b("AddCartHelper", "addCart | context is null.");
    }

    public final void d(xea xeaVar, LiveItem liveItem, String str, String str2) {
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
