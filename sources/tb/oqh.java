package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.MRTJob;
import com.taobao.mrt.task.MRTJobRefuseReason;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oqh f = new oqh();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Object, MRTTaskDescription> f25572a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, drh> b = new ConcurrentHashMap<>();
    public final Set<String> c = Collections.synchronizedSet(new HashSet());
    public final ConcurrentHashMap<Long, HashMap<String, String>> d = new ConcurrentHashMap<>();
    public cqh e = null;

    static {
        t2o.a(577765423);
    }

    public static oqh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqh) ipChange.ipc$dispatch("3740e0db", new Object[0]);
        }
        return f;
    }

    public final void a(String str, qqh qqhVar, int i, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11cecc0b", new Object[]{this, str, qqhVar, new Integer(i), str2, obj});
            return;
        }
        kgh.k("TaskManager", "任务结束:" + str + ",code:" + i + ",msg:" + str2);
        if (qqhVar != null) {
            qqhVar.a(i, new MRTRuntimeException(i, str2), obj);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc9fca4", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = this.d.get(Long.valueOf(Thread.currentThread().getId()));
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    public void c(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72a1e93", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else if (!TextUtils.isEmpty(str)) {
            this.b.put(str, new drh(i, i2, str));
        }
    }

    public MRTTaskDescription e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("c27b0e90", new Object[]{this, str});
        }
        return this.f25572a.get(str);
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("616d8f13", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = this.d.get(Long.valueOf(Thread.currentThread().getId()));
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d3d2116", new Object[]{this, str})).booleanValue();
        }
        return this.c.contains(str);
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c39479", new Object[]{this, str});
        } else {
            this.c.add(str);
        }
    }

    public void i(MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b1083", new Object[]{this, mRTTaskDescription});
        } else if (mRTTaskDescription != null) {
            cqh cqhVar = this.e;
            if ((cqhVar == null || !cqhVar.b) && !TextUtils.isEmpty(mRTTaskDescription.name)) {
                this.f25572a.put(mRTTaskDescription.name, mRTTaskDescription);
            }
        }
    }

    public void j(String str, String str2, List<Object> list, boolean z, String str3, pqh pqhVar, qqh qqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c713a2", new Object[]{this, str, str2, list, new Boolean(z), str3, pqhVar, qqhVar});
        } else {
            k(str, str2, list, z, str3, pqhVar, qqhVar, null);
        }
    }

    public void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f549c3", new Object[]{this, str, str2});
            return;
        }
        long id = Thread.currentThread().getId();
        HashMap<String, String> hashMap = this.d.get(Long.valueOf(id));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.d.put(Long.valueOf(id), hashMap);
        }
        hashMap.put(str, str2);
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fe379b", new Object[]{this, str});
        } else {
            this.c.remove(str);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd696bb2", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f25572a.remove(str);
        }
    }

    public void o(cqh cqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4122813", new Object[]{this, cqhVar});
        } else if (cqhVar != null) {
            this.e = cqhVar;
        }
    }

    public void k(String str, String str2, List<Object> list, boolean z, String str3, pqh pqhVar, qqh qqhVar, Map<String, Map<String, Object>> map) {
        List<String> list2;
        String str4;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a270cfa3", new Object[]{this, str, str2, list, new Boolean(z), str3, pqhVar, qqhVar, map});
            return;
        }
        IpChange ipChange2 = jph.$ipChange;
        kgh.k("TaskManager", "任务触发:" + str);
        if (!MRT.i()) {
            a(str, qqhVar, 1, "mrt is not available", null);
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            a(str, qqhVar, 201, "Invalid Param", null);
        } else if (crh.g().h(str) == MRTJobRefuseReason.MRTJobRefuseReasonBug) {
            kgh.s("TaskManager", "Skip Buggy Model:" + str);
            a(str, qqhVar, 1001, "Task cancelled because of timeslot exhaust", null);
        } else {
            MRTTaskDescription e = e(str);
            if (e == null) {
                if (MRT.f) {
                    str4 = " Y";
                } else {
                    str4 = " N";
                }
                a(str, qqhVar, 201, "Invalid Task Name".concat(str4), null);
                return;
            }
            drh drhVar = this.b.get(str3);
            if (drhVar == null) {
                a(str, qqhVar, 1001, "Task cancelled because of thread exhaust", null);
            } else if (drhVar.c()) {
                kgh.s("TaskManager", ":All Threads Used. Model: " + str + " is Rejected");
                a(str, qqhVar, 1001, "Task cancelled because of thread exhaust", null);
            } else {
                cqh cqhVar = this.e;
                if (cqhVar != null) {
                    if (!cqhVar.f17231a) {
                        a(str, qqhVar, 83, "", null);
                        return;
                    }
                    List<String> list3 = cqhVar.d;
                    if (list3 != null && list3.size() > 0) {
                        z2 = !cqhVar.d.contains(str);
                    }
                    if (!z2 && (list2 = cqhVar.c) != null) {
                        z2 = list2.contains(str);
                    }
                    if (z2) {
                        a(str, qqhVar, 84, null, null);
                        return;
                    }
                }
                drhVar.a(new MRTJob(e, qqhVar, str2, list, z, pqhVar, map));
            }
        }
    }
}
