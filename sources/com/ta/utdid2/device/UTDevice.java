package com.ta.utdid2.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ta.audid.Variables;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787129);
    }

    public static int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[0])).intValue();
        }
        return UTUtdid.getType();
    }

    @Deprecated
    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        if (context == null) {
            return Constants.UTDID_INVALID;
        }
        Variables.getInstance().initContext(context);
        Variables.getInstance().init();
        return AppUtdid.getInstance().getUtdid(context);
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdabf5e7", new Object[]{context});
        }
        return getUtdid(context);
    }
}
