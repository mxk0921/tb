package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class QueryAccountsStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public QueryAccountsStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(QueryAccountsStore queryAccountsStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/QueryAccountsStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null || this.mMspUIClient.getCurrentPresenter().getIView() == null) {
            return null;
        }
        ListIterator<Object> listIterator = mspEvent.getActionParamsJson().getJSONArray("uids").listIterator();
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasNext()) {
            arrayList.add((String) listIterator.next());
        }
        String queryExistingAccounts = PhoneCashierMspEngine.getMspWallet().queryExistingAccounts(arrayList);
        return TextUtils.isEmpty(queryExistingAccounts) ? "{}" : queryExistingAccounts;
    }
}
