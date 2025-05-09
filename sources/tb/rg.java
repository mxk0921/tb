package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.sg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rg extends bz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_AURA_EXPOSURE = 536060492787593232L;

    static {
        t2o.a(81788993);
    }

    public static /* synthetic */ Object ipc$super(rg rgVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/autoTrack/dx/AURAAutoTrackDXExposureEventHandler");
    }

    @Override // tb.bz
    public boolean c(bxu bxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b898517e", new Object[]{this, bxuVar})).booleanValue();
        }
        Object[] a2 = bxuVar.a();
        if (a2.length < 1) {
            return false;
        }
        Object obj = a2[0];
        if (!(obj instanceof String)) {
            return false;
        }
        AURARenderComponent f = bxuVar.f();
        Object e = bxuVar.g().e();
        if (!(e instanceof lo) || f == null) {
            return false;
        }
        sg.a(new sg.a(((lo) e).c(), f, (String) obj, null));
        return true;
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
