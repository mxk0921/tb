package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import mtopsdk.common.util.SymbolExpUtil;
import tb.nb5;
import tb.o66;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserMpSplitAndGetSubString extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPSPLITANDGETSUBSTRING = 8018042842832646611L;

    static {
        t2o.a(529531118);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpSplitAndGetSubString dXDataParserMpSplitAndGetSubString, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpSplitAndGetSubString");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 3) {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            Object obj2 = objArr[1];
            if (!(obj2 instanceof String)) {
                return null;
            }
            Object obj3 = objArr[2];
            if (!(obj3 instanceof String)) {
                return null;
            }
            int f = o66.f((String) obj3);
            String str = (String) obj2;
            if (TextUtils.equals(".", str)) {
                obj2 = "\\.";
            } else if (TextUtils.equals("|", str)) {
                obj2 = SymbolExpUtil.SYMBOL_VERTICALBAR;
            }
            String[] split = ((String) obj).split((String) obj2);
            if (split != null && f >= 0) {
                if (split.length == 0 && f == 0) {
                    return obj;
                }
                if (split.length <= f) {
                    return null;
                }
                return split[f];
            }
        }
        return null;
    }
}
