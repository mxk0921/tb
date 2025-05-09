package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.biz.IContainerFlagService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETCONTAINERLEVELFLAG = -1573964379491351702L;

    static {
        t2o.a(491782321);
    }

    public static /* synthetic */ Object ipc$super(sk5 sk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/containerflagservice/dx/DXDataParserGetContainerLevelFlag");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1) {
            fve.e("DXDataParserGetContainerLevelFlag", "参数长度异常");
            return null;
        }
        Object obj = objArr[0];
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            fve.e("DXDataParserGetContainerLevelFlag", "参数为null");
            return null;
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null) {
            fve.e("DXDataParserGetContainerLevelFlag", "infoFlowContext 获取失败");
            return null;
        }
        IContainerFlagService iContainerFlagService = (IContainerFlagService) c.a(IContainerFlagService.class);
        if (iContainerFlagService != null) {
            return iContainerFlagService.findFlagStrategy(str);
        }
        fve.e("DXDataParserGetContainerLevelFlag", "服务查找失败");
        return null;
    }
}
