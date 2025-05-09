package com.taobao.message.notification.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ChannelUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IMBA = "imba";
    public static final String IM_BC = "im_bc";
    public static final String IM_CC = "im_cc";

    static {
        t2o.a(610271339);
    }

    public static String convertChannelType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f27d06e", new Object[]{new Integer(i)});
        }
        if (i >= 11000 && i < 12000) {
            return "im_bc";
        }
        if (i >= 20000 && i < 30000) {
            return "imba";
        }
        if (i < 0 || i >= 11000) {
            return "not-support-type";
        }
        return "im_cc";
    }
}
