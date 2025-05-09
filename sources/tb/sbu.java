package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sbu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_ACCOUNT_ID = "account_id=";
    public static final String ARG_ACCOUNT_TYPE = "accounttype=";
    public static final String ARG_DEVICE_LEVEL = "deviceLevel=";
    public static final String ARG_DURATION = "duration=";
    public static final String ARG_FEED_ID = "feed_id=";
    public static final String ARG_FEED_TYPE = "feedtype=";
    public static final String ARG_FROM = "from=";
    public static final String ARG_IS_FANS = "is_fans=";
    public static final String ARG_IS_LANDSCAPE = "landscape=";
    public static final String ARG_LIVE_ENTRY_SOURCE = "entrySource=";
    public static final String ARG_LIVE_SOURCE = "livesource=";
    public static final String ARG_LIVE_STATUS = "livestatus=";
    public static final String ARG_ROOMTYPE = "roomType=";
    public static final String ARG_ROOMTYPE2 = "roomtype2=";
    public static final String ARG_ROOM_TYPE = "room_type=";
    public static final String ARG_SPM = "spm=";
    public static final String ARG_SPM_CNT = "spm-cnt";
    public static final String ARG_SPM_URL = "spm-url";
    public static final String ARG_TRACKINFO = "trackInfo=";
    public static final String CALC_LEAVE = "TaoLiveLeave";
    public static final String CLICK_GOODS_LIST = "Goodslist";
    public static final String KEY_ACCOUNT_TYPE = "accountType";
    public static final String KEY_FEED_ID = "feedId";
    public static final String KEY_FEED_ID2 = "feed_id";
    public static final String KEY_LIVE_SOURCE = "livesource";
    public static final String KEY_SPM = "spm";
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";
    public static final String SOURCE_SWITCH_ROOM = "switchRoom";
    public static final String SPM_TAOLIVE_FANDOM = "a21tn.888888";
    public static final String SPM_TAOLIVE_WATCH = "a2141.8001249.1.1";
    public static final String SPM_TAOLIVE_WATCH_4_SHOP = "a2141.23201685";

    static {
        t2o.a(779092727);
    }

    public static List<String> a(ux9 ux9Var, String... strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ca21118", new Object[]{ux9Var, strArr});
        }
        ArrayList arrayList = new ArrayList();
        if (ux9Var instanceof air) {
            air airVar = (air) ux9Var;
            if (airVar.g() != null) {
                sxb g = airVar.g();
                VideoInfo a2 = g.a();
                arrayList.add("feedId=" + d(ux9Var));
                arrayList.add("liveSource=" + g.D());
                arrayList.add("entrySource=" + g.c1());
                arrayList.add("timestamp=" + System.currentTimeMillis());
                arrayList.add("timeShiftEntry=" + g.T1());
                arrayList.add("jiangjie_ID=" + g.i2());
                if (ux9Var.l() instanceof wwa) {
                    arrayList.add("highlightCardStyle=" + ((wwa) ux9Var.l()).e);
                }
                arrayList.add("oneproduct_jiangjie=" + g.d2());
                arrayList.add("oneproduct_mounting=" + g.O2());
                if (a2 != null) {
                    AccountInfo accountInfo = a2.broadCaster;
                    if (accountInfo != null) {
                        str = accountInfo.accountId;
                    } else {
                        str = "";
                    }
                    arrayList.add("accountId=" + str);
                    arrayList.add("roomStatus=" + a2.roomStatus);
                }
                if (!TextUtils.isEmpty(g.t0())) {
                    arrayList.add("trackInfo=" + g.t0());
                }
                arrayList.add("serverParams=" + g.G());
                if (strArr != null && strArr.length > 0) {
                    arrayList.addAll(Arrays.asList(strArr));
                }
                return arrayList;
            }
        }
        if (uwa.z()) {
            i(ux9Var, 19999, "highlight_trackUtilsNew_error", null);
        }
        return dbu.a(strArr);
    }

    public static String c(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1255695", new Object[]{ux9Var});
        }
        cv1 f = vx9.f(ux9Var);
        if (f instanceof cba) {
            cba cbaVar = (cba) f;
            if (!TextUtils.isEmpty(cbaVar.P)) {
                return cbaVar.P;
            }
        }
        if (qvs.M() && ux9Var != null && (up6.q0(ux9Var) || up6.r0(ux9Var))) {
            return "a2141.23201685";
        }
        if (nwa.a(ux9Var).c() == null || !nwa.a(ux9Var).c().g()) {
            return "a2141.8001249.1.1";
        }
        return nwa.a(ux9Var).c().getLiveAndHomeMixSpm();
    }

    public static String d(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8b9e6d4", new Object[]{ux9Var});
        }
        if (ux9Var instanceof air) {
            air airVar = (air) ux9Var;
            if (airVar.g() != null) {
                VideoInfo a2 = airVar.g().a();
                if (a2 != null) {
                    return a2.liveId;
                }
                return null;
            }
        }
        return dbu.b();
    }

    public static void e(ux9 ux9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c75954", new Object[]{ux9Var, str, str2});
            return;
        }
        g(ux9Var, str, "from=" + str2);
    }

    public static void g(ux9 ux9Var, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e4c", new Object[]{ux9Var, str, strArr});
        } else {
            h(ux9Var, str, null, strArr);
        }
    }

    public static void i(ux9 ux9Var, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77f2c63", new Object[]{ux9Var, new Integer(i), str, map});
        } else if (v2s.o().E() != null) {
            v2s.o().E().trackCustom("Page_TaobaoLiveWatch", i, str, "", "0", map);
        }
    }

    public static void j(ux9 ux9Var, String str, String str2, HashMap<String, String> hashMap) {
        AccountInfo accountInfo;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8598a8", new Object[]{ux9Var, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (ux9Var instanceof air) {
            air airVar = (air) ux9Var;
            if (airVar.g() != null) {
                sxb g = airVar.g();
                VideoInfo a2 = g.a();
                if (a2 != null && (accountInfo = a2.broadCaster) != null) {
                    String str5 = a2.liveId;
                    String str6 = accountInfo.accountId;
                    hashMap.put(yj4.PARAM_LIVE_AD_PARAMS, Uri.encode(g.z()));
                    hashMap.put("accounttype", cxg.a(a2.broadCaster.type) + "");
                    if (!TextUtils.isEmpty(g.d())) {
                        hashMap.put("spm-url", g.d());
                    }
                    hashMap.put("feed_id", str5);
                    hashMap.put(z9u.KEY_ACCOUNT_ID, str6);
                    hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(a2.roomType));
                    hashMap.put("deviceLevel", String.valueOf(xj7.a()));
                    hashMap.put("accountType", cxg.a(a2.broadCaster.type) + "");
                    int i = a2.roomType;
                    if (g.r1(a2)) {
                        i = 13;
                    }
                    hashMap.put(z9u.KEY_ROOMTYPE2, i + "");
                    hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, g.x());
                    hashMap.put("timeShiftForEnter", g.T1() + "");
                    hashMap.put("jiangjie_ID", g.i2());
                    if (ux9Var.l() instanceof wwa) {
                        hashMap.put("highlightCardStyle", String.valueOf(((wwa) ux9Var.l()).e));
                    }
                    hashMap.put("entryjiangjie_id", g.C1());
                    hashMap.put("oneproduct_jiangjie", g.d2());
                    hashMap.put("oneproduct_mounting", g.O2());
                    hashMap.put("timeShiftItemId", g.m1());
                    hashMap.put("entrySpm", g.n0());
                    hashMap.put("entryLiveSource", g.c());
                    hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(a2.status));
                    if (cxa.c) {
                        str3 = "content";
                    } else {
                        str3 = "item";
                    }
                    hashMap.put("timemoving_type", str3);
                    if (v2s.o().u() == null || !v2s.o().u().checkSessionValid()) {
                        str4 = "0";
                    } else {
                        str4 = "1";
                    }
                    hashMap.put("login", str4);
                    hashMap.put("livesource", g.D());
                    hashMap.put(yj4.PARAM_ENTRY_SOURCE, g.c1());
                    hashMap.put("switchIndex", String.valueOf(g.I2()));
                    hashMap.put("isUp", String.valueOf(g.M0()));
                    hashMap.put("queryKey", g.i1());
                    hashMap.put("clickid", g.y1());
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("trackInfo", str2);
                    } else if (!TextUtils.isEmpty(g.t0())) {
                        hashMap.put("trackInfo", g.t0());
                    }
                    if (!TextUtils.isEmpty(g.g0())) {
                        hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, g.g0());
                    }
                    if (!TextUtils.isEmpty(g.d())) {
                        hashMap.put("spm", g.d());
                    }
                    hashMap.put("spm-cnt", c(ux9Var));
                    hashMap.put("timestampT", System.currentTimeMillis() + "");
                    if (!TextUtils.isEmpty(a2.tvChannelId)) {
                        hashMap.put(z9u.KEY_OFFICIAL_CHANNEL_ID, a2.tvChannelId);
                    }
                    hashMap.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
                    if (v2s.o().E() != null) {
                        v2s.o().E().track4Show("Page_TaobaoLiveWatch", str, hashMap);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        dbu.e(str, str2, hashMap);
        if (uwa.z()) {
            i(ux9Var, 19999, "highlight_trackUtilsNew_error", null);
        }
    }

    public static void k(ux9 ux9Var, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5dcc72", new Object[]{ux9Var, str, hashMap});
        } else {
            j(ux9Var, str, null, hashMap);
        }
    }

    public static void b(ux9 ux9Var, String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93047e4b", new Object[]{ux9Var, str, str2, str3, strArr});
            return;
        }
        List<String> a2 = a(ux9Var, strArr);
        if (TextUtils.isEmpty(str3)) {
            str3 = d(ux9Var);
        }
        gq0.p().commitTap("taobaolive", str, str2, str3, (String[]) a2.toArray(new String[0]));
    }

    public static void f(ux9 ux9Var, String str, Map<String, String> map) {
        String str2;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7850c332", new Object[]{ux9Var, str, map});
            return;
        }
        if (ux9Var instanceof air) {
            air airVar = (air) ux9Var;
            if (airVar.g() != null) {
                sxb g = airVar.g();
                if (v2s.o().E() != null) {
                    if (map != null) {
                        map.put("livesource", g.D());
                        map.put(yj4.PARAM_ENTRY_SOURCE, g.c1());
                        map.put("timeShiftForEnter", g.T1() + "");
                        map.put("jiangjie_ID", g.i2());
                        if (ux9Var.l() instanceof wwa) {
                            map.put("highlightCardStyle", String.valueOf(((wwa) ux9Var.l()).e));
                        }
                        map.put("oneproduct_jiangjie", g.d2());
                        map.put("oneproduct_mounting", g.O2());
                        map.put("timeShiftItemId", g.m1());
                        map.put("queryKey", g.i1());
                        map.put("clickid", g.y1());
                        StringBuilder sb = new StringBuilder();
                        sb.append(g.L1() != null ? 1 : 0);
                        sb.append("");
                        map.put("isAD", sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        if (g.V1() == null) {
                            i = 0;
                        }
                        sb2.append(i);
                        sb2.append("");
                        map.put("isAdTransParams", sb2.toString());
                        map.put("entryLiveSource", g.c());
                        map.put("entryjiangjie_id", g.C1());
                        map.put(smh.entryQuery, g.M1());
                        map.put("entrySpm", g.n0());
                        map.put("entryScm", g.T0());
                        map.put("switchIndex", g.I2() + "");
                        map.put("isUp", g.M0() + "");
                        map.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, g.w1());
                        map.put(zlr.PARAM_ENTRY_LIVE_ID, g.E1());
                        map.put(yj4.PARAM_ENTRY_UT_PARAM, g.x());
                        map.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
                        if (cxa.c) {
                            str2 = "content";
                        } else {
                            str2 = "item";
                        }
                        map.put("timemoving_type", str2);
                        VideoInfo a2 = g.a();
                        if (a2 != null) {
                            map.put(z9u.KEY_ROOMTYPE, String.valueOf(a2.roomType));
                            map.put("newRoomType", String.valueOf(a2.newRoomType));
                            map.put(z9u.KEY_LIVE_STATUS, String.valueOf(a2.status));
                            String str3 = a2.liveId;
                            String str4 = a2.broadCaster.accountId;
                            if (!TextUtils.isEmpty(g.d())) {
                                map.put("spm-url", g.d());
                            }
                            map.put("feed_id", str3);
                            map.put(z9u.KEY_ACCOUNT_ID, str4);
                            if (!TextUtils.isEmpty(a2.tvChannelId)) {
                                map.put(z9u.KEY_OFFICIAL_CHANNEL_ID, a2.tvChannelId);
                            }
                        }
                    }
                    v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, map);
                    return;
                }
                return;
            }
        }
        dbu.c(str, map);
        if (uwa.z()) {
            i(ux9Var, 19999, "highlight_trackUtilsNew_error", null);
        }
    }

    public static void h(ux9 ux9Var, String str, String str2, String... strArr) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4facae9d", new Object[]{ux9Var, str, str2, strArr});
            return;
        }
        if (ux9Var instanceof air) {
            air airVar = (air) ux9Var;
            if (airVar.g() != null) {
                sxb g = airVar.g();
                VideoInfo a2 = g.a();
                if (!(a2 == null || a2.broadCaster == null)) {
                    ArrayList arrayList = new ArrayList();
                    String str4 = a2.liveId;
                    String str5 = a2.broadCaster.accountId;
                    arrayList.add("feed_id=" + str4);
                    arrayList.add("account_id=" + str5);
                    arrayList.add("deviceLevel=" + xj7.a());
                    if (!TextUtils.isEmpty(g.e2())) {
                        arrayList.add("pkid=" + g.e2());
                    }
                    if (!TextUtils.isEmpty(g.d())) {
                        arrayList.add("spm-url=" + g.d());
                    }
                    if (!TextUtils.isEmpty(g.d())) {
                        arrayList.add("spm=" + g.d());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add("trackInfo=" + str2);
                    } else if (!TextUtils.isEmpty(g.t0())) {
                        arrayList.add("trackInfo=" + g.t0());
                    }
                    if (!TextUtils.isEmpty(g.g0())) {
                        arrayList.add("liveoprt_id=" + g.g0());
                    }
                    if (cxa.c) {
                        str3 = "content";
                    } else {
                        str3 = "item";
                    }
                    arrayList.add("timemoving_type=".concat(str3));
                    if (g.L1() != null) {
                        arrayList.add("clickurl=" + g.L1().clickid);
                        arrayList.add("interactiveurl=" + g.L1().interactiveid);
                        arrayList.add("clickInfo=" + g.L1().clickInfo);
                    }
                    arrayList.add("spm-cnt=" + c(ux9Var));
                    String str6 = "0";
                    arrayList.add("is_fans=".concat(a2.broadCaster.follow ? "1" : str6));
                    StringBuilder sb = new StringBuilder("isAD=");
                    sb.append(g.L1() != null ? 1 : 0);
                    arrayList.add(sb.toString());
                    arrayList.add("entryUtparam=" + g.x());
                    StringBuilder sb2 = new StringBuilder("isAdTransParams=");
                    sb2.append(g.V1() != null ? 1 : 0);
                    arrayList.add(sb2.toString());
                    arrayList.add("entryLiveSource=" + g.c());
                    arrayList.add("entryjiangjie_id=" + g.C1());
                    arrayList.add("entryQuery=" + g.M1());
                    arrayList.add("entrySpm=" + g.n0());
                    arrayList.add("entryScm=" + g.T0());
                    arrayList.add("switchIndex=" + g.I2());
                    arrayList.add("isUp=" + g.M0());
                    arrayList.add("entryTraceId=" + g.w1());
                    arrayList.add("entryLiveId=" + g.E1());
                    arrayList.add("liveAdParams=" + Uri.encode(g.z()));
                    arrayList.add("feedtype=" + a2.type);
                    arrayList.add("livestatus=" + a2.status);
                    arrayList.add("landscape=" + a2.landScape);
                    arrayList.add("accounttype=" + cxg.a(a2.broadCaster.type));
                    arrayList.add("roomType=" + a2.roomType);
                    arrayList.add("livesource=" + g.D());
                    arrayList.add("entrySource=" + g.c1());
                    int i = a2.roomType;
                    if (g.r1(a2)) {
                        i = 13;
                    }
                    arrayList.add("roomtype2=" + i);
                    arrayList.add("timeShiftForEnter=" + g.T1() + "");
                    StringBuilder sb3 = new StringBuilder("jiangjie_ID=");
                    sb3.append(g.i2());
                    arrayList.add(sb3.toString());
                    if (ux9Var.l() instanceof wwa) {
                        arrayList.add("highlightCardStyle=" + ((wwa) ux9Var.l()).e);
                    }
                    arrayList.add("oneproduct_jiangjie=" + g.d2());
                    arrayList.add("oneproduct_mounting=" + g.O2());
                    arrayList.add("timeShiftItemId=" + g.m1());
                    arrayList.add("product_type=timemove");
                    arrayList.add("queryKey=" + g.i1());
                    arrayList.add("clickid=" + g.y1());
                    arrayList.add("room_type=live");
                    if (!TextUtils.isEmpty(a2.tvChannelId)) {
                        arrayList.add("officialchannel_id=" + a2.tvChannelId);
                    }
                    if (strArr != null && strArr.length > 0) {
                        for (String str7 : strArr) {
                            arrayList.add(str7);
                        }
                    }
                    StringBuilder sb4 = new StringBuilder("login=");
                    if (v2s.o().u() != null && v2s.o().u().checkSessionValid()) {
                        str6 = "1";
                    }
                    sb4.append(str6);
                    arrayList.add(sb4.toString());
                    if (qvs.l0() && !TextUtils.isEmpty(g.B1())) {
                        arrayList.add("utparam-url=" + g.B1());
                    }
                    if (v2s.o().E() != null) {
                        v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, (String[]) arrayList.toArray(new String[0]));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        dbu.d(str, str2, strArr);
        if (uwa.z()) {
            i(ux9Var, 19999, "highlight_trackUtilsNew_error", null);
        }
    }

    public static void l(ux9 ux9Var) {
        VideoInfo a2;
        String str;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c4a94d", new Object[]{ux9Var});
            return;
        }
        if (ux9Var instanceof air) {
            air airVar = (air) ux9Var;
            if (airVar.g() != null) {
                sxb g = airVar.g();
                if (g.J0() && (a2 = g.a()) != null && a2.broadCaster != null) {
                    HashMap hashMap = new HashMap();
                    String str3 = a2.liveId;
                    String str4 = a2.broadCaster.accountId;
                    hashMap.put("feed_id", str3);
                    hashMap.put(z9u.KEY_ACCOUNT_ID, str4);
                    hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(a2.status));
                    hashMap.put("accounttype", cxg.a(a2.broadCaster.type) + "");
                    hashMap.put("scm-live", g.f2());
                    if (qvs.j0()) {
                        hashMap.put("x_object_type", g.w());
                    }
                    hashMap.put("feedtype", a2.type + "");
                    if (a2.landScape) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("landscape", str);
                    hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(a2.roomType));
                    StringBuilder sb = new StringBuilder();
                    sb.append(g.L1() != null ? 1 : 0);
                    sb.append("");
                    hashMap.put("isAD", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    if (g.V1() != null) {
                        i = 1;
                    }
                    sb2.append(i);
                    sb2.append("");
                    hashMap.put("isAdTransParams", sb2.toString());
                    hashMap.put("entryLiveSource", g.c());
                    hashMap.put("entryjiangjie_id", g.C1());
                    if (cxa.c) {
                        str2 = "content";
                    } else {
                        str2 = "item";
                    }
                    hashMap.put("timemoving_type", str2);
                    hashMap.put(smh.entryQuery, g.M1());
                    hashMap.put("entrySpm", g.n0());
                    hashMap.put("entryScm", g.T0());
                    hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, g.x());
                    hashMap.put("entryPvid", g.U1());
                    hashMap.put("switchIndex", g.I2() + "");
                    hashMap.put("isUp", g.M0() + "");
                    hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, g.w1());
                    hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, g.E1());
                    hashMap.put("livesource", g.D());
                    hashMap.put("common_live_page", "live");
                    hashMap.put("content_id", str3);
                    hashMap.put("deviceLevel", String.valueOf(xj7.a()));
                    if (qvs.i0()) {
                        hashMap.put("clickid", g.y1());
                    }
                    if (!TextUtils.isEmpty(g.t0())) {
                        hashMap.put("trackInfo", g.t0());
                    }
                    if (!TextUtils.isEmpty(g.g0())) {
                        hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, g.g0());
                    }
                    if (v2s.o().E() != null) {
                        v2s.o().E().updateNextPageUtParam(hashMap);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        dbu.f();
        if (uwa.z()) {
            i(ux9Var, 19999, "highlight_trackUtilsNew_error", null);
        }
    }
}
