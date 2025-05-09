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
public class dbu {
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
    public static final String CLICK_ACCOUNT_FOLLOW = "AccountFollow";
    public static final String CLICK_CARD = "Card";
    public static final String CLICK_GOODS_DETAIL = "detail";
    public static final String CLICK_GOODS_LIST = "Goodslist";
    public static final String CLICK_LIKE = "Like";
    public static final String CLICK_SHARE_LIVE = "ShareLive";
    public static final String KEY_ACCOUNT_TYPE = "accountType";
    public static final String KEY_FEED_ID = "feedId";
    public static final String KEY_FEED_ID2 = "feed_id";
    public static final String KEY_LIVE_SOURCE = "livesource";
    public static final String KEY_SPM = "spm";
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";
    public static final String SOURCE_SWITCH_REPLAY = "switchReplay";
    public static final String SOURCE_SWITCH_ROOM = "switchRoom";
    public static final String SPM_TAOLIVE_FANDOM = "a21tn.888888";
    public static final String SPM_TAOLIVE_WATCH = "a2141.8001249.1.1";
    public static final String SPM_TAOLIVE_WATCH_4_SHOP = "a2141.23201685";

    static {
        t2o.a(779092726);
    }

    public static List<String> a(String... strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c3eda7f0", new Object[]{strArr});
        }
        ArrayList arrayList = new ArrayList();
        VideoInfo C = ekr.C();
        arrayList.add("feedId=" + b());
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
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    public static String b() {
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

    public static void d(String str, String str2, String... strArr) {
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
            arrayList.add("feed_id=" + str3);
            arrayList.add("account_id=" + str4);
            arrayList.add("deviceLevel=" + String.valueOf(ekr.i()));
            if (!TextUtils.isEmpty(null)) {
                arrayList.add("pkid=null");
            }
            if (!TextUtils.isEmpty(ekr.w())) {
                arrayList.add("spm-url=" + ekr.w());
            }
            if (!TextUtils.isEmpty(ekr.w())) {
                arrayList.add("spm=" + ekr.w());
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add("trackInfo=" + str2);
            } else if (!TextUtils.isEmpty(ekr.A())) {
                arrayList.add("trackInfo=" + ekr.A());
            }
            if (!TextUtils.isEmpty(ekr.p())) {
                arrayList.add("liveoprt_id=" + ekr.p());
            }
            arrayList.add("timemoving_type=".concat(cxa.c ? "content" : "item"));
            if (ekr.f() != null) {
                arrayList.add("clickurl=" + ekr.f().clickid);
                arrayList.add("interactiveurl=" + ekr.f().interactiveid);
                arrayList.add("clickInfo=" + ekr.f().clickInfo);
            }
            if (!qvs.M() || (!ekr.L() && !ekr.K())) {
                arrayList.add("spm-cnt=a2141.8001249.1.1");
            } else {
                arrayList.add("spm-cnt=a2141.23201685");
            }
            String str5 = "0";
            arrayList.add("is_fans=".concat(C.broadCaster.follow ? "1" : str5));
            StringBuilder sb = new StringBuilder("isAD=");
            sb.append(ekr.f() != null ? 1 : 0);
            arrayList.add(sb.toString());
            arrayList.add("entryUtparam=" + ekr.Q);
            StringBuilder sb2 = new StringBuilder("isAdTransParams=");
            sb2.append(ekr.e() != null ? 1 : 0);
            arrayList.add(sb2.toString());
            arrayList.add("entryLiveSource=" + ekr.B);
            arrayList.add("entryjiangjie_id=" + ekr.C);
            arrayList.add("timeMovingUtParams=" + ekr.D);
            arrayList.add("entryQuery=" + ekr.E);
            arrayList.add("entrySpm=" + ekr.F);
            arrayList.add("entryScm=" + ekr.H);
            arrayList.add("switchIndex=" + ekr.K);
            arrayList.add("isUp=" + ekr.M);
            arrayList.add("entryTraceId=" + ekr.I);
            arrayList.add("entryLiveId=" + ekr.J);
            arrayList.add("liveAdParams=" + Uri.encode(ekr.X));
            arrayList.add("feedtype=" + C.type);
            arrayList.add("livestatus=" + C.status);
            arrayList.add("landscape=" + C.landScape);
            arrayList.add("accounttype=" + ekr.b(C.broadCaster.type));
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
            arrayList.add("product_type=timemove");
            arrayList.add("queryKey=" + ekr.v0);
            arrayList.add("clickid=" + ekr.w0);
            arrayList.add("room_type=live");
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
            if (qvs.l0() && !TextUtils.isEmpty(ekr.B())) {
                arrayList.add("utparam-url=" + ekr.B());
            }
            if (v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, (String[]) arrayList.toArray(new String[0]));
            }
        }
    }

    public static void e(String str, String str2, HashMap<String, String> hashMap) {
        AccountInfo accountInfo;
        String str3;
        String str4;
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
            hashMap.put("accounttype", ekr.b(C.broadCaster.type) + "");
            if (!TextUtils.isEmpty(ekr.w())) {
                hashMap.put("spm-url", ekr.w());
            }
            hashMap.put("feed_id", str5);
            hashMap.put(z9u.KEY_ACCOUNT_ID, str6);
            hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(C.roomType));
            hashMap.put("deviceLevel", String.valueOf(ekr.i()));
            hashMap.put("accountType", ekr.b(C.broadCaster.type) + "");
            int i = C.roomType;
            if (ekr.O(C)) {
                i = 13;
            }
            hashMap.put(z9u.KEY_ROOMTYPE2, i + "");
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
            hashMap.put("timeShiftForEnter", ekr.y() + "");
            hashMap.put("jiangjie_ID", ekr.F());
            hashMap.put("entryjiangjie_id", ekr.C);
            hashMap.put("oneproduct_jiangjie", ekr.G());
            hashMap.put("oneproduct_mounting", ekr.q());
            hashMap.put("timeShiftItemId", ekr.z());
            hashMap.put("entrySpm", ekr.F);
            hashMap.put("entryLiveSource", ekr.B);
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(C.status));
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
            hashMap.put("livesource", ekr.o());
            hashMap.put(yj4.PARAM_ENTRY_SOURCE, ekr.j());
            hashMap.put("switchIndex", String.valueOf(ekr.K));
            hashMap.put("isUp", String.valueOf(ekr.M));
            hashMap.put("queryKey", ekr.v0);
            hashMap.put("clickid", ekr.w0);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("trackInfo", str2);
            } else if (!TextUtils.isEmpty(ekr.A())) {
                hashMap.put("trackInfo", ekr.A());
            }
            if (!TextUtils.isEmpty(ekr.p())) {
                hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, ekr.p());
            }
            if (!TextUtils.isEmpty(ekr.w())) {
                hashMap.put("spm", ekr.w());
            }
            if (!qvs.M() || (!ekr.L() && !ekr.K())) {
                hashMap.put("spm-cnt", "a2141.8001249.1.1");
            } else {
                hashMap.put("spm-cnt", "a2141.23201685");
            }
            hashMap.put("timestampT", System.currentTimeMillis() + "");
            if (!TextUtils.isEmpty(C.tvChannelId)) {
                hashMap.put(z9u.KEY_OFFICIAL_CHANNEL_ID, C.tvChannelId);
            }
            hashMap.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
            if (v2s.o().E() != null) {
                v2s.o().E().track4Show("Page_TaobaoLiveWatch", str, hashMap);
            }
        }
    }

    public static void f() {
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
            hashMap.put("accounttype", ekr.b(C.broadCaster.type) + "");
            hashMap.put("scm-live", ekr.N);
            hashMap.put("spm-live", ekr.O);
            if (qvs.j0()) {
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
            sb.append(ekr.f() != null ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (ekr.e() != null) {
                i = 1;
            }
            sb2.append(i);
            sb2.append("");
            hashMap.put("isAdTransParams", sb2.toString());
            hashMap.put("entryLiveSource", ekr.B);
            hashMap.put("entryjiangjie_id", ekr.C);
            hashMap.put("timeMovingUtParams", ekr.D);
            if (cxa.c) {
                str2 = "content";
            } else {
                str2 = "item";
            }
            hashMap.put("timemoving_type", str2);
            hashMap.put(smh.entryQuery, ekr.E);
            hashMap.put("entrySpm", ekr.F);
            hashMap.put("entryScm", ekr.H);
            hashMap.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
            hashMap.put("entryPvid", ekr.R);
            hashMap.put("switchIndex", ekr.K + "");
            hashMap.put("isUp", ekr.M + "");
            hashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, ekr.I);
            hashMap.put(zlr.PARAM_ENTRY_LIVE_ID, ekr.J);
            hashMap.put("livesource", ekr.o());
            hashMap.put("common_live_page", "live");
            hashMap.put("content_id", str3);
            hashMap.put("deviceLevel", String.valueOf(ekr.i()));
            if (qvs.i0()) {
                hashMap.put("clickid", ekr.w0);
            }
            if (!TextUtils.isEmpty(ekr.A())) {
                hashMap.put("trackInfo", ekr.A());
            }
            if (!TextUtils.isEmpty(ekr.p())) {
                hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, ekr.p());
            }
            if (v2s.o().E() != null) {
                v2s.o().E().updateNextPageUtParam(hashMap);
            }
        }
    }

    public static void c(String str, Map<String, String> map) {
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
                sb.append(ekr.f() != null ? 1 : 0);
                sb.append("");
                map.put("isAD", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                if (ekr.e() == null) {
                    i = 0;
                }
                sb2.append(i);
                sb2.append("");
                map.put("isAdTransParams", sb2.toString());
                map.put("entryLiveSource", ekr.B);
                map.put("entryjiangjie_id", ekr.C);
                map.put("timeMovingUtParams", ekr.D);
                map.put(smh.entryQuery, ekr.E);
                map.put("entrySpm", ekr.F);
                map.put("entryScm", ekr.H);
                map.put("switchIndex", ekr.K + "");
                map.put("isUp", ekr.M + "");
                map.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, ekr.I);
                map.put(zlr.PARAM_ENTRY_LIVE_ID, ekr.J);
                map.put(yj4.PARAM_ENTRY_UT_PARAM, ekr.Q);
                map.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
                if (cxa.c) {
                    str2 = "content";
                } else {
                    str2 = "item";
                }
                map.put("timemoving_type", str2);
                VideoInfo C = ekr.C();
                if (C != null) {
                    map.put(z9u.KEY_ROOMTYPE, String.valueOf(C.roomType));
                    map.put("newRoomType", String.valueOf(C.newRoomType));
                    map.put(z9u.KEY_LIVE_STATUS, String.valueOf(C.status));
                    String str3 = C.liveId;
                    String str4 = C.broadCaster.accountId;
                    if (!TextUtils.isEmpty(ekr.w())) {
                        map.put("spm-url", ekr.w());
                    }
                    map.put("feed_id", str3);
                    map.put(z9u.KEY_ACCOUNT_ID, str4);
                    if (!TextUtils.isEmpty(C.tvChannelId)) {
                        map.put(z9u.KEY_OFFICIAL_CHANNEL_ID, C.tvChannelId);
                    }
                }
            }
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, map);
        }
    }
}
