package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m1z extends tjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int e;

    static {
        t2o.a(598737150);
    }

    public m1z(boolean z, int i) {
        this.e = i;
    }

    public static /* synthetic */ Object ipc$super(m1z m1zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/point_input/ClickableNode");
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        }
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d34db95", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    @Override // tb.tjz
    public void n(jkz jkzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea16b542", new Object[]{this, jkzVar});
            return;
        }
        ckf.g(jkzVar, "props");
        if (jkzVar instanceof fzy) {
            ((fzy) jkzVar).z(sjz.a(1));
        }
    }

    @Override // tb.tjz
    public boolean o(waz wazVar, phz phzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f5024db", new Object[]{this, wazVar, phzVar})).booleanValue();
        }
        ckf.g(wazVar, "layoutNode");
        ckf.g(phzVar, "rawEvent");
        if (phzVar.a() != 0) {
            return false;
        }
        mhz.INSTANCE.b(this.e, jhz.Companion.c(wazVar));
        return true;
    }
}
