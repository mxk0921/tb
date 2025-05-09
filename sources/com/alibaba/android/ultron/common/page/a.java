package com.alibaba.android.ultron.common.page;

import com.alibaba.android.ultron.common.page.b;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a implements b.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UltronCommonActivity f2248a;

    public a(UltronCommonActivity ultronCommonActivity) {
        this.f2248a = ultronCommonActivity;
    }

    @Override // com.alibaba.android.ultron.common.page.b.d
    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b200aa", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i == 0) {
            UltronCommonActivity.n3(this.f2248a, UltronCommonActivity.m3(this.f2248a).h());
        }
    }
}
