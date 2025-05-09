package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.evb;
import tb.h36;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXTsKVDataParser implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TSKV = 38193563468L;

    static {
        t2o.a(529531120);
        t2o.a(444596865);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (objArr == null || objArr.length == 0 || objArr.length % 2 != 0) {
            h36.g("DXTsKVDataParser", "operationList 键值对数量不符合规范");
            return null;
        }
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            if (obj instanceof mw5) {
                str = ((mw5) obj).s().toString();
            } else {
                str = obj.toString();
            }
            Object obj2 = objArr[i + 1];
            if (obj2 instanceof mw5) {
                obj2 = ((mw5) obj2).s();
            }
            jSONObject.put(str, obj2);
        }
        return jSONObject;
    }
}
