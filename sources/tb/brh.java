package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.android.alinnpython.AliNNPythonThreadState;
import com.taobao.mrt.task.MRTJob;
import com.taobao.mrt.task.MRTJobRefuseReason;
import com.taobao.mrt.thread.MRTThreadPriority;
import java.util.HashMap;
import tb.crh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class brh extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String g = "MRTThread";

    /* renamed from: a  reason: collision with root package name */
    private final MRTThreadPriority f16568a;
    private final drh b;
    private yqh d;
    private AliNNPython e;
    private volatile boolean c = true;
    private boolean f = false;

    static {
        t2o.a(577765435);
    }

    public brh(yqh yqhVar, MRTThreadPriority mRTThreadPriority, drh drhVar, String str) {
        this.d = yqhVar;
        this.f16568a = mRTThreadPriority;
        setPriority(mRTThreadPriority.getThreadPriority());
        this.b = drhVar;
        setName(str);
        kgh.u(g, "线程:" + getName() + " 被创建", true);
    }

    private static AliNNPython d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNPython) ipChange.ipc$dispatch("13724348", new Object[]{new Long(j)});
        }
        AliNNPython newAliNNPythonInstance = AliNNPython.newAliNNPythonInstance();
        if (newAliNNPythonInstance != null) {
            newAliNNPythonInstance.threadState = new AliNNPythonThreadState();
        }
        return newAliNNPythonInstance;
    }

    public static /* synthetic */ Object ipc$super(brh brhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/thread/MRTThread");
    }

    public AliNNPython a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNPython) ipChange.ipc$dispatch("65c11bf4", new Object[]{this});
        }
        return this.e;
    }

    public MRTThreadPriority c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTThreadPriority) ipChange.ipc$dispatch("6f5ea951", new Object[]{this});
        }
        return this.f16568a;
    }

    private AliNNPython b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNPython) ipChange.ipc$dispatch("3a4e3d0e", new Object[]{this, new Long(j)});
        }
        if (this.e == null && !this.f) {
            AliNNPython d = d(j);
            this.e = d;
            if (d == null) {
                this.f = true;
                kgh.c(g, "线程:" + getName() + " 启动引擎失败:");
            }
        }
        return this.e;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdee0e5", new Object[]{this});
            return;
        }
        kgh.s(g, "线程:" + getName() + "将被销毁");
        this.c = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.e == null) {
                this.e = b(getId());
            }
            while (this.c) {
                kgh.u(g, "线程:" + getName() + " is running", true);
                MRTJob e = ((lqh) this.d).e();
                if (e != null) {
                    String str = e.h.name;
                    kgh.u(g, "线程:" + getName() + " 开始执行任务:" + str, true);
                    if (MRTJobRefuseReason.MRTJobRefuseReasonNone != crh.g().h(str)) {
                        e.b();
                    } else if (!this.c) {
                        break;
                    } else {
                        crh.b bVar = new crh.b(str, e.h.cid, System.currentTimeMillis(), this.b, getName());
                        crh.g().i(bVar);
                        HashMap hashMap = new HashMap();
                        hashMap.put("name", str);
                        dqh.a(hashMap);
                        e.d(this.e);
                        if (e.e - e.d > 10000) {
                            crh.g().f(str);
                        }
                        crh.g().k(bVar);
                        ((lqh) this.d).b(e);
                        dqh.b();
                        kgh.u(g, "线程:" + getName() + " 结束执行任务:" + e.h.name, true);
                    }
                }
            }
        } catch (Throwable th) {
            try {
                kgh.d(g, "线程:" + getName() + "异常", th);
                kgh.c(g, "线程:" + getName() + "结束");
                AliNNPython aliNNPython = this.e;
                if (aliNNPython != null) {
                    aliNNPython.release();
                }
            } finally {
                kgh.c(g, "线程:" + getName() + "结束");
                AliNNPython aliNNPython2 = this.e;
                if (aliNNPython2 != null) {
                    aliNNPython2.release();
                }
                this.c = false;
            }
        }
    }
}
