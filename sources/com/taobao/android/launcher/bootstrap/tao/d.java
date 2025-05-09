package com.taobao.android.launcher.bootstrap.tao;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d implements LoginBroadcastRegister.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f8160a;

    public d(e eVar) {
        this.f8160a = eVar;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f752460", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            e.a(this.f8160a).y().f();
        } else if (i == 2) {
            e.a(this.f8160a).y().l();
        } else if (i == 3) {
            e.a(this.f8160a).y().a();
        }
    }
}
