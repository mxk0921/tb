package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TTraceLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jcn implements ncn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jcn instance = new jcn();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21917a;
    public final boolean b;
    public RVLLevel c = RVLLevel.Info;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$riverlogger$RVLLevel;

        static {
            int[] iArr = new int[RVLLevel.values().length];
            $SwitchMap$com$taobao$android$riverlogger$RVLLevel = iArr;
            try {
                iArr[RVLLevel.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$riverlogger$RVLLevel[RVLLevel.Warn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$riverlogger$RVLLevel[RVLLevel.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$riverlogger$RVLLevel[RVLLevel.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(649068549);
        t2o.a(649068555);
    }

    public jcn() {
        boolean z = false;
        try {
            if (TTraceLog.class.getMethod("event", LogLevel.class, String.class, String.class, String.class, String.class, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, String.class, String.class) != null) {
                z = true;
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.f21917a = z;
        this.b = true;
    }

    @Override // tb.ncn
    public void a(kcn kcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed4f4a", new Object[]{this, kcnVar});
        } else if (kcnVar.f22567a.value > this.c.value && !qcn.a()) {
        } else {
            if (this.f21917a && !TextUtils.isEmpty(kcnVar.e)) {
                LogLevel c = c(kcnVar.f22567a);
                String str = kcnVar.c;
                String str2 = kcnVar.d;
                String str3 = kcnVar.b;
                TTraceLog.event(c, str, str2, str3, str3, kcnVar.h, kcnVar.e, kcnVar.f, kcnVar.g, 0, qcn.RVLModuleName, kcnVar.i);
            } else if (this.b) {
                int i = a.$SwitchMap$com$taobao$android$riverlogger$RVLLevel[kcnVar.f22567a.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    String str4 = kcnVar.b;
                    TLog.loge(str4, str4, kcnVar.a());
                } else if (i != 4) {
                    String str5 = kcnVar.b;
                    TLog.logv(str5, str5, kcnVar.a());
                } else {
                    String str6 = kcnVar.b;
                    TLog.logd(str6, str6, kcnVar.a());
                }
            } else if (qcn.a()) {
                int i2 = a.$SwitchMap$com$taobao$android$riverlogger$RVLLevel[kcnVar.f22567a.ordinal()];
                if (i2 == 1) {
                    Log.e(kcnVar.b, kcnVar.a());
                } else if (i2 == 2) {
                    kcnVar.a();
                } else if (i2 == 3) {
                    kcnVar.a();
                } else if (i2 != 4) {
                    kcnVar.a();
                } else {
                    kcnVar.a();
                }
            }
        }
    }

    @Override // tb.ncn
    public RVLLevel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("3939f356", new Object[]{this});
        }
        return this.c;
    }

    public final LogLevel c(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("ef747ac0", new Object[]{this, rVLLevel});
        }
        int i = a.$SwitchMap$com$taobao$android$riverlogger$RVLLevel[rVLLevel.ordinal()];
        if (i == 1) {
            return LogLevel.E;
        }
        if (i == 2) {
            return LogLevel.W;
        }
        if (i == 3) {
            return LogLevel.I;
        }
        if (i != 4) {
            return LogLevel.V;
        }
        return LogLevel.D;
    }

    public void d(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b3b1b6", new Object[]{this, rVLLevel});
            return;
        }
        this.c = rVLLevel;
        lcn.i();
    }
}
