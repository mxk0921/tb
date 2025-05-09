package tb;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ztj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f33004a = "Unknown";
    public static SubscriptionManager b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f33005a;

        public a(Context context) {
            this.f33005a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ztj.a(this.f33005a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592908);
        }

        public c(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/network/NetworkOperatorUtil$NetworkOperatorHandler");
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a3198ca", new Object[]{this, runnable});
                return;
            }
            nhh.q();
            if (runnable != null) {
                try {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = runnable;
                    sendMessage(obtain);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                Object obj = message.obj;
                if (obj != null && (obj instanceof Runnable)) {
                    ((Runnable) obj).run();
                }
            } catch (Throwable th) {
                nhh.h("NetworkOperatorUtil", th, new Object[0]);
            }
            super.handleMessage(message);
        }
    }

    static {
        t2o.a(962592905);
    }

    public static /* synthetic */ void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            d(context);
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return f33004a;
    }

    public static synchronized String c() {
        synchronized (ztj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("24af82df", new Object[0]);
            }
            return f33004a;
        }
    }

    public static synchronized void e(Context context) throws Exception {
        synchronized (ztj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d9eac", new Object[]{context});
            } else if (Build.VERSION.SDK_INT >= 22) {
                if (b == null) {
                    new c(Looper.getMainLooper()).a(new a(context));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends SubscriptionManager.OnSubscriptionsChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f33006a;

        public b(Context context) {
            this.f33006a = context;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1694120292) {
                super.onSubscriptionsChanged();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/network/NetworkOperatorUtil$2");
        }

        @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
        public void onSubscriptionsChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64fa3964", new Object[]{this});
                return;
            }
            super.onSubscriptionsChanged();
            nhh.f("NetworkOperatorUtil", "onSubscriptionsChanged");
            ztj.f(this.f33006a);
            nhh.f("NetworkOperatorUtil", "CurrentNetworkOperator", ztj.b());
            o1v.k(this.f33006a);
        }
    }

    public static synchronized void d(Context context) {
        synchronized (ztj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61a01971", new Object[]{context});
            } else if (Build.VERSION.SDK_INT >= 22) {
                if (b == null) {
                    SubscriptionManager a2 = xtj.a(context.getSystemService("telephony_subscription_service"));
                    b = a2;
                    if (a2 == null) {
                        nhh.f("NetworkOperatorUtil", "SubscriptionManager is null");
                    } else {
                        b.addOnSubscriptionsChangedListener(new b(context));
                        nhh.f("NetworkOperatorUtil", "addOnSubscriptionsChangedListener");
                    }
                }
            }
        }
    }

    public static synchronized void f(Context context) {
        synchronized (ztj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad81468d", new Object[]{context});
                return;
            }
            nhh.r("NetworkOperatorUtil", "updateNetworkOperatorName");
            try {
            } catch (Exception e) {
                nhh.h("NetworkOperatorUtil", e, new Object[0]);
            }
            if (!b1v.bGetSimOperator) {
                f33004a = "Unknown";
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                f33004a = "Unknown";
                return;
            }
            if (telephonyManager.getSimState() == 5) {
                String simOperator = telephonyManager.getSimOperator();
                if (TextUtils.isEmpty(simOperator)) {
                    String simOperatorName = telephonyManager.getSimOperatorName();
                    if (TextUtils.isEmpty(simOperatorName)) {
                        f33004a = "Unknown";
                        return;
                    } else {
                        f33004a = simOperatorName;
                        return;
                    }
                } else {
                    if (!simOperator.equals("46000") && !simOperator.equals("46002") && !simOperator.equals("46007") && !simOperator.equals("46008")) {
                        if (!simOperator.equals("46001") && !simOperator.equals("46006") && !simOperator.equals("46009")) {
                            if (!simOperator.equals("46003") && !simOperator.equals("46005") && !simOperator.equals("46011")) {
                                String simOperatorName2 = telephonyManager.getSimOperatorName();
                                if (TextUtils.isEmpty(simOperatorName2)) {
                                    f33004a = "Unknown";
                                    return;
                                } else {
                                    f33004a = simOperatorName2;
                                    return;
                                }
                            }
                            f33004a = "中国电信";
                            return;
                        }
                        f33004a = "中国联通";
                        return;
                    }
                    f33004a = "中国移动";
                    return;
                }
            }
            f33004a = "Unknown";
        }
    }
}
