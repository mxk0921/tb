package com.alibaba.security.ccrc.service.build;

import anetwork.channel.download.DownloadManager;
import com.alibaba.security.ccrc.service.build.Z;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class X implements DownloadManager.DownloadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Z.a f2575a;
    public final /* synthetic */ Z b;

    public X(Z z, Z.a aVar) {
        this.b = z;
        this.f2575a = aVar;
    }

    @Override // anetwork.channel.download.DownloadManager.DownloadListener
    public void onFail(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else {
            this.f2575a.onFail(i, str);
        }
    }

    @Override // anetwork.channel.download.DownloadManager.DownloadListener
    public void onProgress(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
        }
    }

    @Override // anetwork.channel.download.DownloadManager.DownloadListener
    public void onSuccess(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
        } else {
            this.f2575a.onSuccess(i, str);
        }
    }
}
