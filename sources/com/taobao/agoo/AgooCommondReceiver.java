package com.taobao.agoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import tb.brt;
import tb.lef;
import tb.rd0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AgooCommondReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933266);
    }

    public static /* synthetic */ Object ipc$super(AgooCommondReceiver agooCommondReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/AgooCommondReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else {
            brt.b(new Runnable() { // from class: com.taobao.agoo.AgooCommondReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String a2 = rd0.a(context.getPackageName());
                        intent.setFlags(0);
                        intent.setClassName(context, a2);
                        lef.f(context, intent);
                    } catch (Throwable th) {
                        ALog.e("AgooCommondReceiver", "onReceive error", th, new Object[0]);
                    }
                }
            });
        }
    }
}
