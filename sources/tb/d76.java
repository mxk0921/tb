package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.h;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.weex2.LogisticsDetailHybridManager;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.schedule.ViewProxy;
import java.util.List;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d76 extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17634a;
        public final /* synthetic */ Context b;

        public a(boolean z, Context context) {
            this.f17634a = z;
            this.b = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 587072321) {
                return new Boolean(super.onDown((MotionEvent) objArr[0]));
            }
            if (hashCode == 1575121015) {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/core/dinamicX/view/DXOrderMaskFrameLayoutWidgetNode$1");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
            }
            if (this.f17634a) {
                d76.t(d76.this, this.b);
            }
            d76.u(d76.this, true, this.f17634a);
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            d76.u(d76.this, false, this.f17634a);
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GestureDetector f17635a;

        public b(d76 d76Var, GestureDetector gestureDetector) {
            this.f17635a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return this.f17635a.onTouchEvent(motionEvent);
        }
    }

    static {
        t2o.a(614465701);
    }

    public static /* synthetic */ Object ipc$super(d76 d76Var, String str, Object... objArr) {
        if (str.hashCode() == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXOrderMaskFrameLayoutWidgetNode");
    }

    public static /* synthetic */ void t(d76 d76Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e948d9", new Object[]{d76Var, context});
        } else {
            d76Var.v(context);
        }
    }

    public static /* synthetic */ void u(d76 d76Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6bcdd0", new Object[]{d76Var, new Boolean(z), new Boolean(z2)});
        } else {
            d76Var.y(z, z2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new d76();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof FrameLayout) {
            ViewProxy.setOnTouchListener(view, new b(this, new GestureDetector(context, new a(x(w()), context))));
        }
    }

    public final List<String> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c23ef8c7", new Object[]{this});
        }
        String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "touchDownDXEventList", "");
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        try {
            return JSON.parseArray(g, String.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final boolean x(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10823ae2", new Object[]{this, list})).booleanValue();
        }
        if (TextUtils.isEmpty(getUserId()) || list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(getUserId());
    }

    public final void v(Context context) {
        OrderConfigs l0;
        UltronWeex2DialogFragment i;
        com.taobao.android.weex_framework.a S2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e663e4a9", new Object[]{this, context});
        } else if (!LogisticsDetailHybridManager.enableMtopPrefetch() && (context instanceof i4d) && (l0 = ((i4d) context).l0()) != null && (i = l0.i()) != null && (S2 = i.S2()) != null && !S2.isDestroyed() && !S2.isInvalid()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("touchDownLogisticsUrl", (Object) getDXRuntimeContext().i().getJSONObject("events").getJSONArray("viewLogistic").getJSONObject(0).getJSONObject("fields").getString("url"));
                S2.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "trade.data.preload", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void y(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23526e78", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!TextUtils.isEmpty(getUserId()) && !z2) {
            if (z) {
                h15 branchEntry = idl.a.a(OrderBizCode.orderList, "opClickStatistics").branchEntry(true);
                idl.c(branchEntry.message("组件触发TouchDown，" + getUserId()).sampling(0.001f));
                return;
            }
            h15 branch = idl.a.a(OrderBizCode.orderList, "opClickStatistics").branch(1);
            idl.c(branch.message("组件被点击，" + getUserId()).sampling(0.001f));
        }
    }
}
