package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import anetwork.channel.download.DownloadManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f2577a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void onFail(int i, String str);

        void onSuccess(int i, String str);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            this.f2577a = str;
        }
    }

    public void a(String str, String str2, String str3, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4383f12f", new Object[]{this, str, str2, str3, aVar});
        } else {
            DownloadManager.getInstance().enqueue(str, str2, str3, new X(this, aVar));
        }
    }

    public void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2e33b9", new Object[]{this, str, str2, aVar});
        } else {
            DownloadManager.getInstance().enqueue(str, this.f2577a, str2, new Y(this, aVar));
        }
    }
}
