package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.orange.OrangeConfig;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ptf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "JarvisLibManager";

    /* renamed from: a  reason: collision with root package name */
    public static volatile ptf f26284a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject c = ptf.this.c();
            if (c == null) {
                kgh.j(ptf.LOG_TAG, "reCheckJarvisLib lib json is null!!!");
            } else {
                ptf.a(ptf.this, c);
            }
        }
    }

    static {
        t2o.a(1034944531);
    }

    public static /* synthetic */ boolean a(ptf ptfVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbc55425", new Object[]{ptfVar, jSONObject})).booleanValue();
        }
        return ptfVar.g(jSONObject);
    }

    public static ptf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ptf) ipChange.ipc$dispatch("f2abcf16", new Object[0]);
        }
        if (f26284a == null) {
            synchronized (ptf.class) {
                try {
                    if (f26284a == null) {
                        f26284a = new ptf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f26284a;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fcd208d", new Object[]{this});
        }
        return sd8.b(OrangeConfig.getInstance().getCustomConfig("ODCP_python_base_lib", ""));
    }

    public final MRTPythonLibDescription d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTPythonLibDescription) ipChange.ipc$dispatch("d1ddae2e", new Object[]{this, jSONObject, str});
        }
        try {
            String optString = jSONObject.optString("packageName");
            String optString2 = jSONObject.optString(r4p.KEY_IS_BETA);
            String optString3 = jSONObject.optString("ratio");
            JSONArray optJSONArray = jSONObject.optJSONArray("online");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("beta");
            if (optString2 != null && optString2.equals("true") && um2.f(optString3, optString)) {
                optJSONArray = optJSONArray2;
            }
            int h = h(optJSONArray, str);
            if (h < 0) {
                return null;
            }
            JSONObject jSONObject2 = optJSONArray.getJSONObject(h);
            return new MRTPythonLibDescription(optString, jSONObject2.optString("mmd5"), jSONObject2.optString("furl"), jSONObject2.optString("fmd5"), null);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af3812", new Object[]{this});
        } else {
            t45.c().d().execute(new a());
        }
    }

    public final void f(MRTPythonLibDescription mRTPythonLibDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed1638d", new Object[]{this, mRTPythonLibDescription});
        } else {
            rqh.b().e(mRTPythonLibDescription);
        }
    }

    public final boolean g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee15aca", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            kgh.c(LOG_TAG, "libConfig  empty");
            return false;
        }
        String k = kzo.c().k();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    kgh.c(LOG_TAG, "Parse lib config err, name:" + next);
                } else {
                    f(d(optJSONObject, k));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return true;
    }

    public final int h(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5f54894", new Object[]{this, jSONArray, str})).intValue();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && um2.b(optJSONObject.optJSONObject("conditionTree"), str)) {
                return i;
            }
        }
        return -1;
    }
}
