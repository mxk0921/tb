package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "PublicErrorStatistic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PublicErrorStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String errorMsg;
    @Dimension
    public volatile String errorStackTrace;
    @Dimension
    public volatile int ret;
    @Dimension
    public volatile String scene;
    @Dimension
    public volatile String startStackTrace;
    @Dimension
    public volatile String url;
    @Measure
    public volatile long v1;
    @Measure
    public volatile long v2;

    static {
        t2o.a(607125783);
    }

    public PublicErrorStatistic(String str) {
        this.errorMsg = "";
        this.errorStackTrace = "";
        this.startStackTrace = "";
        this.url = "";
        this.ret = -1;
        this.v1 = -1L;
        this.v2 = -1L;
        this.scene = str;
    }

    public static /* synthetic */ Object ipc$super(PublicErrorStatistic publicErrorStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/PublicErrorStatistic");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[PublicErrorStatistic] scene=");
        sb.append(this.scene);
        sb.append(",errorMsg=");
        sb.append(this.errorMsg);
        sb.append(",errorStackTrace=");
        sb.append(this.errorStackTrace);
        sb.append(",startStackTrace=");
        sb.append(this.startStackTrace);
        sb.append(",url=");
        sb.append(this.url);
        return sb.toString();
    }

    public PublicErrorStatistic(String str, String str2, String str3, String str4, long j, long j2) {
        this.errorMsg = "";
        this.errorStackTrace = "";
        this.startStackTrace = "";
        this.url = "";
        this.ret = -1;
        this.v1 = -1L;
        this.v2 = -1L;
        this.scene = str;
        this.url = str2;
        this.errorStackTrace = str3;
        this.startStackTrace = str4;
        this.v1 = j;
        this.v2 = j2;
    }
}
