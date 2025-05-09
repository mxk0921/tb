package tb;

import android.content.Context;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ej extends pt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AURAFlowNodeModel f18608a;
    public final pt b;
    public final ij c;
    public final gg d;
    public final wi e;
    public final WeakReference<Context> f;

    static {
        t2o.a(79691796);
    }

    public ej(AURAFlowNodeModel aURAFlowNodeModel, pt ptVar, ij ijVar, gg ggVar, wi wiVar, Context context) {
        this.f18608a = aURAFlowNodeModel;
        this.b = ptVar;
        this.c = ijVar;
        this.d = ggVar;
        this.e = wiVar;
        this.f = new WeakReference<>(context);
    }

    public static /* synthetic */ Object ipc$super(ej ejVar, String str, Object... objArr) {
        if (str.hashCode() == 1044070835) {
            super.a();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURAFlowDispatcherManagerCallback");
    }

    @Override // tb.pt
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3b41b3", new Object[]{this});
            return;
        }
        super.a();
        this.b.a();
    }

    @Override // tb.pt, tb.hbb
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        this.b.b(miVar);
        ni a2 = miVar.a();
        if (a2 == null) {
            String str = this.f18608a.code;
            a2 = new ni(str, "", new AURAFlowData(str), this.c.b());
        }
        this.d.c(this.f18608a, AURAAspectServiceInput.error(miVar, false), a2.c(), a2.d(), this.e);
        d(miVar);
    }

    @Override // tb.pt
    public void c(yk ykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
        } else {
            this.b.c(ykVar);
        }
    }

    public final void d(mi miVar) {
        String str;
        WeakReference<Context> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7989cee", new Object[]{this, miVar});
            return;
        }
        String str2 = "AURAException#" + miVar.e();
        if ("AURADefaultDomain".equals(miVar.c())) {
            str = "请设置你的error domain!!!!!!!! # ";
        } else {
            str = "";
        }
        ck.g().b("AURAFlowDispatcherManagerCallback", "dispatcherCallback#onError", str + str2);
        if (dj.n && th.c() && (weakReference = this.f) != null) {
            Context context = weakReference.get();
            if (context != null && miVar.f() == 0) {
                bo.c(context, "AURA框架错误(详情过滤 #AURA_LOGGER# 查看报错堆栈日志)：" + str2, 0);
            }
            ck.g().e("AURA框架错误(详情过滤 #AURA_LOGGER# 查看报错堆栈日志)：" + str2, ck.b.b().i("AURA/error").a());
        }
    }
}
