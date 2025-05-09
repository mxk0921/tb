package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.d;
import tb.a7o;
import tb.cgd;
import tb.rbn;
import tb.z6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f9269a;
    public final f b;
    public final i c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9270a;
        public final /* synthetic */ d.a b;

        public a(z6o z6oVar, d.a aVar) {
            this.f9270a = z6oVar;
            this.b = aVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
                return;
            }
            RSoException b = a7oVar.b();
            if (b != null) {
                RSoLog.d("DiffResolver -> tryDiffPatchResolve failed, will tryRemoteCompressedResolve");
                b.c(b.this, this.f9270a, this.b, b);
                return;
            }
            RSoLog.d("DiffResolver -> tryDiffPatchResolve succ, lib=" + this.f9270a.b());
            this.b.a(a7oVar.l("diff-patch-resolver"));
        }
    }

    public b(cgd cgdVar, f fVar, i iVar) {
        this.f9269a = cgdVar;
        this.b = fVar;
        this.c = iVar;
    }

    public static /* synthetic */ void c(b bVar, z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a73cc0f", new Object[]{bVar, z6oVar, aVar, rSoException});
        } else {
            bVar.d(z6oVar, aVar, rSoException);
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public void a(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fb7dd7", new Object[]{this, z6oVar, aVar});
            return;
        }
        SoInfo2 k = z6oVar.k();
        if (k == null) {
            RSoLog.d("DiffResolver -> fallback , soInfo2 == null");
            d(z6oVar, aVar, RSoException.error(6302));
            return;
        }
        RemoteResolver.RemoteAdvancedInfo n = j.n(k);
        if (n == null) {
            RSoLog.d("DiffResolver -> fallback , advancedInfo == null");
            d(z6oVar, aVar, RSoException.error(6302));
            return;
        }
        try {
            e(z6oVar, k.ext, n, aVar);
        } catch (Throwable th) {
            rbn.g("DiffResolver -> tryRemoteDiffPatchResolve error", th);
            d(z6oVar, aVar, RSoException.error(6300));
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb25e99", new Object[]{this});
        }
        return "diffpatch";
    }

    public final void d(z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6983884", new Object[]{this, z6oVar, aVar, rSoException});
        } else {
            aVar.a(a7o.a(z6oVar, "diff-patch-resolver", rSoException));
        }
    }

    public final void e(z6o z6oVar, SoInfo2.Ext ext, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798799e0", new Object[]{this, z6oVar, ext, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.d("DiffResolver -> tryDiffPatchResolve start, lib=" + z6oVar.b());
        a aVar2 = new a(z6oVar, aVar);
        if (ext.remoteDiffPatch) {
            this.c.f(z6oVar, remoteAdvancedInfo, aVar2);
        } else if (ext.inApkDiffPatch) {
            this.b.e(z6oVar, remoteAdvancedInfo, aVar2);
        } else {
            RSoLog.d("DiffResolver -> skip diff patch;  ext.*DiffPatch all disabled, lib=" + z6oVar.b());
            d(z6oVar, aVar, RSoException.error(6301));
        }
    }
}
