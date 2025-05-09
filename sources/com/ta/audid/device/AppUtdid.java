package com.ta.audid.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AppUtdid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AppUtdid mInstance = new AppUtdid();

    static {
        t2o.a(966787075);
    }

    private AppUtdid() {
    }

    public static AppUtdid getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppUtdid) ipChange.ipc$dispatch("14b16433", new Object[0]);
        }
        return mInstance;
    }

    @Deprecated
    public synchronized String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return com.ta.utdid2.device.AppUtdid.getInstance().getUtdidCache();
    }

    @Deprecated
    public synchronized String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        return UTDevice.getUtdid(context);
    }
}
