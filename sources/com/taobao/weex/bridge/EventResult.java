package com.taobao.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class EventResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object result;
    private boolean success = false;

    static {
        t2o.a(985661541);
    }

    public Object getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5be12058", new Object[]{this});
        }
        return this.result;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public void onCallback(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff8b8e7", new Object[]{this, obj});
            return;
        }
        this.success = true;
        this.result = obj;
    }
}
