package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.multi.file.FileRiskSample;
import com.alibaba.security.wukong.model.multi.file.VideoCutFileRiskSample;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcService f2614a;
    public final /* synthetic */ FileRiskSample.Callback b;
    public final /* synthetic */ VideoCutFileRiskSample c;

    public pb(VideoCutFileRiskSample videoCutFileRiskSample, CcrcService ccrcService, FileRiskSample.Callback callback) {
        this.c = videoCutFileRiskSample;
        this.f2614a = ccrcService;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            VideoCutFileRiskSample.a(this.c, this.f2614a, this.b);
        }
    }
}
