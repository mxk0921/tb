package anet.channel.fulltrace;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SceneInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String abTestBucket;
    public long appLaunchTime;
    public int deviceLevel;
    public boolean isUrlLaunch;
    public long lastLaunchTime;
    public String speedBucket;
    public int startType;

    static {
        t2o.a(607125663);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SceneInfo{startType=" + this.startType + ", isUrlLaunch=" + this.isUrlLaunch + ", appLaunchTime=" + this.appLaunchTime + ", lastLaunchTime=" + this.lastLaunchTime + ", deviceLevel=" + this.deviceLevel + ", speedBucket=" + this.speedBucket + ", abTestBucket=" + this.abTestBucket + "}";
    }
}
