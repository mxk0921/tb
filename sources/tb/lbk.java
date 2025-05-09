package tb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f23233a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23234a;

        public a(Context context) {
            this.f23234a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                lbk.a(lbk.b(this.f23234a));
            }
        }
    }

    static {
        t2o.a(491782859);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        f23233a = str;
        return str;
    }

    public static /* synthetic */ String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c5cce90", new Object[]{context});
        }
        return d(context);
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{context});
        }
        if (!TextUtils.isEmpty(f23233a)) {
            return f23233a;
        }
        String e = qy8.b.e("InfoFlow_OAID", "oaid", null);
        if (!TextUtils.isEmpty(e)) {
            f23233a = e;
            return e;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Coordinator.execute(new a(context));
        } else {
            f23233a = d(context);
        }
        return f23233a;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c8f8f6b", new Object[]{context});
        }
        String a2 = k3l.a(context);
        qy8.b.i("InfoFlow_OAID", "oaid", a2);
        return a2;
    }
}
