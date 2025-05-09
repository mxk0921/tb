package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import java.lang.ref.WeakReference;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class to7 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HANDLEDINAMICXPAGEEVENT = -5008555633947216625L;
    public static WeakReference<com.alibaba.android.ultron.vfw.instance.a> c;
    public static WeakReference<OrderConfigs> d;
    public boolean b = true;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28837a = wbl.z();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f28838a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f28838a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (to7.a(to7.this)) {
                RecyclerView b = to7.b(to7.this);
                if (b == null || b.getScrollState() == 0) {
                    to7.c(to7.this, this.f28838a, this.b, this.c);
                } else {
                    jb6.n(this);
                }
            } else {
                to7.c(to7.this, this.f28838a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f28839a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;
        public final /* synthetic */ boolean d;

        public b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, boolean z) {
            this.f28839a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (to7.a(to7.this)) {
                RecyclerView b = to7.b(to7.this);
                if (b == null || b.getScrollState() == 0) {
                    to7.d(to7.this, this.f28839a, this.b, this.c, this.d);
                } else {
                    jb6.n(this);
                }
            } else {
                to7.d(to7.this, this.f28839a, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(614465601);
    }

    public to7(com.alibaba.android.ultron.vfw.instance.a aVar, OrderConfigs orderConfigs) {
        c = new WeakReference<>(aVar);
        d = new WeakReference<>(orderConfigs);
    }

    public static /* synthetic */ boolean a(to7 to7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c800a8fb", new Object[]{to7Var})).booleanValue();
        }
        return to7Var.f28837a;
    }

    public static /* synthetic */ RecyclerView b(to7 to7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("74698fdf", new Object[]{to7Var});
        }
        return to7Var.f();
    }

    public static /* synthetic */ void c(to7 to7Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7727e1c7", new Object[]{to7Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            to7Var.e(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void d(to7 to7Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d975ae", new Object[]{to7Var, dXEvent, objArr, dXRuntimeContext, new Boolean(z)});
        } else {
            to7Var.i(dXEvent, objArr, dXRuntimeContext, z);
        }
    }

    public static /* synthetic */ Object ipc$super(to7 to7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/event/DinamicXPageEventDispatcherV3");
    }

    public final void e(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a6a8e", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        new sj8().handleEvent(dXEvent, objArr, dXRuntimeContext);
        uj8.f("DinamicXPageEventDispatcherV3", "handleEvent", "handle event by EventChainHandler");
        if (objArr != null && objArr.length != 0 && !TextUtils.isEmpty(objArr[0].toString())) {
            jbv.c(objArr[0].toString(), dXRuntimeContext);
        }
    }

    public final RecyclerView f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("5813c875", new Object[]{this});
        }
        OrderConfigs orderConfigs = d.get();
        if (orderConfigs == null) {
            return null;
        }
        ViewGroup viewGroup = orderConfigs.b().get(OrderConfigs.RECYCLERVIEW);
        if (viewGroup instanceof RecyclerView) {
            return (RecyclerView) viewGroup;
        }
        return null;
    }

    public void g(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ffdce9", new Object[]{this, orderConfigs});
        } else {
            d = new WeakReference<>(orderConfigs);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a43fc1", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!this.b || !uel.l("enableRemoveCacheRenderEvent", true)) {
            try {
                if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableHandleEventReport", true) && objArr.length > 0 && dXRuntimeContext.i() != null && dXRuntimeContext.i().get("tag") != null) {
                    String obj = dXRuntimeContext.i().get("tag").toString();
                    String obj2 = objArr[0].toString();
                    if (!oml.b().contains(obj2)) {
                        idl.c(idl.a.a(OrderBizCode.orderList, obj + "_" + obj2).sampling(v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "handleEventReportSampling", 0.001f)).message(dXRuntimeContext.i().toString()));
                    }
                }
            } catch (Exception unused) {
            }
            uj8.f("DinamicXPageEventDispatcherV3", "handleEvent", String.valueOf(objArr));
            boolean z = objArr != null && objArr.length > 0 && (objArr[0] instanceof String);
            if (!z || sj8.h(dXRuntimeContext, (String) objArr[0]) == null) {
                if (objArr == null || objArr.length <= 2) {
                    str = "normal";
                } else {
                    str = (String) objArr[objArr.length - 1];
                }
                if ("runModePost".equals(str)) {
                    objArr[objArr.length - 1] = null;
                    jb6.n(new b(dXEvent, objArr, dXRuntimeContext, z));
                    return;
                }
                i(dXEvent, objArr, dXRuntimeContext, z);
            } else if (objArr.length <= 1 || !"runModePost".equals(objArr[objArr.length - 1])) {
                e(dXEvent, objArr, dXRuntimeContext);
            } else {
                objArr[objArr.length - 1] = null;
                jb6.n(new a(dXEvent, objArr, dXRuntimeContext));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.taobao.android.dinamicx.expression.event.DXEvent r12, java.lang.Object[] r13, com.taobao.android.dinamicx.DXRuntimeContext r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.to7.i(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext, boolean):void");
    }
}
