package com.alibaba.security.ccrc.service.build;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.m  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1178m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        if (bArr == null) {
            return "";
        }
        return Base64.encodeToString(bArr, 2);
    }
}
