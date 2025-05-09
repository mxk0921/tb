package com.uc.webview.base.timing;

import android.text.TextUtils;
import com.uc.webview.base.timing.StartupTimingKeys;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TraceEvent implements AutoCloseable {
    private static final boolean STAT = a.f14293a;
    private static final boolean TRACE = a.b;
    private final int mKey;
    private final String mName;

    public TraceEvent(int i, String str) {
        this.mKey = i;
        this.mName = str;
        if (TRACE) {
            doTrace(true);
        }
        if (STAT) {
            doStat(true);
        }
    }

    private void doStat(boolean z) {
        if (!STAT || -1 == this.mKey) {
            return;
        }
        if (z) {
            a.b().markBegin(this.mKey);
        } else {
            a.b().markEnd(this.mKey);
        }
    }

    private void doTrace(boolean z) {
        if (!TRACE || TextUtils.isEmpty(this.mName)) {
            return;
        }
        if (z) {
            a.a(this.mName);
        } else {
            a.a();
        }
    }

    public static TraceEvent scoped(int i) {
        if (!STAT) {
            return null;
        }
        return new TraceEvent(i, StartupTimingKeys.Helper.desc(i));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (TRACE) {
            doTrace(false);
        }
        if (STAT) {
            doStat(false);
        }
    }

    public static TraceEvent scoped(int i, boolean z) {
        if (STAT && z) {
            return scoped(i);
        }
        return null;
    }

    public static TraceEvent scoped(String str) {
        if (!TRACE) {
            return null;
        }
        return new TraceEvent(-1, str);
    }
}
