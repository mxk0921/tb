package com.taobao.android.detail.ttdetail.inside;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.inside.InsideLinearLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements InsideLinearLayout.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TTDInsideController f6852a;

    public a(TTDInsideController tTDInsideController) {
        this.f6852a = tTDInsideController;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else {
            TTDInsideController.a(this.f6852a, true);
        }
    }
}
