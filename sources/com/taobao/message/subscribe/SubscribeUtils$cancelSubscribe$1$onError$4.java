package com.taobao.message.subscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SubscribeUtils$cancelSubscribe$1$onError$4 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SubscribeUtils$cancelSubscribe$1$onError$4 INSTANCE = new SubscribeUtils$cancelSubscribe$1$onError$4();

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            TBToast.makeText(Globals.getApplication(), Constants.DEFAULT_TOAST).show();
        }
    }
}
