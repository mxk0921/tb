package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.C1193u;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.u  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1193u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2624a = "AggregationEngine";
    public final ConcurrentHashMap<C1165ha<String, String>, DelayedC1203z> b = new ConcurrentHashMap<>();
    public final DelayQueue<DelayedC1203z> c = new DelayQueue<>();
    public final String d;
    public b e;
    public AbstractC1189s f;
    public Map<String, Integer> g;
    public a h;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.security.ccrc.service.build.u$a */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            StringBuilder a2 = Kb.a("CcrcDataThread#");
            a2.append(C1193u.a(C1193u.this));
            setName(a2.toString());
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/u$a");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    DelayedC1203z zVar = (DelayedC1203z) C1193u.b(C1193u.this).take();
                    zVar.a(true);
                    ConcurrentHashMap<String, Object> a2 = zVar.a();
                    if (((DelayedC1203z) C1193u.c(C1193u.this).remove(new C1165ha(zVar.d(), zVar.f()))) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1193u.a(C1193u.this, zVar, a2, z);
                    C1193u.d(C1193u.this).a(zVar.b(), zVar.f(), a2, zVar.c());
                } catch (Throwable th) {
                    Logging.e(C1193u.f2624a, "Data aggregation fail", th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.security.ccrc.service.build.u$b */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(CcrcService.Config config, String str, Map<String, Object> map, SampleData sampleData);

        String b(String str);
    }

    public C1193u(String str) {
        this.d = str;
    }

    public static /* synthetic */ String a(C1193u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75113d1", new Object[]{uVar}) : uVar.d;
    }

    public static /* synthetic */ DelayQueue b(C1193u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DelayQueue) ipChange.ipc$dispatch("110984f9", new Object[]{uVar}) : uVar.c;
    }

    public static /* synthetic */ ConcurrentHashMap c(C1193u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("d9046d9", new Object[]{uVar});
        }
        return uVar.b;
    }

    public static /* synthetic */ b d(C1193u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e4a29015", new Object[]{uVar});
        }
        return uVar.e;
    }

    public static /* synthetic */ void a(C1193u uVar, DelayedC1203z zVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2cf0dd2", new Object[]{uVar, zVar, map, new Boolean(z)});
        } else {
            uVar.b(zVar, map, z);
        }
    }

    private void b(final DelayedC1203z zVar, final Map<String, Object> map, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4543258", new Object[]{this, zVar, map, new Boolean(z)});
        } else if (zVar == null) {
            Logging.e(f2624a, "inferData is null");
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.uuz
                @Override // java.lang.Runnable
                public final void run() {
                    C1193u.this.a(zVar, map, z);
                }
            });
        }
    }

    public void a(Map<String, Integer> map, b bVar, AbstractC1189s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89fc09fd", new Object[]{this, map, bVar, sVar});
            return;
        }
        this.g = map;
        this.f = sVar;
        this.e = bVar;
    }

    public void a(CcrcService.Config config, ClientAlgoResult clientAlgoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47df2eb7", new Object[]{this, config, clientAlgoResult});
            return;
        }
        if (this.h == null) {
            a aVar = new a();
            this.h = aVar;
            aVar.start();
        }
        String str = clientAlgoResult.mSampleData.metaId;
        String b2 = this.e.b(clientAlgoResult.algoCode);
        C1165ha haVar = new C1165ha(str, b2);
        if (this.b.containsKey(haVar)) {
            DelayedC1203z zVar = this.b.get(haVar);
            if (zVar == null || zVar.g()) {
                this.f.a(config, clientAlgoResult.mSampleData, "data is overdue");
            } else {
                zVar.a(clientAlgoResult);
            }
        } else {
            Integer num = this.g.get(b2);
            if (num == null) {
                num = 0;
            }
            DelayedC1203z zVar2 = new DelayedC1203z(config, clientAlgoResult, num.intValue(), b2);
            this.b.put(new C1165ha<>(str, b2), zVar2);
            this.c.offer((DelayQueue<DelayedC1203z>) zVar2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DelayedC1203z zVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f32e79", new Object[]{this, zVar, map, new Boolean(z)});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(zVar.b().getPid()).setMetaId(zVar.d()).setSampleId(zVar.e()).setCcrcCode(this.d).setPhase("detect").setOperation(C1174ka.a.h).setStatus(0).addParam("mergeData", map).addExt("removeSuccess", Boolean.valueOf(z)).build());
        }
    }
}
