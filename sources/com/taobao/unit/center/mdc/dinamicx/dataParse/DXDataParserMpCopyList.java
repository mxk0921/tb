package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;
import tb.h36;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserMpCopyList extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPCOPYLIST = 7449801160192418078L;

    static {
        t2o.a(529531110);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpCopyList dXDataParserMpCopyList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpCopyList");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1) {
            h36.g("DXDataSourceCopy", "args 长度不符合规范");
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll((JSONArray) objArr[0]);
            return jSONArray;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) objArr[0]);
            return arrayList;
        } else {
            if (obj != null) {
                h36.g("DXDataSourceCopy", "无法处理的类型" + objArr[0].getClass().toString());
            }
            return null;
        }
    }
}
