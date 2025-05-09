package com.alibaba.ability.impl.downloader.downloadcenter;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Result;
import tb.ckf;
import tb.gh9;
import tb.njg;
import tb.oc9;
import tb.onf;
import tb.rv7;
import tb.t2o;
import tb.tu7;
import tb.upl;
import tb.xhv;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DownloadCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DownloadCenter INSTANCE = new DownloadCenter();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f1938a = kotlin.a.b(DownloadCenter$tasks$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum DownloadError {
        OUT_OF_SPACE,
        NETWORK_ERROR,
        FILE_MD5_ERROR,
        FILE_SIZE_ERROR,
        FAILED,
        UNKNOWN_ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DownloadError downloadError, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/downloader/downloadcenter/DownloadCenter$DownloadError");
        }

        public static DownloadError valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("4134ed70", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(DownloadError.class, str);
            }
            return (DownloadError) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f1939a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Long g;
        public final c h;

        static {
            t2o.a(104857608);
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, Long l, c cVar) {
            ckf.g(str, "url");
            ckf.g(str2, "urlMd5");
            ckf.g(str3, "businessId");
            ckf.g(str4, "fileName");
            ckf.g(str5, "fileDirPath");
            this.f1939a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = l;
            this.h = cVar;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
            }
            return this.c;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fedc5af9", new Object[]{this});
            }
            return this.e;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
            }
            return this.d;
        }

        public final c d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ccb23c5a", new Object[]{this});
            }
            return this.h;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
            }
            return this.f;
        }

        public final Long f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Long) ipChange.ipc$dispatch("ba4453d7", new Object[]{this});
            }
            return this.g;
        }

        public final String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.f1939a;
        }

        public final String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a89a4394", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ConcurrentSkipListSet<a> f1940a = new ConcurrentSkipListSet<>(a.INSTANCE);
        public final int b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a<T> implements Comparator<a> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            /* renamed from: a */
            public final int compare(a aVar, a aVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("6e2efdc5", new Object[]{this, aVar, aVar2})).intValue();
                }
                if (ckf.b(aVar, aVar2)) {
                    return 0;
                }
                return ckf.i(aVar.hashCode(), aVar2.hashCode());
            }
        }

        static {
            t2o.a(104857609);
        }

        public b(int i) {
            this.b = i;
        }

        public final ConcurrentSkipListSet<a> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConcurrentSkipListSet) ipChange.ipc$dispatch("8c0f1361", new Object[]{this});
            }
            return this.f1940a;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("16006df0", new Object[]{this})).intValue();
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a(DownloadError downloadError, String str);

        void onCancel();

        void onProgress(int i);

        void onSuccess(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f1941a;

        public d(a aVar) {
            this.f1941a = aVar;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            b bVar = (b) DownloadCenter.a(DownloadCenter.INSTANCE).remove(this.f1941a.h());
            if (bVar != null) {
                Iterator<a> it = bVar.a().iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (i == -21) {
                        c d = next.d();
                        if (d != null) {
                            d.a(DownloadError.OUT_OF_SPACE, str2);
                        }
                    } else if (i == -16) {
                        c d2 = next.d();
                        if (d2 != null) {
                            d2.onCancel();
                        }
                    } else if (i != -12) {
                        c d3 = next.d();
                        if (d3 != null) {
                            d3.a(DownloadError.UNKNOWN_ERROR, str2);
                        }
                    } else {
                        c d4 = next.d();
                        if (d4 != null) {
                            d4.a(DownloadError.NETWORK_ERROR, str2);
                        }
                    }
                }
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            Object obj;
            String str3;
            long j;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            try {
                b bVar = (b) DownloadCenter.a(DownloadCenter.INSTANCE).remove(this.f1941a.h());
                xhv xhvVar = null;
                String str4 = null;
                xhvVar = null;
                xhvVar = null;
                if (!(bVar == null || str2 == null)) {
                    if (str2.length() > 0) {
                        str3 = str2;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        File file = new File(str2);
                        if (!file.exists() || !file.isFile()) {
                            Iterator<a> it = bVar.a().iterator();
                            while (it.hasNext()) {
                                c d = it.next().d();
                                if (d != null) {
                                    d.a(DownloadError.FAILED, "download file not valid");
                                }
                            }
                        } else {
                            Iterator<a> it2 = bVar.a().iterator();
                            Long l = null;
                            while (it2.hasNext()) {
                                a next = it2.next();
                                if (next.e() != null) {
                                    String e = next.e();
                                    if (str4 == null) {
                                        str4 = oc9.d(file);
                                        xhv xhvVar2 = xhv.INSTANCE;
                                    }
                                    if (!ckf.b(e, str4)) {
                                        c d2 = next.d();
                                        if (d2 != null) {
                                            d2.a(DownloadError.FILE_MD5_ERROR, "file md5 is " + str4 + " not " + next.e());
                                        }
                                    }
                                }
                                if (next.f() != null) {
                                    Long f = next.f();
                                    if (l != null) {
                                        j = l.longValue();
                                    } else {
                                        j = file.length();
                                        l = Long.valueOf(j);
                                        xhv xhvVar3 = xhv.INSTANCE;
                                    }
                                    if (f != null && f.longValue() == j) {
                                    }
                                    c d3 = next.d();
                                    if (d3 != null) {
                                        d3.a(DownloadError.FILE_SIZE_ERROR, "file size is " + l + " not " + next.f());
                                    }
                                }
                                String str5 = next.b() + File.separator + next.c();
                                if (TextUtils.equals(str2, str5)) {
                                    z = true;
                                } else if (!gh9.INSTANCE.b(str2, str5)) {
                                    c d4 = next.d();
                                    if (d4 != null) {
                                        d4.a(DownloadError.UNKNOWN_ERROR, "copy file fail");
                                    }
                                }
                                c d5 = next.d();
                                if (d5 != null) {
                                    d5.onSuccess(str5);
                                }
                            }
                            if (!z) {
                                file.delete();
                            }
                        }
                        xhvVar = xhv.INSTANCE;
                    }
                }
                obj = Result.m1108constructorimpl(xhvVar);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Result.m1111exceptionOrNullimpl(obj);
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            b bVar = (b) DownloadCenter.a(DownloadCenter.INSTANCE).get(this.f1941a.h());
            if (bVar != null) {
                Iterator<a> it = bVar.a().iterator();
                while (it.hasNext()) {
                    c d = it.next().d();
                    if (d != null) {
                        d.onProgress(i);
                    }
                }
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    static {
        t2o.a(104857606);
    }

    public static final /* synthetic */ ConcurrentHashMap a(DownloadCenter downloadCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("f346260e", new Object[]{downloadCenter});
        }
        return downloadCenter.e();
    }

    public final void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e019be74", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "downloadInfo");
        b bVar = e().get(aVar.h());
        if (bVar == null) {
            return;
        }
        if (bVar.a().size() > 1) {
            bVar.a().remove(aVar);
            c d2 = aVar.d();
            if (d2 != null) {
                d2.onCancel();
                return;
            }
            return;
        }
        rv7.e().a(bVar.b());
    }

    public final void c(a aVar) {
        ConcurrentSkipListSet<a> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f875582", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "downloadInfo");
        b bVar = e().get(aVar.h());
        if (bVar == null || (a2 = bVar.a()) == null) {
            ConcurrentHashMap<String, b> e = e();
            String h = aVar.h();
            b bVar2 = new b(d(aVar));
            bVar2.a().add(aVar);
            xhv xhvVar = xhv.INSTANCE;
            e.put(h, bVar2);
            return;
        }
        a2.add(aVar);
    }

    public final int d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40077511", new Object[]{this, aVar})).intValue();
        }
        zu7 zu7Var = new zu7();
        upl uplVar = zu7Var.b;
        uplVar.f29547a = aVar.a();
        uplVar.h = false;
        uplVar.g = aVar.b();
        List<onf> list = zu7Var.f33016a;
        onf onfVar = new onf();
        onfVar.f25507a = aVar.g();
        onfVar.d = aVar.c();
        xhv xhvVar = xhv.INSTANCE;
        list.add(onfVar);
        return rv7.e().b(zu7Var, new d(aVar));
    }

    public final ConcurrentHashMap<String, b> e() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("670618a7", new Object[]{this});
        } else {
            value = f1938a.getValue();
        }
        return (ConcurrentHashMap) value;
    }
}
