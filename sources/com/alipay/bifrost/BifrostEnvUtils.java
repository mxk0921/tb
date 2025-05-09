package com.alipay.bifrost;

import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BifrostEnvUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f3809a;

    public static final Context getContext() {
        Context context;
        Context context2 = f3809a;
        if (context2 != null) {
            return context2;
        }
        try {
            context = (Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            f3809a = context;
        } catch (Throwable th) {
            LogCatUtil.error("bifrostEnvUtils", "context from ActivityThread exception", th);
        }
        if (context != null) {
            return context;
        }
        LogCatUtil.warn("bifrostEnvUtils", "context from ActivityThread is null");
        return f3809a;
    }

    public static final void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else {
            f3809a = context;
        }
    }
}
