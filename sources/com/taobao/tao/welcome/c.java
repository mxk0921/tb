package com.taobao.tao.welcome;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f12892a;

    public c(d dVar) {
        this.f12892a = dVar;
    }

    @Override // com.taobao.tao.welcome.a.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbb0a8", new Object[]{this, new Integer(i)});
            return;
        }
        this.f12892a.c.dismiss();
        this.f12892a.f12893a.a(i);
    }

    @Override // com.taobao.tao.welcome.a.d
    public void onPositive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab057f", new Object[]{this});
            return;
        }
        HostController.exitViewMode(this.f12892a.b);
        this.f12892a.c.dismiss();
        this.f12892a.f12893a.onPositive();
    }
}
