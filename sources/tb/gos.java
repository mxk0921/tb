package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.dinamicx.event.DetailDinamicCopyEventHandlerV3;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenUrlImplementor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262856);
    }

    public static void a(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebc48a6", new Object[]{ze7Var, context});
            return;
        }
        ytv ytvVar = new ytv(context, ze7Var);
        ze7Var.b().i("userTrack", ytvVar);
        ze7Var.b().i("user_track", ytvVar);
        ze7Var.b().i("track", ytvVar);
        OpenUrlImplementor openUrlImplementor = new OpenUrlImplementor(context, ze7Var);
        ze7Var.b().i("openUrl", openUrlImplementor);
        ze7Var.b().i("open_url", openUrlImplementor);
        ze7Var.b().i(y3l.EVENT_TYPE, new y3l(context));
        ze7Var.b().i(qch.EVENT_TYPE, new qch(context));
    }

    public static void b(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01f2f6d", new Object[]{ze7Var, context});
            return;
        }
        a(ze7Var, context);
        d(ze7Var, context);
        c(ze7Var, context);
        f(ze7Var, context);
        g(ze7Var, context);
        h(ze7Var, context);
        e(ze7Var.g());
    }

    public static void c(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66debbf9", new Object[]{ze7Var, context});
            return;
        }
        ze7Var.d().i("native", "_tt_detail_header_frame_", new ckj());
        ze7Var.d().i("native", dkj.NAME, new dkj());
        ze7Var.d().i("native", zlj.NAME, new zlj());
        ze7Var.d().i("native", cjj.NAME, new cjj());
        ze7Var.d().i("native", ulj.NAME, new ulj());
        ze7Var.d().i("native", nkj.NAME, new nkj());
        ze7Var.d().k("dinamicx", new bo7());
        ze7Var.d().k("weex", new q9x());
        ze7Var.d().i("weex2", t9x.NAME, new t9x());
        ze7Var.d().k("weex2", new u9x());
    }

    public static void d(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca37d623", new Object[]{ze7Var, context});
        } else {
            ze7Var.e().q(a4a.PARSER_ID, new a4a(context, ze7Var));
        }
    }

    public static void e(eo7 eo7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce71dfdf", new Object[]{eo7Var});
        } else {
            eo7Var.C(aq5.DX_EVENT_ID, new aq5());
        }
    }

    public static void f(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8aac3a", new Object[]{ze7Var, context});
        }
    }

    public static void g(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6dbf3", new Object[]{ze7Var, context});
            return;
        }
        ze7Var.g().D(vra.DX_EVENT_ID, new vra(context, ze7Var));
        ze7Var.g().D(yra.DX_EVENT_ID, new yra(context, ze7Var));
        ze7Var.g().D(DetailDinamicCopyEventHandlerV3.DX_EVENT_ID.longValue(), new DetailDinamicCopyEventHandlerV3(context, ze7Var));
    }

    public static void h(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437866ff", new Object[]{ze7Var, context});
        }
    }
}
