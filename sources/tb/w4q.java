package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.IPlayPublicService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w4q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String l = w4q.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f30455a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public long i;
    public final Runnable j = new a();
    public final Handler k = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                w4q.a(w4q.this);
            }
        }
    }

    static {
        t2o.a(779092070);
    }

    public static /* synthetic */ void a(w4q w4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4327c3", new Object[]{w4qVar});
        } else {
            w4qVar.m();
        }
    }

    public final void b(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343569ac", new Object[]{this, map});
        } else if (!tz3.b(map)) {
            if (jtn.s()) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("favor_red_packet", str);
        }
    }

    public final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("47beae77", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.8001249");
        hashMap.put("interact_type", this.f30455a);
        hashMap.put("voice_status", this.h);
        hashMap.put("instance_playid", this.b);
        hashMap.put("feed_id", this.c);
        hashMap.put(z9u.KEY_ACCOUNT_ID, this.d);
        hashMap.put("livesource", this.e);
        hashMap.put(z9u.KEY_LIVE_STATUS, this.f);
        hashMap.put("entryLiveSource", this.g);
        return hashMap;
    }

    public void d(IPlayPublicService iPlayPublicService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f10a4c6", new Object[]{this, iPlayPublicService});
            return;
        }
        String str = "close";
        if (iPlayPublicService != null) {
            if (!iPlayPublicService.isMuted()) {
                str = "open";
            }
            this.h = str;
        } else {
            this.h = str;
        }
        u(c(), "MiniWatch_Close");
    }

    public void e(r4d r4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853dff4", new Object[]{this, r4dVar});
            return;
        }
        String str = "close";
        if (r4dVar != null) {
            if (!r4dVar.isMuted()) {
                str = "open";
            }
            this.h = str;
        } else {
            this.h = str;
        }
        Map<String, String> c = c();
        b(c);
        u(c, "MiniWatch_Close");
    }

    public void f(r4d r4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab4dfb8", new Object[]{this, r4dVar});
            return;
        }
        String str = "close";
        if (r4dVar != null) {
            if (!r4dVar.isMuted()) {
                str = "open";
            }
            this.h = str;
        } else {
            this.h = str;
        }
        u(c(), "MiniWatch_HItFatigueRule");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        m();
        this.k.removeCallbacks(this.j);
    }

    public void h(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a12b625a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "close";
        } else {
            str = "open";
        }
        this.h = str;
        Map<String, String> c = c();
        b(c);
        u(c, "MiniWatch_Click");
    }

    public void i(r4d r4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627cee87", new Object[]{this, r4dVar});
            return;
        }
        String str = "close";
        if (r4dVar != null) {
            if (!r4dVar.isMuted()) {
                str = "open";
            }
            this.h = str;
        } else {
            this.h = str;
        }
        u(c(), "MiniWatch_QuickClose");
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1230b0d", new Object[]{this, str});
            return;
        }
        this.h = str;
        v(c(), "MiniWatch_Display");
        this.i = System.currentTimeMillis();
        this.k.removeCallbacks(this.j);
        this.k.postDelayed(this.j, 1000L);
    }

    public void k(boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c73464e", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "close";
        } else {
            str = "open";
        }
        this.h = str;
        Map<String, String> c = c();
        if (z) {
            str2 = "MiniWatch_VoiceClose";
        } else {
            str2 = "MiniWatch_VoiceOpen";
        }
        u(c, str2);
        m();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6225bd1", new Object[]{this});
        } else {
            v(c(), "MiniWatch_redpacket_Display");
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406e636f", new Object[]{this});
            return;
        }
        this.k.removeCallbacks(this.j);
        this.k.postDelayed(this.j, 60000L);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.i;
        this.i = currentTimeMillis;
        Map<String, String> c = c();
        c.put("duration_time", String.valueOf(j));
        v(c, "MiniWatch_Recordtime");
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fa4fc0", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d030a8", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbd33ab", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c602c4c8", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b691232", new Object[]{this, str});
        } else {
            this.f30455a = str;
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4379dbda", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47b871", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void u(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbea858b", new Object[]{this, map, str});
            return;
        }
        String str2 = l;
        efs.a(str2, "trackClick arg1 = " + str + " params" + map);
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, map);
        }
    }

    public final void v(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9420480", new Object[]{this, map, str});
            return;
        }
        String str2 = l;
        efs.b(str2, "trackShow arg1 = " + str + " params" + map);
        if (v2s.o().E() != null) {
            v2s.o().E().track4Show("Page_TaobaoLiveWatch", str, map);
        }
    }
}
