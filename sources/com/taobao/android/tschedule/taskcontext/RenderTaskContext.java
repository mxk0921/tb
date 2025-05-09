package com.taobao.android.tschedule.taskcontext;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RenderTaskContext extends TaskContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RenderParams params;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class RenderParams implements Serializable {
        public String editions;
        public boolean ignoreStatusCheck = false;
        public String spmVerifyValue;
        public String staticData;
        public List<TimeContent> timeContent;
        public long timeout;
        public String url;

        static {
            t2o.a(329253004);
        }
    }

    static {
        t2o.a(329253003);
    }

    public static /* synthetic */ Object ipc$super(RenderTaskContext renderTaskContext, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/taskcontext/RenderTaskContext");
    }

    @Override // com.taobao.android.tschedule.taskcontext.TaskContext
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", params=");
        RenderParams renderParams = this.params;
        if (renderParams == null) {
            str = "{}";
        } else {
            str = renderParams.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
