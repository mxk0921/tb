package com.alibaba.ability.impl.kvstorage;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.ph9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f1961a;

    public a(File file) {
        this.f1961a = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        String[] list = this.f1961a.list();
        if (list != null) {
            for (String str : list) {
                ph9.f(new File(this.f1961a, str));
            }
        }
    }
}
