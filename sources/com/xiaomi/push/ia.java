package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.ca;
import com.xiaomi.push.service.cb;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ia {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ia f14945a;

    /* renamed from: a  reason: collision with other field name */
    private final Context f1128a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, ib> f1129a = new HashMap();

    private ia(Context context) {
        this.f1128a = context;
    }

    public static ia a(Context context) {
        if (context == null) {
            b.d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f14945a == null) {
            synchronized (ia.class) {
                try {
                    if (f14945a == null) {
                        f14945a = new ia(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14945a;
    }

    public ib a() {
        ib ibVar = this.f1129a.get("UPLOADER_PUSH_CHANNEL");
        if (ibVar != null) {
            return ibVar;
        }
        ib ibVar2 = this.f1129a.get("UPLOADER_HTTP");
        if (ibVar2 != null) {
            return ibVar2;
        }
        return null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, ib> m783a() {
        return this.f1129a;
    }

    public void a(ib ibVar, String str) {
        if (ibVar == null) {
            b.d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            b.d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            m783a().put(str, ibVar);
        }
    }

    public boolean a(ig igVar, String str) {
        if (TextUtils.isEmpty(str)) {
            b.m410a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        } else if (ca.a(igVar, false)) {
            return false;
        } else {
            if (TextUtils.isEmpty(igVar.d())) {
                igVar.f(ca.a());
            }
            igVar.g(str);
            cb.a(this.f1128a, igVar);
            return true;
        }
    }

    public boolean a(String str, String str2, long j, String str3) {
        return a(this.f1128a.getPackageName(), this.f1128a.getPackageName(), str, str2, j, str3);
    }

    private boolean a(String str, String str2, String str3, String str4, long j, String str5) {
        ig igVar = new ig();
        igVar.d(str3);
        igVar.c(str4);
        igVar.a(j);
        igVar.b(str5);
        igVar.a(true);
        igVar.a("push_sdk_channel");
        igVar.e(str2);
        return a(igVar, str);
    }
}
