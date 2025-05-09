package com.alibaba.ut.abtest.pipeline.encoder;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum HmacAlgorithms {
    HMAC_MD5("HmacMD5"),
    HMAC_SHA_1("HmacSHA1"),
    HMAC_SHA_224("HmacSHA224"),
    HMAC_SHA_256("HmacSHA256"),
    HMAC_SHA_384("HmacSHA384"),
    HMAC_SHA_512("HmacSHA512");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String name;

    HmacAlgorithms(String str) {
        this.name = str;
    }

    public static /* synthetic */ Object ipc$super(HmacAlgorithms hmacAlgorithms, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/pipeline/encoder/HmacAlgorithms");
    }

    public static HmacAlgorithms valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HmacAlgorithms) ipChange.ipc$dispatch("5ec8fe2c", new Object[]{str});
        }
        return (HmacAlgorithms) Enum.valueOf(HmacAlgorithms.class, str);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.name;
    }
}
