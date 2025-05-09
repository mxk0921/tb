package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f6950a;

    public a(b bVar) {
        this.f6950a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (b.u(this.f6950a) >= 4) {
            this.f6950a.z();
            if (b.w(this.f6950a) != null) {
                b.w(this.f6950a).onFinish();
            }
        } else {
            this.f6950a.A();
            if (b.w(this.f6950a) != null) {
                b.w(this.f6950a).a();
            }
            b.v(this.f6950a);
        }
    }
}
