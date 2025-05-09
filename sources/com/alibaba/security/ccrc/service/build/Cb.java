package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Cb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcService f2547a;
    public final /* synthetic */ AudioFileRiskSample b;
    public final /* synthetic */ File c;
    public final /* synthetic */ Db d;

    public Cb(Db db, CcrcService ccrcService, AudioFileRiskSample audioFileRiskSample, File file) {
        this.d = db;
        this.f2547a = ccrcService;
        this.b = audioFileRiskSample;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Db db = this.d;
        Db.a(db, this.f2547a, this.b, this.c, db.e);
    }
}
