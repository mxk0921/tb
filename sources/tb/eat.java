package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static eat b = null;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, a> f18429a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f18430a;
        public final long b;

        static {
            t2o.a(1020264470);
        }

        public a(eat eatVar, String str, long j) {
            this.f18430a = str;
            this.b = j;
        }
    }

    static {
        t2o.a(1020264469);
    }

    public static synchronized eat b() {
        synchronized (eat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eat) ipChange.ipc$dispatch("75879fe8", new Object[0]);
            }
            if (b == null) {
                b = new eat();
            }
            return b;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33dc46aa", new Object[]{this});
        }
        a aVar = this.f18429a.get("e");
        if (aVar == null || !c(aVar)) {
            return "";
        }
        return aVar.f18430a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf19448", new Object[]{this});
            return;
        }
        this.f18429a.remove("e");
        TaoLog.Logi("AlimamaSdk", "remove global e ");
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb37e2d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f18429a.put("e", new a(this, str, com.taobao.alimama.services.a.e().c().getTimestamp()));
            TaoLog.Logi("AlimamaSdk", "update global e : " + str);
        }
    }

    public final boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f45a9b7c", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
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
        return (com.taobao.alimama.services.a.e().c().getTimestamp() - aVar.b) / 1000 < j;
    }
}
