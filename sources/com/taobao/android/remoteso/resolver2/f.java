package com.taobao.android.remoteso.resolver2;

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
import tb.kd1;
import tb.kgd;
import tb.obn;
import tb.qbn;
import tb.qm2;
import tb.rbn;
import tb.z6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f9273a;
    public final obn b;
    public final egd c;
    public final cgd d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9274a;
        public final /* synthetic */ RemoteResolver.RemoteAdvancedInfo b;
        public final /* synthetic */ d.a c;

        public a(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
            this.f9274a = z6oVar;
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
                f.a(f.this, this.f9274a, this.b, this.c);
            } catch (Throwable th) {
                rbn.g("diff-patch, error", th);
                f.b(f.this, this.f9274a, this.c, RSoException.error(6203, th));
            }
        }
    }

    public f(kgd kgdVar, obn obnVar, egd egdVar, cgd cgdVar) {
        this.f9273a = kgdVar;
        this.b = obnVar;
        this.c = egdVar;
        this.d = cgdVar;
    }

    public static /* synthetic */ void a(f fVar, z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9959b99", new Object[]{fVar, z6oVar, remoteAdvancedInfo, aVar});
        } else {
            fVar.d(z6oVar, remoteAdvancedInfo, aVar);
        }
    }

    public static /* synthetic */ void b(f fVar, z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6012e335", new Object[]{fVar, z6oVar, aVar, rSoException});
        } else {
            fVar.f(z6oVar, aVar, rSoException);
        }
    }

    public final File c(String str, SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9ef35dc3", new Object[]{this, str, soFileInfo});
        }
        String uri = soFileInfo.getUri();
        String a2 = this.b.a(soFileInfo.provideStorageKey());
        File file = new File(a2, "tmp-diff/" + str + ".patch");
        if (!kd1.a(this.f9273a.getApp(), uri, file)) {
            rbn.e("diff-patch, copyPatchFileResult = false", "");
            return null;
        } else if (!file.isFile()) {
            rbn.e("diff-patch, patchFile.isFile = false", "");
            return null;
        } else if (this.f9273a.a(soFileInfo.getMd5(), file.getPath())) {
            return file;
        } else {
            rbn.e("diff-patch, patchFile md5 not match", "");
            return null;
        }
    }

    public final void d(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f8b3d4", new Object[]{this, z6oVar, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.d("InApkDiffPatchResolver -> start resolve by diff patch , lib=" + z6oVar.b());
        SoIndexData.SoFileInfo soFileInfo = remoteAdvancedInfo.diffBase;
        SoIndexData.SoFileInfo soFileInfo2 = remoteAdvancedInfo.diffPatch;
        if (soFileInfo == null || soFileInfo2 == null) {
            f(z6oVar, aVar, RSoException.error(6208, "diffBase == null || patchInfo == null"));
            return;
        }
        String b = z6oVar.b();
        File k = j.k(b, z6oVar.k(), soFileInfo, this.b);
        if (k == null) {
            f(z6oVar, aVar, RSoException.error(6204, "base file not found"));
            return;
        }
        RSoLog.d("InApkDiffPatchResolver -> found baseFile, " + k);
        File c = c(b, soFileInfo2);
        if (c == null) {
            f(z6oVar, aVar, RSoException.error(6205, "patch file not found"));
            return;
        }
        RSoLog.d("InApkDiffPatchResolver -> found patchFile, " + c);
        File file = new File(this.b.b(z6oVar.c(), z6oVar.j().provideStorageKey()));
        RSoLog.d("InApkDiffPatchResolver -> do apply patch to newLibFile, " + file);
        egd.a a2 = ((qm2) this.c).a(this.f9273a.getApp(), k, c, file);
        if (!a2.f18557a) {
            throw RSoException.error(6206, "patchSuccess = false, resultCode = " + a2.b);
        } else if (this.f9273a.a(z6oVar.d(), file.getPath())) {
            RSoLog.d("InApkDiffPatchResolver -> resolve successfully from diff patch , lib=" + b);
            aVar.a(a7o.k(z6oVar, file.getPath(), "diff-patch"));
        } else {
            throw RSoException.error(6207, "newLibFile md5 not match, newLibFile.length = " + file.length() + "newLibFile.path = " + file.getPath());
        }
    }

    public final void f(z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d32dcbd", new Object[]{this, z6oVar, aVar, rSoException});
        } else {
            aVar.a(a7o.a(z6oVar, "diff-patch", rSoException));
        }
    }

    public void e(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d431b9", new Object[]{this, z6oVar, remoteAdvancedInfo, aVar});
        } else if (this.d.a("switch_diff_patch_disabled", false)) {
            rbn.e("diff-patch, switch off", "switch force disable diff patch , libName=" + z6oVar.b());
            f(z6oVar, aVar, RSoException.error(6202, "switch off"));
        } else {
            qbn.d(new a(z6oVar, remoteAdvancedInfo, aVar));
        }
    }
}
