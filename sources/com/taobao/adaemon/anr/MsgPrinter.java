package com.taobao.adaemon.anr;

import android.os.Looper;
import android.util.Printer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.anr.MsgPrinter;
import com.taobao.adaemon.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import tb.cp;
import tb.mf;
import tb.oxn;
import tb.s55;
import tb.t2o;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MsgPrinter implements Printer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long MAX_RECORD_TIME = 20000;
    public static final String MSG_END = "<<<<<";
    public static final String MSG_START = ">>>>>";
    private static final String k = "MsgPrinter";

    /* renamed from: a  reason: collision with root package name */
    private volatile Printer f6141a;
    private final b b;
    private final boolean c;
    private volatile String d;
    private final AtomicLong e = new AtomicLong();
    private final LinkedHashMap<Long, a> f = new LinkedHashMap<Long, a>() { // from class: com.taobao.adaemon.anr.MsgPrinter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/anr/MsgPrinter$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Long, a> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (entry.getKey().longValue() < System.currentTimeMillis() - 20000) {
                return true;
            }
            return false;
        }
    };
    public long g;
    public long h;
    public long i;
    public long j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static final String TYPE_AGGREGATE = "Aggregate";
        public static final String TYPE_HUGE = "Huge";
        public static final String TYPE_MODERATE = "Moderate";

        /* renamed from: a  reason: collision with root package name */
        public final String f6142a;
        public final long b;
        public final String c;
        public final long d;

        static {
            t2o.a(349175898);
        }

        public a(String str, long j, String str2, long j2) {
            this.f6142a = str;
            this.b = j;
            this.c = str2;
            this.d = j2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(349175896);
    }

    public MsgPrinter(b bVar) {
        if (bVar != null) {
            this.b = bVar;
            this.c = oxn.s().x();
            return;
        }
        throw new IllegalArgumentException("MsgPrinter's listener is NULL");
    }

    @Override // android.util.Printer
    public void println(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c611640", new Object[]{this, str});
            return;
        }
        if (str.startsWith(MSG_START)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.g = currentTimeMillis;
            if (this.c) {
                long j = this.j;
                if (j > 0 && currentTimeMillis - j > 100) {
                    this.f.put(Long.valueOf(j), new a(a.TYPE_AGGREGATE, this.e.get(), "", this.j - this.i));
                    this.j = 0L;
                    this.i = 0L;
                }
            }
            this.d = str;
            this.e.incrementAndGet();
            ((ANRHacker) this.b).M0(str);
        } else {
            z = false;
        }
        if (this.f6141a != null) {
            this.f6141a.println(str);
        }
        if (!z && str.startsWith(MSG_END)) {
            ((ANRHacker) this.b).L0(str);
            if (this.c) {
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = currentTimeMillis2 - this.g;
                this.h = j2;
                if (j2 >= g.s(false)) {
                    if (this.i > 0) {
                        this.f.put(Long.valueOf(this.j), new a(a.TYPE_AGGREGATE, this.e.get() - 1, "", this.j - this.i));
                        this.j = 0L;
                        this.i = 0L;
                    }
                    this.f.put(Long.valueOf(currentTimeMillis2), new a(a.TYPE_HUGE, this.e.get(), this.d, this.h));
                } else if (this.h >= 50) {
                    if (this.i > 0) {
                        this.f.put(Long.valueOf(this.j), new a(a.TYPE_AGGREGATE, this.e.get() - 1, "", this.j - this.i));
                        this.j = 0L;
                        this.i = 0L;
                    }
                    this.f.put(Long.valueOf(currentTimeMillis2), new a(a.TYPE_MODERATE, this.e.get(), this.d, this.h));
                } else {
                    if (this.i == 0) {
                        this.i = this.g;
                    }
                    this.j = currentTimeMillis2;
                }
            }
            this.d = null;
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7790ecb", new Object[]{this, new Long(j)});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis() - j;
        s55.i(k, "dumpRecentMsg", "durationMills", Long.valueOf(j), "totalSize", Integer.valueOf(this.f.size()));
        mf.l(new Runnable() { // from class: tb.q2j
            @Override // java.lang.Runnable
            public final void run() {
                MsgPrinter.this.c(currentTimeMillis);
            }
        });
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b18e0ce", new Object[]{this});
            return;
        }
        try {
            Looper mainLooper = Looper.getMainLooper();
            Printer y = g.y();
            if (y == null) {
                this.f6141a = null;
                mainLooper.setMessageLogging(this);
                ((ANRHacker) this.b).N0(false);
            } else if (!(y instanceof MsgPrinter)) {
                this.f6141a = y;
                s55.i(k, "setToMainLooper", "mBase", this.f6141a);
                mainLooper.setMessageLogging(this);
                ((ANRHacker) this.b).N0(true);
            } else {
                s55.i(k, "setToMainLooper already", "curX", this.d);
            }
        } catch (Throwable th) {
            s55.h(k, "setToMainLooper err", th, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j) {
        String str = "type";
        int i = 10;
        String str2 = y1r.COL_SEQ;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d0f2fc", new Object[]{this, new Long(j)});
            return;
        }
        Iterator<Map.Entry<Long, a>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, a> next = it.next();
            a value = next.getValue();
            if (next.getKey().longValue() >= j) {
                s55.i(k, "dumpRecentMsg", str, value.f6142a, str2, Long.valueOf(value.b), "cost(ms)", Long.valueOf(value.d), "endTime(ms)", g.f(next.getKey().longValue()), "msg", value.c);
                it = it;
                str = str;
                str2 = str2;
                i = 10;
            } else if (!cp.j()) {
                String str3 = value.f6142a;
                Long valueOf = Long.valueOf(value.b);
                Long valueOf2 = Long.valueOf(value.d);
                String f = g.f(next.getKey().longValue());
                String str4 = value.c;
                Object[] objArr = new Object[i];
                objArr[0] = str;
                objArr[1] = str3;
                objArr[2] = str2;
                objArr[3] = valueOf;
                objArr[4] = "cost(ms)";
                objArr[5] = valueOf2;
                objArr[6] = "endTime(ms)";
                objArr[7] = f;
                objArr[8] = "msg";
                objArr[9] = str4;
                s55.i(k, "dumpRecentMsg skip", objArr);
                str = str;
                str2 = str2;
            }
        }
        String str5 = this.d;
        if (str5 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            s55.i(k, "dumpCurMsg", str2, Long.valueOf(this.e.get()), "cost(ms)", Long.valueOf(currentTimeMillis - this.g), "endTime(ms)", g.f(currentTimeMillis), "msg", str5);
        }
    }
}
