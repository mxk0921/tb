package tb;

import android.view.View;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ko7 extends bv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DISPATCHER_TAG = "handleDinamicXEvent";

    static {
        t2o.a(157286631);
    }

    public static /* synthetic */ Object ipc$super(ko7 ko7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/event/DinamicXEventDispatcher");
    }

    @Override // tb.nm7
    public void a(View view, String str, Object obj, Object obj2, Object obj3, ArrayList arrayList) {
        ViewEngine viewEngine;
        mqk mqkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4d8ad3", new Object[]{this, view, str, obj, obj2, obj3, arrayList});
        } else if ((obj3 instanceof Map) && (viewEngine = (ViewEngine) ((Map) obj3).get("ViewEngine")) != null && (mqkVar = (mqk) viewEngine.a0(mqk.class)) != null) {
            mqkVar.a(view, str, obj, obj2, obj3, arrayList);
        }
    }
}
