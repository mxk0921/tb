package com.alipay.android.msp.drivers.stores.store.events;

import android.content.Context;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OpenWebStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OpenWebStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspContext access$000(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("ceb90864", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$100(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("a882d5a5", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ StEvent access$1000(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("11ad483a", new Object[]{openWebStore});
        }
        return openWebStore.mStEvent;
    }

    public static /* synthetic */ StEvent access$1100(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("1a48cc99", new Object[]{openWebStore});
        }
        return openWebStore.mStEvent;
    }

    public static /* synthetic */ MspContext access$1200(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("7c45de15", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1300(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("560fab56", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1400(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("2fd97897", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1500(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("9a345d8", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1600(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("e36d1319", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1700(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("bd36e05a", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1800(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("9700ad9b", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1900(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("70ca7adc", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$200(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("824ca2e6", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$300(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("5c167027", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$400(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("35e03d68", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ int access$500(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ef81af6", new Object[]{openWebStore})).intValue();
        }
        return openWebStore.mBizId;
    }

    public static /* synthetic */ Context access$600(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8c3628da", new Object[]{openWebStore});
        }
        return openWebStore.mContext;
    }

    public static /* synthetic */ int access$700(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("938d84b4", new Object[]{openWebStore})).intValue();
        }
        return openWebStore.mBizId;
    }

    public static /* synthetic */ MspContext access$800(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("9d07726c", new Object[]{openWebStore});
        }
        return openWebStore.mMspContext;
    }

    public static /* synthetic */ StEvent access$900(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("74e4660", new Object[]{openWebStore});
        }
        return openWebStore.mStEvent;
    }

    public static /* synthetic */ Object ipc$super(OpenWebStore openWebStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/OpenWebStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, final EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null) {
            return "";
        }
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenWebStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:100:0x02c8  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x02d4  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x02d7  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x02eb  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x028a  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x02c5  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 1239
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.OpenWebStore.AnonymousClass1.run():void");
            }
        });
        return "";
    }
}
