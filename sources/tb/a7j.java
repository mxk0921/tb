package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a7j extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long MTOP_RETMSGDATA_PARSER = 6381452121775884442L;

    static {
        t2o.a(614465685);
    }

    public static /* synthetic */ Object ipc$super(a7j a7jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/MtopRetMsgDataParser");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str) || (split = str.split("::")) == null || split.length <= 1) {
            return null;
        }
        return split[split.length - 1];
    }
}
