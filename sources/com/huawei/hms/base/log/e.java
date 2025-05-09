package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.text.SimpleDateFormat;
import java.util.Locale;
import tb.f7l;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class e {
    private String b;
    private String c;
    private int d;
    private String g;
    private int h;
    private int i;
    private int j;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f5286a = new StringBuilder();
    private long e = 0;
    private long f = 0;

    public e(int i, String str, int i2, String str2) {
        this.c = "HMS";
        this.j = i;
        this.b = str;
        this.d = i2;
        if (str2 != null) {
            this.c = str2;
        }
        b();
    }

    public static String a(int i) {
        if (i == 3) {
            return TLogTracker.LEVEL_DEBUG;
        }
        if (i == 4) {
            return TLogTracker.LEVEL_INFO;
        }
        if (i == 5) {
            return "W";
        }
        if (i != 6) {
            return String.valueOf(i);
        }
        return "E";
    }

    private e b() {
        this.e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f = currentThread.getId();
        this.h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.j;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.g = stackTraceElement.getFileName();
            this.i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        a(sb);
        return sb.toString();
    }

    public <T> e a(T t) {
        this.f5286a.append(t);
        return this;
    }

    public e a(Throwable th) {
        a((e) '\n').a((e) Log.getStackTraceString(th));
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    private StringBuilder b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.e)));
        String a2 = a(this.d);
        sb.append(' ');
        sb.append(a2);
        sb.append(wh6.DIR);
        sb.append(this.c);
        sb.append(wh6.DIR);
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.h);
        sb.append(f7l.CONDITION_IF_MIDDLE);
        sb.append(this.f);
        sb.append(' ');
        sb.append(this.g);
        sb.append(f7l.CONDITION_IF_MIDDLE);
        sb.append(this.i);
        sb.append(']');
        return sb;
    }

    private StringBuilder a(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f5286a.toString());
        return sb;
    }
}
