package com.taobao.android.purchase.core.address;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.core.address.NewErrorDialogStructure;
import tb.icu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(714080268);
    }

    public static boolean a(icu icuVar, NewErrorDialogStructure newErrorDialogStructure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c4e12f6", new Object[]{icuVar, newErrorDialogStructure})).booleanValue();
        }
        if (icuVar == null || newErrorDialogStructure == null) {
            return false;
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.title)) {
            icuVar.v(newErrorDialogStructure.title);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.subTitle)) {
            icuVar.q(newErrorDialogStructure.subTitle);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.msg)) {
            icuVar.u(newErrorDialogStructure.msg);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.image)) {
            icuVar.o(newErrorDialogStructure.image);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.titleBgColor)) {
            icuVar.w(newErrorDialogStructure.titleBgColor);
        }
        NewErrorDialogStructure.ButtonStructure buttonStructure = newErrorDialogStructure.left;
        if (buttonStructure != null) {
            if (!TextUtils.isEmpty(buttonStructure.text)) {
                icuVar.l(newErrorDialogStructure.left.text);
            }
            if (!TextUtils.isEmpty(newErrorDialogStructure.left.bgColor)) {
                icuVar.p(newErrorDialogStructure.left.bgColor);
            }
        }
        NewErrorDialogStructure.ButtonStructure buttonStructure2 = newErrorDialogStructure.right;
        if (buttonStructure2 != null) {
            if (!TextUtils.isEmpty(buttonStructure2.text)) {
                icuVar.m(newErrorDialogStructure.right.text);
            }
            if (!TextUtils.isEmpty(newErrorDialogStructure.right.bgColor)) {
                icuVar.t(newErrorDialogStructure.right.bgColor);
            }
        }
        return true;
    }
}
