package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s44 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long COMMITINTERACTEND = -981405392948311061L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8<nwi> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(573571189);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public s44 build(nwi nwiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s44) ipChange.ipc$dispatch("6a7e78e0", new Object[]{this, nwiVar});
            }
            return new s44();
        }
    }

    static {
        t2o.a(573571188);
    }

    public static /* synthetic */ Object ipc$super(s44 s44Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/event/CommitInteractEndAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXRuntimeContext p = tk6Var.p();
        if (p != null && (p.S() instanceof t36)) {
            ecj.b(((t36) p.S()).f(), n8Var.c("success").booleanValue());
        }
        return null;
    }
}
