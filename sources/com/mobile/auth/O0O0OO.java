package com.mobile.auth;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O0OO {
    private static ConcurrentHashMap<String, O00O00o> O000000o = new ConcurrentHashMap<>(16);

    public static void O000000o(String str, O00O00o o00O00o) {
        O000000o.put(str, o00O00o);
    }

    public static void O00000Oo(String str) {
        O000000o.remove(str);
    }

    public static O00O00o O00000o0(String str) {
        return O000000o.get(str);
    }

    public static boolean O000000o() {
        return O000000o.isEmpty();
    }

    public static boolean O000000o(String str) {
        return !O000000o.containsKey(str);
    }
}
