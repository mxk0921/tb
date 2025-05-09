package tb;

import com.alibaba.ability.impl.mtop.MtopAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n59 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24523a;
    public final String b;
    public final String c;
    public final String d;

    static {
        t2o.a(745537923);
    }

    public n59(String str, String str2, String str3, String str4) {
        ckf.h(str, "apiMethod");
        ckf.h(str2, "apiVersion");
        ckf.h(str4, MtopAbility.API_REQUEST_DATA);
        this.f24523a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62c9e41", new Object[]{this});
            return;
        }
        MtopResponse c = c();
        if ((c != null ? c.getBytedata() : null) != null) {
            byte[] bytedata = c.getBytedata();
            ckf.c(bytedata, "mtopResponse.bytedata");
            String str = new String(bytedata, uj3.UTF_8);
            b(str);
            TLog.loge("我淘二屏数据层", "预请求next完成");
            BasementFeedDataProvider.INSTANCE.w(str);
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b753fa32", new Object[]{this, str});
        } else {
            lgj.e(BasementFeedDataProvider.DB_KEY_FEED_DATA, str);
        }
    }

    public final MtopResponse c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("d64bdac3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(this.f24523a);
        mtopRequest.setVersion(this.b);
        mtopRequest.setData(this.d);
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        String str = this.c;
        if (str != null) {
            build.setUnitStrategy(str);
        }
        build.reqMethod(MethodEnum.POST);
        try {
            return build.syncRequest();
        } catch (Throwable unused) {
            return null;
        }
    }
}
