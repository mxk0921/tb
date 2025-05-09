package com.taobao.taopai.material.maires;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.maires.MaiResDependenceList;
import com.taobao.taopai.material.maires.a;
import com.taobao.taopai.material.maires.b;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.crc;
import tb.m6o;
import tb.mk4;
import tb.ovu;
import tb.t2o;
import tb.t8i;
import tb.u8i;
import tb.zpc;
import tb.ztl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13367a;
    public String b;
    public int c;
    public zpc e;
    public final Map<String, MaiResDependenceList.MaiResDependenceItem> f = new HashMap();
    public final Map<String, Long> g = new HashMap();
    public final Runnable h = new Runnable() { // from class: tb.iyh
        @Override // java.lang.Runnable
        public final void run() {
            a.this.w();
        }
    };
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taopai.material.maires.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class RunnableC0763a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13368a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public RunnableC0763a(String str, int i, String str2) {
            this.f13368a = str;
            this.b = i;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.e(a.this) == null || !a.f(a.this).containsKey(this.f13368a)) {
            } else {
                if (this.b == 0) {
                    ((MaiResDependenceList.MaiResDependenceItem) a.f(a.this).get(this.f13368a)).isDownloadSuccess = true;
                    if (a.g(a.this)) {
                        a.e(a.this).a();
                        a.h(a.this);
                        return;
                    }
                    return;
                }
                a.e(a.this).b(this.b, this.c);
                a.h(a.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final /* synthetic */ void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e736495", new Object[]{this, new Integer(i)});
                return;
            }
            if (a.e(a.this) != null) {
                a.e(a.this).b(i, "read config fail");
            }
            a.h(a.this);
        }

        public void c(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db15a7df", new Object[]{this, new Integer(i)});
            } else {
                a.j(a.this).post(new Runnable() { // from class: tb.myh
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.this.b(i);
                    }
                });
            }
        }

        public void d(MaiResDependenceList maiResDependenceList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bdd8478", new Object[]{this, maiResDependenceList});
            } else {
                a.i(a.this, maiResDependenceList);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements crc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13370a;

        public c(String str) {
            this.f13370a = str;
        }

        @Override // tb.crc
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            String str4 = "download error " + str2 + "|" + str3;
            new StringBuilder(" fail = ").append(str4);
            a.this.x(this.f13370a, -1, str4);
        }

        @Override // tb.crc
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                return;
            }
            new StringBuilder(" success path = ").append(str2);
            a.this.x(this.f13370a, 0, "");
        }

        @Override // tb.crc
        public void onProgress(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
            } else {
                new StringBuilder(" progress = ").append(i);
            }
        }
    }

    static {
        t2o.a(782237770);
    }

    public a(Context context) {
    }

    public static /* synthetic */ zpc e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpc) ipChange.ipc$dispatch("8fcafad8", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ Map f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("acea8e6d", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15c2ddb", new Object[]{aVar})).booleanValue();
        }
        return aVar.s();
    }

    public static /* synthetic */ void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959a9d76", new Object[]{aVar});
        } else {
            aVar.o();
        }
    }

    public static /* synthetic */ void i(a aVar, MaiResDependenceList maiResDependenceList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995fb7e2", new Object[]{aVar, maiResDependenceList});
        } else {
            aVar.n(maiResDependenceList);
        }
    }

    public static /* synthetic */ Handler j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("afd6d92", new Object[]{aVar});
        }
        return aVar.d;
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a945525", new Object[]{this, str});
        } else {
            new com.taobao.taopai.material.maires.b().c(str, new b());
        }
    }

    public void l(String str, String str2, int i, String str3, int i2, zpc zpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e8b9ab", new Object[]{this, str, str2, new Integer(i), str3, new Integer(i2), zpcVar});
        } else if (TextUtils.isEmpty(str3)) {
            zpcVar.b(-3, "params invalid");
        } else {
            ((HashMap) this.g).clear();
            ((HashMap) this.f).clear();
            this.b = str;
            this.f13367a = str2;
            this.c = i;
            this.e = zpcVar;
            y(i2);
            k(str3);
        }
    }

    public void m(String str, String str2, int i, zpc zpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2711b8ba", new Object[]{this, str, str2, new Integer(i), zpcVar});
        } else {
            l(str, str, 1, str2, i, zpcVar);
        }
    }

    public final void n(MaiResDependenceList maiResDependenceList) {
        List<MaiResDependenceList.MaiResDependenceItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b646121e", new Object[]{this, maiResDependenceList});
        } else if (maiResDependenceList == null || (list = maiResDependenceList.mDependenceList) == null || list.isEmpty()) {
            ovu.b(new Runnable() { // from class: tb.jyh
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.t();
                }
            });
        } else {
            for (MaiResDependenceList.MaiResDependenceItem maiResDependenceItem : maiResDependenceList.mDependenceList) {
                if (TextUtils.equals(maiResDependenceItem.type, "algorithm")) {
                    String str = maiResDependenceItem.type + "_" + maiResDependenceItem.name;
                    ((HashMap) this.f).put(str, maiResDependenceItem);
                    r(str, maiResDependenceItem);
                } else if (TextUtils.equals(maiResDependenceItem.type, "font")) {
                    String valueOf = String.valueOf(maiResDependenceItem.id);
                    ((HashMap) this.f).put(valueOf, maiResDependenceItem);
                    p(maiResDependenceItem.materialType, maiResDependenceItem.version, String.valueOf(maiResDependenceItem.id), maiResDependenceItem.url, valueOf);
                }
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.d.removeCallbacks(this.h);
        this.e = null;
    }

    public final void p(int i, int i2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9b9de9", new Object[]{this, new Integer(i), new Integer(i2), str, str2, str3});
            return;
        }
        String i3 = ztl.i(str3, false);
        if (!TextUtils.isEmpty(i3) && new File(i3).exists()) {
            String valueOf = String.valueOf(str2.hashCode());
            File[] listFiles = new File(i3).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    if (TextUtils.equals(valueOf, file.getName()) && t8i.i(file)) {
                        x(str3, 0, "");
                        return;
                    }
                }
            }
        }
        q(i, i2, str, str2, str3);
    }

    public final void q(int i, int i2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9c4e17", new Object[]{this, new Integer(i), new Integer(i2), str, str2, str3});
            return;
        }
        c cVar = new c(str3);
        u8i u8iVar = new u8i(i, i2, str, str2);
        u8iVar.h(false);
        u8iVar.r(ztl.b(str3, str2));
        new m6o(u8iVar, cVar).e();
    }

    public final void r(final String str, final MaiResDependenceList.MaiResDependenceItem maiResDependenceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c1eab9", new Object[]{this, str, maiResDependenceItem});
        } else {
            MaterialDataServer.y(this.b, this.f13367a, this.c).A(maiResDependenceItem.materialGroup, maiResDependenceItem.materialType, str).subscribe(new mk4() { // from class: tb.kyh
                public final void accept(Object obj) {
                    a.this.u(maiResDependenceItem, str, (MaiResResponseModel) obj);
                }
            }, new mk4() { // from class: tb.lyh
                public final void accept(Object obj) {
                    a.this.v((Throwable) obj);
                }
            });
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29d934d7", new Object[]{this})).booleanValue();
        }
        for (Object obj : ((HashMap) this.f).keySet()) {
            if (!((MaiResDependenceList.MaiResDependenceItem) ((HashMap) this.f).get(obj)).isDownloadSuccess) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634f17c2", new Object[]{this});
        } else {
            this.e.a();
        }
    }

    public final /* synthetic */ void u(MaiResDependenceList.MaiResDependenceItem maiResDependenceItem, String str, MaiResResponseModel maiResResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d667f780", new Object[]{this, maiResDependenceItem, str, maiResResponseModel});
        } else if (maiResResponseModel == null || TextUtils.isEmpty(maiResResponseModel.resourceUrl)) {
            zpc zpcVar = this.e;
            if (zpcVar != null) {
                zpcVar.b(6, "data is empty");
                o();
            }
        } else {
            new StringBuilder("mai download url = ").append(maiResResponseModel.resourceUrl);
            ((HashMap) this.g).put(maiResDependenceItem.name, Long.valueOf(SystemClock.elapsedRealtime()));
            maiResDependenceItem.url = maiResResponseModel.resourceUrl;
            int i = maiResResponseModel.version;
            maiResDependenceItem.version = i;
            p(maiResResponseModel.materialType, i, String.valueOf(maiResResponseModel.id), maiResResponseModel.resourceUrl, str);
        }
    }

    public final /* synthetic */ void v(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f695b4bb", new Object[]{this, th});
            return;
        }
        zpc zpcVar = this.e;
        if (zpcVar != null) {
            zpcVar.b(6, th.getMessage());
        }
        o();
    }

    public void x(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff6543d", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        StringBuilder sb = new StringBuilder("onDownLoaderFinish ");
        sb.append(str);
        sb.append(", code = ");
        sb.append(i);
        sb.append(" msg = ");
        sb.append(str2);
        this.d.post(new RunnableC0763a(str, i, str2));
    }

    public final void y(int i) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8fa71e", new Object[]{this, new Integer(i)});
            return;
        }
        this.d.removeCallbacks(this.h);
        Handler handler = this.d;
        Runnable runnable = this.h;
        if (i >= 1000 || i <= 0) {
            j = 120000;
        } else {
            j = i * 1000;
        }
        handler.postDelayed(runnable, j);
    }

    public final /* synthetic */ void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe10c416", new Object[]{this});
            return;
        }
        zpc zpcVar = this.e;
        if (zpcVar != null) {
            zpcVar.b(1, "timeout");
        }
    }
}
