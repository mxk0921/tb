package tb;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.core.performance.OrderUltronInstanceFactory;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ldl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23272a;
    public eel b;
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ldl INSTANCE = new ldl();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f23273a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;

        public a(Intent intent, String str, Context context) {
            this.f23273a = intent;
            this.b = str;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ldl.a(ldl.this, this.f23273a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(713031844);
    }

    public static /* synthetic */ void a(ldl ldlVar, Intent intent, String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ffe91e", new Object[]{ldlVar, intent, str, context});
        } else {
            ldlVar.c(intent, str, context);
        }
    }

    public void b(Intent intent, String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1d943a", new Object[]{this, intent, str, context});
        } else if (pav.b()) {
            pav.k(new a(intent, str, context));
        } else {
            c(intent, str, context);
        }
    }

    public eel d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eel) ipChange.ipc$dispatch("8286d329", new Object[]{this});
        }
        if (!this.f23272a) {
            this.b = null;
        }
        return this.b;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5450e89", new Object[]{this, new Boolean(z)});
        } else {
            this.f23272a = z;
        }
    }

    public final void c(Intent intent, String str, Context context) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ca1bce", new Object[]{this, intent, str, context});
            return;
        }
        AtomicInteger atomicInteger = c;
        if (atomicInteger.compareAndSet(0, 1)) {
            this.b = new eel(context);
            this.f23272a = true;
            nrr.g();
            try {
                try {
                    hav.d("OrderListAsyncTask", "asyncTaskOnNav start");
                    if (intent != null) {
                        intent.putExtra("olAsyncTaskStart", System.currentTimeMillis());
                        this.b.C0(jql.h(intent));
                    } else if (!TextUtils.isEmpty(str)) {
                        this.b.C0(str);
                    }
                    Pair<JSONObject, String> j = nrr.j(context, this.b.t(), "firstScreen");
                    if (j == null) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = (JSONObject) j.first;
                    }
                    if (TabType.REFUND.getValue().equals(this.b.t())) {
                        this.b.Q0(nrr.k());
                    }
                    this.b.F0(true);
                    if (!OrderUltronInstanceFactory.isInstanceExist()) {
                        OrderUltronInstanceFactory.preCreateUltronInstance(context, jSONObject);
                    }
                    if (j != null) {
                        OrderUltronInstanceFactory.parseCacheResponse(j);
                    }
                    if (r63.c()) {
                        String d = r63.d(context, this.b.t());
                        this.b.L0(d);
                        hav.d(r63.TAG, "获取截图 start");
                        if (TextUtils.isEmpty(d)) {
                            this.b.E0(BitmapFactory.decodeResource(context.getResources(), R.drawable.order_list_fragment_loading));
                            hav.d(r63.TAG, "预获取鱼骨图 end");
                        } else {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = v9v.e(wbl.NEW_BABEL_ORDER, "bitMapDecodeSampleSize", 2);
                            this.b.E0(BitmapFactory.decodeFile(d, options));
                            hav.d(r63.TAG, "预获截图 end");
                        }
                    }
                    if (v9v.i("ultronX_android", "enable_preload_so", false)) {
                        hav.d("ultronX", "LibUtils.loadLibUltron start");
                        dng.j();
                        hav.d("ultronX", "LibUtils.loadLibUltron in OrderListAsyncTaskOnNav");
                    }
                    if (intent != null) {
                        intent.putExtra("olAsyncTaskEnd", System.currentTimeMillis());
                    }
                    atomicInteger.set(0);
                } catch (Exception e) {
                    hav.d("OrderListAsyncTask", "asyncNavTask error: " + e.getMessage());
                    c.set(0);
                }
                hav.d("OrderListAsyncTask", "asyncTaskOnNav end");
            } catch (Throwable th) {
                c.set(0);
                hav.d("OrderListAsyncTask", "asyncTaskOnNav end");
                throw th;
            }
        } else {
            hav.d("OrderListAsyncTask", "asyncTaskOnNav is running");
        }
    }
}
