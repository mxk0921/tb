package com.ali.user.mobile.url;

import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.url.model.AcBaseParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AccountCenterApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AccountCenterApi instance = null;

    static {
        t2o.a(69206200);
    }

    private AccountCenterApi() {
    }

    public static AccountCenterApi getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountCenterApi) ipChange.ipc$dispatch("73e8c073", new Object[0]);
        }
        if (instance == null) {
            synchronized (AccountCenterApi.class) {
                try {
                    if (instance == null) {
                        instance = new AccountCenterApi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void commonAc(boolean z, AcBaseParam acBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58c6bbb", new Object[]{this, new Boolean(z), acBaseParam, rpcRequestCallback});
        } else if (z) {
            UrlFetchServiceImpl.getInstance().navBySceneRemote(acBaseParam, rpcRequestCallback);
        } else {
            UrlFetchServiceImpl.getInstance().foundH5urls(acBaseParam, rpcRequestCallback);
        }
    }
}
