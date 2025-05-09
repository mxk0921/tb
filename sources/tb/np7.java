package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class np7 implements xzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f24878a;
    public final Set<String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final np7 f24879a = new np7();

        static {
            t2o.a(681574405);
        }

        public static /* synthetic */ np7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (np7) ipChange.ipc$dispatch("decda483", new Object[0]);
            }
            return f24879a;
        }
    }

    static {
        t2o.a(681574403);
        t2o.a(681574413);
    }

    public static np7 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np7) ipChange.ipc$dispatch("2f74ff1e", new Object[0]);
        }
        return b.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59241472", new Object[]{this, str});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.f24878a).entrySet()) {
            if (!((List) entry.getValue()).contains(str)) {
                ((List) entry.getValue()).add(str);
            }
        }
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8ebed3e", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.b.contains(str2)) {
            return true;
        }
        if (((HashMap) this.f24878a).containsKey(str2)) {
            return ((List) ((HashMap) this.f24878a).get(str2)).contains(str);
        }
        return false;
    }

    public np7() {
        this.f24878a = new HashMap();
        this.b = new HashSet();
        try {
            Context j = bcq.a().e().j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("featurediffdisabled_" + bcq.a().e().j().getPackageManager().getPackageInfo(bcq.a().e().j().getPackageName(), 0), 0);
            this.b = n1r.h(bcq.a().e().j());
            Map<String, ?> all = sharedPreferences.getAll();
            if (all != null && all.size() > 0) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    ((HashMap) this.f24878a).put(entry.getKey(), new ArrayList(Arrays.asList(((String) entry.getValue()).split(","))));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
