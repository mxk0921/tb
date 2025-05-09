package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.egq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class h7j implements nnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, cfq> f20453a = new ConcurrentHashMap<>();

    public final cfq a(bgq bgqVar, mnf mnfVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("cc087a8b", new Object[]{this, bgqVar, mnfVar, handler});
        }
        cfq f = cfq.f(Mtop.instance(Mtop.Id.SSR, (Context) null), bgqVar);
        String str = bgqVar.f16375a;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String query = parse.getQuery();
            if (!TextUtils.isEmpty(query)) {
                if (query.contains("x-sec=wua")) {
                    f.z();
                }
                String queryParameter = parse.getQueryParameter("x-login");
                if (!TextUtils.isEmpty(queryParameter)) {
                    f.v(queryParameter);
                }
            }
        }
        if (handler != null) {
            f.s(handler);
        }
        f.t(bgqVar.c);
        f.d(mnfVar);
        return f;
    }

    @Override // tb.nnf
    public boolean asyncSend(bgq bgqVar, mnf mnfVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac8307d5", new Object[]{this, bgqVar, mnfVar, handler})).booleanValue();
        }
        if (mnfVar == null || bgqVar == null || TextUtils.isEmpty(bgqVar.f16375a)) {
            TBSdkLog.e("ssr.MtopSsrService", "illegal param.");
            return false;
        } else if (!jfq.a(bgqVar.f16375a)) {
            TBSdkLog.e("ssr.MtopSsrService", "url invalidate.");
            lfq.c(bgqVar, mnfVar, handler, new egq.b().b(417).e("SSRE_URL_NOT_SUPPORT").d("URL不支持").a());
            return false;
        } else {
            cfq a2 = a(bgqVar, mnfVar, handler);
            this.f20453a.put(bgqVar.f16375a, a2);
            a2.x(this.f20453a);
            a2.y();
            a2.j();
            return true;
        }
    }

    @Override // tb.nnf
    public boolean cancel(bgq bgqVar) {
        cfq remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("801a6ac3", new Object[]{this, bgqVar})).booleanValue();
        }
        if (bgqVar != null && !TextUtils.isEmpty(bgqVar.f16375a) && (remove = this.f20453a.remove(bgqVar.f16375a)) != null && !remove.u()) {
            remove.h();
        }
        return false;
    }
}
