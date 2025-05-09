package com.taobao.wireless.link.pop.recevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import tb.irg;
import tb.t2o;
import tb.xfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsConnectReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750330);
    }

    public static /* synthetic */ Object ipc$super(AccsConnectReceiver accsConnectReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/pop/recevier/AccsConnectReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getExtras().get(Constants.KEY_CONNECT_INFO);
        irg.a("link_tag", "AccsConnectReceiver === onReceive == accs建连消息返回：" + connectInfo);
        if (connectInfo == null || !connectInfo.connected) {
            irg.a("link_tag", "AccsConnectReceiver === onReceive == accs断开连接了，connectInfo=" + connectInfo);
            return;
        }
        irg.a("link_tag", "AccsConnectReceiver === onReceive == accs建连成功，开始检测是否有可展示的pop消息");
        xfm.c().g(context, 1);
    }
}
