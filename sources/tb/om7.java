package tb;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.g;
import com.taobao.schedule.ViewProxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class om7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nm7 f25486a;
        public final /* synthetic */ bn7 b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ en7 d;

        public a(om7 om7Var, nm7 nm7Var, bn7 bn7Var, Object obj, en7 en7Var) {
            this.f25486a = nm7Var;
            this.b = bn7Var;
            this.c = obj;
            this.d = en7Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            long nanoTime = System.nanoTime();
            try {
                this.f25486a.b(view, this.b.c(), this.c, this.b.d(), this.b.b());
                ym7.g(this.b.c(), this.d.f18692a, System.nanoTime() - nanoTime);
            } catch (Throwable th) {
                this.b.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, this.d.f18692a);
                ym7.c("DinamicEventHandler", th, "handle onclick event failed, handler=", this.f25486a.getClass().getName());
                ym7.g(this.b.c(), this.d.f18692a, System.nanoTime() - nanoTime);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nm7 f25487a;
        public final /* synthetic */ bn7 b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ en7 d;

        public b(om7 om7Var, nm7 nm7Var, bn7 bn7Var, Object obj, en7 en7Var) {
            this.f25487a = nm7Var;
            this.b = bn7Var;
            this.c = obj;
            this.d = en7Var;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            long nanoTime = System.nanoTime();
            try {
                this.f25487a.b(view, this.b.c(), this.c, this.b.d(), this.b.b());
                ym7.g(this.b.c(), this.d.f18692a, System.nanoTime() - nanoTime);
            } catch (Throwable th) {
                this.b.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, this.d.f18692a);
                ym7.c("DinamicEventHandler", th, "handle onlongclick event failed, handler=", this.f25487a.getClass().getName());
                ym7.g(this.b.c(), this.d.f18692a, System.nanoTime() - nanoTime);
            }
            return true;
        }
    }

    static {
        t2o.a(444596364);
    }

    public static void d(View view, bn7 bn7Var, en7 en7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df45522", new Object[]{view, bn7Var, en7Var, str});
            return;
        }
        long nanoTime = System.nanoTime();
        try {
            bn7Var.f(view.getTag(jn7.SUBDATA));
            g.d(view, str, bn7Var);
            ym7.g(bn7Var.c(), en7Var.f18692a, System.nanoTime() - nanoTime);
        } catch (Throwable unused) {
            bn7Var.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, en7Var.f18692a);
            ym7.g(bn7Var.c(), en7Var.f18692a, System.nanoTime() - nanoTime);
        }
    }

    public void a(View view, bn7 bn7Var, en7 en7Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a86d77", new Object[]{this, view, bn7Var, en7Var, str, str2});
        } else if (TextUtils.equals(str, "onTap")) {
            ViewProxy.setOnClickListener(view, new pm7(bn7Var, str2, en7Var));
            g.f(view, str2, bn7Var, en7Var);
        } else if (TextUtils.equals(str, "onLongTap")) {
            ViewProxy.setOnLongClickListener(view, new pm7(bn7Var, str2, en7Var));
            g.f(view, str2, bn7Var, en7Var);
        }
    }

    public void b(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99602391", new Object[]{this, view, bn7Var});
            return;
        }
        en7 en7Var = (en7) view.getTag(jn7.PROPERTY_KEY);
        if (en7Var != null) {
            Map<String, String> map = en7Var.d;
            if (!map.isEmpty()) {
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    if (str2.startsWith("@")) {
                        a(view, bn7Var, en7Var, str, str2);
                    } else {
                        c(view, bn7Var, en7Var, str, str2);
                    }
                }
            }
        }
    }

    public final void c(View view, bn7 bn7Var, en7 en7Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9077ada4", new Object[]{this, view, bn7Var, en7Var, str, str2});
            return;
        }
        Pair<String, String> b2 = vn7.b(str2);
        if (b2 == null) {
            bn7Var.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_NOT_FOUND, en7Var.f18692a);
            if (tl7.f()) {
                ym7.e(tl7.TAG, "事件表达式 " + str + "=" + str2 + " 解析出错");
                return;
            }
            return;
        }
        nm7 b3 = tl7.b((String) b2.first);
        if (b3 == null) {
            bn7Var.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_NOT_FOUND, en7Var.f18692a);
            if (tl7.f()) {
                ym7.e(tl7.TAG, String.format("%s=%s，没有找到%s对应的DinamicEventHandler", str, str2, b2.first));
                return;
            }
            return;
        }
        Object a2 = qm7.a((String) b2.second, en7Var.f18692a, bn7Var);
        if (TextUtils.equals(str, "onTap")) {
            ViewProxy.setOnClickListener(view, new a(this, b3, bn7Var, a2, en7Var));
            try {
                b3.c(view, a2, bn7Var.d());
            } catch (Throwable th) {
                bn7Var.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, en7Var.f18692a);
                ym7.c("DinamicEventHandler", th, "handler prepareBindEvent failed, handler=", b3.getClass().getName());
            }
        } else if (TextUtils.equals(str, "onLongTap")) {
            ViewProxy.setOnLongClickListener(view, new b(this, b3, bn7Var, a2, en7Var));
            try {
                b3.c(view, a2, bn7Var.d());
            } catch (Throwable th2) {
                bn7Var.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, en7Var.f18692a);
                ym7.c("DinamicEventHandler", th2, "handler prepareBindEvent failed, handler=", b3.getClass().getName());
            }
        }
    }
}
