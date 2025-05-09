package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.al;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class es {

    /* renamed from: a  reason: collision with root package name */
    private static volatile es f14866a;

    /* renamed from: a  reason: collision with other field name */
    private int f961a;

    /* renamed from: a  reason: collision with other field name */
    private Context f962a;

    /* renamed from: a  reason: collision with other field name */
    private ew f963a;

    /* renamed from: a  reason: collision with other field name */
    private String f964a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<eu, ev> f965a;
    private String b;

    private es(Context context) {
        HashMap<eu, ev> hashMap = new HashMap<>();
        this.f965a = hashMap;
        this.f962a = context;
        hashMap.put(eu.SERVICE_ACTION, new ey());
        this.f965a.put(eu.SERVICE_COMPONENT, new ez());
        this.f965a.put(eu.ACTIVITY, new eq());
        this.f965a.put(eu.PROVIDER, new ex());
    }

    public int a() {
        return this.f961a;
    }

    public String b() {
        return this.b;
    }

    public static es a(Context context) {
        if (f14866a == null) {
            synchronized (es.class) {
                try {
                    if (f14866a == null) {
                        f14866a = new es(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14866a;
    }

    public void b(String str) {
        this.b = str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ew m672a() {
        return this.f963a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m673a() {
        return this.f964a;
    }

    public void a(int i) {
        this.f961a = i;
    }

    public void a(Context context, String str, int i, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            eo.a(context, "" + str, 1008, "A receive a incorrect message");
            return;
        }
        a(i);
        ah.a(this.f962a).a(new et(this, str, context, str2, str3));
    }

    public void a(eu euVar, Context context, Intent intent, String str) {
        if (euVar != null) {
            this.f965a.get(euVar).a(context, intent, str);
        } else {
            eo.a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(eu euVar, Context context, er erVar) {
        this.f965a.get(euVar).a(context, erVar);
    }

    public void a(ew ewVar) {
        this.f963a = ewVar;
    }

    public void a(String str) {
        this.f964a = str;
    }

    public void a(String str, String str2, int i, ew ewVar) {
        a(str);
        b(str2);
        a(i);
        a(ewVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m671a(Context context) {
        return al.m1017a(context, context.getPackageName());
    }
}
