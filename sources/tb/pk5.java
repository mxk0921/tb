package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GET_ALITRACKID = -5217798252609980219L;

    public static /* synthetic */ Object ipc$super(pk5 pk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/parser/DXDataParserGetAlitrackid");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0) {
            str = "";
        } else {
            str = objArr[0].toString();
        }
        if (TextUtils.isEmpty(str)) {
            v1.b("DXDataParserGetAlitrackid", "evalWithArgs clickUrl is empty");
            return null;
        }
        v1.b("DXDataParserGetAlitrackid", "evalWithArgs operationList: " + str);
        return dcj.e(str);
    }
}
