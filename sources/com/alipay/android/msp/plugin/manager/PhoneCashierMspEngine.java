package com.alipay.android.msp.plugin.manager;

import com.alipay.android.msp.framework.assist.MspBaseImpl;
import com.alipay.android.msp.framework.assist.MspBizImpl;
import com.alipay.android.msp.framework.assist.MspJumpImpl;
import com.alipay.android.msp.framework.assist.MspLogImpl;
import com.alipay.android.msp.framework.assist.MspOcrImpl;
import com.alipay.android.msp.framework.assist.MspViSecImpl;
import com.alipay.android.msp.framework.assist.MspWalletImpl;
import com.alipay.android.msp.framework.dataplatform.DataCollector;
import com.alipay.android.msp.framework.section.MqpBizSectionWorker;
import com.alipay.android.msp.plugin.engine.IBaseEngine;
import com.alipay.android.msp.plugin.engine.IBizEngine;
import com.alipay.android.msp.plugin.engine.IDataCollectorEngine;
import com.alipay.android.msp.plugin.engine.IJumpEngine;
import com.alipay.android.msp.plugin.engine.ILogEngine;
import com.alipay.android.msp.plugin.engine.IMqpBizSectionEngine;
import com.alipay.android.msp.plugin.engine.IOcrEngine;
import com.alipay.android.msp.plugin.engine.IViSecEngine;
import com.alipay.android.msp.plugin.engine.IWalletEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PhoneCashierMspEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile IBizEngine f3722a;
    public static volatile IBaseEngine b;
    public static volatile IJumpEngine c;
    public static volatile ILogEngine d;
    public static volatile IOcrEngine e;
    public static volatile IViSecEngine f;
    public static volatile IWalletEngine g;
    public static volatile IDataCollectorEngine h;
    public static volatile IMqpBizSectionEngine i;

    public static IDataCollectorEngine getDataCollectorEngine() {
        if (h == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (h == null) {
                        h = (IDataCollectorEngine) DataCollector.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public static IMqpBizSectionEngine getMqpBizSectionEngine() {
        if (i == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (i == null) {
                        i = (IMqpBizSectionEngine) MqpBizSectionWorker.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public static IBaseEngine getMspBase() {
        if (b == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (b == null) {
                        b = (IBaseEngine) MspBaseImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static IJumpEngine getMspJump() {
        if (c == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (c == null) {
                        c = (IJumpEngine) MspJumpImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static ILogEngine getMspLog() {
        if (d == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (d == null) {
                        d = (ILogEngine) MspLogImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static IOcrEngine getMspOcr() {
        if (e == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (e == null) {
                        e = (IOcrEngine) MspOcrImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static IBizEngine getMspUtils() {
        if (f3722a == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (f3722a == null) {
                        f3722a = (IBizEngine) MspBizImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3722a;
    }

    public static IViSecEngine getMspViSec() {
        if (f == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (f == null) {
                        f = (IViSecEngine) MspViSecImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static IWalletEngine getMspWallet() {
        if (g == null) {
            synchronized (PhoneCashierMspEngine.class) {
                try {
                    if (g == null) {
                        IpChange ipChange = MspWalletImpl.$ipChange;
                        g = (IWalletEngine) MspWalletImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }
}
