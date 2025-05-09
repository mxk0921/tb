package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] d = {"DWInteractive"};
    public static final bjz e = new bjz();

    /* renamed from: a  reason: collision with root package name */
    public final feh f16438a;
    public final obk b;
    public final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                bjz.a(bjz.this, str, map);
            } catch (Exception e) {
                AVSDKLog.e(bjz.b(bjz.this), e.getMessage());
            }
        }
    }

    static {
        t2o.a(774897959);
    }

    public bjz() {
        feh fehVar = new feh("OrangeConfigUtils", "Global");
        this.f16438a = fehVar;
        AVSDKLog.e(fehVar, "init OrangeConfigUtils");
        OrangeConfig.getInstance().registerListener(d, new a(), true);
    }

    public static /* synthetic */ void a(bjz bjzVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad3dc30", new Object[]{bjzVar, str, map});
        } else {
            bjzVar.e(str, map);
        }
    }

    public static /* synthetic */ feh b(bjz bjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("db1dc5", new Object[]{bjzVar});
        }
        return bjzVar.f16438a;
    }

    public static bjz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjz) ipChange.ipc$dispatch("85bd5984", new Object[0]);
        }
        return e;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e27d84d", new Object[]{this});
        }
        return new HashMap(this.c);
    }

    public final void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba325a65", new Object[]{this, str, map});
            return;
        }
        feh fehVar = this.f16438a;
        AVSDKLog.e(fehVar, "updateVersion : " + map.get("configVersion"));
        this.c.put(str, map.get("configVersion"));
    }
}
