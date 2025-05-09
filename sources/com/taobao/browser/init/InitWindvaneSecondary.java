package com.taobao.browser.init;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.tao.util.WVTBProxyImpl;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import tb.fsw;
import tb.h8s;
import tb.ihc;
import tb.kpw;
import tb.lex;
import tb.n7r;
import tb.t2o;
import tb.x7j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class InitWindvaneSecondary implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ihc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f10257a;

        public a(InitWindvaneSecondary initWindvaneSecondary, Application application) {
            this.f10257a = application;
        }

        @Override // tb.ihc
        public Class<? extends kpw> getBridgeClass(String str) {
            String str2;
            ServiceInfo serviceInfo;
            Application application = this.f10257a;
            if (application != null && !TextUtils.isEmpty(str)) {
                if (str.contains(fsw.b().f19515a)) {
                    str2 = fsw.b().f19515a;
                } else {
                    str2 = str;
                }
                Intent intent = new Intent(str2);
                intent.setPackage(application.getPackageName());
                List<ResolveInfo> queryIntentServices = application.getPackageManager().queryIntentServices(intent, 4);
                if (!(queryIntentServices == null || queryIntentServices.size() <= 0 || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null || serviceInfo.name == null)) {
                    try {
                        return ((ihc) application.getClassLoader().loadClass(serviceInfo.name).newInstance()).getBridgeClass(str);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            return null;
        }
    }

    static {
        t2o.a(619708503);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            run(application, hashMap);
        }
    }

    public void run(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else if (h8s.a(application.getApplicationContext())) {
            TMSLogger.b("TMSEarlyInitializer", "skip InitWindvaneSecondary");
            CalendarAidlAdapter.initCalendarJS();
            n7r.a(null);
        } else {
            lex.b = new WVTBProxyImpl();
            x7j.a();
            CalendarAidlAdapter.initCalendarJS();
            fsw.n(new a(this, application));
            n7r.a(null);
        }
    }
}
