package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r3z extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HUPDATEEDITIONSWITCH = -5129378093048283619L;

    static {
        t2o.a(729809538);
    }

    public static /* synthetic */ Object ipc$super(r3z r3zVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/location/DXHUpdateEditionSwitchEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                String str = (String) obj;
                sfh.d("DXHUpdateEditionSwitchEventHandler", " countryCode " + str);
                IHomeEditionSwitchService iHomeEditionSwitchService = (IHomeEditionSwitchService) c4b.i().h(IHomeEditionSwitchService.class);
                if (iHomeEditionSwitchService != null) {
                    iHomeEditionSwitchService.updateEditionSwitch(Globals.getApplication(), str);
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
