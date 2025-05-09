package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class eng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f18696a = new AtomicBoolean(false);
    public static final Object b = new Object();

    public static void a() {
        if (!f18696a.get()) {
            try {
                pgh.b("LIB", "Birdnest version: a1c03ca4-clean");
            } catch (Throwable th) {
                pgh.c("LIB", "Birdnest cannot print version info", th);
            }
            try {
                pgh.b("LIB", "Before load so flybird");
                synchronized (b) {
                    AtomicBoolean atomicBoolean = f18696a;
                    if (!atomicBoolean.get()) {
                        System.loadLibrary("flybird");
                        atomicBoolean.set(true);
                        pgh.b("LIB", "After load so flybird");
                    }
                }
            } catch (Throwable th2) {
                try {
                    pgh.b("LIB", "Before load so w utils flybird");
                    Method method = Class.forName("com.alipay.mobile.common.utils.load.LibraryLoadUtils").getMethod("loadLibrary", String.class, Boolean.TYPE);
                    synchronized (b) {
                        AtomicBoolean atomicBoolean2 = f18696a;
                        if (!atomicBoolean2.get()) {
                            method.invoke(null, "flybird", Boolean.FALSE);
                            atomicBoolean2.set(true);
                            pgh.b("LIB", "After load so w utils flybird");
                        }
                    }
                } catch (Throwable th3) {
                    pgh.c("LIB", "Failed to load flybird so: ", th3);
                    pgh.c("LIB", "Failed to load flybird so, caused by: ", th2);
                    pgh.m(th3, "failed to load so flybird");
                }
            }
        }
    }
}
