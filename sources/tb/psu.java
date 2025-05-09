package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class psu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] p = {"com.taobao.taobao"};
    public static final String[] q = {"com.tmall.wireless", "com.youku.phone", "com.huawei.hwvplayer.youku", "cn.damai"};

    /* renamed from: a  reason: collision with root package name */
    public String f26278a = "";
    public String b = "0^^*,map,video,camera,ai-camera,canvas,weex-view";
    public String c = "map";
    public String d = "2000";
    public boolean e = false;
    public final List<String> f = new ArrayList();
    public final List<String> g = new ArrayList();
    public int h = 5;
    public int i = 134217728;
    public boolean j = false;
    public int k = 60;
    public int l = 8388608;
    public int m = 100663296;
    public int n = 100663296;
    public int o = 10;

    public psu(String str) {
        h(str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("444a9bb6", new Object[0])).booleanValue();
        }
        Application application = yaa.n;
        if (application != null) {
            return d(application.getPackageName(), q);
        }
        return false;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4ad0ebd", new Object[0]);
        }
        c();
        return "";
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b8d0bff", new Object[0])).booleanValue();
        }
        Application application = yaa.n;
        if (application != null) {
            return d(application.getPackageName(), p);
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adfa29a0", new Object[0])).booleanValue();
        }
        if (a() || c()) {
            return true;
        }
        return false;
    }

    public static boolean d(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6208d86", new Object[]{str, strArr})).booleanValue();
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfffc832", new Object[]{this, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("glLostReloadArray");
        if (optJSONArray != null) {
            if (this.f.size() > 0) {
                this.f.clear();
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f.add(optJSONArray.optString(i));
            }
        }
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230b4e79", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("glLostUnreloadArray");
            if (optJSONArray != null) {
                if (this.g.size() > 0) {
                    this.g.clear();
                }
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.g.add(optJSONArray.optString(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            v7t.d("UCParamData", "obtainGLLostUnreloadList: obtatin unreload url list error!");
        }
    }

    public void h(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                v7t.a("UCParamData", str);
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optString("hostUcmVersionsCd", "");
                if (e()) {
                    str2 = "sc_lshco";
                } else {
                    str2 = "";
                }
                jSONObject.optString("scLoadPolicyCd", str2);
                jSONObject.optString("scCopyToSdcardCd", "true");
                jSONObject.optString("thirtyUcmVersionsCd", b());
                jSONObject.optString("scPkgNames", "com.eg.android.AlipayGphone^^com.taobao.taobao");
                jSONObject.optString("scStillUpd", "true");
                if (e()) {
                    str3 = "1";
                } else {
                    str3 = "600000";
                }
                jSONObject.optString("scWaitMilts", str3);
                this.f26278a = jSONObject.optString("u4FocusAutoPopupInputHostList", "");
                this.h = jSONObject.optInt("cachePageNumber", this.h);
                this.i = jSONObject.optInt("discardableLimitBytes", 134217728);
                this.j = jSONObject.optBoolean("discardableReleaseFreeAfterTimeSwitch", false);
                this.k = jSONObject.optInt("discardableReleaseFreeAfterSecond", 60);
                this.l = jSONObject.optInt("discardableReleaseFreeUntilByte", 8388608);
                jSONObject.optBoolean("discardableReleaseForAllocFailedSwitch", true);
                this.m = jSONObject.optInt("grDiscardableLimitByte", 100663296);
                this.n = jSONObject.optInt("grResourceCacheLimitByte", 100663296);
                this.b = jSONObject.optString("cdResourceEmbedSurfaceEmbedViewEnableList", this.b);
                this.c = jSONObject.optString("cdResourceEmbedViewReAttachList", this.c);
                this.d = jSONObject.optString("ucPageTimerCount", this.d);
                this.e = jSONObject.optBoolean("openGPUWatchDogOptimize", this.e);
                f(jSONObject);
                g(jSONObject);
                this.o = jSONObject.optInt("webglErrorRate", this.o);
            }
        } catch (Throwable unused) {
            v7t.p("UCParamData", "failed to parse uc params", str);
        }
    }

    static {
        t2o.a(989855783);
    }
}
