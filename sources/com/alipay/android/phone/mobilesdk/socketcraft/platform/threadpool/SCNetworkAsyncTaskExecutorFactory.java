package com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool;

import com.alipay.android.phone.mobilesdk.socketcraft.integrated.threadpool.MPaaSNetworkAsyncTaskExecutor;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SCNetworkAsyncTaskExecutorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SCNetworkAsyncTaskExecutor f3764a;

    public static final SCNetworkAsyncTaskExecutor getInstance() {
        SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor = f3764a;
        if (sCNetworkAsyncTaskExecutor != null) {
            return sCNetworkAsyncTaskExecutor;
        }
        synchronized (SCNetworkAsyncTaskExecutorFactory.class) {
            try {
                SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor2 = f3764a;
                if (sCNetworkAsyncTaskExecutor2 != null) {
                    return sCNetworkAsyncTaskExecutor2;
                }
                if (PlatformUtil.isAndroidMPaaSPlatform()) {
                    SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor3 = (SCNetworkAsyncTaskExecutor) MPaaSNetworkAsyncTaskExecutor.class.newInstance();
                    f3764a = sCNetworkAsyncTaskExecutor3;
                    return sCNetworkAsyncTaskExecutor3;
                }
                if (f3764a == null) {
                    f3764a = new DefaultSCNetworkAsyncTaskExecutor();
                }
                return f3764a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
