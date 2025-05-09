package android.taobao.windvane.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ipb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIGNAME_COMMON = "common";
    public static final String CONFIGNAME_COOKIE = "cookie_black_list";
    public static final String CONFIGNAME_DOMAIN = "domain";
    public static final String CONFIGNAME_LOCALE = "locale";
    public static final String CONFIGNAME_UC_CORE = "uc_core";
    public static final String CONFIGNAME_URL_CONFIG = "WindVane_URL_config";
    public static final String SPNAME_CONFIG = "wv_main_config";
    public static volatile WVConfigManager b = null;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ipb> f1755a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum WVConfigUpdateFromType {
        WVConfigUpdateFromTypeCustom,
        WVConfigUpdateFromTypeActive,
        WVConfigUpdateFromTypeFinish,
        WVConfigUpdateFromTypePush,
        WVConfigUpdateFromTypeLaunch,
        WVConfigUpdateFromTypeAppActive,
        WVConfigUpdateFromTypeLocaleChange,
        WVConfigUpdateFromZCache3_0;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WVConfigUpdateFromType wVConfigUpdateFromType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/config/WVConfigManager$WVConfigUpdateFromType");
        }

        public static WVConfigUpdateFromType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVConfigUpdateFromType) ipChange.ipc$dispatch("f7560edb", new Object[]{str});
            }
            return (WVConfigUpdateFromType) Enum.valueOf(WVConfigUpdateFromType.class, str);
        }
    }

    static {
        t2o.a(989855788);
    }

    public static WVConfigManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVConfigManager) ipChange.ipc$dispatch("b146ad30", new Object[0]);
        }
        if (b == null) {
            synchronized (WVConfigManager.class) {
                try {
                    if (b == null) {
                        b = new WVConfigManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b(String str, ipb ipbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c06ae3", new Object[]{this, str, ipbVar});
        } else {
            this.f1755a.put(str, ipbVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e187978", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, ipb> concurrentHashMap = this.f1755a;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, ipb> entry : concurrentHashMap.entrySet()) {
                entry.getValue().a("");
            }
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76314f8", new Object[]{this, str, str2});
            return;
        }
        ipb ipbVar = this.f1755a.get(str);
        if (ipbVar != null) {
            ipbVar.a(str2);
        }
    }
}
