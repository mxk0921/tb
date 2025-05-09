package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.C1181na;
import com.alibaba.security.client.smart.core.track.model.TLogHttpReq;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.na  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1181na {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final int f2608a = 4096;
    public AbstractC1167i b;
    public final Handler c;
    public boolean d;
    public final Context e;
    public final HandlerThread f;
    public C1177la g;

    public C1181na(Context context) {
        this.e = context;
        HandlerThread handlerThread = new HandlerThread("WukongUploadManager");
        this.f = handlerThread;
        handlerThread.start();
        this.c = new HandlerC1179ma(this, handlerThread.getLooper());
    }

    public static /* synthetic */ void a(C1181na naVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a48139", new Object[]{naVar});
        } else {
            naVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(C1177la laVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b8639", new Object[]{this, laVar});
        } else {
            b(laVar, "bootstrap");
        }
    }

    private long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        return vb.c().d() * 1000;
    }

    private long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        return vb.c().h() * 1000;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.c.hasMessages(4096)) {
            this.c.removeMessages(4096);
        }
        this.c.sendEmptyMessageDelayed(4096, e());
    }

    public void b(final C1177la laVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211ec38", new Object[]{this, laVar});
            return;
        }
        long d = d();
        if (d >= 0) {
            this.c.postDelayed(new Runnable() { // from class: tb.quz
                @Override // java.lang.Runnable
                public final void run() {
                    C1181na.this.c(laVar);
                }
            }, d);
        }
    }

    private synchronized AbstractC1167i a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractC1167i) ipChange.ipc$dispatch("269002b3", new Object[]{this, context});
        }
        if (this.b == null) {
            this.b = new C1164h(context);
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        C1177la laVar = this.g;
        if (laVar != null) {
            if (laVar.b() || this.g.a(vb.c().m())) {
                b(this.g, Constants.Name.INTERVAL);
            }
        }
    }

    private synchronized void b(C1177la laVar, String str) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f97802", new Object[]{this, laVar, str});
                return;
            }
            try {
                List<TrackLog> c = laVar.c();
                int min = Math.min(a(), c.size());
                for (int i = 0; i < min; i = min) {
                    b(c.subList(i, min), str);
                    min = Math.min(a() + min, c.size());
                }
                laVar.a();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(C1177la laVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbaf3c3", new Object[]{this, laVar, str});
        } else {
            b(laVar, str);
        }
    }

    public void a(C1177la laVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2885237", new Object[]{this, laVar});
        } else {
            this.g = laVar;
        }
    }

    public void a(List<TrackLog> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
        } else if (list != null && !list.isEmpty()) {
            TLogHttpReq tLogHttpReq = new TLogHttpReq();
            for (TrackLog trackLog : list) {
                String str2 = trackLog.ccrcCode;
                Map<String, Object> map = trackLog.ext;
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("source", str);
                trackLog.ext = map;
                if (!tLogHttpReq.ccrcCodes.contains(str2)) {
                    tLogHttpReq.ccrcCodes.add(str2);
                }
            }
            tLogHttpReq.logs = JsonUtils.toJSONString(list);
            a(this.e).a(tLogHttpReq, null);
        }
    }

    private void b(List<TrackLog> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f0624", new Object[]{this, list, str});
        } else if (list != null && !list.isEmpty()) {
            a(list, str);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.d) {
            this.c.sendEmptyMessageDelayed(4096, e());
            this.d = true;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : vb.c().l();
    }

    public void a(final C1177la laVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b637fc41", new Object[]{this, laVar, str});
            return;
        }
        if (laVar != null && !laVar.c().isEmpty()) {
            try {
                this.c.post(new Runnable() { // from class: tb.puz
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1181na.this.c(laVar, str);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
