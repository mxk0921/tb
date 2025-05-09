package com.alipay.mobile.verifyidentity.safepaybase;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum EncryptRandomType {
    randombefore,
    randomafter;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(EncryptRandomType encryptRandomType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/EncryptRandomType");
    }

    public static EncryptRandomType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EncryptRandomType) ipChange.ipc$dispatch("513f990f", new Object[]{str});
        }
        return (EncryptRandomType) Enum.valueOf(EncryptRandomType.class, str);
    }
}
