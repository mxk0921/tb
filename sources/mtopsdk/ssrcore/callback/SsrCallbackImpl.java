package mtopsdk.ssrcore.callback;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import tb.bgq;
import tb.cfq;
import tb.egq;
import tb.i7j;
import tb.mfq;
import tb.nfq;
import tb.ofq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SsrCallbackImpl implements SsrCallbackListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ssr.SsrCallbackImpl";
    public cfq ssrBusiness;

    public SsrCallbackImpl(cfq cfqVar) {
        this.ssrBusiness = cfqVar;
    }

    private void commitFullTrace(SsrFinishEvent ssrFinishEvent, String str) {
        i7j i7jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59c7001", new Object[]{this, ssrFinishEvent, str});
        } else if (ssrFinishEvent != null) {
            try {
                if (ssrFinishEvent.getSsrResponse() != null && (i7jVar = ssrFinishEvent.statistics) != null) {
                    i7jVar.w = true;
                    mfq.j(i7jVar);
                    mfq.i(i7jVar);
                    i7jVar.b();
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, str, "commitFullTrace error.", th);
            }
        }
    }

    @Override // mtopsdk.ssrcore.callback.SsrCallbackListener
    public void onFinish(SsrFinishEvent ssrFinishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab39d204", new Object[]{this, ssrFinishEvent});
            return;
        }
        String r = this.ssrBusiness.r();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, r, "SSR onFinish received.");
        }
        if (this.ssrBusiness.u()) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e(TAG, r, "The request of SsrBusiness is canceled.");
            }
            commitFullTrace(ssrFinishEvent, r);
        }
        if (ssrFinishEvent == null) {
            TBSdkLog.e(TAG, r, "SsrCallbackImpl is null.");
            return;
        }
        egq ssrResponse = ssrFinishEvent.getSsrResponse();
        if (ssrResponse == null) {
            TBSdkLog.e(TAG, r, "The SsrResponse of SsrFinishEvent is null.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ofq a2 = nfq.a(ssrFinishEvent, this.ssrBusiness);
        a2.c = ssrResponse;
        i7j i7jVar = ssrFinishEvent.statistics;
        if (i7jVar != null) {
            i7j.c i = i7jVar.i();
            i.f21144a = currentTimeMillis - this.ssrBusiness.i;
            i.b = i7jVar.d() - i7jVar.D;
        }
        if (this.ssrBusiness.b.handler != null) {
            if (i7jVar != null) {
                mfq.j(i7jVar);
            }
            a2.b.l(a2.c);
            if (i7jVar != null) {
                mfq.i(i7jVar);
                i7jVar.b();
                i7jVar.c(true);
                return;
            }
            return;
        }
        if (i7jVar != null) {
            mfq.h(i7jVar);
        }
        nfq.d().obtainMessage(2, a2).sendToTarget();
    }

    @Override // mtopsdk.ssrcore.callback.SsrCallbackListener
    public void onReceiveData(bgq bgqVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150b5e1a", new Object[]{this, bgqVar, bArr});
            return;
        }
        String r = this.ssrBusiness.r();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, r, "SSR onReceiveData  received.");
        }
        cfq cfqVar = this.ssrBusiness;
        if (cfqVar.b.handler != null) {
            cfqVar.m(bgqVar, bArr);
        } else {
            nfq.d().obtainMessage(1, nfq.c(cfqVar, bgqVar, bArr)).sendToTarget();
        }
    }

    @Override // mtopsdk.ssrcore.callback.SsrCallbackListener
    public void onResponse(bgq bgqVar, int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e09d3a7", new Object[]{this, bgqVar, new Integer(i), map});
            return;
        }
        String r = this.ssrBusiness.r();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, r, "SSR onResponse  received.");
        }
        cfq cfqVar = this.ssrBusiness;
        if (cfqVar.b.handler != null) {
            cfqVar.n(bgqVar, i, map);
        } else {
            nfq.d().obtainMessage(0, nfq.b(cfqVar, bgqVar, i, map)).sendToTarget();
        }
    }
}
