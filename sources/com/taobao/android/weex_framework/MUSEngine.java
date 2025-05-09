package com.taobao.android.weex_framework;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.INode;
import java.io.Serializable;
import tb.d5x;
import tb.exp;
import tb.gfm;
import tb.gwh;
import tb.h5x;
import tb.ivu;
import tb.jpc;
import tb.jyi;
import tb.nxh;
import tb.t2o;
import tb.vvh;
import tb.w6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MUSEngine implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean sDelayedJobDone = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements d5x.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f9964a;

        public a(b bVar) {
            this.f9964a = bVar;
        }

        @Override // tb.d5x.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2eae6f25", new Object[]{this});
                return;
            }
            b bVar = this.f9964a;
            if (bVar != null) {
                ((gfm) bVar).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    static {
        t2o.a(982516009);
    }

    public static boolean hasJSBindingPlugin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8901c24a", new Object[]{str})).booleanValue();
        }
        return MUSCommonNativeBridge.b(str);
    }

    public static void initApplicationAsync(Application application, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999e3b3", new Object[]{application, bVar});
        } else {
            h5x.m().j(null, application, new a(bVar));
        }
    }

    public static boolean isInitDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9edfc287", new Object[0])).booleanValue();
        }
        return w6x.r(null);
    }

    private static void registerLayoutParamsToNative(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a81a81c", new Object[]{context});
        } else {
            nxh.i(nxh.f(context), nxh.d(context), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean registerModule(String str, Class<? extends MUSModule> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51e31701", new Object[]{str, cls})).booleanValue() : gwh.e(str, cls);
    }

    public static void registerPlatformView(String str, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d544f071", new Object[]{str, cls});
        } else {
            ivu.e(str, new exp(cls));
        }
    }

    public static void registerUINode(String str, Class<? extends INode> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d16b93", new Object[]{str, cls});
        } else {
            ivu.f(str, cls);
        }
    }

    public static void resetDelayedNativeRegisterState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50413f4b", new Object[0]);
        } else {
            sDelayedJobDone = false;
        }
    }

    public static void setUpGlobalConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae640c1d", new Object[]{str, str2});
        }
    }

    public static void updateDelayedNativeRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc51a79a", new Object[0]);
        } else if (!sDelayedJobDone && ivu.d()) {
            sDelayedJobDone = true;
        }
    }

    public static void updateLayoutParams(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5186308", new Object[]{context});
            return;
        }
        if (context == null) {
            context = vvh.c();
        }
        if (context != null) {
            registerLayoutParamsToNative(context);
        }
    }

    public static boolean registerModule(String str, Class<? extends MUSModule> cls, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea807b7b", new Object[]{str, cls, new Boolean(z)})).booleanValue() : gwh.f(str, cls, z);
    }

    public static void registerPlatformView(String str, exp expVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc369e4", new Object[]{str, expVar});
        } else {
            ivu.e(str, expVar);
        }
    }

    public static void registerUINode(String str, jpc jpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21dfae8", new Object[]{str, jpcVar});
        } else {
            ivu.h(str, jpcVar);
        }
    }

    public static boolean registerModule(String str, jyi jyiVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8bdf980", new Object[]{str, jyiVar, new Boolean(z)})).booleanValue() : gwh.g(str, jyiVar, z);
    }

    public static void registerUINode(String str, Class<? extends INode> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675cb9a1", new Object[]{str, cls, new Boolean(z)});
        } else {
            ivu.g(str, cls, z);
        }
    }
}
