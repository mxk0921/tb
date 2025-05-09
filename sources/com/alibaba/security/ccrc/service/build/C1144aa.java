package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.Z;
import com.alibaba.security.client.smart.core.core.WukongNativeDownloaderImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.aa  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1144aa implements Z.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2580a;
    public final /* synthetic */ long b;
    public final /* synthetic */ WukongNativeDownloaderImpl c;

    public C1144aa(WukongNativeDownloaderImpl wukongNativeDownloaderImpl, String str, long j) {
        this.c = wukongNativeDownloaderImpl;
        this.f2580a = str;
        this.b = j;
    }

    @Override // com.alibaba.security.ccrc.service.build.Z.a
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        StringBuilder a2 = Kb.a("download ");
        a2.append(this.f2580a);
        a2.append(" fail cost time ");
        a2.append(System.currentTimeMillis() - this.b);
        a2.append(" errorMsg: ");
        a2.append(str);
        Logging.e(WukongNativeDownloaderImpl.TAG, a2.toString());
    }

    @Override // com.alibaba.security.ccrc.service.build.Z.a
    public void onSuccess(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
        }
    }
}
