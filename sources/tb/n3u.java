package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.model.PageModel;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n3u implements k1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f24490a;
    public e3u b;
    public final l3u c = new l3u();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455665);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455664);
        t2o.a(916455462);
    }

    @Override // tb.iae
    public void H0(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c112a576", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TopBarService", "服务暂停的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.onPause(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    @Override // tb.iae
    public void H1(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9ca3a0", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TopBarService", "服务停止的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.onStop(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    @Override // tb.iae
    public void I0(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48b848b", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TopBarService", "服务恢复的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.onResume(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    @Override // tb.k1e
    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5182c40a", new Object[]{this})).booleanValue();
        }
        tpu.a.b(tpu.Companion, "TopBarService", "隐藏发布按钮", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.s();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.k1e
    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0793af", new Object[]{this})).booleanValue();
        }
        tpu.a.b(tpu.Companion, "TopBarService", "显示发布按钮", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.w();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.k1e
    public int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f287b0", new Object[]{this})).intValue();
        }
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.q();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.k1e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a431c2", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "TopBarService", "重置分享按钮icon", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.a();
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    @Override // tb.k1e
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd697d2", new Object[]{this, str});
            return;
        }
        ckf.g(str, "iconUrl");
        tpu.a.b(tpu.Companion, "TopBarService", "更新分享按钮icon ，iconUrl=".concat(str), null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.b(str);
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    @Override // tb.k1e
    public boolean hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9631f0cd", new Object[]{this})).booleanValue();
        }
        tpu.a.b(tpu.Companion, "TopBarService", "隐藏顶部bar", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.hide();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.k1e
    public boolean hideBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb73ce6", new Object[]{this})).booleanValue();
        }
        tpu.a.b(tpu.Companion, "TopBarService", "隐藏返回按钮", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.r();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "TopBarService", "服务创建的时机", null, 4, null);
        this.f24490a = qpuVar;
        e3u e3uVar = new e3u(qpuVar, this.c);
        this.b = e3uVar;
        e3uVar.onCreate(null, IComponentLifecycle$TriggerType.UNSPECIFIED);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "TopBarService", "服务销毁的时机", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.onDestroy(IComponentLifecycle$TriggerType.UNSPECIFIED);
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    /* renamed from: r */
    public void Z0(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778f7a72", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TopBarService", "设置顶部bar数据，data=" + pageModel, null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.updateData(pageModel);
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    @Override // tb.k1e
    public boolean r0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481f48f3", new Object[]{this, new Integer(i)})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TopBarService", "选择指定Tab bar子项，index=" + i, null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.u(i);
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.iae
    public void r1(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79875e2", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TopBarService", "服务启动的时机，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            e3uVar.onStart(iComponentLifecycle$TriggerType);
        } else {
            ckf.y("topBarComponent");
            throw null;
        }
    }

    @Override // tb.k1e
    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        tpu.a.b(tpu.Companion, "TopBarService", "显示顶部bar", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.show();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.k1e
    public boolean showBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2041761", new Object[]{this})).booleanValue();
        }
        tpu.a.b(tpu.Companion, "TopBarService", "显示返回按钮", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.v();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    @Override // tb.k1e
    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("765615ae", new Object[]{this})).intValue();
        }
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.p();
        }
        ckf.y("topBarComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // tb.iae
    public View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5e7be40a", new Object[]{this});
        }
        tpu.a.b(tpu.Companion, "TopBarService", "创建顶部bar视图", null, 4, null);
        e3u e3uVar = this.b;
        if (e3uVar != null) {
            return e3uVar.createView();
        }
        ckf.y("topBarComponent");
        throw null;
    }
}
