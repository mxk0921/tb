package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.res.MaterialResource;
import com.taobao.taopai2.material.exception.DownloadException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t9i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialDataServer f28578a;
    public final long b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements crc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaterialDetailBean f28579a;
        public final /* synthetic */ blk b;

        public a(t9i t9iVar, MaterialDetailBean materialDetailBean, blk blkVar) {
            this.f28579a = materialDetailBean;
            this.b = blkVar;
        }

        @Override // tb.crc
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
            } else {
                this.b.onError(new DownloadException(str2, str3));
            }
        }

        @Override // tb.crc
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                return;
            }
            MaterialResource materialResource = new MaterialResource();
            MaterialDetailBean materialDetailBean = this.f28579a;
            materialResource.id = materialDetailBean.id;
            materialResource.name = materialDetailBean.name;
            materialResource.lastModified = materialDetailBean.lastModified;
            materialResource.logoUrl = materialDetailBean.logoUrl;
            materialResource.resourceUrl = materialDetailBean.resourceUrl;
            materialResource.materialType = materialDetailBean.materialType;
            materialResource.version = materialDetailBean.version;
            materialResource.extend = materialDetailBean.extend;
            materialResource.setResourceExtUrl(materialDetailBean.getResourceExtUrl());
            materialResource.dirPath = str2;
            materialResource.materialJsonPath = b9i.a(str2);
            this.b.onNext(new Pair(100, materialResource));
            this.b.onComplete();
        }

        @Override // tb.crc
        public void onProgress(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
            } else {
                this.b.onNext(new Pair(Integer.valueOf(i), null));
            }
        }
    }

    static {
        t2o.a(782237886);
    }

    public t9i(long j, MaterialDataServer materialDataServer) {
        this.b = j;
        this.f28578a = materialDataServer;
    }

    public static /* synthetic */ void e(blk blkVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a38100", new Object[]{blkVar, th});
        } else {
            blkVar.onError(th);
        }
    }

    public final /* synthetic */ void d(blk blkVar, MaterialDetailBean materialDetailBean) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d591", new Object[]{this, blkVar, materialDetailBean});
            return;
        }
        u8i u8iVar = new u8i(3, 0, String.valueOf(this.b), materialDetailBean.resourceUrl);
        this.f28578a.h(u8iVar);
        new m6o(u8iVar, new a(this, materialDetailBean, blkVar)).e();
    }

    public final void f(final blk<Pair<Integer, MaterialResource>> blkVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae4308e", new Object[]{this, blkVar});
        } else {
            this.f28578a.j(this.b).subscribe(new mk4() { // from class: tb.r9i
                public final void accept(Object obj) {
                    t9i.this.d(blkVar, (MaterialDetailBean) obj);
                }
            }, new mk4() { // from class: tb.s9i
                public final void accept(Object obj) {
                    t9i.e(blkVar, (Throwable) obj);
                }
            });
        }
    }

    public zkk<Pair<Integer, MaterialResource>> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zkk) ipChange.ipc$dispatch("9122bc3a", new Object[]{this});
        }
        return zkk.create(new elk() { // from class: tb.q9i
            public final void subscribe(blk blkVar) {
                t9i.this.f(blkVar);
            }
        });
    }
}
