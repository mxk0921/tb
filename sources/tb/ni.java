package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ni extends cg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final AURAFlowData c;
    public final AURAGlobalData d;

    static {
        t2o.a(79691782);
    }

    public ni(String str, String str2, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData) {
        super(str, str2);
        this.c = aURAFlowData;
        this.d = aURAGlobalData;
    }

    public static /* synthetic */ Object ipc$super(ni niVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURAErrorAspectInfo");
    }

    public AURAFlowData c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAFlowData) ipChange.ipc$dispatch("7ff539a0", new Object[]{this});
        }
        return this.c;
    }

    public AURAGlobalData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this});
        }
        return this.d;
    }
}
