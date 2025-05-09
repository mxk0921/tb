package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class q1z extends kkz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public z2z e;

    static {
        t2o.a(598736999);
    }

    public q1z(z2z z2zVar) {
        ckf.g(z2zVar, "shape");
        this.e = z2zVar;
    }

    public static /* synthetic */ Object ipc$super(q1z q1zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/ClipNode");
    }

    @Override // tb.kkz
    public void n(jkz jkzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea16b542", new Object[]{this, jkzVar});
            return;
        }
        ckf.g(jkzVar, "props");
        ((fzy) jkzVar).y(this.e);
        if (iiz.c()) {
            iiz.Companion.j("ClipNode applyProps");
        }
    }

    public final void o(z2z z2zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28721f5", new Object[]{this, z2zVar});
            return;
        }
        ckf.g(z2zVar, "<set-?>");
        this.e = z2zVar;
    }
}
