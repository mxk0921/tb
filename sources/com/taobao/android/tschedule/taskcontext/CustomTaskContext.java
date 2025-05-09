package com.taobao.android.tschedule.taskcontext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CustomTaskContext extends TaskContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CustomParams params;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class CustomParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public List<String> blackList;
        public String classpath;
        public JSONObject customParams;
        public String workThread;

        static {
            t2o.a(329252996);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("mainThread");
            sb.append(this.workThread);
            sb.append(", classpath=");
            sb.append(this.classpath);
            sb.append(", customParams=");
            JSONObject jSONObject = this.customParams;
            String str = "{}";
            sb.append(jSONObject == null ? str : JSON.toJSONString(jSONObject));
            sb.append(", blackList=");
            List<String> list = this.blackList;
            if (list != null) {
                str = JSON.toJSONString(list);
            }
            sb.append(str);
            return sb.toString();
        }
    }

    static {
        t2o.a(329252995);
    }

    public static /* synthetic */ Object ipc$super(CustomTaskContext customTaskContext, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/taskcontext/CustomTaskContext");
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
        CustomParams customParams = this.params;
        if (customParams == null) {
            str = "{}";
        } else {
            str = customParams.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
