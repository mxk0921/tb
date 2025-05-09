package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.HashMap;
import java.util.List;
import tb.f9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b5w extends f9e.a implements wlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f16197a;
    private final prp b;
    public final Runnable c = new a();
    public int d = 0;
    public boolean e = false;
    private long f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b5w.this.x("3");
            }
        }
    }

    static {
        t2o.a(468714043);
        t2o.a(468713934);
    }

    public b5w(prp prpVar) {
        this.f16197a = prpVar.U();
        this.b = prpVar;
        l(prpVar);
        m(prpVar);
    }

    public static void F(ici iciVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8cdab", new Object[]{iciVar, str});
            return;
        }
        iciVar.E.put("state", str);
        ((IMessageService) iciVar.U().getService(IMessageService.class)).sendMessage(new vrp(csp.VIDEO_STATE_CHANGE_NAME, iciVar.b0(), iciVar.E));
        o(iciVar, str);
    }

    public static /* synthetic */ Object ipc$super(b5w b5wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/VideoCardMessageManager");
    }

    private void l(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751b410f", new Object[]{this, prpVar});
        } else {
            prpVar.N().addCardLifecycleListener(this);
        }
    }

    private void m(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b059e5", new Object[]{this, prpVar});
        } else {
            prpVar.F0().addVideoPlayerListener((f9e.a) this);
        }
    }

    public static void o(ici iciVar, String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb3b094", new Object[]{iciVar, str});
        } else if (str != null && (a2 = tri.a(str)) != null) {
            ((IMessageService) iciVar.U().getService(IMessageService.class)).sendMessage(new vrp(a2, iciVar.b0(), iciVar.E));
        }
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
        } else if (this.b.j0()) {
            if (this.b.n1().getDWInstance() == null || this.b.n1().getDWInstance().o() == null || nwv.t(this.b.n1().getDWInstance().o().get("first_frame_rendering_time"), 0) <= 0) {
                Handler handler = prp.mHandler;
                handler.removeCallbacks(this.b.z1().c);
                ncp j2 = ((IDataService) this.b.U().getService(IDataService.class)).getConfig().j();
                this.f = System.nanoTime() / 1000000;
                Runnable runnable = this.b.z1().c;
                if (j2 == null) {
                    j = 5000;
                } else {
                    j = j2.B;
                }
                handler.postDelayed(runnable, j);
            }
        }
    }

    @Override // tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        }
    }

    @Override // tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        } else if (uq9Var instanceof ici) {
            ici iciVar = (ici) uq9Var;
            iciVar.E.put("totalTime", "0");
            iciVar.E.put(tmu.CURRENT_TIME, "0");
        }
    }

    @Override // tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
        } else if (this.b.j0()) {
            prp.mHandler.removeCallbacks(this.b.z1().c);
        }
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e.a, tb.f9e
    public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
            return;
        }
        prp.mHandler.removeCallbacks(this.c);
        x("2");
    }

    @Override // tb.f9e.a, tb.f9e
    public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        long nanoTime = (System.nanoTime() / 1000000) - this.f;
        if (((IDataService) this.b.U().getService(IDataService.class)).getConfig().j() == null) {
            i = 5000;
        } else {
            i = ((IDataService) this.b.U().getService(IDataService.class)).getConfig().j().B;
        }
        if (nanoTime <= i) {
            prp.mHandler.removeCallbacks(this.c);
        }
    }

    @Override // tb.f9e.a, tb.f9e
    public void onVideoPause(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
        } else {
            F(this.b, "pause");
        }
    }

    @Override // tb.f9e.a, tb.f9e
    public void onVideoPlay(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
        } else {
            F(this.b, "play");
        }
    }

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        }
    }

    public void v(String str, String str2, prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218a5771", new Object[]{this, str, str2, prpVar});
            return;
        }
        prpVar.E.put(sj4.NOTIFY_TNODE_VIDEO_NEXT_STATE, str2);
        F(prpVar, str);
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        }
    }

    @Override // tb.f9e.a, tb.f9e
    public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = i / 1000;
        if (this.d != i4) {
            this.d = i4;
            if (uq9Var instanceof ici) {
                ici iciVar = (ici) uq9Var;
                iciVar.E.put("state", csp.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE);
                iciVar.E.put("totalTime", String.valueOf(i3 / 1000));
                iciVar.E.put(tmu.CURRENT_TIME, String.valueOf(this.d));
                ((IMessageService) this.b.U().getService(IMessageService.class)).sendMessage(new vrp(csp.VIDEO_STATE_CHANGE_NAME, this.b.b0(), iciVar.E));
            }
        }
        if (this.b.V().R().l().m) {
            ir9.a("商品预透出", "可以发重复的消息");
            this.b.V().R().l().m = false;
            this.d = i4;
            if (uq9Var instanceof ici) {
                ici iciVar2 = (ici) uq9Var;
                iciVar2.E.put("state", "timeUpdateSeekToAndPause");
                iciVar2.E.put("totalTime", String.valueOf(i3 / 1000));
                iciVar2.E.put(tmu.CURRENT_TIME, String.valueOf(this.d));
                ((IMessageService) this.b.U().getService(IMessageService.class)).sendMessage(new vrp(csp.VIDEO_STATE_CHANGE_NAME, this.b.b0(), iciVar2.E));
            }
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985519dd", new Object[]{this, str});
        } else if (((IDataService) this.f16197a.getService(IDataService.class)).getConfig().g()) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            hashMap.put("shouldShow", String.valueOf(!this.b.w1().d));
            HashMap hashMap2 = new HashMap();
            if (this.b.n1().getDWInstance() != null) {
                hashMap2.put(yj4.PARAM_PLAYER_TOKEN, this.b.n1().getDWInstance().t());
            }
            hashMap.put("info", hashMap2);
            ((IMessageService) this.b.U().getService(IMessageService.class)).sendMessage(new vrp("VSMSG_playFeedback", this.b.b0(), hashMap));
        }
    }

    public void G(int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920491ac", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.e && i2 > i / 3 && i2 >= ((IDataService) this.b.U().getService(IDataService.class)).getConfig().j().i) {
            this.e = true;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("time", Integer.valueOf(i2));
            if (this.b.D1().c() != null) {
                str = this.b.D1().c().toLowerCase();
            } else {
                str = "";
            }
            hashMap2.put("type", str);
            hashMap.put(this.b.D1().t(), hashMap2);
            ((IMessageService) this.b.U().getService(IMessageService.class)).sendMessage(new vrp("VSMSG_positiveFeedBack", this.b.b0(), hashMap));
        }
    }
}
