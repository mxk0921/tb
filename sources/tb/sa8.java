package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sa8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f27902a;

        public a(Activity activity) {
            this.f27902a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sa8.f(this.f27902a, "poplayer://elderHomeGuide");
            }
        }
    }

    static {
        t2o.a(456130570);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec1d2ba", new Object[]{activity});
        } else if ("1".equals(TBRevisionSwitchManager.c().e("elderHome"))) {
            activity.getWindow().getDecorView().postDelayed(new a(activity), 100L);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a4af06", new Object[]{context});
        } else {
            f(context, "poplayer://elderInvite");
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440cc680", new Object[]{context});
        } else {
            f(context, "poplayer://elderOlderInvite");
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b431117f", new Object[]{context});
        } else {
            f(context, "poplayer://enterElder");
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b920cd9f", new Object[]{context});
        } else {
            f(context, "poplayer://exitElder");
        }
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770b2417", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
