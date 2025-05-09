package com.alipay.android.msp.network.decorator;

import com.alibaba.fastjson.JSONException;
import com.alipay.android.msp.network.model.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mBizId;
    public BaseDecorator mDecorator;
    public RequestConfig mRequestConfig;

    public BaseDecorator() {
    }

    public void setRequestConfig(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b50237", new Object[]{this, requestConfig});
        } else {
            this.mRequestConfig = requestConfig;
        }
    }

    public abstract byte[] todo(byte[] bArr, String str) throws JSONException;

    public abstract Object undo(Object obj) throws Exception;

    public BaseDecorator(int i, BaseDecorator baseDecorator) {
        this.mBizId = i;
        this.mDecorator = baseDecorator;
    }
}
