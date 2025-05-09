package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ri5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CALLFUN = 4728576668438119884L;

    static {
        t2o.a(295698931);
    }

    public static /* synthetic */ Object ipc$super(ri5 ri5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXDataParserCallFun");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        long j;
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str2 = null;
        if (!(objArr == null || objArr.length == 0)) {
            if (!"enableNewTimeMove".equals(objArr[0]) || objArr.length < 2 || objArr[1] == null) {
                if ("getWidthFromUrl".equals(objArr[0]) && objArr.length >= 3 && (obj = objArr[1]) != null && objArr[2] != null) {
                    try {
                        String obj2 = obj.toString();
                        if (!TextUtils.isEmpty(obj2)) {
                            int lastIndexOf = obj2.lastIndexOf("-", obj2.lastIndexOf("-") - 1) + 1;
                            int lastIndexOf2 = obj2.lastIndexOf(".");
                            if (lastIndexOf == 0 || lastIndexOf2 == -1) {
                                str = "0";
                            } else {
                                str = obj2.substring(lastIndexOf, lastIndexOf2);
                            }
                            String[] split = str.split("-");
                            if (split.length != 2 || Integer.parseInt(objArr[2].toString()) <= 0 || Integer.parseInt(split[0]) <= 0 || Integer.parseInt(split[1]) <= 0) {
                                return 0;
                            }
                            if (Integer.parseInt(split[1]) > 0) {
                                return Integer.valueOf((int) (Integer.parseInt(split[0]) / (Integer.parseInt(split[1]) / Integer.parseInt(objArr[2].toString()))));
                            }
                        }
                    } catch (Exception unused) {
                        return 0;
                    }
                }
                if ("getFormatTime".equals(objArr[0])) {
                    if (objArr.length > 1) {
                        j = zqq.h((String) objArr[1]);
                    } else {
                        j = 0;
                    }
                    if (objArr.length > 2) {
                        str2 = (String) objArr[2];
                    }
                    if (j <= 0 || TextUtils.isEmpty(str2)) {
                        return "";
                    }
                    return new SimpleDateFormat(str2).format(new Date(j));
                } else if ("isDebugTBLive".equals(objArr[0])) {
                    if (dXRuntimeContext == null) {
                        return Boolean.TRUE;
                    }
                    return Boolean.valueOf(iw0.j(dXRuntimeContext.h()));
                }
            } else if (kkr.i().d() != null) {
                return Boolean.valueOf(kkr.i().d().i(null, (LiveItem) JSON.parseObject(objArr[1].toString(), LiveItem.class)));
            } else {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
