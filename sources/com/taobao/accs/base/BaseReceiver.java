package com.taobao.accs.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.internal.ReceiverImpl;
import com.taobao.accs.utl.ALog;
import tb.brt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BaseReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = BaseReceiver.class.getSimpleName();
    private IBaseReceiver baseReceiver;

    static {
        t2o.a(343933003);
    }

    public static /* synthetic */ IBaseReceiver access$000(BaseReceiver baseReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBaseReceiver) ipChange.ipc$dispatch("8dcb035a", new Object[]{baseReceiver});
        }
        return baseReceiver.baseReceiver;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ Object ipc$super(BaseReceiver baseReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/base/BaseReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if (this.baseReceiver == null) {
                this.baseReceiver = new ReceiverImpl();
            }
            brt.b(new Runnable() { // from class: com.taobao.accs.base.BaseReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BaseReceiver.access$000(BaseReceiver.this).onReceive(context, intent);
                    } catch (Exception e) {
                        ALog.e(BaseReceiver.access$100(), "onReceive error", e, new Object[0]);
                    }
                }
            });
        } catch (Exception e) {
            ALog.e(TAG, "build ReceiverImpl error", e, new Object[0]);
        }
    }
}
