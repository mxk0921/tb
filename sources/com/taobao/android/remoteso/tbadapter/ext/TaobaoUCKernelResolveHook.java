package com.taobao.android.remoteso.tbadapter.ext;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import com.taobao.android.remoteso.resolver2.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a7o;
import tb.cgd;
import tb.ebi;
import tb.egd;
import tb.ggd;
import tb.gk4;
import tb.hgd;
import tb.jg9;
import tb.kgd;
import tb.kx4;
import tb.lt8;
import tb.mv2;
import tb.obn;
import tb.qbn;
import tb.qm2;
import tb.rbn;
import tb.trq;
import tb.van;
import tb.xan;
import tb.z6o;
import tb.zc8;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TaobaoUCKernelResolveHook implements com.taobao.android.remoteso.resolver2.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f9288a;
    public final cgd b;
    public final obn c;
    public final ggd d;
    public final hgd e;
    public final egd f;
    public final com.taobao.android.remoteso.resolver2.e g;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class UCAdvancedInfo {
        public SoIndexData.SoFileInfo baseInfo;
        public final List<UCInnerFileInfo> innerFileInfoList = new ArrayList();
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class UCInnerFileInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SoIndexData.SoFileInfo newInfo;
        public SoIndexData.SoFileInfo oldInfo;
        public SoIndexData.SoFileInfo patchInfo;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "UCInnerFileInfo{oldInfo=" + this.oldInfo + ", newInfo=" + this.newInfo + ", patchInfo=" + this.patchInfo + '}';
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements mv2<UCInnerFileInfo, SoIndexData.SoFileInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        }

        /* renamed from: a */
        public SoIndexData.SoFileInfo call(UCInnerFileInfo uCInnerFileInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("c0e0f4d6", new Object[]{this, uCInnerFileInfo});
            }
            SoIndexData.SoFileInfo soFileInfo = uCInnerFileInfo.newInfo;
            if (soFileInfo != null) {
                return soFileInfo;
            }
            throw new RuntimeException("not allow newInfo == null, " + uCInnerFileInfo);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9289a;
        public final /* synthetic */ d.a b;

        public b(z6o z6oVar, d.a aVar) {
            this.f9289a = z6oVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RSoLog.d("TBUCResolveHook, real resolve enter, req = " + this.f9289a.b());
            try {
                TaobaoUCKernelResolveHook.c(TaobaoUCKernelResolveHook.this, "stageStart");
                SoInfo2 k = this.f9289a.k();
                if (k == null) {
                    RSoLog.d("TBUCResolveHook, soInfo2 not available, doNormalResolve");
                    TaobaoUCKernelResolveHook.d(TaobaoUCKernelResolveHook.this, this.f9289a, this.b);
                    return;
                }
                UCAdvancedInfo uCAdvancedInfo = (UCAdvancedInfo) JSON.parseObject(k.advancedInfo, UCAdvancedInfo.class);
                if (uCAdvancedInfo == null) {
                    RSoLog.d("TBUCResolveHook, ucAdvancedInfo not available, doNormalResolve");
                    TaobaoUCKernelResolveHook.d(TaobaoUCKernelResolveHook.this, this.f9289a, this.b);
                    return;
                }
                TaobaoUCKernelResolveHook.c(TaobaoUCKernelResolveHook.this, "stageInfoEnd");
                this.f9289a.f().c("stage1");
                File e = TaobaoUCKernelResolveHook.e(TaobaoUCKernelResolveHook.this, this.f9289a, uCAdvancedInfo);
                if (e == null) {
                    RSoLog.d("TBUCResolveHook, oldUCDir not available, doNormalResolve");
                    TaobaoUCKernelResolveHook.d(TaobaoUCKernelResolveHook.this, this.f9289a, this.b);
                    return;
                }
                this.f9289a.f().d("stage1_end", "stage1");
                TaobaoUCKernelResolveHook.c(TaobaoUCKernelResolveHook.this, "stageOldDirEnd");
                File file = new File(TaobaoUCKernelResolveHook.f(TaobaoUCKernelResolveHook.this).a(this.f9289a.j().provideStorageKey()), "uc_dir");
                jg9.h(file);
                jg9.d(file);
                TaobaoUCKernelResolveHook.c(TaobaoUCKernelResolveHook.this, "stageNewDirEnd");
                List<xan> g = TaobaoUCKernelResolveHook.g(TaobaoUCKernelResolveHook.this, uCAdvancedInfo.innerFileInfoList, file);
                TaobaoUCKernelResolveHook taobaoUCKernelResolveHook = TaobaoUCKernelResolveHook.this;
                f fVar = new f(new g(taobaoUCKernelResolveHook, this.f9289a, this.b, uCAdvancedInfo, e, file, null), new e(taobaoUCKernelResolveHook, null));
                f.d(fVar).set(g.size());
                for (xan xanVar : g) {
                    xanVar.a(fVar);
                    TaobaoUCKernelResolveHook.j(TaobaoUCKernelResolveHook.this).b(xanVar);
                }
                this.f9289a.f().c("stage2");
                RSoLog.d("TBUCResolveHook, diffPatch task scheduled,  task count=" + g.size());
            } catch (Throwable th) {
                rbn.g("TBUCResolveHook, tryDiffPatch", th);
                TaobaoUCKernelResolveHook.d(TaobaoUCKernelResolveHook.this, this.f9289a, this.b);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements mv2<UCInnerFileInfo, SoIndexData.SoFileInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        }

        /* renamed from: a */
        public SoIndexData.SoFileInfo call(UCInnerFileInfo uCInnerFileInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("c0e0f4d6", new Object[]{this, uCInnerFileInfo});
            }
            SoIndexData.SoFileInfo soFileInfo = uCInnerFileInfo.newInfo;
            if (soFileInfo != null) {
                return soFileInfo;
            }
            throw new RuntimeException("not allow newInfo == null, " + uCInnerFileInfo);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements mv2<UCInnerFileInfo, SoIndexData.SoFileInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        }

        /* renamed from: a */
        public SoIndexData.SoFileInfo call(UCInnerFileInfo uCInnerFileInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("c0e0f4d6", new Object[]{this, uCInnerFileInfo});
            }
            return uCInnerFileInfo.oldInfo;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f extends zc8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final gk4<Integer, Void> c;
        public final g f;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f9291a = new AtomicInteger();
        public final Map<String, Integer> d = new ConcurrentHashMap();
        public volatile RSoException g = null;

        public f(g gVar, gk4<Integer, Void> gk4Var) {
            this.f = gVar;
            this.c = gk4Var;
        }

        public static /* synthetic */ AtomicInteger d(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicInteger) ipChange.ipc$dispatch("7ba7fc7b", new Object[]{fVar});
            }
            return fVar.f9291a;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 193844431) {
                super.a((xan) objArr[0], (RSoException) objArr[1]);
                return null;
            } else if (hashCode == 880291618) {
                super.b((xan) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/remoteso/tbadapter/ext/TaobaoUCKernelResolveHook$UCKernelDownloadCallback");
            }
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
                this.g = rSoException;
            }
            if (this.f9291a.decrementAndGet() <= 0) {
                this.f.a(this.g);
            }
        }

        @Override // tb.zc8, tb.fgd
        public void b(xan xanVar, int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34782f22", new Object[]{this, xanVar, new Integer(i)});
                return;
            }
            super.b(xanVar, i);
            ((ConcurrentHashMap) this.d).put(xanVar.j(), Integer.valueOf(i));
            Collection<Integer> values = ((ConcurrentHashMap) this.d).values();
            int size = values.size();
            for (Integer num : values) {
                i2 += num.intValue() / size;
            }
            this.c.a(Integer.valueOf(i2));
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final z6o f9292a;
        public final d.a b;
        public final UCAdvancedInfo c;
        public final File d;
        public final File e;

        public /* synthetic */ g(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, z6o z6oVar, d.a aVar, UCAdvancedInfo uCAdvancedInfo, File file, File file2, a aVar2) {
            this(z6oVar, aVar, uCAdvancedInfo, file, file2);
        }

        public g(z6o z6oVar, d.a aVar, UCAdvancedInfo uCAdvancedInfo, File file, File file2) {
            this.f9292a = z6oVar;
            this.b = aVar;
            this.c = uCAdvancedInfo;
            this.d = file;
            this.e = file2;
        }

        public void a(RSoException rSoException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82f22862", new Object[]{this, rSoException});
            } else if (rSoException != null) {
                RSoLog.d("TBUCResolveHook, downloadFailed");
                if (TaobaoUCKernelResolveHook.u(TaobaoUCKernelResolveHook.this).a("uc_fallback_raw_download_disabled", true)) {
                    this.b.a(j.f(this.f9292a, rSoException, "resolve-hook"));
                } else {
                    TaobaoUCKernelResolveHook.d(TaobaoUCKernelResolveHook.this, this.f9292a, this.b);
                }
            } else {
                this.f9292a.f().d("stage2_end", "stage2");
                TaobaoUCKernelResolveHook.c(TaobaoUCKernelResolveHook.this, "stageDownloadEnd");
                try {
                    this.f9292a.f().c("stage3");
                    TaobaoUCKernelResolveHook.h(TaobaoUCKernelResolveHook.this, 99);
                    TaobaoUCKernelResolveHook.i(TaobaoUCKernelResolveHook.this, this.c.innerFileInfoList, this.d, this.e);
                    this.f9292a.f().d("stage3_end", "stage3");
                    TaobaoUCKernelResolveHook.h(TaobaoUCKernelResolveHook.this, 100);
                    TaobaoUCKernelResolveHook.c(TaobaoUCKernelResolveHook.this, "stagePatchEnd");
                    this.b.a(j.h(this.f9292a, this.e.getPath(), "resolve-hook"));
                } catch (Throwable th) {
                    rbn.g("TBUCResolveHook, patchAndVerify", th);
                    TaobaoUCKernelResolveHook.d(TaobaoUCKernelResolveHook.this, this.f9292a, this.b);
                }
            }
        }
    }

    public TaobaoUCKernelResolveHook(kgd kgdVar, cgd cgdVar, obn obnVar, ggd ggdVar, hgd hgdVar, egd egdVar, com.taobao.android.remoteso.resolver2.e eVar) {
        this.f9288a = kgdVar;
        this.b = cgdVar;
        this.c = obnVar;
        this.d = ggdVar;
        this.e = hgdVar;
        this.f = egdVar;
        this.g = eVar;
    }

    public static /* synthetic */ void c(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b5e7b4", new Object[]{taobaoUCKernelResolveHook, str});
        } else {
            taobaoUCKernelResolveHook.q(str);
        }
    }

    public static /* synthetic */ void d(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e89e2c5", new Object[]{taobaoUCKernelResolveHook, z6oVar, aVar});
        } else {
            taobaoUCKernelResolveHook.l(z6oVar, aVar);
        }
    }

    public static /* synthetic */ File e(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, z6o z6oVar, UCAdvancedInfo uCAdvancedInfo) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ea987c8a", new Object[]{taobaoUCKernelResolveHook, z6oVar, uCAdvancedInfo});
        }
        return taobaoUCKernelResolveHook.p(z6oVar, uCAdvancedInfo);
    }

    public static /* synthetic */ obn f(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (obn) ipChange.ipc$dispatch("cc8f23c6", new Object[]{taobaoUCKernelResolveHook});
        }
        return taobaoUCKernelResolveHook.c;
    }

    public static /* synthetic */ List g(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, List list, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1463479", new Object[]{taobaoUCKernelResolveHook, list, file});
        }
        return taobaoUCKernelResolveHook.k(list, file);
    }

    public static /* synthetic */ void h(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f08d1c8", new Object[]{taobaoUCKernelResolveHook, new Integer(i)});
        } else {
            taobaoUCKernelResolveHook.s(i);
        }
    }

    public static /* synthetic */ void i(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, List list, File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4853319", new Object[]{taobaoUCKernelResolveHook, list, file, file2});
        } else {
            taobaoUCKernelResolveHook.m(list, file, file2);
        }
    }

    public static /* synthetic */ ggd j(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggd) ipChange.ipc$dispatch("b1c67f6f", new Object[]{taobaoUCKernelResolveHook});
        }
        return taobaoUCKernelResolveHook.d;
    }

    public static /* synthetic */ cgd u(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgd) ipChange.ipc$dispatch("361c776b", new Object[]{taobaoUCKernelResolveHook});
        }
        return taobaoUCKernelResolveHook.b;
    }

    @Override // com.taobao.android.remoteso.resolver2.e
    public a7o b(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("aa101ea1", new Object[]{this, z6oVar});
        }
        if (!trq.d("kernelu4_7z_uc", z6oVar.b())) {
            return this.g.b(z6oVar);
        }
        a7o o = o(z6oVar);
        try {
            return n(z6oVar, o);
        } catch (Throwable th) {
            rbn.g("TBUCResolveHook, peek-filter", th);
            return o;
        }
    }

    public final List<xan> k(List<UCInnerFileInfo> list, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c4827566", new Object[]{this, list, file});
        }
        ArrayList arrayList = new ArrayList();
        for (UCInnerFileInfo uCInnerFileInfo : list) {
            r(file, uCInnerFileInfo.newInfo, arrayList);
            r(file, uCInnerFileInfo.patchInfo, arrayList);
        }
        RSoLog.d("TBUCResolveHook, buildRequests done,  " + arrayList);
        return arrayList;
    }

    public final void l(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51c53cd", new Object[]{this, z6oVar, aVar});
            return;
        }
        RSoLog.d("TBUCResolveHook, doNormalResolve, " + z6oVar);
        this.g.a(z6oVar, aVar);
    }

    public final void m(List<UCInnerFileInfo> list, File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941b6f59", new Object[]{this, list, file, file2});
            return;
        }
        RSoLog.d("TBUCResolveHook, doPatchAndVerify(), enter");
        for (UCInnerFileInfo uCInnerFileInfo : list) {
            RSoLog.d("TBUCResolveHook, doPatchAndVerify(), handle ucInnerFileInfo, " + uCInnerFileInfo);
            SoIndexData.SoFileInfo soFileInfo = uCInnerFileInfo.newInfo;
            File file3 = new File(file2, soFileInfo.getUri());
            if (file3.exists()) {
                RSoLog.d("TBUCResolveHook, doPatchAndVerify(), newFile exists, " + file3);
            } else {
                SoIndexData.SoFileInfo soFileInfo2 = uCInnerFileInfo.oldInfo;
                if (soFileInfo2 != null) {
                    File file4 = new File(file, soFileInfo2.getUri());
                    if (!file4.exists()) {
                        throw new RuntimeException("doPatchAndVerify, oldFile not exists, oldFile=" + file4);
                    } else if (trq.d(soFileInfo.getMd5(), soFileInfo2.getMd5())) {
                        jg9.a(file4, file3);
                        RSoLog.d("TBUCResolveHook, doPatchAndVerify(), newFile copy succ, " + file3);
                    } else {
                        SoIndexData.SoFileInfo soFileInfo3 = uCInnerFileInfo.patchInfo;
                        if (soFileInfo3 != null) {
                            File file5 = new File(file2, soFileInfo3.getUri());
                            if (file5.exists()) {
                                egd.a a2 = ((qm2) this.f).a(this.f9288a.getApp(), file4, file5, file3);
                                if (a2.f18557a) {
                                    RSoLog.d("TBUCResolveHook, doPatchAndVerify(), newFile patch succ, " + file3);
                                } else {
                                    throw new RuntimeException("doPatchAndVerify, apply patch failed, errorCode=" + a2.b);
                                }
                            } else {
                                throw new RuntimeException("doPatchAndVerify, patchFile not exists, patchFile=" + file5);
                            }
                        } else {
                            throw new RuntimeException("doPatchAndVerify, patchInfo==null, ucInnerFileInfo=" + uCInnerFileInfo);
                        }
                    }
                } else {
                    throw new RuntimeException("doPatchAndVerify, oldInfo==null, ucInnerFileInfo=" + uCInnerFileInfo);
                }
            }
        }
        if (t(file2, list, new c(this))) {
            File file6 = new File(file2, ".validated");
            try {
                if (!file6.createNewFile()) {
                    rbn.e("TBUCResolveHook", file6.toString());
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("doPatchAndVerify, verified failed, newUCDir=" + jg9.k(file2, false));
        }
    }

    public final a7o o(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("fea34dce", new Object[]{this, z6oVar});
        }
        a7o b2 = this.g.b(z6oVar);
        if (b2.j()) {
            RSoLog.d("TBUCResolveHook, peek kernel from lib, peek=" + b2);
            return b2;
        }
        String a2 = this.c.a(z6oVar.j().provideStorageKey());
        if (trq.c(a2)) {
            RSoLog.d("TBUCResolveHook, peek kernel failed, lib dir path is empty, req=" + z6oVar);
            return j.f(z6oVar, RSoException.error(6005, "libDirPath is empty"), "resolve-hook");
        }
        File file = new File(a2);
        File file2 = new File(file, "uc_dir");
        if (!file.isDirectory() || !file2.isDirectory()) {
            RSoLog.d("TBUCResolveHook, peek kernel failed, libDir or ucDir is not directory, req=" + z6oVar);
            return j.f(z6oVar, RSoException.error(6005, "libDir or ucDir not available"), "resolve-hook");
        } else if (!new File(file2, ".validated").isFile()) {
            RSoLog.d("TBUCResolveHook, peek kernel failed, validatedTag is not file, req=" + z6oVar);
            return j.f(z6oVar, RSoException.error(6005, "validatedTag is not file"), "resolve-hook");
        } else {
            RSoLog.d("TBUCResolveHook, peek kernel success, ucDir=" + file2);
            return j.h(z6oVar, file2.getPath(), "resolve-hook");
        }
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3be87c", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count_type", str);
        rbn.d("custom_count", hashMap);
    }

    public final void r(File file, SoIndexData.SoFileInfo soFileInfo, List<xan> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4fb3e86", new Object[]{this, file, soFileInfo, list});
        } else if (soFileInfo != null && !trq.c(soFileInfo.getFrom())) {
            String from = soFileInfo.getFrom();
            String path = file.getPath();
            String uri = soFileInfo.getUri();
            list.add(new xan("_", from, path, uri, file.getPath() + soFileInfo.getUri(), soFileInfo.getMd5(), soFileInfo.getLength()));
        }
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
            return;
        }
        RSoLog.d("TBUCResolveHook,  final updateProgress = " + i);
        van.f().h().c("kernelu4_7z_uc", i);
    }

    public final boolean t(File file, List<UCInnerFileInfo> list, mv2<UCInnerFileInfo, SoIndexData.SoFileInfo> mv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab7e4e0", new Object[]{this, file, list, mv2Var})).booleanValue();
        }
        RSoLog.d("TBUCResolveHook, verifyInnerFiles, enter, ucDir=" + file);
        if (!file.isDirectory()) {
            RSoLog.d("TBUCResolveHook, verifyInnerFiles, ucDir is not dir, ucDir=" + file);
            return false;
        }
        for (UCInnerFileInfo uCInnerFileInfo : list) {
            SoIndexData.SoFileInfo call = mv2Var.call(uCInnerFileInfo);
            if (call == null) {
                RSoLog.d("TBUCResolveHook, oldInfo = null, file=" + uCInnerFileInfo);
            } else {
                File file2 = new File(file, call.getUri());
                if (!file2.isFile() || file2.length() != call.getLength() || !ebi.d(call.getMd5(), file2.getPath())) {
                    RSoLog.d("TBUCResolveHook, fileVerifySucc = false, file=" + file2);
                    return false;
                }
                RSoLog.d("TBUCResolveHook, verified, file=" + file2);
            }
        }
        RSoLog.d("TBUCResolveHook, verifyInnerFiles, all success, ucDir=" + file);
        return true;
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements gk4<Integer, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile int f9290a;

        public e() {
            this.f9290a = -1;
        }

        /* renamed from: b */
        public Void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("4135db69", new Object[]{this, num});
            }
            if (num.intValue() <= this.f9290a || num.intValue() > 98) {
                return null;
            }
            this.f9290a = num.intValue();
            TaobaoUCKernelResolveHook.h(TaobaoUCKernelResolveHook.this, num.intValue());
            return null;
        }

        public /* synthetic */ e(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, a aVar) {
            this();
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.e
    public void a(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4f855b", new Object[]{this, z6oVar, aVar});
        } else if (!trq.d("kernelu4_7z_uc", z6oVar.b())) {
            this.g.a(z6oVar, aVar);
        } else if (!this.b.a("key_diff_patch_for_uc_enabled", true)) {
            RSoLog.d("TBUCResolveHook, config key_diff_patch_for_uc_enabled=false, doNormalResolve");
            this.g.a(z6oVar, aVar);
        } else {
            qbn.d(new b(z6oVar, aVar));
        }
    }

    public final a7o n(z6o z6oVar, a7o a7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("f183eba7", new Object[]{this, z6oVar, a7oVar});
        }
        if (!this.b.a("key_enable_uc_dir_force_filter", false)) {
            return a7oVar;
        }
        RSoLog.d("TBUCResolveHook, filterUCDirResult(), enableUcDirForceFilter");
        if (!a7oVar.j()) {
            RSoLog.d("TBUCResolveHook, filterUCDirResult(), result failed");
            return a7oVar;
        }
        File file = new File(a7oVar.f());
        if (!file.isDirectory()) {
            RSoLog.d("TBUCResolveHook, filterUCDirResult(), result is not dir");
            return a7oVar;
        } else if (!kx4.a(this.f9288a.getApp(), (int) TimeUnit.HOURS.toSeconds(2L))) {
            RSoLog.d("TBUCResolveHook, filterUCDirResult(), isAtCrashRisk = false");
            return a7oVar;
        } else {
            SoInfo2 k = z6oVar.k();
            if (k == null) {
                RSoLog.d("TBUCResolveHook, filterUCDirResult(), soInfo2 not available");
                return a7oVar;
            }
            UCAdvancedInfo uCAdvancedInfo = (UCAdvancedInfo) JSON.parseObject(k.advancedInfo, UCAdvancedInfo.class);
            if (uCAdvancedInfo != null) {
                return t(file, uCAdvancedInfo.innerFileInfoList, new a(this)) ? a7oVar : j.f(z6oVar, RSoException.error(6209), "resolve-hook");
            }
            RSoLog.d("TBUCResolveHook, filterUCDirResult(), ucAdvancedInfo not available");
            return a7oVar;
        }
    }

    public final File p(z6o z6oVar, UCAdvancedInfo uCAdvancedInfo) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("bd5a2ae8", new Object[]{this, z6oVar, uCAdvancedInfo});
        }
        RSoLog.d("TBUCResolveHook, prepareOldUCDir(), enter, " + z6oVar.b());
        a7o o = o(z6o.i(z6oVar.b(), uCAdvancedInfo.baseInfo, z6oVar.k()));
        if (!o.j()) {
            RSoLog.d("TBUCResolveHook, prepareOldUCDir(), skip, baseResult failed , result=" + o);
            return null;
        }
        d dVar = new d(this);
        List<UCInnerFileInfo> list = uCAdvancedInfo.innerFileInfoList;
        String f2 = o.f();
        RSoLog.d("TBUCResolveHook, prepareOldUCDir(), ready to verify oldDir, , list=" + list + ", oldUCPath=" + f2);
        File file = new File(f2);
        if (file.isFile()) {
            File file2 = new File(file.getParentFile(), "uc_dir");
            if (t(file2, list, dVar)) {
                RSoLog.d("TBUCResolveHook, prepareOldUCDir(), verified origin oldUCDir succ, " + jg9.k(file2, false));
                return file2;
            }
            RSoLog.d("TBUCResolveHook, prepareOldUCDir(), verified origin oldUCDir failed, ready to extract old lib " + f2);
            ((lt8) this.e).a(this.f9288a.getApp(), f2, file2.getPath(), false);
            if (t(file2, list, dVar)) {
                return file2;
            }
            RSoLog.d("TBUCResolveHook, prepareOldUCDir(), verified extracted oldUCDir failed, " + jg9.k(file2, false));
            return null;
        } else if (!file.isDirectory()) {
            return null;
        } else {
            if (t(file, list, dVar)) {
                return file;
            }
            RSoLog.d("TBUCResolveHook, prepareOldUCDir(), verified dir oldUCFile failed, " + jg9.k(file, false));
            return null;
        }
    }
}
