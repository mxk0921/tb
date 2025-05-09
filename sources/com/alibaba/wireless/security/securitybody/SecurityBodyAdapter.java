package com.alibaba.wireless.security.securitybody;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.reflect.Method;
import tb.m09;

@TargetApi(9)
/* loaded from: classes.dex */
public class SecurityBodyAdapter {

    /* renamed from: а  reason: contains not printable characters */
    private static String f391 = "SecurityBodyAdapter";

    /* renamed from: б  reason: contains not printable characters */
    private static final int f392 = 0;

    /* renamed from: в  reason: contains not printable characters */
    private static final int f393 = 1;

    /* renamed from: г  reason: contains not printable characters */
    private static final int f394 = 2;

    /* renamed from: д  reason: contains not printable characters */
    private static final int f395 = 3;

    /* renamed from: е  reason: contains not printable characters */
    private static final int f396 = 4;

    /* renamed from: ж  reason: contains not printable characters */
    private static final int f397 = 6;

    /* renamed from: з  reason: contains not printable characters */
    private static final int f398 = 8;

    /* renamed from: и  reason: contains not printable characters */
    private static final int f399 = 9;

    /* renamed from: й  reason: contains not printable characters */
    private static final int f400 = 10;

    /* renamed from: к  reason: contains not printable characters */
    private static final int f401 = 11;

    /* renamed from: л  reason: contains not printable characters */
    private static final int f402 = 12;

    /* renamed from: м  reason: contains not printable characters */
    private static final int f403 = 13;

    /* renamed from: н  reason: contains not printable characters */
    private static Context f404 = null;

    /* renamed from: о  reason: contains not printable characters */
    private static Object f405 = null;

    /* renamed from: п  reason: contains not printable characters */
    private static volatile boolean f406 = false;

    /* renamed from: р  reason: contains not printable characters */
    private static long f407 = 0;

    /* renamed from: с  reason: contains not printable characters */
    private static final int f408 = 1;

    /* renamed from: т  reason: contains not printable characters */
    private static final int f409 = 2;

    /* renamed from: у  reason: contains not printable characters */
    private static String f410 = null;

    /* renamed from: ф  reason: contains not printable characters */
    private static boolean f411 = false;

    /* renamed from: х  reason: contains not printable characters */
    private static Class f412 = null;

    /* renamed from: ц  reason: contains not printable characters */
    private static Method f413 = null;

    /* renamed from: ё  reason: contains not printable characters */
    private static final int f414 = 5;

    public static String doAdapter(int i) {
        if (!f406) {
            synchronized (f405) {
                if (!f406) {
                    C0184.m266(f404);
                    C0185.m268(f404);
                    try {
                        Class<?> cls = Class.forName("mtopsdk.mtop.global.SDKUtils");
                        f412 = cls;
                        f413 = cls.getMethod("getCorrectionTime", new Class[0]);
                    } catch (Exception unused) {
                    }
                    f406 = true;
                }
            }
        }
        if (i == 6) {
            return m246();
        }
        if (i == 8) {
            return m245();
        }
        if (i != 10) {
            return null;
        }
        return m247();
    }

    public static void initialize(Context context) {
        f404 = context;
        f405 = new Object();
    }

    /* renamed from: а  reason: contains not printable characters */
    private static String m245() {
        m248(1);
        return f411 ? "1" : "0";
    }

    /* renamed from: б  reason: contains not printable characters */
    private static String m246() {
        m248(1);
        String str = f410;
        return str == null ? "-1" : str;
    }

    /* renamed from: в  reason: contains not printable characters */
    private static String m247() {
        Context context = f404;
        if (context == null) {
            return "0";
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_STATE");
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        return (registerReceiver == null || !registerReceiver.getBooleanExtra("connected", false)) ? "0" : "1";
    }

    /* renamed from: г  reason: contains not printable characters */
    private static synchronized void m248(int i) {
        Intent registerReceiver;
        synchronized (SecurityBodyAdapter.class) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = true;
                if (f407 == 0 || currentTimeMillis - f407 >= 10000 || ((i != 1 || f410 == null) && i != 2)) {
                    f407 = currentTimeMillis;
                    Context context = f404;
                    if (!(context == null || (registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null)) {
                        f410 = registerReceiver.getIntExtra(m09.TASK_TYPE_LEVEL, -1) + "";
                        int intExtra = registerReceiver.getIntExtra("status", 1);
                        if (!(intExtra == 2 || intExtra == 5)) {
                            z = false;
                        }
                        f411 = z;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
