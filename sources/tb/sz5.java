package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETVALUE = 8520638904096683930L;
    public static final String KEY_DX_CACHE_VALUE = "dxCacheValue";

    static {
        t2o.a(486539359);
    }

    public static Map<String, Object> a(ICacheService iCacheService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8c1d1e3", new Object[]{iCacheService});
        }
        try {
            return (Map) iCacheService.getCacheObject(KEY_DX_CACHE_VALUE, Map.class);
        } catch (ClassCastException e) {
            fve.c("DXHSetValueEventHandler", "getDxCacheValue ClassCastException error", e);
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(sz5 sz5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHSetValueEventHandler");
    }

    public final void b(cfc cfcVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde2d3da", new Object[]{this, cfcVar, str, obj});
            return;
        }
        ICacheService iCacheService = (ICacheService) cfcVar.a(ICacheService.class);
        if (iCacheService == null) {
            fve.e("DXHSetValueEventHandler", "cacheService is null");
            return;
        }
        Map a2 = a(iCacheService);
        if (a2 == null) {
            a2 = new HashMap(8);
            iCacheService.putCacheObject(KEY_DX_CACHE_VALUE, a2);
        }
        a2.put(str, obj);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        cfc c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof String) && (c = j18.c(dXRuntimeContext)) != null) {
            b(c, (String) objArr[0], objArr[1]);
        }
    }
}
