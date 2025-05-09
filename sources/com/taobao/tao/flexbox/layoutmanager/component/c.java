package com.taobao.tao.flexbox.layoutmanager.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListViewComponent.RecyclerViewAdapter f12144a;

    public c(ListViewComponent.RecyclerViewAdapter recyclerViewAdapter) {
        this.f12144a = recyclerViewAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            ListViewComponent.RecyclerViewAdapter.T(this.f12144a, 0);
        }
    }
}
