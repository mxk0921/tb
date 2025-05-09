package com.alipay.android.phone.iifaa.did.api;

import com.android.alibaba.ip.runtime.IpChange;
import tb.asx;
import tb.qwx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DIDCoreSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qwx mTrustedCertServiceIns;

    public static qwx getTrustedCertService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwx) ipChange.ipc$dispatch("e4db3888", new Object[0]);
        }
        if (mTrustedCertServiceIns == null) {
            synchronized (qwx.class) {
                try {
                    if (mTrustedCertServiceIns == null) {
                        mTrustedCertServiceIns = new asx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mTrustedCertServiceIns;
    }
}
