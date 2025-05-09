package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.bean.MaterialResource;
import com.taobao.taopai.material.request.materialdetail.MaterialDetailBusiness;
import com.taobao.taopai.material.request.materialfile.MaterialFileBusiness;
import java.io.File;
import tb.n9i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n9i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24589a;
    public long b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements zqc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v7i f24590a;
        public final /* synthetic */ grc b;

        public a(v7i v7iVar, grc grcVar) {
            this.f24590a = v7iVar;
            this.b = grcVar;
        }

        public static /* synthetic */ void b(grc grcVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("215e218c", new Object[]{grcVar, str, str2});
            } else {
                grcVar.onFail(str, str2);
            }
        }

        @Override // tb.zqc
        public void o(MaterialDetail materialDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c99f7c5", new Object[]{this, materialDetail});
                return;
            }
            this.f24590a.j();
            if (!materialDetail.getResourceUrl().startsWith("http")) {
                n9i.b(n9i.this, materialDetail, "", this.b);
            } else {
                n9i.c(n9i.this, materialDetail, this.f24590a, this.b);
            }
        }

        @Override // tb.pjd
        public void onFail(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            Log.e("TPMaterial", "MaterialRes Fail " + this.f24590a.j() + ", " + str + "|" + str2);
            final grc grcVar = this.b;
            ovu.b(new Runnable() { // from class: tb.m9i
                @Override // java.lang.Runnable
                public final void run() {
                    n9i.a.b(grc.this, str, str2);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements crc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaterialDetail f24591a;
        public final /* synthetic */ grc b;
        public final /* synthetic */ u8i c;
        public final /* synthetic */ long d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f24592a;

            public a(String str) {
                this.f24592a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                n9i.b(n9i.this, bVar.f24591a, this.f24592a, bVar.b);
            }
        }

        public b(MaterialDetail materialDetail, grc grcVar, u8i u8iVar, long j) {
            this.f24591a = materialDetail;
            this.b = grcVar;
            this.c = u8iVar;
            this.d = j;
        }

        public static /* synthetic */ void e(grc grcVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2544cca", new Object[]{grcVar, str, str2});
            } else {
                grcVar.onFail(str, str2);
            }
        }

        public static /* synthetic */ void f(grc grcVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a57f3f9d", new Object[]{grcVar, new Integer(i)});
            } else {
                grcVar.onProgress(i);
            }
        }

        @Override // tb.crc
        public void a(String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            final grc grcVar = this.b;
            ovu.b(new Runnable() { // from class: tb.o9i
                @Override // java.lang.Runnable
                public final void run() {
                    n9i.b.e(grc.this, str2, str3);
                }
            });
            dai.b(this.c.a(), Constants.SEND_TYPE_RES, this.c.toString(), str2, str3, SystemClock.elapsedRealtime() - this.d);
        }

        @Override // tb.crc
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                return;
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(str2));
            dai.g(this.c.a(), Constants.SEND_TYPE_RES, SystemClock.elapsedRealtime() - n9i.d(n9i.this));
        }

        @Override // tb.crc
        public void onProgress(String str, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
                return;
            }
            final grc grcVar = this.b;
            ovu.b(new Runnable() { // from class: tb.p9i
                @Override // java.lang.Runnable
                public final void run() {
                    n9i.b.f(grc.this, i);
                }
            });
        }
    }

    static {
        t2o.a(782237817);
    }

    public n9i(Context context) {
        this.f24589a = context;
    }

    public static /* synthetic */ void b(n9i n9iVar, MaterialDetail materialDetail, String str, grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e722213c", new Object[]{n9iVar, materialDetail, str, grcVar});
        } else {
            n9iVar.e(materialDetail, str, grcVar);
        }
    }

    public static /* synthetic */ void c(n9i n9iVar, MaterialDetail materialDetail, v7i v7iVar, grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca963b69", new Object[]{n9iVar, materialDetail, v7iVar, grcVar});
        } else {
            n9iVar.f(materialDetail, v7iVar, grcVar);
        }
    }

    public static /* synthetic */ long d(n9i n9iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e3855fb", new Object[]{n9iVar})).longValue();
        }
        return n9iVar.b;
    }

    public static /* synthetic */ void g(grc grcVar, MaterialResource materialResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c63fcb", new Object[]{grcVar, materialResource});
        } else {
            grcVar.onSuccess(materialResource);
        }
    }

    public final void e(MaterialDetail materialDetail, String str, final grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02f694a", new Object[]{this, materialDetail, str, grcVar});
            return;
        }
        final MaterialResource materialResource = new MaterialResource();
        materialResource.setName(materialDetail.getName());
        materialResource.setCreatorName(materialDetail.getCreatorName());
        materialResource.setLogoUrl(materialDetail.getLogoUrl());
        materialResource.setMaterialType(materialDetail.getMaterialType());
        materialResource.setModifiedTime(materialDetail.getModifiedTime());
        materialResource.setResourceUrl(materialDetail.getResourceUrl());
        materialResource.setExtend(materialDetail.getExtend());
        materialResource.setTid(materialDetail.getTid());
        materialResource.setVersion(materialDetail.getVersion());
        if (TextUtils.isEmpty(str) || !str.endsWith(".png")) {
            materialResource.setDirPath(str);
        } else {
            materialResource.setDirPath(new File(str).getParentFile().getPath());
        }
        materialResource.setMaterialJsonPath(b9i.a(str));
        ovu.b(new Runnable() { // from class: tb.l9i
            @Override // java.lang.Runnable
            public final void run() {
                n9i.g(grc.this, materialResource);
            }
        });
    }

    public final void f(MaterialDetail materialDetail, v7i v7iVar, grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668981d9", new Object[]{this, materialDetail, v7iVar, grcVar});
            return;
        }
        u8i u8iVar = new u8i(v7iVar.a(), materialDetail.getMaterialType(), v7iVar.p(), String.valueOf(v7iVar.j()), materialDetail.getResourceUrl(), materialDetail.getModifiedTime());
        u8iVar.h(v7iVar.c());
        u8iVar.q(v7iVar.i());
        i(u8iVar, materialDetail, grcVar);
    }

    public void h(v7i v7iVar, grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6098f3", new Object[]{this, v7iVar, grcVar});
            return;
        }
        this.b = SystemClock.elapsedRealtime();
        new MaterialDetailBusiness(v7iVar, new a(v7iVar, grcVar)).request();
    }

    public final void i(u8i u8iVar, MaterialDetail materialDetail, grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8920c936", new Object[]{this, u8iVar, materialDetail, grcVar});
        } else {
            new MaterialFileBusiness(this.f24589a, u8iVar, new b(materialDetail, grcVar, u8iVar, SystemClock.elapsedRealtime())).getMaterialFile();
        }
    }
}
