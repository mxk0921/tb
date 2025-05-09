package com.taobao.taopai.material.jni;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.jni.ResourceJniInteract;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.specified.SpecifiedFilterResultBean;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.crc;
import tb.dai;
import tb.f4w;
import tb.frc;
import tb.irc;
import tb.k7i;
import tb.m6o;
import tb.mk4;
import tb.ovu;
import tb.t2o;
import tb.t8i;
import tb.u8i;
import tb.vrq;
import tb.y9i;
import tb.ztl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ResourceJniInteract {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_BIZ_LINE = "guangguang";
    private static final String DEFAULT_BIZ_SCENE = "guangguang";
    private static final String TAG = "Material-Resource";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements irc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13365a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public a(String str, long j, long j2) {
            this.f13365a = str;
            this.b = j;
            this.c = j2;
        }

        @Override // tb.irc
        public void f(SpecifiedFilterResultBean specifiedFilterResultBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f000f6f1", new Object[]{this, specifiedFilterResultBean});
                return;
            }
            List<MaterialDetailBean> list = specifiedFilterResultBean.mMaterialList;
            if (list == null || list.size() <= 0) {
                long j = this.b;
                if (j != -1) {
                    ResourceJniInteract.onResourcePathResult(j, this.c, this.f13365a, "", "data is empty");
                }
            } else {
                ResourceJniInteract.access$000("getMaterialWithId", this.f13365a, this.b, this.c, null, specifiedFilterResultBean.mMaterialList.get(0), "");
            }
            new StringBuilder("getMaterialWithId success ").append(specifiedFilterResultBean.toString());
        }

        @Override // tb.pjd
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("getMaterialWithId fail ");
            sb.append(str);
            sb.append(", errorInfo = ");
            sb.append(str2);
            long j = this.b;
            if (j != -1) {
                ResourceJniInteract.onResourcePathResult(j, this.c, this.f13365a, "", str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements crc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13366a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ frc e;
        public final /* synthetic */ long f;

        public b(String str, String str2, long j, long j2, frc frcVar, long j3) {
            this.f13366a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
            this.e = frcVar;
            this.f = j3;
        }

        public static /* synthetic */ void g(long j, long j2, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc76cc6a", new Object[]{new Long(j), new Long(j2), str, str2});
            } else {
                ResourceJniInteract.onResourcePathResult(j, j2, str, "", str2);
            }
        }

        public static /* synthetic */ void h(frc frcVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b127e03", new Object[]{frcVar, str, str2});
            } else {
                frcVar.onFail(str, str2);
            }
        }

        public static /* synthetic */ void i(long j, long j2, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9e409b", new Object[]{new Long(j), new Long(j2), str, str2});
            } else {
                ResourceJniInteract.onResourcePathResult(j, j2, str, str2, "");
            }
        }

        public static /* synthetic */ void j(frc frcVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e84cbd5", new Object[]{frcVar, str});
            } else {
                frcVar.onSuccess(str);
            }
        }

        @Override // tb.crc
        public void a(String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            final String str4 = "download error " + str2 + "|" + str3;
            final long j = this.c;
            if (j != -1) {
                final long j2 = this.d;
                final String str5 = this.b;
                ovu.b(new Runnable() { // from class: tb.z7o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourceJniInteract.b.g(j, j2, str5, str4);
                    }
                });
            } else {
                final frc frcVar = this.e;
                if (frcVar != null) {
                    ovu.b(new Runnable() { // from class: tb.a8o
                        @Override // java.lang.Runnable
                        public final void run() {
                            ResourceJniInteract.b.h(frc.this, str2, str3);
                        }
                    });
                }
            }
            y9i.b().e(this.b);
            dai.e(this.b, str2, str3, System.currentTimeMillis() - this.f);
        }

        @Override // tb.crc
        public void b(String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                return;
            }
            y9i.b().e(this.b);
            final long j = this.c;
            if (j != -1) {
                final long j2 = this.d;
                final String str3 = this.b;
                ovu.b(new Runnable() { // from class: tb.x7o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourceJniInteract.b.i(j, j2, str3, str2);
                    }
                });
            } else {
                final frc frcVar = this.e;
                if (frcVar != null) {
                    ovu.b(new Runnable() { // from class: tb.y7o
                        @Override // java.lang.Runnable
                        public final void run() {
                            ResourceJniInteract.b.j(frc.this, str2);
                        }
                    });
                }
            }
            dai.e(this.b, "0", "", System.currentTimeMillis() - this.f);
        }

        @Override // tb.crc
        public void onProgress(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13366a);
            sb.append(" progress = ");
            sb.append(i);
        }
    }

    static {
        t2o.a(782237761);
    }

    public static /* synthetic */ void access$000(String str, String str2, long j, long j2, frc frcVar, MaterialDetailBean materialDetailBean, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ce7c95", new Object[]{str, str2, new Long(j), new Long(j2), frcVar, materialDetailBean, str3});
        } else {
            downloadFile(str, str2, j, j2, frcVar, materialDetailBean, str3);
        }
    }

    private static void downloadByTag(final String str, final long j, final long j2, final frc<String> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5735ef", new Object[]{str, new Long(j), new Long(j2), frcVar});
        } else {
            MaterialDataServer.y("guangguang", "guangguang", 1).A(158001, 104, str).subscribe(new mk4() { // from class: tb.s7o
                public final void accept(Object obj) {
                    long j3 = j;
                    long j4 = j2;
                    ResourceJniInteract.lambda$downloadByTag$44(str, j3, j4, frcVar, (MaiResResponseModel) obj);
                }
            }, new mk4() { // from class: tb.t7o
                public final void accept(Object obj) {
                    long j3 = j;
                    long j4 = j2;
                    ResourceJniInteract.lambda$downloadByTag$46(frc.this, j3, j4, str, (Throwable) obj);
                }
            });
        }
    }

    private static void downloadFile(String str, String str2, long j, long j2, frc<String> frcVar, MaterialDetailBean materialDetailBean, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a28d2c9", new Object[]{str, str2, new Long(j), new Long(j2), frcVar, materialDetailBean, str3});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        y9i.b().a(str2, null);
        b bVar = new b(str, str2, j, j2, frcVar, currentTimeMillis);
        u8i u8iVar = new u8i(materialDetailBean.materialType, materialDetailBean.getVersion(), String.valueOf(materialDetailBean.getTid()), materialDetailBean.getResourceUrl());
        if (!TextUtils.isEmpty(str3)) {
            u8iVar.q(str3);
        }
        u8iVar.h(false);
        u8iVar.r(ztl.b(str2, materialDetailBean.resourceUrl));
        new m6o(u8iVar, bVar).e();
    }

    private static void downloadMaterialById(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24f1a12", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        a aVar = new a(str, j, j2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(vrq.c(str, 0L)));
        new k7i().q0("guangguang", "guangguang", 720, arrayList, aVar);
    }

    public static String getResourceFromCacheWithIdOrTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2377ead", new Object[]{str});
        }
        if (y9i.b().d(str)) {
            return "";
        }
        String i = ztl.i(str, false);
        if (TextUtils.isEmpty(i)) {
            return "";
        }
        File file = new File(i);
        if (file.exists()) {
            return t8i.e(file);
        }
        new StringBuilder("getResourceFromCacheWithIdOrTag not found ").append(str);
        return "";
    }

    public static void getResourcePathForMaterialWithId(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e3abb9", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        String resourceFromCacheWithIdOrTag = getResourceFromCacheWithIdOrTag(str);
        if (TextUtils.isEmpty(resourceFromCacheWithIdOrTag)) {
            downloadMaterialById(str, j2, j);
        } else {
            onResourcePathResult(j, j2, str, resourceFromCacheWithIdOrTag, "");
        }
    }

    public static void getResourcePathForMaterialWithTag(String str, frc<String> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20766cc1", new Object[]{str, frcVar});
        } else if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "getResourcePathForMaterialWithTag  Tag is null");
        } else {
            getResourcePathForMaterialWithTag(str, -1L, -1L, frcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$downloadByTag$44(String str, long j, long j2, final frc frcVar, MaiResResponseModel maiResResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e927241", new Object[]{str, new Long(j), new Long(j2), frcVar, maiResResponseModel});
        } else if (maiResResponseModel != null && !TextUtils.isEmpty(maiResResponseModel.resourceUrl)) {
            downloadFile("getMaterialWithTag", str, j, j2, frcVar, maiResResponseModel, str);
        } else if (frcVar != null) {
            ovu.b(new Runnable(f4w.LOAD_DATA_NULL) { // from class: tb.v7o
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceJniInteract.lambda$null$43(frc.this, f4w.LOAD_DATA_NULL);
                }
            });
        } else if (j != -1) {
            onResourcePathResult(j, j2, str, "", f4w.LOAD_DATA_NULL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$downloadByTag$46(final frc frcVar, long j, long j2, String str, Throwable th) throws Exception {
        final String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f086bf9", new Object[]{frcVar, new Long(j), new Long(j2), str, th});
            return;
        }
        th.getMessage();
        if (th.getMessage() != null) {
            str2 = "get url error " + th.getMessage();
        } else {
            str2 = "get url error";
        }
        if (frcVar != null) {
            ovu.b(new Runnable() { // from class: tb.w7o
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceJniInteract.lambda$null$45(frc.this, str2);
                }
            });
        } else if (j != -1) {
            onResourcePathResult(j, j2, str, "", str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getResourcePathForMaterialWithTag$42(frc frcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b259c566", new Object[]{frcVar, str});
        } else {
            frcVar.onSuccess(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$null$43(frc frcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e806d7f3", new Object[]{frcVar, str});
        } else {
            frcVar.onFail("100", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$null$45(frc frcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dfb2f5", new Object[]{frcVar, str});
        } else {
            frcVar.onFail("100", str);
        }
    }

    public static native void onResourcePathResult(long j, long j2, String str, String str2, String str3);

    public static void getResourcePathForMaterialWithTag(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5045913e", new Object[]{str, new Long(j), new Long(j2)});
        } else {
            getResourcePathForMaterialWithTag(str, j, j2, null);
        }
    }

    public static void getResourcePathForMaterialWithTag(String str, long j, long j2, final frc<String> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c66dc1", new Object[]{str, new Long(j), new Long(j2), frcVar});
            return;
        }
        final String resourceFromCacheWithIdOrTag = getResourceFromCacheWithIdOrTag(str);
        if (TextUtils.isEmpty(resourceFromCacheWithIdOrTag)) {
            downloadByTag(str, j, j2, frcVar);
        } else if (j != -1) {
            onResourcePathResult(j, j2, str, resourceFromCacheWithIdOrTag, "");
        } else if (frcVar != null) {
            ovu.b(new Runnable() { // from class: tb.u7o
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceJniInteract.lambda$getResourcePathForMaterialWithTag$42(frc.this, resourceFromCacheWithIdOrTag);
                }
            });
        }
    }
}
