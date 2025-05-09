package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final cat f16949a = new cat();
    public static b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f16950a;
        public final long b;

        static {
            t2o.a(1020264465);
        }

        public static /* synthetic */ Map a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5844281e", new Object[]{bVar});
            }
            return bVar.f16950a;
        }

        public static /* synthetic */ long b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8b5235de", new Object[]{bVar})).longValue();
            }
            return bVar.b;
        }

        public b(cat catVar, Map<String, String> map, long j) {
            this.f16950a = map;
            this.b = j;
        }
    }

    static {
        t2o.a(1020264463);
    }

    public static synchronized cat b() {
        synchronized (cat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cat) ipChange.ipc$dispatch("adf2149", new Object[0]);
            }
            return f16949a;
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b7f58c69", new Object[]{this});
        }
        b bVar = b;
        if (bVar == null) {
            return null;
        }
        if (c(bVar)) {
            return b.a(b);
        }
        TaoLog.Logd("AlimamaSdk", "cached eMap expired, auto removed");
        d();
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d30062", new Object[]{this});
        } else {
            b = null;
        }
    }

    public void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec40cfe", new Object[]{this, map});
        } else if (map != null) {
            b = new b(map, com.taobao.alimama.services.a.e().c().getTimestamp());
        }
    }

    public final boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a51e135d", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        String config = OrangeConfig.getInstance().getConfig("alimama_ad", "taoke_config", "");
        long j = 86400;
        try {
            JSONObject jSONObject = TextUtils.isEmpty(config) ? null : new JSONObject(config);
            if (jSONObject != null) {
                j = jSONObject.optLong("timeout", 86400L);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (com.taobao.alimama.services.a.e().c().getTimestamp() - b.b(bVar)) / 1000 < j;
    }
}
