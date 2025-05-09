package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ti5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTCHECKKEEPBUBBLESHOW = 2462128161505069073L;

    static {
        t2o.a(479199344);
    }

    public static /* synthetic */ Object ipc$super(ti5 ti5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/DXDataParserCartCheckKeepBubbleShow");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        DMComponent dMComponent = (DMComponent) ((Map) dXRuntimeContext.q()).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        if (dMComponent == null) {
            return Boolean.FALSE;
        }
        JSONObject fields = dMComponent.getFields();
        if (fields == null) {
            return Boolean.FALSE;
        }
        if (!fields.getBooleanValue("showCheckKeepBubble")) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!tc3.a(dXRuntimeContext.h()));
    }
}
