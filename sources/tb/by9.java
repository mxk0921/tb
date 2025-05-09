package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class by9 implements f8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f8c f16713a;

    static {
        t2o.a(806355043);
        t2o.a(806355042);
    }

    public by9(Context context) {
        this(context, false, false);
    }

    public void a(e8c e8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28bc066", new Object[]{this, e8cVar});
            return;
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            ((kv) f8cVar).j(e8cVar);
        }
    }

    @Override // tb.f8c
    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6256b3f", new Object[]{this, str})).longValue();
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            return f8cVar.b(str);
        }
        return 0L;
    }

    @Override // tb.f8c
    public f8c c(BaseFrame baseFrame, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("5e4b9758", new Object[]{this, baseFrame, str, view});
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            return ((kv) f8cVar).c(baseFrame, str, view);
        }
        return this;
    }

    @Override // tb.f8c
    public e8c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8c) ipChange.ipc$dispatch("33aaa27c", new Object[]{this});
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            return ((kv) f8cVar).d();
        }
        return null;
    }

    @Override // tb.f8c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            f8cVar.destroy();
        }
    }

    @Override // tb.f8c
    public f8c e(BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("97dfdc61", new Object[]{this, baseFrame, str, viewStub, dy9Var});
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            return f8cVar.e(baseFrame, str, viewStub, dy9Var);
        }
        return this;
    }

    @Override // tb.f8c
    public f8c f(BaseFrame baseFrame, String str, View view, dy9 dy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("2a75bdbf", new Object[]{this, baseFrame, str, view, dy9Var});
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            return f8cVar.f(baseFrame, str, view, dy9Var);
        }
        return this;
    }

    @Override // tb.f8c
    public f8c g(BaseFrame baseFrame, String str, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("969d87fa", new Object[]{this, baseFrame, str, viewStub});
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            return ((kv) f8cVar).g(baseFrame, str, viewStub);
        }
        return this;
    }

    @Override // tb.f8c
    public e8c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8c) ipChange.ipc$dispatch("6322a181", new Object[]{this});
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            return ((kv) f8cVar).h();
        }
        return null;
    }

    public void i(e8c e8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd48c69", new Object[]{this, e8cVar});
            return;
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            ((kv) f8cVar).k(e8cVar);
        }
    }

    @Override // tb.f8c
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        f8c f8cVar = this.f16713a;
        if (f8cVar != null) {
            f8cVar.start();
        }
    }

    public by9(Context context, boolean z, boolean z2) {
        String str;
        boolean t = qvs.t();
        o3s.b("FrameInstaller", "enableComponentDelayLoad = " + t + " " + z);
        if (t) {
            this.f16713a = new ecp(context, z, z2);
        } else {
            this.f16713a = new zum(context);
        }
        if (iw0.j(context)) {
            if (t || z) {
                str = "延迟加载组件方式 " + t + " " + z;
            } else {
                str = "普通加载组件方式";
            }
            Toast.makeText(context, str, 0).show();
        }
    }
}
