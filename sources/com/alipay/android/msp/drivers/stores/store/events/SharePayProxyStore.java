package com.alipay.android.msp.drivers.stores.store.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.substitute.api.Constants;
import com.alipay.android.app.substitute.api.ExternalSocialPluginManager;
import com.alipay.android.app.substitute.api.IExternalSocialPlugin;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SharePayProxyStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SharePayProxyStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(SharePayProxyStore sharePayProxyStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SharePayProxyStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (TextUtils.equals(actionParamsJson.getString("type"), "getList")) {
            final String string = actionParamsJson.getString("notifyName");
            IExternalSocialPlugin socialPlugin = ExternalSocialPluginManager.getInstance().getSocialPlugin();
            if (socialPlugin == null) {
                LogUtil.record(1, "SharePayProxy", "process", "socialPlugin not register");
            } else if (this.mMspTradeContext != null) {
                Bundle bundle = new Bundle();
                bundle.putString(Constants.BUNDLE_KEY_TRADE_NO, a(this.mMspTradeContext.getOrderInfo()));
                socialPlugin.getLatestFriendList(this.mContext, bundle, new IExternalSocialPlugin.IFriendListCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.SharePayProxyStore.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.app.substitute.api.IExternalSocialPlugin.IFriendListCallback
                    public void onResult(Bundle[] bundleArr, Bundle bundle2) {
                        int i = 0;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9345792", new Object[]{this, bundleArr, bundle2});
                            return;
                        }
                        if (bundle2 != null) {
                            i = bundle2.getInt("errorCode", 0);
                        }
                        LogUtil.record(1, "SharePay", "externalSocialPlugin.getLatestFriendList errCode:".concat(String.valueOf(i)));
                        if (i == 0 && bundleArr != null) {
                            SharePayProxyStore.access$000(SharePayProxyStore.this, string, bundleArr, bundle2);
                        }
                    }
                });
            }
        }
        return null;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f5a9d22", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length == 2 && "trade_no".equalsIgnoreCase(split[0])) {
                return split[1].replace("\"", "");
            }
        }
        return null;
    }

    public static /* synthetic */ void access$000(SharePayProxyStore sharePayProxyStore, String str, Bundle[] bundleArr, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a752bd48", new Object[]{sharePayProxyStore, str, bundleArr, bundle});
        } else if (bundleArr != null) {
            JSONArray jSONArray = new JSONArray();
            for (Bundle bundle2 : bundleArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.BUNDLE_KEY_FRIEND_TAOBAO_ID, (Object) String.valueOf(bundle2.getLong(Constants.BUNDLE_KEY_FRIEND_TAOBAO_ID, 0L)));
                jSONObject.put(Constants.BUNDLE_KEY_FRIEND_ICON_URL, (Object) bundle2.getString(Constants.BUNDLE_KEY_FRIEND_ICON_URL, ""));
                jSONObject.put(Constants.BUNDLE_KEY_FRIEND_NICK_NAME, (Object) bundle2.getString(Constants.BUNDLE_KEY_FRIEND_NICK_NAME, ""));
                jSONArray.add(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    jSONObject2.put(str2, bundle.get(str2));
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("notifyName", (Object) str);
            jSONObject3.put("list", (Object) jSONArray);
            jSONObject3.put("data", (Object) jSONObject2);
            EventAction eventAction = new EventAction();
            eventAction.setMspActionFromScheme(MspEventTypes.ACTION_INVOKE_LOC, MspEventTypes.ACTION_STRING_NOTIFYTPL, jSONObject3.toString());
            if (sharePayProxyStore.mMspTradeContext != null) {
                eventAction.setFromLocalEvent(true);
                ActionsCreator.get(sharePayProxyStore.mMspTradeContext).createEventAction(eventAction);
            }
        }
    }
}
