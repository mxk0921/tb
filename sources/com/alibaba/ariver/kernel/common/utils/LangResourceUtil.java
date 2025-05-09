package com.alibaba.ariver.kernel.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LangResourceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a43567e", new Object[]{new Integer(i)});
        }
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        Activity activity = rVEnvironmentService.getTopActivity().get();
        try {
            if (activity != null) {
                str = activity.getString(i);
            } else {
                str = rVEnvironmentService.getApplicationContext().getString(i);
            }
            return str;
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getString(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88a0c8f7", new Object[]{context, new Integer(i)});
        }
        if (context != null) {
            return context.getString(i);
        }
        return a(i);
    }

    public static String getString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{new Integer(i)}) : a(i);
    }
}
