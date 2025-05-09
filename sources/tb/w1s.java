package tb;

import android.content.Context;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.TBMainHost;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w1s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "isTabbarHidden";

    static {
        t2o.a(478150728);
    }

    public static /* synthetic */ Object ipc$super(w1s w1sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/dataParse/TDTabbarVisibleParser");
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f04f275c", new Object[]{this, context})).booleanValue();
        }
        String name = context.getClass().getName();
        if (context == TBMainHost.b().getContext() || "com.taobao.android.trade.cart.CartTabActivity".equals(name)) {
            return false;
        }
        return true;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.q() == null || !(dXRuntimeContext.q() instanceof Map) || (obj = ((Map) dXRuntimeContext.q()).get("ViewEngine")) == null || !(obj instanceof ViewEngine)) {
            return Boolean.FALSE;
        }
        kmb kmbVar = (kmb) ((ViewEngine) obj).a0(kmb.class);
        if (kmbVar == null || !a(kmbVar.getContext())) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
