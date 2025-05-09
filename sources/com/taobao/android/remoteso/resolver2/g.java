package com.taobao.android.remoteso.resolver2;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.config.RSoConfig;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import tb.a7o;
import tb.jg9;
import tb.kgd;
import tb.obn;
import tb.qbn;
import tb.trq;
import tb.uos;
import tb.z6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f9275a;
    public final obn b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9276a;
        public final /* synthetic */ d.a b;

        public a(z6o z6oVar, d.a aVar) {
            this.f9276a = z6oVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.b.a(a7o.k(this.f9276a, g.c(g.this, this.f9276a), RSoConfig.TYPE_INAPK));
            } catch (Throwable th) {
                this.b.a(a7o.a(this.f9276a, RSoConfig.TYPE_INAPK, RSoException.error(5006, th)));
            }
        }
    }

    public g(kgd kgdVar, obn obnVar) {
        this.f9275a = kgdVar;
        this.b = obnVar;
    }

    public static /* synthetic */ String c(g gVar, z6o z6oVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3f80930", new Object[]{gVar, z6oVar});
        }
        return gVar.d(z6oVar);
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public void a(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fb7dd7", new Object[]{this, z6oVar, aVar});
        } else {
            qbn.d(new a(z6oVar, aVar));
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb25e99", new Object[]{this});
        }
        return "InApk";
    }

    public final String d(z6o z6oVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed543b5", new Object[]{this, z6oVar});
        }
        RSoLog.d("InApkSoResolver -> resolve(), - start ");
        Application app = this.f9275a.getApp();
        String str = app.getApplicationInfo().nativeLibraryDir + File.separator + z6oVar.g();
        String b = this.b.b(z6oVar.c(), z6oVar.j().provideStorageKey());
        if (!trq.c(b)) {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                String str2 = b + ".tmp";
                File file = new File(str2);
                jg9.c(fileInputStream, file);
                if (this.f9275a.a(z6oVar.d(), str2)) {
                    File file2 = new File(b);
                    if (file.renameTo(file2)) {
                        RSoLog.d("InApkSoResolver -> resolve(), success, soPathInApk=" + str + ", tmpFilePath=" + str2 + ", targetSoFilePath=" + b);
                        fileInputStream.close();
                        return b;
                    }
                    throw new RuntimeException("rename failed,  from=" + file + ", to=" + file2);
                }
                throw new RuntimeException("md5 not matched, delete=" + uos.e(file));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } else {
            throw new NullPointerException("InApkSoResolver -> resolve(), targetSoFilePath == null");
        }
    }
}
