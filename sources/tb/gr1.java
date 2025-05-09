package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class gr1<T> extends d02<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public long h;
    public long i;
    public String j;
    public final lqd k;

    static {
        t2o.a(613417095);
    }

    public gr1(String str, boolean z, String str2) {
        String str3;
        this.e = str;
        this.f = z;
        if (z) {
            str3 = a.F;
        } else {
            str3 = a.D;
        }
        this.d = str3;
        this.g = str2;
        n();
        if (TextUtils.isEmpty(a.i)) {
            this.k = new ddr();
        } else {
            this.k = new qya();
        }
    }

    public static /* synthetic */ Object ipc$super(gr1 gr1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/sync/BaseAuthRequest");
    }

    public final String h(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db30c7e6", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (a.C == OConstant.ENV.ONLINE) {
            str3 = "https";
        } else {
            str3 = "http";
        }
        StringBuilder sb = new StringBuilder(str3);
        sb.append(HttpConstant.SCHEME_SPLIT);
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public abstract Map<String, String> i();

    public abstract String j();

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c14f701", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(this.g);
        sb.append("&");
        sb.append(a.h);
        sb.append("&");
        sb.append(a.j);
        sb.append("&");
        sb.append(a.k);
        sb.append("&");
        sb.append(this.h);
        if (this.f) {
            sb.append("&");
            sb.append(this.j);
            if (!TextUtils.isEmpty(str)) {
                sb.append("&");
                sb.append(str);
            }
        }
        return this.k.a(a.g, a.h, a.i, sb.toString(), a.m);
    }

    public abstract T l(String str);

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c96e588", new Object[]{this});
            return;
        }
        this.i = System.currentTimeMillis() / 1000;
        this.h = (System.currentTimeMillis() / 1000) + a.I;
        this.j = a.k + "_" + this.h;
    }

    public final void f(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58d96d4", new Object[]{this, map});
        } else if (map != null && !map.isEmpty() && "10002".equals(ibl.g(map.get("o-code").get(0)))) {
            OLog.w("AuthRequest", "checkResposeHeads", "expired, correct timestamp");
            long k = ibl.k(ibl.g(map.get("o-server-timestamp").get(0)));
            if (k != 0) {
                long j = this.i;
                if (j != 0) {
                    long j2 = k - j;
                    OLog.w("AuthRequest", "checkResposeHeads update global", "reqTimestampOffset(s)", Long.valueOf(j2), "server", Long.valueOf(k), "client", Long.valueOf(this.h), "relClient", Long.valueOf(this.i));
                    a.I = j2;
                    n();
                }
            }
        }
    }

    public final void g(tzc tzcVar, String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ec0b2b", new Object[]{this, tzcVar, str});
            return;
        }
        String h = ibl.h(a.h);
        String h2 = ibl.h(a.j);
        String h3 = ibl.h(a.k);
        String j = j();
        String h4 = ibl.h(k(j));
        if (TextUtils.isEmpty(h) || TextUtils.isEmpty(h3) || TextUtils.isEmpty(h2) || TextUtils.isEmpty(h4)) {
            OLog.e("AuthRequest", "getRequestImpl error", "signInfo", h4, "appKey", h, "appVersion", h2, "deviceId", h3);
            return;
        }
        tzcVar.setParams(i());
        tzcVar.f(str);
        if (this.f) {
            tzcVar.addHeader("o-request-unique", ibl.h(this.j));
        }
        tzcVar.addHeader("o-timestamp", ibl.h(String.valueOf(this.h)));
        tzcVar.addHeader("o-sign-version", ibl.h("1.0"));
        tzcVar.addHeader("o-sdk-version", ibl.h(OConstant.SDK_VERSION));
        tzcVar.addHeader("o-app-key", h);
        tzcVar.addHeader("o-app-version", h2);
        tzcVar.addHeader("o-device-id", h3);
        tzcVar.addHeader("o-sign", h4);
        if (tzcVar instanceof tqr) {
            tzcVar.addHeader("f-refer", "orange");
        }
        String str2 = a.l;
        if (!TextUtils.isEmpty(str2)) {
            tzcVar.addHeader("o-user-info", str2);
        }
        tzcVar.addHeader("host", ibl.h(this.d));
        if (!TextUtils.isEmpty(j)) {
            tzcVar.setMethod("POST");
            tzcVar.a(j.getBytes());
        } else {
            tzcVar.setMethod("GET");
        }
        tzcVar.connect();
    }

    public T m() {
        String str;
        Set<String> set;
        h9b h9bVar;
        int d;
        boolean isPrintLog = OLog.isPrintLog(1);
        String str2 = this.g;
        boolean z = this.f;
        if (isPrintLog) {
            OLog.d("AuthRequest", "syncRequest start", "isAckReq", Boolean.valueOf(z), "reqType", str2);
        }
        if (TextUtils.isEmpty(a.k)) {
            this.f17483a = -6;
            this.b = "utdid is null";
            OLog.e("AuthRequest", "syncRequest fail", "code", -6, "message", this.b);
            return null;
        }
        try {
            tzc tzcVar = (tzc) a.f.newInstance();
            boolean z2 = tzcVar instanceof h9b;
            String str3 = this.d;
            if (z2) {
                if (z) {
                    set = a.G;
                } else {
                    set = a.E;
                }
                List<String> l = ibl.l(set);
                l.add(0, str3);
                for (String str4 : l) {
                    try {
                        g(tzcVar, h(str4, str2));
                        h9bVar = (h9b) tzcVar;
                        h9bVar.c(ibl.b());
                        d = h9bVar.d();
                        this.f17483a = d;
                    } catch (Throwable th) {
                        try {
                            if (OLog.isPrintLog(3)) {
                                OLog.w("AuthRequest", "syncRequest fail", th, "host", str4);
                            }
                        } finally {
                            ((h9b) tzcVar).disconnect();
                        }
                    }
                    if (d == 200) {
                        f(h9bVar.g());
                        str = h9bVar.e();
                        h9bVar.disconnect();
                        break;
                    }
                    this.c = d;
                    h9bVar.disconnect();
                }
                str = null;
            } else {
                try {
                    g(tzcVar, h(str3, str2));
                    int d2 = tzcVar.d();
                    this.f17483a = d2;
                    if (d2 == 200) {
                        f(tzcVar.g());
                        str = tzcVar.e();
                    } else {
                        str = null;
                    }
                    tzcVar.disconnect();
                } catch (Throwable th2) {
                    try {
                        if (OLog.isPrintLog(3)) {
                            OLog.w("AuthRequest", "syncRequest fail", th2, "host", str3);
                        }
                        this.b = th2.getMessage();
                        tzcVar.disconnect();
                    } catch (Throwable th3) {
                        tzcVar.disconnect();
                        throw th3;
                    }
                }
            }
            if (z) {
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                this.f17483a = -2;
                this.b = "content is empty";
                OLog.e("AuthRequest", "syncRequest fail", "code", -2, "message", this.b);
                return null;
            }
            String md5 = tzcVar.getMd5();
            if (TextUtils.isEmpty(md5)) {
                md5 = doh.d(str);
            }
            String str5 = this.e;
            if (TextUtils.isEmpty(str5) || str5.equals(md5)) {
                try {
                    return l(str);
                } catch (Throwable th4) {
                    this.f17483a = -4;
                    this.b = th4.getMessage();
                    OLog.e("AuthRequest", "syncRequest fail", th4, new Object[0]);
                    return null;
                }
            } else {
                this.f17483a = -3;
                this.b = "content is broken";
                OLog.e("AuthRequest", "syncRequest fail", "code", -3, "message", this.b);
                return null;
            }
        } catch (Throwable th5) {
            OLog.e("AuthRequest", "syncRequest", th5, new Object[0]);
            this.b = th5.getMessage();
            return null;
        }
    }
}
