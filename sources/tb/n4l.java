package tb;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n4l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_COMMENT_FRAGMENT_TAG = "DetailCommentFragment";
    public static final String EVENT_TYPE = "openRate";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_rate";

    /* renamed from: a  reason: collision with root package name */
    public final Context f24509a;

    static {
        t2o.a(912261906);
        t2o.a(912261826);
    }

    public n4l(Context context, ze7 ze7Var) {
        this.f24509a = context;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        Toast.makeText(this.f24509a, "please implement rate", 0).show();
        return true;
    }
}
