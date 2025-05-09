package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bxe extends zzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int c;

    static {
        t2o.a(628097113);
    }

    public bxe(int i) {
        this.c = i;
    }

    public static /* synthetic */ Object ipc$super(bxe bxeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/monitorthread/tasks/InitAckTask");
    }

    @Override // tb.zzi
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        d(this.c).k();
        if (MsgRouter.e().f().d(this.c).e().b(null, p2j.f)) {
            d(this.c).p();
        }
    }

    @Override // tb.zzi
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 1;
    }
}
