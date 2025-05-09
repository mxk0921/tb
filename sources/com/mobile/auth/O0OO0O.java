package com.mobile.auth;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0OO0O {
    private static Context O000000o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class O000000o {
        private final SharedPreferences.Editor O000000o;

        public O000000o(SharedPreferences.Editor editor) {
            this.O000000o = editor;
        }

        public void O000000o() {
            this.O000000o.apply();
        }

        public void O00000Oo() {
            this.O000000o.commit();
        }

        public void O00000o0() {
            this.O000000o.clear();
        }

        public void O000000o(String str) {
            this.O000000o.remove(O0O0OO0.O000000o(str));
        }

        public void O000000o(String str, int i) {
            this.O000000o.putInt(O0O0OO0.O000000o(str), i);
        }

        public void O000000o(String str, long j) {
            this.O000000o.putLong(O0O0OO0.O000000o(str), j);
        }

        public void O000000o(String str, String str2) {
            this.O000000o.putString(O0O0OO0.O000000o(str), str2);
        }
    }

    public static int O000000o(String str, int i) {
        return O000000o.getSharedPreferences("ssoconfigs", 0).getInt(O0O0OO0.O000000o(str), i);
    }

    public static O000000o O00000Oo(String str) {
        return new O000000o(O000000o.getSharedPreferences(str, 0).edit());
    }

    public static int O000000o(String str, String str2, int i) {
        return O000000o.getSharedPreferences(str, 0).getInt(O0O0OO0.O000000o(str2), i);
    }

    public static String O00000Oo(String str, String str2) {
        return O000000o.getSharedPreferences("ssoconfigs", 0).getString(O0O0OO0.O000000o(str), str2);
    }

    public static long O000000o(String str, long j) {
        return O000000o.getSharedPreferences("ssoconfigs", 0).getLong(O0O0OO0.O000000o(str), j);
    }

    public static long O000000o(String str, String str2, long j) {
        return O000000o.getSharedPreferences(str, 0).getLong(O0O0OO0.O000000o(str2), j);
    }

    public static O000000o O000000o() {
        return new O000000o(O000000o.getSharedPreferences("ssoconfigs", 0).edit());
    }

    public static String O000000o(String str, String str2, String str3) {
        return O000000o.getSharedPreferences(str, 0).getString(O0O0OO0.O000000o(str2), str3);
    }

    public static void O000000o(Context context) {
        O000000o = context.getApplicationContext();
    }

    public static void O000000o(String str) {
        SharedPreferences sharedPreferences = O000000o.getSharedPreferences("ssoconfigs", 0);
        sharedPreferences.edit().remove(O0O0OO0.O000000o(str)).commit();
    }

    public static void O000000o(String str, String str2) {
        SharedPreferences sharedPreferences = O000000o.getSharedPreferences("ssoconfigs", 0);
        sharedPreferences.edit().putString(O0O0OO0.O000000o(str), str2).commit();
    }

    public static void O000000o(Map<String, Object> map) {
        if (!(map == null || map.isEmpty())) {
            SharedPreferences.Editor edit = O000000o.getSharedPreferences("ssoconfigs", 0).edit();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                String O000000o2 = O0O0OO0.O000000o(str);
                if (obj instanceof String) {
                    edit.putString(O000000o2, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(O000000o2, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    edit.putLong(O000000o2, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(O000000o2, ((Boolean) obj).booleanValue());
                }
            }
            edit.commit();
        }
    }
}
