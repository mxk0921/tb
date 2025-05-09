package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.orange.OrangeConfig;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODEL_STATUS_KEY_LAST_ERROR = "lastErrorMsg";
    public static final String MODEL_STATUS_KEY_LAST_RUN_STATUS = "lastRunStatus";
    public static final String MODEL_STATUS_KEY_LAST_RUN_TIME = "lastRunTime";
    public static final String MODEL_STATUS_KEY_REGISTER = "isRegister";
    public static final String MODEL_STATUS_KEY_TRIGGER = "isTrigger";

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, HashMap> f26862a = new ConcurrentHashMap<>();

    static {
        t2o.a(1034944594);
    }

    public static HashMap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1f661ff9", new Object[]{str});
        }
        return f26862a.get(str);
    }

    public static final synchronized Map<String, Object> b() {
        synchronized (qow.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7c7374b2", new Object[0]);
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            kzo c = kzo.c();
            hashMap.put(Constant.API_PARAMS_KEY_ENABLE, Boolean.valueOf(c.m()));
            hashMap.put("isBaseSoLoaded", Boolean.valueOf(c.l()));
            hashMap.put("isDownloadEnable", Boolean.TRUE);
            if (pi7.a() != null) {
                hashMap.put("deviceLevel", pi7.a());
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("EdgeComputingIsEnabled");
            if (configs != null) {
                hashMap.put("orangeConfig", configs);
            }
            Collection<h45> a2 = kzo.c().e().a();
            if (a2 != null) {
                for (h45 h45Var : a2) {
                    HashMap hashMap3 = new HashMap();
                    if (h45Var.h() != null) {
                        hashMap3.put("name", h45Var.h());
                    }
                    if (h45Var.f() != null) {
                        hashMap3.put("md5", h45Var.f());
                    }
                    if (h45Var.j() != null) {
                        hashMap3.put("lastRunInfo", h45Var.k());
                    }
                    hashMap2.put(h45Var.h(), hashMap3);
                }
            }
            hashMap.put("models", hashMap2);
            return hashMap;
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b003ed68", new Object[]{str, str2});
            return;
        }
        ConcurrentHashMap<String, HashMap> concurrentHashMap = f26862a;
        if (concurrentHashMap.get(str) != null) {
            concurrentHashMap.remove(str);
        }
    }

    public static void d(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f282158f", new Object[]{str, new Boolean(z), str2});
            return;
        }
        ConcurrentHashMap<String, HashMap> concurrentHashMap = f26862a;
        HashMap hashMap = concurrentHashMap.get(str);
        if (hashMap == null) {
            hashMap = new HashMap();
            concurrentHashMap.put(str, hashMap);
        }
        hashMap.put(MODEL_STATUS_KEY_REGISTER, Boolean.valueOf(z));
    }

    public static void e(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10662ec8", new Object[]{str, new Integer(i), str2});
            return;
        }
        HashMap hashMap = f26862a.get(str);
        if (hashMap != null) {
            hashMap.put(MODEL_STATUS_KEY_LAST_RUN_STATUS, Integer.valueOf(i));
            hashMap.put(MODEL_STATUS_KEY_LAST_ERROR, str2);
            hashMap.put(MODEL_STATUS_KEY_LAST_RUN_TIME, new Date().toString());
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21961a9c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = f26862a.get(str);
        if (hashMap != null) {
            hashMap.put(MODEL_STATUS_KEY_TRIGGER, Boolean.TRUE);
        }
    }
}
