package com.alipay.mobile.common.transport.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APNetworkStartupUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4138a;

    public static void notifyNetworkStartupListener() {
        if (!f4138a) {
            f4138a = true;
            try {
                String stringFromMetaData = MiscUtils.getStringFromMetaData(TransportEnvUtil.getContext(), "apnetwork.startup.listener");
                if (!TextUtils.isEmpty(stringFromMetaData)) {
                    Object newInstance = Class.forName(stringFromMetaData).newInstance();
                    if (!(newInstance instanceof APNetworkStartupListener)) {
                        LogCatUtil.warn("APNetworkStartupUtil", "[notifyNetworkStartupListener] Illegal listener class, Not an implementation of APNetworkStartupListener， class name = " + stringFromMetaData);
                        return;
                    }
                    APNetworkStartupListener aPNetworkStartupListener = (APNetworkStartupListener) newInstance;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    aPNetworkStartupListener.onNetworkStartup(TransportEnvUtil.getContext());
                    LogCatUtil.info("APNetworkStartupUtil", "[notifyNetworkStartupListener] Execution finished. listener = " + stringFromMetaData + ", cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                } else if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                    LogCatUtil.info("APNetworkStartupUtil", "[notifyNetworkStartupListener] No meta-data config:  apnetwork.startup.listener");
                }
            } catch (Throwable th) {
                LogCatUtil.warn("APNetworkStartupUtil", "[notifyNetworkStartupListener] Exception = " + th.toString(), th);
            }
        }
    }
}
