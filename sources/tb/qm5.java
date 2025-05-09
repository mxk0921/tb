package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIGHLIGHTSTRTOMAP = 8990062587502094563L;

    static {
        t2o.a(779092638);
    }

    public static /* synthetic */ Object ipc$super(qm5 qm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/DXDataParserHighlightStrToMap");
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
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && !TextUtils.isEmpty(String.valueOf(obj))) {
                String[] split = String.valueOf(objArr[i]).split(":");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return JSON.toJSONString(hashMap);
    }
}
