package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s1s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "tdcolor";

    static {
        t2o.a(155189294);
    }

    public static /* synthetic */ Object ipc$super(s1s s1sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicx3/parser/TDColor");
    }

    public final Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3364cdfb", new Object[]{this, objArr, dXRuntimeContext});
        }
        String a2 = isl.a(objArr, 2, new Class[]{null, String.class});
        if (TextUtils.isEmpty(a2)) {
            Object obj = objArr[0];
            String str = (String) objArr[1];
            if (obj == null) {
                return str;
            }
            String obj2 = obj.toString();
            if (b24.e(obj2, 0) == 0) {
                return str;
            }
            if (!obj2.startsWith("#")) {
                return obj2.concat("#");
            }
            return obj2;
        }
        throw new RuntimeException(a2);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception e) {
            UnifyLog.e(PARSER_TAG, String.valueOf(objArr), e.toString(), String.valueOf(dXRuntimeContext));
            return null;
        }
    }
}
