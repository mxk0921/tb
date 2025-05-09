package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<jq2> f32517a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final z45 f32518a = new z45();

        static {
            t2o.a(404750607);
        }

        public static /* synthetic */ z45 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z45) ipChange.ipc$dispatch("8be7ea7b", new Object[0]);
            }
            return f32518a;
        }
    }

    static {
        t2o.a(404750605);
    }

    public static final z45 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z45) ipChange.ipc$dispatch("607298a5", new Object[0]);
        }
        return b.a();
    }

    public final void a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONArray jSONArray = null;
        if (c21.g().getInt("deviceLevel", -1) == 2) {
            str = oy8.c().b(v82.ORANGE_GROUP_NAME, "dbSaveFilter", null);
        } else {
            str = oy8.c().b(v82.ORANGE_GROUP_NAME, "dbMHSaveFilter", null);
        }
        try {
            jSONArray = JSON.parseArray(str);
        } catch (Throwable unused) {
        }
        if (!pz3.a(jSONArray)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                jq2 jq2Var = (jq2) jSONArray.getObject(i, jq2.class);
                if (jq2Var != null) {
                    this.f32517a.add(jq2Var);
                }
            }
        }
    }

    public boolean c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f40f7de", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (gwv.a()) {
            return false;
        }
        if (pz3.a(this.f32517a)) {
            a();
        }
        if (pz3.a(this.f32517a)) {
            return true;
        }
        Iterator<jq2> it = this.f32517a.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        if (pz3.a(null)) {
            return false;
        }
        if (!pz3.a(null)) {
            throw null;
        } else if (!pz3.a(null)) {
            throw null;
        } else if (pz3.a(null)) {
            return true;
        } else {
            throw null;
        }
    }

    public z45() {
        this.f32517a = new CopyOnWriteArrayList<>();
    }
}
