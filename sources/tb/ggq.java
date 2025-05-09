package tb;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.HttpHeaderConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ggq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f19976a = new ConcurrentHashMap<>();

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("929e2f78", new Object[]{context, str});
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f19976a;
        String str2 = concurrentHashMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.SSR_CONFIG_STORE, "SSR_STORE_", str);
            if (!TextUtils.isEmpty(str2)) {
                concurrentHashMap.put(str, str2);
            }
        }
        return str2;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1921ac62", new Object[]{str});
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        String str2 = "";
        if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
            for (IConnStrategy iConnStrategy : connStrategyListByHost) {
                if (iConnStrategy != null) {
                    String ip = iConnStrategy.getIp();
                    if (!TextUtils.isEmpty(ip)) {
                        if (!TextUtils.isEmpty(str2)) {
                            str2 = str2 + "," + ip;
                        } else {
                            str2 = ip;
                        }
                    }
                }
            }
        }
        return str2;
    }

    public static String c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79f690e", new Object[]{hashMap});
        }
        if (hashMap == null) {
            return "";
        }
        if (!hashMap.isEmpty()) {
            try {
            } catch (Throwable unused) {
                return "";
            }
        }
        return g8p.b("tbssr_s9rs1g1x$" + hashMap.get(HttpHeaderConstant.X_APPKEY) + "$" + hashMap.get(HttpHeaderConstant.X_APP_VER) + "$" + hashMap.get(HttpHeaderConstant.X_UTDID) + "$" + hashMap.get(HttpHeaderConstant.X_T) + "$" + hashMap.get(HttpHeaderConstant.X_SERVICE_DOMAIN) + "$" + hashMap.get(HttpHeaderConstant.X_SERVICE_UNIT) + "$" + hashMap.get(HttpHeaderConstant.X_SERVICE_IPS));
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d27e742c", new Object[]{str});
        }
        String unitByHost = StrategyCenter.getInstance().getUnitByHost(str);
        if (TextUtils.isEmpty(unitByHost)) {
            return "";
        }
        return unitByHost;
    }

    public static void e(Context context, HashMap<String, String> hashMap) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7dad19b", new Object[]{context, hashMap});
        } else if (context != null && hashMap != null && !hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                String str2 = hashMap.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    for (String str3 : str2.split(",")) {
                        if (TextUtils.isEmpty(a(context, str3))) {
                            f(context, str3, str);
                        }
                    }
                }
            }
        }
    }

    public static void f(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8773d9", new Object[]{context, str, str2});
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f19976a;
        String str3 = concurrentHashMap.get(str);
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str3, str2)) {
            concurrentHashMap.put(str, str2);
            ConfigStoreManager.getInstance().saveConfigItem(context, ConfigStoreManager.SSR_CONFIG_STORE, "SSR_STORE_", str, str2);
        }
    }
}
