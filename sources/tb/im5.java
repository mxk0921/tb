package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class im5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HISCLIENTCACHE = 5172138049776867429L;

    static {
        t2o.a(729809044);
    }

    public static /* synthetic */ Object ipc$super(im5 im5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserHIsClientCache");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject i = dXRuntimeContext.i();
        if (i != null) {
            boolean f = b3b.f(b3b.b(i));
            bqa.d("DataParserHIsClientCache", "isRemoteData = " + f);
            return Boolean.valueOf(!f);
        }
        bqa.d("DataParserHIsClientCache", "default false");
        return Boolean.FALSE;
    }
}
