package com.taobao.tao.log.logger;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.logger.SpanLogger;
import tb.e6s;
import tb.j5s;
import tb.mhh;
import tb.o5s;
import tb.odh;
import tb.paq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SpanLogger implements mhh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FIELD_BAGGAGE = "bags";
    private static final String FIELD_FINISH_TIME = "finish";
    private static final String FIELD_LOG_EVENT = "event";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SPAN_ID = "sid";
    private static final String FIELD_START_TIME = "start";
    private static final String FIELD_TAGS = "tags";
    private static final String FIELD_TRACE_ID = "tid";
    private static final String FIELD_TYPE = "type";
    private static final String MODULE = "SpanLog";
    private static final int TYPE_FINISH = 3;
    private static final int TYPE_LOG = 2;
    private static final int TYPE_START = 1;

    static {
        t2o.a(767557675);
        t2o.a(315621377);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$writeLog$1(paq paqVar, String str, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440a4c2a", new Object[]{paqVar, str, logLevel});
            return;
        }
        try {
            write(paqVar, str, logLevel, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$writeStart$0(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7e4fc5", new Object[]{paqVar});
            return;
        }
        try {
            write(paqVar, paqVar.toString(), LogLevel.I, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$writerFinish$2(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7025fc0", new Object[]{paqVar});
            return;
        }
        try {
            write(paqVar, paqVar.toString(), LogLevel.I, 3);
            o5s.n(paqVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void write(paq paqVar, String str, LogLevel logLevel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84555169", new Object[]{paqVar, str, logLevel, new Integer(i)});
        } else {
            TLogNative.writeLog(LogCategory.SpanLog, logLevel, MODULE, String.valueOf(i), str);
        }
    }

    private static void writeLog(final paq paqVar, final String str, final LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5848e0", new Object[]{paqVar, str, logLevel});
        } else if (logLevel != LogLevel.D || j5s.j().u()) {
            e6s.d().e(new Runnable() { // from class: tb.waq
                @Override // java.lang.Runnable
                public final void run() {
                    SpanLogger.lambda$writeLog$1(paq.this, str, logLevel);
                }
            });
        } else {
            String valueOf = String.valueOf(2);
            o5s.m(logLevel, LogCategory.SpanLog, MODULE, valueOf, str);
            odh.a(logLevel, MODULE, valueOf, str);
        }
    }

    private static void writeStart(final paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b32fae", new Object[]{paqVar});
        } else {
            e6s.d().e(new Runnable() { // from class: tb.vaq
                @Override // java.lang.Runnable
                public final void run() {
                    SpanLogger.lambda$writeStart$0(paq.this);
                }
            });
        }
    }

    private static void writerFinish(final paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae14e6b", new Object[]{paqVar});
        } else {
            e6s.d().e(new Runnable() { // from class: tb.xaq
                @Override // java.lang.Runnable
                public final void run() {
                    SpanLogger.lambda$writerFinish$2(paq.this);
                }
            });
        }
    }

    @Override // tb.mhh
    public void debugLog(paq paqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec1ee0a", new Object[]{this, paqVar, str});
        } else {
            writeLog(paqVar, str, LogLevel.D);
        }
    }

    @Override // tb.mhh
    public void finishSpan(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5ad534", new Object[]{this, paqVar});
        } else {
            writerFinish(paqVar);
        }
    }

    @Override // tb.mhh
    public void releaseLog(paq paqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edf36be", new Object[]{this, paqVar, str});
        } else {
            writeLog(paqVar, str, LogLevel.I);
        }
    }

    @Override // tb.mhh
    public void startSpan(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6397245", new Object[]{this, paqVar});
        } else {
            writeStart(paqVar);
        }
    }
}
