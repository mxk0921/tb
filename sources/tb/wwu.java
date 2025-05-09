package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wwu extends xwu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_URULETAP = 7023701163946200378L;

    static {
        t2o.a(80740738);
    }

    public static /* synthetic */ Object ipc$super(wwu wwuVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1197977218) {
            return new Boolean(super.c((bxu) objArr[0]));
        }
        if (hashCode == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/umf/node/service/render/event/dx/UMFDXURulesTapEventHandler");
    }

    @Override // tb.xwu, tb.bz
    public boolean c(bxu bxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b898517e", new Object[]{this, bxuVar})).booleanValue();
        }
        super.c(bxuVar);
        bxuVar.l("adjustRules");
        a(bxuVar);
        return true;
    }

    @Override // tb.xwu, tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
