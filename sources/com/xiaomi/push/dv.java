package com.xiaomi.push;

import com.xiaomi.push.du;
import java.io.File;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dv extends du.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14840a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ du f867a;

    /* renamed from: a  reason: collision with other field name */
    File f868a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f869a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Date f870a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f871a;
    final /* synthetic */ String b;

    /* renamed from: b  reason: collision with other field name */
    final /* synthetic */ Date f872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(du duVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.f867a = duVar;
        this.f14840a = i;
        this.f870a = date;
        this.f872b = date2;
        this.f869a = str;
        this.b = str2;
        this.f871a = z;
    }

    @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo598b() {
        if (z.d()) {
            try {
                File file = new File(this.f867a.f860a.getExternalFilesDir(null) + "/.logcache");
                file.mkdirs();
                if (file.isDirectory()) {
                    dt dtVar = new dt();
                    dtVar.a(this.f14840a);
                    this.f868a = dtVar.a(this.f867a.f860a, this.f870a, this.f872b, file);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: c */
    public void mo599c() {
        File file = this.f868a;
        if (file != null && file.exists()) {
            this.f867a.f861a.add(new du.c(this.f869a, this.b, this.f868a, this.f871a));
        }
        this.f867a.a(0L);
    }
}
