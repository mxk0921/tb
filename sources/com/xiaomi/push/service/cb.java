package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ab;
import com.xiaomi.push.ah;
import com.xiaomi.push.bj;
import com.xiaomi.push.bm;
import com.xiaomi.push.h;
import com.xiaomi.push.ig;
import com.xiaomi.push.jm;
import com.xiaomi.push.n;
import com.xiaomi.push.x;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cb {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15093a = new Object();

    public static void a(Context context, ig igVar) {
        if (ca.a(igVar.e())) {
            ah.a(context).a(new cc(context, igVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, ig igVar) {
        IOException e;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        Exception e2;
        String str;
        try {
            byte[] b = h.b(a(context), jm.a(igVar));
            if (b != null && b.length >= 1) {
                if (b.length > 10240) {
                    str = "TinyData write to cache file failed case too much data content item:" + igVar.d() + "  ts:" + System.currentTimeMillis();
                    b.m410a(str);
                    x.a((Closeable) null);
                    x.a((Closeable) null);
                }
                BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                try {
                    bufferedOutputStream3.write(ab.a(b.length));
                    bufferedOutputStream3.write(b);
                    bufferedOutputStream3.flush();
                    x.a((Closeable) null);
                    x.a(bufferedOutputStream3);
                    return;
                } catch (IOException e3) {
                    bufferedOutputStream = bufferedOutputStream3;
                    e = e3;
                    try {
                        b.a("TinyData write to cache file failed cause io exception item:" + igVar.d(), e);
                        x.a((Closeable) null);
                        x.a(bufferedOutputStream);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        x.a((Closeable) null);
                        x.a(bufferedOutputStream2);
                        throw th;
                    }
                } catch (Exception e4) {
                    bufferedOutputStream2 = bufferedOutputStream3;
                    e2 = e4;
                    try {
                        b.a("TinyData write to cache file  failed item:" + igVar.d(), e2);
                        x.a((Closeable) null);
                        x.a(bufferedOutputStream2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        x.a((Closeable) null);
                        x.a(bufferedOutputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    bufferedOutputStream2 = bufferedOutputStream3;
                    th = th3;
                    x.a((Closeable) null);
                    x.a(bufferedOutputStream2);
                    throw th;
                }
            }
            str = "TinyData write to cache file failed case encryption fail item:" + igVar.d() + "  ts:" + System.currentTimeMillis();
            b.m410a(str);
            x.a((Closeable) null);
            x.a((Closeable) null);
        } catch (IOException e5) {
            e = e5;
            bufferedOutputStream = null;
        } catch (Exception e6) {
            e2 = e6;
            bufferedOutputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream2 = null;
        }
    }

    public static byte[] a(Context context) {
        String a2 = n.a(context).a("mipush", "td_key", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = bm.a(20);
            n.a(context).m962a("mipush", "td_key", a2);
        }
        return a(a2);
    }

    private static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(bj.m516a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }
}
