package com.opos.process.bridge.provider;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object>> f5982a = new C0303a();

    /* compiled from: Taobao */
    /* renamed from: com.opos.process.bridge.provider.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0303a extends ThreadLocal<Map<String, Object>> {
        static {
            t2o.a(253755472);
        }

        @Override // java.lang.ThreadLocal
        public Map<String, Object> initialValue() {
            return new HashMap<String, Object>(8) { // from class: com.opos.process.bridge.provider.ThreadLocalUtil$MapThreadLocal$1
                public static final long serialVersionUID = 3637958959138295593L;

                public Object put(String str, Object obj) {
                    return super.put((ThreadLocalUtil$MapThreadLocal$1) str, (String) obj);
                }
            };
        }
    }

    static {
        t2o.a(253755471);
    }

    public static void a(Map<String, Object> map) {
        for (String str : map.keySet()) {
            f5982a.get().put(str, map.get(str));
        }
    }

    public static void b(Set<String> set) {
        for (String str : set) {
            f5982a.get().remove(str);
        }
    }
}
