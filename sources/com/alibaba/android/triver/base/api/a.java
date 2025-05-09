package com.alibaba.android.triver.base.api;

import android.content.Context;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(ITriverRemoteProxy.DependenceMode dependenceMode, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbe56d4c", new Object[]{dependenceMode, context})).booleanValue();
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy != null) {
            return iTriverRemoteProxy.hasInstalled(dependenceMode, context);
        }
        return true;
    }

    public static void b(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c91df66", new Object[]{str, str2, dependenceMode, context, aVar});
            return;
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy != null) {
            iTriverRemoteProxy.install(str, str2, dependenceMode, context, aVar);
        } else {
            aVar.onSuccess();
        }
    }

    public static void c(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar, ITriverRemoteProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c690afe2", new Object[]{str, str2, dependenceMode, context, aVar, bVar});
            return;
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy != null) {
            iTriverRemoteProxy.installWithMainThreadCallback(str, str2, dependenceMode, context, aVar, bVar);
        } else {
            aVar.onSuccess();
        }
    }

    public static void d(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7df495", new Object[]{str, str2, dependenceMode, context, aVar});
            return;
        }
        ITriverRemoteProxy iTriverRemoteProxy = (ITriverRemoteProxy) RVProxy.get((Class<Object>) ITriverRemoteProxy.class, true);
        if (iTriverRemoteProxy != null) {
            iTriverRemoteProxy.installWithRemoUI(str, str2, dependenceMode, context, aVar);
        } else {
            aVar.onSuccess();
        }
    }
}
