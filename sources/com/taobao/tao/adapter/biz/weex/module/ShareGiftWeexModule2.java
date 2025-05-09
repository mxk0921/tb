package com.taobao.tao.adapter.biz.weex.module;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import tb.d7x;
import tb.gjp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareGiftWeexModule2 implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772139);
        t2o.a(982515802);
    }

    @WeexMethod(uiThread = true)
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(gjp.a()).sendBroadcast(new Intent("share_receiver_close_share_menu"));
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }
}
