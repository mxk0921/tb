package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_JSONARRAYSTR2TEXTBYKEY = -4901210116374978365L;

    static {
        t2o.a(295698932);
    }

    public static /* synthetic */ Object ipc$super(pn5 pn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXDataParserJsonArrayStr2TextByKey");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            try {
                String str = (String) objArr[0];
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                int parseInt = Integer.parseInt((String) objArr[1]);
                JSONArray b = fkx.b(str);
                if (b == null) {
                    return null;
                }
                return ((JSONObject) b.get(parseInt)).getString("text");
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
