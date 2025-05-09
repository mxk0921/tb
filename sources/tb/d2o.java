package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17529a;
    public Map<String, String> b;
    public String c;

    public static /* synthetic */ String a(d2o d2oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa9ee973", new Object[]{d2oVar, str});
        }
        d2oVar.f17529a = str;
        return str;
    }

    public static /* synthetic */ Map b(d2o d2oVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5d3b0f6", new Object[]{d2oVar, map});
        }
        d2oVar.b = map;
        return map;
    }

    public static /* synthetic */ String c(d2o d2oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ca18cb1", new Object[]{d2oVar, str});
        }
        d2oVar.c = str;
        return str;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f796cb7", new Object[]{this});
        }
        return this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f17529a) || this.b == null || TextUtils.isEmpty(this.c)) {
            return false;
        }
        return true;
    }

    public d2o() {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f17530a;
        public Map<String, ?> b;
        public String c;
        public String d;

        public d2o a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d2o) ipChange.ipc$dispatch("73fececa", new Object[]{this});
            }
            if (this.f17530a == null || ((this.b == null || TextUtils.isEmpty(this.c)) && TextUtils.isEmpty(this.d))) {
                return new d2o();
            }
            Map<String, String> b = b();
            d2o d2oVar = new d2o();
            d2o.a(d2oVar, this.f17530a);
            d2o.b(d2oVar, b);
            if (TextUtils.isEmpty(this.d)) {
                this.b.remove(c0c.VALID_STORAGE_DATE);
                Object remove = this.b.remove(c0c.VALID_STORAGE_PID);
                Object remove2 = this.b.remove(c0c.VALID_STORAGE_LAUNCH_SESSION);
                String str = "";
                b.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, remove == null ? str : String.valueOf(remove));
                if (remove2 != null) {
                    str = String.valueOf(remove2);
                }
                b.put("launchSession", str);
                d2o.c(d2oVar, c(this.b, this.c).toString());
            } else {
                d2o.c(d2oVar, this.d);
            }
            return d2oVar;
        }

        public final Map<String, String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8296d857", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("protocolVersion", "1.0.1");
            hashMap.put("date", this.f17530a);
            hashMap.put("platformArchitectureBit", String.valueOf(kw4.a()));
            hashMap.put("javaMax", String.valueOf(Runtime.getRuntime().maxMemory()));
            hashMap.put("supportHonorDiagKit", String.valueOf(pua.d));
            hashMap.put("honorDiagKitVersion", pua.e);
            hashMap.put("appVersion", pua.f26312a);
            hashMap.put("process", pua.c);
            hashMap.put("osApiLevel", String.valueOf(Build.VERSION.SDK_INT));
            if (!TextUtils.isEmpty(pua.f) && !"unknown".equals(pua.f)) {
                hashMap.put("lastAppVersion", pua.f);
            }
            return hashMap;
        }

        public final void d(JSONObject jSONObject, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0d04e66", new Object[]{this, jSONObject, str, obj});
                return;
            }
            try {
                if (!jSONObject.has("uploadErrorMetric") || !(jSONObject.get("uploadErrorMetric") instanceof JSONObject)) {
                    jSONObject.put("uploadErrorMetric", new JSONObject());
                }
                jSONObject.getJSONObject("uploadErrorMetric").put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public b e(Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a62f5a36", new Object[]{this, map});
            }
            this.b = map;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bf2ba87", new Object[]{this, str});
            }
            this.f17530a = str;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("87d28b74", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3373508c", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:10:0x003c, B:14:0x004f, B:15:0x0055, B:17:0x0058, B:19:0x0060, B:22:0x0079, B:24:0x007d, B:25:0x0089, B:27:0x008f, B:29:0x0097, B:32:0x009f, B:34:0x00ac, B:35:0x00af), top: B:42:0x003c }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final org.json.JSONObject c(java.util.Map<java.lang.String, ?> r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.d2o.b.c(java.util.Map, java.lang.String):org.json.JSONObject");
        }
    }
}
