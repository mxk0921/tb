package com.taobao.zcache.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackUpdateFinishedCallback;
import tb.gkl;
import tb.hkl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PackUpdateCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public hkl resultCallback = null;
    public PackUpdateFinishedCallback finishedCallback = null;

    static {
        t2o.a(996147259);
    }

    public void finish(String str, boolean z, int i, String str2) {
        Error error;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4c039d", new Object[]{this, str, new Boolean(z), new Integer(i), str2});
            return;
        }
        if (i != 0) {
            error = new Error(i, str2);
        } else {
            error = null;
        }
        hkl hklVar = this.resultCallback;
        if (hklVar != null) {
            hklVar.a(str, new gkl(str, z, error));
            return;
        }
        PackUpdateFinishedCallback packUpdateFinishedCallback = this.finishedCallback;
        if (packUpdateFinishedCallback != null) {
            packUpdateFinishedCallback.finish(str, error);
        }
    }
}
