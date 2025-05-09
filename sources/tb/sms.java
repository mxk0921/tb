package tb;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.tschedule.TScheduleInitialize;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sms {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CDN_SUFFIX = "_cdn";

    /* renamed from: a  reason: collision with root package name */
    public static LSDB f28151a;
    public static volatile sms b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28152a;

        public a(String str) {
            this.f28152a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Response syncSend = new DegradableNetwork(TScheduleInitialize.b()).syncSend(new RequestImpl(this.f28152a), null);
            if (syncSend != null && syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null) {
                String str = new String(syncSend.getBytedata());
                if (!TextUtils.isEmpty(str) && sms.a(sms.this)) {
                    sms.b().insertString(new k3g(this.f28152a), str);
                }
            }
        }
    }

    static {
        t2o.a(329253026);
    }

    public sms() {
        h();
    }

    public static /* synthetic */ boolean a(sms smsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12d13a84", new Object[]{smsVar})).booleanValue();
        }
        return smsVar.h();
    }

    public static /* synthetic */ LSDB b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("12848c68", new Object[0]);
        }
        return f28151a;
    }

    public static sms f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sms) ipChange.ipc$dispatch("ece90c8d", new Object[0]);
        }
        if (b == null) {
            synchronized (sms.class) {
                try {
                    if (b == null) {
                        b = new sms();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1b63b0", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
            bns.a().d(new a(str));
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        if (!h()) {
            return false;
        }
        return f28151a.contains(new k3g(str));
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{this, str})).booleanValue();
        }
        if (!h()) {
            return false;
        }
        return f28151a.delete(new k3g(str));
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        if (!h()) {
            return null;
        }
        return f28151a.getString(new k3g(str));
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f882fb60", new Object[]{this})).booleanValue();
        }
        if (f28151a == null) {
            f28151a = LSDB.open("TScheduleBridgeModule", null);
        }
        if (f28151a != null) {
            return true;
        }
        return false;
    }

    public boolean i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85e0b049", new Object[]{this, str, str2})).booleanValue();
        }
        if (!h()) {
            return false;
        }
        return f28151a.insertString(new k3g(str), str2);
    }
}
