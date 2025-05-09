package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.ReportErrorParams;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class j2o extends f6j<ReportErrorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262180);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2o(ReportErrorParams reportErrorParams) {
        super(reportErrorParams);
        ckf.h(reportErrorParams, "params");
    }

    public static /* synthetic */ Object ipc$super(j2o j2oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/client/ReportErrorClient");
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.taobao.detail.event.report";
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
