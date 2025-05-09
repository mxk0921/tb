package com.taobao.taolive.room.player.standard.manager;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t0u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f13224a;

    public c(d dVar) {
        this.f13224a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            t0u.c(this.f13224a.f13215a.e.getApplicationContext(), "讲解播放出错，返回直播中！");
        }
    }
}
