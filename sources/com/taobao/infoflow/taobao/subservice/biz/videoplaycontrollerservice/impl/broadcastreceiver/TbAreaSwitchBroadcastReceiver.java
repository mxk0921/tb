package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a18;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TbAreaSwitchBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782759);
    }

    public static /* synthetic */ Object ipc$super(TbAreaSwitchBroadcastReceiver tbAreaSwitchBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/videoplaycontrollerservice/impl/broadcastreceiver/TbAreaSwitchBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && intent.getAction() != null) {
            String action = intent.getAction();
            fve.e("TbAreaSwitchBroadcastReceiver", "areaChangeReceiver : " + action);
            if (TextUtils.equals(action, "EDITON_SWITCHER_EDITTION_CODE_CHANGED")) {
                a18.e().d();
            }
        }
    }
}
