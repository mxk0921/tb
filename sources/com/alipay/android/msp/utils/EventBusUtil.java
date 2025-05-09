package com.alipay.android.msp.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.mobile.beehive.eventbus.IEventSubscriber;
import com.alipay.mobile.beehive.eventbus.ThreadMode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventBusUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<MspContext, Map<String, IEventSubscriber>> mReceiverMap = new ConcurrentHashMap();

    public static void postNotification(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27d8c74", new Object[]{str, jSONObject});
        } else {
            EventBusManager.getInstance().post(jSONObject, str);
        }
    }

    public static synchronized void resetNotifications(MspContext mspContext, Context context) {
        synchronized (EventBusUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12859f32", new Object[]{mspContext, context});
                return;
            }
            if (!(context == null || mspContext == null)) {
                Map<MspContext, Map<String, IEventSubscriber>> map = mReceiverMap;
                if (!map.isEmpty()) {
                    Map<String, IEventSubscriber> map2 = map.get(mspContext);
                    if (map2 != null) {
                        for (IEventSubscriber iEventSubscriber : map2.values()) {
                            EventBusManager.getInstance().unregister(iEventSubscriber);
                        }
                        map2.clear();
                        mReceiverMap.remove(mspContext);
                    }
                }
            }
        }
    }

    public static synchronized boolean offNotification(MspContext mspContext, Context context, String str) {
        synchronized (EventBusUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bc33883f", new Object[]{mspContext, context, str})).booleanValue();
            }
            LogUtil.record(1, "EventBusUtil:offNotification", "name=".concat(String.valueOf(str)));
            if (mspContext != null) {
                Map<MspContext, Map<String, IEventSubscriber>> map = mReceiverMap;
                if (map.containsKey(mspContext)) {
                    Map<String, IEventSubscriber> map2 = map.get(mspContext);
                    if (map2 != null && map2.containsKey(str)) {
                        EventBusManager.getInstance().unregister(map2.get(str));
                        map2.remove(str);
                    }
                    return true;
                }
            }
            return true;
        }
    }

    public static synchronized boolean onNotification(MspContext mspContext, Context context, String str, IEventSubscriber iEventSubscriber) {
        synchronized (EventBusUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("35cba30b", new Object[]{mspContext, context, str, iEventSubscriber})).booleanValue();
            }
            offNotification(mspContext, context, str);
            LogUtil.record(1, "EventBusUtil:onNotification", "name=".concat(String.valueOf(str)));
            if (iEventSubscriber == null) {
                return false;
            }
            EventBusManager.getInstance().register(iEventSubscriber, ThreadMode.CURRENT, str);
            Map<MspContext, Map<String, IEventSubscriber>> map = mReceiverMap;
            Map<String, IEventSubscriber> map2 = map.get(mspContext);
            if (map2 != null) {
                map2.put(str, iEventSubscriber);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(str, iEventSubscriber);
                map.put(mspContext, hashMap);
            }
            return true;
        }
    }
}
