package com.taobao.browser;

import android.app.Application;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.k7r;
import tb.lss;
import tb.t2o;
import tb.vmm;
import tb.xet;
import tb.zt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PreInitWebviewTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAUNCHER_WEB = "launcher_web";
    public Application application;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends zt4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.browser.PreInitWebviewTask$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0541a implements lss {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0541a() {
            }

            public void a(Application application, HashMap<String, Object> hashMap) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
                } else if (WVCore.getInstance().isUCSupport()) {
                    vmm.a().addPreInitWeb(PreInitWebviewTask.LAUNCHER_WEB, application, null);
                    k7r.b("exchain.FullTrace", "pre init webview success");
                } else {
                    k7r.b("exchain.FullTrace", "uc sdk not support!!");
                }
            }
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1847240272) {
                super.onUCCorePrepared();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/PreInitWebviewTask$1");
        }

        @Override // tb.zt4
        public void onUCCorePrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
                return;
            }
            super.onUCCorePrepared();
            k7r.b("exchain.FullTrace", "defferTask");
            xet.b("DefferPreWebView", new C0541a());
        }
    }

    static {
        t2o.a(619708472);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        k7r.b("exchain.FullTrace", "PreInitWebviewTask");
        this.application = application;
        long currentTimeMillis = System.currentTimeMillis();
        WVCoreSettings.getInstance().setCoreEventCallback(new a());
        k7r.b("exchain.FullTrace", "do preInit task=[false], cost=[" + (System.currentTimeMillis() - currentTimeMillis) + "]");
    }
}
