package com.xiaomi.push;

import android.util.Log;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ dy f14844a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f879a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Throwable f880a;

    public dz(dy dyVar, String str, Throwable th) {
        this.f14844a = dyVar;
        this.f879a = str;
        this.f880a = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        SimpleDateFormat simpleDateFormat;
        String str;
        List list2;
        String str2;
        List list3;
        List list4;
        SimpleDateFormat simpleDateFormat2;
        String str3;
        List list5;
        List list6;
        String unused;
        list = dy.f876a;
        simpleDateFormat = dy.f875a;
        String format = simpleDateFormat.format(new Date());
        str = this.f14844a.b;
        list.add(new Pair(String.format("%1$s %2$s %3$s ", format, str, this.f879a), this.f880a));
        list2 = dy.f876a;
        if (list2.size() > 20000) {
            list3 = dy.f876a;
            int size = list3.size() - 19950;
            for (int i = 0; i < size; i++) {
                try {
                    list5 = dy.f876a;
                    if (list5.size() > 0) {
                        list6 = dy.f876a;
                        list6.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
            list4 = dy.f876a;
            simpleDateFormat2 = dy.f875a;
            String format2 = simpleDateFormat2.format(new Date());
            str3 = this.f14844a.b;
            list4.add(new Pair(String.format("%1$s %2$s %3$s ", format2, str3, "flush " + size + " lines logs."), null));
        }
        try {
            if (!z.d()) {
                unused = this.f14844a.b;
            } else {
                this.f14844a.a();
            }
        } catch (Exception e) {
            str2 = this.f14844a.b;
            Log.e(str2, "", e);
        }
    }
}
