package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.cache.MspCacheManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CacheStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFY_TPL_NAME = "LOC_CACHE";

    /* renamed from: a  reason: collision with root package name */
    public final MspCacheManager f3572a;

    public CacheStore(int i) {
        super(i);
        MspCacheManager instance = MspCacheManager.getInstance();
        this.f3572a = instance;
        instance.setTwoLevelCache(true);
    }

    public static /* synthetic */ Object ipc$super(CacheStore cacheStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/CacheStore");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r19, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r20) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.CacheStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
