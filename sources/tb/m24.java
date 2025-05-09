package tb;

import android.app.Application;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.dataobject.ComboResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.request.BasicRequest;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m24 extends x32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f23731a;
    public final Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f23732a;
        public final /* synthetic */ ComboResponse b;

        public a(int i, ComboResponse comboResponse) {
            this.f23732a = i;
            this.b = comboResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m24.a(m24.this).onSuccess(this.f23732a, null, this.b, null);
            }
        }
    }

    static {
        t2o.a(764412037);
    }

    public m24(Application application, long j, Handler handler) {
        super(application);
        this.f23731a = j;
        this.b = handler;
    }

    public static /* synthetic */ IRemoteBaseListener a(m24 m24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteBaseListener) ipChange.ipc$dispatch("cfcfd29f", new Object[]{m24Var});
        }
        return m24Var.mRequestListener;
    }

    public static /* synthetic */ Object ipc$super(m24 m24Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ComboBusiness");
    }

    public void b(int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec96487f", new Object[]{this, new Integer(i), new Long(j), new Boolean(z)});
            return;
        }
        ComboResponse b = n24.c().b(Long.valueOf(j));
        if (b == null || this.mRequestListener == null) {
            BasicRequest basicRequest = new BasicRequest();
            basicRequest.setAPI_NAME("mtop.gebsupport.shop.getMeal");
            basicRequest.setNEED_ECODE(false);
            basicRequest.setNEED_SESSION(true);
            basicRequest.setORIGINALJSON(true);
            basicRequest.setVERSION("2.0");
            HashMap hashMap = new HashMap();
            hashMap.put("sellerId", Long.valueOf(this.f23731a));
            hashMap.put("mealId", Long.valueOf(j));
            hashMap.put("needMealIdList", Boolean.valueOf(z));
            startRequest(null, i, basicRequest, ComboResponse.class, hashMap);
            return;
        }
        this.b.postDelayed(new a(i, b), 1L);
    }
}
