package com.flybird.support.basics;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AppContextHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f5004a;
    public static boolean b;

    public static void _feedForTools(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3301c752", new Object[]{context});
        } else if (context != null) {
            f5004a = context.getApplicationContext();
            b = true;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return b;
    }

    public static void feedAppContext(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db68815", new Object[]{context});
        } else if (f5004a == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f5004a = applicationContext;
            try {
                if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                b = z;
            } catch (Throwable unused) {
            }
        }
    }
}
