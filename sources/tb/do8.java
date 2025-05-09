package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class do8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f17982a;
    public Set<String> b;
    public final ConcurrentHashMap<String, Long> c;
    public final ConcurrentHashMap<String, Long> d;
    public List<ExperimentV5> e;
    public boolean f;

    static {
        t2o.a(961544334);
    }

    public do8() {
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
    }

    public void a(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221e38c3", new Object[]{this, experimentV5});
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(experimentV5);
        String a2 = qbu.a(experimentV5.getReleaseId(), experimentV5.getGroups().get(0).getId());
        if (!TextUtils.isEmpty(a2)) {
            b(a2);
            this.c.put(a2, Long.valueOf(experimentV5.getId()));
            this.d.put(a2, Long.valueOf(experimentV5.getGroups().get(0).getId()));
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31953cb6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.b == null) {
                this.b = new LinkedHashSet();
            }
            this.b.add(str);
        }
    }

    public Long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2b502a3d", new Object[]{this, str});
        }
        return this.d.get(str);
    }

    public Long d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("634b8ab6", new Object[]{this, str});
        }
        return this.c.get(str);
    }

    public List<ExperimentV5> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("262b3800", new Object[]{this});
        }
        return this.e;
    }

    public Set<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a3bc7859", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a5875b2", new Object[]{this});
        }
        return this.f17982a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb467da", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b206386", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abae61c", new Object[]{this, map});
        } else {
            this.f17982a = map;
        }
    }

    public do8(mwa mwaVar) {
        ConcurrentHashMap<String, Long> concurrentHashMap = new ConcurrentHashMap<>();
        this.c = concurrentHashMap;
        ConcurrentHashMap<String, Long> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.d = concurrentHashMap2;
        this.e = new ArrayList();
        String a2 = qbu.a(mwaVar.j(), mwaVar.g());
        if (!TextUtils.isEmpty(a2)) {
            b(a2);
            concurrentHashMap.put(a2, Long.valueOf(mwaVar.h()));
            concurrentHashMap2.put(a2, Long.valueOf(mwaVar.g()));
        }
    }
}
