package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Da implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2549a;
    public final /* synthetic */ AbstractC1154db b;
    public final /* synthetic */ Ja c;

    public Da(Ja ja, String str, AbstractC1154db dbVar) {
        this.c = ja;
        this.f2549a = str;
        this.b = dbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            Ja.a(this.c, this.f2549a, this.b);
        }
    }
}
