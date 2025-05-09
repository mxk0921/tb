package com.alibaba.poplayer.trigger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.poplayer.trigger.TriggerBroadcastReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hst;
import tb.t2o;
import tb.ufu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TriggerBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ufu f2534a;

    static {
        t2o.a(626000024);
    }

    public TriggerBroadcastReceiver(ufu ufuVar) {
        this.f2534a = ufuVar;
    }

    public static /* synthetic */ Object ipc$super(TriggerBroadcastReceiver triggerBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/trigger/TriggerBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            hst.b(new Runnable() { // from class: tb.vfu
                @Override // java.lang.Runnable
                public final void run() {
                    TriggerBroadcastReceiver.this.b(intent);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:6:0x001b, B:9:0x0026, B:16:0x004e, B:21:0x005b, B:24:0x0065, B:32:0x007a, B:33:0x00bf, B:34:0x00dc), top: B:37:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.trigger.TriggerBroadcastReceiver.b(android.content.Intent):void");
    }
}
