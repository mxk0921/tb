package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wzi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_DOWNLOAD_IMAGE_FAIL = "downloadImageFail";
    public static final String CODE_DOWNLOAD_VIDEO_FAIL = "downloadVideoFail";
    public static final String CODE_VIEW_CREATE_FAIL = "viewCreateFail";
    public static final String CRASH_OCCUPIED = "crashOccupied";
    public static final String DOWNLOAD_ERROR = "downloadError";
    public static final String DOWNLOAD_SUCCESS = "downloadSuccess";
    public static final String EXPOSE_ERROR = "exposeError";
    public static final String EXPOSE_SUCCESS = "exposeSuccess";
    public static final String LAUNCHER = "launcher";
    public static final String NEW_VIDEO_PLAYER = "newVideoPlayer";
    public static final String OLD_VIDEO_PLAYER = "oldVideoPlayer";
    public static final String POP_ERROR = "PopError";
    public static final String SPLASH_REQUEST_ERROR = "splashRequestError";
    public static final String SPLASH_REQUEST_SUCCESS = "splashRequestSuccess";
    public static final String UCP_CRASH = "ucpInitCrash";
    public static final String UCP_ERROR = "ucpError";
    public static final String UCP_INIT_ERROR = "ucpInitError";
    public static final String UCP_POP_INDEX_FAIL = "ucpPopIndexFail";
    public static final String UCP_START = "ucpStart";
    public static final int UT_EVENT_ID = 19999;
    public static final String UT_PAGE_NAME = "Page_Home";
    public static final String VIDEO_NEW_PLAY_ERROR = "videoNewPlayError";
    public static final String VIDEO_NEW_PLAY_START = "videoNewPlayStart";
    public static final String VIDEO_NEW_PLAY_SUCCESS = "videoNewPlaySuccess";
    public static final String VIDEO_PLAY_ERROR = "videoPlayError";
    public static final String VIDEO_PLAY_START = "videoPlayStart";
    public static final String VIDEO_PLAY_SUCCESS = "videoPlaySuccess";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f31038a;

    static {
        t2o.a(736100477);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb8f454", new Object[]{this});
        } else {
            this.f31038a.edit().clear().apply();
        }
    }

    public void b(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332a31c3", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("extKey1", str + "_" + str2);
            hashMap.put("extKey2", str3);
            hashMap.put("extKey3", str4);
            hashMap.put("extKey4", str5);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sceneType", (Object) "BootImage");
            jSONObject.put("actionType", (Object) "QPS");
            jSONObject.put("args", (Object) hashMap);
            tm1.a("MonitorService", "extKey1: " + str + "_" + str2 + " ,extKey2: " + str3 + " ,extKey3: " + str4 + " ,extKey4: " + str5);
            this.f31038a.edit().putString(String.valueOf(System.currentTimeMillis()), jSONObject.toString()).apply();
        } catch (Throwable th) {
            tm1.b("MonitorService", "commitMessiahMonitor", th);
        }
    }

    public void c(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d08050", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("bizType", str4);
            hashMap.put("code", str5);
            hashMap.put("msg", str6);
            TBS.Ext.commitEvent("Page_Home", 19999, "BootImage_" + str, str2, str3, o4v.c("Page_Home", new JSONObject(hashMap)));
        } catch (Throwable th) {
            tm1.b("MonitorService", "commitUTMonitor", th);
        }
    }

    public void d(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cb3566", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        c(str, str2, str3 + "_Arch", str4, str5, str6);
        b(str, str2, str3 + "_Arch", str4, str5);
    }

    public List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("edc3079", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll(this.f31038a.getAll().values());
        } catch (Throwable th) {
            tm1.b("MonitorService", "getBootImageMonitor", th);
        }
        return arrayList;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.f31038a = context.getSharedPreferences("bootImageMonitor", 0);
        }
    }
}
