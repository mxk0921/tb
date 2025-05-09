package com.taobao.weex.utils;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.weex.utils.WXLogUtils;
import tb.s4s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXTLogImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WXLogUtils.LogWatcher f14151a;
    public static final int b = Process.myPid();

    static {
        t2o.a(773849136);
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return b;
    }

    public static void initWXLogWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6630b0", new Object[0]);
            return;
        }
        try {
            if (f14151a == null) {
                f14151a = new LogWatcherImpl();
            }
            WXLogUtils.setLogWatcher(f14151a);
            s4s.e().a("weex", LogLevel.D);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LogWatcherImpl implements WXLogUtils.LogWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(773849138);
            t2o.a(985661822);
        }

        public LogWatcherImpl() {
        }

        @Override // com.taobao.weex.utils.WXLogUtils.LogWatcher
        public void onLog(String str, String str2, String str3) {
            char c = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b7cbfca", new Object[]{this, str, str2, str3});
                return;
            }
            try {
                if (WXTLogImpl.access$100() == Process.myPid()) {
                    switch (str.hashCode()) {
                        case 118057:
                            if (str.equals("wtf")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3237038:
                            if (str.equals("info")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 3641990:
                            if (str.equals("warn")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 95458899:
                            if (str.equals("debug")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 96784904:
                            if (str.equals("error")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 351107458:
                            if (str.equals("verbose")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0 || c == 1) {
                        TLog.logi("weex", str2, str3);
                    } else if (c == 2) {
                        TLog.logv("weex", str2, str3);
                    } else if (c != 3) {
                        if (c == 4 || c == 5) {
                            TLog.loge("weex", str2, str3);
                        }
                        TLog.logi("weex", str2 + "-" + str, str3);
                    } else {
                        TLog.logw("weex", str2, str3);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
