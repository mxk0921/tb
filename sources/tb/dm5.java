package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETVALUE = 1466861815985736590L;

    static {
        t2o.a(486539380);
    }

    public static /* synthetic */ Object ipc$super(dm5 dm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserHGetValue");
    }

    public final Object a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ca4e057", new Object[]{this, dXRuntimeContext, str});
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null) {
            fve.e("DXDataParserHGetValue", "infoFlowContext is null");
            return null;
        }
        ICacheService iCacheService = (ICacheService) c.a(ICacheService.class);
        if (iCacheService == null) {
            fve.e("DXDataParserHGetValue", "cacheService is null");
            return null;
        }
        Map<String, Object> a2 = sz5.a(iCacheService);
        if (a2 != null) {
            return a2.get(str);
        }
        fve.e("DXDataParserHGetValue", "dxCache is null");
        return null;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr == null || objArr.length < 1) {
            return null;
        }
        if (objArr.length > 1) {
            obj = objArr[1];
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof String) || (a2 = a(dXRuntimeContext, (String) obj2)) == null) {
            return obj;
        }
        return a2;
    }
}
