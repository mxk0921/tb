package com.taobao.android.nanocompose;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NanoNativeLib {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private static final NanoNativeLib f9007a = new NanoNativeLib();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598736910);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final void _init_$initNanoPlatformContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a06f6b", new Object[0]);
        }
    }

    public static final /* synthetic */ NanoNativeLib access$getA$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NanoNativeLib) ipChange.ipc$dispatch("267d9682", new Object[0]);
        }
        return f9007a;
    }

    @JvmStatic
    public static final native long createNativeRenderContext(String str, long j, String str2, String str3);

    static {
        t2o.a(598736909);
        System.loadLibrary("nano_compose");
    }
}
