package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ryi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, List<String>> g = new HashMap();
    public static final List<String> h;

    /* renamed from: a  reason: collision with root package name */
    public final String f27675a;
    public String b;
    public final Map<String, Pair<Long, Long>> c = new HashMap();
    public boolean d = false;
    public boolean e = false;
    public JSONObject f;

    static {
        ArrayList arrayList = new ArrayList();
        h = arrayList;
        arrayList.add("process");
        arrayList.add("parse");
        arrayList.add("render");
    }

    public ryi(String str) {
        this.f27675a = str;
    }

    public static void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875b8604", new Object[]{str, list});
        } else {
            ((HashMap) g).put(str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ryi.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "9673ae47"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            boolean r2 = r9.d
            if (r2 == 0) goto L_0x001e
            return r1
        L_0x001e:
            boolean r2 = r9.e
            if (r2 == 0) goto L_0x0026
            r9.d(r1)
            return r1
        L_0x0026:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = tb.ryi.g
            java.lang.String r3 = r9.f27675a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x003b
            java.util.List<java.lang.String> r2 = tb.ryi.h
            java.lang.String r3 = r9.f27675a
            a(r3, r2)
        L_0x003b:
            java.util.Map<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> r3 = r9.c
            java.util.HashMap r3 = (java.util.HashMap) r3
            int r3 = r3.size()
            int r2 = r2.size()
            if (r3 >= r2) goto L_0x004a
            return r0
        L_0x004a:
            java.util.Map<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> r2 = r9.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0056:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x007d
            java.lang.Object r3 = r2.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r4 = r3.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x007c
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0056
        L_0x007c:
            return r0
        L_0x007d:
            r9.d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ryi.b():boolean");
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed84fd", new Object[]{this, str})).booleanValue();
        }
        List<String> list = (List) ((HashMap) g).get(this.f27675a);
        if (list == null) {
            list = h;
            a(this.f27675a, list);
        }
        return list.contains(str);
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f998b9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        e();
    }

    public JSONObject e() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("807a0cf8", new Object[]{this});
        }
        if (this.d && (jSONObject = this.f) != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", this.b);
            for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                Pair pair = (Pair) entry.getValue();
                if (pair != null && ((Long) pair.first).longValue() > 0 && ((Long) pair.second).longValue() > 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("start", pair.first);
                    jSONObject3.put("end", pair.second);
                    jSONObject2.put((String) entry.getKey(), jSONObject3);
                }
            }
        } catch (Exception unused) {
        }
        this.f = jSONObject2;
        return jSONObject2;
    }
}
