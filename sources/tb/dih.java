package tb;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dih {
    public static final String AUTH_APP_INFO = "AUTH_APP_INFO";

    /* renamed from: a  reason: collision with root package name */
    public final Context f17844a;

    public dih(Context context) {
        this.f17844a = context;
    }

    public final String a(Context context) {
        try {
            return sy4.k(UUID.randomUUID().toString() + n91.a(context) + n91.b(context) + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String b() {
        Context context = this.f17844a;
        String str = (String) z2v.b(context, "AUTH_APP_INFO", hxj.UNIQID, "");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a2 = a(context);
        z2v.c(context, "AUTH_APP_INFO", hxj.UNIQID, a2);
        return a2;
    }
}
