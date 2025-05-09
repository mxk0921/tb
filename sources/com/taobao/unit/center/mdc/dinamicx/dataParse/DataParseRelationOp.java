package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.evb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DataParseRelationOp implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529531126);
        t2o.a(444596865);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 3) {
            String str = "" + objArr[0];
            String str2 = "" + objArr[1];
            String str3 = "" + objArr[2];
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !"null".equals(str2) && !"null".equals(str3)) {
                try {
                    double parseDouble = Double.parseDouble(str2);
                    double parseDouble2 = Double.parseDouble(str3);
                    if ("==".equals(str)) {
                        if (parseDouble != parseDouble2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } else if ("!=".equals(str)) {
                        if (parseDouble == parseDouble2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } else if (">".equals(str)) {
                        if (parseDouble <= parseDouble2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } else if ("<".equals(str)) {
                        if (parseDouble >= parseDouble2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } else if (">=".equals(str)) {
                        if (parseDouble < parseDouble2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } else if (!"<=".equals(str)) {
                        return null;
                    } else {
                        if (parseDouble > parseDouble2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
