package com.alipay.mobile.common.netsdkextdependapi.security;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecurityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final SecurityManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityManager) ipChange.ipc$dispatch("e7f3c8e8", new Object[0]);
        }
        return SecurityManagerFactory.getInstance().getDefaultBean();
    }

    public static final byte[] decrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cd4fbce2", new Object[]{bArr}) : a().decrypt(bArr);
    }

    public static final byte[] encrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("11c8c10a", new Object[]{bArr}) : a().encrypt(bArr);
    }

    public static final String getApDid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89f21f1f", new Object[0]);
        }
        return a().getApDid();
    }

    public static final SignResult signature(SignRequest signRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignResult) ipChange.ipc$dispatch("6e8c9153", new Object[]{signRequest});
        }
        return a().signature(signRequest);
    }

    public static final byte[] decrypt(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("b18cb518", new Object[]{bArr, str}) : a().decrypt(bArr, str);
    }

    public static final byte[] encrypt(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("f5ebff40", new Object[]{bArr, str}) : a().encrypt(bArr, str);
    }

    public static final String decrypt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72c54002", new Object[]{str}) : a().decrypt(str);
    }

    public static final String encrypt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{str}) : a().encrypt(str);
    }
}
