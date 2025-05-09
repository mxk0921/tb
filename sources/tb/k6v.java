package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k6v extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final com.alibaba.android.ultron.vfw.instance.a b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final com.alibaba.android.ultron.vfw.instance.a f22437a;
        public final String b;

        static {
            t2o.a(614465561);
            t2o.a(336592930);
        }

        public a(com.alibaba.android.ultron.vfw.instance.a aVar, String str) {
            this.f22437a = aVar;
            this.b = str;
        }

        /* renamed from: a */
        public k6v build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k6v) ipChange.ipc$dispatch("9f7fd4a8", new Object[]{this, obj});
            }
            return new k6v(this.f22437a, this.b);
        }
    }

    static {
        t2o.a(614465560);
    }

    public k6v(com.alibaba.android.ultron.vfw.instance.a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public static /* synthetic */ Object ipc$super(k6v k6vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UltronAbilityWrapper");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.b;
        if (aVar == null) {
            return new b8(new a8(-1, "ultron instance is null"), true);
        }
        f8v eventHandler = aVar.getEventHandler();
        if (eventHandler == null) {
            return new b8(new a8(-1, "ultron eventHandler is null"), true);
        }
        View l = tk6Var.l();
        int i = DXWidgetNode.TAG_WIDGET_NODE;
        if (l.getTag(i) instanceof DXWidgetNode) {
            dXRuntimeContext = ((DXWidgetNode) l.getTag(i)).getDXRuntimeContext();
        } else {
            dXRuntimeContext = tk6Var.p();
        }
        if (dXRuntimeContext == null || !(dXRuntimeContext.q() instanceof Map)) {
            uj8.a(k6v.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "DxUserContext not map");
            return null;
        }
        Map map = (Map) dXRuntimeContext.q();
        b8v e = eventHandler.e();
        e.u("bizParams", map.get("bizParams"));
        e.u("triggerView", dXRuntimeContext.D());
        Object obj = map.get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        if (!(obj instanceof DMComponent)) {
            return null;
        }
        e.p((DMComponent) obj);
        e.r(new DMEvent(this.c, n8Var.h(), null));
        e.t(this.c);
        e.u(n6v.EXTRA_KEY_ABILITY_CALLBACK, u8Var);
        eventHandler.k(e);
        return new f8();
    }
}
