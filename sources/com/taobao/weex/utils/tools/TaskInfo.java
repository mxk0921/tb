package com.taobao.weex.utils.tools;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaskInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    public String args;
    @JSONField(name = "relateTaskId")
    public int relateTaskId;

    static {
        t2o.a(985661842);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TaskInfo{args = '" + this.args + "',relateTaskId = '" + this.relateTaskId + "'}";
    }
}
