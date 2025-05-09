package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.task.BehaviXTaskType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tlj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750642);
    }

    public static w82 a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w82) ipChange.ipc$dispatch("c6c53336", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        if (str.equals("upload")) {
            return new hmv(BehaviXTaskType.UPLOAD_TASK, map, null);
        }
        if (!str.equals("batch")) {
            return null;
        }
        return new wkv(BehaviXTaskType.BATCH_TASK, map, null);
    }
}
