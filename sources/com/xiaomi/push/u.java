package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f15136a;

    /* renamed from: a  reason: collision with other field name */
    private File f1669a;

    /* renamed from: a  reason: collision with other field name */
    private Runnable f1670a;

    private u(Context context, File file) {
        this.f15136a = context;
        this.f1669a = file;
    }

    public static void a(Context context, File file, Runnable runnable) {
        new v(context, file, runnable).run();
    }

    public abstract void a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = null;
        try {
            try {
                if (this.f1669a == null) {
                    this.f1669a = new File(this.f15136a.getFilesDir(), "default_locker");
                }
                tVar = t.a(this.f15136a, this.f1669a);
                Runnable runnable = this.f1670a;
                if (runnable != null) {
                    runnable.run();
                }
                a(this.f15136a);
                if (tVar == null) {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (tVar == null) {
                    return;
                }
            }
            tVar.a();
        } catch (Throwable th) {
            if (tVar != null) {
                tVar.a();
            }
            throw th;
        }
    }

    public /* synthetic */ u(Context context, File file, v vVar) {
        this(context, file);
    }
}
