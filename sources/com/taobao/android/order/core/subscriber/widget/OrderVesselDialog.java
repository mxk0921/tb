package com.taobao.android.order.core.subscriber.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import java.util.Map;
import tb.ask;
import tb.g4w;
import tb.t2o;
import tb.zs8;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderVesselDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_FULL_SCREEN_VESSEL = "closeFullWebView";
    public static final String ACTION_HIDE_CLOSE_ICON = "hideCloseIcon";

    /* renamed from: a  reason: collision with root package name */
    public final Context f9148a;
    public final zs8 b;
    public String c;
    public final VesselView d;
    public View e;
    public DialogInterface.OnDismissListener f;
    public final BroadcastReceiver g;
    public final BroadcastReceiver h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            zs8 zs8Var = (zs8) dialogInterface;
            LocalBroadcastManager.getInstance(zs8Var.getContext()).unregisterReceiver(OrderVesselDialog.a(OrderVesselDialog.this));
            LocalBroadcastManager.getInstance(zs8Var.getContext()).unregisterReceiver(OrderVesselDialog.b(OrderVesselDialog.this));
            if (OrderVesselDialog.c(OrderVesselDialog.this) != null) {
                OrderVesselDialog.c(OrderVesselDialog.this).onDismiss(dialogInterface);
            }
            if (OrderVesselDialog.d(OrderVesselDialog.this) != null) {
                try {
                    OrderVesselDialog.d(OrderVesselDialog.this).onDestroy();
                } catch (Throwable unused) {
                }
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
                OrderVesselDialog.f(OrderVesselDialog.this).dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                OrderVesselDialog.f(OrderVesselDialog.this).dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements ask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(OrderVesselDialog orderVesselDialog) {
        }

        @Override // tb.ask
        public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
            }
        }

        @Override // tb.ask
        public void onLoadError(g4w g4wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            }
        }

        @Override // tb.ask
        public void onLoadFinish(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            }
        }

        @Override // tb.ask
        public void onLoadStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(614465777);
    }

    public OrderVesselDialog(Context context) {
        a aVar = new a();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/widget/OrderVesselDialog$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if ("closeFullWebView".equals(intent.getAction())) {
                    OrderVesselDialog.this.g();
                    LocalBroadcastManager.getInstance(context2).unregisterReceiver(OrderVesselDialog.a(OrderVesselDialog.this));
                }
            }
        };
        this.g = broadcastReceiver;
        BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/widget/OrderVesselDialog$3");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if ("hideCloseIcon".equals(intent.getAction()) && OrderVesselDialog.e(OrderVesselDialog.this) != null) {
                    OrderVesselDialog.e(OrderVesselDialog.this).setVisibility(8);
                    LocalBroadcastManager.getInstance(context2).unregisterReceiver(OrderVesselDialog.b(OrderVesselDialog.this));
                }
            }
        };
        this.h = broadcastReceiver2;
        this.f9148a = context;
        if (context != null) {
            zs8 zs8Var = new zs8(context);
            this.b = zs8Var;
            this.d = new VesselView(context);
            zs8Var.setOnDismissListener(aVar);
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

    public static /* synthetic */ BroadcastReceiver a(OrderVesselDialog orderVesselDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("52a39cb5", new Object[]{orderVesselDialog});
        }
        return orderVesselDialog.g;
    }

    public static /* synthetic */ BroadcastReceiver b(OrderVesselDialog orderVesselDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("17d58e14", new Object[]{orderVesselDialog});
        }
        return orderVesselDialog.h;
    }

    public static /* synthetic */ DialogInterface.OnDismissListener c(OrderVesselDialog orderVesselDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnDismissListener) ipChange.ipc$dispatch("58ff4877", new Object[]{orderVesselDialog});
        }
        return orderVesselDialog.f;
    }

    public static /* synthetic */ VesselView d(OrderVesselDialog orderVesselDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("f41b3ca9", new Object[]{orderVesselDialog});
        }
        return orderVesselDialog.d;
    }

    public static /* synthetic */ View e(OrderVesselDialog orderVesselDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d85bba7c", new Object[]{orderVesselDialog});
        }
        return orderVesselDialog.e;
    }

    public static /* synthetic */ zs8 f(OrderVesselDialog orderVesselDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs8) ipChange.ipc$dispatch("f945edb2", new Object[]{orderVesselDialog});
        }
        return orderVesselDialog.b;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        zs8 zs8Var = this.b;
        if (zs8Var != null) {
            zs8Var.dismiss();
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1d309", new Object[]{this, str});
            return;
        }
        this.c = str;
        k();
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
            ipChange.ipc$dispatch("c5071d3", new Object[]{this});
            return;
        }
        VesselView vesselView = this.d;
        if (vesselView != null) {
            vesselView.setOnLoadListener(new d(this));
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f59344", new Object[]{this});
            return;
        }
        zs8 zs8Var = this.b;
        if (zs8Var != null) {
            zs8Var.b(R.layout.order_vessel_dialog, -1, -1, 17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.order_vessel_container);
            viewGroup.addView(this.d, layoutParams);
            View inflate = LayoutInflater.from(this.f9148a).inflate(R.layout.order_vessel_close, viewGroup, false);
            viewGroup.addView(inflate);
            this.e = inflate;
            viewGroup.setOnClickListener(new b());
            ViewProxy.setOnClickListener(inflate, new c());
        }
    }

    public void l(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else {
            this.f = onDismissListener;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123b5376", new Object[]{this, str});
            return;
        }
        zs8 zs8Var = this.b;
        if (zs8Var != null && !zs8Var.isShowing()) {
            h(str);
        }
    }
}
