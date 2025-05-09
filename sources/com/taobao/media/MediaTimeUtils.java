package com.taobao.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaTimeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static StringBuilder mFormatBuilder = new StringBuilder();
    public static Formatter mFormatter = new Formatter(mFormatBuilder, Locale.getDefault());

    static {
        t2o.a(774897685);
    }

    public static int getDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6a32a9e", new Object[0])).intValue();
        }
        try {
            return Integer.valueOf(new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()))).intValue();
        } catch (Exception unused) {
            return 1970101;
        }
    }

    public static String msStringForTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de695163", new Object[]{new Integer(i)});
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        mFormatBuilder.setLength(0);
        if (i5 > 0) {
            return mFormatter.format("%02d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString();
        }
        return mFormatter.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }

    public static String sStringForTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ff44376", new Object[]{new Integer(i)});
        }
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        mFormatBuilder.setLength(0);
        if (i4 > 0) {
            return mFormatter.format("%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)).toString();
        }
        return mFormatter.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2)).toString();
    }
}
