package tb;

import android.content.Context;
import com.alipay.security.mobile.module.http.UploadFactory;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile pdy f26037a;

    public static int a(Context context, rdy rdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17e432d", new Object[]{context, rdyVar})).intValue();
        }
        try {
            ReportPbRequest reportPbRequest = new ReportPbRequest();
            reportPbRequest.biz = rdyVar.f27307a;
            reportPbRequest.scene = rdyVar.b;
            reportPbRequest.appName = rdyVar.c;
            reportPbRequest.appVersion = rdyVar.d;
            reportPbRequest.sdkVersion = rdyVar.e;
            reportPbRequest.os = rdyVar.f;
            reportPbRequest.brand = rdyVar.g;
            reportPbRequest.model = rdyVar.h;
            reportPbRequest.apdidToken = rdyVar.i;
            reportPbRequest.apdid = rdyVar.j;
            reportPbRequest.tid = rdyVar.k;
            reportPbRequest.lbs = rdyVar.l;
            reportPbRequest.behavior = null;
            reportPbRequest.edgeRisk = null;
            reportPbRequest.extData = null;
            return UploadFactory.createV2(context, pyx.a().b()).uploadRiskData(reportPbRequest);
        } catch (Throwable th) {
            th.printStackTrace();
            return 404;
        }
    }

    public static synchronized pdy b() {
        synchronized (pdy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pdy) ipChange.ipc$dispatch("554b5a13", new Object[0]);
            }
            if (f26037a == null) {
                f26037a = new pdy();
            }
            return f26037a;
        }
    }
}
