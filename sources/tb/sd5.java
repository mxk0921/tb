package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sd5 extends fw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596697);
    }

    public sd5() {
        this.d = "branch";
    }

    public static /* synthetic */ Object ipc$super(sd5 sd5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/DXBranchBlockNode");
    }

    @Override // tb.fw5
    public Object b(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1f85463f", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        int size = ((ArrayList) this.f19569a).size();
        if (size <= 1) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            Object b = ((fw5) ((ArrayList) this.f19569a).get(i)).b(dXEvent, dXRuntimeContext);
            if (b != null) {
                return b;
            }
        }
        return null;
    }
}
