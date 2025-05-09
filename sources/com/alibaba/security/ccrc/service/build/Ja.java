package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.F;
import com.alibaba.security.ccrc.service.build.Ja;
import com.alibaba.security.client.smart.core.algo.AlgoCodeConstants;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.wukong.AlgoResultReporter;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.secutiry.mnn.pykit.PythonKitManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.mrt.MRT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.zqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ja {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2560a = "WuKongPythonMnnManager";
    public final String d;
    public C1195v f;
    public AbstractC1157eb g;
    public C1193u h;
    public ThreadPoolExecutor i;
    public final Map<String, mb> b = new HashMap();
    public final AlgoResultReporter c = AlgoResultReporter.a.f2920a;
    public final Handler e = new HandlerC1156ea(null);

    public Ja(String str) {
        this.d = str;
    }

    public static /* synthetic */ void a(Ja ja, String str, AbstractC1154db dbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9b8945", new Object[]{ja, str, dbVar});
        } else {
            ja.a(str, dbVar);
        }
    }

    private Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f183c0e3", new Object[]{this});
        }
        return CcrcContextImpl.getContext();
    }

    private synchronized ThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("90cb814c", new Object[]{this});
        }
        if (this.i == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque(500);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, timeUnit, linkedBlockingDeque, new ThreadFactoryC1192ta(this.d + "#mnn_python_manager"), new Ia(this));
            this.i = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return this.i;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            zqh.d().g(new Ca(this));
        }
    }

    private synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (Map.Entry<String, mb> entry : this.b.entrySet()) {
            mb value = entry.getValue();
            if (value != null) {
                value.release();
            }
        }
        this.b.clear();
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.i;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
            this.i = null;
        }
        g();
        AlgoResultReporter algoResultReporter = this.c;
        if (algoResultReporter != null) {
            algoResultReporter.release();
        }
        C1193u uVar = this.h;
        if (uVar != null) {
            uVar.a();
        }
    }

    private synchronized void b(List<Algo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        for (Algo algo : list) {
            if (this.b.get(algo.code) == null) {
                this.b.put(algo.code, a(CcrcContextImpl.getContext(), algo, this.g));
            }
        }
    }

    public static /* synthetic */ void a(Ja ja, CCRCRiskSample cCRCRiskSample, CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7379b1", new Object[]{ja, cCRCRiskSample, config});
        } else {
            ja.a(cCRCRiskSample, config);
        }
    }

    public void a(List<Algo> list, AbstractC1154db dbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdde1ff", new Object[]{this, list, dbVar});
        } else if (list == null || list.isEmpty()) {
            dbVar.a(true, null, null);
        } else {
            b(list);
            if (a(list)) {
                a();
            }
            PythonKitManager.a(CcrcContextImpl.getContext());
            dbVar.a(true, null, null);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : sb.a() && !sb.a(this.d).b();
    }

    private boolean c(List<Algo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e037145f", new Object[]{this, list})).booleanValue();
        }
        for (Algo algo : list) {
            if (!MNNCV.isTaskRunnable(algo.code)) {
                return false;
            }
        }
        return true;
    }

    public void a(List<Algo> list, String str, AbstractC1154db dbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ec2089", new Object[]{this, list, str, dbVar});
        } else if (list == null || list.isEmpty()) {
            dbVar.a(true, null, null);
        } else {
            b(list);
            if (this.b.isEmpty()) {
                dbVar.a(true, null, null);
            } else if (b()) {
                dbVar.a(true, F.a.f2551a, null);
            } else {
                f();
                if (!MRT.i() || !MNNCV.isAvailable()) {
                    B.a().c();
                }
                if (!a(list)) {
                    C1184p.a(new Da(this, str, dbVar), 2000L, new Ea(this, list));
                } else {
                    a(str, dbVar);
                }
            }
        }
    }

    public boolean a(List<Algo> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue() : MRT.i() && MNNCV.isAvailable() && c(list);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (mb mbVar : this.b.values()) {
                mbVar.a(new Fa(this, currentTimeMillis));
            }
        }
    }

    private synchronized void a(String str, AbstractC1154db dbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b18e358", new Object[]{this, str, dbVar});
            return;
        }
        boolean[] zArr = {true};
        AtomicInteger atomicInteger = new AtomicInteger(this.b.size());
        ArrayList arrayList = new ArrayList();
        for (mb mbVar : this.b.values()) {
            mbVar.a(str, new Ga(this, zArr, arrayList, atomicInteger, dbVar));
        }
    }

    private mb a(Context context, Algo algo, AbstractC1157eb ebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mb) ipChange.ipc$dispatch("b9c0e077", new Object[]{this, context, algo, ebVar});
        }
        if (TextUtils.equals(algo.code, AlgoCodeConstants.CODE_KEY_FRAME)) {
            return new lb(context, algo, ebVar);
        }
        return new C1175kb(context, algo, ebVar);
    }

    public synchronized void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f6a750", new Object[]{this, cCRCRiskSample, config, new Boolean(z)});
        } else if (!this.b.isEmpty()) {
            if (z) {
                a(cCRCRiskSample, config);
            } else {
                e().submit(new Ha(this, cCRCRiskSample, config));
            }
        }
    }

    private void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457b8c04", new Object[]{this, cCRCRiskSample, config});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, mb> entry : this.b.entrySet()) {
            mb value = entry.getValue();
            if (value != null && value.a(cCRCRiskSample.getSampleType())) {
                final Map<String, Object> detect = value.detect(cCRCRiskSample);
                ClientAlgoResult obtain = ClientAlgoResult.obtain(value.algoCode(), detect, cCRCRiskSample);
                if (this.f != null) {
                    this.e.post(new Runnable() { // from class: tb.tsf
                        @Override // java.lang.Runnable
                        public final void run() {
                            Ja.this.a(detect);
                        }
                    });
                }
                if (value.c()) {
                    this.c.addResult(obtain, this.g.getCcrcCode(), config.getPid());
                } else {
                    arrayList.add(obtain);
                }
            }
        }
        if (this.h != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.h.a(config, (ClientAlgoResult) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f.a(map);
        }
    }

    public void a(C1193u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4228f4af", new Object[]{this, uVar});
        } else {
            this.h = uVar;
        }
    }

    public synchronized void a(AbstractC1157eb ebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226220f", new Object[]{this, ebVar});
        } else {
            this.g = ebVar;
        }
    }

    public void a(C1195v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4229690e", new Object[]{this, vVar});
        } else {
            this.f = vVar;
        }
    }
}
