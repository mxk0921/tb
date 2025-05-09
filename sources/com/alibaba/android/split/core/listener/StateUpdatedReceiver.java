package com.alibaba.android.split.core.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hjq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class StateUpdatedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hjq f2234a;

    static {
        t2o.a(677380180);
    }

    public StateUpdatedReceiver(hjq hjqVar) {
        this.f2234a = hjqVar;
    }

    public static /* synthetic */ Object ipc$super(StateUpdatedReceiver stateUpdatedReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/listener/StateUpdatedReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            Log.e("StateUpdatedReceiver", "triggered_from_app_after_verification success");
        }
        this.f2234a.d(context, intent);
    }
}
