package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HICONPAGENUM = 7875544783591054506L;

    static {
        t2o.a(491782355);
    }

    public static /* synthetic */ Object ipc$super(hm5 hm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/DXDataParserHIconPageNum");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IIconService iIconService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null || (iIconService = (IIconService) c.a(IIconService.class)) == null) {
            return 0;
        }
        iIconService.syncInitPageIndex();
        return Integer.valueOf(iIconService.getInitPageIndex());
    }
}
