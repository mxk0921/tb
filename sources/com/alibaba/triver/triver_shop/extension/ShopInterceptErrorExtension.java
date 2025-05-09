package com.alibaba.triver.triver_shop.extension;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.triver.app.TriverLoadingController;
import com.alibaba.triver.miniapp.downgrade.ShopEngineDowngrader;
import com.alibaba.triver.point.InterceptShowErrorPoint;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.pks;
import tb.qks;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopInterceptErrorExtension implements InterceptShowErrorPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f3031a;

        public a(App app) {
            this.f3031a = app;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            App app = this.f3031a;
            if (app != null && !app.isDestroyed()) {
                this.f3031a.exit();
            }
        }
    }

    static {
        t2o.a(766509301);
    }

    public boolean interceptLaunchError(App app, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dc82127", new Object[]{this, app, str, str2, map})).booleanValue();
        }
        if (app == null) {
            return false;
        }
        String w = qks.w(app);
        if (!TextUtils.isEmpty(w)) {
            ExtensionPoint.as(TriverLoadingController.DowngradePoint.class).node(app).create().downgradeTo(w);
            new Handler(Looper.getMainLooper()).postDelayed(new a(app), 500L);
            return true;
        } else if (pks.p(app) || !pks.u(app)) {
            return false;
        } else {
            ShopEngineDowngrader.a(app, (String) null);
            return true;
        }
    }

    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }
}
