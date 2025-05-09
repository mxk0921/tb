package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class o6v extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String ULTRONBRIDGE = "2110160960920969469";
    public final mqk b;
    public final int c = -101;
    public final int d = -102;
    public final int e = -103;
    public final int f = -104;
    public final int g = -105;
    public final int h = -106;
    public final int i = -107;
    public final String j = n6v.EXTRA_KEY_ABILITY_CALLBACK;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements w8<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final mqk f25171a;

        static {
            t2o.a(350224428);
            t2o.a(336592930);
        }

        public a(mqk mqkVar) {
            this.f25171a = mqkVar;
        }

        /* renamed from: a */
        public o6v build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o6v) ipChange.ipc$dispatch("5b0ca549", new Object[]{this, obj});
            }
            return new o6v(this.f25171a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        static {
            t2o.a(350224429);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(350224427);
    }

    public o6v(mqk mqkVar) {
        this.b = mqkVar;
    }

    public static /* synthetic */ Object ipc$super(o6v o6vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/ability/UltronBridgeAbility");
    }

    public final b8 i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("aca05921", new Object[]{this, new Integer(i)});
        }
        return new b8(new a8(i, "internal error"));
    }

    /* renamed from: j */
    public c8<?> f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        String i;
        DXRuntimeContext dXRuntimeContext;
        b8v b8vVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (this.b == null) {
            return i(this.c);
        }
        if (tk6Var == null) {
            return i(this.d);
        }
        if (n8Var == null || (i = n8Var.i("eventType")) == null) {
            return i(this.e);
        }
        JSONObject g = n8Var.g("eventFields");
        View l = tk6Var.l();
        if ((l != null ? l.getTag(DXWidgetNode.TAG_WIDGET_NODE) : null) instanceof DXWidgetNode) {
            Object tag = l.getTag(DXWidgetNode.TAG_WIDGET_NODE);
            if (tag != null) {
                dXRuntimeContext = ((DXWidgetNode) tag).getDXRuntimeContext();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.dinamicx.widget.DXWidgetNode");
            }
        } else {
            dXRuntimeContext = tk6Var.p();
        }
        if (dXRuntimeContext == null) {
            return i(this.f);
        }
        Object q = dXRuntimeContext.q();
        if (!(q instanceof Map)) {
            q = null;
        }
        Map map = (Map) q;
        if (map == null) {
            return i(this.g);
        }
        mqk mqkVar = this.b;
        if (!(mqkVar instanceof f8v)) {
            b8vVar = null;
        } else if (mqkVar != null) {
            b8vVar = ((f8v) mqkVar).e();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.android.ultron.event.base.UltronEventHandler");
        }
        if (b8vVar == null) {
            return i(this.i);
        }
        if (!(map.get(xo7.TAG_DINAMICX_VIEW_COMPONENT) instanceof DMComponent)) {
            return i(this.h);
        }
        Object obj = map.get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        if (obj != null) {
            b8vVar.p((DMComponent) obj);
            b8vVar.u("bizParams", map.get("bizParams"));
            b8vVar.u("triggerView", dXRuntimeContext.D());
            b8vVar.r(new DMEvent(i, g, null));
            b8vVar.t(i);
            b8vVar.u(this.j, u8Var);
            mqk mqkVar2 = this.b;
            if (mqkVar2 instanceof f8v) {
                if (mqkVar2 != null) {
                    ((f8v) mqkVar2).k(b8vVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.alibaba.android.ultron.event.base.UltronEventHandler");
                }
            }
            return new f8();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.ultron.datamodel.imp.DMComponent");
    }
}
