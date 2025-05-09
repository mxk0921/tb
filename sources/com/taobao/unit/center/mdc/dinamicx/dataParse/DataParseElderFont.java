package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IElderFontProvider;
import kotlin.Metadata;
import tb.evb;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/unit/center/mdc/dinamicx/dataParse/DataParseElderFont;", "Ltb/evb;", "<init>", "()V", "", "", "operationList", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "runtimeParam", "evalWithArgs", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DataParseElderFont implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529531121);
        t2o.a(444596865);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            if (objArr.length < 2) {
                objArr = null;
            }
            if (objArr != null) {
                IElderFontProvider iElderFontProvider = (IElderFontProvider) GlobalContainer.getInstance().get(IElderFontProvider.class);
                if (iElderFontProvider != null) {
                    z = iElderFontProvider.isElderFont();
                } else {
                    z = false;
                }
                if (z) {
                    return objArr[1];
                }
                return objArr[0];
            }
        }
        return null;
    }
}
