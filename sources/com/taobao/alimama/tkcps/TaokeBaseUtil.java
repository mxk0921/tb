package com.taobao.alimama.tkcps;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.TKNewCPSManager;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.net.pojo.request.AlimamaCpsActionRequest;
import com.taobao.alimama.net.pojo.request.AlimamaCpsTraceSendRequest;
import com.taobao.alimama.net.pojo.response.AlimamaCpsActionResponse;
import com.taobao.alimama.net.pojo.response.AlimamaCpsTraceSendResponse;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b2k;
import tb.cat;
import tb.dat;
import tb.dsj;
import tb.eat;
import tb.gsj;
import tb.i4g;
import tb.jsj;
import tb.o6j;
import tb.t2o;
import tb.wll;
import tb.xkf;
import tb.yov;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaokeBaseUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ITEM_TYPE {
        TAOBAO(0),
        TMALL(1);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int value;

        ITEM_TYPE(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(ITEM_TYPE item_type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/tkcps/TaokeBaseUtil$ITEM_TYPE");
        }

        public static ITEM_TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITEM_TYPE) ipChange.ipc$dispatch("597f71b7", new Object[]{str});
            }
            return (ITEM_TYPE) Enum.valueOf(ITEM_TYPE.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6191a;

        public a(String str) {
            this.f6191a = str;
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
            }
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            i4g.a("commit_cps_initiative_action_fail", this.f6191a, "error_code=" + str, "error_msg=" + str2);
            UserTrackLogs.trackAdLog("commit_cps_initiative_action_fail", this.f6191a, "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            i4g.a("commit_cps_initiative_action_success", new String[0]);
            UserTrackLogs.trackAdLog("commit_cps_initiative_action_success", new String[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else {
                SharedPreferencesUtils.putString("tk_cps_cross_e_config", OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_cross_e_config", null));
            }
        }
    }

    static {
        t2o.a(1020264458);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8285226f", new Object[]{str, str2, str3, map});
            return;
        }
        String str4 = "object_id=" + str + ",object_type=" + str2 + ",action_type=" + str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            i4g.a("commit_cps_initiative_action_param_invalid", str4);
            UserTrackLogs.trackAdLog("commit_cps_initiative_action_param_invalid", str4);
            return;
        }
        AlimamaCpsActionRequest alimamaCpsActionRequest = new AlimamaCpsActionRequest();
        alimamaCpsActionRequest.actionObjectId = str;
        alimamaCpsActionRequest.actionObjectType = str2;
        alimamaCpsActionRequest.initiativeActionType = str3;
        alimamaCpsActionRequest.extraParams = (map == null || map.isEmpty()) ? null : JSON.toJSONString(map);
        o6j o6jVar = new o6j(null, jsj.RETRY_FIVE_TIMES, alimamaCpsActionRequest, AlimamaCpsActionResponse.class);
        o6jVar.k(new a(str4));
        gsj.a().c(o6jVar);
    }

    public static void c(Map<String, String> map, long j, long j2, boolean z, Map<String, String> map2) {
        ITEM_TYPE item_type;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbc227c", new Object[]{map, new Long(j), new Long(j2), new Boolean(z), map2});
            return;
        }
        final AlimamaCpsTraceSendRequest alimamaCpsTraceSendRequest = new AlimamaCpsTraceSendRequest();
        alimamaCpsTraceSendRequest.itemid = j2;
        alimamaCpsTraceSendRequest.sellerid = j;
        alimamaCpsTraceSendRequest.utdid = MunionDeviceUtil.getUtdid(Global.getApplication());
        alimamaCpsTraceSendRequest.emap = JSON.toJSONString(map);
        if (z) {
            item_type = ITEM_TYPE.TMALL;
        } else {
            item_type = ITEM_TYPE.TAOBAO;
        }
        alimamaCpsTraceSendRequest.ismall = item_type.value;
        if (map2 == null || map2.isEmpty()) {
            str = null;
        } else {
            str = JSON.toJSONString(map2);
        }
        alimamaCpsTraceSendRequest.ext = str;
        RemoteBusiness.build((IMTOPDataObject) alimamaCpsTraceSendRequest).addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.alimama.tkcps.TaokeBaseUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TaoLog.Logd("AlimamaSdk", "Cps 请求失败！ result is :" + mtopResponse.toString());
                UserTrackLogs.trackAdLog("Munion_Upload_CpsE_Fail", "error_code=" + mtopResponse.getRetCode(), "error_msg=" + mtopResponse.getRetMsg(), "ismall=" + AlimamaCpsTraceSendRequest.this.ismall);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                TaoLog.Logd("AlimamaSdk", "Cps 请求成功！ result is :" + mtopResponse.toString());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                UserTrackLogs.trackAdLog("Munion_Upload_CpsE_Fail", "error_code=" + mtopResponse.getRetCode(), "error_msg=" + mtopResponse.getRetMsg(), "ismall=" + AlimamaCpsTraceSendRequest.this.ismall);
                TaoLog.Logd("AlimamaSdk", "Cps 请求失败！ result is :" + mtopResponse.toString());
            }
        }).startRequest(AlimamaCpsTraceSendResponse.class);
    }

    public static Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dcbc0ed1", new Object[0]);
        }
        HashMap hashMap = new HashMap(2);
        OrangeConfig.getInstance().registerListener(new String[]{"alimama_ad"}, new b());
        String string = SharedPreferencesUtils.getString("tk_cps_cross_e_config", "");
        String str = "1";
        if (!TextUtils.isEmpty(string)) {
            JSONObject parseObject = JSON.parseObject(string);
            String string2 = parseObject.getString("enable_cross_e");
            if (!TextUtils.isEmpty(string2)) {
                str = string2;
            }
            String string3 = parseObject.getString("flux_disperse_config");
            if (!TextUtils.isEmpty(string3)) {
                hashMap.put("flux_disperse_config", string3);
            }
        }
        hashMap.put("enable_cross_e", str);
        i4g.a("taoke_cross_e_config", "crossConfig=" + string);
        return hashMap;
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b580df6", new Object[]{str});
            return;
        }
        TaoLog.Logi("AlimamaSdk", "new taoke cps filter url = " + str);
        if (!TextUtils.isEmpty(str)) {
            String c = yov.c(str, "e");
            String c2 = yov.c(str, "tkFlag");
            String c3 = yov.c(str, "type");
            String c4 = yov.c(str, "tk_cps_ut");
            if (!TextUtils.isEmpty(c) && "2".equals(c3) && !TextUtils.isEmpty(c2)) {
                if ("1".equals(c2)) {
                    b2k.c().f(c, c4, 50);
                } else if ("0".equals(c2)) {
                    b2k.c().e(c4);
                }
                UserTrackLogs.trackAdLog("Munion_Url_Handle_GlobalE", "data=" + Global.getPackageName() + ",new_global_e=1,tk_flag=" + c2 + ",cps_ut_typ=" + c4);
            }
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdba03b6", new Object[]{str});
            return;
        }
        TaoLog.Logi("AlimamaSdk", "taoke cps filter url = " + str);
        if (!TextUtils.isEmpty(str)) {
            String c = yov.c(str, "e");
            String c2 = yov.c(str, "tkFlag");
            String c3 = yov.c(str, "type");
            if (!TextUtils.isEmpty(c) && "2".equals(c3) && !TextUtils.isEmpty(c2)) {
                if ("1".equals(c2)) {
                    eat.b().e(c);
                } else if ("0".equals(c2)) {
                    eat.b().d();
                }
                UserTrackLogs.trackAdLog("Munion_Url_Handle_GlobalE", "data=" + Global.getPackageName());
            }
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fda71b", new Object[]{str});
        }
    }

    @Deprecated
    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398db395", new Object[0]);
        }
    }

    public static void b(String str, long j, long j2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb813d5", new Object[]{str, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        try {
            xkf c = xkf.c("TaokeInfo");
            c.a("new_precommit", new Object[0]);
            HashMap hashMap = new HashMap(4);
            String c2 = yov.c(str, "e");
            String c3 = yov.c(str, "type");
            String a2 = eat.b().a();
            String a3 = dat.b().a();
            if (!TextUtils.isEmpty(c2) && "2".equals(c3)) {
                c.a("new_get_page_e", new Object[0]);
                hashMap.put("pageE", c2);
            }
            if (!TextUtils.isEmpty(a2)) {
                c.a("new_get_global_e", new Object[0]);
                hashMap.put("globalE", a2);
            }
            if (!TextUtils.isEmpty(a3)) {
                c.a("new_get_channel_e", new Object[0]);
                hashMap.put("channelE", a3);
            }
            HashMap hashMap2 = hashMap;
            if (z) {
                if (hashMap.isEmpty()) {
                    Map<String, String> a4 = cat.b().a();
                    c.a("new_get_cache_e", new Object[0]);
                    TaoLog.Logd("AlimamaSdk", "get cached eMap");
                    hashMap2 = a4;
                } else {
                    cat.b().e(hashMap);
                    c.a("new_update_cache_e", new Object[0]);
                    TaoLog.Logd("AlimamaSdk", "update cached eMap");
                    hashMap2 = hashMap;
                }
            }
            if (hashMap2 == null || hashMap2.isEmpty()) {
                c.a("new_e_map_empty", new Object[0]);
                return;
            }
            c.a("new_commit_e", JSON.toJSONString(hashMap2));
            c(hashMap2, j, j2, z, map);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("eMap", JSON.toJSONString(hashMap2));
            jSONObject.put("sellerId", j);
            jSONObject.put("itemId", j2);
            jSONObject.put("isMall", z);
            String str2 = "eMap=" + JSON.toJSONString(hashMap2) + ",sellerId=" + j + ",itemId=" + j2 + ",isMall=" + z;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("extMap", JSON.toJSONString(map));
                str2 = str2 + ",extMap=" + JSON.toJSONString(map);
            }
            UserTrackLogs.trackAdLog("Munion_Upload_Cps_E", str2);
            TaoLog.Logd("AlimamaSdk", "commit cps trace, para = " + jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void e(String str, long j, long j2, boolean z, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b56e15", new Object[]{str, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        try {
            TKNewCPSManager.e().j(str, String.valueOf(j), String.valueOf(j2), z, JSON.toJSONString(map));
            xkf c = xkf.c("TaokeInfo");
            c.a("new_v2_precommit", new Object[0]);
            HashMap hashMap = new HashMap(4);
            String c2 = yov.c(str, "e");
            String c3 = yov.c(str, "type");
            String c4 = yov.c(str, "clickid");
            String c5 = yov.c(str, "packageName");
            String c6 = yov.c(str, wll.ALI_TRACK_ID);
            String b2 = b2k.c().b(z);
            String a2 = dat.b().a();
            if (!TextUtils.isEmpty(c2)) {
                str2 = c6;
                if ("2".equals(c3)) {
                    c.a("new_v2_get_page_e", new Object[0]);
                    hashMap.put("pageE", c2);
                }
            } else {
                str2 = c6;
            }
            if (!TextUtils.isEmpty(b2)) {
                c.a("new_v2_get_global_e", new Object[0]);
                hashMap.put("globalE", b2);
            }
            if (!TextUtils.isEmpty(a2)) {
                c.a("new_v2_get_channel_e", new Object[0]);
                hashMap.put("channelE", a2);
            }
            Map<String, String> hashMap2 = map == null ? new HashMap<>(2) : map;
            hashMap2.put("eclickid", c4);
            if (!TextUtils.isEmpty(c5)) {
                hashMap2.put("packageName", c5);
            }
            if (!hashMap.isEmpty()) {
                c.a("new_v2_commit_e", JSON.toJSONString(hashMap));
                c(hashMap, j, j2, z, hashMap2);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("eMap", JSON.toJSONString(hashMap));
                jSONObject.put("sellerId", j);
                jSONObject.put("itemId", j2);
                jSONObject.put("isMall", z);
                jSONObject.put("aliTrackId", str2);
                String str3 = "eMap=" + JSON.toJSONString(hashMap) + ",sellerId=" + j + ",itemId=" + j2 + ",isMall=" + z + ",alitrackid=" + str2 + ",url=" + str;
                if (!hashMap2.isEmpty()) {
                    jSONObject.put("extMap", JSON.toJSONString(hashMap2));
                    str3 = str3 + ",extMap=" + JSON.toJSONString(hashMap2) + ";";
                }
                UserTrackLogs.trackAdLog("Munion_Upload_Cps_E", str3);
                TaoLog.Logd("AlimamaSdk", "commit cps trace, para = " + jSONObject.toString());
                return;
            }
            c.a("new_v2_e_map_empty", new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
