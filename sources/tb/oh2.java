package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACK_GROUND_START_TIME = "backgroundStartTime";
    public static final String BACK_GROUND_WAIT_SECONDS = "backgroundWaitSeconds";
    public static final String TAG = "bootimage.default";
    public static final oh2 b = new oh2();

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, String> f25387a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (!z) {
                try {
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_bootimage_client");
                    if (configs != null) {
                        if (configs.size() == 0) {
                        }
                        if (configs != null && configs.size() != 0) {
                            BootImageDataMgr.g().b(configs);
                            oh2.a(oh2.this, configs);
                        }
                        return;
                    }
                    configs = null;
                    if (configs != null) {
                        BootImageDataMgr.g().b(configs);
                        oh2.a(oh2.this, configs);
                    }
                } catch (Exception e) {
                    tm1.b(oh2.TAG, "update config error.\n", e);
                }
            }
        }
    }

    static {
        t2o.a(736100470);
    }

    public static /* synthetic */ Map a(oh2 oh2Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9686d25e", new Object[]{oh2Var, map});
        }
        oh2Var.f25387a = map;
        return map;
    }

    public static oh2 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oh2) ipChange.ipc$dispatch("55cea5f7", new Object[0]);
        }
        return b;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8136ed3a", new Object[]{this})).longValue();
        }
        int i = nh2.k().getInt(BACK_GROUND_WAIT_SECONDS, -1);
        tm1.a(TAG, "getBackgroundWaitMs waitMs " + i);
        if (i > 0) {
            return i * 1000;
        }
        try {
            long parseInt = Integer.parseInt(c(BACK_GROUND_WAIT_SECONDS, Integer.toString(5)));
            if (parseInt <= 0) {
                parseInt = 5;
            }
            return parseInt * 1000;
        } catch (Exception e) {
            tm1.b(TAG, "getBackgroundWaitSeconds orange config error.", e);
            return 5000;
        }
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
        }
        if (this.f25387a == null) {
            g();
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_bootimage_client");
        if (configs == null || configs.size() == 0) {
            configs = null;
        }
        if (configs == null) {
            if (this.f25387a == null) {
                tm1.a(TAG, "get config faield, need init configs.");
                return str2;
            }
            configs = this.f25387a;
        }
        String str3 = configs.get(str);
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str3;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7192666b", new Object[]{this})).longValue();
        }
        try {
            return Integer.parseInt(c("fetchServerConfigPeriodSeconds", Integer.toString(600))) * 1000;
        } catch (Exception e) {
            tm1.b(TAG, "getLoadTimeout orange config error.", e);
            return 600 * 1000;
        }
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a919b729", new Object[]{this})).longValue();
        }
        SharedPreferences k = nh2.k();
        if (k != null) {
            return k.getLong(BACK_GROUND_START_TIME, -1L);
        }
        tm1.a(TAG, "recordHotStartTime sp null");
        return -1L;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        synchronized (b) {
            try {
                if (this.f25387a == null) {
                    this.f25387a = new HashMap();
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_bootimage_client");
                    if (configs == null || configs.size() == 0) {
                        configs = null;
                    }
                    if (configs == null) {
                        configs = BootImageDataMgr.g().f();
                    }
                    if (configs != null) {
                        this.f25387a = configs;
                    }
                    OrangeConfig.getInstance().registerListener(new String[]{"android_bootimage_client"}, new a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745148b0", new Object[]{this});
            return;
        }
        SharedPreferences k = nh2.k();
        if (k == null) {
            tm1.a(TAG, "recordHotStartTime sp null");
        } else {
            k.edit().putLong(BACK_GROUND_START_TIME, System.currentTimeMillis()).apply();
        }
    }

    public void i(rsg rsgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2c898e", new Object[]{this, rsgVar});
        } else if (rsgVar != null) {
            int a2 = rsgVar.a();
            SharedPreferences k = nh2.k();
            if (k == null) {
                tm1.a(TAG, "updateBackgroundWaitMs sp null");
            } else if (a2 <= 0) {
                k.edit().remove(BACK_GROUND_WAIT_SECONDS).apply();
                tm1.a(TAG, "updateBackgroundWaitMs waitMS null remove:" + a2);
            } else {
                try {
                    k.edit().putInt(BACK_GROUND_WAIT_SECONDS, a2).apply();
                } catch (Exception e) {
                    tm1.b(TAG, "updateBackgroundWaitMs  error.", e);
                }
            }
        }
    }
}
