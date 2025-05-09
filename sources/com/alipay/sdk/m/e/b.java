package com.alipay.sdk.m.e;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.alipay.sdk.m.d.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PackageInfo f4525a;
    public final int b;
    public final String c;

    public b(PackageInfo packageInfo, int i, String str) {
        this.f4525a = packageInfo;
        this.b = i;
        this.c = str;
    }

    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3657c8d3", new Object[]{this, aVar})).booleanValue();
        }
        Signature[] signatureArr = this.f4525a.signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            return false;
        }
        for (Signature signature : signatureArr) {
            String a2 = e.a(aVar, signature.toByteArray());
            if (!(a2 == null || TextUtils.equals(a2, this.c))) {
                return true;
            }
        }
        return false;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f4525a.versionCode < this.b;
    }
}
