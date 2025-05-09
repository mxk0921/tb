package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.whq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hiq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Startups";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20673a;

        public a(Context context) {
            this.f20673a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            whq whqVar = whq.a.instance;
            whqVar.d(this.f20673a);
            whqVar.e();
        }
    }

    public static void a(String str, fn8 fn8Var, Map<String, fn8> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae1825f", new Object[]{str, fn8Var, map});
        } else {
            whq.a.instance.a(str, fn8Var, map);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ab57ad", new Object[]{context});
        } else {
            whq.a.instance.b(context);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[0])).booleanValue();
        }
        return q1r.c(".report_startup_data");
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
        } else {
            whq.a.instance.c();
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6c3409", new Object[]{context});
            return;
        }
        jdh.a(TAG, "[Startup][commit] submit", new Object[0]);
        pjg.EXECUTOR.submit(new a(context));
    }
}
