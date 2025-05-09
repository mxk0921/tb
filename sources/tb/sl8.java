package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sl8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f28130a;
        public final List<ux1> b;

        static {
            t2o.a(912262332);
        }

        public a(Context context, md7 md7Var, List<ux1> list) {
            this.f28130a = context;
            this.b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            List<ux1> list = this.b;
            if (!(list == null || list.isEmpty())) {
                for (ux1 ux1Var : this.b) {
                    if (ux1Var instanceof rc7) {
                        q84.f(this.f28130a, ux1Var);
                    }
                }
            }
        }
    }

    static {
        t2o.a(912262330);
    }

    public static void a(Context context, md7 md7Var, View view, List<ux1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dc122c", new Object[]{context, md7Var, view, list});
        } else if (view != null && list != null && !list.isEmpty()) {
            ViewProxy.setOnClickListener(view, new a(context, md7Var, list));
        }
    }
}
