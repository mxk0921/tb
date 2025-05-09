package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventBusUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.mobile.beehive.eventbus.IEventSubscriber;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaOnNotificationStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f3581a = new ConcurrentHashMap<>();

    public MetaOnNotificationStore(int i) {
        super(i);
    }

    public static /* synthetic */ Context access$000(MetaOnNotificationStore metaOnNotificationStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b7d03552", new Object[]{metaOnNotificationStore});
        }
        return metaOnNotificationStore.mContext;
    }

    public static /* synthetic */ void access$100(MetaOnNotificationStore metaOnNotificationStore, EventAction eventAction, String str, JSONObject jSONObject, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61346b04", new Object[]{metaOnNotificationStore, eventAction, str, jSONObject, str2});
        } else if (eventAction == null) {
        } else {
            if (TextUtils.isEmpty(str) || !metaOnNotificationStore.f3581a.containsKey(str)) {
                if (!TextUtils.isEmpty(str)) {
                    metaOnNotificationStore.f3581a.put(str, str2);
                }
                try {
                    str3 = jSONObject.toJSONString();
                } catch (Throwable unused) {
                    str3 = "{}";
                }
                Utils.sendToDocument(eventAction, str3);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MetaOnNotificationStore metaOnNotificationStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaOnNotificationStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mContext == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        final String string = actionParamsJson.getString("name");
        if (TextUtils.isEmpty(string)) {
            jSONObject.put("message", (Object) "param name must not null");
            jSONObject.put("success", (Object) Boolean.FALSE);
            return jSONObject.toJSONString();
        }
        boolean onNotification = BroadcastUtil.onNotification(this.mMspContext, this.mContext, string, new BroadcastReceiver() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOnNotificationStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaOnNotificationStore$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && MetaOnNotificationStore.access$000(MetaOnNotificationStore.this) != null && !TextUtils.isEmpty(string)) {
                    Bundle bundle = new Bundle();
                    try {
                        bundle = intent.getExtras();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (bundle != null) {
                        for (String str : bundle.keySet()) {
                            if (!MspGlobalDefine.NOTIFY_HASH_ID.equalsIgnoreCase(str)) {
                                try {
                                    jSONObject2.put(str, bundle.get(str));
                                } catch (Exception e2) {
                                    LogUtil.printExceptionStackTrace(e2);
                                }
                            }
                        }
                    }
                    MetaOnNotificationStore.access$100(MetaOnNotificationStore.this, eventAction, intent.getStringExtra(MspGlobalDefine.NOTIFY_HASH_ID), jSONObject2, "BroadCast");
                }
            }
        });
        boolean onNotification2 = EventBusUtil.onNotification(this.mMspContext, this.mContext, string, new IEventSubscriber() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOnNotificationStore.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.beehive.eventbus.IEventSubscriber
            public void onEvent(String str, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c3897928", new Object[]{this, str, obj});
                } else if (!TextUtils.isEmpty(str) && (obj instanceof JSONObject)) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    JSONObject jSONObject3 = new JSONObject(new LinkedHashMap(jSONObject2));
                    if (jSONObject2.containsKey(MspGlobalDefine.NOTIFY_HASH_ID)) {
                        str2 = jSONObject2.getString(MspGlobalDefine.NOTIFY_HASH_ID);
                        jSONObject3.remove(MspGlobalDefine.NOTIFY_HASH_ID);
                    } else {
                        str2 = null;
                    }
                    MetaOnNotificationStore.access$100(MetaOnNotificationStore.this, eventAction, str2, jSONObject3, EventBusManager.TAG);
                }
            }
        });
        LogUtil.record(2, "OnNotificationStore:onAction", "register broadCast : " + onNotification + ", register eventBus : " + onNotification2);
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
