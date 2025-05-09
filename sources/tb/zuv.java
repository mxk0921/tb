package tb;

import android.content.Context;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zuv implements a8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f33029a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final zuv f33030a = new zuv();

        public static /* synthetic */ zuv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zuv) ipChange.ipc$dispatch("7ed3c970", new Object[0]);
            }
            return f33030a;
        }
    }

    public static zuv b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zuv) ipChange.ipc$dispatch("1b33d7b5", new Object[0]);
        }
        return a.a();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acace15", new Object[]{this})).intValue();
        }
        return this.f33029a;
    }

    @Override // tb.a8e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e991ac", new Object[]{this});
            return;
        }
        int i = this.f33029a;
        if (i == 2 || i == 1) {
            try {
                tx8 tx8Var = new tx8();
                tx8Var.e(mh1.PRD_USER_TYPE, Integer.valueOf(this.f33029a));
                nzb.b().c("intranet_network_exception", tx8Var);
                ALog.e("npm.UserTypeDetector", "[reportUserLog]success", null, mh1.PRD_USER_TYPE, Integer.valueOf(this.f33029a));
            } catch (Throwable unused) {
                ALog.e("npm.UserTypeDetector", "[reportUserLog]failed", null, new Object[0]);
            }
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            int i = context.getSharedPreferences(gjv.INNER_USER_CONFIG, 0).getInt(mk7.USER_TYPE, 0);
            this.f33029a = i;
            ALog.e("npm.UserTypeDetector", "[setUserType]", null, mh1.PRD_USER_TYPE, Integer.valueOf(i));
        } catch (Exception e) {
            this.f33029a = 0;
            ALog.e("npm.UserTypeDetector", "[setUserType]failed.", null, e, new Object[0]);
        }
    }
}
