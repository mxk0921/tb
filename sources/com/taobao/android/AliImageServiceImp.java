package com.taobao.android;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.s0m;
import tb.u0m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliImageServiceImp implements AliImageServiceInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AliImageServiceImp f6240a = new AliImageServiceImp();

    public static AliImageServiceImp getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageServiceImp) ipChange.ipc$dispatch("be33a8dc", new Object[0]);
        }
        return f6240a;
    }

    @Override // com.taobao.android.AliImageServiceInterface
    public AliImageInterface a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageInterface) ipChange.ipc$dispatch("438adb01", new Object[]{this, context});
        }
        return new u0m(s0m.B().N0(context));
    }

    @Override // com.taobao.android.AliImageServiceInterface
    public <T extends View & AliUrlImageViewInterface> T b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("15bc9352", new Object[]{this, context}));
        }
        return new AliUrlImageView(context);
    }
}
