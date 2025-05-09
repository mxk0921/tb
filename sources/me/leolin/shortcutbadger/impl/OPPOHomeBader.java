package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.security.realidentity.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import tb.cw3;
import tb.ol2;
import tb.po1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class OPPOHomeBader implements po1 {

    /* renamed from: a  reason: collision with root package name */
    public static int f15402a = -1;

    @Override // tb.po1
    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // tb.po1
    public void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        if (ol2.a(context, intent)) {
            context.sendBroadcast(intent);
        } else if (g() == 6) {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        }
    }

    public final boolean c(Object obj) {
        if (obj == null || obj.toString().equals("") || obj.toString().trim().equals("null")) {
            return true;
        }
        return false;
    }

    public final Object d(Class cls, String str, Class[] clsArr, Object[] objArr) {
        Method f;
        if (cls == null || c(str) || (f = f(cls, str, clsArr)) == null) {
            return null;
        }
        f.setAccessible(true);
        try {
            return f.invoke(null, objArr);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final Class e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final Method f(Class cls, String str, Class[] clsArr) {
        if (cls == null || c(str)) {
            return null;
        }
        try {
            try {
                cls.getMethods();
                cls.getDeclaredMethods();
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                if (cls.getSuperclass() != null) {
                    return f(cls.getSuperclass(), str, clsArr);
                }
                return null;
            }
        } catch (Exception unused2) {
            return cls.getMethod(str, clsArr);
        }
    }

    public final int g() {
        int i;
        int i2 = f15402a;
        if (i2 >= 0) {
            return i2;
        }
        try {
            i = ((Integer) d(e("com.color.os.ColorBuild"), "getColorOSVERSION", null, null)).intValue();
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            try {
                String h = h(m.y);
                if (h.startsWith("V1.4")) {
                    return 3;
                }
                if (h.startsWith("V2.0")) {
                    return 4;
                }
                if (h.startsWith("V2.1")) {
                    return 5;
                }
            } catch (Exception unused2) {
            }
        }
        f15402a = i;
        return i;
    }

    public final String h(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                cw3.b(bufferedReader);
                return readLine;
            } catch (IOException unused) {
                cw3.b(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                cw3.b(bufferedReader2);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
