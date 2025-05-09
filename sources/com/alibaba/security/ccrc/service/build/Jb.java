package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.alibaba.secutiry.mnn.pykit.PythonKitManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Jb implements OnRemoteSoLoadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
    public void onResult(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3180a11", new Object[]{this, str, new Boolean(z), str2});
        } else if (z) {
            PythonKitManager.nPyKitInit();
        }
    }
}
