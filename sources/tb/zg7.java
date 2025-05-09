package tb;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zg7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtopBusiness f32753a;

    static {
        t2o.a(352321806);
    }

    public zg7(Context context, ezb ezbVar, String str, boolean z) {
        if (context != null && ezbVar != null) {
            MtopBusiness bizTopic = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), ezbVar.getMtopRequest()).setBizTopic(str);
            this.f32753a = bizTopic;
            bizTopic.reqMethod(MethodEnum.POST);
            bizTopic.setUnitStrategy(ezbVar.getUnitStrategy());
            HashMap hashMap = new HashMap();
            hashMap.put("asac", k1k.ASAC_VALUE);
            bizTopic.headers((Map<String, String>) hashMap);
            bizTopic.supportZstdDictionary(z);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a20bc", new Object[]{this});
            return;
        }
        MtopBusiness mtopBusiness = this.f32753a;
        if (mtopBusiness != null) {
            mtopBusiness.cancelRequest();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48bb980", new Object[]{this})).booleanValue();
        }
        if (this.f32753a == null) {
            return false;
        }
        o2r.a("mMtopBusiness.startRequest");
        this.f32753a.startRequest();
        o2r.b();
        return true;
    }

    public void c(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88040381", new Object[]{this, handler});
        } else if (handler != null) {
            this.f32753a.handler(handler);
        }
    }

    public void d(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de537318", new Object[]{this, iRemoteBaseListener});
            return;
        }
        MtopBusiness mtopBusiness = this.f32753a;
        if (mtopBusiness != null) {
            mtopBusiness.registerListener((IRemoteListener) iRemoteBaseListener);
        }
    }
}
