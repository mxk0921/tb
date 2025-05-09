package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22899a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f22899a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kt2.a(kt2.this, this.f22899a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22900a;
        public final /* synthetic */ List b;

        public b(String str, List list) {
            this.f22900a = str;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kt2.a(kt2.this, this.f22900a, JSON.toJSONString(this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f22901a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kmc c;

        public c(SharedPreferences sharedPreferences, String str, kmc kmcVar) {
            this.f22901a = sharedPreferences;
            this.b = str;
            this.c = kmcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.c.a(this.f22901a.getString(this.b, null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public static final kt2 INSTANCE = new kt2(null);

        static {
            t2o.a(736100420);
        }
    }

    static {
        t2o.a(736100416);
    }

    public /* synthetic */ kt2(a aVar) {
        this();
    }

    public static /* synthetic */ void a(kt2 kt2Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c707b0f", new Object[]{kt2Var, str, str2});
        } else {
            kt2Var.g(str, str2);
        }
    }

    public static kt2 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kt2) ipChange.ipc$dispatch("c6c7f9f5", new Object[0]);
        }
        return d.INSTANCE;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a42606", new Object[]{this, str});
            return;
        }
        SharedPreferences k = nh2.k();
        if (k == null) {
            tm1.a("CacheTaskExecutor", "executeClearTask sp null");
        } else {
            k.edit().remove(str).apply();
        }
    }

    public void d(String str, kmc kmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdde73f", new Object[]{this, str, kmcVar});
            return;
        }
        SharedPreferences k = nh2.k();
        if (k == null) {
            tm1.a("CacheTaskExecutor", "executeLoadCacheTask sp null");
        } else {
            Coordinator.execute(new c(k, str, kmcVar));
        }
    }

    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa01b3d7", new Object[]{this, str, str2});
        } else {
            Coordinator.execute(new a(str, str2));
        }
    }

    public void f(String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf0363e", new Object[]{this, str, list});
        } else {
            Coordinator.execute(new b(str, list));
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf81cde2", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences k = nh2.k();
        if (k == null) {
            tm1.a("CacheTaskExecutor", "saveData error sharedPreferences null");
            return;
        }
        SharedPreferences.Editor edit = k.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public kt2() {
    }
}
