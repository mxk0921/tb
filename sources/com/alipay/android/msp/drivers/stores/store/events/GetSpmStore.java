package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.phone.wallet.spmtracker.SpmTracker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pl4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GetSpmStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public GetSpmStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(GetSpmStore getSpmStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/GetSpmStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null || this.mContext == null || (currentPresenter = this.mMspUIClient.getCurrentPresenter()) == null || currentPresenter.getIView() == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String miniPageId = SpmTracker.getMiniPageId(currentPresenter.getActivity());
            String pageId = SpmTracker.getPageId(currentPresenter.getActivity());
            String srcSpm = SpmTracker.getSrcSpm(currentPresenter.getActivity());
            if (!TextUtils.isEmpty(miniPageId)) {
                jSONObject.put("miniPageId", (Object) miniPageId);
            }
            if (!TextUtils.isEmpty(pageId)) {
                jSONObject.put(pl4.KEY_PAGE_ID, (Object) pageId);
            }
            if (!TextUtils.isEmpty(srcSpm)) {
                jSONObject.put("srcSpm", (Object) srcSpm);
            }
            return jSONObject.toJSONString();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "{}";
        }
    }
}
