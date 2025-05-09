package com.alibaba.android.ultron.common;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nll;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronCommonApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092097);
    }

    public static /* synthetic */ Object ipc$super(UltronCommonApplication ultronCommonApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/common/UltronCommonApplication");
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        nll.e(getApplicationContext(), true);
    }
}
