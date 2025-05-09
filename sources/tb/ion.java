package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.RecommendRequestParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ion extends f6j<RecommendRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262178);
    }

    public ion(RecommendRequestParams recommendRequestParams) {
        super(recommendRequestParams);
    }

    public static /* synthetic */ Object ipc$super(ion ionVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/client/RecommendRequestClient");
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.taobao.regera.page.render.it";
    }

    @Override // tb.f6j
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "1.0";
    }
}
