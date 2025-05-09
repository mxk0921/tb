package com.taobao.accs.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import tb.c71;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ACCSExceptionsReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933129);
    }

    public static /* synthetic */ Object ipc$super(ACCSExceptionsReceiver aCCSExceptionsReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/internal/ACCSExceptionsReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (intent == null) {
            action = "";
        } else {
            try {
                action = intent.getAction();
            } catch (Throwable th) {
                ALog.e("ACCSExceptionsReceiver", "onReceive err", th, new Object[0]);
                return;
            }
        }
        c71.c("accs", BaseMonitor.COUNT_EXCEPTIONS_RECEIVER, action, vu3.b.GEO_NOT_SUPPORT);
    }
}
