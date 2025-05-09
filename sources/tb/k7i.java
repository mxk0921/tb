package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.bean.MaterialResource;
import com.taobao.taopai.material.bean.MusicCategoryBean;
import com.taobao.taopai.material.bean.MusicListBean;
import com.taobao.taopai.material.jni.ResourceJniInteract;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.materialdetail.MaterialDetailBusiness;
import com.taobao.taopai.material.request.materialfile.MaterialFileBusiness;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import com.taobao.taopai2.material.business.musiclist.MusicListRequestParams;
import com.taobao.taopai2.material.business.musiclist.MusicListResponseModel;
import com.taobao.taopai2.material.business.musiclove.MusicLoveListRequestParams;
import com.taobao.taopai2.material.business.musictype.MusicTypeInfo;
import com.taobao.taopai2.material.business.res.MusicResource;
import com.taobao.taopai2.material.business.specified.a;
import com.taobao.taopai2.material.exception.MaterialException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k7i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String b = "guangguang";
    public static String c = "guangguang";

    /* renamed from: a  reason: collision with root package name */
    public final List<BaseMaterialBusiness> f22447a = new CopyOnWriteArrayList();

    static {
        t2o.a(782237731);
        P();
    }

    @Deprecated
    public k7i() {
    }

    public static void N(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{context, str});
        } else {
            O(context, str, "");
        }
    }

    public static void O(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72712a5", new Object[]{context, str, str2});
            return;
        }
        ztl.k(context);
        if (!TextUtils.isEmpty(str)) {
            b = str;
        } else if (!TextUtils.isEmpty(str2)) {
            b = str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            c = str2;
        } else if (!TextUtils.isEmpty(str)) {
            c = str;
        }
    }

    public static void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6078473f", new Object[0]);
        } else if (zjo.c() == null) {
            zjo.h();
            zjo.p(new mk4() { // from class: tb.g7i
                public final void accept(Object obj) {
                    k7i.d0((Throwable) obj);
                }
            });
        }
    }

    public static boolean Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6756ba26", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(ResourceJniInteract.getResourceFromCacheWithIdOrTag(str));
    }

    public static /* synthetic */ void R(zqc zqcVar, MaterialDetailBean materialDetailBean) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f0c43d", new Object[]{zqcVar, materialDetailBean});
        } else if (zqcVar != null) {
            MaterialDetail materialDetail = new MaterialDetail();
            materialDetail.copyFrom(materialDetailBean);
            zqcVar.o(materialDetail);
        }
    }

    public static /* synthetic */ void T(grc grcVar, Pair pair) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e54b3e", new Object[]{grcVar, pair});
        } else if (grcVar != null) {
            if (pair.second == null) {
                grcVar.onProgress(((Integer) pair.first).intValue());
                return;
            }
            MaterialResource materialResource = new MaterialResource();
            materialResource.copyFrom((com.taobao.taopai2.material.business.res.MaterialResource) pair.second);
            grcVar.onSuccess(materialResource);
            new StringBuilder("getMaterialRes Success, materialId = ").append(materialResource.getTid());
        }
    }

    public static /* synthetic */ void V(txc txcVar, MusicItemBean musicItemBean) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0960ba", new Object[]{txcVar, musicItemBean});
        } else if (txcVar != null) {
            txcVar.i(musicItemBean);
        }
    }

    public static /* synthetic */ void X(kxc kxcVar, MusicListResponseModel musicListResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45675865", new Object[]{kxcVar, musicListResponseModel});
        } else if (kxcVar != null) {
            MusicListBean musicListBean = new MusicListBean();
            musicListBean.module = (ArrayList) musicListResponseModel.result;
            MusicListBean.PageInfo pageInfo = new MusicListBean.PageInfo();
            musicListBean.mPageInfo = pageInfo;
            MusicListResponseModel.Paging paging = musicListResponseModel.paging;
            pageInfo.currentPage = paging.page;
            pageInfo.pageSize = paging.pageSize;
            pageInfo.totalCnt = paging.totalCnt;
            pageInfo.totalPage = paging.totalPage;
            kxcVar.c(musicListBean);
        }
    }

    public static /* synthetic */ void Z(mxc mxcVar, MusicListResponseModel musicListResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc379c4f", new Object[]{mxcVar, musicListResponseModel});
        } else if (mxcVar != null) {
            MusicListBean musicListBean = new MusicListBean();
            musicListBean.module = (ArrayList) musicListResponseModel.result;
            MusicListBean.PageInfo pageInfo = new MusicListBean.PageInfo();
            musicListBean.mPageInfo = pageInfo;
            MusicListResponseModel.Paging paging = musicListResponseModel.paging;
            pageInfo.currentPage = paging.page;
            pageInfo.pageSize = paging.pageSize;
            pageInfo.totalCnt = paging.totalCnt;
            pageInfo.totalPage = paging.totalPage;
            mxcVar.c(musicListBean);
        }
    }

    public static /* synthetic */ void b0(rxc rxcVar, List list) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3213ae", new Object[]{rxcVar, list});
        } else if (rxcVar != null) {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MusicTypeInfo musicTypeInfo = (MusicTypeInfo) it.next();
                    MusicCategoryBean musicCategoryBean = new MusicCategoryBean();
                    musicCategoryBean.id = musicTypeInfo.id;
                    musicCategoryBean.logoUrl = musicTypeInfo.logoUrl;
                    musicCategoryBean.name = musicTypeInfo.name;
                    musicCategoryBean.type = musicTypeInfo.type;
                    arrayList.add(musicCategoryBean);
                }
            }
            rxcVar.onSuccess(arrayList);
        }
    }

    public static /* synthetic */ void d0(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5591dee5", new Object[]{th});
        } else {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void f0(nxc nxcVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e899f3", new Object[]{nxcVar});
        } else if (nxcVar != null) {
            nxcVar.onSuccess();
        }
    }

    public static /* synthetic */ void g0() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1050f8", new Object[0]);
        }
    }

    public static /* synthetic */ void h0(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e01fc11c", new Object[]{th});
        }
    }

    public static /* synthetic */ void i0(kxc kxcVar, MusicListResponseModel musicListResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba95be11", new Object[]{kxcVar, musicListResponseModel});
        } else if (kxcVar != null) {
            MusicListBean musicListBean = new MusicListBean();
            musicListBean.module = (ArrayList) musicListResponseModel.result;
            MusicListBean.PageInfo pageInfo = new MusicListBean.PageInfo();
            musicListBean.mPageInfo = pageInfo;
            MusicListResponseModel.Paging paging = musicListResponseModel.paging;
            pageInfo.currentPage = paging.page;
            pageInfo.pageSize = paging.pageSize;
            pageInfo.totalCnt = paging.totalCnt;
            pageInfo.totalPage = paging.totalPage;
            kxcVar.c(musicListBean);
        }
    }

    public static /* synthetic */ void k0(sxc sxcVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90985bf7", new Object[]{sxcVar});
        } else if (sxcVar != null) {
            sxcVar.onSuccess();
        }
    }

    public static void n0(String str, frc<String> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f82189", new Object[]{str, frcVar});
        } else {
            ResourceJniInteract.getResourcePathForMaterialWithTag(str, frcVar);
        }
    }

    public static String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26095428", new Object[0]);
        }
        return b;
    }

    public static String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69425aa", new Object[0]);
        }
        return c;
    }

    public void A(v7i v7iVar, final zqc zqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb324e10", new Object[]{this, v7iVar, zqcVar});
        } else if (bct.g()) {
            MaterialDataServer.x(b, c).j(v7iVar.j()).subscribe(new mk4() { // from class: tb.z6i
                public final void accept(Object obj) {
                    k7i.R(zqc.this, (MaterialDetailBean) obj);
                }
            }, new mk4() { // from class: tb.b7i
                public final void accept(Object obj) {
                    k7i.this.S(zqcVar, (Throwable) obj);
                }
            });
        } else {
            MaterialDetailBusiness materialDetailBusiness = new MaterialDetailBusiness(v7iVar, zqcVar);
            materialDetailBusiness.request();
            ((CopyOnWriteArrayList) this.f22447a).add(materialDetailBusiness);
        }
    }

    public void B(Context context, u8i u8iVar, crc crcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc07bc7", new Object[]{this, context, u8iVar, crcVar});
            return;
        }
        MaterialFileBusiness materialFileBusiness = new MaterialFileBusiness(context, u8iVar, crcVar);
        materialFileBusiness.getMaterialFile();
        this.f22447a.add(materialFileBusiness);
    }

    public void C(u8i u8iVar, crc crcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211e110f", new Object[]{this, u8iVar, crcVar});
        } else {
            B(null, u8iVar, crcVar);
        }
    }

    public void D(Context context, final v7i v7iVar, final grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3e064b", new Object[]{this, context, v7iVar, grcVar});
        } else if (bct.g()) {
            MaterialDataServer.x(b, c).k(v7iVar.j()).subscribe(new mk4() { // from class: tb.j7i
                public final void accept(Object obj) {
                    k7i.T(grc.this, (Pair) obj);
                }
            }, new mk4() { // from class: tb.q6i
                public final void accept(Object obj) {
                    k7i.this.U(grcVar, v7iVar, (Throwable) obj);
                }
            });
        } else {
            new n9i(context).h(v7iVar, grcVar);
        }
    }

    public void E(v7i v7iVar, grc grcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360e3d3f", new Object[]{this, v7iVar, grcVar});
        } else {
            D(null, v7iVar, grcVar);
        }
    }

    public void F(wej wejVar, final txc txcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57ce5dd", new Object[]{this, wejVar, txcVar});
        } else {
            MaterialDataServer.x(b, c).l(wejVar.j(), wejVar.i(), wejVar.k()).subscribe(new mk4() { // from class: tb.r6i
                public final void accept(Object obj) {
                    k7i.V(txc.this, (MusicItemBean) obj);
                }
            }, new mk4() { // from class: tb.s6i
                public final void accept(Object obj) {
                    k7i.this.W(txcVar, (Throwable) obj);
                }
            });
        }
    }

    public void G(ddj ddjVar, final kxc kxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dbac3dd", new Object[]{this, ddjVar, kxcVar});
            return;
        }
        MusicListRequestParams musicListRequestParams = new MusicListRequestParams();
        musicListRequestParams.category = ddjVar.i();
        musicListRequestParams.searchTerms = ddjVar.l();
        musicListRequestParams.pageSize = ddjVar.k();
        musicListRequestParams.page = ddjVar.j();
        MaterialDataServer.x(b, c).n(musicListRequestParams).subscribe(new mk4() { // from class: tb.t6i
            public final void accept(Object obj) {
                k7i.X(kxc.this, (MusicListResponseModel) obj);
            }
        }, new mk4() { // from class: tb.u6i
            public final void accept(Object obj) {
                k7i.this.Y(kxcVar, (Throwable) obj);
            }
        });
    }

    public void H(fdj fdjVar, final mxc mxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a90b91", new Object[]{this, fdjVar, mxcVar});
            return;
        }
        MusicLoveListRequestParams musicLoveListRequestParams = new MusicLoveListRequestParams();
        musicLoveListRequestParams.pageSize = fdjVar.j();
        musicLoveListRequestParams.page = fdjVar.i();
        MaterialDataServer.x(b, c).i(musicLoveListRequestParams).subscribe(new mk4() { // from class: tb.v6i
            public final void accept(Object obj) {
                k7i.Z(mxc.this, (MusicListResponseModel) obj);
            }
        }, new mk4() { // from class: tb.w6i
            public final void accept(Object obj) {
                k7i.this.a0(mxcVar, (Throwable) obj);
            }
        });
    }

    public void I(String str, String str2, int i, frc<MusicResource> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622b0c7a", new Object[]{this, str, str2, new Integer(i), frcVar});
        } else {
            MaterialDataServer.x(x(), y()).o(str, str2, "", i, frcVar);
        }
    }

    public void J(String str, String str2, String str3, int i, frc<MusicResource> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9ecc70", new Object[]{this, str, str2, str3, new Integer(i), frcVar});
        } else {
            MaterialDataServer.x(x(), y()).o(str, str2, str3, i, frcVar);
        }
    }

    public void K(uej uejVar, final rxc rxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4784b057", new Object[]{this, uejVar, rxcVar});
        } else {
            MaterialDataServer.x(b, c).p().subscribe(new mk4() { // from class: tb.p6i
                public final void accept(Object obj) {
                    k7i.b0(rxc.this, (List) obj);
                }
            }, new mk4() { // from class: tb.a7i
                public final void accept(Object obj) {
                    k7i.this.c0(rxcVar, (Throwable) obj);
                }
            });
        }
    }

    public final void L(pjd pjdVar, Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff327469", new Object[]{this, pjdVar, th});
        } else if (pjdVar != null) {
            if (th instanceof MaterialException) {
                MaterialException materialException = (MaterialException) th;
                pjdVar.onFail(materialException.getErrorCode(), materialException.getErrorInfo());
                return;
            }
            if (th != null) {
                str = th.getMessage();
            } else {
                str = "error is empty";
            }
            pjdVar.onFail("exception is invalid", str);
        }
    }

    public boolean M(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("767bcdcc", new Object[]{this, str, str2})).booleanValue();
        }
        File I = ucj.I(str, str2);
        if (I == null || !I.exists()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void S(zqc zqcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9edcfcb", new Object[]{this, zqcVar, th});
        } else {
            L(zqcVar, th);
        }
    }

    public final /* synthetic */ void U(grc grcVar, v7i v7iVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff15cd1e", new Object[]{this, grcVar, v7iVar, th});
            return;
        }
        L(grcVar, th);
        Log.e("TPMaterial", "getMaterialRes Fail, materialId = " + v7iVar.j());
    }

    public final /* synthetic */ void W(txc txcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67b3fe9", new Object[]{this, txcVar, th});
        } else {
            L(txcVar, th);
        }
    }

    public final /* synthetic */ void Y(kxc kxcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8635238", new Object[]{this, kxcVar, th});
        } else {
            L(kxcVar, th);
        }
    }

    public final /* synthetic */ void a0(mxc mxcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff57c22", new Object[]{this, mxcVar, th});
        } else {
            L(mxcVar, th);
        }
    }

    public final /* synthetic */ void c0(rxc rxcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27de337", new Object[]{this, rxcVar, th});
        } else {
            L(rxcVar, th);
        }
    }

    public final /* synthetic */ void e0(nxc nxcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8323a164", new Object[]{this, nxcVar, th});
        } else {
            L(nxcVar, th);
        }
    }

    public final /* synthetic */ void j0(kxc kxcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f180f2b9", new Object[]{this, kxcVar, th});
        } else {
            L(kxcVar, th);
        }
    }

    public final /* synthetic */ void l0(sxc sxcVar, Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf83c89f", new Object[]{this, sxcVar, th});
        } else {
            L(sxcVar, th);
        }
    }

    public void m0(gdj gdjVar, final nxc nxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a178251f", new Object[]{this, gdjVar, nxcVar});
        } else {
            MaterialDataServer.x(b, c).w(gdjVar.j(), gdjVar.i(), gdjVar.k()).subscribe(new b90() { // from class: tb.e7i
                public final void run() {
                    k7i.f0(nxc.this);
                }
            }, new mk4() { // from class: tb.f7i
                public final void accept(Object obj) {
                    k7i.this.e0(nxcVar, (Throwable) obj);
                }
            });
        }
    }

    public void o0(tdj tdjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3d56a0", new Object[]{this, tdjVar});
        } else {
            MaterialDataServer.x(b, c).z(tdjVar.l(), tdjVar.i(), tdjVar.k(), tdjVar.m(), tdjVar.j()).subscribe(new b90() { // from class: tb.c7i
                public final void run() {
                    k7i.g0();
                }
            }, new mk4() { // from class: tb.d7i
                public final void accept(Object obj) {
                    k7i.h0((Throwable) obj);
                }
            });
        }
    }

    public void p0(ddj ddjVar, final kxc kxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4a6e2d", new Object[]{this, ddjVar, kxcVar});
            return;
        }
        MusicListRequestParams musicListRequestParams = new MusicListRequestParams();
        musicListRequestParams.category = ddjVar.i();
        musicListRequestParams.searchTerms = ddjVar.l();
        musicListRequestParams.pageSize = ddjVar.k();
        musicListRequestParams.page = ddjVar.j();
        MaterialDataServer.x(b, c).n(musicListRequestParams).subscribe(new mk4() { // from class: tb.x6i
            public final void accept(Object obj) {
                k7i.i0(kxc.this, (MusicListResponseModel) obj);
            }
        }, new mk4() { // from class: tb.y6i
            public final void accept(Object obj) {
                k7i.this.j0(kxcVar, (Throwable) obj);
            }
        });
    }

    public void q0(String str, String str2, int i, List<Long> list, irc ircVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da518490", new Object[]{this, str, str2, new Integer(i), list, ircVar});
        } else {
            new a().f(str, str2, i, list, ircVar);
        }
    }

    public void r0(vej vejVar, final sxc sxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0be9c2a", new Object[]{this, vejVar, sxcVar});
        } else {
            MaterialDataServer.x(b, c).B(vejVar.j(), vejVar.i(), vejVar.k()).subscribe(new b90() { // from class: tb.h7i
                public final void run() {
                    k7i.k0(sxc.this);
                }
            }, new mk4() { // from class: tb.i7i
                public final void accept(Object obj) {
                    k7i.this.l0(sxcVar, (Throwable) obj);
                }
            });
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c124ce4", new Object[]{this});
            return;
        }
        for (BaseMaterialBusiness baseMaterialBusiness : this.f22447a) {
            if (baseMaterialBusiness instanceof MaterialFileBusiness) {
                baseMaterialBusiness.cancel();
                this.f22447a.remove(baseMaterialBusiness);
            }
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81ea706", new Object[]{this});
        }
    }

    public String z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4878428b", new Object[]{this, str, str2});
        }
        File I = ucj.I(str, str2);
        if (I != null) {
            return I.getAbsolutePath();
        }
        return "";
    }

    public k7i(Context context, String str, String str2) {
        O(context, str, str2);
    }
}
