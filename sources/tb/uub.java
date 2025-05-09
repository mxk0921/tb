package tb;

import android.content.Context;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uub extends rub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237926);
    }

    public static /* synthetic */ Object ipc$super(uub uubVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/layout/impl/IDXCViewPagerLayout");
    }

    @Override // tb.rub
    public void a(Context context, a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b7d375", new Object[]{this, context, aVar, jSONObject});
        } else if ((aVar instanceof afn) && jSONObject != null) {
            afn afnVar = (afn) aVar;
            afnVar.z(1);
            bf5.a(context, afnVar, jSONObject);
        }
    }

    @Override // tb.rub
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208cadbf", new Object[]{this});
        }
        return "tabcontent";
    }

    @Override // tb.rub
    public a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("203f59c7", new Object[]{this});
        }
        return new afn(1);
    }
}
