package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils;

import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EditTextUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, String> f4323a = new ConcurrentHashMap();

    public void OnTextChanged(int i, String str, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4b4205", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        String str2 = (String) ((ConcurrentHashMap) this.f4323a).get(Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        try {
            String substring = str2.substring(0, i2);
            String substring2 = str2.substring(i3 + i2, str2.length());
            String substring3 = str.substring(i2, i4 + i2);
            Map<Integer, String> map = this.f4323a;
            Integer valueOf = Integer.valueOf(i);
            ((ConcurrentHashMap) map).put(valueOf, substring + substring3 + substring2);
        } catch (Throwable unused) {
        }
    }

    public void clear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17cb12f", new Object[]{this, new Integer(i)});
        } else {
            ((ConcurrentHashMap) this.f4323a).remove(Integer.valueOf(i));
        }
    }

    public String getText(int i, String str, String str2, EncryptRandomType encryptRandomType) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4272a01", new Object[]{this, new Integer(i), str, str2, encryptRandomType});
        }
        String str4 = (String) ((ConcurrentHashMap) this.f4323a).get(Integer.valueOf(i));
        if (str4 == null) {
            return "";
        }
        if (encryptRandomType == EncryptRandomType.randombefore) {
            str3 = str2 + str4;
        } else {
            str3 = str4 + str2;
        }
        return RsaUtils.encrypt(str3, str);
    }
}
