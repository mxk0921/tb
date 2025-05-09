package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static dat c = null;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, b> f17693a = new HashMap<>();
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17694a;
        public final long b;

        static {
            t2o.a(1020264468);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("961687ea", new Object[]{bVar});
            }
            return bVar.f17694a;
        }

        public static /* synthetic */ long b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b91d66a8", new Object[]{bVar})).longValue();
            }
            return bVar.b;
        }

        public b(dat datVar, String str, long j, long j2) {
            this.f17694a = str;
            this.b = j;
        }
    }

    static {
        t2o.a(1020264466);
    }

    public static synchronized dat b() {
        synchronized (dat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dat) ipChange.ipc$dispatch("511e7858", new Object[0]);
            }
            if (c == null) {
                c = new dat();
            }
            return c;
        }
    }

    public final boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e7a2fca", new Object[]{this, bVar})).booleanValue();
        }
        if (com.taobao.alimama.services.a.e().c().getTimestamp() < b.b(bVar)) {
            return true;
        }
        return false;
    }

    public final void d(JSONObject jSONObject, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191b23b9", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            this.f17693a.put("e", new b(jSONObject.optString("e"), jSONObject.optLong("timestamp") + jSONObject.optLong("leftTime"), jSONObject.optLong("timestamp") + jSONObject.optLong("cacheTime")));
            if (!z) {
                SharedPreferencesUtils.putString("pref_taoke_para_key", jSONObject.toString());
            }
            StringBuilder sb = new StringBuilder("update channel e : ");
            sb.append(jSONObject.toString());
            if (z) {
                str = " from sp";
            } else {
                str = "";
            }
            sb.append(str);
            TaoLog.Logi("AlimamaSdk", sb.toString());
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33dc46aa", new Object[]{this});
        }
        b bVar = this.f17693a.get("e");
        if (bVar == null && !this.b) {
            String string = SharedPreferencesUtils.getString("pref_taoke_para_key", "");
            this.b = true;
            try {
                d(new JSONObject(string), true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (bVar == null || !c(bVar)) {
            return "";
        }
        return b.a(bVar);
    }
}
