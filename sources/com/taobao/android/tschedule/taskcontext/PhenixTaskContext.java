package com.taobao.android.tschedule.taskcontext;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PhenixTaskContext extends TaskContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PhenixParams params;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class PhenixParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean cacheImg = false;
        public String imgModule;
        public List<String> imgUrls;

        static {
            t2o.a(329253002);
        }

        public String toString() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("imgModule");
            sb.append(this.imgModule);
            sb.append("cacheImg");
            sb.append(this.cacheImg);
            sb.append(", imgUrls=");
            List<String> list = this.imgUrls;
            if (list == null) {
                str = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
            } else {
                str = list.toString();
            }
            sb.append(str);
            return sb.toString();
        }
    }

    static {
        t2o.a(329253001);
    }

    public static /* synthetic */ Object ipc$super(PhenixTaskContext phenixTaskContext, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/taskcontext/PhenixTaskContext");
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
        PhenixParams phenixParams = this.params;
        if (phenixParams == null) {
            str = "{}";
        } else {
            str = phenixParams.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
