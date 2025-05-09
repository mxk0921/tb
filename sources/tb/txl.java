package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.performance.model.PerformanceFlowModel;
import com.taobao.android.sku.performance.model.PerformanceStageModel;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class txl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static txl c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<PerformanceStageModel> f29019a = new ConcurrentLinkedQueue<>();
    public PerformanceFlowModel b;

    static {
        t2o.a(442499220);
        t2o.a(442499219);
    }

    public static synchronized txl h() {
        synchronized (txl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (txl) ipChange.ipc$dispatch("eb2f7a6b", new Object[0]);
            }
            if (c == null) {
                c = new txl();
            }
            return c;
        }
    }

    public final void a(PerformanceStageModel performanceStageModel, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f04c102", new Object[]{this, performanceStageModel, map});
        } else if (map != null) {
            Map<String, String> args = performanceStageModel.getArgs();
            if (args == null) {
                args = new HashMap<>();
                performanceStageModel.setArgs(args);
            }
            args.putAll(map);
        }
    }

    public final void b(PerformanceStageModel performanceStageModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be536865", new Object[]{this, performanceStageModel, str});
        } else if (str != null) {
            PerformanceStageModel j = j(str);
            if (j == null) {
                j = c(str);
                e();
                this.b.addChildStage(j);
                o(j, false);
            }
            j.addChildStage(performanceStageModel);
        } else {
            e();
            this.b.addChildStage(performanceStageModel);
        }
    }

    public final PerformanceStageModel c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceStageModel) ipChange.ipc$dispatch("d8e00941", new Object[]{this, str});
        }
        PerformanceStageModel performanceStageModel = new PerformanceStageModel(str);
        this.f29019a.add(performanceStageModel);
        return performanceStageModel;
    }

    public void d(String str, String str2, long j, long j2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c097f0dd", new Object[]{this, str, str2, new Long(j), new Long(j2), map});
            return;
        }
        PerformanceStageModel j3 = j(str);
        if (j3 == null) {
            j3 = c(str);
        }
        j3.setStartMills(j);
        j3.setEndMills(j2);
        a(j3, map);
        b(j3, str2);
        o(j3, false);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d428b64a", new Object[]{this});
        } else if (this.b == null) {
            PerformanceFlowModel performanceFlowModel = new PerformanceFlowModel();
            this.b = performanceFlowModel;
            performanceFlowModel.setStartMills(System.currentTimeMillis());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        e();
        f();
        long l = l(this.b.mChildStages);
        long k = k(this.b.mChildStages);
        this.b.setStartMills(l);
        this.b.setEndMills(k);
        o(this.b, true);
    }

    public PerformanceFlowModel i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceFlowModel) ipChange.ipc$dispatch("cb03d5a0", new Object[]{this});
        }
        e();
        return this.b;
    }

    public PerformanceStageModel j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceStageModel) ipChange.ipc$dispatch("93833497", new Object[]{this, str});
        }
        Iterator<PerformanceStageModel> it = this.f29019a.iterator();
        while (it.hasNext()) {
            PerformanceStageModel next = it.next();
            if (next != null && next.getStageCode() != null && next.getStageCode().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final long k(List<PerformanceStageModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48f58b4c", new Object[]{this, list})).longValue();
        }
        long j = 0;
        if (list != null) {
            for (PerformanceStageModel performanceStageModel : list) {
                long endMills = performanceStageModel.getEndMills();
                if (endMills > j) {
                    j = endMills;
                }
            }
        }
        return j;
    }

    public final long l(List<PerformanceStageModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2005bd3", new Object[]{this, list})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (list != null) {
            for (PerformanceStageModel performanceStageModel : list) {
                long startMills = performanceStageModel.getStartMills();
                if (currentTimeMillis > startMills) {
                    currentTimeMillis = startMills;
                }
            }
        }
        return currentTimeMillis;
    }

    public void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b2572b", new Object[]{this, str, str2});
            return;
        }
        e();
        this.b.setBizName(str);
        this.b.setFlowCode(str2);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.b = null;
        this.f29019a.clear();
    }

    public final void o(e8d e8dVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209dde43", new Object[]{this, e8dVar, new Boolean(z)});
        } else if (xv6.b()) {
            if (e8dVar instanceof PerformanceStageModel) {
                PerformanceStageModel performanceStageModel = (PerformanceStageModel) e8dVar;
                StringBuilder sb = new StringBuilder();
                sb.append(performanceStageModel.getStageCode());
                if (z) {
                    str = " 结束：";
                } else {
                    str = " 开始：";
                }
                sb.append(str);
                if (performanceStageModel.getStartMills() > 0) {
                    sb.append(" startTime：");
                    sb.append(performanceStageModel.getStartMills());
                }
                if (performanceStageModel.getEndMills() > 0) {
                    sb.append(" endTime：");
                    sb.append(performanceStageModel.getEndMills());
                }
                if (performanceStageModel.getDurationMills() > 0) {
                    sb.append(" cost：");
                    sb.append(performanceStageModel.getDurationMills());
                }
                if (performanceStageModel.getArgs() != null) {
                    sb.append(" ext：");
                    sb.append(JSON.toJSONString(performanceStageModel.getArgs()));
                }
                Log.e("PerformanceRecord", sb.toString());
            } else if (e8dVar instanceof PerformanceFlowModel) {
                Log.e("PerformanceRecord", JSON.toJSONString(e8dVar));
            }
        }
    }

    public void p(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c6d1f7", new Object[]{this, str, map});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        PerformanceStageModel j = j(str);
        if (j != null) {
            j.setEndMills(currentTimeMillis);
            a(j, map);
            o(j, true);
        }
    }

    public void q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dd2e1f", new Object[]{this, str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j(str) == null) {
            PerformanceStageModel c2 = c(str);
            c2.setStartMills(currentTimeMillis);
            b(c2, str2);
            o(c2, false);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d01442", new Object[]{this});
            return;
        }
        Iterator<PerformanceStageModel> it = this.f29019a.iterator();
        while (it.hasNext()) {
            PerformanceStageModel next = it.next();
            if (next != null && !next.isRecordFinished()) {
                List<PerformanceStageModel> childStages = next.getChildStages();
                if (childStages != null) {
                    long k = k(childStages);
                    next.setStartMills(l(childStages));
                    next.setEndMills(k);
                } else {
                    UnifyLog.e("PerformanceRecord", "stage " + next.getStageCode() + " 没有正常结束");
                    o(next, false);
                }
            }
        }
    }
}
