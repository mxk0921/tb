package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dl extends bp<AURAParseIO, AURARenderIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSE_SERVICE_CODE = "aura.service.parse";
    public bcb c;
    public lo d;

    static {
        t2o.a(80740496);
    }

    public static /* synthetic */ Object ipc$super(dl dlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/parse/AURAParseService");
        }
    }

    @Override // tb.bp
    public void B(AURAInputData<AURAParseIO> aURAInputData, pt<AURARenderIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        AURATraceUtil.a(3, "AURAParseService");
        this.c = new cl(this.d, new a(aURAInputData, ptVar), r());
        ((cl) this.c).o(aURAInputData.getGlobalData(), aURAInputData.getData());
    }

    @Override // tb.gn, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.d = loVar;
    }

    @Override // tb.gn, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        bcb bcbVar = this.c;
        if (bcbVar != null) {
            ((cl) bcbVar).z();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements acb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AURAInputData<AURAParseIO> f17889a;
        public final pt<AURARenderIO> b;

        /* compiled from: Taobao */
        /* renamed from: tb.dl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0906a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f17890a;
            public final /* synthetic */ AURARenderComponent b;

            public RunnableC0906a(long j, AURARenderComponent aURARenderComponent) {
                this.f17890a = j;
                this.b = aURARenderComponent;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                a.g("线程切换耗时：" + (currentTimeMillis - this.f17890a), this.f17890a, currentTimeMillis);
                a aVar = a.this;
                a.c(aVar, this.b, a.a(aVar), a.b(a.this));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ mi f17891a;

            public b(mi miVar) {
                this.f17891a = miVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.b(a.this).b(this.f17891a);
                }
            }
        }

        static {
            t2o.a(80740497);
            t2o.a(80740500);
        }

        public a(AURAInputData<AURAParseIO> aURAInputData, pt<AURARenderIO> ptVar) {
            this.f17889a = aURAInputData;
            this.b = ptVar;
        }

        public static /* synthetic */ AURAInputData a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURAInputData) ipChange.ipc$dispatch("c9ba641d", new Object[]{aVar});
            }
            return aVar.f17889a;
        }

        public static /* synthetic */ pt b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pt) ipChange.ipc$dispatch("2dd6d6e5", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ void c(a aVar, AURARenderComponent aURARenderComponent, AURAInputData aURAInputData, pt ptVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b79f6970", new Object[]{aVar, aURARenderComponent, aURAInputData, ptVar});
            } else {
                aVar.d(aURARenderComponent, aURAInputData, ptVar);
            }
        }

        public static void g(String str, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3640e4ff", new Object[]{str, new Long(j), new Long(j2)});
            } else {
                ck.g().e(str, ck.b.b().i("AURA/performance").d("switchThreadStartTime", j).d("switchThreadEndTime", j2).a());
            }
        }

        public void e(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                dn.f(new b(miVar), 0L);
            }
        }

        public void f(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47232030", new Object[]{this, aURARenderComponent});
            } else if (ao.a()) {
                d(aURARenderComponent, this.f17889a, this.b);
            } else {
                dn.a().postAtFrontOfQueue(new RunnableC0906a(System.currentTimeMillis(), aURARenderComponent));
            }
        }

        public final void d(AURARenderComponent aURARenderComponent, AURAInputData<AURAParseIO> aURAInputData, pt<AURARenderIO> ptVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f71aa485", new Object[]{this, aURARenderComponent, aURAInputData, ptVar});
                return;
            }
            AURATraceUtil.b(3);
            if (aURARenderComponent == null) {
                ptVar.b(new mi(0, "AURAParseServiceDomain", "-1000_EMPTY_RENDER_TREE", "渲染树生成失败"));
            } else {
                ptVar.c(yk.a(new AURARenderIO(aURARenderComponent), aURAInputData));
            }
        }
    }
}
