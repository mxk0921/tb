package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ToolThreadUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String ACTION_TOOLS_THREAD_WITH_START = "action.tools.thread.START";
    public static String ACTION_TOOLS_THREAD_WITH_START_END_END = "action.tools.thread.START_END.END";
    public static String ACTION_TOOLS_THREAD_WITH_START_END_START = "action.tools.thread.START_END.START";
    public static ToolThreadUtils c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3997a;
    public final LocalBroadcastManager b;

    public ToolThreadUtils(Context context) {
        this.f3997a = context;
        if (context != null && context.getApplicationContext() != null) {
            this.b = LocalBroadcastManager.getInstance(context);
        }
    }

    public static synchronized ToolThreadUtils getInstance(Context context) {
        synchronized (ToolThreadUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ToolThreadUtils) ipChange.ipc$dispatch("962aef07", new Object[]{context});
            }
            if (c == null) {
                c = new ToolThreadUtils(context);
            }
            return c;
        }
    }

    public void end() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else if (this.f3997a != null && this.b != null) {
            this.b.sendBroadcast(new Intent(ACTION_TOOLS_THREAD_WITH_START_END_END));
        }
    }

    public void start(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f66680b", new Object[]{this, new Boolean(z)});
        } else if (this.f3997a != null && this.b != null) {
            Intent intent = new Intent();
            if (z) {
                intent.setAction(ACTION_TOOLS_THREAD_WITH_START_END_START);
            } else {
                intent.setAction(ACTION_TOOLS_THREAD_WITH_START);
            }
            this.b.sendBroadcast(intent);
        }
    }
}
