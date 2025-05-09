package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p5s implements ync {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBPLogLevel f25895a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$tbuprofen$log$TBPLogLevel;

        static {
            int[] iArr = new int[TBPLogLevel.values().length];
            $SwitchMap$com$taobao$android$tbuprofen$log$TBPLogLevel = iArr;
            try {
                iArr[TBPLogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$log$TBPLogLevel[TBPLogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$log$TBPLogLevel[TBPLogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$log$TBPLogLevel[TBPLogLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$log$TBPLogLevel[TBPLogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(824180791);
        t2o.a(822083587);
    }

    public p5s(TBPLogLevel tBPLogLevel) {
        this.f25895a = tBPLogLevel;
        i(tBPLogLevel);
    }

    public static String h(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13ec6fb0", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.format(str, objArr);
    }

    @Override // tb.ync
    public TBPLogLevel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPLogLevel) ipChange.ipc$dispatch("239825b2", new Object[]{this});
        }
        return this.f25895a;
    }

    @Override // tb.ync
    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0b6e2e", new Object[]{this, str, str2, objArr});
        } else {
            TLog.loge("TBUPROF", str, h(str2, objArr));
        }
    }

    @Override // tb.ync
    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8711bf03", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logd("TBUPROF", str, h(str2, objArr));
        }
    }

    @Override // tb.ync
    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d917bc8", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logi("TBUPROF", str, h(str2, objArr));
        }
    }

    @Override // tb.ync
    public void e(String str, Throwable th, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a486fab", new Object[]{this, str, th, str2, objArr});
        } else {
            TLog.loge("TBUPROF", str, h(str2, objArr), th);
        }
    }

    @Override // tb.ync
    public void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d5274", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logv("TBUPROF", str, h(str2, objArr));
        }
    }

    @Override // tb.ync
    public void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68e041a", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logw("TBUPROF", str, h(str2, objArr));
        }
    }

    public void i(TBPLogLevel tBPLogLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e331796a", new Object[]{this, tBPLogLevel});
            return;
        }
        LogLevel logLevel = LogLevel.E;
        int i = a.$SwitchMap$com$taobao$android$tbuprofen$log$TBPLogLevel[tBPLogLevel.ordinal()];
        if (i == 1) {
            logLevel = LogLevel.V;
        } else if (i == 2) {
            logLevel = LogLevel.D;
        } else if (i == 3) {
            logLevel = LogLevel.I;
        } else if (i == 4) {
            logLevel = LogLevel.W;
        }
        s4s.e().a("TBUPROF", logLevel);
    }
}
