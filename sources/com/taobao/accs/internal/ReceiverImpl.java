package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.IBaseReceiver;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import tb.lef;
import tb.rd0;
import tb.t2o;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ReceiverImpl implements IBaseReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ReceiverImpl";

    static {
        t2o.a(343933136);
        t2o.a(343933010);
    }

    @Override // com.taobao.accs.base.IBaseReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        ALog.d(TAG, "ReceiverImpl onReceive begin......", new Object[0]);
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            intent = new Intent();
        }
        try {
            if (UtilityImpl.getServiceEnabled(context)) {
                intent.setClassName(context.getPackageName(), xd0.channelService);
                lef.f(context.getApplicationContext(), intent);
            } else {
                Process.killProcess(Process.myPid());
            }
            if (UtilityImpl.getAgooServiceEnabled(context)) {
                intent.setClassName(context, rd0.a(context.getPackageName()));
                lef.f(context.getApplicationContext(), intent);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "ReceiverImpl onReceive,exception,e=" + th.getMessage(), new Object[0]);
        }
    }
}
