package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.c;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l21 extends ov {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public final Map<String, Object> b = new HashMap();
    public final Map<String, Object> c = new HashMap();
    public mdd d;

    static {
        t2o.a(729809889);
    }

    public l21(String str) {
        super(str);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("751f459e", new Object[0])).booleanValue();
        }
        return !vxl.e();
    }

    public static void h(g9u g9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5874", new Object[]{g9uVar});
        } else if (e()) {
            g9uVar.c("ApmVirtualPageInterceptor", new l21(g9uVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=ApmVirtualPageInterceptor");
        }
    }

    public static /* synthetic */ Object ipc$super(l21 l21Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/tracelog/interceptor/ApmVirtualPageInterceptor");
    }

    @Override // tb.ov
    public boolean c(TraceModel traceModel, boolean z) {
        long j;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6724b2dc", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        long costTime = traceModel.getCostTime();
        Map<String, Object> subProperties = traceModel.getSubProperties();
        if (name.startsWith("homeLoading")) {
            Object obj = ((HashMap) this.c).get(name);
            if (obj != null) {
                j = (Long.parseLong(obj.toString()) + costTime) / 2;
            } else {
                j = costTime;
            }
            ((HashMap) this.c).put(name, Long.valueOf(j));
            if (subProperties != null && subProperties.size() > 0) {
                for (String str : subProperties.keySet()) {
                    if (str.startsWith("homeLoading")) {
                        ((HashMap) this.c).put(str, Long.valueOf(costTime));
                        TLog.loge("home", "GlobalTrace", str + ", cost=" + costTime);
                    } else {
                        Object obj2 = subProperties.get(str);
                        if (obj2 != null) {
                            ((HashMap) this.c).put(str, obj2);
                            TLog.loge("home", "GlobalTrace", str + ", value=" + obj2);
                        }
                    }
                }
            }
            String concat = name.concat("Count");
            Object obj3 = ((HashMap) this.c).get(concat);
            Map<String, Object> map = this.c;
            if (obj3 == null) {
                i = 1;
            } else {
                i = Integer.parseInt(obj3.toString()) + 1;
            }
            ((HashMap) map).put(concat, Integer.valueOf(i));
        } else {
            AtomicBoolean atomicBoolean = e;
            if (!atomicBoolean.get() && !((HashMap) this.b).containsKey(name)) {
                ((HashMap) this.b).put(name, Long.valueOf(costTime));
                if (subProperties != null && !subProperties.isEmpty()) {
                    ((HashMap) this.b).putAll(subProperties);
                }
            } else if (atomicBoolean.get() && !((HashMap) this.c).containsKey(name) && !((HashMap) this.b).containsKey(name)) {
                ((HashMap) this.c).put(name, Long.valueOf(costTime));
                if (subProperties != null && !subProperties.isEmpty()) {
                    ((HashMap) this.c).putAll(subProperties);
                }
            }
        }
        f(name);
        return true;
    }

    @Override // tb.ov
    public boolean d(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561fd916", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return false;
        }
        String name = traceModel.getName();
        if (traceModel.getPriority() == 4 || TextUtils.isEmpty(name)) {
            return false;
        }
        return true;
    }

    public final void f(String str) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebb2cc6", new Object[]{this, str});
        } else if (TextUtils.equals("homeFragmentOnStart", str)) {
            mdd g = g();
            this.d = g;
            g.v("HomePageLauncherAllStages");
            this.d.v("HomePageScrollAllStages");
        } else if (TextUtils.equals("homeFragmentOnStop", str) && this.d != null) {
            if (e.compareAndSet(false, true)) {
                this.d.e("HomePageLauncherAllStages", this.b);
                z2 = true;
            }
            if (!((HashMap) this.c).isEmpty()) {
                this.d.e("HomePageScrollAllStages", new HashMap(this.c));
                ((HashMap) this.c).clear();
            } else {
                z = z2;
            }
            if (z) {
                this.d.end();
            }
        }
    }

    public final mdd g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("79dbb20e", new Object[]{this});
        }
        c h = new c.b().j(false).o(true).m(true).l(null).h();
        sxm sxmVar = sxm.b;
        mdd a2 = sxmVar.a("ALI_APM/" + s5a.g() + "/monitor/procedure/pageLoad", h);
        a2.c();
        a2.a("pageName", "VirtualHomeGlobalTrace");
        a2.a("launchTime", Long.valueOf(g0b.f()));
        a2.a(v4s.PARAM_IS_DEBUG, Boolean.valueOf(cw6.b()));
        a2.a("isFirstLaunch", Boolean.valueOf(g0b.c("isFirstLaunch", false)));
        a2.a("isFullNewInstall", Boolean.valueOf(g0b.c("isFullNewInstall", false)));
        a2.a("launchType", g0b.d("launchType", ""));
        return a2;
    }
}
