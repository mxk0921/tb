package tb;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gao {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f19836a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public final String c;
        public final String d;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, StringBuilder> f19837a = new HashMap();
        public int b = 0;
        public int e = 0;

        static {
            t2o.a(813694995);
        }

        public a(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        public void a(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException();
            }
            Map<String, StringBuilder> map = this.f19837a;
            StringBuilder sb = (StringBuilder) ((HashMap) map).get(str);
            if (sb == null) {
                ((HashMap) map).put(str, new StringBuilder(str2));
            } else {
                sb.append((char) 1);
                sb.append(str2);
            }
            this.b += str2.length();
            this.e++;
        }

        public Map<String, String> b() {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((HashMap) this.f19837a).entrySet()) {
                hashMap.put(entry.getKey(), ((StringBuilder) entry.getValue()).toString());
            }
            return hashMap;
        }

        public int c() {
            return this.b;
        }

        public String d() {
            return this.c;
        }

        public int e() {
            return this.e;
        }

        public String f() {
            return this.d;
        }
    }

    static {
        t2o.a(813694994);
    }

    public void a() {
        ((HashMap) this.f19836a).clear();
    }

    public a b(String str, String str2) {
        String str3 = str + str2;
        HashMap hashMap = (HashMap) this.f19836a;
        a aVar = (a) hashMap.get(str3);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str, str2);
        hashMap.put(str3, aVar2);
        return aVar2;
    }

    public Map<String, a> c() {
        return this.f19836a;
    }

    public a d(String str, String str2) {
        return (a) ((HashMap) this.f19836a).remove(str + str2);
    }
}
