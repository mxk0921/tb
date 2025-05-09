package anet.channel.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IStrategyInstance instance = null;

    static {
        t2o.a(607125848);
    }

    private StrategyCenter() {
    }

    public static IStrategyInstance getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStrategyInstance) ipChange.ipc$dispatch("e1b855ef", new Object[0]);
        }
        if (instance == null) {
            synchronized (StrategyCenter.class) {
                try {
                    if (instance == null) {
                        instance = new StrategyInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public static void setInstance(IStrategyInstance iStrategyInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b1be0f", new Object[]{iStrategyInstance});
        } else {
            instance = iStrategyInstance;
        }
    }
}
