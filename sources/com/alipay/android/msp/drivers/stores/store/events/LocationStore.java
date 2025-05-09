package com.alipay.android.msp.drivers.stores.store.events;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UserLocation;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LocationStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LocationStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(LocationStore locationStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/LocationStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null) {
            return null;
        }
        MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
        if (currentPresenter.getIView() == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        int i = 60;
        if (actionParamsJson != null) {
            try {
                int intValue = actionParamsJson.getIntValue("timeout");
                if (intValue != 0) {
                    i = intValue;
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        LogUtil.record(1, "LocationStore:queryLocation", "Max timeout=".concat(String.valueOf(i)));
        if (currentPresenter.getIView() != null) {
            context = currentPresenter.getActivity();
        } else {
            context = GlobalHelper.getInstance().getContext();
        }
        UserLocation.locationInit(context, Utils.shouldGetLocationInfo(GlobalHelper.getInstance().getContext()));
        boolean isLocationSuccess = UserLocation.isLocationSuccess();
        long locationMilliSinceNow = UserLocation.locationMilliSinceNow();
        String str = "{}";
        if (!isLocationSuccess || locationMilliSinceNow > i) {
            LogUtil.record(1, "LocationStore:queryLocation", "Failed, locationSucc=" + isLocationSuccess + ", locationTimeout=" + locationMilliSinceNow);
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Locale locale = Locale.CHINA;
            jSONObject.put("longitude", (Object) String.format(locale, "%.6f", Double.valueOf(UserLocation.getLongitude())));
            jSONObject.put("latitude", (Object) String.format(locale, "%.6f", Double.valueOf(UserLocation.getLatitude())));
            jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, (Object) String.format(locale, "%.6f", Double.valueOf(UserLocation.getAccuracy())));
            str = jSONObject.toJSONString();
            LogUtil.record(1, "LocationStore:queryLocation", "Success, res=".concat(String.valueOf(str)));
            return str;
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
            return str;
        }
    }
}
