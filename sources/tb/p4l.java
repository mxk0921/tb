package tb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.request.callback.RedPacketRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.RedPacketRequestParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p4l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openRedPacket";

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f25876a;

    static {
        t2o.a(912261907);
        t2o.a(912261826);
    }

    public p4l(Context context, ze7 ze7Var) {
        if (context instanceof FragmentActivity) {
            this.f25876a = (FragmentActivity) context;
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        if (!hjh.c()) {
            hjh.d(true);
            return true;
        }
        RedPacketRequestParams redPacketRequestParams = new RedPacketRequestParams(irVar.a());
        ktn ktnVar = new ktn(redPacketRequestParams);
        ktnVar.q(new RedPacketRequestCallback(this.f25876a, redPacketRequestParams));
        ktnVar.c();
        return true;
    }
}
