package tb;

import android.content.Context;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zn0 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32880a;
    public final bo0 b;
    public mj c;
    public HashMap<String, Object> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ao0 f32881a;

        public a(zn0 zn0Var, ao0 ao0Var) {
            this.f32881a = ao0Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/service/AliBuyService$1");
        }

        @Override // tb.pt
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3b41b3", new Object[]{this});
            } else if (this.f32881a.d() != null) {
                this.f32881a.d().onComplete();
            }
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            rbb g = ck.g();
            g.b("AliBuyService", BaseExecutor.EXECUTOR_SUFFIX, "error =" + miVar);
            if (this.f32881a.d() != null) {
                this.f32881a.d().onError("AURAError", "AURA exception", miVar);
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            Serializable b = ykVar.b();
            if (this.f32881a.d() != null) {
                this.f32881a.d().onData(b);
            }
        }
    }

    static {
        t2o.a(301990088);
    }

    public zn0(Context context, bo0 bo0Var) {
        this.f32880a = context;
        this.b = bo0Var;
        c();
    }

    public void a(ao0 ao0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ece45af", new Object[]{this, ao0Var});
            return;
        }
        if (this.c == null) {
            this.c = b();
        }
        List<IAURAInputField> c = ao0Var.c();
        if (!bh.a(c)) {
            for (IAURAInputField iAURAInputField : c) {
                this.c.b(iAURAInputField);
            }
        }
        this.c.c(ao0Var.a(), ao0Var.b(), new a(this, ao0Var));
    }

    public final mj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("e1b6b4a3", new Object[]{this});
        }
        if (this.c == null) {
            this.c = mj.h(new lo(this.f32880a, this.d)).o(new AURAAliBuyCorePluginCenter());
            AURAPluginContainerNodeModel c = this.b.c();
            if (c == null) {
                this.c.t(this.b.a());
            } else {
                this.c.u(c);
            }
            IAURAPluginCenter[] b = this.b.b();
            if (b != null) {
                this.c.o(b);
            }
        }
        return this.c;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd4dabb", new Object[]{this});
        } else {
            this.d = new HashMap<>();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        mj mjVar = this.c;
        if (mjVar != null) {
            mjVar.destroy();
        }
    }
}
