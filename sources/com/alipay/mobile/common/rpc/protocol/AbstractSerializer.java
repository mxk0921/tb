package com.alipay.mobile.common.rpc.protocol;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class AbstractSerializer implements Serializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mOperationType;
    public Object mParams;
    public String scene;

    public AbstractSerializer(String str, Object obj) {
        this.mOperationType = str;
        this.mParams = obj;
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return this.scene;
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.scene = str;
        }
    }
}
