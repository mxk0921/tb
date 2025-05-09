package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.ConfigSource;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.TaoLiveMtopSubscriber;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.task.Coordinator;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.a7v;
import tb.ac9;
import tb.ah6;
import tb.c7t;
import tb.ch6;
import tb.e7t;
import tb.ef6;
import tb.eh6;
import tb.feg;
import tb.fh8;
import tb.fkx;
import tb.fs5;
import tb.g7v;
import tb.gg6;
import tb.gh6;
import tb.hha;
import tb.ih6;
import tb.k6t;
import tb.kh6;
import tb.km7;
import tb.nha;
import tb.o3s;
import tb.ph6;
import tb.pn5;
import tb.q2s;
import tb.q3a;
import tb.qe6;
import tb.qi6;
import tb.qqt;
import tb.qr5;
import tb.ri5;
import tb.ss5;
import tb.t2o;
import tb.uav;
import tb.uo7;
import tb.vha;
import tb.vir;
import tb.wda;
import tb.wg6;
import tb.wsh;
import tb.xea;
import tb.xo7;
import tb.yg6;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UltronInstanceViewModel extends ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean k = false;

    /* renamed from: a  reason: collision with root package name */
    public volatile com.alibaba.android.ultron.vfw.instance.a f8537a;
    public String b;
    public ConfigSource c;
    public final MutableLiveData<Boolean> d;
    public final LiveData<Boolean> f;
    public final feg h;
    public final ExecutorService i;
    public boolean e = false;
    public final q3a g = new q3a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            hha.b("UltronInstanceViewModel", "rejectedExecution | r=" + runnable + " isDestroy=" + UltronInstanceViewModel.c(UltronInstanceViewModel.this).isShutdown());
            nha.p(UltronInstanceViewModel.c(UltronInstanceViewModel.this).isShutdown());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(UltronInstanceViewModel ultronInstanceViewModel) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "taolive_gl";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements a7v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f8539a;

        public c(Handler handler) {
            this.f8539a = handler;
        }

        public final /* synthetic */ void b(ConfigSource configSource, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b116f525", new Object[]{this, configSource, str});
                return;
            }
            hha.b("UltronInstanceViewModel", "onConfigFetched | source=" + configSource + " ultronConfigSource=" + UltronInstanceViewModel.this.c);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (UltronInstanceViewModel.this.c == null || configSource.getIntValue() >= UltronInstanceViewModel.this.c.getIntValue()) {
                UltronInstanceViewModel ultronInstanceViewModel = UltronInstanceViewModel.this;
                ultronInstanceViewModel.c = configSource;
                ultronInstanceViewModel.b = str;
                if (!TextUtils.isEmpty(str)) {
                    UltronInstanceViewModel ultronInstanceViewModel2 = UltronInstanceViewModel.this;
                    ultronInstanceViewModel2.b = ultronInstanceViewModel2.b.replace("#{", "${");
                }
                UltronInstanceViewModel.d(UltronInstanceViewModel.this).setValue(Boolean.TRUE);
            }
        }

        public void c(final String str, final ConfigSource configSource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e734103", new Object[]{this, str, configSource});
                return;
            }
            Runnable z8vVar = new Runnable() { // from class: tb.z8v
                @Override // java.lang.Runnable
                public final void run() {
                    UltronInstanceViewModel.c.this.b(configSource, str);
                }
            };
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z8vVar.run();
            } else {
                this.f8539a.post(z8vVar);
            }
        }
    }

    static {
        t2o.a(295699289);
    }

    public UltronInstanceViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.d = mutableLiveData;
        this.f = mutableLiveData;
        if (yga.g()) {
            hha.b("UltronInstanceViewModel", "UltronInstanceViewModel | use VExecutors.");
            ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(4, new b(this), new a());
            this.i = newFixedThreadPool;
            if (newFixedThreadPool instanceof ThreadPoolExecutor) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newFixedThreadPool;
                threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        } else {
            hha.b("UltronInstanceViewModel", "UltronInstanceViewModel | use Coordinator.");
        }
        if (wda.x() || wda.a()) {
            feg fegVar = new feg();
            this.h = fegVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(GLRenderType.BIG_CARD.pageCode);
            if (wda.x()) {
                arrayList.add(GLRenderType.SMALL_CARD.pageCode);
                arrayList.add(GLRenderType.GOODS_LIST.pageCode);
                k = vha.a("gl_first_in_live", true);
                vha.d("gl_first_in_live", false);
            }
            fegVar.g(arrayList);
        }
        hha.b("UltronInstanceViewModel", "UltronInstanceViewModel | create. enableShowcaseLV=" + wda.x() + " sFirstInLive=" + k);
    }

    public static /* synthetic */ ExecutorService c(UltronInstanceViewModel ultronInstanceViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("cbf97815", new Object[]{ultronInstanceViewModel});
        }
        return ultronInstanceViewModel.i;
    }

    public static /* synthetic */ MutableLiveData d(UltronInstanceViewModel ultronInstanceViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("784ebdad", new Object[]{ultronInstanceViewModel});
        }
        return ultronInstanceViewModel.d;
    }

    public static /* synthetic */ Object ipc$super(UltronInstanceViewModel ultronInstanceViewModel, String str, Object... objArr) {
        if (str.hashCode() == -607929644) {
            super.onCleared();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/bean/UltronInstanceViewModel");
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e887cb6", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.f8537a != null) {
            hha.b("UltronInstanceViewModel", "Ultron Instance: " + this.f8537a.hashCode() + " to destroy! with ViewModel Clear");
            this.f8537a.r();
            this.f8537a = null;
        }
        this.e = false;
        this.g.j();
        hha.b("UltronInstanceViewModel", "destroyInternal | isInit=" + z + " mExecutorService=" + this.i);
        if (!z) {
            feg fegVar = this.h;
            if (fegVar != null) {
                fegVar.e();
            }
            ExecutorService executorService = this.i;
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e43cab", new Object[]{this});
        } else if (!this.e) {
            g();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7df08b7", new Object[]{this});
            return;
        }
        hha.b("UltronInstanceViewModel", "fetchUltronConfig.");
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c(handler);
        Runnable v8vVar = new Runnable() { // from class: tb.v8v
            @Override // java.lang.Runnable
            public final void run() {
                UltronInstanceViewModel.this.k(cVar, handler);
            }
        };
        ExecutorService executorService = this.i;
        if (executorService != null) {
            executorService.execute(v8vVar);
        } else {
            Coordinator.execute(v8vVar, 50);
        }
    }

    public q3a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3a) ipChange.ipc$dispatch("b110093", new Object[]{this});
        }
        return this.g;
    }

    public final /* synthetic */ void k(a7v a7vVar, Handler handler) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d225564", new Object[]{this, a7vVar, handler});
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new ac9(countDownLatch, this.i).a(a7vVar);
        if (this.f8537a == null) {
            context = null;
        } else {
            context = this.f8537a.getContext();
        }
        new wsh(countDownLatch, context, this.i).b(a7vVar);
        new uav(countDownLatch, this.i).b(a7vVar);
        try {
            countDownLatch.await(1500L, TimeUnit.MILLISECONDS);
            handler.post(new Runnable() { // from class: tb.x8v
                @Override // java.lang.Runnable
                public final void run() {
                    UltronInstanceViewModel.this.m();
                }
            });
        } catch (Throwable th) {
            hha.g("VMUltronInstance", th.toString());
        }
    }

    public final /* synthetic */ void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3f825b", new Object[]{this});
            return;
        }
        if (ConfigSource.FILE != this.c) {
            g7v.a(this.b, q2s.FILE_NAME2);
        }
        if (this.f8537a != null) {
            h();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc3bad4", new Object[]{this});
            return;
        }
        super.onCleared();
        f(false);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991ec778", new Object[]{this});
            return;
        }
        hha.b("UltronInstanceViewModel", "开始下载或更新DX2 模板信息!, source=" + this.c + "    thread=" + Thread.currentThread() + "    this=" + this);
        JSONObject d = fkx.d(this.b);
        if (d != null) {
            this.f8537a.D().q(d);
            this.f8537a.T(null);
            this.f8537a.G().C();
            this.e = true;
        }
    }

    public com.alibaba.android.ultron.vfw.instance.a e(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("ec3d1162", new Object[]{this, xeaVar});
        }
        if (this.f8537a == null || this.f8537a.getContext() != xeaVar.i()) {
            if (wda.b()) {
                f(true);
            }
            try {
                km7.c(SmartLandingTask.Operation.STR_EQUAL, new fh8());
            } catch (DinamicException e) {
                o3s.b("UltronInstanceViewModel", e.getMessage());
            }
            this.f8537a = com.alibaba.android.ultron.vfw.instance.a.q(new UltronInstanceConfig().n(true).z("live").K(false), xeaVar.i());
            hha.b("UltronInstanceViewModel", "create Ultron Instance: " + this.f8537a.hashCode() + "    activity=" + xeaVar.i());
            this.f8537a.B0(pn5.DX_PARSER_JSONARRAYSTR2TEXTBYKEY, new pn5());
            this.f8537a.B0(ri5.DX_PARSER_CALLFUN, new ri5());
            this.f8537a.B0(fs5.DX_PARSER_TBLIVE_GETSERVERTIME, new fs5());
            this.f8537a.B0(qr5.DX_PARSER_TAOLIVEDXAB, new qr5());
            this.f8537a.z0(ss5.e(), new ss5());
            this.f8537a.z0("tlStrMap", new ef6());
            this.f8537a.A0(ch6.DX_EVENT_TBLIVE_ADDTOCART, new ch6());
            this.f8537a.A0(wg6.DX_EVENT_TBLIVEGOTODETAIL, new wg6());
            this.f8537a.A0(yg6.DX_EVENT_TBLIVEROOMACTION, new yg6());
            this.f8537a.A0(ah6.DX_EVENT_TBLIVESENDDYNAMICMESSAGE, new ah6());
            this.f8537a.A0(qi6.DX_EVENT_TLOPENINTERACTIVECOMPONENT, new qi6());
            this.f8537a.A0(gh6.DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD, new gh6());
            this.f8537a.A0(eh6.DX_EVENT_TBLIVE_GOODS_EXPLOSION_ITEM_CLICK_EVENT, new eh6());
            this.f8537a.A0(gg6.DX_EVENT_TAOLIVEROOMCOMMONHANDLER, new gg6());
            this.f8537a.A0(ph6.DX_EVENT_TBLIVEGOODCASEGOTODETAIL, new ph6());
            this.f8537a.A0(ih6.DX_EVENT_TBLIVE_GOODS_TOP_CARD, new ih6());
            this.f8537a.A0(kh6.DX_EVENT_TBLIVE_PRESALE, new kh6());
            this.f8537a.C0(qe6.DXTBLTIMER_TBLTIMER, new qe6.b());
            this.f8537a.A0(1544903441687469454L, new uo7());
            this.f8537a.getEventHandler().d("AbilityHub", new vir());
            this.f8537a.getEventHandler().d("tlOpenUrl", new k6t());
            this.f8537a.getEventHandler().d("tlToast", new c7t());
            this.f8537a.getEventHandler().d("tlMtop", new TaoLiveMtopSubscriber());
            this.f8537a.getEventHandler().d("tlTrack", new e7t());
            this.g.j();
            this.g.m(this.f8537a);
            i();
            return this.f8537a;
        }
        hha.b("UltronInstanceViewModel", "VMUltronInstance | reuse, context=" + xeaVar.i() + "    this=" + this);
        hha.b("VMUltronInstance", "直播间内复用奥创引擎");
        this.f8537a.G().c0().d();
        this.f8537a.G().c0().a("dinamicx", new xo7(this.f8537a.G()));
        this.f8537a.A0(1544903441687469454L, new uo7());
        return this.f8537a;
    }
}
