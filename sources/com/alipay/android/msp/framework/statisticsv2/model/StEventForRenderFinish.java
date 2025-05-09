package com.alipay.android.msp.framework.statisticsv2.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StEventForRenderFinish extends StEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public StEventForRenderFinish(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static /* synthetic */ Object ipc$super(StEventForRenderFinish stEventForRenderFinish, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/statisticsv2/model/StEventForRenderFinish");
    }

    public void setParseTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed97bff", new Object[]{this, new Long(j)});
        } else {
            putInfo(StEvent.PARSE_TIME, String.valueOf(j));
        }
    }

    public void setRenderTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6da9ab8", new Object[]{this, new Long(j)});
        } else {
            putInfo(StEvent.FILL_DATE_TIME, String.valueOf(j));
        }
    }

    public void setShowTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29565cb1", new Object[]{this, new Long(j)});
        } else {
            putInfo(StEvent.SHOW_TIME, String.valueOf(j));
        }
    }

    public void setTemplateDownLoadTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c8350c", new Object[]{this, new Long(j)});
        } else {
            putInfo(StEvent.NET_COST, String.valueOf(j));
        }
    }
}
