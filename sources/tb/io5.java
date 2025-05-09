package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class io5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MM_REMOVE_URL_QUERY = 6665809967362577057L;

    static {
        t2o.a(573571184);
    }

    public static /* synthetic */ Object ipc$super(io5 io5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/dataparser/DXDataParserMmRemoveUrlQuery");
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
        try {
            if (objArr.length < 2) {
                return null;
            }
            String valueOf = String.valueOf(objArr[0]);
            if (TextUtils.isEmpty(valueOf)) {
                return valueOf;
            }
            Object obj = objArr[1];
            if (!(obj instanceof List)) {
                return valueOf;
            }
            List list = (List) obj;
            Uri parse = Uri.parse(valueOf);
            Uri.Builder fragment = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).fragment(parse.getFragment());
            for (String str : parse.getQueryParameterNames()) {
                if (!list.contains(str)) {
                    for (String str2 : parse.getQueryParameters(str)) {
                        fragment.appendQueryParameter(str, str2);
                    }
                }
            }
            return fragment.build().toString();
        } catch (Throwable th) {
            jgh.a("DXDataParserMmRemoveUrlQuery", "Error removing URL query parameters: " + th.getMessage());
            if (objArr.length > 0) {
                return String.valueOf(objArr[0]);
            }
            return null;
        }
    }
}
