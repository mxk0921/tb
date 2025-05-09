package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.upp.d;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s6n extends t6n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "python_solution";
    public final BHRSolution e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                s6n.this.r();
            } catch (Throwable th) {
                om8.c(s6n.TYPE, "0", th.getMessage());
                om8.e(s6n.TYPE, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f27825a;

        public b(Map map) {
            this.f27825a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                s6n.this.s().h(s6n.this.e(), this.f27825a);
            } catch (Throwable th) {
                om8.c(s6n.TYPE, "0", th.getMessage());
                om8.e(s6n.TYPE, th);
            }
        }
    }

    static {
        t2o.a(404750407);
    }

    public s6n(BHRSolution bHRSolution, BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
        this.e = bHRSolution;
    }

    public static /* synthetic */ Object ipc$super(s6n s6nVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2130491415) {
            super.h();
            return null;
        } else if (hashCode == 40303496) {
            super.i((JSONObject) objArr[0]);
            return null;
        } else if (hashCode == 1673107495) {
            super.k((JSONObject) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/behavir/task/PythonSolutionTask");
        }
    }

    @Override // tb.rz1, tb.uct
    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        BHRSolution bHRSolution = this.e;
        if (bHRSolution == null || !bHRSolution.e()) {
            r();
        } else {
            this.e.a(e(), new a());
        }
    }

    @Override // tb.rz1
    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            super.i(o(jSONObject, this.e));
        }
    }

    @Override // tb.rz1
    public void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            super.k(o(jSONObject, this.e));
        }
    }

    @Override // tb.t6n, tb.rz1
    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd9980", new Object[]{this, jSONObject});
        } else {
            p(jSONObject);
        }
    }

    @Override // tb.t6n, tb.rz1
    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
        } else {
            p(jSONObject);
        }
    }

    public final JSONObject o(JSONObject jSONObject, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d97340b", new Object[]{this, jSONObject, bHRSolution});
        }
        if (bHRSolution == null || bHRSolution.i(e()) == null) {
            return jSONObject;
        }
        return new JSONObject(bHRSolution.i(e()));
    }

    public void p(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        BHRSolution<HashMap<String, Object>, Map<String, Object>> s = s();
        if (s != null) {
            if (s.e()) {
                s.a(e(), new b(map));
            } else {
                s().h(e(), map);
            }
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        BHRSolution bHRSolution = this.e;
        if (bHRSolution == null || !bHRSolution.g(e())) {
            return false;
        }
        return true;
    }

    public BHRSolution<HashMap<String, Object>, Map<String, Object>> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRSolution) ipChange.ipc$dispatch("231f49cd", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.t6n, tb.led
    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fdbd6abf", new Object[]{this});
        }
        HashMap<String, Object> f = s().f(e());
        BHREvent bHREvent = this.f29298a;
        if (bHREvent != null) {
            f.put(wdm.CATEGORY_TRIGGER_EVENT, bHREvent.toJsonObject().toJSONString());
        }
        f.put("trigger", "BehaviR");
        f.put("userId", iaa.f21189a);
        f.put(l2o.COL_S_TIME, Long.valueOf(SDKUtils.getCorrectionTimeMillis()));
        BHRTaskConfigBase bHRTaskConfigBase = this.b;
        if (bHRTaskConfigBase != null) {
            f.put("triggerName", bHRTaskConfigBase.getConfigName());
        }
        LogUtils.e("task", TYPE, LogUtils.BEHAVIR_TASK_EXECUTE, LogUtils.BEHAVIR_TASK_GET_INPUT, "10008 solution 执行getInput结束");
        return f;
    }

    @Override // tb.rz1
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            LogUtils.e("task", TYPE, LogUtils.BEHAVIR_TASK_EXECUTE, LogUtils.BEHAVIR_TASK_EXECUTE, "10004 找到Solution，开始执行Solution");
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (q()) {
            LogUtils.e("task", TYPE, d.KEY_SOLUTION_RUNNABLE_STEP, "10006 solution执行runnable结束，返回true");
            super.h();
        } else {
            LogUtils.i("task", TYPE, d.KEY_SOLUTION_RUNNABLE_STEP, "10006 solution执行runnable结束，返回false");
        }
    }
}
