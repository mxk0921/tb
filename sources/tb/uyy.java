package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uyy extends kkz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int e;

    static {
        t2o.a(598737115);
    }

    public uyy(int i) {
        this.e = i;
    }

    public static /* synthetic */ Object ipc$super(uyy uyyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/BackgroundNode");
    }

    @Override // tb.kkz
    public void n(jkz jkzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea16b542", new Object[]{this, jkzVar});
            return;
        }
        ckf.g(jkzVar, "props");
        ((fzy) jkzVar).v(this.e);
    }

    public final void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }
}
