package tb;

import android.content.Context;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXBasicComponentType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vub extends rub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237927);
    }

    public static /* synthetic */ Object ipc$super(vub vubVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/layout/impl/IDXCWaterfallLayout");
    }

    @Override // tb.rub
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208cadbf", new Object[]{this});
        }
        return WXBasicComponentType.WATERFALL;
    }

    @Override // tb.rub
    public a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("203f59c7", new Object[]{this});
        }
        return new ahq();
    }

    @Override // tb.rub
    public void a(Context context, a aVar, JSONObject jSONObject) {
        int i = 2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b7d375", new Object[]{this, context, aVar, jSONObject});
        } else if (aVar instanceof ahq) {
            ahq ahqVar = (ahq) aVar;
            if (jSONObject != null) {
                int intValue = jSONObject.getIntValue(pg1.ATOM_EXT_column);
                String string = jSONObject.getString("vGap");
                String string2 = jSONObject.getString("hGap");
                ahqVar.x0(pb6.o(context, string, 0));
                ahqVar.v0(pb6.o(context, string2, 0));
                bf5.a(context, ahqVar, jSONObject);
                i2 = intValue;
            }
            if (i2 > 0) {
                i = i2;
            }
            ahqVar.w0(i);
        }
    }
}
