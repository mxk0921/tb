package tb;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r4l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openShare";
    public static final String EVENT_TYPE_ALTERNATIVE = "share";

    /* renamed from: a  reason: collision with root package name */
    public final Context f27097a;

    static {
        t2o.a(912261908);
        t2o.a(912261826);
    }

    public r4l(Context context, ze7 ze7Var) {
        this.f27097a = context;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        Toast.makeText(this.f27097a, "please implement share", 0).show();
        return true;
    }
}
