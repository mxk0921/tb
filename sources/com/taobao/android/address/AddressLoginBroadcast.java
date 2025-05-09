package com.taobao.android.address;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.ff0;
import tb.rf0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddressLoginBroadcast extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AddressLoginBroadcast addressLoginBroadcast, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/AddressLoginBroadcast");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (TextUtils.equals(intent.getAction(), LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
            AdapterForTLog.loge(ff0.TAG, "login suc, address prefetch");
            rf0.A();
            context.unregisterReceiver(this);
        }
    }
}
