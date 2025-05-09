package tb;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.InternalResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tbu extends vq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final s2d b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s2d e = tbu.e(tbu.this);
            if (e != null) {
                e.onCallback(new InternalResult(99, null, null, 6, null));
            }
        }
    }

    static {
        t2o.a(144703518);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbu(s2d s2dVar) {
        super(s2dVar);
        ckf.g(s2dVar, DataReceiveMonitor.CB_LISTENER);
        this.b = s2dVar;
    }

    public static final /* synthetic */ s2d e(tbu tbuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2d) ipChange.ipc$dispatch("716e62d", new Object[]{tbuVar});
        }
        return tbuVar.b;
    }

    public static /* synthetic */ Object ipc$super(tbu tbuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/callback/TrackedAbilityCallback");
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        MegaUtils.z(new a(), -1L);
        super.finalize();
    }
}
