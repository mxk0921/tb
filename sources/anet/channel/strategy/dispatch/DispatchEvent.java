package anet.channel.strategy.dispatch;

import anet.channel.statist.AmdcStatistic;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DispatchEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DNSFAIL = 0;
    public static final int DNSSUCCESS = 1;
    public String accessPoint = BuildConfig.RPC_TYPE_DEF;
    public AmdcStatistic amdcStatistic;
    public final int eventType;
    public final Object extraObject;

    static {
        t2o.a(607125903);
    }

    public DispatchEvent(int i, Object obj, AmdcStatistic amdcStatistic) {
        this.eventType = i;
        this.extraObject = obj;
        this.amdcStatistic = amdcStatistic;
    }

    public synchronized void setAccessPoint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00d4fdb", new Object[]{this, str});
            return;
        }
        if (str != null && !"".equalsIgnoreCase(str) && !str.isEmpty()) {
            this.accessPoint = str;
        }
    }
}
