package com.taobao.android.tschedule.protocol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import tb.cns;
import tb.zdh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MultiProcessor$1 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MultiProcessor$1 multiProcessor$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/protocol/MultiProcessor$1");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            zdh.a("TS.MultiProcessor", "onReceive, action=" + action + ", process=" + cns.d());
            action.hashCode();
            if (action.equals("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE")) {
                TScheduleInitialize.e().h();
            }
        }
    }
}
