package com.alipay.mobile.common.netsdkextdependapi.security;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SignRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int SIGN_TYPE_ATLAS = 2;
    public static int SIGN_TYPE_HMAC_SHA1 = 1;
    public static int SIGN_TYPE_MD5;
    public String appkey;
    public String content;
    public int signType = SIGN_TYPE_MD5;

    public boolean isSignTypeAtlas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a85cd6b5", new Object[]{this})).booleanValue();
        }
        if (this.signType == SIGN_TYPE_ATLAS) {
            return true;
        }
        return false;
    }

    public boolean isSignTypeHmacSha1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba5eb898", new Object[]{this})).booleanValue();
        }
        if (this.signType == SIGN_TYPE_HMAC_SHA1) {
            return true;
        }
        return false;
    }

    public boolean isSignTypeMD5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12cae08", new Object[]{this})).booleanValue();
        }
        if (this.signType == SIGN_TYPE_MD5) {
            return true;
        }
        return false;
    }
}
