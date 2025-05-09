package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.RedPacketRequestParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ktn extends f6j<RedPacketRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262179);
    }

    public ktn(RedPacketRequestParams redPacketRequestParams) {
        super(redPacketRequestParams);
    }

    public static /* synthetic */ Object ipc$super(ktn ktnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/client/RedPacketRequestClient");
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.taobao.pagani.api.freshman.hongbao.get";
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
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daa8ec1e", new Object[]{this});
        }
        return ((RedPacketRequestParams) this.f19050a).toData();
    }

    @Override // tb.f6j
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return "";
    }
}
