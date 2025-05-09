package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a1h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f15480a = nbl.j();
    public final HashMap<Integer, Integer> b = new HashMap<>();
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;
    public final String[] p;
    public final boolean q;
    public final boolean r;
    public final int s;

    public a1h() {
        this.r = false;
        try {
            JSONObject parseObject = JSON.parseObject(nbl.e());
            for (String str : parseObject.keySet()) {
                this.b.put(Integer.valueOf(str), parseObject.getInteger(str));
            }
        } catch (Exception unused) {
        }
        this.c = nbl.u();
        this.d = nbl.a();
        this.e = nbl.b();
        this.f = nbl.c();
        this.g = nbl.d();
        this.h = nbl.o();
        this.i = nbl.q();
        this.l = nbl.t();
        this.j = nbl.r();
        this.k = nbl.m();
        this.m = nbl.v();
        this.n = nbl.n();
        this.o = nbl.k();
        this.p = nbl.l().split(";");
        this.s = nbl.s();
        k6s.a("a1h", "LiveMessageConfig[init]:" + toString());
        if (!nbl.f()) {
            this.q = prq.a(v2s.o().c().b("taolive", "liveMsgUsecdn", "enable", "true"));
        } else {
            this.q = true;
        }
        this.r = nbl.i();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LiveMessageConfig{deduplicationSize=" + this.f15480a + ", defaultColorRate=" + this.b + ", useCdnFetchMSG=" + this.c + ", cdnFetchMSGInterval=" + this.d + ", cdnFetchMSGIntervalMax=" + this.e + ", cdnFetchMSGURL='" + this.f + "', isAddDeviceIdCdnFetchMSG=" + this.h + ", isNeedCDNMessageGet=" + this.i + ", timeoutCDNMessageGet=" + this.l + ", useHeartbeat=" + this.m + ", heartbeatInterval=" + this.n + ", heartFetchStatusInterval=" + this.o + ", heartbeatCommonExtraParams=" + Arrays.toString(this.p) + ", isLiveMessageLongPullDisable=" + this.j + ", timeoutCDNLongPull=" + this.s + ", cdnLongFetchMSGURL=" + this.g + ", isHeartbeatDisable=" + this.k + '}';
    }
}
