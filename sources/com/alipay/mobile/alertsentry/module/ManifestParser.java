package com.alipay.mobile.alertsentry.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.alipay.mobile.alertsentry.SentryBuilder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ManifestParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3876a;

    public ManifestParser(Context context) {
        this.f3876a = context;
    }

    public final List<SentryModule> a() {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f3876a.getPackageManager().getApplicationInfo(this.f3876a.getPackageName(), 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                for (String str : bundle.keySet()) {
                    if ("SentryModule".equals(applicationInfo.metaData.get(str)) && a(str) != null) {
                        arrayList.add(a(str));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static SentryModule a(String str) {
        Class<?> cls;
        Object obj = null;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.toString();
            cls = null;
        }
        try {
            obj = cls.newInstance();
        } catch (Exception e2) {
            e2.toString();
        }
        if (!(obj instanceof SentryModule)) {
            Objects.toString(obj);
            obj = new SentryModule() { // from class: com.alipay.mobile.alertsentry.module.ManifestParser.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.alertsentry.module.SentryModule
                public final void applyOptions(Context context, SentryBuilder sentryBuilder) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d603679e", new Object[]{this, context, sentryBuilder});
                    }
                }
            };
        }
        return (SentryModule) obj;
    }
}
