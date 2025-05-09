package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xwu extends bz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_UTAP = 38447420286L;

    static {
        t2o.a(80740739);
    }

    public static /* synthetic */ Object ipc$super(xwu xwuVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/event/dx/UMFDXUTapEventHandler");
    }

    @Override // tb.bz
    public boolean c(bxu bxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b898517e", new Object[]{this, bxuVar})).booleanValue();
        }
        AURARenderComponent f = bxuVar.f();
        AURARenderComponentData aURARenderComponentData = f.data;
        if (aURARenderComponentData == null) {
            dxu.a().e("UMFDXUTapEventHandler", "handleEvent#UMFRenderComponentData is null");
            return false;
        }
        Map<String, List<Event>> map = aURARenderComponentData.events;
        if (map == null || map.isEmpty()) {
            b4e a2 = dxu.a();
            a2.e("UMFDXUTapEventHandler", "handleEvent#there is no events in component," + f);
            return false;
        }
        d(bxuVar, map);
        return true;
    }

    public final void d(bxu bxuVar, Map<String, List<Event>> map) {
        List<Event> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c943d29", new Object[]{this, bxuVar, map});
            return;
        }
        String c = bxuVar.c();
        for (Map.Entry<String, List<Event>> entry : map.entrySet()) {
            if (entry != null && c.equals(entry.getKey()) && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (Event event : value) {
                    bxuVar.l(event.getType());
                    bxuVar.j(event.getFields());
                    a(bxuVar);
                }
            }
        }
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
