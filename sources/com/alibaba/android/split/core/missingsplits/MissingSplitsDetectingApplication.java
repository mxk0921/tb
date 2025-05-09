package com.alibaba.android.split.core.missingsplits;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.yvi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MissingSplitsDetectingApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean onCreateCalled = false;

    static {
        t2o.a(677380183);
    }

    public static /* synthetic */ Object ipc$super(MissingSplitsDetectingApplication missingSplitsDetectingApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/missingsplits/MissingSplitsDetectingApplication");
    }

    @Override // android.app.Application
    public final void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (!this.onCreateCalled) {
            this.onCreateCalled = true;
            if (!yvi.a(this).a()) {
                super.onCreate();
                onCreateCustom();
            }
        } else {
            throw new IllegalStateException("The onCreate method must be invoked at most once.");
        }
    }

    public void onCreateCustom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0791593", new Object[]{this});
        }
    }
}
