package com.taobao.walle.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CppApiBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile CppApiBridge f14102a;

    static {
        t2o.a(1034944577);
    }

    public static CppApiBridge b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CppApiBridge) ipChange.ipc$dispatch("6c04e254", new Object[0]);
        }
        synchronized (CppApiBridge.class) {
            try {
                if (f14102a == null) {
                    synchronized (CppApiBridge.class) {
                        if (f14102a == null) {
                            f14102a = new CppApiBridge();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14102a;
    }

    public static native void nativeCall(String str, Map<String, String> map);

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f855536", new Object[]{this, str, map});
        } else {
            nativeCall(str, map);
        }
    }
}
