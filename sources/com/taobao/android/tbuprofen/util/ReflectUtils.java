package com.taobao.android.tbuprofen.util;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.t2o;
import tb.zrr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ReflectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9629a;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x000d, B:11:0x0014, B:15:0x001c, B:19:0x0024, B:20:0x003d, B:22:0x0044), top: B:27:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Field a(boolean r6, java.lang.Class<?> r7, java.lang.String r8) {
        /*
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x004c
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x004c
            r2 = 0
            if (r6 == 0) goto L_0x003d
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0022
            r3 = 28
            if (r6 >= r3) goto L_0x0014
            goto L_0x003d
        L_0x0014:
            boolean r3 = com.taobao.android.tbuprofen.util.ReflectUtils.f9629a     // Catch: all -> 0x0022
            if (r3 == 0) goto L_0x0024
            r3 = 30
            if (r6 < r3) goto L_0x0024
            java.lang.reflect.Field r6 = getDeclaredField(r7, r8)     // Catch: all -> 0x0022
        L_0x0020:
            r2 = r6
            goto L_0x0042
        L_0x0022:
            r6 = move-exception
            goto L_0x0048
        L_0x0024:
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            java.lang.String r3 = "getDeclaredField"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: all -> 0x0022
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: all -> 0x0022
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r3, r4)     // Catch: all -> 0x0022
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: all -> 0x0022
            r3[r0] = r8     // Catch: all -> 0x0022
            java.lang.Object r6 = r6.invoke(r7, r3)     // Catch: all -> 0x0022
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: all -> 0x0022
            goto L_0x0020
        L_0x003d:
            java.lang.reflect.Field r6 = r7.getDeclaredField(r8)     // Catch: all -> 0x0022
            goto L_0x0020
        L_0x0042:
            if (r2 == 0) goto L_0x004b
            r2.setAccessible(r1)     // Catch: all -> 0x0022
            goto L_0x004b
        L_0x0048:
            r6.printStackTrace()
        L_0x004b:
            return r2
        L_0x004c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "argument is null"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.util.ReflectUtils.a(boolean, java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    public static Field b(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("50f2fafa", new Object[]{new Boolean(z), str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("argument is null");
        }
        try {
            return a(z, Class.forName(str), str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Field c(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("96db963", new Object[]{cls, str});
        }
        return a(true, cls, str);
    }

    public static Field d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("4f3b7052", new Object[]{str, str2});
        }
        return b(true, str, str2);
    }

    public static Method e(String str, String str2, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("288d21fa", new Object[]{str, str2, clsArr});
        }
        return g(true, str, str2, clsArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x000e, B:11:0x0015, B:15:0x001d, B:19:0x0025, B:20:0x0044, B:22:0x004b), top: B:27:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Method f(boolean r7, java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?>... r10) {
        /*
            r0 = 0
            r1 = 2
            r2 = 1
            if (r8 == 0) goto L_0x0053
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L_0x0053
            r3 = 0
            if (r7 == 0) goto L_0x0044
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0023
            r4 = 28
            if (r7 >= r4) goto L_0x0015
            goto L_0x0044
        L_0x0015:
            boolean r4 = com.taobao.android.tbuprofen.util.ReflectUtils.f9629a     // Catch: all -> 0x0023
            if (r4 == 0) goto L_0x0025
            r4 = 30
            if (r7 < r4) goto L_0x0025
            java.lang.reflect.Method r7 = getDeclaredMethod(r8, r9, r10)     // Catch: all -> 0x0023
        L_0x0021:
            r3 = r7
            goto L_0x0049
        L_0x0023:
            r7 = move-exception
            goto L_0x004f
        L_0x0025:
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            java.lang.String r4 = "getDeclaredMethod"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: all -> 0x0023
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch: all -> 0x0023
            java.lang.Class<java.lang.Class[]> r6 = java.lang.Class[].class
            r5[r2] = r6     // Catch: all -> 0x0023
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r4, r5)     // Catch: all -> 0x0023
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0023
            r1[r0] = r9     // Catch: all -> 0x0023
            r1[r2] = r10     // Catch: all -> 0x0023
            java.lang.Object r7 = r7.invoke(r8, r1)     // Catch: all -> 0x0023
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: all -> 0x0023
            goto L_0x0021
        L_0x0044:
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r9, r10)     // Catch: all -> 0x0023
            goto L_0x0021
        L_0x0049:
            if (r3 == 0) goto L_0x0052
            r3.setAccessible(r2)     // Catch: all -> 0x0023
            goto L_0x0052
        L_0x004f:
            r7.printStackTrace()
        L_0x0052:
            return r3
        L_0x0053:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "argument is null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.util.ReflectUtils.f(boolean, java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static Method g(boolean z, String str, String str2, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("73506c2c", new Object[]{new Boolean(z), str, str2, clsArr});
        }
        try {
            return f(z, Class.forName(str), str2, clsArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static native Field getDeclaredField(Class<?> cls, String str);

    public static native Method getDeclaredMethod(Class<?> cls, String str, Class<?>[] clsArr);

    private static native void init();

    static {
        t2o.a(822083609);
        f9629a = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                if (TextUtils.isEmpty(zrr.c().loadLibrary("tbuprofen-util"))) {
                    f9629a = true;
                    init();
                }
            } catch (Exception unused) {
            }
        }
    }
}
