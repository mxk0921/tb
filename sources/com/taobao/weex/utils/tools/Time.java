package com.taobao.weex.utils.tools;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Time {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = pg1.ATOM_constructor)
    public long constructor;
    @JSONField(name = "destructor")
    public long destructor;
    @JSONField(name = "execTime")
    public long execTime;
    @JSONField(name = "taskEnd")
    public long taskEnd;
    @JSONField(name = "taskStart")
    public long taskStart;
    @JSONField(name = HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME)
    public long waitTime;

    static {
        t2o.a(985661843);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ead400", new Object[]{this});
            return;
        }
        waitTime();
        this.destructor = System.currentTimeMillis();
    }

    public void constructor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be7cf81", new Object[]{this});
        } else {
            this.constructor = System.currentTimeMillis();
        }
    }

    public void execTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b0a485", new Object[]{this});
        } else {
            this.execTime = this.taskEnd - this.taskStart;
        }
    }

    public void taskEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10aa3a9d", new Object[]{this});
            return;
        }
        this.taskEnd = System.currentTimeMillis();
        execTime();
        a();
    }

    public void taskStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39297e4", new Object[]{this});
        } else {
            this.taskStart = System.currentTimeMillis();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "time : {constructor = '" + this.constructor + "',taskStart = '" + this.taskStart + "',execTime = '" + this.execTime + "',waitTime = '" + this.waitTime + "',destructor = '" + this.destructor + "',taskEnd = '" + this.taskEnd + "'}";
    }

    public void waitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7535969", new Object[]{this});
        } else {
            this.waitTime = this.taskStart - this.constructor;
        }
    }
}
