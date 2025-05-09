package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ebu extends z9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093381);
    }

    public static List<String> a(String... strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c3eda7f0", new Object[]{strArr});
        }
        ArrayList arrayList = new ArrayList();
        VideoInfo C = ekr.C();
        arrayList.add("feedId=" + f());
        arrayList.add("liveSource=" + ekr.o());
        arrayList.add("entrySource=" + ekr.j());
        arrayList.add("timestamp=" + System.currentTimeMillis());
        arrayList.add("timeShiftEntry=" + ekr.y());
        arrayList.add("jiangjie_ID=" + ekr.F());
        arrayList.add("oneproduct_jiangjie=" + ekr.G());
        arrayList.add("oneproduct_mounting=" + ekr.q());
        if (C != null) {
            AccountInfo accountInfo = C.broadCaster;
            if (accountInfo != null) {
                str = accountInfo.accountId;
            } else {
                str = "";
            }
            arrayList.add("accountId=" + str);
            arrayList.add("roomStatus=" + C.roomStatus);
        }
        if (!TextUtils.isEmpty(ekr.A())) {
            arrayList.add("trackInfo=" + ekr.A());
        }
        arrayList.add("serverParams=" + ekr.u());
        arrayList.add("fansLevel=" + m09.e().c());
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef552e6", new Object[0])).booleanValue();
        }
        return iws.c();
    }

    public static qt9 d(qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("2c631215", new Object[]{qt9Var});
        }
        if (qt9Var == null) {
            qt9Var = new qt9();
        }
        qt9Var.d = ekr.w();
        qt9Var.e = ekr.w0;
        qt9Var.f = ekr.o();
        qt9Var.g = String.valueOf(ekr.H() ? 1 : 0);
        qt9Var.h = ekr.B;
        qt9Var.i = ekr.F;
        qt9Var.j = ekr.E();
        qt9Var.k = ekr.e;
        qt9Var.l = o7c.ORIGIN_PAGE_LIVE_WATCH;
        qt9Var.m = "a2141.8001249.1.1";
        qt9Var.n = v2s.o().f().getAppKey();
        return qt9Var;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3bdf591", new Object[0]);
        }
        return iws.e();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[0]);
        }
        VideoInfo C = ekr.C();
        if (C != null) {
            return C.liveId;
        }
        return null;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab84ac3e", new Object[0]);
        }
        cba cbaVar = (cba) vx9.f(vx9.d());
        if (cbaVar != null && !TextUtils.isEmpty(cbaVar.P)) {
            return cbaVar.P;
        }
        if (pvs.M0() && (ekr.L() || ekr.K())) {
            return "a2141.23201685";
        }
        if (c()) {
            return e();
        }
        return "a2141.8001249.1.1";
    }

    public static Map<String, String> h(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba1e76c8", new Object[]{obj, str});
        }
        if (!ekr.N()) {
            return new HashMap();
        }
        return m(obj, str, null, null, null, true);
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d92aa2c", new Object[]{str, str2});
            return;
        }
        k(str, "from=" + str2);
    }

    public static /* synthetic */ Object ipc$super(ebu ebuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/utils/TrackUtils");
    }

    public static void k(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedf2974", new Object[]{str, strArr});
        } else {
            l(str, null, strArr);
        }
    }

    public static void l(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb05cc5", new Object[]{str, str2, strArr});
            return;
        }
        VideoInfo C = ekr.C();
        if (!(C == null || C.broadCaster == null)) {
            ArrayList arrayList = new ArrayList();
            String str3 = C.liveId;
            String str4 = C.broadCaster.accountId;
            if (C.isOfficialType() && ink.b().c(str)) {
                VideoInfo.OfficialLiveInfo officialLiveInfo = C.officialLiveInfo;
                str3 = officialLiveInfo.officialLiveId;
                str4 = officialLiveInfo.accountId;
            }
            arrayList.add("feed_id=" + str3);
            arrayList.add("account_id=" + str4);
            arrayList.add("deviceLevel=" + String.valueOf(ekr.i()));
            if (!TextUtils.isEmpty(null)) {
                arrayList.add("pkid=null");
            }
            if (!TextUtils.isEmpty(ekr.w())) {
                arrayList.add("spm-url=" + ekr.w());
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add("trackInfo=" + str2);
            } else if (!TextUtils.isEmpty(ekr.A())) {
                arrayList.add("trackInfo=" + ekr.A());
            }
            if (!TextUtils.isEmpty(ekr.p())) {
                arrayList.add("liveoprt_id=" + ekr.p());
            }
            if (ekr.f() != null) {
                arrayList.add("clickurl=" + ekr.f().clickid);
                arrayList.add("interactiveurl=" + ekr.f().interactiveid);
                arrayList.add("clickInfo=" + ekr.f().clickInfo);
            }
            cba cbaVar = (cba) vx9.f(vx9.d());
            if (cbaVar != null && !TextUtils.isEmpty(cbaVar.P)) {
                arrayList.add("spm-cnt=" + cbaVar.P);
            } else if (pvs.M0() && (ekr.L() || ekr.K())) {
                arrayList.add("spm-cnt=a2141.23201685");
            } else if (c()) {
                arrayList.add("spm-cnt=" + e());
            } else {
                arrayList.add("spm-cnt=a2141.8001249.1.1");
            }
            String str5 = "0";
            arrayList.add("is_fans=".concat(C.broadCaster.follow ? "1" : str5));
            arrayList.add("watchid=" + ekr.E());
            arrayList.add("pvid=" + ekr.e);
            StringBuilder sb = new StringBuilder("isAD=");
            sb.append((ekr.H() || C.isAD) ? 1 : 0);
            arrayList.add(sb.toString());
            arrayList.add("entryUtparam=" + ekr.Q);
            arrayList.add("entryPvid=" + ekr.R);
            StringBuilder sb2 = new StringBuilder("isAdTransParams=");
            sb2.append(ekr.e() != null ? 1 : 0);
            arrayList.add(sb2.toString());
            arrayList.add("entryLiveSource=" + ekr.B);
            arrayList.add("entryjiangjie_id=" + ekr.C);
            arrayList.add("timeMovingUtParams=" + ekr.D);
            arrayList.add("entryScmPre=" + ekr.x);
            arrayList.add("entrySpmPre=" + ekr.y);
            arrayList.add("entryUtparamPre=" + ekr.z);
            arrayList.add("entryLiveSourcePre=" + ekr.A);
            arrayList.add("entryQuery=" + ekr.E);
            arrayList.add("entrySpm=" + ekr.F);
            arrayList.add("entryScm=" + ekr.H);
            arrayList.add("entryFeedId=" + ekr.S);
            arrayList.add("entryContentId=" + ekr.T);
            arrayList.add("entryAccountId=" + ekr.U);
            arrayList.add("entryLiveScm=" + ekr.V);
            arrayList.add("switchIndex=" + ekr.K);
            arrayList.add("isUp=" + ekr.M);
            arrayList.add("entryTraceId=" + ekr.I);
            arrayList.add("entryLiveId=" + ekr.J);
            arrayList.add("product_type=" + cxa.f17408a);
            arrayList.add("liveAdParams=" + Uri.encode(ekr.X));
            if (!TextUtils.isEmpty(m09.e().c())) {
                arrayList.add(z9u.ARG_FANS_LEVEL + m09.e().c());
            }
            arrayList.add("feedtype=" + C.type);
            arrayList.add("livestatus=" + C.status);
            arrayList.add("roomStatus=" + C.roomStatus);
            arrayList.add("landscape=" + C.landScape);
            arrayList.add("accounttype=" + cxg.a(C.broadCaster.type));
            arrayList.add("roomType=" + C.roomType);
            arrayList.add("livesource=" + ekr.o());
            arrayList.add("entrySource=" + ekr.j());
            int i = C.roomType;
            if (ekr.O(C)) {
                i = 13;
            }
            arrayList.add("roomtype2=" + i);
            arrayList.add("timeShiftForEnter=" + ekr.y() + "");
            StringBuilder sb3 = new StringBuilder("jiangjie_ID=");
            sb3.append(ekr.F());
            arrayList.add(sb3.toString());
            arrayList.add("oneproduct_jiangjie=" + ekr.G());
            arrayList.add("oneproduct_mounting=" + ekr.q());
            arrayList.add("timeShiftItemId=" + ekr.z());
            arrayList.add("queryKey=" + ekr.v0);
            arrayList.add("clickid=" + ekr.w0);
            arrayList.add("room_type=live");
            arrayList.add("singleLiveTabSessionId=" + ekr.d0);
            if (!TextUtils.isEmpty(C.tvChannelId)) {
                arrayList.add("officialchannel_id=" + C.tvChannelId);
            }
            if (strArr != null && strArr.length > 0) {
                for (String str6 : strArr) {
                    arrayList.add(str6);
                }
            }
            StringBuilder sb4 = new StringBuilder("login=");
            if (v2s.o().u() != null && v2s.o().u().checkSessionValid()) {
                str5 = "1";
            }
            sb4.append(str5);
            arrayList.add(sb4.toString());
            if (pvs.Z1() && !TextUtils.isEmpty(ekr.B())) {
                arrayList.add("utparam-url=" + ekr.B());
            }
            arrayList.add("content_type=".concat(zga.e(C.itemTransferInfo) ? "reward" : "normal"));
            if (v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, (String[]) arrayList.toArray(new String[0]));
            }
        }
    }

    public static Map<String, String> m(Object obj, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d55370a4", new Object[]{obj, str, str2, str3, str4, new Boolean(z)});
        }
        if (!ekr.N()) {
            return new HashMap();
        }
        return n(obj, str, str2, str3, str4, z, true);
    }

    public static void p(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b360459a", new Object[]{str, hashMap});
        } else {
            o(str, null, hashMap);
        }
    }

    public static void q() {
        VideoInfo C;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3f1125", new Object[0]);
        } else if (ekr.N() && (C = ekr.C()) != null && C.broadCaster != null) {
            HashMap hashMap = new HashMap();
            String str3 = C.liveId;
            String str4 = C.broadCaster.accountId;
            hashMap.put("feed_id", str3);
            hashMap.put(z9u.KEY_ACCOUNT_ID, str4);
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(C.status));
            hashMap.put("accounttype", cxg.a(C.broadCaster.type) + "");
            hashMap.put("scm-live", ekr.N);
            hashMap.put("spm-live", ekr.O);
            if (pvs.U1()) {
                hashMap.put("x_object_type", ekr.P);
            }
            hashMap.put("feedtype", C.type + "");
            if (C.landScape) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("landscape", str);
            hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(C.roomType));
            StringBuilder sb = new StringBuilder();
            sb.append((ekr.H() || C.isAD) ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (ekr.e() != null) {
                i = 1;
            }
            sb2.append(i);
            sb2.append("");
            hashMap.put("isAdTransParams", sb2.toString());
            hashMap.put("entryScmPre", ekr.x);
            hashMap.put("entrySpmPre", ekr.y);
            hashMap.put("entryUtparamPre", ekr.z);
            hashMap.put("entryLiveSourcePre", ekr.A);
            hashMap.put("entryLiveSource", ekr.B);
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
            hashMap.put("entryPvid", ekr.R);
            hashMap.put("entryjiangjie_id", ekr.C);
            hashMap.put("timeMovingUtParams", ekr.D);
            hashMap.put(smh.entryQuery, ekr.E);
            hashMap.put("entrySpm", ekr.F);
            hashMap.put("entryScm", ekr.H);
            hashMap.put("entryFeedId", ekr.S);
            hashMap.put("entryContentId", ekr.T);
            hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, ekr.U);
            hashMap.put("entryLiveScm", ekr.V);
            hashMap.put("switchIndex", ekr.K + "");
            hashMap.put("isUp", ekr.M + "");
            hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, ekr.I);
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, ekr.J);
            hashMap.put("livesource", ekr.o());
            hashMap.put("common_live_page", "live");
            hashMap.put("content_id", str3);
            hashMap.put("deviceLevel", String.valueOf(ekr.i()));
            if (pvs.T1()) {
                hashMap.put("clickid", ekr.w0);
            }
            if (!TextUtils.isEmpty(ekr.p())) {
                hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, ekr.p());
            }
            if (zga.e(C.itemTransferInfo)) {
                str2 = "reward";
            } else {
                str2 = "normal";
            }
            hashMap.put("content_type", str2);
            if (v2s.o().E() != null) {
                v2s.o().E().updateNextPageUtParam(hashMap);
            }
        }
    }

    public static void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea73fd0", new Object[0]);
        } else if (ekr.N() && pvs.U1()) {
            HashMap hashMap = new HashMap();
            hashMap.put("scm-pre", ekr.N);
            if (v2s.o().E() != null) {
                v2s.o().E().updateNextPageProperties(hashMap);
            }
        }
    }

    public static void t(ux9 ux9Var, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d52cf78", new Object[]{ux9Var, obj, str});
        } else if (ekr.N()) {
            if (iws.c()) {
                str = z9u.PAGE_HOME_LIVETAB;
            }
            g3h.h(ux9Var, null, obj, str);
        }
    }

    public static void u(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{obj, map});
        } else if (ekr.N()) {
            du4.c(vx9.d(), obj, map);
        }
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b473496", new Object[]{str, strArr});
        } else {
            gq0.p().b("taobaolive", str, ekr.A(), (String[]) a(strArr).toArray(new String[0]));
        }
    }

    public static void j(String str, Map<String, String> map) {
        String str2;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a3325a", new Object[]{str, map});
        } else if (v2s.o().E() != null) {
            if (map != null) {
                map.put("livesource", ekr.o());
                map.put(yj4.PARAM_ENTRY_SOURCE, ekr.j());
                map.put("timeShiftForEnter", ekr.y() + "");
                map.put("jiangjie_ID", ekr.F());
                map.put("oneproduct_jiangjie", ekr.G());
                map.put("oneproduct_mounting", ekr.q());
                map.put("timeShiftItemId", ekr.z());
                map.put("queryKey", ekr.v0);
                map.put("clickid", ekr.w0);
                StringBuilder sb = new StringBuilder();
                sb.append(ekr.e() != null ? 1 : 0);
                sb.append("");
                map.put("isAdTransParams", sb.toString());
                map.put("entryLiveSource", ekr.B);
                map.put("entryjiangjie_id", ekr.C);
                map.put("timeMovingUtParams", ekr.D);
                map.put(smh.entryQuery, ekr.E);
                map.put("entryScmPre", ekr.x);
                map.put("entrySpmPre", ekr.y);
                map.put("entryUtparamPre", ekr.z);
                map.put("entrySpm", ekr.F);
                map.put("entryScm", ekr.H);
                map.put("entryFeedId", ekr.S);
                map.put("entryContentId", ekr.T);
                map.put(zlr.PARAM_ENTRY_ACCOUNT_ID, ekr.U);
                map.put("entryLiveScm", ekr.V);
                map.put("switchIndex", ekr.K + "");
                map.put("isUp", ekr.M + "");
                map.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, ekr.I);
                map.put(zlr.PARAM_ENTRY_LIVE_ID, ekr.J);
                map.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
                map.put("entryPvid", ekr.R);
                map.put("watchid", ekr.E());
                map.put(yj4.PARAM_PVID, ekr.e);
                map.put("product_type", cxa.f17408a);
                map.put("singleLiveTabSessionId", ekr.d0);
                VideoInfo C = ekr.C();
                if (C != null) {
                    StringBuilder sb2 = new StringBuilder();
                    if (!ekr.H() && !C.isAD) {
                        i = 0;
                    }
                    sb2.append(i);
                    sb2.append("");
                    map.put("isAD", sb2.toString());
                    if (zga.e(C.itemTransferInfo)) {
                        str2 = "reward";
                    } else {
                        str2 = "normal";
                    }
                    map.put("content_type", str2);
                    map.put(z9u.KEY_ROOMTYPE, String.valueOf(C.roomType));
                    map.put("newRoomType", String.valueOf(C.newRoomType));
                    map.put("roomStatus", C.roomStatus);
                    String str3 = C.liveId;
                    String str4 = C.broadCaster.accountId;
                    if (C.isOfficialType() && ink.b().c(str)) {
                        VideoInfo.OfficialLiveInfo officialLiveInfo = C.officialLiveInfo;
                        String str5 = officialLiveInfo.officialLiveId;
                        str4 = officialLiveInfo.accountId;
                        str3 = str5;
                    }
                    if (!TextUtils.isEmpty(ekr.w())) {
                        map.put("spm-url", ekr.w());
                    }
                    map.put("feed_id", str3);
                    map.put(z9u.KEY_ACCOUNT_ID, str4);
                    if (!TextUtils.isEmpty(C.tvChannelId)) {
                        map.put(z9u.KEY_OFFICIAL_CHANNEL_ID, C.tvChannelId);
                    }
                }
                map.put("spm-cnt", g());
            }
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, map);
        }
    }

    public static void o(String str, String str2, HashMap<String, String> hashMap) {
        AccountInfo accountInfo;
        String str3;
        String str4;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10db17d0", new Object[]{str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        VideoInfo C = ekr.C();
        if (C != null && (accountInfo = C.broadCaster) != null) {
            String str5 = C.liveId;
            String str6 = accountInfo.accountId;
            hashMap.put(yj4.PARAM_LIVE_AD_PARAMS, Uri.encode(ekr.X));
            hashMap.put("accounttype", cxg.a(C.broadCaster.type) + "");
            if (!TextUtils.isEmpty(ekr.w())) {
                hashMap.put("spm-url", ekr.w());
            }
            hashMap.put("feed_id", str5);
            hashMap.put(z9u.KEY_ACCOUNT_ID, str6);
            hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(C.roomType));
            hashMap.put("deviceLevel", String.valueOf(ekr.i()));
            hashMap.put("accountType", cxg.a(C.broadCaster.type) + "");
            int i2 = C.roomType;
            if (ekr.O(C)) {
                i2 = 13;
            }
            hashMap.put(z9u.KEY_ROOMTYPE2, i2 + "");
            hashMap.put("entryScmPre", ekr.x);
            hashMap.put("entrySpmPre", ekr.y);
            hashMap.put("entryUtparamPre", ekr.z);
            hashMap.put("entrySpm", ekr.F);
            hashMap.put("entryLiveSource", ekr.B);
            hashMap.put("entryLiveSourcePre", ekr.A);
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
            hashMap.put("entryPvid", ekr.R);
            hashMap.put("timeShiftForEnter", ekr.y() + "");
            hashMap.put("jiangjie_ID", ekr.F());
            hashMap.put("oneproduct_jiangjie", ekr.G());
            hashMap.put("oneproduct_mounting", ekr.q());
            hashMap.put("timeShiftItemId", ekr.z());
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(C.status));
            if (v2s.o().u() == null || !v2s.o().u().checkSessionValid()) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            hashMap.put("login", str3);
            hashMap.put("livesource", ekr.o());
            hashMap.put(yj4.PARAM_ENTRY_SOURCE, ekr.j());
            hashMap.put("switchIndex", String.valueOf(ekr.K));
            hashMap.put("isUp", String.valueOf(ekr.M));
            hashMap.put("queryKey", ekr.v0);
            hashMap.put("clickid", ekr.w0);
            hashMap.put("watchid", ekr.E());
            hashMap.put(yj4.PARAM_PVID, ekr.e);
            StringBuilder sb = new StringBuilder();
            if (!ekr.H() && !C.isAD) {
                i = 0;
            }
            sb.append(i);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            hashMap.put("product_type", cxa.f17408a);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("trackInfo", str2);
            } else if (!TextUtils.isEmpty(ekr.A())) {
                hashMap.put("trackInfo", ekr.A());
            }
            if (!TextUtils.isEmpty(ekr.p())) {
                hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, ekr.p());
            }
            ux9 d = vx9.d();
            if (d instanceof cdr) {
                hashMap.put("liveToken", d.p());
            }
            cba cbaVar = (cba) vx9.f(vx9.d());
            if (cbaVar != null && !TextUtils.isEmpty(cbaVar.P)) {
                hashMap.put("spm-cnt", cbaVar.P);
            } else if (pvs.M0() && (ekr.L() || ekr.K())) {
                hashMap.put("spm-cnt", "a2141.23201685");
            } else if (c()) {
                hashMap.put("spm-cnt", e());
            } else {
                hashMap.put("spm-cnt", "a2141.8001249.1.1");
            }
            hashMap.put("timestampT", System.currentTimeMillis() + "");
            if (!TextUtils.isEmpty(C.tvChannelId)) {
                hashMap.put(z9u.KEY_OFFICIAL_CHANNEL_ID, C.tvChannelId);
            }
            if (zga.e(C.itemTransferInfo)) {
                str4 = "reward";
            } else {
                str4 = "normal";
            }
            hashMap.put("content_type", str4);
            hashMap.put("singleLiveTabSessionId", ekr.d0);
            if (v2s.o().E() != null) {
                v2s.o().E().track4Show("Page_TaobaoLiveWatch", str, hashMap);
            }
        }
    }

    public static void r(String str) {
        VideoInfo C;
        String str2;
        String str3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95621baf", new Object[]{str});
        } else if (ekr.N() && (C = ekr.C()) != null && C.broadCaster != null) {
            HashMap hashMap = new HashMap();
            String str4 = C.liveId;
            String str5 = C.broadCaster.accountId;
            hashMap.put("x_object_type", ekr.P);
            hashMap.put("feed_id", str4);
            hashMap.put(z9u.KEY_ACCOUNT_ID, str5);
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(C.status));
            hashMap.put("accounttype", cxg.a(C.broadCaster.type) + "");
            hashMap.put("scm-live", ekr.N);
            hashMap.put("spm-live", ekr.O);
            hashMap.put("feedtype", C.type + "");
            if (C.landScape) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap.put("landscape", str2);
            hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(C.roomType));
            StringBuilder sb = new StringBuilder();
            sb.append((ekr.H() || C.isAD) ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (ekr.e() != null) {
                i = 1;
            }
            sb2.append(i);
            sb2.append("");
            hashMap.put("isAdTransParams", sb2.toString());
            hashMap.put("entryScmPre", ekr.x);
            hashMap.put("entrySpmPre", ekr.y);
            hashMap.put("entryUtparamPre", ekr.z);
            hashMap.put("entryLiveSourcePre", ekr.A);
            hashMap.put("entryLiveSource", ekr.B);
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
            hashMap.put("entryPvid", ekr.R);
            hashMap.put("entryjiangjie_id", ekr.C);
            hashMap.put("timeMovingUtParams", ekr.D);
            hashMap.put(smh.entryQuery, ekr.E);
            hashMap.put("entrySpm", ekr.F);
            hashMap.put("entryScm", ekr.H);
            hashMap.put("entryFeedId", ekr.S);
            hashMap.put("entryContentId", ekr.T);
            hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, ekr.U);
            hashMap.put("entryLiveScm", ekr.V);
            hashMap.put("switchIndex", ekr.K + "");
            hashMap.put("isUp", ekr.M + "");
            hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, ekr.I);
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, ekr.J);
            hashMap.put("livesource", ekr.o());
            hashMap.put("common_live_page", "live");
            hashMap.put("content_id", str4);
            hashMap.put("deviceLevel", String.valueOf(ekr.i()));
            if (zga.e(C.itemTransferInfo)) {
                str3 = "reward";
            } else {
                str3 = "normal";
            }
            hashMap.put("content_type", str3);
            if (v2s.o().E() != null) {
                v2s.o().E().updateNextPageUtParam(hashMap);
            }
        }
    }

    public static Map<String, String> n(Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        Object obj2;
        Object obj3;
        String str6;
        String str7;
        ISmartLandingProxy.b bVar;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d1b17a", new Object[]{obj, str, str2, str3, str4, new Boolean(z), new Boolean(z2)});
        }
        if (!ekr.N()) {
            return new HashMap();
        }
        VideoInfo C = ekr.C();
        HashMap hashMap = new HashMap();
        if (C != null) {
            AccountInfo accountInfo = C.broadCaster;
            if (accountInfo != null) {
                String str9 = accountInfo.accountId;
                if (C.isOfficialType()) {
                    str9 = C.officialLiveInfo.accountId;
                    str8 = C.broadCaster.accountId;
                } else {
                    str8 = "";
                }
                hashMap.put(z9u.KEY_ACCOUNT_ID, str9);
                hashMap.put("former_anchorid", str8);
                hashMap.put("accounttype", cxg.a(C.broadCaster.type) + "");
            } else {
                i("broadCasterNull", null);
            }
            String str10 = C.liveId;
            if (C.isOfficialType()) {
                str10 = C.officialLiveInfo.officialLiveId;
                str5 = C.liveId;
            } else {
                str5 = "";
            }
            hashMap.put("former_liveid", str5);
            if (v2s.o().u().checkSessionValid()) {
                obj2 = "1";
            } else {
                obj2 = "0";
            }
            hashMap.put("login", obj2);
            hashMap.put("feed_id", str10);
            if (!TextUtils.isEmpty(C.gameId)) {
                hashMap.put("game_id", C.gameId);
            }
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(C.status));
            hashMap.put("roomStatus", String.valueOf(C.roomStatus));
            hashMap.put("feedtype", C.type + "");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("scm", str);
                Log.e("trackPageSCM", str);
            }
            if (ekr.f() != null) {
                hashMap.put("clickurl", ekr.f().clickid);
                hashMap.put("interactiveurl", ekr.f().interactiveid);
                hashMap.put("clickInfo", JSON.toJSONString(ekr.f().clickInfo));
            }
            hashMap.put("scm-live", ekr.N);
            hashMap.put("spm-live", ekr.O);
            hashMap.put("watchid", ekr.E());
            hashMap.put(yj4.PARAM_PVID, ekr.e);
            StringBuilder sb = new StringBuilder();
            sb.append((ekr.H() || C.isAD) ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
            hashMap.put("entryPvid", ekr.R);
            hashMap.put("isAdTransParams", String.valueOf(ekr.e() != null ? 1 : 0));
            hashMap.put("entryLiveSource", ekr.B);
            hashMap.put("entryjiangjie_id", ekr.C);
            hashMap.put("timeMovingUtParams", ekr.D);
            hashMap.put(smh.entryQuery, ekr.E);
            hashMap.put("entryScmPre", ekr.x);
            hashMap.put("entrySpmPre", ekr.y);
            hashMap.put("entryUtparamPre", ekr.z);
            hashMap.put("entryLiveSourcePre", ekr.A);
            hashMap.put("entryScm", ekr.H);
            hashMap.put("entryFeedId", ekr.S);
            hashMap.put("entryContentId", ekr.T);
            hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, ekr.U);
            hashMap.put("entryLiveScm", ekr.V);
            hashMap.put("switchIndex", ekr.K + "");
            hashMap.put("isUp", ekr.M + "");
            hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, ekr.I);
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, ekr.J);
            hashMap.put("singleLiveTabSessionId", ekr.d0);
            if (C.landScape) {
                obj3 = "1";
            } else {
                obj3 = "0";
            }
            hashMap.put("landscape", obj3);
            hashMap.put("skipbk", "1");
            hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(C.roomType));
            hashMap.put("newRoomType", String.valueOf(C.newRoomType));
            hashMap.put("deviceLevel", String.valueOf(ekr.i()));
            hashMap.put("timeShiftForEnter", ekr.y() + "");
            hashMap.put("jiangjie_ID", ekr.F());
            hashMap.put("kandianItemId", cxa.b);
            hashMap.put("oneproduct_jiangjie", ekr.G());
            hashMap.put("oneproduct_mounting", ekr.q());
            hashMap.put("product_type", cxa.f17408a);
            hashMap.put("timeShiftItemId", ekr.z());
            hashMap.put("queryKey", ekr.v0);
            ux9 d = vx9.d();
            if (d instanceof cdr) {
                hashMap.put("liveToken", d.p());
                cdr cdrVar = (cdr) d;
                if (!(cdrVar.w0() == null || cdrVar.w0().initParams == null || cdrVar.w0().initParams.get(yj4.PARAM_TCP_OUTER_PARAM) == null)) {
                    hashMap.put(yj4.PARAM_TCP_OUTER_PARAM, cdrVar.w0().initParams.get(yj4.PARAM_TCP_OUTER_PARAM));
                }
                cba G0 = cdrVar.j();
                if (!(G0 == null || (bVar = G0.u) == null)) {
                    hashMap.put("smartLandingToken", bVar.k());
                }
            }
            hashMap.put(yj4.PARAM_LIVE_AD_PARAMS, Uri.encode(ekr.X));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("clickid", str2);
            }
            if (!TextUtils.isEmpty(ekr.A())) {
                hashMap.put("trackInfo", ekr.A());
            }
            if (!TextUtils.isEmpty(ekr.p())) {
                hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, ekr.p());
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str3);
            }
            if (cxa.c) {
                str6 = "content";
            } else {
                str6 = "item";
            }
            hashMap.put("timemoving_type", str6);
            int i = C.roomType;
            if (ekr.O(C)) {
                i = 13;
            }
            hashMap.put(z9u.KEY_ROOMTYPE2, i + "");
            if (!(d == null || d.x() == null || d.x().w() == null)) {
                hashMap.put("play_token", d.x().w());
                hashMap.put("isKandian", String.valueOf(VideoStatus.VIDEO_TIMESHIFT_STATUS == d.x().e()));
            }
            if (!TextUtils.isEmpty(C.tvChannelId)) {
                hashMap.put(z9u.KEY_OFFICIAL_CHANNEL_ID, C.tvChannelId);
            }
            if (zga.e(C.itemTransferInfo)) {
                str7 = "reward";
            } else {
                str7 = "normal";
            }
            hashMap.put("content_type", str7);
            if (z2) {
                igq.n().g("liveRoomShow", JSON.toJSONString(hashMap), 1.0d);
            }
        }
        hashMap.put("session_id", sj9.k());
        cba cbaVar = (cba) vx9.f(vx9.d());
        if (cbaVar != null && !TextUtils.isEmpty(cbaVar.P)) {
            hashMap.put("spm-cnt", cbaVar.P);
        } else if (pvs.M0() && (ekr.L() || ekr.K())) {
            hashMap.put("spm-cnt", "a2141.23201685");
        } else if (c()) {
            hashMap.put("spm-cnt", e());
        } else {
            hashMap.put("spm-cnt", "a2141.8001249.1.1");
        }
        if (!TextUtils.isEmpty(ekr.w())) {
            hashMap.put("spm-url", ekr.w());
        }
        if (pvs.T0()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", (Object) ekr.W);
            jSONObject.put("spm", (Object) ekr.w());
            jSONObject.put("livesource", (Object) ekr.o());
            jSONObject.put(yj4.PARAM_ENTRY_SOURCE, (Object) ekr.j());
            hashMap.put("extendJson", jSONObject.toJSONString());
        }
        hashMap.put("entrySpm", ekr.F);
        hashMap.put("livesource", ekr.o());
        hashMap.put(yj4.PARAM_ENTRY_SOURCE, ekr.j());
        if (z) {
            du4.c(vx9.d(), obj, hashMap);
        }
        return hashMap;
    }
}
