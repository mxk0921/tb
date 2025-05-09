package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31904a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public long l = -1;
    public long m = -1;
    public long n = -1;
    public long o = -1;
    public boolean p;

    static {
        t2o.a(779093669);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1902a4", new Object[]{this});
            return;
        }
        if (this.m > 0) {
            this.n = System.currentTimeMillis() - this.m;
        }
        if (this.l > 0) {
            this.o = System.currentTimeMillis() - this.l;
        }
        TLog.loge("CardPlayPerformanceTracker", "firstFrame kPlayerFirstFrameDuration = " + this.n + " kLiveFirstFrameDuration = " + this.o);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
            return;
        }
        if (this.l == -1) {
            this.l = System.currentTimeMillis();
        }
        TLog.loge("CardPlayPerformanceTracker", "pageAppear startPlayTimeMs = " + this.l);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853166f7", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae7a3da", new Object[]{this, str});
        } else {
            this.f31904a = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f226cc91", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7dc32d", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51728e1", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f4074a", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fa023a", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d23e7", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1979e1", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d61921", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91572e64", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777cfc3d", new Object[]{this});
            return;
        }
        if (this.m == -1) {
            this.m = System.currentTimeMillis();
        }
        TLog.loge("CardPlayPerformanceTracker", "startPlay startPlayTimeMs = " + this.m);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fa9fdd", new Object[]{this});
        } else if (this.n >= 0) {
            q();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1f2ba6", new Object[]{this});
        } else if (this.p) {
            HashMap hashMap = new HashMap();
            hashMap.put("liveId", this.f31904a);
            hashMap.put("liveStatus", this.b);
            hashMap.put("liveSource", this.c);
            hashMap.put("deviceLevel", String.valueOf(xj7.a()));
            hashMap.put(yj4.PARAM_PLAY_MODE, this.d);
            hashMap.put("startTimeMode", this.e);
            hashMap.put("liveUrlSource", this.f);
            hashMap.put(yj4.PARAM_PLAYER_TOKEN, this.g);
            hashMap.put(hnn.KEY_VIDEO_TYPE, this.h);
            hashMap.put("videoFormat", this.i);
            hashMap.put("playerScene", this.j);
            hashMap.put("isHitWarm", String.valueOf(this.k));
            hashMap.put("kPlayerFirstFrameDuration", String.valueOf(this.n));
            hashMap.put("kLiveFirstFrameDuration", String.valueOf(this.o));
            if (v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaoLive", "PlayerPerformance", hashMap);
            }
            TLog.loge("CardPlayPerformanceTracker", "ut " + hashMap);
            this.l = -1L;
            this.m = -1L;
            this.n = -1L;
            this.o = -1L;
        }
    }
}
