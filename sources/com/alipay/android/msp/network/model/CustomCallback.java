package com.alipay.android.msp.network.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class CustomCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CustomCallback defaultCallback = new CustomCallback() { // from class: com.alipay.android.msp.network.model.CustomCallback.1
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum WhatNext {
        CONTINUE,
        TERMINATE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WhatNext whatNext, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/model/CustomCallback$WhatNext");
        }

        public static WhatNext valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WhatNext) ipChange.ipc$dispatch("8a946a", new Object[]{str});
            }
            return (WhatNext) Enum.valueOf(WhatNext.class, str);
        }
    }

    public WhatNext onBuildRequestConfig(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WhatNext) ipChange.ipc$dispatch("a3149ad9", new Object[]{this, requestConfig});
        }
        return WhatNext.CONTINUE;
    }

    public WhatNext onReqEnd(NetResponseData netResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WhatNext) ipChange.ipc$dispatch("794dde76", new Object[]{this, netResponseData});
        }
        return WhatNext.CONTINUE;
    }

    public WhatNext onReqException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WhatNext) ipChange.ipc$dispatch("68312b45", new Object[]{this, th});
        }
        return WhatNext.CONTINUE;
    }
}
