package com.alipay.mobile.common.ipc.api.push;

import com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface BindPushServiceManager {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class BindPushServiceFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static BindPushServiceManager f3922a;

        public static final BindPushServiceManager getInstance() {
            BindPushServiceManager bindPushServiceManager = f3922a;
            if (bindPushServiceManager != null) {
                return bindPushServiceManager;
            }
            synchronized (BindPushServiceFactory.class) {
                BindPushServiceManager bindPushServiceManager2 = f3922a;
                if (bindPushServiceManager2 != null) {
                    return bindPushServiceManager2;
                }
                try {
                    BindPushServiceManager bindPushServiceManager3 = (BindPushServiceManager) BindPushServiceManagerImpl.class.newInstance();
                    f3922a = bindPushServiceManager3;
                    return bindPushServiceManager3;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    void addBindEventListener(BindEventListener bindEventListener);

    void bindService();

    boolean isBindedService();

    void removeBindEventListener(BindEventListener bindEventListener);

    void unbindService();
}
