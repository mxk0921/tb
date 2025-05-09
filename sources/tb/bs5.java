package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bs5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLIVEIMAGERATIO = -521746365956793992L;

    static {
        t2o.a(806355437);
    }

    public static /* synthetic */ Object ipc$super(bs5 bs5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/parser/DXDataParserTbliveImageRatio");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            try {
                String str2 = (String) obj;
                if (!arq.a(str2)) {
                    int lastIndexOf = str2.lastIndexOf("-", str2.lastIndexOf("-") - 1) + 1;
                    int lastIndexOf2 = str2.lastIndexOf(".");
                    if (lastIndexOf == 0 || lastIndexOf2 == -1) {
                        str = "0";
                    } else {
                        str = str2.substring(lastIndexOf, lastIndexOf2);
                    }
                    String[] split = str.split("-");
                    if (split.length != 2 || Integer.parseInt(split[0]) <= 0 || Integer.parseInt(split[1]) <= 0) {
                        return -1;
                    }
                    return Float.valueOf(Integer.parseInt(split[0]) / Integer.parseInt(split[1]));
                }
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }
}
