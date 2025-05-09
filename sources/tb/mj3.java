package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mj3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static mj3 b;

    /* renamed from: a  reason: collision with root package name */
    public final nj3 f24074a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24075a;

        public a(Context context) {
            this.f24075a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                aul.b(this.f24075a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final mj3 f24076a = new mj3(null);

        static {
            t2o.a(782237705);
        }
    }

    static {
        t2o.a(782237703);
        t2o.a(782237699);
    }

    public /* synthetic */ mj3(a aVar) {
        this();
    }

    public static mj3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj3) ipChange.ipc$dispatch("7c3e9590", new Object[0]);
        }
        if (b == null) {
            b = b.f24076a;
        }
        return b;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(context));
        }
    }

    public void c(TpChargeBean tpChargeBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18087ead", new Object[]{this, tpChargeBean});
            return;
        }
        tpChargeBean.toString();
        if (TextUtils.isEmpty(tpChargeBean.getBizScene()) || TextUtils.isEmpty(tpChargeBean.getBizLine())) {
            Log.e("TaopaiCharge", "bizLine || bizScene is empty");
        } else if (t9l.e()) {
            this.f24074a.d(tpChargeBean);
        }
    }

    public mj3() {
        this.f24074a = new nj3();
    }
}
