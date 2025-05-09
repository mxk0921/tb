package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.d;
import tb.a7o;
import tb.abn;
import tb.bbn;
import tb.cgd;
import tb.obn;
import tb.rbn;
import tb.trq;
import tb.xan;
import tb.z6o;
import tb.zan;
import tb.zc8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f9277a;
    public final zan b;
    public final bbn c;
    public final obn d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends zc8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9278a;
        public final /* synthetic */ d.a b;
        public final /* synthetic */ String c;
        public final /* synthetic */ SoIndexData.SoFileInfo d;

        public a(z6o z6oVar, d.a aVar, String str, SoIndexData.SoFileInfo soFileInfo) {
            this.f9278a = z6oVar;
            this.b = aVar;
            this.c = str;
            this.d = soFileInfo;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 193844431) {
                super.a((xan) objArr[0], (RSoException) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/resolver2/RemoteCompressedResolver$1");
        }

        @Override // tb.zc8, tb.fgd
        public void a(xan xanVar, RSoException rSoException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8dd4cf", new Object[]{this, xanVar, rSoException});
                return;
            }
            super.a(xanVar, rSoException);
            if (rSoException != null) {
                h.a(h.this, this.f9278a, this.b, rSoException);
                return;
            }
            String g = xanVar.g();
            if (trq.c(g)) {
                RSoLog.d("RemoteCompressedResolver -> download file path is empty , lib=" + this.c);
                RSoException error = RSoException.error(5004);
                h.a(h.this, this.f9278a, this.b, error);
                rbn.g("download-extract,error", error);
                return;
            }
            RSoLog.d("RemoteCompressedResolver -> resolve successfully from [downloader in diff patch] , lib=" + this.c);
            this.d.setUri(g);
            h.b(h.this, this.f9278a, this.d, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements bbn.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9279a;
        public final /* synthetic */ d.a b;
        public final /* synthetic */ String c;

        public b(z6o z6oVar, d.a aVar, String str) {
            this.f9279a = z6oVar;
            this.b = aVar;
            this.c = str;
        }

        @Override // tb.bbn.b
        public void a(abn abnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7319aaaa", new Object[]{this, abnVar});
                return;
            }
            String c = abnVar.c();
            RSoException b = abnVar.b();
            if (b != null) {
                h.a(h.this, this.f9279a, this.b, b);
            } else if (trq.c(c)) {
                RSoLog.d("RemoteCompressedResolver -> extractedPath is empty , lib=" + this.c);
                RSoException error = RSoException.error(5004);
                h.a(h.this, this.f9279a, this.b, error);
                rbn.g("download-extract,extract,error", error);
            } else {
                this.b.a(a7o.k(this.f9279a, c, "download-extract"));
            }
        }
    }

    public h(cgd cgdVar, zan zanVar, bbn bbnVar, obn obnVar) {
        this.f9277a = cgdVar;
        this.b = zanVar;
        this.c = bbnVar;
        this.d = obnVar;
    }

    public static /* synthetic */ void a(h hVar, z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfe4b71", new Object[]{hVar, z6oVar, aVar, rSoException});
        } else {
            hVar.f(z6oVar, aVar, rSoException);
        }
    }

    public static /* synthetic */ void b(h hVar, z6o z6oVar, SoIndexData.SoFileInfo soFileInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6c8cff", new Object[]{hVar, z6oVar, soFileInfo, aVar});
        } else {
            hVar.d(z6oVar, soFileInfo, aVar);
        }
    }

    public final void c(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8eb8bc", new Object[]{this, z6oVar, remoteAdvancedInfo, aVar});
            return;
        }
        SoIndexData.SoFileInfo soFileInfo = remoteAdvancedInfo.compressedRemote;
        SoIndexData.SoFileInfo soFileInfo2 = remoteAdvancedInfo.compressedLocal;
        if (soFileInfo == null || soFileInfo2 == null) {
            rbn.e("RemoteCompressedResolver -> info == null", "downloadSoInfo == null || extractSoInfo == null");
            f(z6oVar, aVar, RSoException.error(6103, "illegal arguments"));
            return;
        }
        String b2 = z6oVar.b();
        this.b.c(j.d(b2, soFileInfo, z6oVar.e(), this.d), new a(z6oVar, aVar, b2, soFileInfo2));
    }

    public final void d(z6o z6oVar, SoIndexData.SoFileInfo soFileInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f885ae5f", new Object[]{this, z6oVar, soFileInfo, aVar});
            return;
        }
        String b2 = z6oVar.b();
        this.c.d(b2, z6oVar.c(), this.d.a(z6oVar.j().provideStorageKey()), soFileInfo, new b(z6oVar, aVar, b2));
    }

    public final void f(z6o z6oVar, d.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d32dcbd", new Object[]{this, z6oVar, aVar, rSoException});
            return;
        }
        z6oVar.b();
        aVar.a(a7o.a(z6oVar, "download-extract", rSoException));
    }

    public void e(z6o z6oVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d431b9", new Object[]{this, z6oVar, remoteAdvancedInfo, aVar});
        } else if (this.f9277a.a("switch_compressed_remote_disabled", false)) {
            rbn.e("RemoteCompressedResolver -> ", "switch force disable diff patch , libName=" + z6oVar.b());
            f(z6oVar, aVar, RSoException.error(6102, "switch off"));
        } else {
            c(z6oVar, remoteAdvancedInfo, aVar);
        }
    }
}
