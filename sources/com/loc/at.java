package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.RejectedExecutionException;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5572a = "/a/";
    static final String b = "b";
    static final String c = "c";
    static final String d = "d";
    public static String e = "s";
    public static final String f = "g";
    public static final String g = "h";
    public static final String h = "e";
    public static final String i = "f";
    public static final String j = "j";
    public static final String k = "k";
    private static long l;
    private static Vector<w> m = new Vector<>();

    public static String a(Context context, String str) {
        return context.getSharedPreferences("AMSKLG_CFG", 0).getString(str, "");
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static String c(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + f5572a + str;
    }

    public static List<w> a() {
        Vector<w> vector;
        try {
            synchronized (Looper.getMainLooper()) {
                vector = m;
            }
            return vector;
        } catch (Throwable th) {
            th.printStackTrace();
            return m;
        }
    }

    public static boolean b(String[] strArr, String str) {
        if (!(strArr == null || str == null)) {
            try {
                for (String str2 : strArr) {
                    str = str.trim();
                    if (str.startsWith("at ")) {
                        if (str.contains(str2 + ".") && str.endsWith(f7l.BRACKET_END_STR) && !str.contains("uncaughtException")) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static void a(final Context context) {
        try {
            if (System.currentTimeMillis() - l >= 60000) {
                l = System.currentTimeMillis();
                cr.a().b(new cs() { // from class: com.loc.at.1
                    @Override // com.loc.cs
                    public final void a() {
                        try {
                            aw.b(context);
                            aw.d(context);
                            aw.c(context);
                            ca.a(context);
                            by.a(context);
                        } catch (RejectedExecutionException unused) {
                        } catch (Throwable th) {
                            av.b(th, "Lg", "proL");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            av.b(th, "Lg", "proL");
        }
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void a(w wVar) {
        try {
            synchronized (Looper.getMainLooper()) {
                if (wVar != null) {
                    if (!m.contains(wVar)) {
                        m.add(wVar);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(String[] strArr, String str) {
        if (!(strArr == null || str == null)) {
            try {
                String[] split = str.split("\n");
                for (String str2 : split) {
                    String trim = str2.trim();
                    if (!TextUtils.isEmpty(trim) && trim.startsWith("at ") && trim.contains("uncaughtException")) {
                        return false;
                    }
                }
                for (String str3 : split) {
                    if (b(strArr, str3.trim())) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
