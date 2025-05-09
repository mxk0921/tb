package tb;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.tao.topmultitab.service.poplayer.IPopLayerService;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class oem implements tad, p6d, pxd, o2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f25330a;
    public boolean b = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455598);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455597);
        t2o.a(916455454);
        t2o.a(919601322);
        t2o.a(916455447);
        t2o.a(919601295);
    }

    @Override // tb.pxd
    public void B(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeec9dd", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f25330a = qpuVar;
        ((xwc) qpuVar.getService(xwc.class)).Y().u(this);
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
        ((q2c) qpuVar.getService(q2c.class)).r(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((xwc) qpuVar.getService(xwc.class)).Y().w(this);
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
        ((q2c) qpuVar.getService(q2c.class)).x(this);
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        }
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
        }
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
            return;
        }
        ckf.g(engineState, "state");
        if (engineState == EngineState.INTERACTIVE) {
            r();
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e716a7f", new Object[]{this});
            return;
        }
        qpu qpuVar = this.f25330a;
        if (qpuVar != null) {
            xwc xwcVar = (xwc) qpuVar.getService(xwc.class);
            TabModel d0 = xwcVar.d0(xwcVar.getCurrentIndex());
            if (d0 != null) {
                M(d0);
            } else {
                tpu.a.b(tpu.Companion, IPopLayerService.SERVICE_NAME, "当前tabModel为空，无法请求poplayer", null, 4, null);
            }
        } else {
            ckf.y("context");
            throw null;
        }
    }

    @Override // tb.pxd
    public void x(int i, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d51c6d8", new Object[]{this, new Integer(i), str, new Integer(i2), str2});
        } else if (i != -1) {
            qpu qpuVar = this.f25330a;
            if (qpuVar != null) {
                TabModel d0 = ((xwc) qpuVar.getService(xwc.class)).d0(i2);
                if (d0 != null) {
                    M(d0);
                    return;
                }
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, IPopLayerService.SERVICE_NAME, "onTabSelect, 当前tabModel为空，无法请求poplayer " + i2, null, 4, null);
                return;
            }
            ckf.y("context");
            throw null;
        }
    }

    public final void M(TabModel tabModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49158c4d", new Object[]{this, tabModel});
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, tabModel.getPageName() + "@" + tabModel.getId());
        intent.putExtra("operation", 1);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NEED_ACTIVITY_PARAM, true);
        qpu qpuVar = this.f25330a;
        if (qpuVar != null) {
            LocalBroadcastManager.getInstance(qpuVar.getContext()).sendBroadcast(intent);
            tpu.a.b(tpu.Companion, IPopLayerService.SERVICE_NAME, "requestPopLayer, tab: " + tabModel, null, 4, null);
            return;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
        } else if (this.b) {
            this.b = false;
            tpu.a.b(tpu.Companion, IPopLayerService.SERVICE_NAME, "忽略第一次resume, onTabSelect中已经请求过poplayer", null, 4, null);
        } else {
            r();
        }
    }
}
