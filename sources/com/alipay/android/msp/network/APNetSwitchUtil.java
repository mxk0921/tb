package com.alipay.android.msp.network;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.mobile.common.rpc.EmptyRpcInvokeContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APNetSwitchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<Boolean> f3700a = new AtomicReference<>(null);

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue();
        }
        try {
            EmptyRpcInvokeContext.getInstance().setAppKey("");
            return true;
        } catch (Throwable unused) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "NoStandaloneRpc", "");
            return false;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6356fd8", new Object[]{context})).booleanValue();
        }
        AtomicReference<Boolean> atomicReference = f3700a;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean equals = TextUtils.equals(context.getPackageName(), "com.taobao.taobao");
        atomicReference.set(Boolean.valueOf(equals));
        return equals;
    }

    public static boolean shouldIUseAPHttpDns(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("866aa604", new Object[]{context})).booleanValue();
        }
        if (!b(context)) {
            return DrmManager.getInstance(context).isGray(DrmKey.GRAY_ENABLE_AP_HTTPDNS, false, context);
        }
        if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_AP_HTTP_DNS_SOME_APP, false, context)) {
            return true;
        }
        return false;
    }

    public static boolean shouldIUseAPNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8715e77", new Object[]{context})).booleanValue();
        }
        if (!b(context)) {
            return DrmManager.getInstance(context).isGray(DrmKey.GRAY_ENABLE_AP_RPC, false, context);
        }
        if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_AP_RPC_SOME_APP, false, context)) {
            return true;
        }
        return false;
    }

    public static boolean shouldIUseStandaloneRpcLib(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc13830f", new Object[]{context})).booleanValue();
        }
        if (DrmManager.getInstance(context).isGray(DrmKey.GRAY_NET_IDENTITY_OPTIMIZE, false, context)) {
            return a();
        }
        return false;
    }
}
