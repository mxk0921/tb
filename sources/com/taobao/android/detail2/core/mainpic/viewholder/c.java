package com.taobao.android.detail2.core.mainpic.viewholder;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicImageViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainPicImageViewHolder.f f7226a;

    public c(MainPicImageViewHolder.f fVar) {
        this.f7226a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            MainPicImageViewHolder.f.a(this.f7226a);
        }
    }
}
