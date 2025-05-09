package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.recommend.SmartLayerRecommendPopTemplateProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l7q extends f5q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SmartLayerRecommendPopTemplateProcessor f23160a;

    static {
        t2o.a(295699796);
    }

    public l7q(SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor) {
        this.f23160a = smartLayerRecommendPopTemplateProcessor;
    }

    public static /* synthetic */ Object ipc$super(l7q l7qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/handler/SmartRecommendEventHandler");
    }

    @Override // tb.f5q
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        SmartLayerRecommendPopTemplateProcessor smartLayerRecommendPopTemplateProcessor = this.f23160a;
        if (smartLayerRecommendPopTemplateProcessor != null) {
            smartLayerRecommendPopTemplateProcessor.handleEvent(objArr);
        }
    }

    @Override // tb.f5q
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9a13924", new Object[]{this});
        }
        return "recommend_popview";
    }
}
