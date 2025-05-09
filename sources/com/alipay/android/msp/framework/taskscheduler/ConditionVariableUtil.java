package com.alipay.android.msp.framework.taskscheduler;

import android.os.ConditionVariable;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConditionVariableUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean run(long j, final Runnable runnable) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db0264f4", new Object[]{new Long(j), runnable})).booleanValue();
        }
        if (runnable == null) {
            return false;
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.taskscheduler.ConditionVariableUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    runnable.run();
                } finally {
                    conditionVariable.open();
                }
            }
        });
        try {
            if (j <= 0) {
                conditionVariable.block();
            } else {
                z = conditionVariable.block(j);
            }
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "concurrent", "ConditionVariableEx", th);
        }
        return z;
    }
}
