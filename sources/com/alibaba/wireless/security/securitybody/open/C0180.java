package com.alibaba.wireless.security.securitybody.open;

import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.securitybody.C0190;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.alibaba.wireless.security.securitybody.open.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0180 {

    /* renamed from: б  reason: contains not printable characters */
    private static volatile Object f439 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static C0180 f440 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static ISecurityGuardPlugin f441 = null;

    /* renamed from: д  reason: contains not printable characters */
    private static final String f442 = "onPageStart";

    /* renamed from: е  reason: contains not printable characters */
    private static final String f443 = "onPageDestroy";

    /* renamed from: ж  reason: contains not printable characters */
    private static final String f444 = "addScrollEvent";

    /* renamed from: з  reason: contains not printable characters */
    private static final String f445 = "addKeyEvent";

    /* renamed from: и  reason: contains not printable characters */
    private static InvocationHandler f446 = new C0181();

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f447 = "addTouchEvent";

    /* renamed from: а  reason: contains not printable characters */
    public final String f448 = "PageTrackLog";

    /* renamed from: com.alibaba.wireless.security.securitybody.open.в$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0181 implements InvocationHandler {
        C0181() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            String str = (String) objArr[0];
            if (name.equals(C0180.f442)) {
                C0180.f440.m265(str);
                return null;
            } else if (name.equals(C0180.f443)) {
                C0180.f440.m264(str);
                return null;
            } else if (name.equals(C0180.f447)) {
                C0180.f440.m263(str, (MotionEvent) objArr[1]);
                return null;
            } else if (name.equals(C0180.f444)) {
                C0180.f440.m262(str, ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue());
                return null;
            } else if (!name.equals(C0180.f445)) {
                return null;
            } else {
                C0180.f440.m261(str, (KeyEvent) objArr[1]);
                return null;
            }
        }
    }

    /* renamed from: д  reason: contains not printable characters */
    public static Object m260(Class cls, ISecurityGuardPlugin iSecurityGuardPlugin) {
        if (f439 == null) {
            synchronized (C0180.class) {
                if (f439 == null) {
                    f439 = C0190.m301(cls, f446);
                    f440 = new C0180();
                    f441 = iSecurityGuardPlugin;
                }
            }
        }
        return f439;
    }

    /* renamed from: б  reason: contains not printable characters */
    void m261(String str, KeyEvent keyEvent) throws SecException {
        Log.d("PageTrackLog", "come into addKeyEvent");
        if (str != null) {
            Log.d("PageTrackLog", "pageID=" + str);
            Log.d("PageTrackLog", keyEvent.toString());
            f441.getRouter().doCommand(20401, str, 3);
        }
        Log.d("PageTrackLog", "finish addKeyEvent");
    }

    /* renamed from: в  reason: contains not printable characters */
    void m262(String str, int i, int i2, int i3, int i4) throws SecException {
        Log.d("PageTrackLog", "come into addScrollEvent--Scroll");
        if (str != null) {
            Log.d("PageTrackLog", "pageID=" + str);
            Log.d("PageTrackLog", String.format("after scroll x=%d y=%d, before scroll x=%d y=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            f441.getRouter().doCommand(20401, str, 2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        Log.d("PageTrackLog", "finish addScrollEvent--Scroll");
    }

    /* renamed from: г  reason: contains not printable characters */
    void m263(String str, MotionEvent motionEvent) throws SecException {
        Log.d("PageTrackLog", "come into addTouchEvent--Touch");
        if (str != null) {
            Log.d("PageTrackLog", "pageID=" + str);
            Log.d("PageTrackLog", String.format("x=%d, y=%d, rawX=%d, rawY=%d", Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()), Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY())));
            f441.getRouter().doCommand(20401, str, 1, Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()), Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()));
        }
        Log.d("PageTrackLog", "finish addTouchEvent--Touch");
    }

    /* renamed from: е  reason: contains not printable characters */
    void m264(String str) throws SecException {
        Log.d("PageTrackLog", "come into onPageDestroy");
        if (str != null) {
            Log.d("PageTrackLog", "pageID=" + str);
            f441.getRouter().doCommand(20401, str, 4);
        }
        Log.d("PageTrackLog", "finish onPageDestroy");
    }

    /* renamed from: ё  reason: contains not printable characters */
    void m265(String str) throws SecException {
        Log.d("PageTrackLog", "come into onPageStart");
        if (str != null) {
            Log.d("PageTrackLog", "pageID=" + str);
            f441.getRouter().doCommand(20401, str, 0);
        }
        Log.d("PageTrackLog", "finish onPageStart");
    }
}
