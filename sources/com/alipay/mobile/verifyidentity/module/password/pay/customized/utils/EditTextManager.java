package com.alipay.mobile.verifyidentity.module.password.pay.customized.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EditTextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static EditTextUtil f4332a;

    public static EditTextUtil getEditTextUtils() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("195dbf2f", new Object[0]);
        }
        if (f4332a == null) {
            f4332a = new EditTextUtil();
        }
        return f4332a;
    }
}
