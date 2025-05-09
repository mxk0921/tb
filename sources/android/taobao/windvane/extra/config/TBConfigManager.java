package android.taobao.windvane.extra.config;

import android.content.Context;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.file.NotEnoughSpace;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bsw;
import tb.i6m;
import tb.sb9;
import tb.t2o;
import tb.v7t;
import tb.vc9;
import tb.yaa;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROID_WINDVANE_CONFIG = "android_windvane_config";
    public static final String WINDVANE_COMMMON_CONFIG = "WindVane_common_config";
    public static final String WINDVANE_COMMON_CONFIG = "WindVane";
    public static final String WINDVANE_CONFIG = "WindVane";
    public static final String WINDVANE_URL_CONFIG = "WindVane_URL_config";
    private static TBConfigManager instance = null;
    private String useOrange = "true";
    private z8l mConfigListenerV1 = null;
    private String configPath = null;

    static {
        t2o.a(989855931);
    }

    public static /* synthetic */ void access$000(TBConfigManager tBConfigManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd2aeb3", new Object[]{tBConfigManager});
        } else {
            tBConfigManager.setWVConfig();
        }
    }

    public static /* synthetic */ String access$100(TBConfigManager tBConfigManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc5b73ec", new Object[]{tBConfigManager});
        }
        return tBConfigManager.configPath;
    }

    public static TBConfigManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBConfigManager) ipChange.ipc$dispatch("ea0f4e80", new Object[0]);
        }
        if (instance == null) {
            synchronized (TBConfigManager.class) {
                try {
                    if (instance == null) {
                        instance = new TBConfigManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void setWVConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f2ec6a", new Object[]{this});
            return;
        }
        bsw.b().a().m(TextUtils.equals("true", OrangeConfig.getInstance().getConfig("WindVane", "onlyBkpg", "true")));
        bsw.b().a().j(TextUtils.equals("true", OrangeConfig.getInstance().getConfig("WindVane", "closeUCHA", "false")));
        bsw.b().a().l(OrangeConfig.getInstance().getConfig("WindVane", "JSErrorRatio", i6m.DEFAULT_PLAY_RATE));
        bsw.b().a().n(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenAIT", "true"), "true"));
        bsw.b().a().o(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenH5PP", "true"), "true"));
        bsw.b().a().q(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenUserPP", "true"), "true"));
        bsw.b().a().r(OrangeConfig.getInstance().getConfig("WindVane", "fSPFilterAnimation", "true"));
        bsw.b().a().p(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenH5_2", "true"), "true"));
        yaa.m = TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "newFireEvent", "true"), "true");
        bsw.b().a().k(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "filterIllegalUrl", "true"), "true"));
        v7t.i("WVConfig", "Performance.Config = [" + bsw.b().a().toString() + "]");
    }

    public void initAfterAWP(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa03ef33", new Object[]{this, context});
        } else if (this.mConfigListenerV1 == null) {
            try {
                String[] strArr = {"android_windvane_config", WINDVANE_COMMMON_CONFIG, "WindVane", "WindVane_URL_config"};
                this.mConfigListenerV1 = new TBConfigListenerV1();
                OrangeConfig.getInstance().registerListener(strArr, this.mConfigListenerV1);
            } catch (Throwable unused) {
                this.mConfigListenerV1 = null;
            }
        }
    }

    public void initConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        v7t.i("WVConfig", "use orange config");
        OrangeConfig.getInstance().registerListener(new String[]{"windvane_common", "windvane_domain", "WindVane_URL_config", WVConfigManager.CONFIGNAME_COOKIE, "windvane_uc_core"}, new z8l() { // from class: android.taobao.windvane.extra.config.TBConfigManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.z8l
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                if (configs == null || configs.size() == 0) {
                    WVConfigManager.a().d(str, "");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry<String, String> entry : configs.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("appVersion", yaa.f().b());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                WVConfigManager.a().d(str, jSONObject.toString());
                v7t.i("WVConfig", "receive name=[" + str + "]");
            }
        });
    }

    public void initEarly(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f370a1ce", new Object[]{this, context});
            return;
        }
        File e = vc9.e(context, "windvane");
        this.configPath = e.getPath() + File.separator + "orange";
        File file = new File(this.configPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        getLocalConfig();
        OrangeConfig.getInstance().registerListener(new String[]{"WindVane"}, new z8l() { // from class: android.taobao.windvane.extra.config.TBConfigManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.z8l
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else if (str.equalsIgnoreCase("WindVane")) {
                    WVJsBridge.f = OrangeConfig.getInstance().getConfig("WindVane", "enableGetParamByJs", "0").equals("1");
                    String config = OrangeConfig.getInstance().getConfig("WindVane", "useOrange", "true");
                    String config2 = OrangeConfig.getInstance().getConfig("WindVane", "closeUCByRom", "0");
                    TBConfigManager.access$000(TBConfigManager.this);
                    try {
                        String access$100 = TBConfigManager.access$100(TBConfigManager.this);
                        sb9.h(access$100, ByteBuffer.wrap((yaa.f().b() + "," + config + "," + config2).getBytes("utf-8")));
                    } catch (NotEnoughSpace e3) {
                        e3.printStackTrace();
                    } catch (UnsupportedEncodingException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        });
    }

    private void getLocalConfig() {
        String str;
        byte[] f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be31a5e", new Object[]{this});
            return;
        }
        try {
            f = sb9.f(this.configPath);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str = null;
        }
        if (f != null) {
            str = new String(f, "utf-8");
            if (!TextUtils.isEmpty(str)) {
                v7t.i("WVConfig", "get windvane local config=[" + str + "]");
                String[] split = str.split(",");
                if (split.length != 3) {
                    return;
                }
                if (TextUtils.isEmpty(split[0]) || !TextUtils.equals(yaa.f().b(), split[0])) {
                    v7t.i("WVConfig", "skip local config for dispatching appVersion. require=[" + yaa.f().b() + "], real=[" + split[0] + "]");
                    return;
                }
                if (!TextUtils.isEmpty(split[1])) {
                    this.useOrange = split[1];
                }
                if (!TextUtils.isEmpty(split[2])) {
                    try {
                        yaa.l = Integer.valueOf(split[2]).intValue();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
