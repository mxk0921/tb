package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.kit.core.GlobalContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ml5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETUNREADMSGCOUNT = 6515486422507271648L;

    static {
        t2o.a(745538119);
    }

    public static /* synthetic */ Object ipc$super(ml5 ml5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/DXDataParserGetUnreadMsgCount");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tipType", (Object) String.valueOf(messageBoxService.getUnreadInfo().getTipType()));
        jSONObject.put("tipNumber", (Object) String.valueOf(messageBoxService.getUnreadInfo().getTipNumber()));
        return jSONObject.toString();
    }
}
