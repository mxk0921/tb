package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import com.xiaomi.push.cg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cb extends cg.b<Long> {

    /* renamed from: a  reason: collision with root package name */
    private long f14794a = 0;

    /* renamed from: a  reason: collision with other field name */
    private String f786a;

    public cb(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.f786a = str6;
    }

    public static cb a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new cb(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.push.cg.b
    public Long a(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    @Override // com.xiaomi.push.cg.b, com.xiaomi.push.cg.a
    public Object a() {
        return Long.valueOf(this.f14794a);
    }

    @Override // com.xiaomi.push.cg.b
    public void a(Context context, List<Long> list) {
        if (context != null && list != null && list.size() > 0) {
            this.f14794a = list.get(0).longValue();
        }
    }
}
