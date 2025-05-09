package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.d;
import java.io.File;
import tb.a7o;
import tb.cgd;
import tb.egd;
import tb.kgd;
import tb.obn;
import tb.qbn;
import tb.qm2;
import tb.rbn;
import tb.trq;
import tb.xan;
import tb.z6o;
import tb.zan;
import tb.zc8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f9280a;
    public final zan b;
    public final obn c;
    public final egd d;
    public final cgd e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9281a;
        public final /* synthetic */ RemoteResolver.RemoteAdvancedInfo b;
        public final /* synthetic */ d.a c;

        public a(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
            this.f9281a = z6oVar;
            this.b = remoteAdvancedInfo;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                i.a(i.this, this.f9281a, this.b, this.c);
            } catch (Throwable th) {
                rbn.g("diff-patch, error", th);
                i.b(i.this, this.f9281a, this.c, RSoException.error(6203, th));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends zc8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9282a;
        public final /* synthetic */ d.a b;
        public final /* synthetic */ File c;

        public b(z6o z6oVar, d.a aVar, File file) {
            this.f9282a = z6oVar;
            this.b = aVar;
            this.c = file;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 193844431) {
                super.a((xan) objArr[0], (RSoException) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/resolver2/RemoteDiffPatchResolver$2");
        }

        @Override // tb.zc8, tb.fgd
        public void a(xan xanVar, RSoException rSoException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8dd4cf", new Object[]{this, xanVar, rSoException});
                return;
            }
            super.a(xanVar, rSoException);
            try {
                i.c(i.this, xanVar, rSoException, this.f9282a, this.b, this.c);
            } catch (Throwable th) {
                i.b(i.this, this.f9282a, this.b, RSoException.error(6210, th));
            }
        }
    }

    public i(kgd kgdVar, zan zanVar, obn obnVar, egd egdVar, cgd cgdVar) {
        this.f9280a = kgdVar;
        this.b = zanVar;
        this.c = obnVar;
        this.d = egdVar;
        this.e = cgdVar;
    }

    public static /* synthetic */ void a(i iVar, z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca2b706", new Object[]{iVar, z6oVar, remoteAdvancedInfo, aVar});
        } else {
            iVar.e(z6oVar, remoteAdvancedInfo, aVar);
        }
    }

    public static /* synthetic */ void b(i iVar, z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d980db0a", new Object[]{iVar, z6oVar, aVar, rSoException});
        } else {
            iVar.g(z6oVar, aVar, rSoException);
        }
    }

    public static /* synthetic */ void c(i iVar, xan xanVar, RSoException rSoException, z6o z6oVar, d.a aVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed810fd8", new Object[]{iVar, xanVar, rSoException, z6oVar, aVar, file});
        } else {
            iVar.d(xanVar, rSoException, z6oVar, aVar, file);
        }
    }

    public final void d(xan xanVar, RSoException rSoException, z6o z6oVar, d.a aVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d306d652", new Object[]{this, xanVar, rSoException, z6oVar, aVar, file});
            return;
        }
        String b2 = z6oVar.b();
        String g = xanVar.g();
        if (rSoException != null || trq.c(g)) {
            g(z6oVar, aVar, RSoException.error(6205, "patch file not found"));
            return;
        }
        File file2 = new File(g);
        if (!file2.isFile()) {
            g(z6oVar, aVar, RSoException.error(6205, "patch file not found"));
            return;
        }
        File file3 = new File(this.c.b(z6oVar.c(), z6oVar.j().provideStorageKey()));
        egd.a a2 = ((qm2) this.d).a(this.f9280a.getApp(), file, file2, file3);
        if (!a2.f18557a) {
            g(z6oVar, aVar, RSoException.error(6206, "patchSuccess = false, resultCode = " + a2.b));
        } else if (!this.f9280a.a(z6oVar.d(), file3.getPath())) {
            g(z6oVar, aVar, RSoException.error(6207, "newLibFile md5 not match, newLibFile.length = " + file3.length() + "newLibFile.path = " + file3.getPath()));
        } else {
            RSoLog.d("RemoteDiffPatchResolver -> resolve successfully from diff patch , lib=" + b2);
            aVar.a(a7o.k(z6oVar, file3.getPath(), "diff-patch"));
        }
    }

    public final void e(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f8b3d4", new Object[]{this, z6oVar, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.d("RemoteDiffPatchResolver -> start resolve by diff patch , lib=" + z6oVar.b());
        SoIndexData.SoFileInfo soFileInfo = remoteAdvancedInfo.diffBase;
        SoIndexData.SoFileInfo soFileInfo2 = remoteAdvancedInfo.diffPatch;
        if (soFileInfo == null || soFileInfo2 == null) {
            g(z6oVar, aVar, RSoException.error(6208, "diffBase == null || patchInfo == null"));
            return;
        }
        String b2 = z6oVar.b();
        File k = j.k(b2, z6oVar.k(), soFileInfo, this.c);
        if (k == null) {
            g(z6oVar, aVar, RSoException.error(6204, "base file not found"));
        } else {
            this.b.c(j.d(b2, soFileInfo2, z6oVar.e(), this.c), new b(z6oVar, aVar, k));
        }
    }

    public final void g(z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d32dcbd", new Object[]{this, z6oVar, aVar, rSoException});
        } else {
            aVar.a(a7o.a(z6oVar, "diff-patch", rSoException));
        }
    }

    public void f(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d431b9", new Object[]{this, z6oVar, remoteAdvancedInfo, aVar});
        } else if (this.e.a("switch_diff_patch_disabled", false)) {
            rbn.e("diff-patch, switch off", "switch force disable diff patch , libName=" + z6oVar.b());
            g(z6oVar, aVar, RSoException.error(6202, "switch off"));
        } else {
            qbn.d(new a(z6oVar, remoteAdvancedInfo, aVar));
        }
    }
}
