package com.taobao.android.order.core.subscriber.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lqk;
import tb.q7x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderVesselContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lqk f9147a;

        public a(lqk lqkVar) {
            this.f9147a = lqkVar;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            lqk lqkVar = this.f9147a;
            if (lqkVar != null) {
                ((q7x.a) lqkVar).a();
            }
        }
    }

    static {
        t2o.a(614465774);
    }

    public static void a(Context context, String str, final lqk lqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef6eebb", new Object[]{context, str, lqkVar});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT > 29) {
                OrderVesselPopWindow orderVesselPopWindow = new OrderVesselPopWindow(context);
                orderVesselPopWindow.k(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselContainer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                            return;
                        }
                        lqk lqkVar2 = lqk.this;
                        if (lqkVar2 != null) {
                            ((q7x.a) lqkVar2).a();
                        }
                    }
                });
                orderVesselPopWindow.l(str);
                return;
            }
            OrderVesselDialog orderVesselDialog = new OrderVesselDialog(context);
            orderVesselDialog.l(new a(lqkVar));
            orderVesselDialog.m(str);
        }
    }
}
