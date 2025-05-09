package com.alipay.mobile.common.transportext.biz.sync;

import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SyncDataListanerImpl extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile SyncDataListanerImpl g;

    public static SyncDataListanerImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SyncDataListanerImpl) ipChange.ipc$dispatch("12494217", new Object[0]);
        }
        LogUtilAmnet.d("amnet_SyncDataListanerImpl", "SyncDataListanerImpl: getInstance ");
        if (g == null) {
            synchronized (SyncDataListanerImpl.class) {
                g = new SyncDataListanerImpl();
            }
        }
        return g;
    }

    public static /* synthetic */ Object ipc$super(SyncDataListanerImpl syncDataListanerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/sync/SyncDataListanerImpl");
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void onAcceptedDataEvent(AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
            return;
        }
        LogUtilAmnet.d("amnet_SyncDataListanerImpl", "onAcceptedDataEvent: ");
        SyncManager.onAcceptedDataEvent(acceptedData);
    }
}
