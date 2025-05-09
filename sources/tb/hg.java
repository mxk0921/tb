package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.AURAEmptySerializable;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.zi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hg extends bp<AURAAspectServiceInput, AURAEmptySerializable> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_CODE = "aura.service.aspect";
    public final List<AURAInputData<AURAAspectServiceInput>> c = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements zi.b<xab> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAAspectServiceInput f20614a;
        public final /* synthetic */ cg b;

        public a(hg hgVar, AURAAspectServiceInput aURAAspectServiceInput, cg cgVar) {
            this.f20614a = aURAAspectServiceInput;
            this.b = cgVar;
        }

        /* renamed from: c */
        public void a(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a64c778", new Object[]{this, xabVar});
            } else {
                xabVar.beforeFlowExecute(this.f20614a.getInputData(), this.b);
            }
        }

        /* renamed from: d */
        public boolean b(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2c1bb95d", new Object[]{this, xabVar})).booleanValue();
            }
            if (xabVar instanceof ms) {
                return ((ms) xabVar).O0();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements zi.b<xab> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAAspectServiceInput f20615a;
        public final /* synthetic */ cg b;

        public b(hg hgVar, AURAAspectServiceInput aURAAspectServiceInput, cg cgVar) {
            this.f20615a = aURAAspectServiceInput;
            this.b = cgVar;
        }

        /* renamed from: c */
        public void a(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a64c778", new Object[]{this, xabVar});
            } else {
                xabVar.afterFlowExecute(this.f20615a.getOutputData(), this.b, this.f20615a.isError());
            }
        }

        /* renamed from: d */
        public boolean b(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2c1bb95d", new Object[]{this, xabVar})).booleanValue();
            }
            if (xabVar instanceof ms) {
                return ((ms) xabVar).O0();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements zi.b<xab> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAAspectServiceInput f20616a;
        public final /* synthetic */ cg b;

        public c(hg hgVar, AURAAspectServiceInput aURAAspectServiceInput, cg cgVar) {
            this.f20616a = aURAAspectServiceInput;
            this.b = cgVar;
        }

        /* renamed from: c */
        public void a(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a64c778", new Object[]{this, xabVar});
            } else {
                xabVar.beforeServiceExecute(this.f20616a.getInputData(), this.b);
            }
        }

        /* renamed from: d */
        public boolean b(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2c1bb95d", new Object[]{this, xabVar})).booleanValue();
            }
            if (xabVar instanceof ms) {
                return ((ms) xabVar).O0();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements zi.b<xab> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAAspectServiceInput f20617a;
        public final /* synthetic */ cg b;

        public d(hg hgVar, AURAAspectServiceInput aURAAspectServiceInput, cg cgVar) {
            this.f20617a = aURAAspectServiceInput;
            this.b = cgVar;
        }

        /* renamed from: c */
        public void a(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a64c778", new Object[]{this, xabVar});
            } else {
                xabVar.afterServiceExecute(this.f20617a.getOutputData(), this.b, this.f20617a.isError());
            }
        }

        /* renamed from: d */
        public boolean b(xab xabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2c1bb95d", new Object[]{this, xabVar})).booleanValue();
            }
            if (xabVar instanceof ms) {
                return ((ms) xabVar).O0();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e extends pt<AURAEmptySerializable> {
        public e(hg hgVar) {
        }
    }

    static {
        t2o.a(79691940);
    }

    public static /* synthetic */ Object ipc$super(hg hgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/aspect/AURAAspectService");
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cb1341", new Object[]{this});
        } else if (!bh.a(this.c)) {
            e eVar = new e(this);
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                B((AURAInputData) it.next(), eVar);
            }
            ((ArrayList) this.c).clear();
        }
    }

    public final void L(AURAInputData<AURAAspectServiceInput> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fab935c", new Object[]{this, aURAInputData});
        } else if (!((ArrayList) this.c).contains(aURAInputData)) {
            ((ArrayList) this.c).add(aURAInputData);
        }
    }

    public final boolean m0() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e13b197", new Object[]{this})).booleanValue();
        }
        if (x() == null || (bool = (Boolean) x().g("enableSchedulePerf", Boolean.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // tb.gn, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        J0();
    }

    @Override // tb.bp
    public void B(AURAInputData<AURAAspectServiceInput> aURAInputData, pt<AURAEmptySerializable> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        yi r = r();
        if (r == null) {
            L(aURAInputData);
            return;
        }
        AURAAspectServiceInput data = aURAInputData.getData();
        int type = data.getType();
        try {
            boolean m0 = m0();
            long currentTimeMillis = System.currentTimeMillis();
            cg aspectInfo = data.getAspectInfo();
            List<xab> f = r.f(xab.class);
            if (type == 0) {
                AURATraceUtil.a(3, "beforeFlowExecute 扩展点执行");
                if (m0) {
                    zi.a(f, new a(this, data, aspectInfo));
                } else {
                    for (xab xabVar : f) {
                        xabVar.beforeFlowExecute(data.getInputData(), aspectInfo);
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                for (jt jtVar : r.f(jt.class)) {
                    jtVar.L(aspectInfo, currentTimeMillis, currentTimeMillis2);
                }
                AURATraceUtil.b(3);
            } else if (type == 1) {
                AURATraceUtil.a(3, "afterFlowExecute 扩展点执行");
                if (m0) {
                    zi.a(f, new b(this, data, aspectInfo));
                } else {
                    for (xab xabVar2 : f) {
                        xabVar2.afterFlowExecute(data.getOutputData(), aspectInfo, data.isError());
                    }
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                for (jt jtVar2 : r.f(jt.class)) {
                    jtVar2.x(aspectInfo, data.isError(), currentTimeMillis, currentTimeMillis3);
                }
                AURATraceUtil.b(3);
            } else if (type == 2) {
                AURATraceUtil.a(3, "beforeServiceExecute 扩展点执行");
                if (m0) {
                    zi.a(f, new c(this, data, aspectInfo));
                } else {
                    for (xab xabVar3 : f) {
                        xabVar3.beforeServiceExecute(data.getInputData(), aspectInfo);
                    }
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                for (jt jtVar3 : r.f(jt.class)) {
                    jtVar3.m0(aspectInfo, currentTimeMillis, currentTimeMillis4);
                }
                AURATraceUtil.b(3);
            } else if (type == 3) {
                AURATraceUtil.a(3, "afterServiceExecute 扩展点执行");
                if (m0) {
                    zi.a(f, new d(this, data, aspectInfo));
                } else {
                    for (xab xabVar4 : f) {
                        xabVar4.afterServiceExecute(data.getOutputData(), aspectInfo, data.isError());
                    }
                }
                long currentTimeMillis5 = System.currentTimeMillis();
                for (jt jtVar4 : r.f(jt.class)) {
                    jtVar4.B(aspectInfo, data.isError(), currentTimeMillis, currentTimeMillis5);
                    aspectInfo = aspectInfo;
                }
                AURATraceUtil.b(3);
            } else if (type == 4) {
                if (!data.isAspectError()) {
                    for (wab wabVar : r.f(wab.class)) {
                        wabVar.b(data.getError());
                    }
                } else if (th.c()) {
                    bo.c(x().f(), "框架不处理错误切面的错误，并且请不要在错误切面中调用onError", 0);
                }
            }
        } catch (Throwable th) {
            if (!th.c()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                th.printStackTrace(new PrintStream(byteArrayOutputStream));
                String str = "-5000_" + type;
                ptVar.b(new mi(1, "AURACoreDomain", str, "执行切面【" + type + "】报错，errorMessage=" + byteArrayOutputStream.toString()));
            } else {
                throw th;
            }
        }
        ptVar.c(yk.a(new AURAEmptySerializable(), aURAInputData));
    }
}
