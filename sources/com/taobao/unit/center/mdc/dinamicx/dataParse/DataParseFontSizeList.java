package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.uikit.provider.IFontSizeProvider;
import tb.evb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DataParseFontSizeList implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529531123);
        t2o.a(444596865);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IFontSizeProvider iFontSizeProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0 || (iFontSizeProvider = (IFontSizeProvider) GlobalContainer.getInstance().get(IFontSizeProvider.class)) == null || iFontSizeProvider.getDPSize() <= 0 || iFontSizeProvider.getDPSize() > objArr.length) {
            return null;
        }
        return objArr[iFontSizeProvider.getDPSize() - 1];
    }
}
