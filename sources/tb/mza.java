package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mza {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BUCKETID = "bucketId";
    public static final String KEY_VALUE = "value";
    public static final String TAG = "ABTestTool";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f24405a;
    public String b;
    public Application c;
    public UMLinkLogInterface d;
    public final Map<String, Object> e = new ConcurrentHashMap();
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f24406a;

        public a(JSONObject jSONObject) {
            this.f24406a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mza.a(mza.this) != null) {
                SharedPreferences.Editor edit = mza.a(mza.this).getSharedPreferences("home_client_abtest", 0).edit();
                JSONObject jSONObject = this.f24406a;
                if (jSONObject == null) {
                    str = "";
                } else {
                    str = JSON.toJSONString(jSONObject);
                }
                edit.putString("home_client_abtest", str);
                edit.apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static final mza instance = new mza();

        static {
            t2o.a(473956390);
        }
    }

    static {
        t2o.a(473956388);
    }

    public static /* synthetic */ Application a(mza mzaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("51195fd3", new Object[]{mzaVar});
        }
        return mzaVar.c;
    }

    public static mza d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mza) ipChange.ipc$dispatch("3a9a6e11", new Object[0]);
        }
        return b.instance;
    }

    public static boolean f(Class<?> cls) {
        try {
            if (!cls.isPrimitive()) {
                if (!((Class) cls.getField("TYPE").get(null)).isPrimitive()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
        } else if (this.d != null) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!TextUtils.isEmpty(this.b)) {
                hashMap.put("home_client_abtest", this.b);
            }
            this.d.commitSuccess(str, str2, str3, str4, str5, hashMap);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, T, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T c(java.lang.String r5, java.lang.Class<T> r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.mza.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = "78aa978e"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            return r5
        L_0x0019:
            monitor-enter(r4)
            com.alibaba.fastjson.JSONObject r0 = r4.f24405a     // Catch: all -> 0x002c
            r1 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.containsKey(r5)     // Catch: all -> 0x002c
            if (r0 == 0) goto L_0x002f
            com.alibaba.fastjson.JSONObject r0 = r4.f24405a     // Catch: all -> 0x002c, Exception -> 0x002f
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r5)     // Catch: all -> 0x002c, Exception -> 0x002f
            goto L_0x0030
        L_0x002c:
            r5 = move-exception
            goto L_0x00bf
        L_0x002f:
            r0 = r1
        L_0x0030:
            monitor-exit(r4)     // Catch: all -> 0x002c
            if (r0 == 0) goto L_0x00be
            java.lang.String r2 = "value"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = "bucketId"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x00be
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.e
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0057
            java.util.Map<java.lang.String, java.lang.Object> r6 = r4.e
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.lang.Object r5 = r6.get(r5)
            return r5
        L_0x0057:
            java.lang.String r2 = "value"
            java.lang.String r0 = r0.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x00be
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r6 != r2) goto L_0x0069
            return r0
        L_0x0069:
            boolean r2 = f(r6)     // Catch: Exception -> 0x007c
            if (r2 == 0) goto L_0x00a9
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r6 != r5) goto L_0x007e
            boolean r5 = java.lang.Boolean.parseBoolean(r0)     // Catch: Exception -> 0x007c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: Exception -> 0x007c
            goto L_0x00a6
        L_0x007c:
            r5 = move-exception
            goto L_0x00b5
        L_0x007e:
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            if (r6 != r5) goto L_0x008b
            int r5 = java.lang.Integer.parseInt(r0)     // Catch: Exception -> 0x007c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: Exception -> 0x007c
            goto L_0x00a6
        L_0x008b:
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            if (r6 != r5) goto L_0x0098
            float r5 = java.lang.Float.parseFloat(r0)     // Catch: Exception -> 0x007c
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: Exception -> 0x007c
            goto L_0x00a6
        L_0x0098:
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            if (r6 != r5) goto L_0x00a5
            long r5 = java.lang.Long.parseLong(r0)     // Catch: Exception -> 0x007c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: Exception -> 0x007c
            goto L_0x00a6
        L_0x00a5:
            r5 = r1
        L_0x00a6:
            if (r5 == 0) goto L_0x00be
            return r5
        L_0x00a9:
            java.lang.Object r6 = com.alibaba.fastjson.JSON.parseObject(r0, r6)     // Catch: Exception -> 0x007c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.e     // Catch: Exception -> 0x007c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: Exception -> 0x007c
            r0.put(r5, r6)     // Catch: Exception -> 0x007c
            return r6
        L_0x00b5:
            boolean r6 = tb.cw6.b()
            if (r6 == 0) goto L_0x00be
            r5.printStackTrace()
        L_0x00be:
            return r1
        L_0x00bf:
            monitor-exit(r4)     // Catch: all -> 0x002c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mza.c(java.lang.String, java.lang.Class):java.lang.Object");
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dd5a6b", new Object[]{this});
            return;
        }
        String string = this.c.getSharedPreferences("home_client_abtest", 0).getString("home_client_abtest", null);
        if (!TextUtils.isEmpty(string)) {
            synchronized (this) {
                this.f24405a = JSON.parseObject(string);
            }
            h();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d74b58", new Object[]{this});
        } else if (this.f24405a != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Object> entry : this.f24405a.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) value;
                    if (jSONObject.containsKey("bucketId")) {
                        sb.append(jSONObject.getString("bucketId"));
                        sb.append("_");
                    }
                }
            }
            String sb2 = sb.toString();
            this.b = sb2;
            if (!TextUtils.isEmpty(sb2)) {
                String str = this.b;
                this.b = str.substring(0, str.length() - 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(com.alibaba.fastjson.JSONObject r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.mza.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "4d3d762a"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            if (r5 == 0) goto L_0x0026
            java.lang.String r0 = "clientABTest"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "clientABTest"
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r0)     // Catch: Exception -> 0x0026
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.clear()
            monitor-enter(r4)
            r4.f24405a = r5     // Catch: all -> 0x003e
            monitor-exit(r4)     // Catch: all -> 0x003e
            r4.h()
            tb.mza$a r0 = new tb.mza$a
            r0.<init>(r5)
            com.taobao.android.task.Coordinator.execute(r0)
            return
        L_0x003e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x003e
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mza.i(com.alibaba.fastjson.JSONObject):void");
    }

    public synchronized void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
        } else if (!this.f) {
            if (application != null) {
                this.d = hdv.a();
                this.c = application;
                g();
                this.f = true;
            }
        }
    }
}
