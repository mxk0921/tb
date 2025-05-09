package com.taobao.dp.util;

import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.taobao.dp.DeviceSecuritySDKImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CallbackHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "CallbackHelper";
    private static volatile CallbackHelper instance;
    private static DeviceSecuritySDKImpl mDeviceSecurity;

    public static CallbackHelper getInstance() {
        if (instance == null) {
            synchronized (CallbackHelper.class) {
                if (instance == null) {
                    instance = new CallbackHelper();
                }
            }
        }
        return instance;
    }

    public static void init(DeviceSecuritySDKImpl deviceSecuritySDKImpl) {
        mDeviceSecurity = deviceSecuritySDKImpl;
    }

    public void onUpdated(int i, int i2, String str) {
        if (i2 == 0) {
            i2 = 200;
        }
        try {
            ArrayList<IUMIDInitListenerEx> arrayList = mDeviceSecurity.getListenerHelper().m328(i);
            if (arrayList != null) {
                Iterator<IUMIDInitListenerEx> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onUMIDInitFinishedEx(str, i2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
