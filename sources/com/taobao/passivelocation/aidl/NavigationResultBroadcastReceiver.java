package com.taobao.passivelocation.aidl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NavigationResultBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(756023338);
    }

    public static /* synthetic */ Object ipc$super(NavigationResultBroadcastReceiver navigationResultBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/aidl/NavigationResultBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (NaviConstants.LOCATION_RESULT_ACTION.equals(intent.getAction()) && (extras = intent.getExtras()) != null) {
            LocationServiceManager.sLocationDTO = (LocationDTO) extras.getParcelable(NaviConstants.LOCATION_RESULT_KEY_OBJ);
        }
    }
}
