package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import tb.h8b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lut {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_TIME_ADJUST_HOST_PORT = "time_adjust_host";
    public static final lut f = new lut();

    /* renamed from: a  reason: collision with root package name */
    public long f23581a = 0;
    public final String b = h1p.HTTPS_PREFIX;
    public final String c = MtopUnitStrategy.CENTER_ONLINE_DOMAIN;
    public final String d = "/gw/mtop.common.getTimestamp/*";
    public boolean e = false;

    static {
        t2o.a(962592898);
    }

    public static /* synthetic */ String a(lut lutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34ba559f", new Object[]{lutVar});
        }
        return lutVar.c;
    }

    public static /* synthetic */ String b(lut lutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("636bbfbe", new Object[]{lutVar});
        }
        return lutVar.b;
    }

    public static /* synthetic */ String c(lut lutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("921d29dd", new Object[]{lutVar});
        }
        return lutVar.d;
    }

    public static /* synthetic */ long d(lut lutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab42cd18", new Object[]{lutVar})).longValue();
        }
        return lutVar.f23581a;
    }

    public static /* synthetic */ long e(lut lutVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9d955d2", new Object[]{lutVar, new Long(j)})).longValue();
        }
        lutVar.f23581a = j;
        return j;
    }

    public static /* synthetic */ boolean f(lut lutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9024529", new Object[]{lutVar})).booleanValue();
        }
        return lutVar.e;
    }

    public static /* synthetic */ boolean g(lut lutVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24091a11", new Object[]{lutVar, new Boolean(z)})).booleanValue();
        }
        lutVar.e = z;
        return z;
    }

    public static lut m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lut) ipChange.ipc$dispatch("c2786b6e", new Object[0]);
        }
        return f;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ade579c", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16b74981", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis() + this.f23581a;
    }

    public long j(String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6740a0b", new Object[]{this, str})).longValue();
        }
        try {
            j = Long.parseLong(str);
        } catch (Exception e) {
            nhh.f("TimeStampAdjustMgr", e);
            j = 0;
        }
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        return j + this.f23581a;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8b0fa2", new Object[]{this});
        }
        return String.valueOf(i());
    }

    public String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("371d7698", new Object[]{this, str});
        }
        if (this.e) {
            return String.valueOf(j(str));
        }
        return str;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ca8024", new Object[]{this});
            return;
        }
        nhh.f("TimeStampAdjustMgr", "bTimeStampAdjust", Boolean.valueOf(b1v.bTimeStampAdjust));
        if (b1v.bTimeStampAdjust) {
            zdt.c().d(null, new a(), 0L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = lut.a(lut.this);
            String a3 = iaq.a(o2w.k().g(), lut.TAG_TIME_ADJUST_HOST_PORT);
            if (!TextUtils.isEmpty(a3)) {
                a2 = a3;
            }
            String str = lut.b(lut.this) + a2 + lut.c(lut.this);
            h8b.a a4 = h8b.a(1, str, null, false);
            nhh.f("TimeStampAdjustMgr", "url", str, "response", a4);
            if (a4 != null && a4.f20468a != null) {
                try {
                    byte[] bArr = a4.f20468a;
                    JSONObject optJSONObject = new JSONObject(new String(bArr, 0, bArr.length)).optJSONObject("data");
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("t");
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                long parseLong = Long.parseLong(optString);
                                long j = parseLong - currentTimeMillis;
                                if (j > m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT || currentTimeMillis - parseLong > m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT) {
                                    lut.e(lut.this, j);
                                    lut.g(lut.this, true);
                                }
                                nhh.f("TimeStampAdjustMgr", "t", optString, pg1.ATOM_EXT_now, Long.valueOf(currentTimeMillis), "diff", Long.valueOf(lut.d(lut.this)), AgooConstants.MESSAGE_FLAG, Boolean.valueOf(lut.f(lut.this)));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
