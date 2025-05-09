package com.taobao.falco;

import android.content.Intent;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f10459a;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    public b(Object obj, a aVar) {
        this.f10459a = obj;
        this.b = aVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        a aVar;
        if ("startActivity".equals(method.getName())) {
            int i = 0;
            while (true) {
                try {
                    if (i >= objArr.length) {
                        i = 0;
                        break;
                    } else if (objArr[i] instanceof Intent) {
                        break;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    ALog.e("falco.ActivityInvocation", "invoke error", null, th, new Object[0]);
                }
            }
            Intent intent = (Intent) objArr[i];
            if (!(intent == null || (aVar = this.b) == null)) {
                ((FalcoLoadActionMonitor) aVar).B0(intent);
            }
        }
        try {
            return method.invoke(this.f10459a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
