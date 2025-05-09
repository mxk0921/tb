package tb;

import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class l10 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GOODS_LIVE_CONTEXT = "key_lv_good_context";

    static {
        t2o.a(295698929);
    }

    public static xea a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("16025981", new Object[]{dXRuntimeContext, str});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        fl6 S = dXRuntimeContext.S();
        if (S instanceof jxg) {
            return ((jxg) S).f();
        }
        if (S instanceof beg) {
            return b((beg) S);
        }
        Object q = dXRuntimeContext.q();
        if (q instanceof HashMap) {
            Object obj = ((HashMap) q).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
            if (obj instanceof IDMComponent) {
                ArrayMap<String, Object> extMap = ((IDMComponent) obj).getExtMap();
                if (extMap == null) {
                    hha.c("AbstractGoodDXHandler", "getContextFromDX | extMap_null, className=" + str);
                    zha.l(dXRuntimeContext, "extMap_null", str);
                    return null;
                }
                Object obj2 = extMap.get("gl_ultron_context");
                if (obj2 instanceof xea) {
                    return (xea) obj2;
                }
                hha.c("AbstractGoodDXHandler", "getContextFromDX | context_null, className=" + str);
                zha.l(dXRuntimeContext, "context_null", str);
                return null;
            }
        }
        hha.c("AbstractGoodDXHandler", "getContextFromDX | no_match, className=" + str);
        zha.l(dXRuntimeContext, "no_match", str);
        return null;
    }

    public static xea b(beg begVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("d8ac16f3", new Object[]{begVar});
        }
        if (begVar == null || begVar.f() == null) {
            return null;
        }
        Object obj = begVar.f().get(KEY_GOODS_LIVE_CONTEXT);
        if (obj instanceof xea) {
            return (xea) obj;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(l10 l10Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/AbstractGoodDXHandler");
    }

    public abstract void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar);

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        xea a2 = a(dXRuntimeContext, getClass().getSimpleName());
        hha.b("AbstractGoodDXHandler", "handleEvent | className=".concat(getClass().getSimpleName()));
        c(dXEvent, objArr, dXRuntimeContext, a2);
    }
}
