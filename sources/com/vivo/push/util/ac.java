package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class ac implements e {

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f14659a;

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        if (!n.b()) {
            return false;
        }
        this.f14659a = context.getContentResolver();
        return true;
    }

    @Override // com.vivo.push.util.e
    public final void b(String str, String str2) {
        try {
            Settings.System.putString(this.f14659a, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            u.b("SettingsCache", "putString error by ".concat(String.valueOf(str)));
        }
    }

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        try {
            return Settings.System.getString(this.f14659a, str);
        } catch (Exception e) {
            e.printStackTrace();
            u.b("SettingsCache", "getString error by ".concat(String.valueOf(str)));
            return str2;
        }
    }
}
