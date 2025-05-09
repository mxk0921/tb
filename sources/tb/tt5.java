package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_URLCODETOOL = -8358760303821231753L;
    public static final String KEY_DECODE = "decode";
    public static final String KEY_ENCODE = "encode";

    static {
        t2o.a(745538094);
    }

    public static /* synthetic */ Object ipc$super(tt5 tt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserUrlCodeTool");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(valueOf2)) {
                return null;
            }
            try {
                if ("encode".equals(valueOf)) {
                    return URLEncoder.encode(valueOf2, "utf-8");
                }
                if ("decode".equals(valueOf)) {
                    return URLDecoder.decode(valueOf2, "utf-8");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
