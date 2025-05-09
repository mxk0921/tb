package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.h36;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserBetween extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_BETWEEN = 4691990062613419377L;

    static {
        t2o.a(529531109);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserBetween dXDataParserBetween, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserBetween");
    }

    private Integer toInteger(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f973f84d", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (Throwable unused) {
                h36.g("DXDataParserBetween", "第0项参数非法");
                return null;
            }
        } else if (obj instanceof Integer) {
            return (Integer) obj;
        } else {
            return null;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 3) {
            h36.g("DXDataParserBetween", "operationList 键值对数量不符合规范");
            return Boolean.FALSE;
        }
        Integer integer = toInteger(objArr[0]);
        Integer integer2 = toInteger(objArr[1]);
        Integer integer3 = toInteger(objArr[2]);
        if (integer == null || integer2 == null || integer3 == null) {
            h36.g("DXDataParserBetween", "第0项为空");
            return Boolean.FALSE;
        }
        if (integer.intValue() < integer2.intValue() || integer.intValue() > integer3.intValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
