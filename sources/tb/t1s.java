package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.weex.utils.tools.TimeCalculator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t1s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "tdPlatform";

    static {
        t2o.a(155189295);
    }

    public static /* synthetic */ Object ipc$super(t1s t1sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicx3/parser/TDPlatform");
    }

    public final Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3364cdfb", new Object[]{this, objArr, dXRuntimeContext});
        }
        String a2 = hsl.a(objArr, 1, new Class[]{String.class});
        if (!TextUtils.isEmpty(a2)) {
            throw new RuntimeException(a2);
        } else if (TimeCalculator.PLATFORM_ANDROID.equalsIgnoreCase(((String) objArr[0]).trim())) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception unused) {
            return null;
        }
    }
}
