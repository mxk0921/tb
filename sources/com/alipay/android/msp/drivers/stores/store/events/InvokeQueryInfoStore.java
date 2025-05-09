package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class InvokeQueryInfoStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeQueryInfoStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(InvokeQueryInfoStore invokeQueryInfoStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/InvokeQueryInfoStore");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r4.equals("configJSONInfo") == false) goto L_0x0047;
     */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r13, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.InvokeQueryInfoStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
