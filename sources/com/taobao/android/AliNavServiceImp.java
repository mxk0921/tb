package com.taobao.android;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliNavServiceImp implements AliNavServiceInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.AliNavServiceInterface
    public AliNavInterface a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNavInterface) ipChange.ipc$dispatch("2883d6cd", new Object[]{this, context});
        }
        return new AliNavImp(Nav.from(context));
    }
}
