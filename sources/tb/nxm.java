package tb;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.ITrigger;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.TriggerService;
import com.taobao.adaemon.g;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.SymbolExpUtil;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nxm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_NAME = "adaemon_strategy";

    /* renamed from: a  reason: collision with root package name */
    public int f25020a;
    public String b;
    public int c;
    public int d;
    public int e = 0;
    public int f = -1;
    public int g = 0;
    public String h;
    public boolean i;
    public String j;
    public final Context k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(nxm nxmVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }
    }

    static {
        t2o.a(349175854);
    }

    public nxm(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.k = applicationContext == null ? re.r() : applicationContext;
    }

    public static /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b45d4ad", new Object[0]);
        } else if (!f.c(f.KEY_DONT_STARTSERVICE)) {
            ProcessController.getInstance().triggerSchedule(ITrigger.TYPE_SYS_SCHEDULE);
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (this.f25020a == 0 || TextUtils.isEmpty(this.b) || this.c > this.d || this.e <= 0 || this.g < 0) {
            return false;
        }
        s55.i("ProcStartStrategy", "checkValid true", new Object[0]);
        return true;
    }

    public void j(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a3d4f4", new Object[]{this, new Long(j), new Boolean(z)});
        } else if (TimeMeter.a("adaemon_start_proc", 5000L) || z) {
            mf.l(new Runnable() { // from class: tb.kxm
                @Override // java.lang.Runnable
                public final void run() {
                    nxm.f();
                }
            });
            mf.k(new Runnable() { // from class: tb.lxm
                @Override // java.lang.Runnable
                public final void run() {
                    nxm.this.g();
                }
            }, j, TimeUnit.MILLISECONDS);
        } else {
            s55.i("ProcStartStrategy", "tryStartProc freq", new Object[0]);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693ba0e3", new Object[]{this});
            return;
        }
        s55.i("ProcStartStrategy", "startTargetProcess", "clsName", this.b);
        Intent intent = new Intent();
        intent.setPackage(this.k.getPackageName());
        intent.setClassName(this.k.getPackageName(), this.b);
        if (TriggerService.class.getName().equals(this.b)) {
            intent.putExtra("type", 1);
        }
        if (oxn.s().z()) {
            intent.putExtra(TriggerService.FLAG_AUTO_START, false);
            intent.putExtra(TriggerService.FLAG_PROVIDER_START, true);
            re.j(intent, new a(this), 1);
            return;
        }
        lef.f(this.k, intent);
    }

    public final /* synthetic */ void e(int i, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8adf42", new Object[]{this, new Integer(i), bool});
            return;
        }
        s55.i("ProcStartStrategy", "predict result", AgooConstants.MESSAGE_FLAG, bool);
        if (bool != null && bool.booleanValue()) {
            i();
            s55.i("ProcStartStrategy", "startTimes today " + (i + 1), new Object[0]);
            g.J(this.k, "today", "start_times", "minute");
        }
    }

    public final /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6203af", new Object[]{this});
            return;
        }
        try {
            if (com.taobao.accs.connection.state.a.v().A(this.k)) {
                s55.i("ProcStartStrategy", "main process is alive, quit", new Object[0]);
            } else if (!h()) {
                s55.i("ProcStartStrategy", "parseStrategy error", "strategy", this.j);
            } else {
                int i = Calendar.getInstance().get(11);
                int i2 = this.c;
                if ((i < i2 || i > this.d) && i != this.f) {
                    s55.i("ProcStartStrategy", "not match, cur hour", TplMsg.VALUE_T_NATIVE_RETURN, Integer.valueOf(i2), "e", Integer.valueOf(this.d), "cur", Integer.valueOf(i));
                } else if (!g.P()) {
                    s55.i("ProcStartStrategy", "not keep alive", new Object[0]);
                } else if (!this.i || !((KeyguardManager) this.k.getSystemService("keyguard")).isKeyguardLocked()) {
                    if (!TextUtils.isEmpty(this.h)) {
                        String[] split = this.h.split("-");
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(this.k);
                        if (appKeepAliveBucketId < parseInt || appKeepAliveBucketId > parseInt2) {
                            s55.i("ProcStartStrategy", "tryStartProc() bucket range", "start", Integer.valueOf(parseInt), "end", Integer.valueOf(parseInt2), "curBucketId", Integer.valueOf(appKeepAliveBucketId));
                            return;
                        }
                    }
                    final int F = g.F(this.k, "schedule", "today", "start_times", "minute");
                    if (F >= this.e) {
                        s55.i("ProcStartStrategy", "start limit", "startTimes", Integer.valueOf(F), "maxTimes", Integer.valueOf(this.e));
                    } else {
                        qgg.d().f(this.k, new ik4() { // from class: tb.mxm
                            @Override // tb.ik4
                            public final void accept(Object obj) {
                                nxm.this.e(F, (Boolean) obj);
                            }
                        });
                    }
                } else {
                    s55.i("ProcStartStrategy", "require user present", new Object[0]);
                }
            }
        } catch (Throwable th) {
            s55.h("ProcStartStrategy", "tryStartProc err", th, new Object[0]);
        }
    }

    public final boolean h() throws NumberFormatException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eada30d1", new Object[]{this})).booleanValue();
        }
        String v = oxn.s().v();
        this.j = v;
        String[] split = TextUtils.isEmpty(v) ? null : this.j.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        if (split == null || split.length < 9) {
            s55.i("ProcStartStrategy", "parseStrategy error", "strategy", this.j);
            return false;
        }
        this.f25020a = Integer.parseInt(split[0]);
        this.b = split[1];
        this.c = Integer.parseInt(split[2]);
        this.d = Integer.parseInt(split[3]);
        if (f.c(f.KEY_LIMIT_PREWARM)) {
            this.e = Math.min(10, Integer.parseInt(split[4]));
        } else {
            this.e = Integer.parseInt(split[4]);
        }
        this.f = Integer.parseInt(split[5]);
        this.g = Integer.parseInt(split[6]);
        this.h = split[7];
        this.i = Boolean.parseBoolean(split[8]);
        s55.g("ProcStartStrategy", "proc strategy:", "type", Integer.valueOf(this.f25020a), "clsName", this.b, "beginHour", Integer.valueOf(this.c), "endHour", Integer.valueOf(this.d), "maxTimes", Integer.valueOf(this.e), "allowHour", Integer.valueOf(this.f), "taskid", Integer.valueOf(this.g), "bucketId", this.h);
        return d();
    }
}
