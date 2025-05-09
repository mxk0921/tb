package com.taobao.taopai2.material;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import com.taobao.taopai2.material.business.maires.MaiResDetailParams;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import com.taobao.taopai2.material.business.materialdetail.DetailRequestParams;
import com.taobao.taopai2.material.business.materialdetail.DetailResponseModel;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.musicdetail.MusicDetailRequestParams;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import com.taobao.taopai2.material.business.musiclist.MusicListRequestParams;
import com.taobao.taopai2.material.business.musiclist.MusicListResponseModel;
import com.taobao.taopai2.material.business.musiclove.MusicLoveListRequestParams;
import com.taobao.taopai2.material.business.musiclove.MusicLoveRequestParams;
import com.taobao.taopai2.material.business.musiclove.MusicUnLoveRequestParams;
import com.taobao.taopai2.material.business.musicreport.MusicReportRequestParams;
import com.taobao.taopai2.material.business.musictype.MusicTypeInfo;
import com.taobao.taopai2.material.business.musictype.MusicTypeListParams;
import com.taobao.taopai2.material.business.musictype.MusicTypeListResponseModel;
import com.taobao.taopai2.material.business.res.MaterialResource;
import com.taobao.taopai2.material.business.res.MusicResource;
import com.taobao.taopai2.material.request.CompletbleRequestBuilder;
import com.taobao.taopai2.material.request.RequestBuilder;
import com.taobao.taopai2.material.request.Response;
import java.util.HashMap;
import java.util.List;
import tb.frc;
import tb.n94;
import tb.px1;
import tb.t2o;
import tb.t9i;
import tb.v1a;
import tb.wdj;
import tb.yyp;
import tb.zkk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialDataServer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13377a;
    public String b;
    public int c = MaterialBaseRequestParams.DEFUALT_CLIENTVER;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class MusicDetailResponse extends Response<MusicItemBean> {
        static {
            t2o.a(782237846);
        }
    }

    static {
        t2o.a(782237845);
    }

    public static /* synthetic */ MusicListResponseModel q(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicListResponseModel) ipChange.ipc$dispatch("b52e8838", new Object[]{response});
        }
        return (MusicListResponseModel) response.data;
    }

    public static /* synthetic */ MaterialDetailBean r(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialDetailBean) ipChange.ipc$dispatch("bba989f3", new Object[]{response});
        }
        return (MaterialDetailBean) response.data;
    }

    public static /* synthetic */ MusicItemBean s(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicItemBean) ipChange.ipc$dispatch("674624a9", new Object[]{response});
        }
        return (MusicItemBean) response.data;
    }

    public static /* synthetic */ MusicListResponseModel t(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicListResponseModel) ipChange.ipc$dispatch("f99ba908", new Object[]{response});
        }
        return (MusicListResponseModel) response.data;
    }

    public static /* synthetic */ List u(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3a2cdbdb", new Object[]{response});
        }
        return ((MusicTypeListResponseModel) response.data).result;
    }

    public static /* synthetic */ MaiResResponseModel v(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaiResResponseModel) ipChange.ipc$dispatch("45c8fbd5", new Object[]{response});
        }
        return (MaiResResponseModel) response.data;
    }

    public static MaterialDataServer x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialDataServer) ipChange.ipc$dispatch("2826e61f", new Object[]{str, str2});
        }
        MaterialDataServer materialDataServer = new MaterialDataServer();
        materialDataServer.f13377a = str;
        materialDataServer.b = str2;
        return materialDataServer;
    }

    public static MaterialDataServer y(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialDataServer) ipChange.ipc$dispatch("a7d8fd9c", new Object[]{str, str2, new Integer(i)});
        }
        MaterialDataServer materialDataServer = new MaterialDataServer();
        materialDataServer.f13377a = str;
        materialDataServer.b = str2;
        materialDataServer.c = i;
        return materialDataServer;
    }

    public yyp<MaiResResponseModel> A(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("840c594c", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        MaiResDetailParams maiResDetailParams = new MaiResDetailParams(i, i2, str);
        g(maiResDetailParams);
        return new RequestBuilder(maiResDetailParams, MaiResResponseModel.MaiResResponse.class).setTarget(maiResDetailParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new v1a() { // from class: tb.q7i
            public final Object apply(Object obj) {
                MaiResResponseModel v;
                v = MaterialDataServer.v((Response) obj);
                return v;
            }
        });
    }

    public n94 B(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n94) ipChange.ipc$dispatch("465caa25", new Object[]{this, str, str2, new Integer(i)});
        }
        MusicUnLoveRequestParams musicUnLoveRequestParams = new MusicUnLoveRequestParams();
        musicUnLoveRequestParams.id = str;
        musicUnLoveRequestParams.audioId = str2;
        musicUnLoveRequestParams.vendorType = i;
        g(musicUnLoveRequestParams);
        return new CompletbleRequestBuilder(musicUnLoveRequestParams).setTarget(musicUnLoveRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toCompletable();
    }

    public final void g(MaterialBaseRequestParams materialBaseRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d715ddae", new Object[]{this, materialBaseRequestParams});
            return;
        }
        materialBaseRequestParams.bizLine = this.f13377a;
        materialBaseRequestParams.bizScene = this.b;
        materialBaseRequestParams.clientVer = this.c;
    }

    public final void h(px1 px1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f511d5", new Object[]{this, px1Var});
            return;
        }
        px1Var.d(this.f13377a);
        px1Var.e(this.b);
        px1Var.g(this.c);
    }

    public yyp<MusicListResponseModel> i(MusicLoveListRequestParams musicLoveListRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("eaffd597", new Object[]{this, musicLoveListRequestParams});
        }
        g(musicLoveListRequestParams);
        return new RequestBuilder(musicLoveListRequestParams, MusicListResponseModel.MusicListResponse.class).setTarget(musicLoveListRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new v1a() { // from class: tb.t7i
            public final Object apply(Object obj) {
                MusicListResponseModel q;
                q = MaterialDataServer.q((Response) obj);
                return q;
            }
        });
    }

    public yyp<MaterialDetailBean> j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("3e55d4bf", new Object[]{this, new Long(j)});
        }
        DetailRequestParams detailRequestParams = new DetailRequestParams(j);
        g(detailRequestParams);
        return new RequestBuilder(detailRequestParams, DetailResponseModel.MaterialDetailResponse.class).setTarget(detailRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new v1a() { // from class: tb.u7i
            public final Object apply(Object obj) {
                MaterialDetailBean r;
                r = MaterialDataServer.r((Response) obj);
                return r;
            }
        });
    }

    public zkk<Pair<Integer, MaterialResource>> k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zkk) ipChange.ipc$dispatch("8304dcf", new Object[]{this, new Long(j)});
        }
        return new t9i(j, this).g();
    }

    public yyp<MusicItemBean> l(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("6c8c2658", new Object[]{this, str, str2, new Integer(i)});
        }
        return m(str, str2, "", i);
    }

    public yyp<MusicItemBean> m(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("1a6c3f8e", new Object[]{this, str, str2, str3, new Integer(i)});
        }
        MusicDetailRequestParams musicDetailRequestParams = new MusicDetailRequestParams();
        musicDetailRequestParams.id = str;
        musicDetailRequestParams.audioId = str2;
        musicDetailRequestParams.soundId = str3;
        musicDetailRequestParams.vendorType = i;
        g(musicDetailRequestParams);
        return new RequestBuilder(musicDetailRequestParams, MusicDetailResponse.class).setTarget(musicDetailRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new v1a() { // from class: tb.r7i
            public final Object apply(Object obj) {
                MusicItemBean s;
                s = MaterialDataServer.s((Response) obj);
                return s;
            }
        });
    }

    public yyp<MusicListResponseModel> n(MusicListRequestParams musicListRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("9183dd83", new Object[]{this, musicListRequestParams});
        }
        g(musicListRequestParams);
        if (!TextUtils.isEmpty(musicListRequestParams.searchKey)) {
            HashMap hashMap = new HashMap();
            hashMap.put("KEYWORD", musicListRequestParams.searchKey);
            musicListRequestParams.searchTerms = JSON.toJSONString(hashMap);
        }
        return new RequestBuilder(musicListRequestParams, MusicListResponseModel.MusicListResponse.class).setTarget(musicListRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new v1a() { // from class: tb.p7i
            public final Object apply(Object obj) {
                MusicListResponseModel t;
                t = MaterialDataServer.t((Response) obj);
                return t;
            }
        });
    }

    public void o(String str, String str2, String str3, int i, frc<MusicResource> frcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9ecc70", new Object[]{this, str, str2, str3, new Integer(i), frcVar});
        } else {
            new wdj(str, str2, i, str3, this, frcVar).l();
        }
    }

    public yyp<List<MusicTypeInfo>> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("47b74400", new Object[]{this});
        }
        MusicTypeListParams musicTypeListParams = new MusicTypeListParams();
        g(musicTypeListParams);
        return new RequestBuilder(musicTypeListParams, MusicTypeListResponseModel.MusicTypeListResponse.class).setTarget(musicTypeListParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new v1a() { // from class: tb.s7i
            public final Object apply(Object obj) {
                List u;
                u = MaterialDataServer.u((Response) obj);
                return u;
            }
        });
    }

    public n94 w(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n94) ipChange.ipc$dispatch("82075a5e", new Object[]{this, str, str2, new Integer(i)});
        }
        MusicLoveRequestParams musicLoveRequestParams = new MusicLoveRequestParams();
        musicLoveRequestParams.id = str;
        musicLoveRequestParams.audioId = str2;
        musicLoveRequestParams.vendorType = i;
        g(musicLoveRequestParams);
        return new CompletbleRequestBuilder(musicLoveRequestParams).setTarget(musicLoveRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toCompletable();
    }

    public n94 z(String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n94) ipChange.ipc$dispatch("e9f86e82", new Object[]{this, str, str2, new Integer(i), new Integer(i2), str3});
        }
        MusicReportRequestParams musicReportRequestParams = new MusicReportRequestParams();
        musicReportRequestParams.id = str;
        musicReportRequestParams.audioId = str2;
        musicReportRequestParams.vendorType = i2;
        musicReportRequestParams.events = str3;
        musicReportRequestParams.fromType = i;
        g(musicReportRequestParams);
        return new CompletbleRequestBuilder(musicReportRequestParams).setTarget(musicReportRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toCompletable();
    }
}
