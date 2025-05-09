package com.alipay.mobile.intelligentdecision.manager;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JsV8Manager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile JsV8Manager f4253a;

    public static JsV8Manager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsV8Manager) ipChange.ipc$dispatch("b76449ab", new Object[0]);
        }
        if (f4253a == null) {
            synchronized (JsV8Manager.class) {
                try {
                    if (f4253a == null) {
                        f4253a = new JsV8Manager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4253a;
    }

    public static Object a(String str, FBDocument.Duktape duktape) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ba6cb51", new Object[]{str, duktape});
        }
        if (duktape != null) {
            return duktape.evaluate(str);
        }
        return null;
    }

    public static void a(FBDocument.Duktape duktape) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c3b637", new Object[]{duktape});
        } else if (duktape != null) {
            try {
                duktape.close();
            } catch (Throwable unused) {
            }
        }
    }
}
