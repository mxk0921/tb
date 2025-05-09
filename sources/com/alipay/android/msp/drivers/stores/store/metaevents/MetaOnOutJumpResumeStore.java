package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaOnOutJumpResumeStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaOnOutJumpResumeStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaOnOutJumpResumeStore metaOnOutJumpResumeStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaOnOutJumpResumeStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext == null || this.mContext == null) {
            return null;
        }
        final String[] strArr = new String[1];
        if (mspContext.getMspBasePresenter() != null) {
            this.mMspContext.getMspBasePresenter().setOnOutJumpResumeCallback(new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOnOutJumpResumeStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.base.OnResultReceived
                public void onReceiveResult(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e1927912", new Object[]{this, str});
                        return;
                    }
                    strArr[0] = str;
                    synchronized (MetaOnOutJumpResumeStore.this) {
                        MetaOnOutJumpResumeStore.this.notify();
                    }
                }
            });
        }
        synchronized (this) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return strArr[0];
    }
}
