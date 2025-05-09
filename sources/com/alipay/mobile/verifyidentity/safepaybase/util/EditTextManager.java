package com.alipay.mobile.verifyidentity.safepaybase.util;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EditTextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static EditTextUtil f4441a;

    public static EditTextUtil a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("b140f1bc", new Object[0]);
        }
        if (f4441a == null) {
            f4441a = new EditTextUtil();
        }
        return f4441a;
    }
}
