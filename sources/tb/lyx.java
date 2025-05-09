package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcStats;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lyx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean F;
    public static volatile boolean G;
    public static volatile boolean H;
    public static final byte[] I = new byte[0];
    public String A;
    public int B;
    public int C;
    public String D;
    public lyx E;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23653a;
    public long b;
    public long c;
    public String d;
    public String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public String p;
    public String q;
    public int r;
    public long s;
    public int t;
    public boolean u;
    public long v;
    public String w;
    public String x;
    public String y;
    public int z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f23654a;

        public a(long j) {
            this.f23654a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (lyx c = lyx.c(lyx.this); c != null; c = lyx.c(c)) {
                if (!c.f23653a) {
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("biz", lyx.this.d);
            hashMap2.put(UploadConstants.FILE_ID, lyx.this.p);
            lyx.this.getClass();
            hashMap2.put("arupversion", "2.3.4");
            hashMap2.put("tasktype", String.valueOf(lyx.this.u ? 1 : 0));
            hashMap2.put("eventtime", String.valueOf(this.f23654a));
            if (!TextUtils.isEmpty(lyx.this.x)) {
                hashMap2.put("md5", lyx.this.x);
            }
            if (!TextUtils.isEmpty(lyx.this.w)) {
                hashMap2.put("mimetype", lyx.this.w);
            }
            if (!TextUtils.isEmpty(lyx.this.y)) {
                hashMap2.put("trackid", lyx.this.y);
            }
            hashMap2.put(pod.IP, lyx.this.e);
            hashMap2.put("port", String.valueOf(lyx.this.f));
            lyx.this.getClass();
            hashMap2.put("pageback", "0");
            hashMap2.put("concurrenttasks", String.valueOf(lyx.this.B));
            if (!TextUtils.isEmpty(lyx.this.D)) {
                hashMap2.put("protocol", lyx.this.D);
            }
            long j = lyx.this.k;
            if (j > 0) {
                hashMap.put("size", Double.valueOf(j));
            }
            if (!lyx.l()) {
                synchronized (lyx.m()) {
                    try {
                        if (!lyx.l()) {
                            lyx.i(lyx.this);
                            lyx.f(true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (rtx.d(16)) {
                rtx.a(16, "ActionStatistics", "commit FileUploadStart, dimensions:" + hashMap2 + ", measures:" + hashMap);
            }
            dzx.a("ARUP", "FileUploadStart", hashMap, hashMap2);
        }
    }

    public lyx(boolean z, lyx lyxVar) {
        this.f23653a = z;
        this.E = lyxVar;
    }

    public static /* synthetic */ lyx c(lyx lyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lyx) ipChange.ipc$dispatch("676fcdce", new Object[]{lyxVar});
        }
        return lyxVar.E;
    }

    public static /* synthetic */ boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        H = z;
        return z;
    }

    public static /* synthetic */ void i(lyx lyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760a1122", new Object[]{lyxVar});
        } else {
            lyxVar.n();
        }
    }

    public static /* synthetic */ boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        return H;
    }

    public static /* synthetic */ byte[] m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aef483f1", new Object[0]);
        }
        return I;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f23653a) {
            ewx.a(new a(System.currentTimeMillis()));
        }
    }

    public void e(oet oetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad8c1dc", new Object[]{this, oetVar});
            return;
        }
        this.g = 4;
        this.u = true;
        this.p = oetVar.g;
        this.d = oetVar.f25337a;
        g();
    }

    public void h(oet oetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b1819d", new Object[]{this, oetVar});
            return;
        }
        this.g = 3;
        this.u = false;
        this.p = oetVar.g;
        this.d = oetVar.f25337a;
        g();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        try {
            JSONObject k = k(this);
            lyx lyxVar = this.E;
            JSONObject jSONObject = k;
            while (lyxVar != null) {
                if (lyxVar.f23653a) {
                    lyxVar = lyxVar.E;
                } else {
                    JSONObject k2 = k(lyxVar);
                    jSONObject.put("previous", k2);
                    lyxVar = lyxVar.E;
                    jSONObject = k2;
                }
            }
            return k.toString();
        } catch (JSONException e) {
            if (!rtx.d(16)) {
                return null;
            }
            rtx.b(16, "ActionStatistics", "toJsonString error.", e);
            return null;
        }
    }

    public final JSONObject k(lyx lyxVar) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ad34e91", new Object[]{this, lyxVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("costTimeMillisStart", lyxVar.l);
        long j = lyxVar.m;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("costTimeMillisEnd", j);
        jSONObject.put("connectedTimeMillisStart", lyxVar.n);
        jSONObject.put("connectedTimeMillisEnd", lyxVar.o);
        jSONObject.put("prepareTime", lyxVar.s);
        jSONObject.put("networkType", lyxVar.A);
        jSONObject.put(ArtcStats.STAT_RETRYCOUNT, lyxVar.r);
        jSONObject.put("phaseIndex", lyxVar.z);
        jSONObject.put("upstream", lyxVar.b);
        return jSONObject;
    }

    public final Set<String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7215bcdd", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("biz");
        hashSet.add("token");
        hashSet.add(UploadConstants.FILE_ID);
        hashSet.add(pod.IP);
        hashSet.add("port");
        hashSet.add(rb.RESULT_KEY);
        hashSet.add("errorcode");
        hashSet.add("subcode");
        hashSet.add("errormsg");
        hashSet.add(UploadConstants.RETRY_TIMES);
        hashSet.add("arupversion");
        if (!this.f23653a) {
            hashSet.add(AgooConstants.MESSAGE_ENCRYPTED);
            hashSet.add("protocol");
            hashSet.add("tasktype");
            hashSet.add("uploadtrace");
            hashSet.add("mimetype");
            hashSet.add("trackid");
            hashSet.add("md5");
            hashSet.add("concurrenttasks");
            hashSet.add("pageback");
            hashSet.add("eventtime");
        }
        return hashSet;
    }

    public final Set<String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3fc01e9e", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("connecttime");
        hashSet.add("costtime");
        hashSet.add("size");
        hashSet.add(TBImageFlowMonitor.SPEED_MEASURE);
        hashSet.add("totaltime");
        hashSet.add("md5time");
        hashSet.add("upstream");
        hashSet.add("downstream");
        if (!this.f23653a) {
            hashSet.add("serverrt");
            hashSet.add("uploadcount");
            hashSet.add("phasecount");
        }
        return hashSet;
    }

    public static lyx a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lyx) ipChange.ipc$dispatch("881af41d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            lyx b = b(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("previous");
            lyx lyxVar = b;
            while (optJSONObject != null) {
                lyx b2 = b(optJSONObject);
                lyxVar.E = b2;
                optJSONObject = optJSONObject.optJSONObject("previous");
                lyxVar = b2;
            }
            return b;
        } catch (Exception e) {
            if (rtx.d(16)) {
                rtx.b(16, "ActionStatistics", "buildFileUploadStatistics error.", e);
            }
            return new lyx(false);
        }
    }

    public static lyx b(JSONObject jSONObject) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lyx) ipChange.ipc$dispatch("c311f379", new Object[]{jSONObject});
        }
        lyx lyxVar = new lyx(false);
        lyxVar.l = jSONObject.getLong("costTimeMillisStart");
        lyxVar.m = jSONObject.getLong("costTimeMillisEnd");
        lyxVar.n = jSONObject.getLong("connectedTimeMillisStart");
        lyxVar.o = jSONObject.getLong("connectedTimeMillisEnd");
        lyxVar.s = jSONObject.getLong("prepareTime");
        lyxVar.A = jSONObject.getString("networkType");
        lyxVar.r = jSONObject.getInt(ArtcStats.STAT_RETRYCOUNT);
        lyxVar.z = jSONObject.getInt("phaseIndex");
        lyxVar.b = jSONObject.getLong("upstream");
        return lyxVar;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add("biz");
        hashSet.add(UploadConstants.FILE_ID);
        hashSet.add("arupversion");
        hashSet.add("tasktype");
        hashSet.add("mimetype");
        hashSet.add("trackid");
        hashSet.add("md5");
        hashSet.add(pod.IP);
        hashSet.add("port");
        hashSet.add("pageback");
        hashSet.add("concurrenttasks");
        hashSet.add("protocol");
        hashSet.add("eventtime");
        hashSet2.add("size");
        dzx.b("ARUP", "FileUploadStart", hashSet2, hashSet, false);
    }

    public lyx(boolean z) {
        this.f23653a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g() {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lyx.g():java.lang.String");
    }
}
