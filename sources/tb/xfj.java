package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;
import tb.i0m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xfj implements beb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements i0m.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l8d f31353a;

        public a(xfj xfjVar, l8d l8dVar) {
            this.f31353a = l8dVar;
        }

        @Override // tb.i0m.b
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                return;
            }
            l8d l8dVar = this.f31353a;
            if (l8dVar != null) {
                l8dVar.onDenied();
            }
        }

        @Override // tb.i0m.b
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
                return;
            }
            l8d l8dVar = this.f31353a;
            if (l8dVar != null) {
                l8dVar.onGranted();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements i0m.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l8d f31354a;

        public b(xfj xfjVar, l8d l8dVar) {
            this.f31354a = l8dVar;
        }

        @Override // tb.i0m.b
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                return;
            }
            l8d l8dVar = this.f31354a;
            if (l8dVar != null) {
                l8dVar.onDenied();
            }
        }

        @Override // tb.i0m.b
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
                return;
            }
            l8d l8dVar = this.f31354a;
            if (l8dVar != null) {
                l8dVar.onGranted();
            }
        }
    }

    static {
        t2o.a(779093258);
        t2o.a(806356109);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1214e422", new Object[]{this});
        } else {
            sjr.g().c(uyg.EVENT_CLEAR_SCREEN_NEW, Boolean.FALSE, vx9.e());
        }
    }

    @Override // tb.beb
    public void b(ux9 ux9Var, qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee945d6c", new Object[]{this, ux9Var, qt9Var});
        } else {
            rbu.m(vx9.d(), qt9Var);
        }
    }

    @Override // tb.beb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb56c083", new Object[]{this});
        } else {
            sjr.g().c("com.taobao.taolive.room.hide_goods_list", null, vx9.e());
        }
    }

    @Override // tb.beb
    public void d(ux9 ux9Var, Context context, Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4dffa2", new Object[]{this, ux9Var, context, map, str, str2});
            return;
        }
        a();
        if (!TextUtils.isEmpty(str) && map != null && !j5m.l("true", str)) {
            map.put("bizData", str2);
            vkr.e(vx9.d(), iba.c(context, vx9.f(vx9.d())), str, map);
            vkr.a("MyActionAdapter_addContainer");
        }
    }

    @Override // tb.beb
    public void e(ux9 ux9Var, yac yacVar, Context context, LiveItem liveItem, String str, String str2) {
        boolean z;
        Map<String, String> map;
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff7502f", new Object[]{this, ux9Var, yacVar, context, liveItem, str, str2});
        } else if (liveItem != null && !TextUtils.isEmpty(str2)) {
            if (yacVar != null) {
                yacVar.a(liveItem);
            }
            cba cbaVar = (cba) vx9.f(vx9.d());
            String str3 = "goodstimemove";
            if (cbaVar != null) {
                if (TextUtils.isEmpty(cbaVar.F)) {
                    cbaVar.F = mxa.b(iba.B(vx9.f(vx9.d())));
                }
                if (uwa.p() && !TextUtils.isEmpty(cbaVar.F)) {
                    str3 = "goodstimemove." + cbaVar.F;
                }
                z = cbaVar.e0();
            } else {
                z = false;
            }
            if (ux9Var != null) {
                aTaoLiveOpenEntity = ux9Var.A();
                map = ux9Var.D();
            } else {
                aTaoLiveOpenEntity = null;
                map = null;
            }
            if (!pvs.m0() || aTaoLiveOpenEntity == null || ((!TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString().equals(aTaoLiveOpenEntity.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString().equals(aTaoLiveOpenEntity.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(aTaoLiveOpenEntity.bizCode)) || RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(cxa.f17408a))) {
                if (pvs.c0() && aTaoLiveOpenEntity != null && TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(aTaoLiveOpenEntity.bizCode)) {
                    long j = liveItem.itemId;
                    if (j > 0) {
                        String valueOf = String.valueOf(j);
                        String str4 = liveItem.liveId;
                        Object obj = aTaoLiveOpenEntity.params;
                        if (obj instanceof JSONObject) {
                            String string = ((JSONObject) obj).getString("seller_id");
                            String string2 = ((JSONObject) aTaoLiveOpenEntity.params).getString("shop_id");
                            String string3 = ((JSONObject) aTaoLiveOpenEntity.params).getString("shop_spm");
                            if (!TextUtils.isEmpty(liveItem.liveId) && !TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                                voj.a(context, "https://m.taobao.com/app/shop-conainer/contentlistpage.html?seller_id=" + string + "&shop_id=" + string2 + "&first_media_id=" + valueOf + "&first_media_scene=6671&source=shop&bizScene=livePointTab3&liveId=" + str4 + "&spm=" + string3 + "&livesource=liveshop.shoptab3_live");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                JSONObject jSONObject = liveItem.personalityData;
                String string4 = jSONObject != null ? jSONObject.getString("spfPlayVideo") : null;
                if (!"2".equals(str2)) {
                    if (RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(cxa.f17408a) && !"itemAggregation".equalsIgnoreCase(qfa.d(liveItem)) && !"search".equalsIgnoreCase(qfa.d(liveItem))) {
                        z2 = true;
                    }
                    if (qfa.e(str2, z2)) {
                        d9m.n().setListCacheData(yacVar, liveItem.liveId, Long.toString(liveItem.itemId));
                    }
                }
                if (ux9Var != null && ux9Var.g) {
                    eba.c(context, liveItem.liveId, Uri.encode(cxa.b(liveItem)), str3, str, string4);
                } else if ("2".equals(str2)) {
                    new sya(vx9.d()).j();
                    if (up6.y0(vx9.d())) {
                        r(liveItem, context, str3, ux9Var);
                    } else {
                        cxa.c(liveItem.liveId, String.valueOf(liveItem.itemId), string4, str3);
                    }
                } else if (up6.y0(vx9.d())) {
                    r(liveItem, context, str3, ux9Var);
                } else {
                    eba.c(context, liveItem.liveId, Uri.encode(cxa.b(liveItem)), str3, str, string4);
                }
            } else {
                String valueOf2 = String.valueOf(liveItem.itemId);
                String str5 = liveItem.liveId;
                if (map != null) {
                    String str6 = map.get("spm");
                    if (!TextUtils.isEmpty(liveItem.liveId) && !TextUtils.isEmpty(valueOf2)) {
                        StringBuilder sb = new StringBuilder("https://h5.m.taobao.com/taolive/video.html?forceRefresh=true&productType=timemove&sjsdItemId=");
                        sb.append(valueOf2);
                        sb.append("&id=");
                        sb.append(str5);
                        if (rbu.r(ux9Var) != null) {
                            sb.append("&spm=");
                            sb.append(rbu.r(ux9Var));
                        }
                        if (map.get("livesource") != null) {
                            sb.append("&livesourcePre=");
                            sb.append(map.get("livesource"));
                        }
                        if (str6 != null) {
                            sb.append("&spmPre=");
                            sb.append(str6);
                        }
                        if (map.get("scm") != null) {
                            sb.append("&scmPre=");
                            sb.append(map.get("scm"));
                        }
                        if (map.get(yj4.PARAM_UT_PARAMS) != null) {
                            sb.append("&utparamPre=");
                            sb.append(Uri.encode(map.get(yj4.PARAM_UT_PARAMS)));
                        }
                        sb.append("&livesource=");
                        sb.append(str3);
                        sb.append("&isLiveMute=");
                        sb.append(z);
                        Nav.from(context).toUri(sb.toString());
                    }
                }
            }
        }
    }

    @Override // tb.beb
    public void f(ux9 ux9Var, Context context, String str, String str2, long j, long j2, long j3, l8d l8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d84532", new Object[]{this, ux9Var, context, str, str2, new Long(j), new Long(j2), new Long(j3), l8dVar});
        } else {
            gq0.d().b(context, str, str2, j, j2, j3, new a(this, l8dVar));
        }
    }

    @Override // tb.beb
    public void g(ux9 ux9Var, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca2abf9", new Object[]{this, ux9Var, str, obj});
        } else {
            sjr.g().c(str, obj, vx9.e());
        }
    }

    @Override // tb.beb
    public void h(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, Map<String, String> map) {
        String str2;
        JSONObject jSONObject;
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0368380", new Object[]{this, ux9Var, activity, liveItem, str, map});
            return;
        }
        if (ux9Var != null && (ux9Var.k() instanceof yac)) {
            ((yac) ux9Var.k()).a(liveItem);
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
            if (!map.containsKey("channel")) {
                hashMap.put("channel", "goods");
            }
        }
        if (pvs.c3()) {
            str2 = "dx";
        } else {
            str2 = "weex";
        }
        hashMap.put("itemlistType", str2);
        if (!(liveItem == null || (ext = liveItem.extendVal) == null)) {
            hashMap.put("isYanxuan", ext.isYanxuan);
        }
        if (!(liveItem == null || (jSONObject = liveItem.liveItemStatusData) == null || !jSONObject.containsKey("isDownShelf"))) {
            hashMap.put("isDownShelf", liveItem.liveItemStatusData.getString("isDownShelf"));
        }
        qfa.b(hashMap, liveItem);
        if (TextUtils.isEmpty(str)) {
            str = "detail";
        }
        u90.i(activity, liveItem, str, hashMap);
    }

    @Override // tb.beb
    public boolean i(ux9 ux9Var, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20d49ae4", new Object[]{this, ux9Var, liveItem})).booleanValue();
        }
        if (liveItem != null) {
            return qvs.N(liveItem);
        }
        return false;
    }

    @Override // tb.beb
    public void j(ux9 ux9Var, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1edde7", new Object[]{this, ux9Var, liveItem});
            return;
        }
        a();
        sjr.g().c("com.taobao.taolive.goods.open.shop_vip", liveItem, vx9.e());
    }

    @Override // tb.beb
    public void k(ux9 ux9Var, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dddf56", new Object[]{this, ux9Var, jSONObject, new Boolean(z)});
            return;
        }
        a();
        sjr.g().c("com.taobao.taolive.room.hide_goods_list", null, vx9.e());
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("clientInteracts", jSONObject);
            vkr.d(vx9.d(), "@ali/alivemodx-live-rights-panel", hashMap);
            return;
        }
        vkr.b(vx9.d(), "TBLiveWeex.Event.RightsPanelShow", "");
    }

    @Override // tb.beb
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c7dbe0", new Object[]{this});
        } else {
            mmr.p().l();
        }
    }

    @Override // tb.beb
    public boolean m(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fc2cf8", new Object[]{this, ux9Var, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        qt9 qt9Var = new qt9();
        qt9Var.f26917a = str;
        return v2s.o().k().e(qt9Var);
    }

    @Override // tb.beb
    public void n(ux9 ux9Var, Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7f5d68", new Object[]{this, ux9Var, context, str, str2, jSONObject});
            return;
        }
        a();
        sjr.g().c("com.taobao.taolive.room.hide_goods_list", null, vx9.e());
        HashMap hashMap = new HashMap();
        hashMap.put("dxAction", str);
        hashMap.put(ksl.PARSER_KEY_DX_DATA, jSONObject);
        hashMap.put("fromSource", vrp.BIZ_GOODS_LIST);
        vkr.d(vx9.d(), str2, hashMap);
    }

    @Override // tb.beb
    public void o(ux9 ux9Var, Context context, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bedb164", new Object[]{this, ux9Var, context, str, map});
            return;
        }
        a();
        vkr.d(vx9.d(), str, map);
    }

    @Override // tb.beb
    public void p(ux9 ux9Var, Context context, String str, long j, long j2, l8d l8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97aef2f2", new Object[]{this, ux9Var, context, str, new Long(j), new Long(j2), l8dVar});
        } else {
            gq0.d().a(context, str, j, j2, new b(this, l8dVar));
        }
    }

    @Override // tb.beb
    public void q(ux9 ux9Var, Context context, int i, LiveItem liveItem, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9592391f", new Object[]{this, ux9Var, context, new Integer(i), liveItem, map});
            return;
        }
        if (ux9Var != null && (ux9Var.k() instanceof yac)) {
            ((yac) ux9Var.k()).a(liveItem);
        }
        HashMap hashMap = new HashMap();
        if (map == null || !map.containsKey("channel")) {
            hashMap.put("channel", "goods");
        } else {
            hashMap.put("channel", map.get("channel"));
        }
        if (map != null && map.containsKey("bottomMode")) {
            hashMap.put("sourceType", jj2.a(map.get("bottomMode")));
        }
        if (map != null && map.containsKey("scene")) {
            hashMap.put("scene", map.get("scene"));
        }
        if (pvs.c3()) {
            str = "dx";
        } else {
            str = "weex";
        }
        hashMap.put("itemlistType", str);
        if (map.containsKey("isYanxuan")) {
            hashMap.put("isYanxuan", map.get("isYanxuan"));
        }
        qfa.b(hashMap, liveItem);
        u90.a((Activity) context, i, liveItem, hashMap);
    }

    public final void r(LiveItem liveItem, Context context, String str, ux9 ux9Var) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea900de9", new Object[]{this, liveItem, context, str, ux9Var});
            return;
        }
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(ext.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
            cxa.a(gxa.a(liveItem, timeMovingPlayInfo, null, ux9Var), context, ux9Var);
            sjr.g().c("com.taobao.taolive.room.hide_goods_list", null, vx9.e());
            HashMap hashMap = new HashMap();
            hashMap.put("timeMovingId", timeMovingPlayInfo.timeMovingId);
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            hashMap.put("timeShiftSoure", "goodsList");
            if (dxa.b(ux9Var).l() != null) {
                dxa.b(ux9Var).l().h(hashMap, false, null);
                iba.W0(str, vx9.f(ux9Var));
            }
        }
    }
}
