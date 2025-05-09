package com.taobao.login4android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.utils.NetworkUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.constants.LoginStatus;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class StatusReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.status";
    private long mLastHandleTime;

    public static /* synthetic */ Object ipc$super(StatusReceiver statusReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/receiver/StatusReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || (System.currentTimeMillis() - this.mLastHandleTime >= 1000 && NetworkUtil.isNetworkConnected())) {
                if (LoginStatus.isUserLogin() || TextUtils.isEmpty(Login.getLoginToken())) {
                    this.mLastHandleTime = System.currentTimeMillis();
                    NetworkUtil.preFecth("networkConnected");
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
