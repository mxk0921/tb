package com.alibaba.security.client.smart.core.core;

import android.content.Context;
import com.alibaba.security.ccrc.service.build.C1144aa;
import com.alibaba.security.ccrc.service.build.Z;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongNativeDownloaderImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WukongNativeDownloaderImpl";
    public final Z mDownloader;
    public final WukongNativeManager mWukongNativeManager;

    public WukongNativeDownloaderImpl(Context context, String str, WukongNativeManager wukongNativeManager) {
        Z z = new Z();
        this.mDownloader = z;
        this.mWukongNativeManager = wukongNativeManager;
        z.a(context, str);
    }

    private void mkDirs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97407fd5", new Object[]{this, str});
            return;
        }
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public void download(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b991fb6d", new Object[]{this, str, str2, str3, str4, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        mkDirs(str3);
        this.mDownloader.a(str, str3, str4, new C1144aa(this, str2, currentTimeMillis));
    }
}
