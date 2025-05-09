package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ld2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ld2 f23268a;
    public static final int b = 5;
    public static final ThreadLocal<StringBuilder> c = new a();
    public static final ThreadLocal<StringBuilder> d = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends ThreadLocal<StringBuilder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/node/BizArgManager$1");
        }

        public StringBuilder a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("735e5c83", new Object[]{this});
            }
            return new StringBuilder(512);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.StringBuilder] */
        @Override // java.lang.ThreadLocal
        public /* synthetic */ StringBuilder initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("2908671e", new Object[]{this});
            }
            return a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends ThreadLocal<StringBuilder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/node/BizArgManager$2");
        }

        public StringBuilder a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StringBuilder) ipChange.ipc$dispatch("735e5c83", new Object[]{this});
            }
            return new StringBuilder(1024);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.StringBuilder] */
        @Override // java.lang.ThreadLocal
        public /* synthetic */ StringBuilder initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("2908671e", new Object[]{this});
            }
            return a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23269a;
        public Boolean d;
        public Boolean e;
        public StringBuffer m;
        public final StringBuilder n;
        public final Map<String, Object> b = new HashMap();
        public final List<String> c = new ArrayList();
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public boolean j = false;
        public boolean k = false;
        public int l = -1;

        static {
            t2o.a(404750537);
        }

        public c(ld2 ld2Var, String str) {
            this.f23269a = "";
            new HashMap();
            Boolean bool = Boolean.FALSE;
            this.d = bool;
            this.e = bool;
            if (gwv.C()) {
                this.f23269a = str;
                StringBuilder sb = (StringBuilder) ld2.b().get();
                this.n = sb;
                sb.setLength(0);
                return;
            }
            this.f23269a = str + ",";
            this.m = new StringBuffer();
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            return this.m.toString();
        }

        public void b(char c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8217d15", new Object[]{this, new Character(c)});
            } else if (gwv.C()) {
                this.n.append(c);
            } else {
                this.m.append(c);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.e = Boolean.FALSE;
            this.j = false;
            this.k = false;
            this.l = -1;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            if (gwv.C()) {
                this.n.setLength(0);
            } else {
                this.m = new StringBuffer();
            }
        }
    }

    static {
        t2o.a(404750534);
    }

    public static /* synthetic */ ThreadLocal b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("f9323aac", new Object[0]);
        }
        return c;
    }

    public static boolean e(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{strArr})).booleanValue();
        }
        if (strArr == null || strArr.length != 2 || strArr[0] == null || strArr[1] == null) {
            return false;
        }
        return true;
    }

    public static ld2 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ld2) ipChange.ipc$dispatch("f7eed2cd", new Object[0]);
        }
        if (f23268a == null) {
            synchronized (ld2.class) {
                try {
                    if (f23268a == null) {
                        f23268a = new ld2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23268a;
    }

    public final void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec725e67", new Object[]{this, cVar});
        } else if (cVar != null) {
            f(cVar);
            g(cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00eb, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(tb.ld2.c r15) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ld2.f(tb.ld2$c):void");
    }

    public final void g(c cVar) {
        List<String> list;
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c9c4e9", new Object[]{this, cVar});
        } else if (cVar != null && !cVar.d.booleanValue() && (list = cVar.c) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.length() >= 1) {
                    if (gwv.C()) {
                        i = csq.i(str2, "=");
                    } else {
                        i = str2.length() - str2.replace("=", "").length();
                    }
                    if (i == 0) {
                        str = str2;
                    } else {
                        String[] split = str2.split("=", 2);
                        if (e(split)) {
                            String str3 = split[0];
                            str = split[1];
                            str2 = str3;
                        } else {
                            k("genKVFormatByParseObj", null, false);
                            cVar.d = Boolean.TRUE;
                        }
                    }
                    if (str2.length() >= 1) {
                        cVar.d = Boolean.valueOf(d(i, str2, str, cVar.b));
                    }
                }
            }
        }
    }

    public void h(Map<String, String> map, ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f02ff", new Object[]{this, map, ly1Var});
        } else if (map != null && ly1Var != null) {
            HashMap hashMap = new HashMap();
            for (String str : map.keySet()) {
                d(1, str, map.get(str), hashMap);
            }
            ly1Var.u = hashMap;
            if (!gwv.C()) {
                ly1Var.t = hqv.b(hashMap);
            }
            if (!v82.c.m()) {
                ly1Var.l = hqv.j(map, "=", ",");
            }
        }
    }

    public void i(String str, ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f3c6df", new Object[]{this, str, ly1Var});
        } else if (str != null) {
            c cVar = new c(this, str);
            try {
                c(cVar);
                if (ly1Var != null) {
                    ly1Var.u = cVar.b;
                    if (!gwv.C()) {
                        ly1Var.t = hqv.b(cVar.b);
                    }
                    ly1Var.b();
                }
            } catch (Exception e) {
                k("convertBizArgsArrayToKVS", e, true);
                cVar.d = Boolean.TRUE;
            }
        }
    }

    public void k(String str, Exception exc, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16748dbc", new Object[]{this, str, exc, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("toBeParsedData", "");
        if (!z) {
            q82.e("bizArgs_Manager", null, hashMap, "bizArgs_standard_genericParse", "parse error within: %@" + str);
            return;
        }
        q82.f("bizArgs_Manager", null, hashMap, exc);
    }

    public final boolean d(int i, String str, String str2, Map<String, Object> map) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8ec607a", new Object[]{this, new Integer(i), str, str2, map})).booleanValue();
        }
        if (str2 == null) {
            return false;
        }
        String a2 = a(str2, 0, v82.c.D());
        if (gwv.C()) {
            i3 = csq.i(a2, "{");
            i2 = csq.i(a2, "}");
        } else {
            i3 = a2.length() - a2.replace("{", "").length();
            i2 = a2.length() - a2.replace("}", "").length();
        }
        if (i > 0 && i3 == i2 && i3 > 0) {
            try {
                JSONObject parseObject = JSON.parseObject(a2);
                if (parseObject == null || parseObject.size() <= 0) {
                    map.put(str, new JSONObject());
                } else {
                    map.put(str, parseObject);
                }
            } catch (Exception e) {
                if (a2.length() > 0) {
                    map.put(str, a2);
                } else {
                    k("genKVFormatByParseObj", e, false);
                    return false;
                }
            }
        } else if (a2.length() > 0 && str.length() > 0) {
            map.put(str, a2);
        } else if (a2.length() != 0 || str.length() <= 0) {
            k("genKVFormatByParseObj", null, false);
            return false;
        } else {
            map.put(str, "");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r36, int r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ld2.a(java.lang.String, int, boolean):java.lang.String");
    }
}
