package com.alipay.mobile.verifyidentity.injector;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StartActivityInjectorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static StartActivityInjector f4298a;

    public static boolean injectorHandled(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b30190b0", new Object[]{intent})).booleanValue();
        }
        StartActivityInjector startActivityInjector = f4298a;
        if (startActivityInjector != null) {
            return startActivityInjector.startActivity(intent);
        }
        return false;
    }

    public static void setStartActivityInjector(StartActivityInjector startActivityInjector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3788ed6b", new Object[]{startActivityInjector});
        } else {
            f4298a = startActivityInjector;
        }
    }
}
