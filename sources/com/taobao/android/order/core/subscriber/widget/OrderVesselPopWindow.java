package com.taobao.android.order.core.subscriber.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderVesselPopWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_FULL_SCREEN_VESSEL = "closeFullWebView";
    public static final String ACTION_HIDE_CLOSE_ICON = "hideCloseIcon";

    /* renamed from: a  reason: collision with root package name */
    public final Context f9154a;
    public final PopupWindow b;
    public String c;
    public final VesselView d;
    public View e;
    public PopupWindow.OnDismissListener f;
    public final View g;
    public final BroadcastReceiver h;
    public final BroadcastReceiver i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                OrderVesselPopWindow.f(OrderVesselPopWindow.this).dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                OrderVesselPopWindow.f(OrderVesselPopWindow.this).dismiss();
            }
        }
    }

    static {
        t2o.a(614465784);
    }

    public OrderVesselPopWindow(final Context context) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselPopWindow.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/widget/OrderVesselPopWindow$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if ("closeFullWebView".equals(intent.getAction())) {
                    OrderVesselPopWindow.this.g();
                    LocalBroadcastManager.getInstance(context2).unregisterReceiver(OrderVesselPopWindow.a(OrderVesselPopWindow.this));
                }
            }
        };
        this.h = broadcastReceiver;
        BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselPopWindow.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/widget/OrderVesselPopWindow$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if ("hideCloseIcon".equals(intent.getAction()) && OrderVesselPopWindow.b(OrderVesselPopWindow.this) != null) {
                    OrderVesselPopWindow.b(OrderVesselPopWindow.this).setVisibility(8);
                    LocalBroadcastManager.getInstance(context2).unregisterReceiver(OrderVesselPopWindow.c(OrderVesselPopWindow.this));
                }
            }
        };
        this.i = broadcastReceiver2;
        this.f9154a = context;
        if (context != null) {
            this.g = View.inflate(context, R.layout.order_vessel_dialog, null);
            PopupWindow popupWindow = new PopupWindow();
            this.b = popupWindow;
            popupWindow.setHeight(-1);
            popupWindow.setWidth(-1);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.setSoftInputMode(16);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselPopWindow.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                        return;
                    }
                    LocalBroadcastManager.getInstance(context).unregisterReceiver(OrderVesselPopWindow.a(OrderVesselPopWindow.this));
                    LocalBroadcastManager.getInstance(context).unregisterReceiver(OrderVesselPopWindow.c(OrderVesselPopWindow.this));
                    if (OrderVesselPopWindow.d(OrderVesselPopWindow.this) != null) {
                        OrderVesselPopWindow.d(OrderVesselPopWindow.this).onDismiss();
                    }
                    if (OrderVesselPopWindow.e(OrderVesselPopWindow.this) != null) {
                        try {
                            OrderVesselPopWindow.e(OrderVesselPopWindow.this).onDestroy();
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
            this.d = new VesselView(context);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("closeFullWebView");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("hideCloseIcon");
            intentFilter2.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver2, intentFilter2);
        }
    }

    public static /* synthetic */ BroadcastReceiver a(OrderVesselPopWindow orderVesselPopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("bd4e72c0", new Object[]{orderVesselPopWindow});
        }
        return orderVesselPopWindow.h;
    }

    public static /* synthetic */ View b(OrderVesselPopWindow orderVesselPopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("357e094c", new Object[]{orderVesselPopWindow});
        }
        return orderVesselPopWindow.e;
    }

    public static /* synthetic */ BroadcastReceiver c(OrderVesselPopWindow orderVesselPopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("5b1daf42", new Object[]{orderVesselPopWindow});
        }
        return orderVesselPopWindow.i;
    }

    public static /* synthetic */ PopupWindow.OnDismissListener d(OrderVesselPopWindow orderVesselPopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow.OnDismissListener) ipChange.ipc$dispatch("a385f90d", new Object[]{orderVesselPopWindow});
        }
        return orderVesselPopWindow.f;
    }

    public static /* synthetic */ VesselView e(OrderVesselPopWindow orderVesselPopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("5a1f3277", new Object[]{orderVesselPopWindow});
        }
        return orderVesselPopWindow.d;
    }

    public static /* synthetic */ PopupWindow f(OrderVesselPopWindow orderVesselPopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("d30fa266", new Object[]{orderVesselPopWindow});
        }
        return orderVesselPopWindow.b;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1d309", new Object[]{this, str});
            return;
        }
        this.c = str;
        j();
        i();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14513dc9", new Object[]{this});
            return;
        }
        VesselView vesselView = this.d;
        if (vesselView != null) {
            vesselView.loadUrl(this.c);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f59344", new Object[]{this});
        } else if (this.b != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            this.b.setContentView(this.g);
            ViewGroup viewGroup = (ViewGroup) this.b.getContentView().findViewById(R.id.order_vessel_container);
            viewGroup.addView(this.d, layoutParams);
            View inflate = LayoutInflater.from(this.f9154a).inflate(R.layout.order_vessel_close, viewGroup, false);
            viewGroup.addView(inflate);
            this.e = inflate;
            viewGroup.setOnClickListener(new a());
            ViewProxy.setOnClickListener(inflate, new b());
            this.b.showAtLocation(this.g, 80, 0, 0);
        }
    }

    public void k(PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51c1bc7", new Object[]{this, onDismissListener});
        } else {
            this.f = onDismissListener;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123b5376", new Object[]{this, str});
            return;
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow != null && !popupWindow.isShowing()) {
            h(str);
        }
    }
}
