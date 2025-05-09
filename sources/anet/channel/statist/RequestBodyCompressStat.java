package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "request_body_compress_stat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RequestBodyCompressStat extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Measure
    public volatile long bodyByteTime;
    @Dimension
    public int deflateRet;
    @Measure
    public volatile long deflateSize;
    @Measure
    public long deflateTime;
    @Dimension
    public String deflateType;
    @Dimension
    public String host;
    @Measure
    public volatile long inflateSize;
    @Dimension
    public boolean isUplinkEncodeUpdateOpened;
    @Dimension
    public String url;

    static {
        t2o.a(607125785);
    }

    public RequestBodyCompressStat(String str, String str2, int i, String str3, long j, long j2, long j3, long j4, boolean z) {
        this.isUplinkEncodeUpdateOpened = false;
        this.host = str;
        this.url = str2;
        this.deflateRet = i;
        this.deflateType = str3;
        this.deflateTime = j;
        this.inflateSize = j3;
        this.deflateSize = j4;
        this.bodyByteTime = j2;
        this.isUplinkEncodeUpdateOpened = z;
    }

    public static /* synthetic */ Object ipc$super(RequestBodyCompressStat requestBodyCompressStat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/RequestBodyCompressStat");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[RequestBodyCompressStat] deflateRet=");
        sb.append(this.deflateRet);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",deflateType=");
        sb.append(this.deflateType);
        sb.append(",uplinkUpdateOpened=");
        sb.append(this.isUplinkEncodeUpdateOpened);
        sb.append(",deflateTime=");
        sb.append(this.deflateTime);
        sb.append(",bodyByteTime=");
        sb.append(this.bodyByteTime);
        sb.append(",inflateSize=");
        sb.append(this.inflateSize);
        sb.append(",deflateSize=");
        sb.append(this.deflateSize);
        sb.append(",url=");
        sb.append(this.url);
        return sb.toString();
    }
}
