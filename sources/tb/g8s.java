package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g8s implements vwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19788a;
    public JSONArray b;
    public SharedPreferences c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (TextUtils.equals(g8s.b(g8s.this), str)) {
                g8s.c(g8s.this);
            }
        }
    }

    static {
        t2o.a(847249436);
        t2o.a(847249434);
    }

    public static final /* synthetic */ String b(g8s g8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ac4d7f", new Object[]{g8sVar});
        }
        g8sVar.getClass();
        return "themis_url_white_list";
    }

    public static final /* synthetic */ void c(g8s g8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7877827b", new Object[]{g8sVar});
        } else {
            g8sVar.f();
        }
    }

    public final void f() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
            return;
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig("themis_url_white_list", null);
        if (customConfig != null) {
            synchronized (this) {
                try {
                    SharedPreferences sharedPreferences = this.c;
                    if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString("themis_url_white_list", customConfig)) == null)) {
                        putString.apply();
                    }
                    this.b = JSON.parseArray(customConfig);
                    TMSLogger.f("TMSSwitchChecker", ckf.p("TMSABSwitchChecker updateConfig: ", customConfig));
                    Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    Result.m1108constructorimpl(b.a(th));
                }
            }
        }
    }

    @Override // tb.vwd
    public boolean a(mpj mpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4350870", new Object[]{this, mpjVar})).booleanValue();
        }
        ckf.g(mpjVar, "navigationInfo");
        e();
        Uri c = mpjVar.c();
        JSONArray jSONArray = this.b;
        String d = jSONArray == null ? null : d(jSONArray, c);
        if (TextUtils.isEmpty(d)) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(mpjVar.a().getApplicationContext(), ckf.p("TMS_H5_SWITCH_", d));
        TMSLogger.f("TMSSwitchChecker", "TMSABSwitchChecker shouldSwitchToTMS: " + ((Object) d) + ", " + isFeatureOpened);
        return isFeatureOpened;
    }

    public final String d(JSONArray jSONArray, Uri uri) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd674fca", new Object[]{this, jSONArray, uri});
        }
        String host = uri.getHost();
        String path = uri.getPath();
        int size = jSONArray.size();
        while (i < size) {
            i++;
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
                ckf.f(jSONObject2, "jsonObj.getJSONObject(\"condition\")");
                String string = jSONObject2.getString("host");
                ckf.f(string, "condition.getString(\"host\")");
                String string2 = jSONObject2.getString("path");
                ckf.f(string2, "condition.getString(\"path\")");
                if (TextUtils.equals(host, string) && TextUtils.equals(path, string2)) {
                    return jSONObject.getString("name");
                }
            }
        }
        return null;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1b0709", new Object[]{this});
            return;
        }
        Application application = yaa.n;
        if (application != null) {
            synchronized (this) {
                if (!this.f19788a) {
                    this.f19788a = true;
                    this.c = application.getSharedPreferences("tms_local_TMSABSwitchChecker_orange", 0);
                    String str = null;
                    str = OrangeConfig.getInstance().getCustomConfig("themis_url_white_list", null);
                    if (str == null) {
                        SharedPreferences sharedPreferences = this.c;
                        if (sharedPreferences != null) {
                            str = sharedPreferences.getString("themis_url_white_list", null);
                        }
                    }
                    if (str != null) {
                        this.b = JSON.parseArray(str);
                        Result.m1108constructorimpl(xhv.INSTANCE);
                    }
                    TMSLogger.f("TMSSwitchChecker", "TMSABSwitchChecker registerListener");
                    OrangeConfig.getInstance().registerListener(new String[]{"themis_url_white_list"}, new a(), true);
                    xhv xhvVar = xhv.INSTANCE;
                }
            }
        }
    }
}
