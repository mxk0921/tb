package tb;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import anetwork.channel.statist.StatisticData;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.NetError;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.android.searchbaseframe.net.ResultException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q7b implements qrj<r7b, nsj> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yko f26560a;

    static {
        t2o.a(993001902);
        t2o.a(993001891);
    }

    public q7b(yko ykoVar) {
        this.f26560a = ykoVar;
    }

    @Override // tb.qrj
    public JSONObject a(JSONObject jSONObject) throws ResultException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("edc8ea4a", new Object[]{this, jSONObject});
        }
        return jSONObject;
    }

    public final RequestStats d(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestStats) ipChange.ipc$dispatch("bd85083b", new Object[]{this, response});
        }
        RequestStats requestStats = new RequestStats();
        if (response.getStatisticData() != null) {
            StatisticData statisticData = response.getStatisticData();
            requestStats.oneWayTime = statisticData.oneWayTime_ANet;
            requestStats.serverRt = statisticData.serverRT;
            requestStats.recvDataSize = statisticData.totalSize;
            requestStats.recvDataTime = statisticData.recDataTime;
            requestStats.retryTimes = statisticData.retryTime;
            requestStats.sendDataSize = statisticData.sendSize;
        }
        return requestStats;
    }

    /* renamed from: e */
    public nsj b(r7b r7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsj) ipChange.ipc$dispatch("2f859c9f", new Object[]{this, r7bVar});
        }
        return c(r7bVar, null);
    }

    /* renamed from: f */
    public nsj c(r7b r7bVar, fsj fsjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsj) ipChange.ipc$dispatch("70b50720", new Object[]{this, r7bVar, fsjVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        nsj nsjVar = new nsj();
        try {
            HttpNetwork httpNetwork = new HttpNetwork(j3p.f());
            RequestImpl requestImpl = new RequestImpl((String) r7bVar.f16602a);
            if (fsjVar != null) {
                ((xno) fsjVar).i(requestImpl);
            }
            if (this.f26560a.g().b() != -1) {
                requestImpl.setBizId(this.f26560a.g().b());
            }
            this.f26560a.f().j().getClass();
            requestImpl.setConnectTimeout(20000);
            this.f26560a.f().j().getClass();
            requestImpl.setReadTimeout(20000);
            requestImpl.setRetryTime(0);
            if (TextUtils.equals(null, "POST")) {
                requestImpl.setMethod("POST");
                requestImpl.setParams(f8b.a((Map) r7bVar.b));
            }
            Response syncSend = httpNetwork.syncSend(requestImpl, null);
            nsjVar.l(d(syncSend));
            nsjVar.m(syncSend.getConnHeadFields());
            int statusCode = syncSend.getStatusCode();
            if (statusCode <= 0) {
                nsjVar.j(new NetError(6, "" + statusCode + " : " + syncSend.getDesc()));
            } else {
                nsjVar.i(syncSend.getBytedata());
            }
        } catch (Exception e) {
            nsjVar.j(new NetError(0, "request exception", e));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            c4p l = this.f26560a.l();
            l.b("HttpNetAdapter", "http request <" + ((String) r7bVar.f16602a) + "> time:" + (currentTimeMillis2 - currentTimeMillis));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return nsjVar;
    }
}
