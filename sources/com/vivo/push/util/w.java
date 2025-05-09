package com.vivo.push.util;

import android.os.UserHandle;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static int f14674a = -1;

    public static int a() {
        int i = f14674a;
        if (i != -1) {
            return i;
        }
        try {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            declaredMethod.setAccessible(true);
            f14674a = ((Integer) declaredMethod.invoke(null, null)).intValue();
            u.d("MultiUserManager", "getMyUserId = " + f14674a);
            return f14674a;
        } catch (Exception e) {
            u.a("MultiUserManager", "getMyUserId error " + e.getMessage());
            return 0;
        }
    }
}
