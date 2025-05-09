package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.ba  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1147ba implements OnRemoteSoLoadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnRemoteSoLoadListener f2582a;
    public final /* synthetic */ C1150ca b;

    public C1147ba(C1150ca caVar, OnRemoteSoLoadListener onRemoteSoLoadListener) {
        this.b = caVar;
        this.f2582a = onRemoteSoLoadListener;
    }

    @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
    public void onResult(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3180a11", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        C1150ca caVar = this.b;
        C1150ca.$ipChange.put(str, Boolean.valueOf(z));
        this.f2582a.onResult(str, z, str2);
    }
}
