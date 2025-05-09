package tb;

import android.app.Activity;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rda extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GO_BACK = "goBack";

    static {
        t2o.a(478150715);
    }

    public static /* synthetic */ Object ipc$super(rda rdaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/GobackEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        kmb kmbVar;
        Activity context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext != null && dXRuntimeContext.q() != null && (dXRuntimeContext.q() instanceof Map) && (obj = ((Map) dXRuntimeContext.q()).get("ViewEngine")) != null && (obj instanceof ViewEngine) && (kmbVar = (kmb) ((ViewEngine) obj).a0(kmb.class)) != null && (context = kmbVar.getContext()) != null) {
            context.finish();
        }
    }
}
