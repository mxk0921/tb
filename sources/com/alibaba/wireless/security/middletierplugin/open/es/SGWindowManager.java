package com.alibaba.wireless.security.middletierplugin.open.es;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.lang.reflect.Field;
import java.util.ArrayList;
import tb.pg1;

/* loaded from: classes.dex */
public class SGWindowManager {

    /* renamed from: а  reason: contains not printable characters */
    private static ISecurityGuardPlugin f66;

    /* renamed from: б  reason: contains not printable characters */
    private static Handler f67;

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.es.SGWindowManager$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0119 extends ArrayList {

        /* renamed from: com.alibaba.wireless.security.middletierplugin.open.es.SGWindowManager$а$а  reason: contains not printable characters */
        /* loaded from: classes.dex */
        class RunnableC0120 implements Runnable {

            /* renamed from: а  reason: contains not printable characters */
            final /* synthetic */ String f68;

            RunnableC0120(String str) {
                this.f68 = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    SGWindowManager.f66.getRouter().doCommand(70602, this.f68);
                } catch (Exception unused) {
                }
            }
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            try {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(SystemClock.elapsedRealtime());
                if (stackTrace.length >= 5) {
                    for (int i = 5; i < 8; i++) {
                        stringBuffer.append("@" + i + "^" + stackTrace[i].getClassName() + "^" + stackTrace[i].getMethodName());
                    }
                }
                String stringBuffer2 = stringBuffer.toString();
                if (SGWindowManager.f67 == null) {
                    HandlerThread handlerThread = new HandlerThread("SWM");
                    handlerThread.start();
                    Handler unused = SGWindowManager.f67 = new Handler(handlerThread.getLooper());
                }
                if (SGWindowManager.f67 != null) {
                    SGWindowManager.f67.post(new RunnableC0120(stringBuffer2));
                }
            } catch (Throwable th) {
                SGWindowManager.m73("ERROR:" + th.toString());
                String pluginVersion = FCComponent.getPluginVersion();
                UserTrackMethodJniBridge.addUtRecord("125", 0, 7, pluginVersion, 0L, "SGWindowManagerError IndexOf:" + th.toString(), th.getMessage(), th.getStackTrace().toString(), null, null);
            }
            return super.indexOf(obj);
        }
    }

    public static void init(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f66 = iSecurityGuardPlugin;
    }

    public static boolean windowMangerInit(Context context) {
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
            if (windowManager == null) {
                return false;
            }
            Field declaredField = Class.forName("android.view.WindowManagerGlobal").getDeclaredField("mViews");
            declaredField.setAccessible(true);
            Field declaredField2 = Class.forName("android.view.WindowManagerImpl").getDeclaredField("mGlobal");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(windowManager);
            ArrayList arrayList = (ArrayList) declaredField.get(obj);
            C0119 r4 = new C0119();
            for (int i = 0; arrayList != null && i < arrayList.size(); i++) {
                r4.add((View) arrayList.get(i));
            }
            declaredField.set(obj, r4);
            m73("init SGWindowManger succeed");
            return true;
        } catch (Throwable th) {
            m73("ERROR:" + th.toString());
            String pluginVersion = FCComponent.getPluginVersion();
            UserTrackMethodJniBridge.addUtRecord("125", 0, 7, pluginVersion, 0L, "SGWindowManagerError init:" + th.toString(), th.getMessage(), th.getStackTrace().toString(), null, null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: а  reason: contains not printable characters */
    public static void m73(String str) {
    }
}
