package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e0b extends nv1 implements r9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782816);
        t2o.a(488636425);
    }

    public e0b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(e0b e0bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomeGlobalBgCallback");
    }

    @Override // tb.r9c
    public int getCurrentBgViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8428fa22", new Object[]{this})).intValue();
        }
        return w().g();
    }

    @Override // tb.r9c
    public void setBgView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae059bdf", new Object[]{this, view});
        } else {
            w().y(view);
        }
    }

    @Override // tb.r9c
    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9fda5947", new Object[]{this});
        }
        return w().i();
    }
}
