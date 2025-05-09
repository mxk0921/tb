package com.ali.user.mobile.rpc.filter;

import com.ali.user.mobile.rpc.RpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FilterManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STOP = "STOP";
    private static FilterManager instance = null;

    static {
        t2o.a(68157565);
    }

    private FilterManager() {
    }

    public static FilterManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FilterManager) ipChange.ipc$dispatch("6cf11883", new Object[0]);
        }
        if (instance == null) {
            synchronized (FilterManager.class) {
                try {
                    if (instance == null) {
                        instance = new FilterManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void afterRpc(List<IAfterFilter> list, RpcResponse rpcResponse) {
        String doAfter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ba4e2c", new Object[]{this, list, rpcResponse});
        } else if (list != null) {
            Iterator<IAfterFilter> it = list.iterator();
            while (it.hasNext() && (doAfter = it.next().doAfter(rpcResponse)) != null && !STOP.equals(doAfter)) {
            }
        }
    }
}
