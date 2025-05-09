package com.vivo.push.util;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.vivo.push.a.a;
import com.vivo.push.b.n;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class s implements t {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14672a = f7l.BRACKET_START_STR + Process.myPid() + f7l.BRACKET_END_STR;

    @Override // com.vivo.push.util.t
    public final int a(String str, String str2) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.e(concat, f14672a + str2);
    }

    @Override // com.vivo.push.util.t
    public final int b(String str, String str2) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.w(concat, f14672a + str2);
    }

    @Override // com.vivo.push.util.t
    public final int c(String str, String str2) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.d(concat, f14672a + str2);
    }

    @Override // com.vivo.push.util.t
    public final int d(String str, String str2) {
        if (!u.a()) {
            return -1;
        }
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.i(concat, f14672a + str2);
    }

    @Override // com.vivo.push.util.t
    public final int e(String str, String str2) {
        if (!u.a()) {
            return -1;
        }
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.v(concat, f14672a + str2);
    }

    @Override // com.vivo.push.util.t
    public final int a(String str, Throwable th) {
        return Log.e("VivoPush.Client.".concat(String.valueOf(str)), Log.getStackTraceString(th));
    }

    @Override // com.vivo.push.util.t
    public final int b(String str, String str2, Throwable th) {
        if (!u.a()) {
            return -1;
        }
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.i(concat, f14672a + str2, th);
    }

    @Override // com.vivo.push.util.t
    public final void c(Context context, String str) {
        if (a()) {
            a(context, str, 2);
        }
    }

    @Override // com.vivo.push.util.t
    public final void b(Context context, String str) {
        if (a()) {
            a(context, str, 1);
        }
    }

    @Override // com.vivo.push.util.t
    public final int a(String str, String str2, Throwable th) {
        String concat = "VivoPush.Client.".concat(String.valueOf(str));
        return Log.e(concat, f14672a + str2, th);
    }

    @Override // com.vivo.push.util.t
    public final String a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    @Override // com.vivo.push.util.t
    public final void a(Context context, String str) {
        if (a()) {
            a(context, str, 0);
        }
    }

    private void a(Context context, String str, int i) {
        n nVar = new n();
        nVar.b(str);
        nVar.a(i);
        if (i > 0) {
            d("LogController", str);
        }
        nVar.g();
        a.a(context, nVar, context.getPackageName());
    }

    private static boolean a() {
        u.a();
        return com.vivo.push.g.a.a().b();
    }
}
