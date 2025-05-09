package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.ah;
import com.xiaomi.push.cg;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.ca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bu {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bu f14787a;

    /* renamed from: a  reason: collision with other field name */
    private Context f774a;

    /* renamed from: a  reason: collision with other field name */
    private cj f776a;

    /* renamed from: a  reason: collision with other field name */
    private ck f777a;
    private String e;
    private String f;

    /* renamed from: a  reason: collision with other field name */
    private final String f778a = "push_stat_sp";

    /* renamed from: b  reason: collision with other field name */
    private final String f779b = "upload_time";

    /* renamed from: c  reason: collision with other field name */
    private final String f780c = "delete_time";
    private final String d = "check_time";

    /* renamed from: a  reason: collision with other field name */
    private ah.a f775a = new bv(this);
    private ah.a b = new bw(this);
    private ah.a c = new bx(this);

    private bu(Context context) {
        this.f774a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return this.f774a.getDatabasePath(by.f782a).getAbsolutePath();
    }

    public String b() {
        return this.f;
    }

    public static bu a(Context context) {
        if (f14787a == null) {
            synchronized (bu.class) {
                try {
                    if (f14787a == null) {
                        f14787a = new bu(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14787a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        SharedPreferences.Editor edit = this.f774a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        p.a(edit);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m526a() {
        return this.e;
    }

    public void a(cg.a aVar) {
        cg.a(this.f774a).a(aVar);
    }

    public void a(ig igVar) {
        if (a() && ca.a(igVar.e())) {
            a(cd.a(this.f774a, c(), igVar));
        }
    }

    public void a(String str) {
        if (a() && !TextUtils.isEmpty(str)) {
            a(cl.a(this.f774a, str));
        }
    }

    public void a(String str, String str2, Boolean bool) {
        if (this.f776a == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.f776a.a(this.f774a, str2, str);
        } else {
            this.f776a.b(this.f774a, str2, str);
        }
    }

    private boolean a() {
        return az.a(this.f774a).a(ih.StatDataSwitch.a(), true);
    }
}
