package tb;

import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ht extends zs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789182);
    }

    public static /* synthetic */ Object ipc$super(ht htVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/performance/extension/AbsAURAPerformanceCustomStageExtension");
    }

    public abstract List<AURAPerformanceStageModel> L();
}
