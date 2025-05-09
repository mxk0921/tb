package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class msm extends f6j<PreloadRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262177);
    }

    public msm(PreloadRequestParams preloadRequestParams) {
        super(preloadRequestParams);
    }

    public static /* synthetic */ Object ipc$super(msm msmVar, String str, Object... objArr) {
        if (str.hashCode() == 1379936911) {
            super.a();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/client/PreloadRequestClient");
    }

    @Override // tb.f6j
    public void a() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52402a8f", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.b;
        if (((PreloadRequestParams) this.f19050a).isNavPreload()) {
            handler = u5o.c();
        } else {
            handler = u5o.b();
        }
        remoteBusiness.handler(handler);
        this.b.supportStreamJson(true);
        super.a();
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.taobao.detail.batchgetdetail";
    }

    @Override // tb.f6j
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "1.0";
    }

    @Override // tb.f6j
    public MethodEnum h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this});
        }
        return MethodEnum.POST;
    }
}
