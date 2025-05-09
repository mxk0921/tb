package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class bz extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740737);
    }

    public static /* synthetic */ Object ipc$super(bz bzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/event/dx/AbsUMFDxEventHandler");
    }

    public final void a(bxu bxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b50b3cc", new Object[]{this, bxuVar});
            return;
        }
        f8v d = bxuVar.d();
        if (d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("umfEventModel", bxuVar);
            b8v e = d.e();
            e.v(hashMap);
            e.t(bxuVar.e());
            d.k(e);
        }
    }

    public <T> T b(String str, Map<String, Object> map, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e1a9a7f8", new Object[]{this, str, map, cls});
        }
        T t = (T) map.get(str);
        if (t == null) {
            b4e a2 = dxu.a();
            a2.e("AbsUMFDxEventHandler", "handleEvent#value of " + str + " is null");
            return null;
        }
        try {
        } catch (Throwable th) {
            b4e a3 = dxu.a();
            a3.e("AbsUMFDxEventHandler", "handleEvent#exception for retrieve " + str + ",error=" + th.getMessage());
        }
        if (t.getClass() == cls) {
            return t;
        }
        b4e a4 = dxu.a();
        a4.e("AbsUMFDxEventHandler", "handleEvent#type of " + str + " is not match");
        return null;
    }

    public abstract boolean c(bxu bxuVar);

    @Override // tb.ob5, tb.mvb
    public final void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
            dxu.a().e("AbsUMFDxEventHandler", "handleEvent#args is empty");
        } else if (dXRuntimeContext != null) {
            Object q = dXRuntimeContext.q();
            if (!(q instanceof Map)) {
                dxu.a().e("AbsUMFDxEventHandler", "handleEvent#dxUserContext is not map type");
                return;
            }
            try {
                map = (Map) q;
            } catch (Throwable unused) {
                map = null;
            }
            if (map == null) {
                dxu.a().e("AbsUMFDxEventHandler", "handleEvent#dxUserContextMap is null");
                return;
            }
            AURARenderComponent aURARenderComponent = (AURARenderComponent) b(hn.KEY_USER_CONTEXT_RENDER_COMPONENT, map, AURARenderComponent.class);
            if (aURARenderComponent == null) {
                dxu.a().e("AbsUMFDxEventHandler", "handleEvent#UMFTaobaoAdapterConstant.DX.KEY_USER_CONTEXT_UMF_COMPONENT is null");
                return;
            }
            txu txuVar = (txu) b(hn.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT, map, txu.class);
            if (txuVar == null) {
                dxu.a().e("AbsUMFDxEventHandler", "handleEvent#UMFTaobaoAdapterConstant.DX.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT is null");
                return;
            }
            f8v f8vVar = (f8v) txuVar.c("eventHandler", f8v.class);
            if (f8vVar == null) {
                dxu.a().e("AbsUMFDxEventHandler", "handleEvent#UMFConstants.RuntimeContext.KEY_EVENT_HANDLER is null");
                return;
            }
            bxu bxuVar = new bxu(String.valueOf(dXEvent.getEventId()), txuVar, aURARenderComponent, objArr);
            bxuVar.i(dXEvent);
            bxuVar.k(f8vVar);
            c(bxuVar);
        }
    }
}
