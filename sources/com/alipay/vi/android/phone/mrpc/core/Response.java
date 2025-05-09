package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Response {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mContentType;
    public byte[] mResData;

    public String getContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this});
        }
        return this.mContentType;
    }

    public byte[] getResData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a83a0582", new Object[]{this});
        }
        return this.mResData;
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.mContentType = str;
        }
    }

    public void setResData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f36b36", new Object[]{this, bArr});
        } else {
            this.mResData = bArr;
        }
    }
}
