package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h18 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final evb f20357a;

    static {
        t2o.a(486539390);
    }

    public h18(evb evbVar) {
        this.f20357a = evbVar;
    }

    public static /* synthetic */ Object ipc$super(h18 h18Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/Dx3ParseWrapper");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object evalWithArgs = this.f20357a.evalWithArgs(objArr, dXRuntimeContext);
        if (eue.b()) {
            fve.k("Dx3ParseWrapper", "Dx3 DataParser ： " + this.f20357a.getClass().getSimpleName() + ", 耗时 ： " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
        return evalWithArgs;
    }
}
