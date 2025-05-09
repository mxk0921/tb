package com.flybird.deploy.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBTemplateContent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FBTemplateDeciderTemplateModelCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a.C0245a f4995a;

    public FBTemplateDeciderTemplateModelCallback(a.C0245a aVar) {
        this.f4995a = aVar;
    }

    public abstract void call(FBTemplateContent fBTemplateContent, String str, int i, long j, int i2, int i3);
}
