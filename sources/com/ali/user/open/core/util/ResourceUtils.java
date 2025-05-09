package com.ali.user.open.core.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ResourceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ResourceUtils";

    static {
        t2o.a(71303252);
    }

    public static int getIdentifier(Context context, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d93fce9", new Object[]{context, str, str2})).intValue();
        }
        if (!TextUtils.isEmpty(KernelContext.packageName)) {
            str3 = KernelContext.packageName;
        } else {
            str3 = context.getPackageName();
        }
        SDKLogger.i(VideoControllerManager.ARRAY_KEY_RESOURCES, "resources = " + KernelContext.resources + " packageName = " + KernelContext.packageName);
        Resources resources = KernelContext.resources;
        if (resources != null) {
            return resources.getIdentifier(str2, str, str3);
        }
        return context.getResources().getIdentifier(str2, str, str3);
    }

    public static String getString(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        Resources resources = KernelContext.resources;
        if (resources != null) {
            return resources.getString(getIdentifier(context, "string", str));
        }
        return context.getResources().getString(getIdentifier(context, "string", str));
    }

    public static String getString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str}) : getString(KernelContext.getApplicationContext(), str);
    }
}
