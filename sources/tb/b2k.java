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
public class b2k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CPS_UT_TAOBAO = "1";
    public static final String CPS_UT_TMALL = "2";
    public static final int GLOBAL_E_SOURCE_CROSS = 10;
    public static final int GLOBAL_E_SOURCE_NORMAL = 50;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, c> f16140a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final b2k f16141a = new b2k();

        static {
            t2o.a(1020264456);
        }

        public static /* synthetic */ b2k a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b2k) ipChange.ipc$dispatch("f9924166", new Object[0]);
            }
            return f16141a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f16142a;
        public final long b;
        public final int c;

        static {
            t2o.a(1020264457);
        }

        public c(b2k b2kVar, String str, long j, int i) {
            this.f16142a = str;
            this.b = j;
            this.c = i;
        }
    }

    static {
        t2o.a(1020264454);
    }

    public static b2k c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2k) ipChange.ipc$dispatch("5e5a7bc0", new Object[0]);
        }
        return b.a();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6381fba0", new Object[]{this, str});
        }
        c cVar = this.f16140a.get(str);
        if (d(cVar)) {
            return cVar.f16142a;
        }
        return "";
    }

    public String b(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaeab382", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            str = "e_tmall";
        } else {
            str = "e_taobao";
        }
        return a(str);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde53c12", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str) || "12".equals(str)) {
            this.f16140a.remove("e_taobao");
            this.f16140a.remove("e_tmall");
        } else if ("1".equals(str)) {
            this.f16140a.remove("e_taobao");
        } else if ("2".equals(str)) {
            this.f16140a.remove("e_tmall");
        } else if ("5".equals(str)) {
            this.f16140a.remove("e_ele");
        }
        TaoLog.Logi("AlimamaSdk", "remove global e , type is: " + str);
    }

    public void f(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d42f32c", new Object[]{this, str, str2, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2) || "12".equals(str2)) {
                g(str, "e_taobao", i);
                g(str, "e_tmall", i);
            } else if ("1".equals(str2)) {
                g(str, "e_taobao", i);
            } else if ("2".equals(str2)) {
                g(str, "e_tmall", i);
            } else if ("5".equals(str2)) {
                g(str, "e_ele", i);
            }
            TaoLog.Logi("AlimamaSdk", "new update global e : " + str + ", type is: " + str2);
        }
    }

    public final void g(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92211ecb", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        c cVar = this.f16140a.get(str2);
        if (cVar == null || cVar.c <= i || !d(cVar) || TextUtils.isEmpty(cVar.f16142a)) {
            this.f16140a.put(str2, new c(this, str, com.taobao.alimama.services.a.e().c().getTimestamp(), i));
        }
    }

    public b2k() {
        this.f16140a = new HashMap<>();
    }

    public final boolean d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9dc2146", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
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
        return (com.taobao.alimama.services.a.e().c().getTimestamp() - cVar.b) / 1000 < j;
    }
}
