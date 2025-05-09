package com.taobao.umipublish.monitor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.dov;
import tb.f4v;
import tb.krq;
import tb.t2o;
import tb.ydv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PerformanceMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "PublishPerformanceMonitor";

    /* renamed from: a  reason: collision with root package name */
    public PerformanceTracker f14077a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class PerformanceTracker implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONObject biz_infos;
        public JSONObject extra_infos;
        public String location;
        public Map<String, String> urlParams;

        static {
            t2o.a(944767229);
        }

        public PerformanceTracker(Map<String, String> map) {
            this.urlParams = map;
            this.biz_infos = (JSONObject) JSON.toJSON(map);
        }

        public String toInfoString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("920813ff", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("location", this.location);
            try {
                hashMap.put(dov.KEY_BIZ_LINE, this.urlParams.get(dov.KEY_BIZ_LINE));
                hashMap.put("biz_scene", this.urlParams.get("biz_scene"));
                hashMap.put(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, this.urlParams.get(dov.KEY_ONIOLN_FITTING_ROOM_SCENE));
                hashMap.put("umi_pub_session", this.urlParams.get("umi_pub_session"));
                hashMap.put("biz_infos", URLEncoder.encode(this.biz_infos.toJSONString(), "UTF-8"));
                JSONObject jSONObject = this.extra_infos;
                if (jSONObject != null) {
                    hashMap.put("extra_infos", URLEncoder.encode(jSONObject.toJSONString(), "UTF-8"));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return krq.s(hashMap, "=", ",");
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface Rate {
        public static final String FAIL = "0";
        public static final String START = "-1";
        public static final String SUCCESS = "1";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final PerformanceMonitor f14078a = new PerformanceMonitor();

        static {
            t2o.a(944767231);
        }

        public static /* synthetic */ PerformanceMonitor a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PerformanceMonitor) ipChange.ipc$dispatch("2a89f9b0", new Object[0]);
            }
            return f14078a;
        }
    }

    static {
        t2o.a(944767225);
    }

    public static PerformanceMonitor n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceMonitor) ipChange.ipc$dispatch("5ec90a96", new Object[0]);
        }
        return b.a();
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceda1e", new Object[]{this, str, str2, str3});
        } else {
            c(str, str2, "fps", str3, null);
        }
    }

    public void b(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5b9c92", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            c(str, str2, "fps", str3, jSONObject);
        }
    }

    public final synchronized void c(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6358260f", new Object[]{this, str, str2, str3, str4, jSONObject});
            return;
        }
        PerformanceTracker performanceTracker = this.f14077a;
        if (performanceTracker != null) {
            performanceTracker.location = str;
            performanceTracker.extra_infos = jSONObject;
            TBS.Ext.commitEvent(UT_PAGE_NAME, 19999, str2, str3, str4, performanceTracker.toInfoString());
        }
    }

    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f15eef9", new Object[]{this, str, str2, str3});
        } else {
            c(str, str2, "rate", str3, null);
        }
    }

    public void e(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4273cf17", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            c(str, str2, "rate", str3, jSONObject);
        }
    }

    public void f(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3050dc5", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            c(str, str2, "rate", String.valueOf(z ? 1 : 0), null);
        }
    }

    public void g(String str, String str2, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b0b9cb", new Object[]{this, str, str2, new Boolean(z), jSONObject});
        } else {
            c(str, str2, "rate", String.valueOf(z ? 1 : 0), jSONObject);
        }
    }

    public void h(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3acb8459", new Object[]{this, str, str2, new Boolean(z), str3, str4});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            jSONObject.put(str3, (Object) str4);
        }
        c(str, str2, "rate", String.valueOf(z ? 1 : 0), jSONObject);
    }

    public void i(String str, String str2, long j, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df7d183", new Object[]{this, str, str2, new Long(j), new Boolean(z), str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put("extra", (Object) str3);
        }
        j(str, str2, j, z, jSONObject);
    }

    public void j(String str, String str2, long j, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a49a6d", new Object[]{this, str, str2, new Long(j), new Boolean(z), jSONObject});
            return;
        }
        c(str, str2, "rate", String.valueOf(z ? 1 : 0), jSONObject);
        c(str, str2, "time", String.valueOf(j), jSONObject);
    }

    public void k(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76ce247", new Object[]{this, str, str2, str3, new Long(j)});
            return;
        }
        c(str, str2, "rate", str3, null);
        c(str, str2, "time", String.valueOf(j), null);
    }

    public void l(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a80e2", new Object[]{this, str, str2, new Long(j)});
        } else {
            c(str, str2, "time", String.valueOf(j), null);
        }
    }

    public void m(String str, String str2, long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eede4e", new Object[]{this, str, str2, new Long(j), jSONObject});
        } else {
            c(str, str2, "time", String.valueOf(j), jSONObject);
        }
    }

    public void o(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
            return;
        }
        if (ydv.y()) {
            map = f4v.f();
        } else {
            map = dov.b(str).o();
        }
        this.f14077a = new PerformanceTracker(map);
    }

    public PerformanceMonitor() {
    }
}
