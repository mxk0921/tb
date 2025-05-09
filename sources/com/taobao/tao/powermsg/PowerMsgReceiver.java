package com.taobao.tao.powermsg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.outter.PowerMsg4JS;
import com.taobao.tao.powermsg.outter.PowerMsg4WW;
import com.taobao.weex.WXSDKEngine;
import java.util.List;
import tb.dap;
import tb.dzi;
import tb.eap;
import tb.eep;
import tb.fsw;
import tb.iyv;
import tb.jg4;
import tb.moq;
import tb.ni4;
import tb.of2;
import tb.p2j;
import tb.stj;
import tb.svc;
import tb.t2o;
import tb.tln;
import tb.uln;
import tb.xog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PowerMsgReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12559a;
        public final /* synthetic */ Intent b;

        public a(Context context, Intent intent) {
            this.f12559a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgReceiver.this.b(this.f12559a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements MonitorManager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(PowerMsgReceiver powerMsgReceiver) {
        }

        @Override // com.taobao.tao.messagekit.base.monitor.MonitorManager.d
        public boolean a(List<svc> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec0fbcec", new Object[]{this, list, new Long(j)})).booleanValue();
            }
            return iyv.k(list, j);
        }

        @Override // com.taobao.tao.messagekit.base.monitor.MonitorManager.d
        public boolean b(List<svc> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("adf4fe9", new Object[]{this, list, new Long(j)})).booleanValue();
            }
            return iyv.k(list, j);
        }

        @Override // com.taobao.tao.messagekit.base.monitor.MonitorManager.d
        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("84f6d9e8", new Object[]{this})).longValue();
            }
            return iyv.d();
        }
    }

    static {
        t2o.a(628097182);
    }

    public static /* synthetic */ Object ipc$super(PowerMsgReceiver powerMsgReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/PowerMsgReceiver");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        MsgLog.g("PMReceiver", "enter init");
        MsgRouter.e().b().c();
        moq moqVar = new moq();
        MsgRouter.e().m(moqVar);
        MsgRouter.e().l(moqVar);
        MsgRouter.e().f().m(new MonitorManager.e(2, new dzi(), new b(this)));
        int i = p2j.j;
        if (i == -1 || i == 0) {
            stj.e(0, new tln());
            stj.d(0, new dap());
        }
        int i2 = p2j.j;
        if (i2 == -1 || i2 == 1) {
            stj.e(1, new uln());
            stj.d(1, new eap());
        }
        c();
        MsgRouter.e().k();
    }

    public void b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccdcd8a", new Object[]{this, context, intent});
            return;
        }
        MsgLog.g("PMReceiver", "enter initOnReceive");
        try {
            if ("init".equalsIgnoreCase(intent.getStringExtra("key"))) {
                a();
            } else {
                MsgLog.g("PMReceiver", "not init!!!!");
            }
            d();
            p2j.i();
        } catch (Throwable th) {
            MsgLog.f("PMReceiver", th, "initOnReceive err");
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb1421", new Object[]{this});
            return;
        }
        MsgRouter.e().b().d(303, new xog());
        of2 of2Var = new of2();
        MsgRouter.e().b().d(301, of2Var);
        MsgRouter.e().b().d(302, of2Var);
        MsgRouter.e().b().d(304, new eep());
        MsgRouter.e().b().d(306, new ni4());
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bf8f803", new Object[0])).booleanValue();
        }
        try {
            WXSDKEngine.registerModule("powermsg", PowerMsg4JS.class);
            fsw.h("powermsg", PowerMsg4WW.class);
            return true;
        } catch (Error unused) {
            MsgLog.g("PMReceiver", "init failed");
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            MsgLog.g("PMReceiver", "register erroooooor");
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        MsgLog.g("PMReceiver", "onReceiver action=" + intent.getAction());
        if ("true".equals(jg4.c("init_async", "false"))) {
            new Thread(new a(context, intent), "PowerMsgReceiverInit").start();
        } else {
            b(context, intent);
        }
    }
}
