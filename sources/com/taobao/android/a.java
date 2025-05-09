package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageStrategyConfigBuilderInterface;
import com.taobao.tao.image.ImageStrategyConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements AliImageStrategyConfigBuilderInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ImageStrategyConfig.b f6247a;

    public a(ImageStrategyConfig.b bVar) {
        this.f6247a = bVar;
    }

    /* renamed from: b */
    public a a(AliImageStrategyConfigBuilderInterface.AliSizeLimitType aliSizeLimitType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2de56643", new Object[]{this, aliSizeLimitType});
        }
        this.f6247a.l(ImageStrategyConfig.SizeLimitType.valueOf(aliSizeLimitType.toString()));
        return this;
    }

    @Override // com.taobao.android.AliImageStrategyConfigBuilderInterface
    public Object build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("199a7bdd", new Object[]{this});
        }
        return this.f6247a.a();
    }
}
