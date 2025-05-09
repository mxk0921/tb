package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z4x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32543a;
    public String b;
    public final Map<String, String> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32544a;

        public a(String str) {
            this.f32544a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                z4x.a(z4x.this, mqj.f(this.f32544a));
            }
        }
    }

    static {
        t2o.a(352321755);
    }

    public static /* synthetic */ String a(z4x z4xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a0f2eac", new Object[]{z4xVar, str});
        }
        z4xVar.b = str;
        return str;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bb1f400", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6de6a47", new Object[]{this});
        }
        return this.f32543a;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298ec077", new Object[]{this, str});
            return;
        }
        this.f32543a = str;
        if (r19.q0()) {
            String f = mqj.f(str);
            this.b = f;
            if (TextUtils.isEmpty(f)) {
                mqj.n(str, new a(str));
                return;
            }
            return;
        }
        this.b = c4x.c(str);
    }
}
