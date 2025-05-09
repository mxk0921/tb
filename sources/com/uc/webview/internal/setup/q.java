package com.uc.webview.internal.setup;

import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023BottomBarNativeComponent;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.h;
import com.uc.webview.base.i;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.internal.interfaces.IStartupController;
import com.uc.webview.internal.setup.component.f;
import com.uc.webview.internal.setup.component.u;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    static File f14492a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static int f14493a = h.d("uc.expect.feature");

        public static void a(int i) {
            f14493a = i;
            h.a a2 = h.a();
            if (a2 != null) {
                a2.a("uc.expect.feature", i).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f14494a;

        static {
            int a2 = com.uc.webview.internal.d.a("debug.uc.patch.mode");
            if (a2 == -1) {
                a2 = GlobalSettings.get((int) Shop2023BottomBarNativeComponent.bottomBarHeightWithBottomMarginRpxValue, 0);
            }
            f14494a = a2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final u f14495a = new d((byte) 0);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements u {
        private d() {
        }

        @Override // com.uc.webview.internal.setup.component.u
        public final boolean a(f fVar) {
            com.uc.webview.base.io.c c = PathUtils.c(b(fVar));
            return c != null && c.c();
        }

        @Override // com.uc.webview.internal.setup.component.u
        public final File b(f fVar) {
            return new File(PathUtils.e(EnvInfo.getContext()), PathUtils.b(fVar.d()));
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.component.u
        public final File a() {
            return q.f14492a;
        }

        @Override // com.uc.webview.internal.setup.component.u
        public final ICoreVersion a(String str, String str2, String str3) throws UCKnownException {
            Throwable th;
            ICoreVersion coreVersion;
            try {
                l a2 = l.a(n.a(false, new File(str3), 2));
                File t = a2.t();
                File r = a2.r();
                File p = a2.p();
                File q = a2.q();
                ClassLoader classLoader = o.class.getClassLoader();
                com.uc.webview.internal.setup.verify.d.a(EnvInfo.getContext(), t, p);
                ClassLoader a3 = i.a(p, q, r, classLoader);
                Class.forName(IStartupController.CORE_CLASS_STARTUP_CONTROLLER, true, a3);
                a2.z = a3;
                com.uc.webview.internal.setup.verify.d.a(t, r, 1, a3, false);
                a2.a(a2.coreClassLoader());
                coreVersion = a2.coreVersion();
                i.a(EnvInfo.getContext(), a2);
                com.uc.webview.base.io.c c = PathUtils.c(a2.t());
                if (c != null) {
                    c.a();
                }
                if (coreVersion != null) {
                    coreVersion.version();
                    coreVersion.buildTimestamp();
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (coreVersion != null) {
                return coreVersion;
            }
            th = null;
            if (th == null) {
                th = new Throwable();
            }
            if (th instanceof UCKnownException) {
                throw ((UCKnownException) th);
            }
            throw new UCKnownException(ErrorCode.INIT_CORE_ENGINE_FAILED, "checkU4Compatible", th);
        }
    }
}
