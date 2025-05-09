package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.minutes.collector.MTSEnvMonitor;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class huh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile huh g;
    public fvh c;
    public JSONObject d;
    public boolean f;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f20905a = {"android_mts"};
    public boolean b = false;
    public final muh e = new muh();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                huh.a(huh.this);
                String config = OrangeConfig.getInstance().getConfig("android_mts", "grayDowngradeSwitch", "0");
                String config2 = OrangeConfig.getInstance().getConfig("android_mts", "downgradeSwitch", "1");
                String config3 = OrangeConfig.getInstance().getConfig("android_mts", "collector", "");
                TLog.loge("MTSManager", " setupConfig " + config + "|" + config2);
                zuh.b("grayDowngradeSwitch", config);
                zuh.b("downgradeSwitch", config2);
                zuh.b("collector", config3);
                zuh.b("sceneConfig", OrangeConfig.getInstance().getConfig("android_mts", "sceneConfig", zuh.a("sceneConfig", "")));
                if (huh.b(huh.this)) {
                    zuh.b("graySceneConfig", OrangeConfig.getInstance().getConfig("android_mts", "graySceneConfig", zuh.a("graySceneConfig", "")));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public huh() {
        j();
        l();
    }

    public static /* synthetic */ void a(huh huhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb097406", new Object[]{huhVar});
        } else {
            huhVar.j();
        }
    }

    public static /* synthetic */ boolean b(huh huhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c5c10a9", new Object[]{huhVar})).booleanValue();
        }
        return huhVar.f;
    }

    public static huh h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huh) ipChange.ipc$dispatch("6ff3ca9f", new Object[0]);
        }
        if (g == null) {
            synchronized (huh.class) {
                try {
                    if (g == null) {
                        g = new huh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public synchronized zoc c(String str, String str2, ouh ouhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zoc) ipChange.ipc$dispatch("ab7d1f4a", new Object[]{this, str, str2, ouhVar});
        } else if (this.b) {
            guh.a(guh.TAG, "MTSManager:createMeterWithScene is downgrade ");
            nuh nuhVar = new nuh();
            this.e.b(str, str2, nuhVar);
            return nuhVar;
        } else {
            puh puhVar = new puh(str, str2, k(str, str2), ouhVar);
            this.e.b(str, str2, puhVar);
            return puhVar;
        }
    }

    @Deprecated
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8108a5", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.e.c(str);
        }
    }

    @Deprecated
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e5332f", new Object[]{this, str, str2});
        } else {
            this.e.d(str, str2);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.e.c(str);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d79e015", new Object[]{this, str, str2});
        } else {
            this.e.d(str, str2);
        }
    }

    public synchronized zoc i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zoc) ipChange.ipc$dispatch("dcf444b2", new Object[]{this, str, str2});
        } else if (this.b) {
            nuh nuhVar = new nuh();
            this.e.b(str, str2, nuhVar);
            return nuhVar;
        } else {
            zoc a2 = this.e.a(str, str2);
            if (a2 == null) {
                TLog.loge("MTSManager", "getMTSMeterService is null need call  createMeterWithScene ");
            }
            return a2;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfe7526", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(this.f20905a, new a(), true);
        }
    }

    public final void j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        try {
            if (this.b) {
                TLog.loge("MTSManager", " mts is downgrade");
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("android_mts", "collector", zuh.a("collector", ""));
            if (!TextUtils.isEmpty(config)) {
                this.c = gvh.b(JSON.parseObject(config));
            }
            String a2 = hth.a();
            if (TextUtils.isEmpty(a2) || a2.split("\\.").length != 4) {
                String config2 = OrangeConfig.getInstance().getConfig("android_mts", "downgradeSwitch", zuh.a("downgradeSwitch", "1"));
                this.f = false;
                str = config2;
            } else {
                str = OrangeConfig.getInstance().getConfig("android_mts", "grayDowngradeSwitch", zuh.a("grayDowngradeSwitch", "0"));
                this.f = true;
            }
            this.b = TextUtils.equals(str, "1");
            String config3 = OrangeConfig.getInstance().getConfig("android_mts", "sceneConfig", zuh.a("sceneConfig", ""));
            JSONObject parseObject = TextUtils.isEmpty(config3) ? null : JSON.parseObject(config3);
            if (this.f) {
                String config4 = OrangeConfig.getInstance().getConfig("android_mts", "graySceneConfig", zuh.a("graySceneConfig", ""));
                guh.a(guh.DETAIL_LOG, "SceneConfig:graySceneConfigStr:" + config4);
                if (!TextUtils.isEmpty(config4)) {
                    JSONObject parseObject2 = JSON.parseObject(config4);
                    if (parseObject != null) {
                        parseObject.putAll(parseObject2);
                    } else {
                        parseObject = parseObject2;
                    }
                }
            }
            this.d = parseObject;
            MTSEnvMonitor.n().u(this.c, this.b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final fvh k(String str, String str2) {
        String string;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("f03463", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = this.d;
        fvh fvhVar = this.c;
        String str3 = null;
        JSONObject p = fvhVar == null ? null : fvhVar.p();
        if (jSONObject == null || str == null || !jSONObject.containsKey(str)) {
            guh.a(guh.DETAIL_LOG, "SceneConfig:for:All:" + str + "_" + str2 + " config:" + p);
            return this.c;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (p != null) {
            jSONObject2.putAll(p);
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            while (i < size) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 == null) {
                    jSONArray = jSONArray;
                } else {
                    jSONArray = jSONArray;
                    if (!jSONObject3.containsKey("metric") || (string = jSONObject3.getString("metric")) == null || string.equals(str2)) {
                        if (jSONObject3.containsKey("device_level")) {
                            if (str3 == null) {
                                str3 = pth.a();
                            }
                            String string2 = jSONObject3.getString("device_level");
                            if (string2 != null && !string2.equals(str3)) {
                                guh.a(guh.DETAIL_LOG, "SceneConfig:" + str + "_" + str2 + ":" + i + " mismatch deviceLevel : cur:" + str3 + " vs want:" + string2);
                            }
                        }
                        jSONObject2.putAll(jSONObject3);
                        jSONObject2.put("localSceneConfigData", (Object) jSONObject3);
                        break;
                    }
                    guh.a(guh.DETAIL_LOG, "SceneConfig:" + str + "_" + str2 + ":" + i + " mismatch metricName : cur:" + str2 + " vs want:" + string);
                }
                i++;
            }
        }
        i = -1;
        guh.a(guh.DETAIL_LOG, "SceneConfig:for:Self:" + str + "_" + str2 + " cfgI:" + i + " config:" + jSONObject2);
        return gvh.b(jSONObject2);
    }
}
