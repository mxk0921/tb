package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class st5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596798);
    }

    public static /* synthetic */ Object ipc$super(st5 st5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserUnicode");
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20c61504", new Object[]{this, str});
        }
        try {
            String[] split = str.split("\\\\u");
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < split.length; i++) {
                if (split[i].length() != 4) {
                    return str;
                }
                sb.append(Character.toChars(Integer.parseInt(split[i], 16)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null || !(obj instanceof String)) {
            return null;
        }
        return a((String) obj);
    }
}
