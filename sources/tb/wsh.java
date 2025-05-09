package tb;

import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.ConfigSource;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.task.Coordinator;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wsh extends c7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String c = "https://hudong.alicdn.com/api/data/v2/15b808d1dfa24b65a8bad0d2df922638.js";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a7v f30893a;

        public a(a7v a7vVar) {
            this.f30893a = a7vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DegradableNetwork degradableNetwork = new DegradableNetwork(v2s.o().f().getApplication());
            RequestImpl requestImpl = new RequestImpl(wsh.a(wsh.this));
            requestImpl.setRetryTime(3);
            requestImpl.setMethod("GET");
            byte[] bytedata = degradableNetwork.syncSend(requestImpl, null).getBytedata();
            if (!(bytedata == null || bytedata.length <= 0 || (d = fkx.d(new String(bytedata))) == null)) {
                wsh.this.getClass();
                if (d.getString(q2s.FILE_NAME2) != null) {
                    a7v a7vVar = this.f30893a;
                    wsh.this.getClass();
                    ((UltronInstanceViewModel.c) a7vVar).c(d.getString(q2s.FILE_NAME2), ConfigSource.MT2);
                }
            }
            wsh.this.f16905a.countDown();
        }
    }

    static {
        t2o.a(295699179);
    }

    public wsh(CountDownLatch countDownLatch, Context context, ExecutorService executorService) {
        super(countDownLatch, executorService);
        new e7v();
        d(context);
    }

    public static /* synthetic */ String a(wsh wshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d145399a", new Object[]{wshVar});
        }
        return wshVar.c;
    }

    public static /* synthetic */ Object ipc$super(wsh wshVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/config/MTCacheConfigModel");
    }

    public void b(a7v a7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edd66e0", new Object[]{this, a7vVar});
            return;
        }
        a aVar = new a(a7vVar);
        ExecutorService executorService = this.b;
        if (executorService != null) {
            executorService.execute(aVar);
        } else {
            Coordinator.execute(aVar, 30);
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5804002e", new Object[]{this});
        }
        try {
            return rg9.a(ey1.SWITCH_FILE_DIR, "gl_mt_config_url");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24104b42", new Object[]{this, context});
            return;
        }
        String i = vvs.i("goodlist", "mtConfigUrl", this.c);
        if (!TextUtils.isEmpty(i)) {
            this.c = i;
            hha.b("MTCacheConfigModel", "initUrl | orange=" + this.c);
        }
        if (context != null && iw0.j(context)) {
            String c = c();
            if (!TextUtils.isEmpty(c)) {
                this.c = c;
                hha.b("MTCacheConfigModel", "initUrl | debugMtUrl=" + this.c);
            }
        }
    }
}
