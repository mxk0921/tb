package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_DETAILURLENCODE = k06.a("detailUrlEncode");

    static {
        t2o.a(912261520);
    }

    public static /* synthetic */ Object ipc$super(vj5 vj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/content/DXDataParserDetailUrlEncode");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        try {
            Object obj = objArr[0];
            if (obj == null || !(obj instanceof String)) {
                return "";
            }
            return URLEncoder.encode((String) obj, "UTF-8");
        } catch (Throwable th) {
            tgh.c("DXDataParserDetailUrlEncode", "DataParser DetailUrlEncode error : ", th);
            return "";
        }
    }
}
