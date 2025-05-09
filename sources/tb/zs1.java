package tb;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class zs1<T> extends d02<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String e;
    public String f;
    public final a d = new a();
    public int g = -1;
    public int h = -1;
    public boolean i = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f32983a = 0;
        public long b = 0;
        public long c = 0;
        public long d = 0;
        public long e = 0;
        public long f = 0;
        public long g = 0;
        public String h;

        static {
            t2o.a(613417098);
        }
    }

    static {
        t2o.a(613417097);
    }

    public static /* synthetic */ Object ipc$super(zs1 zs1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/sync/BaseCriticalRequest");
    }

    public final String g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e638531", new Object[]{this});
        }
        if (com.taobao.orange.a.C != OConstant.ENV.TEST) {
            str = "https";
        } else {
            str = "http";
        }
        return str + HttpConstant.SCHEME_SPLIT + h() + OConstant.CRITICAL_QUERY_PATH;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        return OConstant.CRITICAL_TAOBAO_HOSTS[com.taobao.orange.a.C.getEnvMode()];
    }

    public a i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("85c90937", new Object[]{this});
        }
        return this.d;
    }

    public abstract T j(String str);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T k() {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zs1.k():java.lang.Object");
    }

    public final void f(tzc tzcVar, String str) throws Throwable {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ec0b2b", new Object[]{this, tzcVar, str});
            return;
        }
        String str3 = com.taobao.orange.a.h;
        String str4 = com.taobao.orange.a.j;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String str5 = Build.BRAND;
        String str6 = Build.MODEL;
        String utdid = UTDevice.getUtdid(com.taobao.orange.a.g);
        String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
        String d = doh.d(valueOf2 + utdid);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(utdid) || TextUtils.isEmpty(valueOf2) || TextUtils.isEmpty(d)) {
            OLog.e("BaseCriticalRequest", "formatNetConnection get request params error", "appKey", str3, "appVersion", str4, "osVersion", valueOf, "brand", str5, "model", str6, "deviceId", utdid, "timestamp", valueOf2, "sign", d);
            return;
        }
        tzcVar.f(str);
        tzcVar.setMethod("GET");
        tzcVar.setRetryTime(0);
        tzcVar.setFollowRedirects(false);
        tzcVar.b();
        tzcVar.addHeader("o-app-key", ibl.h(str3));
        tzcVar.addHeader("o-app-version", ibl.h(str4));
        tzcVar.addHeader("o-os-version", ibl.h(valueOf));
        tzcVar.addHeader("o-mobile-brand", ibl.h(str5));
        tzcVar.addHeader("o-mobile-model", ibl.h(str6));
        tzcVar.addHeader("o-device-id", ibl.h(utdid));
        tzcVar.addHeader("o-timestamp", ibl.h(valueOf2));
        tzcVar.addHeader("o-sign", ibl.h(d));
        if (this.i) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        tzcVar.addHeader("o-startup-type", str2);
        OLog.e("BaseCriticalRequest", "net start connect", new Object[0]);
        tzcVar.connect();
    }
}
