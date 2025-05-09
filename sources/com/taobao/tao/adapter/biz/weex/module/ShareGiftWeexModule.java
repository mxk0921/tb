package com.taobao.tao.adapter.biz.weex.module;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import tb.gjp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareGiftWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772138);
    }

    public static /* synthetic */ Object ipc$super(ShareGiftWeexModule shareGiftWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/adapter/biz/weex/module/ShareGiftWeexModule");
    }

    @WXModuleAnno
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(gjp.a()).sendBroadcast(new Intent("share_receiver_close_share_menu"));
        }
    }
}
