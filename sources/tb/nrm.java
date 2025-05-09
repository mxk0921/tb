package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nrm extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRELOADGOODSDETAIL = "-1316851294519874744";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f24907a;
        public final /* synthetic */ Context b;

        public a(JSONObject jSONObject, Context context) {
            this.f24907a = jSONObject;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
            intent.setPackage("com.taobao.taobao");
            intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, this.f24907a.toJSONString());
            this.b.sendBroadcast(intent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031760);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public nrm build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nrm) ipChange.ipc$dispatch("5e43e93a", new Object[]{this, obj});
            }
            return new nrm();
        }
    }

    static {
        t2o.a(713031758);
    }

    public static /* synthetic */ Object ipc$super(nrm nrmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/PreloadGoodsDetailAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (tk6Var == null) {
            return new f8();
        }
        Context d = tk6Var.d();
        if (d == null || n8Var == null) {
            return new f8();
        }
        JSONObject h = n8Var.h();
        DXRootView o = tk6Var.o();
        if (!(h == null || o == null || !dbl.D())) {
            o.post(new a(h, d));
        }
        return new f8();
    }
}
