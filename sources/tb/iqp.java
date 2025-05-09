package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class iqp extends vnp {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793311);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793310);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqp(String str, String str2, Map<String, String> map) {
        super(str2, map);
        String value;
        ckf.g(str, "appId");
        ckf.g(str2, "chiTuaAlias");
        a("appId", str);
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry.getKey().length() <= 0 || (value = entry.getValue()) == null || value.length() == 0)) {
                    b(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
