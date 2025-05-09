package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_COLORPARSE = 8562985172480150788L;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Boolean> f23363a = new HashMap();

    static {
        t2o.a(745538084);
    }

    public static /* synthetic */ Object ipc$super(lj5 lj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserColorParse");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            if ((obj instanceof String) && (objArr[1] instanceof String)) {
                try {
                    String valueOf = String.valueOf(obj);
                    String concat = String.valueOf(objArr[0]).concat(String.valueOf(objArr[1]));
                    if (TextUtils.equals("LightColor", valueOf)) {
                        String valueOf2 = String.valueOf(objArr[1]);
                        Map<String, Boolean> map = f23363a;
                        if (((HashMap) map).containsKey(concat)) {
                            return ((HashMap) map).get(concat);
                        }
                        boolean c = y14.c(Color.parseColor(valueOf2));
                        ((HashMap) map).put(concat, Boolean.valueOf(c));
                        return Boolean.valueOf(c);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }
}
