package com.uc.webview.base.cyclone;

import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14264a;

    static {
        int i;
        Object th;
        try {
            System.loadLibrary("cycloneuc");
            th = null;
            i = -1000;
        } catch (NullPointerException e) {
            th = e;
            i = -1004;
        } catch (SecurityException e2) {
            th = e2;
            i = -1002;
        } catch (UnsatisfiedLinkError e3) {
            th = e3;
            i = -1003;
        } catch (Throwable th2) {
            th = th2;
            i = -1001;
        }
        if (th != null) {
            Log.e("ucbs.cyclone", "load libcycloneuc.so exception: " + th);
        }
        f14264a = i;
    }
}
