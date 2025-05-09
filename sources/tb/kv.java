package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class kv implements f8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e8c f22943a;
    public e8c b;

    static {
        t2o.a(806355038);
        t2o.a(806355042);
    }

    public kv(Context context) {
    }

    @Override // tb.f8c
    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6256b3f", new Object[]{this, str})).longValue();
        }
        return 0L;
    }

    @Override // tb.f8c
    public f8c c(BaseFrame baseFrame, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("5e4b9758", new Object[]{this, baseFrame, str, view});
        }
        return f(baseFrame, str, view, null);
    }

    @Override // tb.f8c
    public e8c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8c) ipChange.ipc$dispatch("33aaa27c", new Object[]{this});
        }
        return this.f22943a;
    }

    @Override // tb.f8c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.f8c
    public f8c e(BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
        BaseFrame a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("97dfdc61", new Object[]{this, baseFrame, str, viewStub, dy9Var});
        }
        if (!TextUtils.isEmpty(str) && (a2 = this.f22943a.a(str)) != null) {
            if (dy9Var != null) {
                dy9Var.b(a2);
            }
            if (a2.lazyInflate()) {
                z = a2.keepViewStubWithoutInflate(viewStub);
            } else {
                z = a2.createView(viewStub);
            }
            if (z) {
                baseFrame.addComponent(a2);
            }
            if (dy9Var != null) {
                dy9Var.a(a2);
            }
        }
        return this;
    }

    @Override // tb.f8c
    public f8c f(BaseFrame baseFrame, String str, View view, dy9 dy9Var) {
        BaseFrame a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("2a75bdbf", new Object[]{this, baseFrame, str, view, dy9Var});
        }
        if (!TextUtils.isEmpty(str) && (a2 = this.b.a(str)) != null) {
            if (dy9Var != null) {
                dy9Var.b(a2);
            }
            if (view == null || view.getParent() == null) {
                igq n = igq.n();
                n.b("installTBOldFrame", view + "view or view.getParent() is null", str);
            } else {
                if (view instanceof ViewStub) {
                    a2.onCreateView((ViewStub) view);
                } else if (view instanceof ViewGroup) {
                    a2.onCreateView2((ViewGroup) view);
                }
                baseFrame.addComponent(a2);
                if (dy9Var != null) {
                    dy9Var.a(a2);
                }
            }
        }
        return this;
    }

    @Override // tb.f8c
    public final f8c g(BaseFrame baseFrame, String str, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("969d87fa", new Object[]{this, baseFrame, str, viewStub});
        }
        return e(baseFrame, str, viewStub, null);
    }

    @Override // tb.f8c
    public e8c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8c) ipChange.ipc$dispatch("6322a181", new Object[]{this});
        }
        return this.b;
    }

    public f8c i(BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
        BaseFrame a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("fe7a1fb", new Object[]{this, baseFrame, str, viewStub, dy9Var});
        }
        if (!TextUtils.isEmpty(str) && (a2 = this.b.a(str)) != null) {
            if (dy9Var != null) {
                dy9Var.b(a2);
            }
            if (a2.lazyInflate()) {
                z = a2.keepViewStubWithoutInflate(viewStub);
            } else {
                z = a2.createView(viewStub);
            }
            if (z) {
                baseFrame.addComponent(a2);
            }
            if (dy9Var != null) {
                dy9Var.a(a2);
            }
        }
        return this;
    }

    public void j(e8c e8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28bc066", new Object[]{this, e8cVar});
        } else {
            this.f22943a = e8cVar;
        }
    }

    public void k(e8c e8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd48c69", new Object[]{this, e8cVar});
        } else {
            this.b = e8cVar;
        }
    }

    @Override // tb.f8c
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }
}
