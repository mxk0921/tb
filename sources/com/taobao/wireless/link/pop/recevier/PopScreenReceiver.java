package com.taobao.wireless.link.pop.recevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.irg;
import tb.t2o;
import tb.xfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopScreenReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750331);
    }

    public static /* synthetic */ Object ipc$super(PopScreenReceiver popScreenReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/pop/recevier/PopScreenReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (!TextUtils.isEmpty(intent.getAction())) {
            irg.a("link_tag", "PopScreenReceiver === onReceive == 手机解锁，开始检测是否有可展示的pop消息");
            xfm.c().g(context, 3);
        }
    }
}
