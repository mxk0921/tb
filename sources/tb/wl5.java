package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wl5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETEXTERNALDATA = -3912256213245903531L;

    static {
        t2o.a(729809040);
    }

    public static /* synthetic */ Object ipc$super(wl5 wl5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserHGetExternalData");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            bqa.d("DXDataParserHGetExternalData", "operationList == null");
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            bqa.d("DXDataParserHGetExternalData", "key或者biz不是String，key: " + obj2);
            return null;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService != null) {
            return iHomeDataService.getExternalDataByKey((String) obj, (String) obj2);
        }
        bqa.d("DXDataParserHGetExternalData", "homeDataService == null");
        return null;
    }
}
