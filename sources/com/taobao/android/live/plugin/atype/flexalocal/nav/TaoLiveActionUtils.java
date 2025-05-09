package com.taobao.android.live.plugin.atype.flexalocal.nav;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.business.BusinessUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONException;
import tb.b0d;
import tb.bia;
import tb.fee;
import tb.fkx;
import tb.geb;
import tb.itw;
import tb.jbt;
import tb.kkr;
import tb.kzb;
import tb.nh4;
import tb.o3s;
import tb.qfa;
import tb.rbf;
import tb.sjr;
import tb.t2o;
import tb.to8;
import tb.tsd;
import tb.up6;
import tb.ux9;
import tb.uyv;
import tb.v2s;
import tb.v7t;
import tb.vc;
import tb.vx9;
import tb.xbf;
import tb.yga;
import tb.yqq;
import tb.yts;
import tb.z9u;
import tb.zga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveActionUtils implements geb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_BULK_REQUEST_CODE = 20001;
    public static final int DETAIL_REQUEST_CODE = 20000;
    public boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public final String f8612a = nh4.r1();
    public final boolean b = nh4.k();
    public final boolean c = nh4.n();
    public final boolean d = nh4.n0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8613a;
        public final /* synthetic */ LiveItem b;

        public a(TaoLiveActionUtils taoLiveActionUtils, String str, LiveItem liveItem) {
            this.f8613a = str;
            this.b = liveItem;
        }

        public final HashMap<String, String> a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("9a4ffd95", new Object[]{this, new Boolean(z)});
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("accountId", this.f8613a);
            hashMap.put("bizType", this.b.extendVal.bizType);
            hashMap.put("itemId", Long.toString(this.b.itemId));
            hashMap.put("mtopSuccess", Boolean.toString(z));
            return hashMap;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (kkr.i().o() != null) {
                kkr.i().o().c("gotoCartForTaoke", a(false));
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (kkr.i().o() != null) {
                kkr.i().o().c("gotoCartForTaoke", a(true));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (kkr.i().o() != null) {
                kkr.i().o().c("gotoCartForTaoke", a(false));
            }
        }
    }

    static {
        t2o.a(295699523);
        t2o.a(806354962);
    }

    public static String B(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b630cde", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        int indexOf = str.indexOf(str2 + "=");
        if (indexOf == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, indexOf));
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        int indexOf2 = str.indexOf("&", indexOf);
        if (indexOf2 != -1) {
            sb.append(str.substring(indexOf2));
        }
        return sb.toString();
    }

    public static /* synthetic */ void d(TaoLiveActionUtils taoLiveActionUtils, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12fa087", new Object[]{taoLiveActionUtils, contentBusinessModel});
        } else {
            taoLiveActionUtils.z(contentBusinessModel);
        }
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f8506b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enablePVIDParams", "false"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8657af", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSpmLiveSourceParams", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("431f71d9", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableTCPParams", "false"));
    }

    public static Fragment t(ux9 ux9Var) {
        jbt jbtVar;
        Map<String, Object> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("d6b191eb", new Object[]{ux9Var});
        }
        if (ux9Var == null || ux9Var.A() == null || (jbtVar = ux9Var.A().taoliveOpenContext) == null || (map = jbtVar.f) == null || (obj = map.get("goDetailFragment")) == null) {
            return null;
        }
        return (Fragment) obj;
    }

    public static void y(Activity activity, ux9 ux9Var, String str, int i) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eaba0d5", new Object[]{activity, ux9Var, str, new Integer(i)});
            return;
        }
        if (ux9Var != null) {
            fragment = t(ux9Var);
        } else {
            fragment = null;
        }
        if (fragment != null) {
            Nav.from(activity).withFragment(fragment).forResult(i).toUri(str);
        } else {
            Nav.from(activity).forResult(i).toUri(str);
        }
    }

    public JSONObject C(ux9 ux9Var, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("837870f6", new Object[]{this, ux9Var, liveItem, map});
        }
        JSONObject tradeParamsJSON = liveItem.extendVal.getTradeParamsJSON();
        try {
            tradeParamsJSON = JSON.parseObject(liveItem.extendVal.tradeParams);
            if (map != null) {
                map.put("tradeParams", JSON.toJSONString(tradeParamsJSON));
            }
            m(up6.c0(ux9Var), tradeParamsJSON, liveItem);
            if (map != null) {
                map.put("useSignTradeParams", JSON.toJSONString(tradeParamsJSON));
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return tradeParamsJSON;
    }

    @Override // tb.geb
    public void a(ux9 ux9Var, Activity activity, LiveItem liveItem, int i, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91232728", new Object[]{this, ux9Var, activity, liveItem, new Integer(i), hashMap});
        } else {
            E(ux9Var, activity, liveItem, hashMap);
        }
    }

    @Override // tb.geb
    public void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a32c92", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    @Override // tb.geb
    public void c(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a83b1a0", new Object[]{this, ux9Var, activity, liveItem, str, hashMap});
        } else {
            F(ux9Var, activity, liveItem, hashMap);
        }
    }

    public void f(ContentBusinessModel contentBusinessModel, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8c4ef4", new Object[]{this, contentBusinessModel, jSONObject, map});
            return;
        }
        if (vx9.d() != null && !TextUtils.isEmpty(jSONObject.getString("liveId")) && vx9.a(jSONObject.getString("liveId"))) {
            map.put("liveToken", vx9.d().p());
        }
        String str = contentBusinessModel.sourceType;
        if (str != null) {
            map.put("sourceType", str);
        }
    }

    public final void g(ux9 ux9Var, JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea62d57", new Object[]{this, ux9Var, jSONObject, jSONObject2});
            return;
        }
        try {
            if (yqq.h(v2s.o().p().b("tblive", "enableAddLiveTokenTcp", "true")) && ux9Var != null && jSONObject != null && jSONObject2 != null && !TextUtils.isEmpty(jSONObject.getString("liveId")) && jSONObject.getString("liveId").equals(ux9Var.i)) {
                jSONObject2.put("liveToken", ux9Var.p());
            }
        } catch (Exception e) {
            o3s.b("TaoLiveActionUtils", e.getMessage());
        }
    }

    public final void h(ContentBusinessModel contentBusinessModel, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588d7f0c", new Object[]{this, contentBusinessModel, str, map});
        } else if (contentBusinessModel != null && contentBusinessModel.dataAttributes != null) {
            try {
                if (!yga.O()) {
                    return;
                }
                if (str != null) {
                    contentBusinessModel.dataAttributes.put("jumpTarget", str);
                } else if (map != null) {
                    String str2 = map.get("sourceType");
                    String str3 = "allBuy";
                    if (TextUtils.equals(str2, "2")) {
                        str3 = TBXSkuCore.CONTAINER_TYPE_NEWBUY;
                    } else if (TextUtils.equals(str2, "5")) {
                        str3 = "addBuy";
                    }
                    contentBusinessModel.dataAttributes.put("jumpTarget", str3);
                }
            } catch (JSONException e) {
                o3s.b("TaoLiveActionUtils", e.getMessage());
            }
        }
    }

    public final void i(VideoInfo videoInfo, ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f0444e", new Object[]{this, videoInfo, contentBusinessModel});
        } else if (contentBusinessModel != null && videoInfo != null && videoInfo.isOfficialType() && nh4.t0()) {
            contentBusinessModel.trackSource = "tblivegft";
            contentBusinessModel.trackSubSource = "tblivegft";
            if (contentBusinessModel.context == null) {
                contentBusinessModel.context = new org.json.JSONObject();
            }
            try {
                contentBusinessModel.context.put("officialLiveId", videoInfo.officialLiveInfo.officialLiveId);
            } catch (JSONException e) {
                o3s.b("TaoLiveActionUtils", "contentBusinessModel context put officialLiveId throw Exception " + e.getMessage());
            }
        }
    }

    public final void k(LiveItem liveItem, ContentBusinessModel contentBusinessModel, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363abe12", new Object[]{this, liveItem, contentBusinessModel, map});
        } else if (liveItem != null && contentBusinessModel != null) {
            if (!TextUtils.isEmpty(liveItem.cpsClickPos)) {
                try {
                    if (contentBusinessModel.context == null) {
                        contentBusinessModel.context = new org.json.JSONObject();
                    }
                    contentBusinessModel.context.putOpt("clickPos", liveItem.cpsClickPos);
                } catch (JSONException e) {
                    o3s.b("TaoLiveActionUtils", e.getMessage());
                }
            } else if (!TextUtils.isEmpty(map.get("highlight_card_clickPos")) && nh4.V()) {
                try {
                    if (contentBusinessModel.context == null) {
                        contentBusinessModel.context = new org.json.JSONObject();
                    }
                    contentBusinessModel.context.putOpt("clickPos", map.get("highlight_card_clickPos"));
                } catch (JSONException e2) {
                    o3s.b("TaoLiveActionUtils", e2.getMessage());
                }
            }
            VideoInfo c0 = up6.c0(vx9.d());
            if (c0 != null) {
                if (zga.e(c0.itemTransferInfo)) {
                    if (qfa.f(liveItem)) {
                        str = "pcg_recommand";
                    } else {
                        str = "pcg_self";
                    }
                    contentBusinessModel.actionSource = str;
                }
                if (map != null) {
                    map.put("actionSource", contentBusinessModel.actionSource);
                }
            }
        }
    }

    public String l(VideoInfo videoInfo, String str, LiveItem liveItem) {
        String sb;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5dd5ae5", new Object[]{this, videoInfo, str, liveItem});
        }
        if (!this.d) {
            v7t.d("TaoLiveActionUtils", "mEnableModifyNewtonsParams  is false.");
            return str;
        } else if (TextUtils.isEmpty(str) || liveItem == null) {
            return str;
        } else {
            String a2 = yts.a(str);
            if (TextUtils.isEmpty(a2)) {
                yts.d(str, "detail", liveItem);
                v7t.d("TaoLiveActionUtils", "appendSignNewtonParams url newtonParams is null.");
                return str;
            }
            String str3 = "?newtonParams=" + a2;
            String decode = Uri.decode(a2);
            StringBuilder sb2 = new StringBuilder(v(decode, liveItem));
            n(videoInfo, sb2);
            if (TextUtils.equals(decode, sb2.toString())) {
                v7t.d("TaoLiveActionUtils", "uSignNewtonParamsStr  is unchanging.");
                return str;
            }
            if (str.contains(str3)) {
                str2 = "?";
            } else {
                str2 = "&";
            }
            return yts.c(str, "newtonParams", str2 + "newtonParams=" + Uri.encode(sb));
        }
    }

    public final void m(VideoInfo videoInfo, JSONObject jSONObject, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ef7d95", new Object[]{this, videoInfo, jSONObject, liveItem});
        } else if (jSONObject == null || !this.d) {
            v7t.d("TaoLiveActionUtils", "mEnableModifyNewtonsParams  is false.");
        } else {
            String string = jSONObject.getString("newtonParams");
            if (TextUtils.isEmpty(string)) {
                yts.d("", to8.ADD_CART, liveItem);
                v7t.d("TaoLiveActionUtils", "appendSignNewtonParams tradeParams newtonParams is null.");
                return;
            }
            StringBuilder sb = new StringBuilder(v(string, liveItem));
            n(videoInfo, sb);
            jSONObject.remove("newtonParams");
            jSONObject.put("newtonParams", (Object) sb.toString());
        }
    }

    public final void n(VideoInfo videoInfo, StringBuilder sb) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e685a8", new Object[]{this, videoInfo, sb});
        } else if (videoInfo != null && (hashMap = videoInfo.newtonParamsMap) != null && !hashMap.keySet().isEmpty() && this.c && sb != null) {
            for (String str : videoInfo.newtonParamsMap.keySet()) {
                String str2 = "@@" + str + "@";
                String str3 = str + "@";
                String sb2 = sb.toString();
                if (!sb2.contains(str2) && !sb2.startsWith(str3)) {
                    String str4 = videoInfo.newtonParamsMap.get(str);
                    if (!TextUtils.isEmpty(str4)) {
                        sb.append(str2);
                        sb.append(str4);
                    }
                }
            }
        }
    }

    public final String s(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28ce3f60", new Object[]{this, liveItem});
        }
        JSONObject jSONObject = liveItem.itemConfigInfo;
        if (jSONObject == null || !jSONObject.containsKey("itemSourceType")) {
            return "live";
        }
        return liveItem.itemConfigInfo.getString("itemSourceType");
    }

    public final void w(ux9 ux9Var, LiveItem liveItem, ContentBusinessModel contentBusinessModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c245e9ee", new Object[]{this, ux9Var, liveItem, contentBusinessModel, str});
            return;
        }
        j(ux9Var, contentBusinessModel, liveItem);
        contentBusinessModel.dataAttributes = BusinessUtil.e(ux9Var, contentBusinessModel.dataAttributes, str);
        e(ux9Var, liveItem, contentBusinessModel);
    }

    public final void x(JSONObject jSONObject, ContentBusinessModel contentBusinessModel, VideoInfo videoInfo) throws JSONException {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801cf417", new Object[]{this, jSONObject, contentBusinessModel, videoInfo});
        } else if (videoInfo != null && (jSONObject2 = videoInfo.tcpContext) != null && !jSONObject2.isEmpty() && !TextUtils.isEmpty(jSONObject.getString("liveId")) && jSONObject.getString("liveId").equals(videoInfo.liveId)) {
            for (String str : videoInfo.tcpContext.keySet()) {
                String valueOf = String.valueOf(str);
                contentBusinessModel.context.put(valueOf, videoInfo.tcpContext.get(valueOf));
            }
        }
    }

    public final void z(ContentBusinessModel contentBusinessModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650e572e", new Object[]{this, contentBusinessModel});
        } else if (contentBusinessModel != null) {
            sjr.g().c("com.taobao.taolive.room.good_click", new String[]{contentBusinessModel.contentId, contentBusinessModel.itemId}, vx9.e());
        }
    }

    public final void D(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b9b874", new Object[]{this, ux9Var, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                str = uyv.HTTPS_SCHEMA.concat(str);
            }
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(bia.UNDER_TAKE_INSIDE_DETAIL);
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = String.valueOf(false);
                }
                if (ux9Var != null) {
                    ux9Var.a0(queryParameter);
                }
                v7t.d("TaoLiveActionUtils", "跳转商详 insideDetailStr:" + queryParameter);
            }
        }
    }

    public final void e(ux9 ux9Var, LiveItem liveItem, ContentBusinessModel contentBusinessModel) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f45e8d", new Object[]{this, ux9Var, liveItem, contentBusinessModel});
        } else if (contentBusinessModel != null && contentBusinessModel.dataAttributes != null && ux9Var != null && ux9Var.j() != null && ux9Var.j().o("showHotAtmosphere", Boolean.class) != null) {
            try {
                Boolean bool = (Boolean) ux9Var.j().o("showHotAtmosphere", Boolean.class);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (z && liveItem != null) {
                    if ("card_itm".equals(liveItem.cpsClickPos) || "card_buy".equals(liveItem.cpsClickPos)) {
                        contentBusinessModel.dataAttributes.put("item_atmospheretype", "1");
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final String v(String str, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3bf0aff", new Object[]{this, str, liveItem});
        }
        if (!this.b || str.contains("@@uSig@") || str.startsWith("uSig@")) {
            return str;
        }
        this.e = true;
        String b = yts.b(v2s.o().u().getUserId() + "_" + liveItem.liveId + "_" + liveItem.itemId + "_" + this.f8612a);
        return str + "@@uSig@" + b;
    }

    public final void j(ux9 ux9Var, ContentBusinessModel contentBusinessModel, LiveItem liveItem) {
        JSONObject jSONObject;
        JSONObject d;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969840c7", new Object[]{this, ux9Var, contentBusinessModel, liveItem});
        } else if (contentBusinessModel != null && liveItem != null) {
            if (contentBusinessModel.dataAttributes == null) {
                contentBusinessModel.dataAttributes = new org.json.JSONObject();
            }
            try {
                String str2 = "1";
                if (liveItem.itemExtData != null) {
                    List asList = Arrays.asList(nh4.g1().split(","));
                    JSONObject jSONObject2 = liveItem.itemExtData.getJSONObject("itemListTrackData");
                    if (jSONObject2 != null) {
                        for (String str3 : jSONObject2.keySet()) {
                            if (asList.contains(str3)) {
                                if (TextUtils.equals(str3, "isStressShow") && ux9Var != null) {
                                    if (ux9Var.Q) {
                                        str = "N";
                                    } else {
                                        str = "Y";
                                    }
                                    jSONObject2.put(str3, (Object) str);
                                }
                                contentBusinessModel.dataAttributes.put(str3, jSONObject2.get(str3));
                            }
                        }
                        JSONArray jSONArray = jSONObject2.getJSONArray("liveItemTags");
                        if (jSONArray != null && !jSONArray.isEmpty()) {
                            for (int i = 0; i < jSONArray.size(); i++) {
                                if (asList.contains(jSONArray.getString(i))) {
                                    contentBusinessModel.dataAttributes.put(jSONArray.getString(i), str2);
                                }
                            }
                        }
                    }
                    if (liveItem.itemExtData.getJSONObject("giftActivityInfo") != null) {
                        contentBusinessModel.dataAttributes.put("is_bogo", str2);
                    }
                }
                LiveItem.Ext ext = liveItem.extendVal;
                if (!(ext == null || TextUtils.isEmpty(ext.secKillInfo) || (d = fkx.d(liveItem.extendVal.secKillInfo)) == null)) {
                    contentBusinessModel.dataAttributes.put("activityType", d.getString("activityType"));
                }
                JSONObject jSONObject3 = liveItem.liveItemStatusData;
                if (jSONObject3 != null) {
                    org.json.JSONObject jSONObject4 = contentBusinessModel.dataAttributes;
                    if (!jSONObject3.getBooleanValue("isSpeaking")) {
                        str2 = "0";
                    }
                    jSONObject4.put("if_explaining", str2);
                }
                JSONObject jSONObject5 = liveItem.nativeConfigInfos;
                if (jSONObject5 != null) {
                    contentBusinessModel.dataAttributes.put("entry_clkPos", jSONObject5.getString("entry_clkPos"));
                }
                JSONArray jSONArray2 = liveItem.picTopLabels;
                if (!(jSONArray2 == null || jSONArray2.isEmpty() || (jSONObject = liveItem.picTopLabels.getJSONObject(0)) == null)) {
                    contentBusinessModel.dataAttributes.put("picTopLabel", jSONObject.getString("labelType"));
                }
                JSONObject jSONObject6 = liveItem.nativeConfigInfos;
                if (jSONObject6 != null) {
                    contentBusinessModel.dataAttributes.put("bbkdTabId", jSONObject6.getString("categoryId"));
                }
            } catch (JSONException e) {
                v2s.o().A().c("addSabAtmosphereParamsToDataAttributes", e.getMessage());
            }
        }
    }

    public final boolean o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c8aa6f0", new Object[]{this, context, str})).booleanValue();
        }
        if ("true".equals(str)) {
            return true;
        }
        if (!(context instanceof tsd) || !(context instanceof fee)) {
            return false;
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "enableInsideDetailAnyway", "true"));
    }

    public String A(Context context, String str, LiveItem liveItem) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31b62ac8", new Object[]{this, context, str, liveItem});
        }
        if (liveItem == null) {
            return str;
        }
        JSONObject jSONObject = liveItem.itemExtData;
        if (jSONObject != null && (jSONObject.get("enableDrawer") instanceof String)) {
            try {
                if (!Boolean.parseBoolean(jSONObject.getString("enableDrawer"))) {
                    return str;
                }
            } catch (Throwable th) {
                v7t.d("GoodListEnableInside", th.toString());
            }
        }
        if (TextUtils.isEmpty(str) || liveItem.itemConfigInfo == null) {
            return str;
        }
        String s = s(liveItem);
        if (!nh4.c0()) {
            return str;
        }
        kzb h = v2s.o().h();
        if (h != null && h.getDeviceLevel() == 2 && nh4.o1()) {
            rbf.a("Button-Inside_Fail", s, "1001", str);
            return str;
        } else if (vc.i(context) || vc.d(context)) {
            o3s.d("TaoLiveActionUtils", "replaceInsideDetailUrl | pad or fold device.");
            return str;
        } else if (!"hold".equalsIgnoreCase(liveItem.itemConfigInfo.getString("itemSourceType")) && !nh4.i0()) {
            return str;
        } else {
            if (!o(context, liveItem.itemConfigInfo.getString(bia.UNDER_TAKE_INSIDE_DETAIL))) {
                rbf.a("Button-Inside_Fail", s, "1003", str);
                return str + "&insideDetail=false";
            }
            for (String str2 : nh4.d1().split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                if (str.contains(str2)) {
                    String valueOf = String.valueOf(liveItem.itemId);
                    if (xbf.e(valueOf)) {
                        rbf.b(valueOf, s);
                    }
                    rbf.a("Button-Inside_Suc", s, "", str);
                    return str.replace(str2, "h5.m.taobao.com/awp/core/detail/inside.htm") + "&insideDetail=true&from=" + s + "&insideDetailType=" + s + "&stdPopId=" + context.hashCode();
                }
            }
            rbf.a("Button-Inside_Fail", s, "1004", str);
            return str;
        }
    }

    public final String u(String str) {
        URI create;
        String query;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb5b16f9", new Object[]{this, str});
        }
        try {
            create = URI.create(str);
        } catch (Exception e) {
            o3s.b("TaoLiveActionUtils", e.getMessage());
        }
        if (create == null || (query = create.getQuery()) == null) {
            return null;
        }
        for (String str2 : query.split("&")) {
            if (str2.startsWith(z9u.ARG_PG1_STEKC)) {
                if (TextUtils.isEmpty(str2)) {
                    return null;
                } else {
                    String[] split2 = str2.split("=");
                    if (split2.length == 2) {
                        return split2[1];
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(62:54|(5:56|(1:58)(1:59)|60|(1:62)(1:64)|63)(1:65)|66|(2:68|(57:82|85|(1:87)|88|288|89|90|292|91|(1:93)|98|(3:100|(3:103|104|101)|302)|105|300|106|(6:278|108|284|109|(3:111|(6:114|115|296|116|117|112)|303)|122)(1:126)|298|127|128|276|129|130|290|131|(1:133)|137|(1:139)(1:140)|141|(1:143)|144|(8:146|147|280|148|149|294|150|(1:152))(1:155)|156|165|(1:169)|170|(1:172)|173|(1:179)(1:178)|180|(1:182)(1:183)|(4:185|(1:187)|188|(1:190)(1:191))|282|192|(1:194)|197|(1:199)|200|(1:202)|203|(2:205|(1:207))|208|(1:210)(1:211)|212|(4:214|(1:224)|225|(1:235))|236|238|(1:240)))(1:83)|84|85|(0)|88|288|89|90|292|91|(0)|98|(0)|105|300|106|(0)(0)|298|127|128|276|129|130|290|131|(0)|137|(0)(0)|141|(0)|144|(0)(0)|156|165|(2:167|169)|170|(0)|173|(0)|179|180|(0)(0)|(0)|282|192|(0)|197|(0)|200|(0)|203|(0)|208|(0)(0)|212|(0)|236|238|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0395, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0396, code lost:
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0465, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0466, code lost:
        r32 = r32;
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x046c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x046f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0470, code lost:
        r32 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0474, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0475, code lost:
        r11 = "";
        r8 = r13;
        r27 = r31;
        r31 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x06b1, code lost:
        tb.o3s.b(r6, r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0295, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0296, code lost:
        r31 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa A[Catch: JSONException -> 0x0295, TryCatch #9 {JSONException -> 0x0295, blocks: (B:91:0x0286, B:93:0x028c, B:98:0x02a0, B:100:0x02aa, B:101:0x02b2, B:103:0x02b8), top: B:292:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0372 A[Catch: JSONException -> 0x0395, TryCatch #8 {JSONException -> 0x0395, blocks: (B:131:0x034d, B:133:0x0372, B:137:0x039c, B:139:0x03d4, B:141:0x03db, B:143:0x03e5, B:144:0x03ef, B:146:0x03f5), top: B:290:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d4 A[Catch: JSONException -> 0x0395, TryCatch #8 {JSONException -> 0x0395, blocks: (B:131:0x034d, B:133:0x0372, B:137:0x039c, B:139:0x03d4, B:141:0x03db, B:143:0x03e5, B:144:0x03ef, B:146:0x03f5), top: B:290:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e5 A[Catch: JSONException -> 0x0395, TryCatch #8 {JSONException -> 0x0395, blocks: (B:131:0x034d, B:133:0x0372, B:137:0x039c, B:139:0x03d4, B:141:0x03db, B:143:0x03e5, B:144:0x03ef, B:146:0x03f5), top: B:290:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f5 A[Catch: JSONException -> 0x0395, TRY_LEAVE, TryCatch #8 {JSONException -> 0x0395, blocks: (B:131:0x034d, B:133:0x0372, B:137:0x039c, B:139:0x03d4, B:141:0x03db, B:143:0x03e5, B:144:0x03ef, B:146:0x03f5), top: B:290:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05a6 A[Catch: Exception -> 0x05b2, TryCatch #4 {Exception -> 0x05b2, blocks: (B:192:0x05a1, B:194:0x05a6, B:197:0x05b5, B:199:0x05c3, B:200:0x05d1, B:202:0x05d7, B:203:0x05e3, B:205:0x05f2, B:207:0x0614, B:208:0x0621, B:212:0x062f, B:214:0x0634, B:216:0x063c, B:218:0x0642, B:220:0x064e, B:222:0x0656, B:224:0x065c, B:225:0x065f, B:227:0x0667, B:229:0x066d, B:231:0x0679, B:233:0x0681, B:235:0x0687, B:236:0x068a), top: B:282:0x05a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05c3 A[Catch: Exception -> 0x05b2, TryCatch #4 {Exception -> 0x05b2, blocks: (B:192:0x05a1, B:194:0x05a6, B:197:0x05b5, B:199:0x05c3, B:200:0x05d1, B:202:0x05d7, B:203:0x05e3, B:205:0x05f2, B:207:0x0614, B:208:0x0621, B:212:0x062f, B:214:0x0634, B:216:0x063c, B:218:0x0642, B:220:0x064e, B:222:0x0656, B:224:0x065c, B:225:0x065f, B:227:0x0667, B:229:0x066d, B:231:0x0679, B:233:0x0681, B:235:0x0687, B:236:0x068a), top: B:282:0x05a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05d7 A[Catch: Exception -> 0x05b2, TryCatch #4 {Exception -> 0x05b2, blocks: (B:192:0x05a1, B:194:0x05a6, B:197:0x05b5, B:199:0x05c3, B:200:0x05d1, B:202:0x05d7, B:203:0x05e3, B:205:0x05f2, B:207:0x0614, B:208:0x0621, B:212:0x062f, B:214:0x0634, B:216:0x063c, B:218:0x0642, B:220:0x064e, B:222:0x0656, B:224:0x065c, B:225:0x065f, B:227:0x0667, B:229:0x066d, B:231:0x0679, B:233:0x0681, B:235:0x0687, B:236:0x068a), top: B:282:0x05a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05f2 A[Catch: Exception -> 0x05b2, TryCatch #4 {Exception -> 0x05b2, blocks: (B:192:0x05a1, B:194:0x05a6, B:197:0x05b5, B:199:0x05c3, B:200:0x05d1, B:202:0x05d7, B:203:0x05e3, B:205:0x05f2, B:207:0x0614, B:208:0x0621, B:212:0x062f, B:214:0x0634, B:216:0x063c, B:218:0x0642, B:220:0x064e, B:222:0x0656, B:224:0x065c, B:225:0x065f, B:227:0x0667, B:229:0x066d, B:231:0x0679, B:233:0x0681, B:235:0x0687, B:236:0x068a), top: B:282:0x05a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0634 A[Catch: Exception -> 0x05b2, TryCatch #4 {Exception -> 0x05b2, blocks: (B:192:0x05a1, B:194:0x05a6, B:197:0x05b5, B:199:0x05c3, B:200:0x05d1, B:202:0x05d7, B:203:0x05e3, B:205:0x05f2, B:207:0x0614, B:208:0x0621, B:212:0x062f, B:214:0x0634, B:216:0x063c, B:218:0x0642, B:220:0x064e, B:222:0x0656, B:224:0x065c, B:225:0x065f, B:227:0x0667, B:229:0x066d, B:231:0x0679, B:233:0x0681, B:235:0x0687, B:236:0x068a), top: B:282:0x05a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028c A[Catch: JSONException -> 0x0295, TryCatch #9 {JSONException -> 0x0295, blocks: (B:91:0x0286, B:93:0x028c, B:98:0x02a0, B:100:0x02aa, B:101:0x02b2, B:103:0x02b8), top: B:292:0x0286 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(tb.ux9 r34, android.app.Activity r35, com.taobao.taolive.sdk.model.common.LiveItem r36, java.util.HashMap<java.lang.String, java.lang.String> r37) {
        /*
            Method dump skipped, instructions count: 2029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.nav.TaoLiveActionUtils.F(tb.ux9, android.app.Activity, com.taobao.taolive.sdk.model.common.LiveItem, java.util.HashMap):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:50|(5:52|(1:54)(1:55)|56|(1:58)(1:60)|59)(1:61)|62|(2:64|(48:78|81|(1:83)|84|272|85|(1:87)|92|(3:94|(6:97|98|268|99|100|95)|276)|102|274|103|(5:105|254|106|(3:108|(6:111|112|250|113|114|109)|277)|119)(1:121)|270|122|(1:124)|127|(1:129)(1:130)|131|(1:133)|134|(7:136|137|266|138|139|140|(1:142))|145|147|(2:152|(2:156|(1:158)(1:159)))|160|(1:162)(1:163)|(4:165|(1:167)|168|(1:170)(1:171))(1:172)|264|173|(3:175|256|176)(1:179)|(1:181)|182|(1:184)|185|(1:187)|188|(2:190|(1:192))|193|(1:195)(1:196)|197|198|(4:200|252|201|(1:211))|214|(3:216|262|217)(1:220)|221|225|(1:227)))(1:79)|80|81|(0)|84|272|85|(0)|92|(0)|102|274|103|(0)(0)|270|122|(0)|127|(0)(0)|131|(0)|134|(0)|145|147|(3:150|152|(3:154|156|(0)(0)))|160|(0)(0)|(0)(0)|264|173|(0)(0)|(0)|182|(0)|185|(0)|188|(0)|193|(0)(0)|197|198|(0)|214|(0)(0)|221|225|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x030f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0376, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x065d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x065e, code lost:
        r8 = r30;
        r5 = r33;
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0278, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c5 A[Catch: JSONException -> 0x030f, TRY_LEAVE, TryCatch #12 {JSONException -> 0x030f, blocks: (B:103:0x02bb, B:105:0x02c5), top: B:274:0x02bb }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0353 A[Catch: JSONException -> 0x0376, TryCatch #10 {JSONException -> 0x0376, blocks: (B:122:0x0314, B:124:0x0353, B:127:0x0379, B:129:0x03b1, B:131:0x03b8, B:133:0x03c2, B:134:0x03cc, B:136:0x03d2, B:140:0x03f9, B:142:0x0427), top: B:270:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b1 A[Catch: JSONException -> 0x0376, TryCatch #10 {JSONException -> 0x0376, blocks: (B:122:0x0314, B:124:0x0353, B:127:0x0379, B:129:0x03b1, B:131:0x03b8, B:133:0x03c2, B:134:0x03cc, B:136:0x03d2, B:140:0x03f9, B:142:0x0427), top: B:270:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c2 A[Catch: JSONException -> 0x0376, TryCatch #10 {JSONException -> 0x0376, blocks: (B:122:0x0314, B:124:0x0353, B:127:0x0379, B:129:0x03b1, B:131:0x03b8, B:133:0x03c2, B:134:0x03cc, B:136:0x03d2, B:140:0x03f9, B:142:0x0427), top: B:270:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d2 A[Catch: JSONException -> 0x0376, TRY_LEAVE, TryCatch #10 {JSONException -> 0x0376, blocks: (B:122:0x0314, B:124:0x0353, B:127:0x0379, B:129:0x03b1, B:131:0x03b8, B:133:0x03c2, B:134:0x03cc, B:136:0x03d2, B:140:0x03f9, B:142:0x0427), top: B:270:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0467 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0574 A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:176:0x0565, B:181:0x0574, B:182:0x057f, B:184:0x058d, B:185:0x059b, B:187:0x05a1, B:188:0x05af, B:190:0x05be, B:192:0x05e0, B:193:0x05ed, B:197:0x05fb), top: B:256:0x0565 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x058d A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:176:0x0565, B:181:0x0574, B:182:0x057f, B:184:0x058d, B:185:0x059b, B:187:0x05a1, B:188:0x05af, B:190:0x05be, B:192:0x05e0, B:193:0x05ed, B:197:0x05fb), top: B:256:0x0565 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05a1 A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:176:0x0565, B:181:0x0574, B:182:0x057f, B:184:0x058d, B:185:0x059b, B:187:0x05a1, B:188:0x05af, B:190:0x05be, B:192:0x05e0, B:193:0x05ed, B:197:0x05fb), top: B:256:0x0565 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05be A[Catch: Exception -> 0x0569, TryCatch #3 {Exception -> 0x0569, blocks: (B:176:0x0565, B:181:0x0574, B:182:0x057f, B:184:0x058d, B:185:0x059b, B:187:0x05a1, B:188:0x05af, B:190:0x05be, B:192:0x05e0, B:193:0x05ed, B:197:0x05fb), top: B:256:0x0565 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026f A[Catch: JSONException -> 0x0278, TryCatch #11 {JSONException -> 0x0278, blocks: (B:85:0x0264, B:87:0x026f, B:92:0x0281, B:94:0x028b, B:95:0x0293, B:97:0x0299), top: B:272:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028b A[Catch: JSONException -> 0x0278, TryCatch #11 {JSONException -> 0x0278, blocks: (B:85:0x0264, B:87:0x026f, B:92:0x0281, B:94:0x028b, B:95:0x0293, B:97:0x0299), top: B:272:0x0264 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E(tb.ux9 r30, android.app.Activity r31, com.taobao.taolive.sdk.model.common.LiveItem r32, java.util.HashMap<java.lang.String, java.lang.String> r33) {
        /*
            Method dump skipped, instructions count: 1785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.nav.TaoLiveActionUtils.E(tb.ux9, android.app.Activity, com.taobao.taolive.sdk.model.common.LiveItem, java.util.HashMap):void");
    }
}
