package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bd {

    /* renamed from: a  reason: collision with root package name */
    static byte[] f5584a;
    static byte[] b;
    private String c;

    public bd(String str) {
        this.c = s.a(TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    public static int a(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            av.b(th, "csp", "giv");
            return i;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            av.b(th, "csp", "gsv");
            return str3;
        }
    }

    public static long a(Context context, String str, String str2, long j) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j);
        } catch (Throwable th) {
            av.b(th, "csp", "glv");
            return j;
        }
    }

    private static byte[] b(Context context) {
        byte[] bArr = b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] copyOfRange = Arrays.copyOfRange(a(context), 0, a(context).length / 2);
        b = copyOfRange;
        return copyOfRange;
    }

    public static SharedPreferences.Editor a(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return context.getSharedPreferences(str, 0).edit();
                }
            } catch (Throwable th) {
                as.a(th, BaseFBPlugin.VERIFY_TYPE.sp, "ge");
            }
        }
        return null;
    }

    public static byte[] b(Context context, byte[] bArr) {
        try {
            return p.a(a(context), bArr, b(context));
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static String a(Context context, String str, String str2) {
        if (context == null) {
            return "";
        }
        try {
            return x.a(b(context, x.d(context.getSharedPreferences(str, 0).getString(str2, ""))));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putString(str2, x.g(a(context, x.a(str3))));
                a(edit);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor != null) {
            try {
                editor.apply();
            } catch (Throwable th) {
                as.a(th, BaseFBPlugin.VERIFY_TYPE.sp, "cm");
            }
        }
    }

    public static void a(SharedPreferences.Editor editor, String str) {
        if (editor != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    editor.remove(str);
                }
            } catch (Throwable th) {
                as.a(th, BaseFBPlugin.VERIFY_TYPE.sp, "rk");
            }
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            av.b(th, "csp", "putPrefsInt");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, long j) {
        if (editor != null && !TextUtils.isEmpty(str)) {
            try {
                editor.putLong(str, j);
            } catch (Throwable th) {
                av.b(th, "csp", "plv");
            }
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, String str2) {
        if (editor != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    editor.putString(str, str2);
                }
            } catch (Throwable th) {
                as.a(th, BaseFBPlugin.VERIFY_TYPE.sp, "ps");
            }
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            av.b(th, "csp", "setPrefsStr");
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            av.b(th, "csp", "gbv");
            return z;
        }
    }

    private static byte[] a(Context context) {
        if (context == null) {
            return new byte[0];
        }
        byte[] bArr = f5584a;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bytes = l.f(context).getBytes();
        f5584a = bytes;
        return bytes;
    }

    public static byte[] a(Context context, byte[] bArr) {
        try {
            return p.b(a(context), bArr, b(context));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
