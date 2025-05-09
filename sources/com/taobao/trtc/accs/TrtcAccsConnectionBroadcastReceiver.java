package com.taobao.trtc.accs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.trtc.utils.TrtcLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcAccsConnectionBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONNECTION_OFF = -1;
    public static final int CONNECTION_ON = 1;
    public static final int CONNECTION_UNKNOWN = 0;

    static {
        t2o.a(395313336);
    }

    public static /* synthetic */ Object ipc$super(TrtcAccsConnectionBroadcastReceiver trtcAccsConnectionBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/accs/TrtcAccsConnectionBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        intent.getAction();
        TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getSerializableExtra(Constants.KEY_CONNECT_INFO);
        if (connectInfo != null && !TextUtils.isEmpty(connectInfo.host)) {
            TrtcLog.h("AccsConnectionBroadcastReceiver", "onReceive: " + connectInfo.host);
            if (connectInfo.host.equals("https://msgacs.m.taobao.com") || connectInfo.host.equals("https://msgacs.wapa.taobao.com")) {
                TrtcLog.h("AccsConnectionBroadcastReceiver", "ACCS CONNECT INFO: " + connectInfo.connected);
                if (!connectInfo.connected) {
                    TrtcLog.h("AccsConnectionBroadcastReceiver", "ACCS CONNECT ERROR DETAIL: " + connectInfo.errordetail);
                }
            }
        }
    }
}
