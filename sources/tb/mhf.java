package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.x3q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class mhf implements wlb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InteractiveMediaCardList";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f24041a;
    private final ISceneConfigService b;
    private final IMessageService c;
    private final uq9 d;
    private final ViewGroup e;
    private com.taobao.android.fluid.framework.data.datamodel.a f;
    private a.d g;
    private k93 h;
    private s83 i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements c7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f24042a;

        public a(mhf mhfVar, boolean z) {
            this.f24042a = z;
        }

        @Override // tb.c7c
        public void onFirstCardRenderFailed(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb19bec", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.c7c
        public void onFirstCardRenderSuccess(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2639cf64", new Object[]{this, uq9Var});
                return;
            }
            ir9.b(mhf.TAG, "PickPreloadController，InteractiveMediaCardList,收到首帧回调,updateGraymaskVisible:,enableWeexDSLV2:" + this.f24042a);
        }
    }

    static {
        t2o.a(468713905);
        t2o.a(468713934);
    }

    public mhf(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        FluidContext U = uq9Var.U();
        this.f24041a = U;
        this.b = (ISceneConfigService) U.getService(ISceneConfigService.class);
        this.c = (IMessageService) U.getService(IMessageService.class);
        this.d = uq9Var;
        this.e = (ViewGroup) recyclerViewHolder.itemView;
        o(uq9Var);
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499d3276", new Object[]{this});
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f;
        if (aVar == null) {
            ir9.b(TAG, "发送当前Active卡片数据发生变化的消息，mMediaSetData为空");
            return;
        }
        a.d e = aVar.e();
        if (e == null) {
            ir9.b(TAG, "发送当前Active卡片数据发生变化的消息，mediaDetail为空");
            return;
        }
        Map h = e.h(this.f24041a);
        h.put("modelIndex", Integer.valueOf(this.d.T().f()));
        Object json = JSON.toJSON(h);
        if (json == null) {
            ir9.b(TAG, "发送当前Active卡片数据发生变化的消息，mediaDetailObject为空");
            return;
        }
        JSONObject a2 = pqi.a(this.f24041a);
        hxf.a(a2, (JSONObject) json);
        ((IMessageService) this.f24041a.getService(IMessageService.class)).sendMessage(new vrp(csp.CARD_DATA_CHANGE_NAME, e.c, a2));
    }

    private void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5bc0e6", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("index", String.valueOf(this.d.T().f()));
        ITrackService iTrackService = (ITrackService) this.f24041a.getService(ITrackService.class);
        if (iTrackService != null) {
            hashMap.put("sessionPlayTime", String.valueOf(iTrackService.getSessionPlayTime()));
        }
        ir9.b(TAG, "VSMSG_stateChanged args=" + hashMap);
        ((IMessageService) this.f24041a.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_stateChanged", this.f.e().c, hashMap));
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d242", new Object[]{this});
        } else {
            M("appear");
        }
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f236c2", new Object[]{this});
        } else {
            M("disappear");
        }
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649e41ff", new Object[]{this});
        } else {
            M("willActive");
        }
    }

    private void Q(com.taobao.android.fluid.framework.data.datamodel.a aVar, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a86f31", new Object[]{this, aVar, dVar});
            return;
        }
        vrp vrpVar = new vrp(vrp.MSG_DATA_CHANGE, dVar.c, PublishInsertHelper.c(this.f24041a, aVar, dVar.h(this.f24041a), dVar.c));
        ir9.b(TAG, "weexDelay，InteractiveMediaCardList updateMediaDetail 调用messageCenter发送消息");
        W(dVar.c);
        ((IMessageService) this.f24041a.getService(IMessageService.class)).sendMessage(vrpVar);
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75c9589", new Object[]{this});
            return;
        }
        a.d e = this.f.e();
        Map h = e.h(this.f24041a);
        h.put(sj4.UPDATE_DATA_MSG_FOR_GLOBAL_H5, Boolean.TRUE);
        h.put("modelIndex", Integer.valueOf(this.d.T().f()));
        vrp vrpVar = new vrp(vrp.MSG_DATA_CHANGE, e.c, h);
        W(e.c);
        ((IMessageService) this.f24041a.getService(IMessageService.class)).sendMessage(vrpVar);
    }

    private void S(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958f9190", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(TAG, "发送页面状态发生改变的消息，appear: " + z);
        com.taobao.android.fluid.framework.data.datamodel.a aVar = this.f;
        a.d e = aVar != null ? aVar.e() : null;
        if (e != null) {
            HashMap hashMap = new HashMap();
            if (z) {
                str = "appear";
            } else {
                str = "disappear";
            }
            hashMap.put("state", str);
            String a2 = ((ILifecycleService) this.f24041a.getService(ILifecycleService.class)).getConfig().a();
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("type", a2);
            }
            ir9.b(TAG, "发送页面状态发生改变的消息到消息中心，args: " + hashMap);
            ((IMessageService) this.f24041a.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_pageStateChanged", e.c, hashMap));
        }
    }

    private void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c70b6a6", new Object[]{this, new Boolean(z)});
        } else if (ngf.a()) {
            ((IContainerService) this.f24041a.getService(IContainerService.class)).addFirstCardRenderListener(new a(this, z));
        }
    }

    private void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac41e453", new Object[]{this});
        } else {
            ((IDataService) this.f24041a.getService(IDataService.class)).onDataChanged(this.f);
        }
    }

    private void V() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49b4f", new Object[]{this});
            return;
        }
        String str = ((IDataService) this.f24041a.getService(IDataService.class)).getConfig().j().b;
        if (!ngf.d() || TextUtils.isEmpty(str) || ((IQuickOpenService) this.f24041a.getService(IQuickOpenService.class)).isInQuickOpenMode()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((IInteractionService) this.d.U().getService(IInteractionService.class)).getConfig().f(true);
            boolean q2 = akt.q2("disableWeexLayer");
            if (this.h == null && !q2) {
                this.h = new k93(this.e, this.d);
                ((IMessageService) this.f24041a.getService(IMessageService.class)).registerMessageHandler(this.h);
            }
        } else {
            ((IInteractionService) this.d.U().getService(IInteractionService.class)).getConfig().f(false);
            k93 k93Var = this.h;
            if (k93Var != null) {
                k93Var.onDestroy();
                this.c.unRegisterMessageHandler(this.h);
                this.h = null;
            }
        }
        T(z);
    }

    private void o(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf0dbcb", new Object[]{this, uq9Var});
            return;
        }
        V();
        this.i = new s83(this, uq9Var, this.e);
        ((IMessageService) this.f24041a.getService(IMessageService.class)).registerMessageHandler(this.i);
    }

    public void F(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c523caee", new Object[]{this, new Float(f)});
            return;
        }
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.n(f);
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818807f9", new Object[]{this, str});
            return;
        }
        ir9.b(TAG, "更新卡片消息 Handler 中当前卡片的 ID：" + str);
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.r(str);
        }
        s83 s83Var = this.i;
        if (s83Var != null) {
            s83Var.r(str);
        }
    }

    public s83 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s83) ipChange.ipc$dispatch("d8abee8b", new Object[]{this});
        }
        return this.i;
    }

    public void m() {
        k93 k93Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a1296", new Object[]{this});
        } else if (this.g != null && (k93Var = this.h) != null) {
            k93Var.s();
        }
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        U();
        M("active");
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.e();
        }
        R();
        I();
    }

    @Override // tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        } else {
            N();
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        this.f = aVar;
        this.g = aVar.e();
        if (((IQuickOpenService) this.f24041a.getService(IQuickOpenService.class)).isQuickOpenMode()) {
            a.d dVar = this.g;
            new vrp(vrp.MSG_DATA_CHANGE, dVar.c, dVar.h(this.f24041a));
        } else {
            V();
            Q(aVar, aVar.e());
        }
        m();
        G();
    }

    @Override // tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        }
    }

    @Override // tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        M("disactive");
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.f();
        }
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        } else {
            O();
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        S(false);
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.onPause();
        }
    }

    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
            return;
        }
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.onRealStart();
        }
    }

    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
            return;
        }
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.onRealStop();
        }
    }

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        S(true);
        k93 k93Var = this.h;
        if (k93Var != null) {
            k93Var.onResume();
        }
    }

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        } else {
            P();
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        } else {
            M("willDisActive");
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f732e7", new Object[]{this, new Boolean(z)});
        } else if (z) {
            k93 k93Var = this.h;
            if (k93Var != null) {
                k93Var.s();
            }
        } else {
            k93 k93Var2 = this.h;
            if (k93Var2 != null) {
                k93Var2.m();
            }
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd390d4", new Object[]{this, new Boolean(z)});
        } else if (z) {
            k93 k93Var = this.h;
            if (k93Var != null) {
                k93Var.s();
            }
        } else {
            k93 k93Var2 = this.h;
            if (k93Var2 != null) {
                k93Var2.m();
            }
        }
    }

    private void G() {
        x3q a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dea6b88", new Object[]{this});
        } else if (ngf.c() && (a2 = this.d.c0().a()) != null && !a2.h()) {
            ir9.b(TAG, "resestCardVideoView,需要重置，收到VSMSG_screenMove消息,SlideDownParam:" + a2.toString());
            int e = a2.e();
            tvp.i(new x3q.b().s(this.e).k(a2.a()).u(e).o(a2.g()).r(a2.j()).t(-e).p(true).q(true).n(a2.c()).m());
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        } else if (((IQuickOpenService) this.f24041a.getService(IQuickOpenService.class)).isInQuickOpenMode() && list != null && list.size() == 1 && (list.get(0) instanceof Long) && Long.valueOf(((IDataService) this.f24041a.getService(IDataService.class)).getQuickSecondRefreshMd5()).equals((Long) list.get(0))) {
            this.f = aVar;
            V();
            Q(aVar, aVar.e());
        }
    }
}
