package com.alipay.mobile.verifyidentity.alipay.H5Plugin;

import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WindVaneInit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WindVaneInit";

    /* renamed from: a  reason: collision with root package name */
    public static WindVaneInit f4281a;

    public static WindVaneInit getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindVaneInit) ipChange.ipc$dispatch("3046aefd", new Object[0]);
        }
        if (f4281a == null) {
            synchronized (WindVaneInit.class) {
                try {
                    if (f4281a == null) {
                        f4281a = new WindVaneInit();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4281a;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        fsw.h("VITaoBaoJSAPIAdapter", VITaoBaoJSAPIAdapter.class);
        VerifyLogCat.d(TAG, "windvane 静态注册");
    }
}
