package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "ZstdErrorStatistic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ZstdErrorStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String errorCode;
    @Dimension
    public volatile String host;
    @Measure
    public volatile int isSuccess = 0;
    @Measure
    public volatile int isZstdNotReadyUse = 0;
    @Dimension
    public volatile String scene;
    @Dimension
    public volatile String url;

    static {
        t2o.a(607125803);
    }

    public ZstdErrorStatistic(String str, String str2, String str3) {
        this.url = str2;
        this.host = str;
        this.scene = str3;
    }

    public static /* synthetic */ Object ipc$super(ZstdErrorStatistic zstdErrorStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/ZstdErrorStatistic");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[ZstdErrorStatistic] scene=");
        sb.append(this.scene);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",url=");
        sb.append(this.url);
        sb.append(",errorCode=");
        sb.append(this.errorCode);
        sb.append(",isSuccess=");
        sb.append(this.isSuccess);
        sb.append(",isZstdNotReadyUse=");
        sb.append(this.isZstdNotReadyUse);
        return sb.toString();
    }
}
