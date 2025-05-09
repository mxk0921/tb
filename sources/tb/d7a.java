package tb;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d7a extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETCOLLECTINFO = 7063038160878948256L;

    static {
        t2o.a(491782311);
    }

    public static /* synthetic */ Object ipc$super(d7a d7aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/collect/dx/GetCollectInfoFromSDK");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || j18.e(dXRuntimeContext) == null || !TextUtils.equals((String) j18.a(objArr, 0, String.class), "getCollectNum")) {
            return null;
        }
        tao<String, ErrorResult> e = oii.c().e("recommend", (String) j18.a(objArr, 2, String.class), (String) j18.a(objArr, 1, String.class), "ITEM");
        if (e == null || TextUtils.isEmpty(e.c())) {
            return "";
        }
        return e.c();
    }
}
