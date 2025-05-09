package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.protocol.converter.INetworkConverter;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class jtj implements yib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final INetworkConverter f22201a;

    static {
        t2o.a(589299824);
        t2o.a(589299813);
    }

    public jtj(INetworkConverter iNetworkConverter) {
        this.f22201a = iNetworkConverter;
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        h3o convert = this.f22201a.convert(w4jVar);
        MtopStatistics mtopStatistics = w4jVar.g;
        convert.t = mtopStatistics.falcoId;
        convert.u = mtopStatistics.openTraceContext;
        String launchInfoValue = mtopStatistics.launchInfoValue();
        if (!TextUtils.isEmpty(launchInfoValue)) {
            convert.c.put(HttpHeaderConstant.LAUNCH_INFO_KEY, launchInfoValue);
        }
        w4jVar.k = convert;
        w4jVar.g.url = convert.f20395a;
        return "CONTINUE";
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.NetworkConvertBeforeFilter";
    }
}
