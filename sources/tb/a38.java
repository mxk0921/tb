package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a38 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements w8<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public a38 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a38) ipChange.ipc$dispatch("846f7dc4", new Object[]{this, obj});
            }
            return new a38();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a14bf72b", new Object[]{this})).longValue();
            }
            return a38.l();
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(a38 a38Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/DxPostEventAbility");
    }

    public static final /* synthetic */ long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a2c479c", new Object[0])).longValue();
        }
        return 3396478488960647823L;
    }

    /* renamed from: j */
    public c8<?> f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXWidgetNode q;
        DXWidgetNode q2;
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXWidgetNode dXWidgetNode = null;
        Object a2 = n8Var != null ? n8Var.a("eventId") : null;
        if (!(a2 instanceof String)) {
            a2 = null;
        }
        String str = (String) a2;
        if (str == null || str.length() == 0) {
            return new b8(new a8(-10009, "error info = eventId is null"), true);
        }
        Object a3 = n8Var != null ? n8Var.a(pl4.KEY_NODE_ID) : null;
        if (!(a3 instanceof String)) {
            a3 = null;
        }
        String str2 = (String) a3;
        DXEvent dXEvent = new DXEvent(Long.parseLong(str));
        if (!(tk6Var == null || (q2 = tk6Var.q()) == null || (queryRootWidgetNode = q2.queryRootWidgetNode()) == null)) {
            dXWidgetNode = queryRootWidgetNode.queryWidgetNodeByUserId(str2);
        }
        if (dXWidgetNode != null) {
            dXWidgetNode.postEvent(dXEvent);
        } else if (!(tk6Var == null || (q = tk6Var.q()) == null)) {
            q.postEvent(dXEvent);
        }
        return new f8();
    }
}
