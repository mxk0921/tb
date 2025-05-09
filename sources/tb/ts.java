package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ts extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740433);
    }

    public static /* synthetic */ Object ipc$super(ts tsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/event/dx/AbsAURADxEventHandler");
    }

    public final void b(String str, qi qiVar, nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff8d49d", new Object[]{this, str, qiVar, nbbVar});
        } else {
            pi.b(nbbVar, str, qiVar);
        }
    }

    public abstract boolean c(qi qiVar, nbb nbbVar);

    public final void d(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, nbb nbbVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3494de", new Object[]{this, dXEvent, objArr, dXRuntimeContext, nbbVar, aURARenderComponent});
            return;
        }
        qi qiVar = new qi();
        qiVar.p(String.valueOf(dXEvent.getEventId()));
        qiVar.t(aURARenderComponent);
        qiVar.l(objArr);
        qiVar.m(dXEvent);
        qiVar.k(qi.EXT_KEY_DX_RUNTIME_CONTEXT, dXRuntimeContext);
        c(qiVar, nbbVar);
    }

    public final boolean e(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("684584ba", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null) {
            return false;
        }
        return aURARenderComponentData.isDisable();
    }

    public final void f(DXEvent dXEvent, Object[] objArr, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0926797", new Object[]{this, dXEvent, objArr, aURARenderComponent});
            return;
        }
        ck.b b = ck.b.b();
        b.i("AURA/action").g("eventHandle", getClass().getName()).d("dxEvent", dXEvent.getEventId()).g("target", aURARenderComponent.key);
        ck.g().e("AbsUMFDxEventHandler", b.a());
    }

    @Override // tb.ob5, tb.mvb
    public final void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!a(objArr, dXRuntimeContext)) {
            qh qhVar = (qh) dXRuntimeContext.q();
            qhVar.n(dXEvent);
            qhVar.m(objArr);
            if (!e(qhVar.b)) {
                f(dXEvent, objArr, qhVar.b);
                d(dXEvent, objArr, dXRuntimeContext, qhVar.f26744a.c(), qhVar.b);
            }
        }
    }

    public final boolean a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cad5dd76", new Object[]{this, objArr, dXRuntimeContext})).booleanValue();
        }
        if (objArr == null || objArr.length <= 0) {
            ck.g().b("AbsUMFDxEventHandler", "checkParamsInvalid", "args is empty");
            return true;
        } else if (dXRuntimeContext == null) {
            return true;
        } else {
            Object q = dXRuntimeContext.q();
            if (!(q instanceof qh)) {
                ck.g().b("AbsUMFDxEventHandler", "checkParamsInvalid", "dxUserContextObj is not AURADXUserContext type");
                return true;
            }
            qh qhVar = (qh) q;
            if (qhVar.b == null) {
                ck.g().b("AbsUMFDxEventHandler", "checkParamsInvalid", "mRenderComponent is null");
                return true;
            }
            lo loVar = qhVar.f26744a;
            if (loVar != null && loVar.c() != null) {
                return false;
            }
            ck.g().b("AbsUMFDxEventHandler", "checkParamsInvalid", "AURAInstance is null");
            return true;
        }
    }
}
