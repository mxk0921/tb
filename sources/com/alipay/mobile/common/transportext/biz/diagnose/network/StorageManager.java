package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StorageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Storage f4189a;

    public StorageManager(Storage storage) {
        this.f4189a = storage;
    }

    public Long getBig(String str, boolean z) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("e3f6429c", new Object[]{this, str, new Boolean(z)});
        }
        if (z) {
            bArr = this.f4189a.getCommon(str);
        } else {
            bArr = this.f4189a.getSecure(str);
        }
        if (bArr == null || bArr.length != 8) {
            return null;
        }
        return Long.valueOf((bArr[7] & 255) | (((((((((((((bArr[1] & 255) | (bArr[0] << 8)) << 8) | (bArr[2] & 255)) << 8) | (bArr[3] & 255)) << 8) | (bArr[4] & 255)) << 8) | (bArr[5] & 255)) << 8) | (bArr[6] & 255)) << 8));
    }

    public Integer getInt(String str, boolean z) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("fb1fd231", new Object[]{this, str, new Boolean(z)});
        }
        if (z) {
            bArr = this.f4189a.getCommon(str);
        } else {
            bArr = this.f4189a.getSecure(str);
        }
        if (bArr == null || bArr.length != 4) {
            return null;
        }
        return Integer.valueOf((bArr[3] & 255) | (((((bArr[0] << 8) | (bArr[1] & 255)) << 8) | (bArr[2] & 255)) << 8));
    }

    public String getStr(String str, boolean z) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0117498", new Object[]{this, str, new Boolean(z)});
        }
        if (z) {
            bArr = this.f4189a.getCommon(str);
        } else {
            bArr = this.f4189a.getSecure(str);
        }
        if (bArr == null) {
            return null;
        }
        return NetworkDiagnoseUtil.convert(bArr);
    }
}
