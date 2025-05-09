package com.alibaba.wireless.security.mainplugin;

import com.alibaba.wireless.security.framework.IRouterComponent;
import com.taobao.wireless.security.adapter.JNICLibrary;

/* renamed from: com.alibaba.wireless.security.mainplugin.д  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0116 implements IRouterComponent {
    @Override // com.alibaba.wireless.security.framework.IRouterComponent
    public Object doCommand(int i, Object... objArr) {
        return JNICLibrary.doCommandNative(i, objArr);
    }
}
