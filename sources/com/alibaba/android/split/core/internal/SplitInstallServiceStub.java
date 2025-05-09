package com.alibaba.android.split.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.alibaba.android.split.api.ISplitInstallService;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class SplitInstallServiceStub extends Stub implements ISplitInstallService {
    static {
        t2o.a(677380163);
        t2o.a(676331562);
    }

    public SplitInstallServiceStub(String str) {
        super(str);
    }

    public static ISplitInstallService asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallService");
        if (queryLocalInterface instanceof ISplitInstallService) {
            return (ISplitInstallService) queryLocalInterface;
        }
        return new SplitInstallServiceProxy(iBinder);
    }
}
