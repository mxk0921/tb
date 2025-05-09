package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299735);
    }

    public static k7j a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k7j) ipChange.ipc$dispatch("a4968a8b", new Object[]{mtopResponse});
        }
        k7j k7jVar = new k7j();
        if (mtopResponse == null) {
            return k7jVar;
        }
        k7jVar.f25875a = mtopResponse.getHeaderFields();
        k7jVar.b = mtopResponse.getRetCode();
        k7jVar.c = mtopResponse.getRetMsg();
        k7jVar.e = mtopResponse.mappingCode;
        k7jVar.f = mtopResponse.getResponseCode();
        jpq streamModeData = mtopResponse.getStreamModeData();
        if (streamModeData != null) {
            k7jVar.d = streamModeData.b;
        }
        mtopResponse.getMtopStat();
        return k7jVar;
    }

    public static l7j b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l7j) ipChange.ipc$dispatch("83269421", new Object[]{mtopResponse});
        }
        l7j l7jVar = new l7j();
        if (mtopResponse == null) {
            return l7jVar;
        }
        l7jVar.f25875a = mtopResponse.getHeaderFields();
        l7jVar.b = mtopResponse.getRetCode();
        l7jVar.c = "SUCCESS";
        l7jVar.e = mtopResponse.mappingCode;
        l7jVar.f = mtopResponse.getResponseCode();
        jpq streamModeData = mtopResponse.getStreamModeData();
        if (streamModeData != null) {
            l7jVar.d = streamModeData.b;
        }
        mtopResponse.getMtopStat();
        return l7jVar;
    }

    public static m7j c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7j) ipChange.ipc$dispatch("bdd2e6ad", new Object[]{mtopResponse});
        }
        m7j m7jVar = new m7j();
        if (mtopResponse == null) {
            return m7jVar;
        }
        m7jVar.i = mtopResponse.getOriginFastJsonObject();
        m7jVar.c = mtopResponse.getApi();
        m7jVar.d = mtopResponse.getV();
        m7jVar.e = mtopResponse.getBytedata();
        m7jVar.b = mtopResponse.getRetMsg();
        m7jVar.f23820a = mtopResponse.getRetCode();
        m7jVar.g = mtopResponse.getHeaderFields();
        m7jVar.h = mtopResponse.getRet();
        jpq streamModeData = mtopResponse.getStreamModeData();
        if (streamModeData != null) {
            m7jVar.f = streamModeData.c;
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            m7jVar.j = mtopStat.falcoId;
        }
        return m7jVar;
    }
}
