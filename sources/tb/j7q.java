package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j7q extends d5q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final j5q b;

    static {
        t2o.a(295699795);
    }

    public j7q(SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor) {
        super(smartLayerDXTemplateProcessor);
        this.b = new j5q(smartLayerDXTemplateProcessor);
    }

    public static /* synthetic */ Object ipc$super(j7q j7qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/handler/SmartReceiveRightsHandler");
    }

    @Override // tb.f5q
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            this.b.c(objArr);
        }
    }

    @Override // tb.f5q
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9a13924", new Object[]{this});
        }
        return "receiveRights";
    }
}
