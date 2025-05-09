package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fhf extends ub5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092682);
    }

    public static /* synthetic */ Object ipc$super(fhf fhfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/interactive/InteractiveDxAdapter");
    }

    @Override // tb.ub5
    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        return axa.f().a(context, str);
    }

    @Override // tb.ub5
    public void e(DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbf92c8", new Object[]{this, dXRootView, jSONObject, str});
        } else {
            axa.f().h(dXRootView, jSONObject, null);
        }
    }
}
