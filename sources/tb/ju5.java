package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ju5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RDISPATCHSLIDERAPPEAREVENT = 4903107558643966586L;
    public static final int KEY_DELAY_TIME = 3;
    public static final int KEY_LENGTH = 0;
    public static final int KEY_MAX_DELAY_TIME = 4;
    public static final int KEY_POINT_INDEX = 2;
    public static final int KEY_USER_ID = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f22222a;
        public final /* synthetic */ DXPageChangeEvent b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public a(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i, int i2) {
            this.f22222a = dXRuntimeContext;
            this.b = dXPageChangeEvent;
            this.c = str;
            this.d = i;
            this.e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ju5.a(ju5.this, this.f22222a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f22223a;
        public final /* synthetic */ DXPageChangeEvent b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public b(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i) {
            this.f22223a = dXRuntimeContext;
            this.b = dXPageChangeEvent;
            this.c = str;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ju5.b(ju5.this, this.f22223a, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(486539347);
    }

    public static /* synthetic */ void a(ju5 ju5Var, DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f22b99", new Object[]{ju5Var, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2)});
        } else {
            ju5Var.l(dXRuntimeContext, dXPageChangeEvent, str, i, i2);
        }
    }

    public static /* synthetic */ void b(ju5 ju5Var, DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936cc789", new Object[]{ju5Var, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i)});
        } else {
            ju5Var.k(dXRuntimeContext, dXPageChangeEvent, str, i);
        }
    }

    public static /* synthetic */ Object ipc$super(ju5 ju5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXDispatchSliderAppearEvent");
    }

    public final void c(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e910732d", new Object[]{this, dXRuntimeContext, str});
        } else {
            e(dXRuntimeContext, str, true);
        }
    }

    public final void d(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0936d3", new Object[]{this, dXRuntimeContext, str});
        } else {
            e(dXRuntimeContext, str, false);
        }
    }

    public final void e(DXRuntimeContext dXRuntimeContext, String str, boolean z) {
        DXPageChangeEvent dXPageChangeEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c5552", new Object[]{this, dXRuntimeContext, str, new Boolean(z)});
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = dXRuntimeContext.W().queryWidgetNodeByUserId(str);
        if (queryWidgetNodeByUserId != null) {
            if (z) {
                dXPageChangeEvent = new DXPageChangeEvent(5288671110273408574L);
            } else {
                dXPageChangeEvent = new DXPageChangeEvent(5388973340095122049L);
            }
            queryWidgetNodeByUserId.postEvent(dXPageChangeEvent);
        }
    }

    public final void f(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57def7c9", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2)});
        } else if (i2 != 0) {
            dXRuntimeContext.L().postDelayed(new b(dXRuntimeContext, dXPageChangeEvent, str, i), i2);
        } else {
            k(dXRuntimeContext, dXPageChangeEvent, str, i);
        }
    }

    public final void g(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fff309", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i3 != 0) {
            dXRuntimeContext.L().postDelayed(new a(dXRuntimeContext, dXPageChangeEvent, str, i, i2), i3);
        } else {
            l(dXRuntimeContext, dXPageChangeEvent, str, i, i2);
        }
    }

    public final int h(DXRuntimeContext dXRuntimeContext, Object obj, Object obj2) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7e8951d", new Object[]{this, dXRuntimeContext, obj, obj2})).intValue();
        }
        if (obj == null) {
            return 0;
        }
        try {
            int parseInt = Integer.parseInt((String) obj);
            if (obj2 == null) {
                i = 0;
            } else {
                i = Integer.parseInt((String) obj2);
            }
            JSONObject i3 = dXRuntimeContext.i();
            if (i3 != null) {
                if (!i3.getBooleanValue("_slide_is_first_load")) {
                    parseInt = Math.max(parseInt, i);
                }
                i2 = parseInt;
                i3.put("_slide_is_first_load", (Object) Boolean.TRUE);
            }
        } catch (Throwable th) {
            fve.c("DXDispatchSliderAppearEvent", "getDelayTime error", th);
        }
        return i2;
    }

    public final int i(DXRuntimeContext dXRuntimeContext) {
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5566ff51", new Object[]{this, dXRuntimeContext})).intValue();
        }
        JSONObject i = dXRuntimeContext.i();
        if (i == null || (integer = i.getInteger("_slide_last_index")) == null) {
            return -1;
        }
        return integer.intValue();
    }

    public final String j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19ad058a", new Object[]{this, str, new Integer(i)});
        }
        return str + i;
    }

    public final void k(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4a36fc", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i)});
            return;
        }
        e(dXRuntimeContext, j(str, dXPageChangeEvent.pageIndex), true);
        e(dXRuntimeContext, j(str, i), false);
    }

    public final void l(DXRuntimeContext dXRuntimeContext, DXPageChangeEvent dXPageChangeEvent, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d19378", new Object[]{this, dXRuntimeContext, dXPageChangeEvent, str, new Integer(i), new Integer(i2)});
            return;
        }
        if (dXPageChangeEvent.pageIndex == i) {
            c(dXRuntimeContext, j(str, i));
        }
        if (i2 == i) {
            d(dXRuntimeContext, j(str, i2));
        }
    }

    public final void m(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f2050c", new Object[]{this, dXRuntimeContext, new Integer(i)});
            return;
        }
        JSONObject i2 = dXRuntimeContext.i();
        if (i2 != null) {
            i2.put("_slide_last_index", (Object) Integer.valueOf(i));
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 5) {
            Object obj = objArr[0];
            if (obj instanceof Integer) {
                i2 = ((Integer) obj).intValue();
            } else if (obj instanceof String) {
                try {
                    i2 = Integer.parseInt((String) obj);
                } catch (NumberFormatException e) {
                    fve.c("DispatchSliderAppearEvent", "parse int error", e);
                }
            } else {
                i2 = -1;
            }
            Object obj2 = objArr[1];
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (i2 != -1 && !TextUtils.isEmpty(str)) {
                Object obj3 = objArr[2];
                if (obj3 instanceof Integer) {
                    i = ((Integer) obj3).intValue();
                } else {
                    if (obj3 instanceof String) {
                        try {
                            i = Integer.parseInt((String) obj3);
                        } catch (NumberFormatException e2) {
                            fve.c("DispatchSliderAppearEvent", "parse int error", e2);
                        }
                    }
                    i = -1;
                }
                if (dXEvent instanceof DXPageChangeEvent) {
                    DXPageChangeEvent dXPageChangeEvent = (DXPageChangeEvent) dXEvent;
                    int i3 = i(dXRuntimeContext);
                    Object obj4 = objArr[3];
                    Object obj5 = objArr[4];
                    if (-1 != i) {
                        g(dXRuntimeContext, dXPageChangeEvent, str, i, i3, h(dXRuntimeContext, obj4, obj5));
                    } else {
                        f(dXRuntimeContext, dXPageChangeEvent, str, i3, h(dXRuntimeContext, obj4, obj5));
                    }
                    m(dXRuntimeContext, dXPageChangeEvent.pageIndex);
                }
            }
        }
    }
}
