package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.task.BehaviXTaskType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wkv extends w82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750644);
    }

    public wkv(BehaviXTaskType behaviXTaskType, Map<String, Object> map, x82 x82Var) {
        super(behaviXTaskType, map, x82Var);
    }

    public static /* synthetic */ Object ipc$super(wkv wkvVar, String str, Object... objArr) {
        if (str.hashCode() == 1548812690) {
            super.a();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/task/nativeTask/UploadBatchTask");
    }

    @Override // tb.w82
    public void a() {
        ly1 ly1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        super.a();
        Map<String, Object> map = this.b;
        if (map != null && (ly1Var = (ly1) map.get("baseNode")) != null) {
            d(ly1Var.d, ly1Var.h, ly1Var);
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str != null) {
            c(str, "BXBatch_PageLeave");
        }
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            oxa.a().d(str, str2);
        }
    }

    public final void d(String str, String str2, ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9735b64", new Object[]{this, str, str2, ly1Var});
        } else if ("leave".equals(str2)) {
            b(str);
        }
    }
}
