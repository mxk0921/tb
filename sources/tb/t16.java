package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t16 extends wv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28403a;
    public final String b;

    static {
        t2o.a(444597970);
    }

    public t16(String str, String str2, String str3) {
        this.b = str;
        this.f28403a = str2;
        this.eventType = (byte) 1;
    }

    public static /* synthetic */ Object ipc$super(t16 t16Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/node/event/DXJSEventProperty");
    }

    public final DXRuntimeContext findRootRuntimeContext(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("9b3c0e51", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        if (!(queryRootWidgetNode.getParentWidget() instanceof bi6) || ((bi6) queryRootWidgetNode.getParentWidget()).H() != 1) {
            return queryRootWidgetNode.getDXRuntimeContext();
        }
        return findRootRuntimeContext(queryRootWidgetNode.getParentWidget());
    }

    @Override // tb.nvb
    public boolean executeEvent(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        DXRuntimeContext findRootRuntimeContext = findRootRuntimeContext(dXRuntimeContext.W());
        if (findRootRuntimeContext == null || dXRuntimeContext.s() == null || dXRuntimeContext.s().f() == null || dXRuntimeContext.s().f().B() == null || findRootRuntimeContext.W() == null) {
            h36.g(h36.TAG, "call logic 失败 rootRuntimeContext == null");
            return false;
        } else if (dXRuntimeContext.p() == null) {
            h36.g(h36.TAG, "call logic 失败 runtimeContext.getDxTemplateItem() == null");
            return false;
        } else {
            cwb B = dXRuntimeContext.s().f().B();
            int hashCode = findRootRuntimeContext.p().d().hashCode();
            if (!B.b(hashCode)) {
                List<Pair<String, byte[]>> k = findRootRuntimeContext.W().getDxv4Properties().k();
                if (k == null || k.isEmpty()) {
                    h36.t("主线程加载 " + dXRuntimeContext.p().d() + " 的 logic 文件");
                    u16.b(findRootRuntimeContext.W());
                    k = findRootRuntimeContext.W().getDxv4Properties().k();
                }
                B.c(hashCode, dXRuntimeContext, k);
            }
            B.a(hashCode, dXRuntimeContext, this.b, this.f28403a, 1, new uw5[]{uw5.T(dXEvent)});
            return true;
        }
    }
}
