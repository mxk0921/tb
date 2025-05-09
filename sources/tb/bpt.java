package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16539a;
    public aqb b;
    public final Map<String, List<String>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements aqb {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String PATH = "theme/configuration.json";

        static {
            t2o.a(155189378);
            t2o.a(155189375);
        }

        public b() {
        }

        @Override // tb.aqb
        public Map<String, List<String>> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("aac1b80e", new Object[]{this});
            }
            return null;
        }

        @Override // tb.aqb
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("61d25a94", new Object[]{this});
            }
            return PATH;
        }
    }

    static {
        t2o.a(155189376);
    }

    public bpt(Context context) {
        if (context != null) {
            this.f16539a = context;
            this.b = new b();
            d();
            return;
        }
        throw new IllegalArgumentException("param context can not be null");
    }

    public final List<String> a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("274ebe01", new Object[]{this, strArr});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r7 != null) goto L_0x005b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject b(java.lang.String r7, android.content.Context r8) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "closeThemeConfigStream"
            java.lang.String r2 = "Ultron"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.bpt.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r1 = "e9beaa2f"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r6
            r2[r0] = r7
            r7 = 2
            r2[r7] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r1, r2)
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            return r7
        L_0x001f:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r4 = 0
            if (r3 == 0) goto L_0x0027
            return r4
        L_0x0027:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0062
            r3.<init>()     // Catch: all -> 0x0062
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: all -> 0x0062
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: all -> 0x0062
            java.io.InputStream r7 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r8, r7)     // Catch: all -> 0x0062
            r5.<init>(r7)     // Catch: all -> 0x0062
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: all -> 0x005f
            r7.<init>(r5)     // Catch: all -> 0x005f
        L_0x003e:
            java.lang.String r8 = r7.readLine()     // Catch: all -> 0x0048
            if (r8 == 0) goto L_0x004a
            r3.append(r8)     // Catch: all -> 0x0048
            goto L_0x003e
        L_0x0048:
            goto L_0x0065
        L_0x004a:
            java.lang.String r8 = r3.toString()     // Catch: all -> 0x0048
            com.alibaba.fastjson.JSONObject r4 = com.alibaba.fastjson.JSON.parseObject(r8)     // Catch: all -> 0x0048
            boolean r8 = tb.vav.a(r2, r1, r0)
            if (r8 == 0) goto L_0x0073
            r5.close()     // Catch: all -> 0x0073
        L_0x005b:
            r7.close()     // Catch: all -> 0x0073
            goto L_0x0073
        L_0x005f:
            r7 = r4
            goto L_0x0065
        L_0x0062:
            r7 = r4
            r5 = r7
        L_0x0065:
            boolean r8 = tb.vav.a(r2, r1, r0)
            if (r8 == 0) goto L_0x0073
            if (r5 == 0) goto L_0x0070
            r5.close()     // Catch: all -> 0x0073
        L_0x0070:
            if (r7 == 0) goto L_0x0073
            goto L_0x005b
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bpt.b(java.lang.String, android.content.Context):com.alibaba.fastjson.JSONObject");
    }

    public List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a471e538", new Object[]{this, str});
        }
        return (List) ((HashMap) this.c).get(str);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee47bf5e", new Object[]{this});
            return;
        }
        aqb aqbVar = this.b;
        if (aqbVar != null) {
            JSONObject b2 = b(aqbVar.b(), this.f16539a);
            if (b2 != null) {
                for (String str : b2.keySet()) {
                    String string = b2.getString(str);
                    if (!TextUtils.isEmpty(string)) {
                        f(str, string.split(SymbolExpUtil.SYMBOL_VERTICALBAR));
                    }
                }
            }
            e(this.b.a());
        }
    }

    public void e(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b93822a", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            this.c.putAll(map);
        }
    }

    public void f(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb25a9", new Object[]{this, str, strArr});
        } else if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            ((HashMap) this.c).put(str, a(strArr));
        }
    }

    public void g(aqb aqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ac9926", new Object[]{this, aqbVar});
            return;
        }
        ((HashMap) this.c).clear();
        h(aqbVar);
    }

    public void h(aqb aqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438b45f9", new Object[]{this, aqbVar});
            return;
        }
        this.b = aqbVar;
        d();
    }
}
