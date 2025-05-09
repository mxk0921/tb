package com.taobao.android.tschedule.taskcontext.baseparams;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wms;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TimeContent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MIN_DELAY_TIME = 3;
    public String content;
    public int delayTimeMax;
    public String spmVerifyValue;
    public String validTime;

    static {
        t2o.a(329253006);
    }

    public static TimeContent create(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeContent) ipChange.ipc$dispatch("3d73376e", new Object[]{str});
        }
        TimeContent timeContent = new TimeContent();
        timeContent.content = str;
        return timeContent;
    }

    public String stringify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8d18a8e", new Object[]{this});
        }
        return "TimeContent{validTime='" + this.validTime + "', content='" + this.content + "', spmVerifyValue='" + this.spmVerifyValue + "'}";
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (zms.b(wms.TIME_CONTENT_FIX, true)) {
            return this.content;
        }
        return super.toString();
    }
}
