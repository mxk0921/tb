package com.taobao.android.tschedule.taskcontext;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TaskContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String alias;
    public String bizCode;
    public String targetProcess;
    public String taskEnable;
    public String trigger;
    public String type;
    public String version = "1";
    public boolean multiProcess = false;
    public int runTimes = -1;

    static {
        t2o.a(329253005);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "type=" + this.type + ", version=" + this.version + ", trigger=" + this.trigger + ", bizCode=" + this.bizCode + ", multiProcess=" + this.multiProcess + ", targetProcess=" + this.targetProcess + ", taskEnable=" + this.taskEnable;
    }
}
