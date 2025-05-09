package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
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
public class rbu extends z9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27269a;
        public final /* synthetic */ HashMap b;

        public a(String str, HashMap hashMap) {
            this.f27269a = str;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v2s.o().E() != null) {
                v2s.o().E().track4Show("Page_TaobaoLiveWatch", this.f27269a, this.b);
            }
        }
    }

    static {
        t2o.a(779093382);
    }

    public static void A(cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86eff230", new Object[]{cbaVar, obj});
        } else {
            g3h.e(null, cbaVar, u(cbaVar, obj));
        }
    }

    public static void B(ux9 ux9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2812ee", new Object[]{ux9Var, obj});
        } else {
            g3h.f(ux9Var, null, t(ux9Var, obj));
        }
    }

    public static void C(cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04202f1", new Object[]{cbaVar, obj});
        } else {
            g3h.f(null, cbaVar, u(cbaVar, obj));
        }
    }

    public static void D(ux9 ux9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421ffbf", new Object[]{ux9Var, obj});
            return;
        }
        Object t = t(ux9Var, obj);
        if ((ux9Var instanceof cdr) && v2s.o().E() != null && (t instanceof Activity)) {
            qmh.f().f26825a.f("liveRoom", "Page_TaobaoLiveWatch", ux9Var.u);
        }
        g3h.g(ux9Var, null, t);
    }

    public static void E(cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8936f40", new Object[]{cbaVar, obj});
            return;
        }
        Object u = u(cbaVar, obj);
        if (pvs.H0() && v2s.o().E() != null && (u instanceof Activity)) {
            qmh.f().f26825a.f("liveRoom", "Page_TaobaoLiveWatch", g3h.c(null, cbaVar, (Activity) u));
        }
        g3h.g(null, cbaVar, u);
    }

    public static void F(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{obj});
        } else if (v2s.o().E() != null) {
            v2s.o().E().skipPage(obj);
        }
    }

    public static void G(ux9 ux9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c75954", new Object[]{ux9Var, str, str2});
            return;
        }
        L(ux9Var, str, "from=" + str2);
    }

    public static void H(cba cbaVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0712fb", new Object[]{cbaVar, str, str2});
        } else {
            G(o(cbaVar), str, str2);
        }
    }

    public static void I(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd11f506", new Object[]{str, map});
        } else if (v2s.o().E() != null) {
            v2s.o().E().track4Click(z9u.PAGE_HOME_LIVETAB, str, map);
        }
    }

    public static void K(ux9 ux9Var, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7850c332", new Object[]{ux9Var, str, map});
        } else {
            J(ux9Var, "Page_TaobaoLiveWatch", str, map);
        }
    }

    public static void L(ux9 ux9Var, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e4c", new Object[]{ux9Var, str, strArr});
        } else {
            O(ux9Var, str, null, strArr);
        }
    }

    public static void M(cba cbaVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6b64dd", new Object[]{cbaVar, str, map});
        } else {
            K(o(cbaVar), str, map);
        }
    }

    public static void N(cba cbaVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27746277", new Object[]{cbaVar, str, strArr});
        } else {
            O(o(cbaVar), str, null, strArr);
        }
    }

    public static void O(ux9 ux9Var, String str, String str2, String... strArr) {
        LiveDetailMessinfoResponseData.AlimamaInfo j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4facae9d", new Object[]{ux9Var, str, str2, strArr});
        } else if (!(ux9Var instanceof cdr)) {
            ebu.l(str, str2, strArr);
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
        } else {
            cdr cdrVar = (cdr) ux9Var;
            if (cdrVar.j() == null) {
                ebu.l(str, str2, strArr);
                x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo getGlobalContext = null " + ux9Var);
                return;
            }
            cba G0 = cdrVar.j();
            w9c k = cdrVar.j().k();
            sxb g = cdrVar.g();
            if (k == null || g == null) {
                ebu.l(str, str2, strArr);
                return;
            }
            utt Q0 = g.Q0();
            jwg p0 = g.p0();
            g.N2();
            l2h W1 = g.W1();
            VideoInfo d = p0.d();
            if (!(d == null || d.broadCaster == null)) {
                ArrayList arrayList = new ArrayList();
                String str3 = d.liveId;
                String str4 = d.broadCaster.accountId;
                if (d.isOfficialType() && ink.b().c(str)) {
                    VideoInfo.OfficialLiveInfo officialLiveInfo = d.officialLiveInfo;
                    str3 = officialLiveInfo.officialLiveId;
                    str4 = officialLiveInfo.accountId;
                }
                arrayList.add("feed_id=" + str3);
                arrayList.add("account_id=" + str4);
                arrayList.add("deviceLevel=" + up6.m(ux9Var));
                haa q = k.q();
                jaa X0 = k.X0();
                qca O1 = k.O1();
                if (!TextUtils.isEmpty(p0.b())) {
                    arrayList.add("pkid=" + p0.b());
                }
                if (!TextUtils.isEmpty(q.E())) {
                    arrayList.add("spm-url=" + q.E());
                }
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add("trackInfo=" + str2);
                } else if (!TextUtils.isEmpty(q.H())) {
                    arrayList.add("trackInfo=" + q.H());
                }
                if (!TextUtils.isEmpty(q.y())) {
                    arrayList.add("liveoprt_id=" + q.y());
                }
                if (X0.j() != null) {
                    arrayList.add("clickurl=" + j.clickid);
                    arrayList.add("interactiveurl=" + j.interactiveid);
                    arrayList.add("clickInfo=" + j.clickInfo);
                }
                if (!TextUtils.isEmpty(G0.P)) {
                    arrayList.add("spm-cnt=" + G0.P);
                } else if (pvs.M0() && (q.R() || q.Q())) {
                    arrayList.add("spm-cnt=a2141.23201685");
                } else if (l()) {
                    arrayList.add("spm-cnt=" + p());
                } else {
                    arrayList.add("spm-cnt=a2141.8001249.1.1");
                }
                String str5 = "0";
                arrayList.add("is_fans=".concat(d.broadCaster.follow ? "1" : str5));
                arrayList.add("watchid=" + W1.b());
                arrayList.add("pvid=" + q.A());
                arrayList.add("isAD=" + (p0.e() ? 1 : 0));
                arrayList.add("entryUtparam=" + q.q());
                arrayList.add("entryPvid=" + q.i());
                StringBuilder sb = new StringBuilder("isAdTransParams=");
                sb.append(X0.a() != null ? 1 : 0);
                arrayList.add(sb.toString());
                arrayList.add("entryLiveSource=" + q.g());
                arrayList.add("entryjiangjie_id=" + O1.b());
                arrayList.add("timeMovingUtParams=" + up6.D(ux9Var));
                arrayList.add("entryScmPre=" + q.l());
                arrayList.add("entrySpmPre=" + q.o());
                arrayList.add("entryUtparamPre=" + q.r());
                arrayList.add("entryLiveSourcePre=" + q.h());
                arrayList.add("entryQuery=" + q.j());
                arrayList.add("entrySpm=" + q.n());
                arrayList.add("entryScm=" + q.k());
                arrayList.add("entryFeedId=" + q.d());
                arrayList.add("entryContentId=" + q.c());
                arrayList.add("entryAccountId=" + q.b());
                arrayList.add("entryLiveScm=" + q.f());
                arrayList.add("switchIndex=" + X0.h());
                arrayList.add("isUp=" + q.u());
                arrayList.add("entryTraceId=" + q.p());
                arrayList.add("entryLiveId=" + q.e());
                arrayList.add("product_type=" + cxa.f17408a);
                if (sj9.u()) {
                    arrayList.add("session_id=" + sj9.k());
                }
                arrayList.add("liveAdParams=" + Uri.encode(q.w()));
                if (!TextUtils.isEmpty(m09.e().c())) {
                    arrayList.add(z9u.ARG_FANS_LEVEL + m09.e().c());
                }
                arrayList.add("feedtype=" + d.type);
                arrayList.add("livestatus=" + d.status);
                arrayList.add("roomStatus=" + d.roomStatus);
                arrayList.add("landscape=" + d.landScape);
                arrayList.add("accounttype=" + cxg.a(d.broadCaster.type));
                arrayList.add("roomType=" + d.roomType);
                arrayList.add("livesource=" + q.L());
                arrayList.add("entrySource=" + q.m());
                int i = d.roomType;
                if (p0.g(d)) {
                    i = 13;
                }
                arrayList.add("roomtype2=" + i);
                arrayList.add("timeShiftForEnter=" + Q0.h() + "");
                StringBuilder sb2 = new StringBuilder("jiangjie_ID=");
                sb2.append(Q0.f());
                arrayList.add(sb2.toString());
                arrayList.add("oneproduct_jiangjie=" + Q0.g());
                arrayList.add("oneproduct_mounting=" + Q0.d());
                arrayList.add("timeShiftItemId=" + Q0.i());
                arrayList.add("liveToken=" + ux9Var.p());
                arrayList.add("queryKey=" + q.M());
                arrayList.add("clickid=" + X0.n());
                arrayList.add("room_type=live");
                arrayList.add("singleLiveTabSessionId=" + q.D());
                if (!TextUtils.isEmpty(d.tvChannelId)) {
                    arrayList.add("officialchannel_id=" + d.tvChannelId);
                }
                if (strArr != null && strArr.length > 0) {
                    for (String str6 : strArr) {
                        arrayList.add(str6);
                    }
                }
                StringBuilder sb3 = new StringBuilder("login=");
                if (v2s.o().u() != null && v2s.o().u().checkSessionValid()) {
                    str5 = "1";
                }
                sb3.append(str5);
                arrayList.add(sb3.toString());
                if (pvs.Z1() && !TextUtils.isEmpty(q.I())) {
                    arrayList.add("utparam-url=" + q.I());
                }
                arrayList.add("content_type=".concat(zga.e(d.itemTransferInfo) ? "reward" : "normal"));
                if (v2s.o().E() != null) {
                    v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, (String[]) arrayList.toArray(new String[0]));
                }
            }
        }
    }

    public static void P(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447e1bf7", new Object[]{str, map});
        } else if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, map);
        }
    }

    public static void Q(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88b303b", new Object[]{new Integer(i), str, map});
        } else if (v2s.o().E() != null) {
            v2s.o().E().trackCustom("Page_TaobaoLiveWatch", i, str, "", "0", map);
        }
    }

    public static void R(ux9 ux9Var, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b755b927", new Object[]{ux9Var, context, str});
        } else {
            S(ux9Var, context, str, null);
        }
    }

    public static void S(ux9 ux9Var, Context context, String str, Map<String, String> map) {
        Uri data;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ebcf7e", new Object[]{ux9Var, context, str, map});
            return;
        }
        Intent intent = ((Activity) context).getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            String queryParameter = data.getQueryParameter("utLogMap");
            String queryParameter2 = data.getQueryParameter(yj4.PARAM_UT_PARAMS);
            String str2 = "";
            String string = (TextUtils.isEmpty(queryParameter2) || (d = fkx.d(queryParameter2)) == null) ? str2 : d.getString(yj4.PARAMS_LIVE_TRACKINFO);
            String queryParameter3 = data.getQueryParameter("clickid");
            if (map != null) {
                str2 = map.get("follow_location");
            }
            L(ux9Var, "AccountFollow", "utLogMap=" + queryParameter, "x_live_trackInfo=" + string, "clickid=" + queryParameter3, "follow_location=" + str2);
        }
        i(ux9Var, "follow", "followAccount=" + str);
    }

    public static void T(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ee2c7a", new Object[]{str, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (v2s.o().E() != null) {
            m4e E = v2s.o().E();
            E.track4Show(z9u.PAGE_HOME_LIVETAB, "Page_Home_Livetab_" + str, hashMap);
        }
    }

    public static Map<String, String> V(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3332cc9e", new Object[]{ux9Var});
        }
        if (ux9Var instanceof cdr) {
            return W(ux9Var, null, "", "", "", "", true);
        }
        x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
        return ebu.m(null, "", "", "", "", true);
    }

    public static Map<String, String> W(ux9 ux9Var, Object obj, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3f2297c", new Object[]{ux9Var, obj, str, str2, str3, str4, new Boolean(z)});
        }
        Object t = t(ux9Var, obj);
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return ebu.m(t, str, str2, str3, str4, z);
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            return ebu.m(t, str, str2, str3, str4, z);
        }
        if (!k.X0().z()) {
            return ebu.m(t, str, str2, str3, str4, z);
        }
        return X(ux9Var, t, str, str2, str3, str4, z, true);
    }

    public static Map<String, String> Y(cba cbaVar, Object obj, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a8be37a7", new Object[]{cbaVar, obj, str, str2, str3, str4, new Boolean(z)});
        }
        return W(o(cbaVar), obj, str, str2, str3, str4, z);
    }

    public static Map<String, String> Z(cba cbaVar, Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9dbfcad7", new Object[]{cbaVar, obj, str, str2, str3, str4, new Boolean(z), new Boolean(z2)});
        }
        return X(o(cbaVar), u(cbaVar, obj), str, str2, str3, str4, z, z2);
    }

    public static List<String> a(ux9 ux9Var, String... strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ca21118", new Object[]{ux9Var, strArr});
        }
        ArrayList arrayList = new ArrayList();
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return ebu.a(strArr);
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            return ebu.a(strArr);
        }
        haa q = k.q();
        jwg p0 = g.p0();
        utt Q0 = g.Q0();
        VideoInfo d = p0.d();
        arrayList.add("feedId=" + q(ux9Var));
        arrayList.add("liveSource=" + q.L());
        arrayList.add("entrySource=" + q.m());
        arrayList.add("timestamp=" + System.currentTimeMillis());
        arrayList.add("timeShiftEntry=" + up6.Y(ux9Var));
        arrayList.add("jiangjie_ID=" + Q0.f());
        arrayList.add("oneproduct_jiangjie=" + Q0.g());
        arrayList.add("oneproduct_mounting=" + Q0.d());
        if (d != null) {
            AccountInfo accountInfo = d.broadCaster;
            if (accountInfo != null) {
                str = accountInfo.accountId;
            } else {
                str = "";
            }
            arrayList.add("accountId=" + str);
            arrayList.add("roomStatus=" + d.roomStatus);
        }
        if (!TextUtils.isEmpty(q.H())) {
            arrayList.add("trackInfo=" + q.H());
        }
        arrayList.add("serverParams=" + q.O());
        arrayList.add("fansLevel=" + m09.e().c());
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    public static void a0(ux9 ux9Var, String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c3035e", new Object[]{ux9Var, str, str2, str3, hashMap});
        } else if (n(ux9Var, str, str2, str3, hashMap) && v2s.o().E() != null) {
            v2s.o().E().track4Show(str, str2, hashMap);
        }
    }

    public static void b0(ux9 ux9Var, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8598a8", new Object[]{ux9Var, str, str2, hashMap});
        } else {
            a0(ux9Var, "Page_TaobaoLiveWatch", str, str2, hashMap);
        }
    }

    public static void c(cba cbaVar, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de83242", new Object[]{cbaVar, obj, str, strArr});
        } else {
            b(o(cbaVar), obj, str, strArr);
        }
    }

    public static void c0(ux9 ux9Var, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5dcc72", new Object[]{ux9Var, str, hashMap});
        } else {
            b0(ux9Var, str, null, hashMap);
        }
    }

    public static void d0(ux9 ux9Var, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178e79c", new Object[]{ux9Var, str, str2, hashMap});
            return;
        }
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        if (n(ux9Var, "Page_TaobaoLiveWatch", str, str2, hashMap2)) {
            Coordinator.execute(new a(str, hashMap2));
        }
    }

    public static void e(cba cbaVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736562f2", new Object[]{cbaVar, str, strArr});
        } else {
            d(o(cbaVar), str, strArr);
        }
    }

    public static void e0(cba cbaVar, bxl bxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dda8c", new Object[]{cbaVar, bxlVar});
            return;
        }
        g2e D = v2s.o().D();
        if (!(cbaVar == null || D == null)) {
            for (Map.Entry<String, String> entry : D.e().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (bxlVar != null) {
                    bxlVar.a(key, value);
                } else if (cbaVar.W() != null) {
                    cbaVar.W().put(key, value);
                }
            }
        }
    }

    public static void g(cba cbaVar, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6726efa1", new Object[]{cbaVar, obj, str, strArr});
        } else {
            f(o(cbaVar), obj, str, strArr);
        }
    }

    public static void h0(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c28c4fa", new Object[]{cbaVar});
        } else {
            f0(o(cbaVar));
        }
    }

    public static void i(ux9 ux9Var, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fee545a", new Object[]{ux9Var, str, strArr});
        } else {
            k(ux9Var, str, "", "", strArr);
        }
    }

    public static void i0(cba cbaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90286444", new Object[]{cbaVar, str});
        } else {
            g0(o(cbaVar), str);
        }
    }

    public static /* synthetic */ Object ipc$super(rbu rbuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/utils/TrackUtilsNew");
    }

    public static void j(cba cbaVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef3029", new Object[]{cbaVar, str, strArr});
        } else {
            k(o(cbaVar), str, "", "", strArr);
        }
    }

    public static void j0(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91357772", new Object[]{cbaVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (pvs.v1()) {
            hashMap.put("spm-url", r(o(cbaVar)));
        }
        if (v2s.o().E() != null) {
            v2s.o().E().updateNextPageProperties(hashMap);
        }
    }

    public static void k0(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14acdaf8", new Object[]{ux9Var});
        } else if (!(ux9Var instanceof cdr)) {
            ebu.s();
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
        } else {
            cdr cdrVar = (cdr) ux9Var;
            w9c k = cdrVar.j().k();
            sxb g = cdrVar.g();
            if (k == null || g == null) {
                ebu.s();
                return;
            }
            jaa X0 = k.X0();
            haa q = k.q();
            if (!X0.z()) {
                ebu.s();
            } else if (!pvs.U1()) {
                ebu.s();
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("scm-pre", q.C());
                if (v2s.o().E() != null) {
                    v2s.o().E().updateNextPageProperties(hashMap);
                }
            }
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef552e6", new Object[0])).booleanValue();
        }
        return iws.c();
    }

    public static void l0(ux9 ux9Var, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d52cf78", new Object[]{ux9Var, obj, str});
            return;
        }
        Object t = t(ux9Var, obj);
        if (!(ux9Var instanceof cdr)) {
            ebu.t(ux9Var, t, str);
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return;
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            ebu.t(ux9Var, t, str);
        } else if (k.X0().z()) {
            if (iws.c()) {
                str = z9u.PAGE_HOME_LIVETAB;
            }
            g3h.h(ux9Var, null, t, str);
        }
    }

    public static qt9 m(ux9 ux9Var, qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("b3d7e0ed", new Object[]{ux9Var, qt9Var});
        }
        if (qt9Var == null) {
            qt9Var = new qt9();
        }
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return ebu.d(qt9Var);
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            return ebu.d(qt9Var);
        }
        haa q = k.q();
        jaa X0 = k.X0();
        l2h W1 = g.W1();
        jwg p0 = g.p0();
        qt9Var.d = q.E();
        qt9Var.e = X0.n();
        qt9Var.f = q.L();
        qt9Var.g = String.valueOf(p0.e() ? 1 : 0);
        qt9Var.h = q.g();
        qt9Var.i = q.n();
        qt9Var.j = W1.b();
        qt9Var.k = q.A();
        qt9Var.l = o7c.ORIGIN_PAGE_LIVE_WATCH;
        qt9Var.m = "a2141.8001249.1.1";
        qt9Var.n = v2s.o().f().getAppKey();
        return qt9Var;
    }

    public static void m0(cba cbaVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c9883b", new Object[]{cbaVar, obj, str});
            return;
        }
        Object u = u(cbaVar, obj);
        if (iws.c()) {
            str = z9u.PAGE_HOME_LIVETAB;
        }
        g3h.h(null, cbaVar, u, str);
    }

    public static boolean n(ux9 ux9Var, String str, String str2, String str3, HashMap<String, String> hashMap) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22c3cfa4", new Object[]{ux9Var, str, str2, str3, hashMap})).booleanValue();
        }
        HashMap<String, String> hashMap2 = hashMap == null ? new HashMap<>() : hashMap;
        if (!(ux9Var instanceof cdr)) {
            ebu.o(str2, str3, hashMap2);
            x5t.j("TrackUtilsNew", "trackShow frameContext not TBFrameContext " + ux9Var);
            return false;
        }
        cdr cdrVar = (cdr) ux9Var;
        if (cdrVar.j() == null) {
            ebu.o(str2, str3, hashMap2);
            x5t.j("TrackUtilsNew", "trackShow getGlobalContext = null ");
            return false;
        }
        cba G0 = cdrVar.j();
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            ebu.o(str2, str3, hashMap2);
            return false;
        }
        utt Q0 = g.Q0();
        jwg p0 = g.p0();
        l2h W1 = g.W1();
        haa q = k.q();
        jaa X0 = k.X0();
        VideoInfo d = p0.d();
        if (!(d == null || (accountInfo = d.broadCaster) == null)) {
            String str4 = d.liveId;
            String str5 = accountInfo.accountId;
            hashMap2.put(yj4.PARAM_LIVE_AD_PARAMS, Uri.encode(q.w()));
            hashMap2.put("accounttype", cxg.a(d.broadCaster.type) + "");
            if (!TextUtils.isEmpty(q.E())) {
                hashMap2.put("spm-url", q.E());
            }
            hashMap2.put("feed_id", str4);
            hashMap2.put(z9u.KEY_ACCOUNT_ID, str5);
            hashMap2.put(z9u.KEY_ROOMTYPE, String.valueOf(d.roomType));
            hashMap2.put("deviceLevel", String.valueOf(up6.m(ux9Var)));
            hashMap2.put("accountType", cxg.a(d.broadCaster.type) + "");
            int i = d.roomType;
            if (p0.g(d)) {
                i = 13;
            }
            hashMap2.put(z9u.KEY_ROOMTYPE2, i + "");
            hashMap2.put("entryScmPre", q.l());
            hashMap2.put("entrySpmPre", q.o());
            hashMap2.put("entryUtparamPre", q.r());
            hashMap2.put("entryLiveSource", q.g());
            hashMap2.put("entrySpm", q.n());
            hashMap2.put("entryLiveSourcePre", q.h());
            hashMap2.put(yj4.PARAM_ENTRY_UT_PARAM, q.q());
            hashMap2.put("entryPvid", q.i());
            hashMap2.put("timeShiftForEnter", Q0.h() + "");
            hashMap2.put("jiangjie_ID", Q0.f());
            hashMap2.put("oneproduct_jiangjie", Q0.g());
            hashMap2.put("oneproduct_mounting", Q0.d());
            hashMap2.put("timeShiftItemId", Q0.i());
            hashMap2.put(z9u.KEY_LIVE_STATUS, String.valueOf(d.status));
            String str6 = "0";
            hashMap2.put("login", (v2s.o().u() == null || !v2s.o().u().checkSessionValid()) ? str6 : "1");
            hashMap2.put("livesource", q.L());
            hashMap2.put(yj4.PARAM_ENTRY_SOURCE, q.m());
            hashMap2.put("switchIndex", String.valueOf(X0.h()));
            hashMap2.put("isUp", String.valueOf(q.u()));
            hashMap2.put("queryKey", q.M());
            hashMap2.put("clickid", X0.n());
            hashMap2.put("watchid", W1.b());
            hashMap2.put(yj4.PARAM_PVID, q.A());
            if (p0.e()) {
                str6 = "1";
            }
            hashMap2.put("isAD", str6);
            hashMap2.put("product_type", cxa.f17408a);
            if (!TextUtils.isEmpty(str3)) {
                hashMap2.put("trackInfo", str3);
            } else if (!TextUtils.isEmpty(q.H())) {
                hashMap2.put("trackInfo", q.H());
            }
            if (!TextUtils.isEmpty(q.y())) {
                hashMap2.put(yj4.PARAM_TRACK_LIVEOPRT_ID, q.y());
            }
            if (!TextUtils.isEmpty(G0.P)) {
                hashMap2.put("spm-cnt", G0.P);
            } else if (pvs.M0() && (q.R() || q.Q())) {
                hashMap2.put("spm-cnt", "a2141.23201685");
            } else if (l()) {
                hashMap2.put("spm-cnt", p());
            } else {
                hashMap2.put("spm-cnt", "a2141.8001249.1.1");
            }
            if (sj9.u()) {
                hashMap2.put("session_id", sj9.k());
            }
            hashMap2.put("timestampT", System.currentTimeMillis() + "");
            if (!TextUtils.isEmpty(d.tvChannelId)) {
                hashMap2.put(z9u.KEY_OFFICIAL_CHANNEL_ID, d.tvChannelId);
            }
            hashMap2.put("content_type", zga.e(d.itemTransferInfo) ? "reward" : "normal");
            hashMap2.put("singleLiveTabSessionId", q.D());
            hashMap2.put("liveToken", ux9Var.p());
            if (!(ux9Var.A() == null || ux9Var.A().taoliveOpenContext == null || ux9Var.A().taoliveOpenContext.f == null)) {
                hashMap2.put("liveHomePageType", (String) ux9Var.A().taoliveOpenContext.f.get("liveHomePageType"));
            }
        }
        return true;
    }

    public static void n0(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{obj, map});
        } else {
            du4.c(vx9.d(), obj, map);
        }
    }

    public static ux9 o(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("14fb745e", new Object[]{cbaVar});
        }
        cdr cdrVar = (cdr) vx9.d();
        if (cdrVar != null) {
            return cdrVar;
        }
        cdr cdrVar2 = new cdr();
        cdrVar2.M0(cbaVar);
        cdrVar2.T(new txb());
        return cdrVar2;
    }

    public static void o0(ux9 ux9Var, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97be44ef", new Object[]{ux9Var, obj, map});
            return;
        }
        Object t = t(ux9Var, obj);
        if (!(ux9Var instanceof cdr)) {
            ebu.u(t, map);
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return;
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            ebu.u(t, map);
        } else if (k.X0().z()) {
            du4.c(ux9Var, t, map);
        }
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3bdf591", new Object[0]);
        }
        return iws.e();
    }

    public static String q(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8b9e6d4", new Object[]{ux9Var});
        }
        new ArrayList();
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return ebu.f();
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            return ebu.f();
        }
        VideoInfo d = g.p0().d();
        if (d != null) {
            return d.liveId;
        }
        return null;
    }

    public static String r(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bb4a416", new Object[]{ux9Var});
        }
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "getLiveSpmCnt frameContext not TBFrameContext " + ux9Var);
            return ebu.g();
        }
        cdr cdrVar = (cdr) ux9Var;
        if (cdrVar.g() == null) {
            return ebu.g();
        }
        return s(cdrVar.j());
    }

    public static String s(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e657f23", new Object[]{cbaVar});
        }
        if (cbaVar == null) {
            x5t.j("TrackUtilsNew", "getLiveSpmCnt getGlobalContext = null ");
            return ebu.g();
        }
        w9c k = cbaVar.k();
        if (k == null) {
            return ebu.g();
        }
        haa q = k.q();
        if (q == null) {
            return ebu.g();
        }
        if (!TextUtils.isEmpty(cbaVar.P)) {
            return cbaVar.P;
        }
        if (pvs.M0() && (q.R() || q.Q())) {
            return "a2141.23201685";
        }
        if (l()) {
            return p();
        }
        return "a2141.8001249.1.1";
    }

    public static Object t(ux9 ux9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e5819a78", new Object[]{ux9Var, obj});
        }
        if (ux9Var == null) {
            ux9Var = vx9.d();
        }
        if (!(ux9Var instanceof cdr)) {
            return obj;
        }
        cba G0 = ((cdr) ux9Var).j();
        if (G0 == null || !G0.f0()) {
            return obj;
        }
        Object obj2 = G0.J;
        if (obj2 != null) {
            return obj2;
        }
        return G0;
    }

    public static Object u(cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("91a928b5", new Object[]{cbaVar, obj});
        }
        if (cbaVar == null) {
            return obj;
        }
        if (!cbaVar.f0()) {
            return obj;
        }
        Object obj2 = cbaVar.J;
        if (obj2 != null) {
            return obj2;
        }
        return cbaVar;
    }

    public static Map<String, String> v(ux9 ux9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b1a4c1d8", new Object[]{ux9Var, obj});
        }
        return g3h.d(ux9Var, null, t(ux9Var, obj));
    }

    public static String x(cba cbaVar, Activity activity) {
        Map<String, String> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9299c1aa", new Object[]{cbaVar, activity});
        }
        if (activity == null || v2s.o().E() == null || (c = g3h.c(null, cbaVar, activity)) == null || !c.containsKey(z9u.KEY_UTPARAM_URL)) {
            return null;
        }
        return c.get(z9u.KEY_UTPARAM_URL);
    }

    public static Map<String, String> y(ux9 ux9Var, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb257cf0", new Object[]{ux9Var, obj, str});
        }
        Object t = t(ux9Var, obj);
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return ebu.h(t, str);
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            return ebu.h(t, str);
        }
        if (!k.X0().z()) {
            return ebu.h(t, str);
        }
        return W(ux9Var, t, str, null, null, null, true);
    }

    public static void z(ux9 ux9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62294ecf", new Object[]{ux9Var, obj});
        } else {
            g3h.e(ux9Var, null, t(ux9Var, obj));
        }
    }

    public static void b(ux9 ux9Var, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cecdc3a9", new Object[]{ux9Var, obj, str, strArr});
            return;
        }
        List<String> a2 = a(ux9Var, strArr);
        if (TextUtils.isEmpty(str)) {
            str = q(ux9Var);
        }
        gq0.p().commitEnter("taobaolive", str, obj, (String[]) a2.toArray(new String[0]));
    }

    public static void d(ux9 ux9Var, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6481d71", new Object[]{ux9Var, str, strArr});
            return;
        }
        List<String> a2 = a(ux9Var, strArr);
        if (TextUtils.isEmpty(str)) {
            str = q(ux9Var);
        }
        gq0.p().a("taobaolive", str, (String[]) a2.toArray(new String[0]));
    }

    public static void f(ux9 ux9Var, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e800d6a", new Object[]{ux9Var, obj, str, strArr});
            return;
        }
        List<String> a2 = a(ux9Var, strArr);
        if (TextUtils.isEmpty(str)) {
            str = q(ux9Var);
        }
        gq0.p().commitLeave("taobaolive", str, obj, (String[]) a2.toArray(new String[0]));
    }

    public static void h(ux9 ux9Var, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989ccb6e", new Object[]{ux9Var, str, strArr});
            return;
        }
        List<String> a2 = a(ux9Var, strArr);
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            ebu.b(str, strArr);
            return;
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            ebu.b(str, strArr);
        } else {
            gq0.p().b("taobaolive", str, k.q().H(), (String[]) a2.toArray(new String[0]));
        }
    }

    public static void k(ux9 ux9Var, String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93047e4b", new Object[]{ux9Var, str, str2, str3, strArr});
            return;
        }
        List<String> a2 = a(ux9Var, strArr);
        if (TextUtils.isEmpty(str3)) {
            str3 = q(ux9Var);
        }
        gq0.p().commitTap("taobaolive", str, str2, str3, (String[]) a2.toArray(new String[0]));
    }

    public static void J(ux9 ux9Var, String str, String str2, Map<String, String> map) {
        String str3;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c365dae8", new Object[]{ux9Var, str, str2, map});
        } else if (!(ux9Var instanceof cdr)) {
            ebu.j(str2, map);
        } else {
            cdr cdrVar = (cdr) ux9Var;
            w9c k = cdrVar.j().k();
            sxb g = cdrVar.g();
            if (g == null || k == null) {
                ebu.j(str2, map);
                return;
            }
            haa q = k.q();
            jaa X0 = k.X0();
            qca O1 = k.O1();
            jwg p0 = g.p0();
            utt Q0 = g.Q0();
            g.N2();
            l2h W1 = g.W1();
            if (v2s.o().E() != null) {
                if (map != null) {
                    map.put("livesource", q.L());
                    map.put(yj4.PARAM_ENTRY_SOURCE, q.m());
                    map.put("timeShiftForEnter", Q0.h() + "");
                    map.put("jiangjie_ID", Q0.f());
                    map.put("oneproduct_jiangjie", Q0.g());
                    map.put("oneproduct_mounting", Q0.d());
                    map.put("timeShiftItemId", Q0.i());
                    map.put("queryKey", q.M());
                    map.put("clickid", X0.n());
                    map.put("isAD", (p0.e() ? 1 : 0) + "");
                    StringBuilder sb = new StringBuilder();
                    if (X0.a() == null) {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append("");
                    map.put("isAdTransParams", sb.toString());
                    map.put("entryLiveSource", q.g());
                    map.put("entryjiangjie_id", O1.b());
                    map.put("timeMovingUtParams", up6.D(ux9Var));
                    map.put(smh.entryQuery, q.j());
                    map.put("entryScmPre", q.l());
                    map.put("entrySpmPre", q.o());
                    map.put("entryUtparamPre", q.r());
                    map.put("entrySpm", q.n());
                    map.put("entryScm", q.k());
                    map.put("entryFeedId", q.d());
                    map.put("entryContentId", q.c());
                    map.put(zlr.PARAM_ENTRY_ACCOUNT_ID, q.b());
                    map.put("entryLiveScm", q.f());
                    map.put("switchIndex", X0.h() + "");
                    map.put("isUp", q.u() + "");
                    map.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, q.p());
                    map.put(zlr.PARAM_ENTRY_LIVE_ID, q.e());
                    map.put(yj4.PARAM_ENTRY_UT_PARAM, q.q());
                    map.put("entryPvid", q.i());
                    map.put("watchid", W1.b());
                    map.put(yj4.PARAM_PVID, q.A());
                    map.put("product_type", cxa.f17408a);
                    map.put("singleLiveTabSessionId", q.D());
                    map.put("liveToken", ux9Var.p());
                    if (sj9.u()) {
                        map.put("session_id", sj9.k());
                    }
                    VideoInfo d = p0.d();
                    if (d != null) {
                        if (zga.e(d.itemTransferInfo)) {
                            str3 = "reward";
                        } else {
                            str3 = "normal";
                        }
                        map.put("content_type", str3);
                        map.put(z9u.KEY_ROOMTYPE, String.valueOf(d.roomType));
                        map.put("newRoomType", String.valueOf(d.newRoomType));
                        map.put("roomStatus", d.roomStatus);
                        map.put(z9u.KEY_LIVE_STATUS, String.valueOf(d.status));
                        String str4 = d.liveId;
                        String str5 = d.broadCaster.accountId;
                        if (d.isOfficialType() && ink.b().c(str2)) {
                            VideoInfo.OfficialLiveInfo officialLiveInfo = d.officialLiveInfo;
                            String str6 = officialLiveInfo.officialLiveId;
                            str5 = officialLiveInfo.accountId;
                            str4 = str6;
                        }
                        if (!TextUtils.isEmpty(q.E())) {
                            map.put("spm-url", q.E());
                        }
                        map.put("feed_id", str4);
                        map.put(z9u.KEY_ACCOUNT_ID, str5);
                        if (!TextUtils.isEmpty(d.tvChannelId)) {
                            map.put(z9u.KEY_OFFICIAL_CHANNEL_ID, d.tvChannelId);
                        }
                    }
                    map.put("spm-cnt", r(ux9Var));
                    if (!(ux9Var.A() == null || ux9Var.A().taoliveOpenContext == null || ux9Var.A().taoliveOpenContext.f == null)) {
                        map.put("liveHomePageType", (String) ux9Var.A().taoliveOpenContext.f.get("liveHomePageType"));
                    }
                }
                v2s.o().E().track4Click(str, str2, map);
            }
        }
    }

    public static void f0(ux9 ux9Var) {
        String str;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c4a94d", new Object[]{ux9Var});
        } else if (!(ux9Var instanceof cdr)) {
            ebu.q();
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
        } else {
            cdr cdrVar = (cdr) ux9Var;
            w9c k = cdrVar.j().k();
            sxb g = cdrVar.g();
            if (k == null || g == null) {
                ebu.q();
                return;
            }
            jaa X0 = k.X0();
            haa q = k.q();
            qca O1 = k.O1();
            jwg p0 = g.p0();
            if (!X0.z()) {
                ebu.q();
            } else if (!pvs.U1()) {
                ebu.q();
            } else {
                VideoInfo d = p0.d();
                if (d != null && d.broadCaster != null) {
                    HashMap hashMap = new HashMap();
                    String str3 = d.liveId;
                    String str4 = d.broadCaster.accountId;
                    hashMap.put("feed_id", str3);
                    hashMap.put(z9u.KEY_ACCOUNT_ID, str4);
                    hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(d.status));
                    hashMap.put("accounttype", cxg.a(d.broadCaster.type) + "");
                    hashMap.put("scm-live", q.C());
                    hashMap.put("spm-live", q.G());
                    if (pvs.U1()) {
                        hashMap.put("x_object_type", up6.i0(ux9Var));
                    }
                    hashMap.put("feedtype", d.type + "");
                    if (d.landScape) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("landscape", str);
                    hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(d.roomType));
                    hashMap.put("isAD", (p0.e() ? 1 : 0) + "");
                    StringBuilder sb = new StringBuilder();
                    if (X0.a() != null) {
                        i = 1;
                    }
                    sb.append(i);
                    sb.append("");
                    hashMap.put("isAdTransParams", sb.toString());
                    hashMap.put("entryScmPre", q.l());
                    hashMap.put("entrySpmPre", q.o());
                    hashMap.put("entryUtparamPre", q.r());
                    hashMap.put("entryLiveSourcePre", q.h());
                    hashMap.put("entryLiveSource", q.g());
                    hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, q.q());
                    hashMap.put("entryPvid", q.i());
                    hashMap.put("entryjiangjie_id", O1.b());
                    hashMap.put("timeMovingUtParams", up6.D(ux9Var));
                    hashMap.put(smh.entryQuery, q.j());
                    hashMap.put("entrySpm", q.n());
                    hashMap.put("entryScm", q.k());
                    hashMap.put("entryFeedId", q.d());
                    hashMap.put("entryContentId", q.c());
                    hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, q.b());
                    hashMap.put("entryLiveScm", q.f());
                    hashMap.put("switchIndex", String.valueOf(X0.h()));
                    hashMap.put("isUp", String.valueOf(q.u()));
                    hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, q.p());
                    hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, q.e());
                    hashMap.put("livesource", q.L());
                    hashMap.put("common_live_page", "live");
                    hashMap.put("content_id", str3);
                    hashMap.put("deviceLevel", String.valueOf(up6.m(ux9Var)));
                    if (pvs.T1()) {
                        hashMap.put("clickid", X0.n());
                    }
                    if (!TextUtils.isEmpty(q.y())) {
                        hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, q.y());
                    }
                    if (zga.e(d.itemTransferInfo)) {
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
        }
    }

    public static void g0(ux9 ux9Var, String str) {
        String str2;
        String str3;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5550f9d7", new Object[]{ux9Var, str});
        } else if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            ebu.r(str);
        } else {
            cdr cdrVar = (cdr) ux9Var;
            w9c k = cdrVar.j().k();
            sxb g = cdrVar.g();
            if (k == null || g == null) {
                ebu.r(str);
                return;
            }
            jaa X0 = k.X0();
            haa q = k.q();
            qca O1 = k.O1();
            jwg p0 = g.p0();
            if (!X0.z()) {
                ebu.r(str);
                return;
            }
            VideoInfo d = p0.d();
            if (d != null && d.broadCaster != null) {
                HashMap hashMap = new HashMap();
                String str4 = d.liveId;
                String str5 = d.broadCaster.accountId;
                hashMap.put("x_object_type", up6.i0(ux9Var));
                hashMap.put("feed_id", str4);
                hashMap.put(z9u.KEY_ACCOUNT_ID, str5);
                hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(d.status));
                hashMap.put("accounttype", cxg.a(d.broadCaster.type) + "");
                hashMap.put("scm-live", q.C());
                hashMap.put("spm-live", q.G());
                hashMap.put("feedtype", d.type + "");
                if (d.landScape) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                hashMap.put("landscape", str2);
                hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(d.roomType));
                hashMap.put("isAD", (p0.e() ? 1 : 0) + "");
                StringBuilder sb = new StringBuilder();
                if (X0.a() == null) {
                    i = 0;
                }
                sb.append(i);
                sb.append("");
                hashMap.put("isAdTransParams", sb.toString());
                hashMap.put("entryScmPre", q.l());
                hashMap.put("entrySpmPre", q.o());
                hashMap.put("entryUtparamPre", q.r());
                hashMap.put("entryLiveSourcePre", q.h());
                hashMap.put("entryLiveSource", q.g());
                hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, q.q());
                hashMap.put("entryPvid", q.i());
                hashMap.put("entryjiangjie_id", O1.b());
                hashMap.put("timeMovingUtParams", up6.D(ux9Var));
                hashMap.put(smh.entryQuery, q.j());
                hashMap.put("entrySpm", q.n());
                hashMap.put("entryScm", q.k());
                hashMap.put("entryFeedId", q.d());
                hashMap.put("entryContentId", q.c());
                hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, q.b());
                hashMap.put("entryLiveScm", q.f());
                hashMap.put("switchIndex", String.valueOf(X0.h()));
                hashMap.put("isUp", String.valueOf(q.u()));
                hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, q.p());
                hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, q.e());
                hashMap.put("livesource", q.L());
                hashMap.put("common_live_page", "live");
                hashMap.put("content_id", str4);
                hashMap.put("deviceLevel", String.valueOf(up6.m(ux9Var)));
                if (zga.e(d.itemTransferInfo)) {
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
    }

    public static Map<String, String> w(ux9 ux9Var) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e1c04e36", new Object[]{ux9Var});
        }
        HashMap hashMap = new HashMap();
        if (!(ux9Var instanceof cdr)) {
            return hashMap;
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (!(g == null || k == null)) {
            haa q = k.q();
            jaa X0 = k.X0();
            qca O1 = k.O1();
            jwg p0 = g.p0();
            utt Q0 = g.Q0();
            l2h W1 = g.W1();
            hashMap.put("livesource", q.L());
            hashMap.put(yj4.PARAM_ENTRY_SOURCE, q.m());
            hashMap.put("timeShiftForEnter", Q0.h() + "");
            hashMap.put("jiangjie_ID", Q0.f());
            hashMap.put("oneproduct_jiangjie", Q0.g());
            hashMap.put("oneproduct_mounting", Q0.d());
            hashMap.put("timeShiftItemId", Q0.i());
            hashMap.put("queryKey", q.M());
            hashMap.put("clickid", X0.n());
            hashMap.put("isAD", (p0.e() ? 1 : 0) + "");
            StringBuilder sb = new StringBuilder();
            if (X0.a() != null) {
                i = 1;
            }
            sb.append(i);
            sb.append("");
            hashMap.put("isAdTransParams", sb.toString());
            hashMap.put("entryLiveSource", q.g());
            hashMap.put("entryjiangjie_id", O1.b());
            hashMap.put("timeMovingUtParams", up6.D(ux9Var));
            hashMap.put(smh.entryQuery, q.j());
            hashMap.put("entryScmPre", q.l());
            hashMap.put("entrySpmPre", q.o());
            hashMap.put("entryUtparamPre", q.r());
            hashMap.put("entrySpm", q.n());
            hashMap.put("entryScm", q.k());
            hashMap.put("entryFeedId", q.d());
            hashMap.put("entryContentId", q.c());
            hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, q.b());
            hashMap.put("entryLiveScm", q.f());
            hashMap.put("switchIndex", X0.h() + "");
            hashMap.put("isUp", q.u() + "");
            hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, q.p());
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, q.e());
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, q.q());
            hashMap.put("entryPvid", q.i());
            hashMap.put("watchid", W1.b());
            hashMap.put(yj4.PARAM_PVID, q.A());
            hashMap.put("product_type", cxa.f17408a);
            hashMap.put("singleLiveTabSessionId", q.D());
            hashMap.put("liveToken", ux9Var.p());
            if (sj9.u()) {
                hashMap.put("session_id", sj9.k());
            }
            VideoInfo d = p0.d();
            if (d != null) {
                if (zga.e(d.itemTransferInfo)) {
                    str = "reward";
                } else {
                    str = "normal";
                }
                hashMap.put("content_type", str);
                hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(d.roomType));
                hashMap.put("newRoomType", String.valueOf(d.newRoomType));
                hashMap.put("roomStatus", d.roomStatus);
                String str2 = d.liveId;
                String str3 = d.broadCaster.accountId;
                if (d.isOfficialType()) {
                    VideoInfo.OfficialLiveInfo officialLiveInfo = d.officialLiveInfo;
                    String str4 = officialLiveInfo.officialLiveId;
                    str3 = officialLiveInfo.accountId;
                    str2 = str4;
                }
                if (!TextUtils.isEmpty(q.E())) {
                    hashMap.put("spm-url", q.E());
                }
                hashMap.put("feed_id", str2);
                hashMap.put(z9u.KEY_ACCOUNT_ID, str3);
                if (!TextUtils.isEmpty(d.tvChannelId)) {
                    hashMap.put(z9u.KEY_OFFICIAL_CHANNEL_ID, d.tvChannelId);
                }
            }
            hashMap.put("spm-cnt", r(ux9Var));
            if (!(ux9Var.A() == null || ux9Var.A().taoliveOpenContext == null || ux9Var.A().taoliveOpenContext.f == null)) {
                hashMap.put("liveHomePageType", (String) ux9Var.A().taoliveOpenContext.f.get("liveHomePageType"));
            }
        }
        return hashMap;
    }

    public static void U(ux9 ux9Var, String str, long j, String str2, boolean z, String str3, HashMap<String, String> hashMap) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b71560", new Object[]{ux9Var, str, new Long(j), str2, new Boolean(z), str3, hashMap});
            return;
        }
        String str19 = "";
        if (hashMap != null) {
            if (hashMap.containsKey("class_number")) {
                str16 = hashMap.get("class_number");
            } else {
                str16 = "0";
            }
            if (hashMap.containsKey("class_total")) {
                str17 = hashMap.get("class_total");
            } else {
                str17 = "0";
            }
            str9 = hashMap.containsKey("scene") ? hashMap.get("scene") : str19;
            if (hashMap.containsKey("itemBizType")) {
                str19 = hashMap.get("itemBizType");
                str18 = "0";
            } else {
                str18 = "0";
                str19 = str19;
            }
            str15 = hashMap.containsKey("bubbleType") ? hashMap.get("bubbleType") : str19;
            String str20 = hashMap.containsKey("item_index") ? hashMap.get("item_index") : str19;
            str13 = hashMap.containsKey("class_number") ? hashMap.get("class_number") : str19;
            if (hashMap.containsKey("class_total")) {
                str11 = hashMap.get("class_total");
                str14 = str20;
            } else {
                str14 = str20;
                str11 = str19;
            }
            str12 = hashMap.containsKey("channel") ? hashMap.get("channel") : str19;
            str10 = hashMap.containsKey("isYanxuan") ? hashMap.get("isYanxuan") : str19;
            str6 = hashMap.containsKey("isDownShelf") ? hashMap.get("isDownShelf") : str19;
            str7 = hashMap.containsKey("pre") ? hashMap.get("pre") : str19;
            str8 = hashMap.containsKey("preset") ? hashMap.get("preset") : str19;
            str5 = hashMap.containsKey("highlight_coupon_type") ? hashMap.get("highlight_coupon_type") : str19;
            str4 = hashMap.containsKey("highlight_coupon_id") ? hashMap.get("highlight_coupon_id") : str19;
            if (hashMap.containsKey("highlight_strategy_code")) {
                str19 = hashMap.get("highlight_strategy_code");
            }
        } else {
            str18 = "0";
            str15 = str19;
            str14 = str15;
            str13 = str14;
            str12 = str13;
            str11 = str12;
            str10 = str11;
            str9 = str10;
            str8 = str9;
            str7 = str8;
            str6 = str7;
            str5 = str6;
            str4 = str5;
            str19 = str4;
            str17 = str18;
            str16 = str17;
        }
        String str21 = z9u.ARG_ITEM_ID + j;
        if (z) {
            str18 = "1";
        }
        L(ux9Var, str, str21, z9u.ARG_IS_GROUP.concat(str18), "clickSource=" + str2, "class_number=" + str16, "class_total=" + str17, "tradeParams=" + str3, "itemBizType=" + str19, "bubbleType=" + str15, "item_index=" + str14, "class_number=" + str13, "class_total=" + str11, z9u.ARG_CHANNEL + str12, "isYanxuan=" + str10, "scene=" + str9, "isDownShelf=" + str6, "pre=" + str7, "preset=" + str8, "coupon_type=" + str5, "coupon_id=" + str4, "strategyCode=" + str19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map<String, String> X(ux9 ux9Var, Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        String str6;
        w9c w9cVar;
        String str7;
        Object[] objArr;
        Object[] objArr2;
        String str8;
        ISmartLandingProxy.b bVar;
        String str9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e90a13a2", new Object[]{ux9Var, obj, str, str2, str3, str4, new Boolean(z), new Boolean(z2)});
        }
        Object t = t(ux9Var, obj);
        if (!(ux9Var instanceof cdr)) {
            x5t.j("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + ux9Var);
            return ebu.n(t, str, str2, str3, str4, z, z2);
        }
        cdr cdrVar = (cdr) ux9Var;
        w9c k = cdrVar.j().k();
        sxb g = cdrVar.g();
        if (k == null || g == null) {
            return ebu.n(t, str, str2, str3, str4, z, z2);
        }
        jaa X0 = k.X0();
        qca O1 = k.O1();
        haa q = k.q();
        jwg p0 = g.p0();
        utt Q0 = g.Q0();
        l2h W1 = g.W1();
        if (!X0.z()) {
            return ebu.n(t, str, str2, str3, str4, z, z2);
        }
        VideoInfo d = p0.d();
        HashMap hashMap = new HashMap();
        if (d != null) {
            if (!qvs.g0() || !qvs.c0() || d9m.s() == null) {
                str6 = "TrackUtilsNew";
                w9cVar = k;
            } else {
                w9cVar = k;
                str6 = "TrackUtilsNew";
                Map<String, String> b = d9m.s().b(d.originalData);
                if (b != null) {
                    hashMap.putAll(b);
                }
            }
            AccountInfo accountInfo = d.broadCaster;
            if (accountInfo != null) {
                String str10 = accountInfo.accountId;
                if (d.isOfficialType()) {
                    String str11 = d.officialLiveInfo.accountId;
                    str5 = "content";
                    str9 = d.broadCaster.accountId;
                    str10 = str11;
                } else {
                    str5 = "content";
                    str9 = "";
                }
                hashMap.put(z9u.KEY_ACCOUNT_ID, str10);
                hashMap.put("former_anchorid", str9);
                hashMap.put("accounttype", cxg.a(d.broadCaster.type) + "");
            } else {
                str5 = "content";
                G(ux9Var, "broadCasterNull", null);
            }
            String str12 = d.liveId;
            if (d.isOfficialType()) {
                str12 = d.officialLiveInfo.officialLiveId;
                str7 = d.liveId;
            } else {
                str7 = "";
            }
            hashMap.put("former_liveid", str7);
            if (v2s.o().u().checkSessionValid()) {
                objArr = "1";
            } else {
                objArr = "0";
            }
            hashMap.put("login", objArr);
            hashMap.put("feed_id", str12);
            if (!TextUtils.isEmpty(d.gameId)) {
                hashMap.put("game_id", d.gameId);
            }
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(d.status));
            hashMap.put("roomStatus", String.valueOf(d.roomStatus));
            hashMap.put("feedtype", d.type + "");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("scm", str);
                Log.e("trackPageSCM", str);
            }
            LiveDetailMessinfoResponseData.AlimamaInfo j = X0.j();
            if (j != null) {
                hashMap.put("clickurl", j.clickid);
                hashMap.put("interactiveurl", j.interactiveid);
                hashMap.put("clickInfo", JSON.toJSONString(j.clickInfo));
            }
            hashMap.put("scm-live", q.C());
            hashMap.put("spm-live", q.G());
            hashMap.put("watchid", W1.b());
            hashMap.put(yj4.PARAM_PVID, q.A());
            hashMap.put("isAD", (p0.e() ? 1 : 0) + "");
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, q.q());
            hashMap.put("entryPvid", q.i());
            hashMap.put("isAdTransParams", String.valueOf(X0.a() != null ? 1 : 0));
            hashMap.put("entryjiangjie_id", O1.b());
            hashMap.put("timeMovingUtParams", up6.D(ux9Var));
            hashMap.put(smh.entryQuery, q.j());
            hashMap.put("entryScmPre", q.l());
            hashMap.put("entrySpmPre", q.o());
            hashMap.put("entryUtparamPre", q.r());
            hashMap.put("entryScm", q.k());
            hashMap.put("entryFeedId", q.d());
            hashMap.put("entryContentId", q.c());
            hashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, q.b());
            hashMap.put("entryLiveScm", q.f());
            hashMap.put("switchIndex", String.valueOf(X0.h()));
            hashMap.put("isUp", String.valueOf(q.u()));
            hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, q.p());
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, q.e());
            hashMap.put("singleLiveTabSessionId", q.D());
            if (d.landScape) {
                objArr2 = "1";
            } else {
                objArr2 = "0";
            }
            hashMap.put("landscape", objArr2);
            hashMap.put("skipbk", "1");
            hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(d.roomType));
            hashMap.put("newRoomType", String.valueOf(d.newRoomType));
            hashMap.put("deviceLevel", String.valueOf(up6.m(ux9Var)));
            hashMap.put("timeShiftForEnter", Q0.h() + "");
            hashMap.put("kandianItemId", cxa.b);
            hashMap.put("product_type", cxa.f17408a);
            hashMap.put("timeShiftItemId", Q0.i());
            hashMap.put("jiangjie_ID", Q0.f());
            hashMap.put("oneproduct_jiangjie", Q0.g());
            hashMap.put("oneproduct_mounting", Q0.d());
            hashMap.put("timeShiftItemId", Q0.i());
            hashMap.put("queryKey", q.M());
            hashMap.put("liveToken", ux9Var.p());
            cba G0 = cdrVar.j();
            if (!(G0 == null || (bVar = G0.u) == null)) {
                hashMap.put("smartLandingToken", bVar.k());
            }
            if (!(cdrVar.w0() == null || cdrVar.w0().initParams == null || cdrVar.w0().initParams.get(yj4.PARAM_TCP_OUTER_PARAM) == null)) {
                hashMap.put(yj4.PARAM_TCP_OUTER_PARAM, cdrVar.w0().initParams.get(yj4.PARAM_TCP_OUTER_PARAM));
            }
            hashMap.put(yj4.PARAM_LIVE_AD_PARAMS, Uri.encode(q.w()));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("clickid", str2);
            }
            if (!TextUtils.isEmpty(q.H())) {
                hashMap.put("trackInfo", q.H());
            }
            if (!TextUtils.isEmpty(q.y())) {
                hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, q.y());
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str3);
            }
            hashMap.put("timemoving_type", cxa.c ? str5 : "item");
            int i = d.roomType;
            if (p0.g(d)) {
                i = 13;
            }
            hashMap.put(z9u.KEY_ROOMTYPE2, i + "");
            if (!(ux9Var.x() == null || ux9Var.x().w() == null)) {
                hashMap.put("play_token", ux9Var.x().w());
                hashMap.put("isKandian", String.valueOf(VideoStatus.VIDEO_TIMESHIFT_STATUS == ux9Var.x().e()));
            }
            if (!TextUtils.isEmpty(d.tvChannelId)) {
                hashMap.put(z9u.KEY_OFFICIAL_CHANNEL_ID, d.tvChannelId);
            }
            if (zga.e(d.itemTransferInfo)) {
                str8 = "reward";
            } else {
                str8 = "normal";
            }
            hashMap.put("content_type", str8);
            if (z2) {
                igq.n().g("liveRoomShow", JSON.toJSONString(hashMap), 1.0d);
            }
        } else {
            str5 = "content";
            str6 = "TrackUtilsNew";
            w9cVar = k;
        }
        if (sj9.u()) {
            hashMap.put("session_id", sj9.k());
        }
        if (cdrVar.j() != null && !TextUtils.isEmpty(cdrVar.j().P)) {
            hashMap.put("spm-cnt", cdrVar.j().P);
        } else if (pvs.M0() && (q.R() || q.Q())) {
            hashMap.put("spm-cnt", "a2141.23201685");
        } else if (l()) {
            hashMap.put("spm-cnt", p());
        } else {
            hashMap.put("spm-cnt", "a2141.8001249.1.1");
        }
        if (!TextUtils.isEmpty(q.E())) {
            hashMap.put("spm-url", q.E());
        }
        if (pvs.T0()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str5, (Object) q.a());
            jSONObject.put("spm", (Object) q.E());
            jSONObject.put("livesource", (Object) q.L());
            jSONObject.put(yj4.PARAM_ENTRY_SOURCE, (Object) q.m());
            hashMap.put("extendJson", jSONObject.toJSONString());
        }
        hashMap.put("entrySpm", q.n());
        hashMap.put("livesource", q.L());
        hashMap.put(yj4.PARAM_ENTRY_SOURCE, q.m());
        if (cdrVar.j() != null) {
            Map U = cdrVar.j().U();
            x5t.h(str6, "getCustomPageExtParams，customPageExtParams：" + U);
            if (ejr.d() && !tz3.b(U)) {
                hashMap.putAll(U);
            }
        }
        hashMap.put("entryLiveSource", q.g());
        hashMap.put("entryLiveSourcePre", q.h());
        hashMap.put("entryLiveItemId", w9cVar.Y0());
        if (ux9Var.g() != null) {
            hashMap.put("liveItemId", ux9Var.g().R1());
        }
        if (z) {
            du4.c(ux9Var, t, hashMap);
        }
        if (!(ux9Var.A() == null || ux9Var.A().taoliveOpenContext == null || ux9Var.A().taoliveOpenContext.f == null)) {
            hashMap.put("liveHomePageType", (String) ux9Var.A().taoliveOpenContext.f.get("liveHomePageType"));
        }
        return hashMap;
    }
}
