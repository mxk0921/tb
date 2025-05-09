package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import tb.a7o;
import tb.cgd;
import tb.obn;
import tb.rbn;
import tb.trq;
import tb.xan;
import tb.z6o;
import tb.zan;
import tb.zc8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RemoteResolver implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f9263a;
    public final obn b;
    public final zan c;
    public final f d;
    public final i e;
    public final h f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class RemoteAdvancedInfo {
        public SoIndexData.SoFileInfo compressedLocal;
        public SoIndexData.SoFileInfo compressedRemote;
        public SoIndexData.SoFileInfo diffBase;
        public SoIndexData.SoFileInfo diffPatch;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9264a;
        public final /* synthetic */ SoInfo2.Ext b;
        public final /* synthetic */ RemoteAdvancedInfo c;
        public final /* synthetic */ d.a d;

        public a(z6o z6oVar, SoInfo2.Ext ext, RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
            this.f9264a = z6oVar;
            this.b = ext;
            this.c = remoteAdvancedInfo;
            this.d = aVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
                return;
            }
            String d = a7oVar.d();
            if (a7oVar.b() != null || trq.c(d)) {
                RSoLog.d("RemoteResolver -> remoteDiffPatch failed, will tryRemoteCompressedResolve");
                RemoteResolver.c(RemoteResolver.this, this.f9264a, this.b, this.c, this.d);
                return;
            }
            RSoLog.d("RemoteResolver -> tryRemoteDiffPatchResolve complete, lib=" + this.f9264a.b());
            this.d.a(a7oVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9265a;
        public final /* synthetic */ d.a b;

        public b(z6o z6oVar, d.a aVar) {
            this.f9265a = z6oVar;
            this.b = aVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
            } else if (RemoteResolver.d(RemoteResolver.this).a("fallback_raw_download_disabled", true)) {
                RSoLog.d("RemoteResolver -> tryRemoteCompressedResolve without rawDownload complete, lib=" + this.f9265a.b());
                this.b.a(a7oVar);
            } else {
                String d = a7oVar.d();
                if (a7oVar.b() != null || trq.c(d)) {
                    RSoLog.d("RemoteResolver -> remoteCompressed failed, will doRawDownload");
                    RemoteResolver.h(RemoteResolver.this, this.f9265a, this.b);
                    return;
                }
                RSoLog.d("RemoteResolver -> tryRemoteCompressedResolve complete, lib=" + this.f9265a.b());
                this.b.a(a7oVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends zc8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9266a;
        public final /* synthetic */ z6o b;
        public final /* synthetic */ d.a c;

        public c(RemoteResolver remoteResolver, String str, z6o z6oVar, d.a aVar) {
            this.f9266a = str;
            this.b = z6oVar;
            this.c = aVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 193844431) {
                super.a((xan) objArr[0], (RSoException) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/resolver2/RemoteResolver$3");
        }

        @Override // tb.zc8, tb.fgd
        public void a(xan xanVar, RSoException rSoException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8dd4cf", new Object[]{this, xanVar, rSoException});
                return;
            }
            super.a(xanVar, rSoException);
            if (rSoException == null) {
                RSoLog.d("download -> resolve successfully , lib=" + this.f9266a);
                this.c.a(a7o.k(this.b, xanVar.g(), "download"));
                return;
            }
            RSoLog.d("download -> resolve failed , lib=" + this.f9266a);
            this.c.a(a7o.a(this.b, "download", rSoException));
        }
    }

    public RemoteResolver(cgd cgdVar, obn obnVar, zan zanVar, f fVar, i iVar, h hVar) {
        this.f9263a = cgdVar;
        this.b = obnVar;
        this.c = zanVar;
        this.d = fVar;
        this.e = iVar;
        this.f = hVar;
    }

    public static /* synthetic */ void c(RemoteResolver remoteResolver, z6o z6oVar, SoInfo2.Ext ext, RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8834c08e", new Object[]{remoteResolver, z6oVar, ext, remoteAdvancedInfo, aVar});
        } else {
            remoteResolver.f(z6oVar, ext, remoteAdvancedInfo, aVar);
        }
    }

    public static /* synthetic */ cgd d(RemoteResolver remoteResolver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgd) ipChange.ipc$dispatch("d96e97c8", new Object[]{remoteResolver});
        }
        return remoteResolver.f9263a;
    }

    public static /* synthetic */ void h(RemoteResolver remoteResolver, z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bd712f", new Object[]{remoteResolver, z6oVar, aVar});
        } else {
            remoteResolver.e(z6oVar, aVar);
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb25e99", new Object[]{this});
        }
        return "Remote";
    }

    public final void e(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4594d1a2", new Object[]{this, z6oVar, aVar});
            return;
        }
        String b2 = z6oVar.b();
        this.c.c(j.d(b2, z6oVar.j(), z6oVar.e(), this.b), new c(this, b2, z6oVar, aVar));
    }

    public final void f(z6o z6oVar, SoInfo2.Ext ext, RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4964d5a", new Object[]{this, z6oVar, ext, remoteAdvancedInfo, aVar});
        } else if (!ext.remoteCompressed) {
            RSoLog.d("RemoteResolver -> skip remote compressed;  ext.remoteCompressed == false, lib=" + z6oVar.b());
            e(z6oVar, aVar);
        } else {
            RSoLog.d("RemoteResolver -> tryRemoteCompressedResolve start, lib=" + z6oVar.b());
            this.f.e(z6oVar, remoteAdvancedInfo, new b(z6oVar, aVar));
        }
    }

    public final void g(z6o z6oVar, SoInfo2.Ext ext, RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472dcf7a", new Object[]{this, z6oVar, ext, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.d("RemoteResolver -> tryRemoteDiffPatchResolve start, lib=" + z6oVar.b());
        a aVar2 = new a(z6oVar, ext, remoteAdvancedInfo, aVar);
        if (ext.remoteDiffPatch) {
            this.e.f(z6oVar, remoteAdvancedInfo, aVar2);
        } else if (ext.inApkDiffPatch) {
            this.d.e(z6oVar, remoteAdvancedInfo, aVar2);
        } else {
            RSoLog.d("RemoteResolver -> skip diff patch;  ext.remoteDiffPatch == false, lib=" + z6oVar.b());
            f(z6oVar, ext, remoteAdvancedInfo, aVar);
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public void a(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fb7dd7", new Object[]{this, z6oVar, aVar});
            return;
        }
        z6oVar.b();
        if (!j.i(this.f9263a, z6oVar, aVar)) {
            if (this.f9263a.a("switch_force_disable_advanced", false)) {
                rbn.e("RemoteResolver -> ", "SWITCH_FORCE_DISABLE_ADVANCED=true , libName=" + z6oVar.b());
                e(z6oVar, aVar);
                return;
            }
            SoInfo2 k = z6oVar.k();
            if (k == null) {
                RSoLog.d("RemoteResolver -> fallback raw download, soInfo2 == null");
                e(z6oVar, aVar);
                return;
            }
            RemoteAdvancedInfo n = j.n(k);
            if (n == null) {
                RSoLog.d("RemoteResolver -> fallback raw download, advancedInfo == null");
                e(z6oVar, aVar);
                return;
            }
            try {
                g(z6oVar, k.ext, n, aVar);
            } catch (Throwable th) {
                rbn.g("RemoteResolver -> tryRemoteDiffPatchResolve error", th);
                e(z6oVar, aVar);
            }
        }
    }
}
