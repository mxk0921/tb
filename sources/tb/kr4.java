package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kr4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(kr4 kr4Var) {
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            w6n.a("qualityController", "TBQuality awakenRemoteTestModule success");
            try {
                Method method = cls.getMethod("init", new Class[0]);
                method.setAccessible(true);
                method.invoke(null, new Object[0]);
            } catch (Exception e) {
                Log.e("qualityController", e.toString());
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                w6n.a("qualityController", "TBQuality awakenRemoteTestModule error: classNotFound");
            }
        }
    }

    static {
        t2o.a(634388484);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32dfc634", new Object[]{this});
        } else {
            zk9.b("com.taobao.android.qualityremote.adapter.Initializer", new a(this));
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        a7n.b(context);
        if (a7n.c()) {
            w6n.a("qualityController", "TBQuality start init Controller");
        }
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34a18ac4", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.split("\\.").length <= 3) {
            return false;
        }
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (a7n.c() && c((String) hhg.a("appVersion", null))) {
            a();
        }
    }
}
