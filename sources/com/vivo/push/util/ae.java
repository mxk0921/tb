package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ae implements e {

    /* renamed from: a  reason: collision with root package name */
    private static String f14660a = "SpCache";
    private static String b = "com.vivo.push.cache";
    private SharedPreferences c;

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        if (this.c != null) {
            return true;
        }
        this.c = context.getSharedPreferences(b, 0);
        return true;
    }

    @Override // com.vivo.push.util.e
    public final void b(String str, String str2) {
        SharedPreferences.Editor edit = this.c.edit();
        if (edit != null) {
            edit.putString(str, str2);
            c.a(edit);
            u.d(f14660a, "putString by ".concat(String.valueOf(str)));
            return;
        }
        u.b(f14660a, "putString error by ".concat(String.valueOf(str)));
    }

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        String string = this.c.getString(str, str2);
        String str3 = f14660a;
        u.d(str3, "getString " + str + " is " + string);
        return string;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.c.edit();
        if (edit != null) {
            edit.clear();
            c.a(edit);
        }
        u.d(f14660a, "system cache is cleared");
    }
}
