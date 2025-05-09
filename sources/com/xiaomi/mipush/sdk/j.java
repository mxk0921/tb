package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14731a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ e f707a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f708a;

    public j(String str, Context context, e eVar) {
        this.f708a = str;
        this.f14731a = context;
        this.f707a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (!TextUtils.isEmpty(this.f708a)) {
            String[] split = this.f708a.split(Constants.WAVE_SEPARATOR);
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "";
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2) && str2.startsWith("token:")) {
                    str = str2.substring(str2.indexOf(":") + 1);
                    break;
                }
                i++;
            }
            if (!TextUtils.isEmpty(str)) {
                b.m410a("ASSEMBLE_PUSH : receive correct token");
                i.d(this.f14731a, this.f707a, str);
                i.m471a(this.f14731a);
                return;
            }
            b.m410a("ASSEMBLE_PUSH : receive incorrect token");
        }
    }
}
