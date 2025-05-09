package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dc6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_SETCARDMODELEXTEVENTHANDER = -2193526156955095466L;

    public static /* synthetic */ Object ipc$super(dc6 dc6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/event/DXSetCardModelExtEventHanderEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 2) {
            vfm.f("SetCardModelExt ", "dx args is null");
        } else {
            e3b g = tcm.g(dXRuntimeContext);
            IPopData f = tcm.f(dXRuntimeContext);
            if (g == null || f == null) {
                vfm.f("SetCardModelExt ", "engine or popData is null");
                return;
            }
            Object obj2 = objArr[0];
            String str = null;
            String obj3 = obj2 == null ? null : obj2.toString();
            Object obj4 = objArr[1];
            String obj5 = obj4 == null ? null : obj4.toString();
            if (TextUtils.isEmpty(obj3) || TextUtils.isEmpty(obj5)) {
                vfm.f("SetCardModelExt ", "args key or sectionBizCode is null");
                return;
            }
            if (objArr.length > 2 && (obj = objArr[2]) != null) {
                str = obj.toString();
            }
            g.k().d(obj3, obj5, str);
            vfm.f("SetCardModelExt ", "set " + obj3 + ", key=" + obj5 + ", value=" + str);
        }
    }
}
