package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ish {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY_MTB_MINIAPP_UPDATE_TIME = "ultron_mtb_miniapp_update_time";
    public static final String CACHE_KEY_ULTRON_MTB = "ultron_mtb_only_response";
    public static final String CACHE_KEY_ULTRON_SEC_SCREEN = "ultron_mtb_second_screen_response";
    public static final String CACHE_KEY_UPDATE_TIME = "ultron_mtb_update_time";
    public static final long DEFAULT_INFO_DATA_EXPIRES_TIME = 480;
    public static final String TAG = ish.class.getSimpleName();
    public static ish d;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f21548a;
    public String b;
    public JSONObject c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopResponse f21549a;
        public final /* synthetic */ String b;

        public a(MtopResponse mtopResponse, String str) {
            this.f21549a = mtopResponse;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MtopResponse mtopResponse = this.f21549a;
            if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                ish.this.q(JSON.parseObject(new String(this.f21549a.getBytedata())), this.b);
            }
        }
    }

    static {
        t2o.a(745538035);
    }

    public static JSONArray d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("eeb9f2fd", new Object[]{jSONObject});
        }
        if (jSONObject == null || !jSONObject.containsKey("data") || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return null;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            if (entry.getKey().contains("orderModule")) {
                JSONObject jSONObject4 = (JSONObject) entry.getValue();
                if (jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("fields")) == null) {
                    return null;
                }
                return jSONObject3.getJSONArray("deliveryList");
            }
        }
        return null;
    }

    public static ish g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ish) ipChange.ipc$dispatch("ff2cf7d6", new Object[0]);
        }
        if (d == null) {
            synchronized (ish.class) {
                try {
                    if (d == null) {
                        d = new ish();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.f21548a = null;
        this.b = null;
        lgj.d(CACHE_KEY_UPDATE_TIME);
        lgj.d(CACHE_KEY_ULTRON_MTB);
        lgj.d(CACHE_KEY_ULTRON_SEC_SCREEN);
        lgj.d(CACHE_KEY_MTB_MINIAPP_UPDATE_TIME);
        lgj.d("ultron_mtb_upp_delta");
        suv.e(u3j.b, 19999, "upp_async", "async_remove", null, null);
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("39d2da96", new Object[]{this});
        }
        JSONObject jSONObject = this.f21548a;
        if (jSONObject == null) {
            return null;
        }
        return com.taobao.mytaobao.basement.a.a(jSONObject.getJSONObject("data"));
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b347fd", new Object[]{this})).longValue();
        }
        long j = osh.f25618a;
        if (j > 0) {
            return j * 1000;
        }
        return j;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a3fbc5d", new Object[]{this});
        }
        JSONObject j = j(this.f21548a);
        if (j == null) {
            return null;
        }
        return j.getJSONObject("skin");
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b20d47b2", new Object[]{this});
        }
        return JSON.parseObject(sf9.b(Globals.getApplication(), "mytaobao/ultron_mtb_2024.json"));
    }

    public final JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1845ab44", new Object[]{this});
        }
        JSONObject jSONObject = this.f21548a;
        if (jSONObject != null) {
            return jSONObject;
        }
        Object b = lgj.b(CACHE_KEY_ULTRON_MTB);
        JSONObject jSONObject2 = (b == null || !(b instanceof JSONObject)) ? null : (JSONObject) b;
        this.f21548a = jSONObject2;
        this.b = p(jSONObject2);
        return this.f21548a;
    }

    public JSONObject j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b0eee1f", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("data");
        } catch (Throwable unused) {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject("global");
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4828e903", new Object[]{this});
        }
        JSONObject jSONObject = this.f21548a;
        if (jSONObject != null) {
            return jSONObject;
        }
        return b();
    }

    public JSONObject l() {
        Object b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1b46b3d1", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = (!Login.checkSessionValid() || (b = lgj.b(CACHE_KEY_ULTRON_SEC_SCREEN)) == null || !(b instanceof JSONObject)) ? null : (JSONObject) b;
        this.c = jSONObject2;
        return jSONObject2;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87531490", new Object[]{this});
        }
        return l();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        this.f21548a = null;
        this.b = null;
        d = null;
    }

    public final String p(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e646e13e", new Object[]{this, jSONObject});
        }
        JSONObject j = j(jSONObject);
        if (j == null || (jSONObject2 = j.getJSONObject("skin")) == null) {
            return null;
        }
        return jSONObject2.getString("vipType");
    }

    public void q(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f1fb83", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null) {
            if (CACHE_KEY_ULTRON_MTB.equalsIgnoreCase(str)) {
                this.f21548a = jSONObject;
                this.b = p(jSONObject);
                lgj.e(CACHE_KEY_ULTRON_MTB, jSONObject);
                lgj.e(CACHE_KEY_MTB_MINIAPP_UPDATE_TIME, Long.valueOf(TimeStampManager.instance().getCurrentTimeStamp()));
                return;
            }
            this.c = jSONObject;
            lgj.e(str, jSONObject);
        }
    }

    public void r(MtopResponse mtopResponse, fsb fsbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560c4a53", new Object[]{this, mtopResponse, fsbVar, str});
        } else {
            Coordinator.execute(new a(mtopResponse, str));
        }
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e5142a64", new Object[]{this});
        }
        JSONObject i = i();
        if (i == null) {
            l3j l3jVar = l3j.INSTANCE;
            l3jVar.y(1);
            l3jVar.z(1);
            TLog.loge("mtbMainLink", "主接口getMTBCache为空，登录状态:" + Login.checkSessionValid());
            i = h();
            if (i == null) {
                TLog.loge("mtbMainLink", "主接口getMTBAsset为空");
            }
            this.f21548a = i;
            this.b = p(i);
        } else {
            l3j.INSTANCE.y(0);
        }
        return i;
    }

    public boolean n() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7f2eba9", new Object[]{this})).booleanValue();
        }
        try {
            j = Long.parseLong(lgj.c(CACHE_KEY_MTB_MINIAPP_UPDATE_TIME));
        } catch (Exception unused) {
            j = 0;
        }
        return j != 0 && j + e() >= TimeStampManager.instance().getCurrentTimeStamp();
    }
}
