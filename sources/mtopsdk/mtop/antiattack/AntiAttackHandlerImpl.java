package mtopsdk.mtop.antiattack;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;
import tb.inx;
import tb.l5o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AntiAttackHandlerImpl implements AntiAttackHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_WAIT_RESULT_TIME_OUT = 20000;
    private static final String MTOPSDK_ANTI_ATTACK_ACTION = "mtopsdk.mtop.antiattack.checkcode.validate.activity_action";
    private static final String MTOPSDK_ANTI_ATTACK_RESULT_ACTION = "mtopsdk.extra.antiattack.result.notify.action";
    private static final String TAG = "mtopsdk.AntiAttackHandlerImpl";
    public final Context mContext;
    public final AtomicBoolean isHandling = new AtomicBoolean(false);
    private final IntentFilter intentFilter = new IntentFilter(MTOPSDK_ANTI_ATTACK_RESULT_ACTION);
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable timeoutRunnable = new Runnable() { // from class: mtopsdk.mtop.antiattack.AntiAttackHandlerImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AntiAttackHandlerImpl.this.isHandling.set(false);
            l5o.a("ANTI").b(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
        }
    };
    public final BroadcastReceiver antiAttackReceiver = new BroadcastReceiver() { // from class: mtopsdk.mtop.antiattack.AntiAttackHandlerImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/antiattack/AntiAttackHandlerImpl$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Context context2;
            BroadcastReceiver broadcastReceiver;
            IpChange ipChange = $ipChange;
            try {
                try {
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    try {
                        String stringExtra = intent.getStringExtra("Result");
                        TBSdkLog.i(AntiAttackHandlerImpl.TAG, "[onReceive]AntiAttack result: " + stringExtra);
                        if ("success".equals(stringExtra)) {
                            l5o.a("ANTI").e(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "");
                        } else {
                            l5o.a("ANTI").b(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                        }
                        AntiAttackHandlerImpl.access$100(AntiAttackHandlerImpl.this).removeCallbacks(AntiAttackHandlerImpl.access$000(AntiAttackHandlerImpl.this));
                        AntiAttackHandlerImpl.this.isHandling.set(false);
                        AntiAttackHandlerImpl antiAttackHandlerImpl = AntiAttackHandlerImpl.this;
                        context2 = antiAttackHandlerImpl.mContext;
                        broadcastReceiver = antiAttackHandlerImpl.antiAttackReceiver;
                    } catch (Exception unused) {
                        TBSdkLog.e(AntiAttackHandlerImpl.TAG, "[onReceive]AntiAttack exception");
                        l5o.a("ANTI").b(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                        AntiAttackHandlerImpl.access$100(AntiAttackHandlerImpl.this).removeCallbacks(AntiAttackHandlerImpl.access$000(AntiAttackHandlerImpl.this));
                        AntiAttackHandlerImpl.this.isHandling.set(false);
                        AntiAttackHandlerImpl antiAttackHandlerImpl2 = AntiAttackHandlerImpl.this;
                        context2 = antiAttackHandlerImpl2.mContext;
                        broadcastReceiver = antiAttackHandlerImpl2.antiAttackReceiver;
                    }
                    context2.unregisterReceiver(broadcastReceiver);
                } catch (Exception unused2) {
                    TBSdkLog.e(AntiAttackHandlerImpl.TAG, "waiting antiattack exception");
                }
            } catch (Throwable th) {
                AntiAttackHandlerImpl.access$100(AntiAttackHandlerImpl.this).removeCallbacks(AntiAttackHandlerImpl.access$000(AntiAttackHandlerImpl.this));
                AntiAttackHandlerImpl.this.isHandling.set(false);
                try {
                    AntiAttackHandlerImpl antiAttackHandlerImpl3 = AntiAttackHandlerImpl.this;
                    antiAttackHandlerImpl3.mContext.unregisterReceiver(antiAttackHandlerImpl3.antiAttackReceiver);
                } catch (Exception unused3) {
                    TBSdkLog.e(AntiAttackHandlerImpl.TAG, "waiting antiattack exception");
                }
                throw th;
            }
        }
    };

    static {
        t2o.a(589299853);
        t2o.a(589299852);
    }

    public AntiAttackHandlerImpl(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ Runnable access$000(AntiAttackHandlerImpl antiAttackHandlerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7022fe0f", new Object[]{antiAttackHandlerImpl});
        }
        return antiAttackHandlerImpl.timeoutRunnable;
    }

    public static /* synthetic */ Handler access$100(AntiAttackHandlerImpl antiAttackHandlerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("519fee42", new Object[]{antiAttackHandlerImpl});
        }
        return antiAttackHandlerImpl.handler;
    }

    @Override // mtopsdk.mtop.antiattack.AntiAttackHandler
    public void handle(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690a6843", new Object[]{this, str, str2});
            return;
        }
        String sb = new StringBuilder(str).toString();
        boolean h = inx.h();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[handle]execute new 419 Strategy,location=" + sb + ", isBackground=" + h);
        }
        if (!this.isHandling.compareAndSet(false, true)) {
            TBSdkLog.i(TAG, "isHandling");
            return;
        }
        try {
            long globalAttackAttackWaitInterval = SwitchConfig.getInstance().getGlobalAttackAttackWaitInterval();
            this.handler.postDelayed(this.timeoutRunnable, globalAttackAttackWaitInterval > 0 ? globalAttackAttackWaitInterval * 1000 : 20000L);
            Intent intent = new Intent();
            intent.setAction(MTOPSDK_ANTI_ATTACK_ACTION);
            intent.setPackage(this.mContext.getPackageName());
            intent.setFlags(268435456);
            intent.putExtra("Location", sb);
            this.mContext.startActivity(intent);
            this.mContext.registerReceiver(this.antiAttackReceiver, this.intentFilter);
        } catch (Exception e) {
            this.isHandling.set(false);
            this.handler.removeCallbacks(this.timeoutRunnable);
            l5o.a("ANTI").b(Mtop.instance(Mtop.Id.INNER, this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
            TBSdkLog.w(TAG, "[handle] execute new 419 Strategy error.", e);
        }
    }
}
