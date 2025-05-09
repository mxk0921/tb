package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import com.taobao.taopai2.material.base.MaterialRequestPolicy;
import com.taobao.taopai2.material.business.materialcategory.CategoryInfo;
import com.taobao.taopai2.material.business.materialcategory.CategoryRequestParams;
import com.taobao.taopai2.material.business.materialcategory.CategoryResponseModel;
import com.taobao.taopai2.material.business.materiallist.MaterialListRequestParams;
import com.taobao.taopai2.material.business.materiallist.MaterialListResponse;
import com.taobao.taopai2.material.request.Response;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y8i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31908a = "taopai";
    public String b = "taopai";

    static {
        t2o.a(782237853);
    }

    public static /* synthetic */ List h(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b610f26f", new Object[]{response});
        }
        return ((CategoryResponseModel) response.data).categoryList;
    }

    public static /* synthetic */ MaterialListResponse i(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialListResponse) ipChange.ipc$dispatch("1683c74b", new Object[]{response});
        }
        return (MaterialListResponse) response.data;
    }

    public static y8i j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y8i) ipChange.ipc$dispatch("36217a51", new Object[]{context, str, str2});
        }
        y8i y8iVar = new y8i();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            y8iVar.f31908a = str;
            y8iVar.b = str2;
        } else if (!sg8.a()) {
            throw new IllegalArgumentException("bizLine or bizScene is empty");
        }
        ztl.k(context);
        return y8iVar;
    }

    public final void c(MaterialBaseRequestParams materialBaseRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d715ddae", new Object[]{this, materialBaseRequestParams});
            return;
        }
        if (TextUtils.isEmpty(materialBaseRequestParams.bizLine)) {
            materialBaseRequestParams.bizLine = this.f31908a;
        }
        if (TextUtils.isEmpty(materialBaseRequestParams.bizScene)) {
            materialBaseRequestParams.bizScene = this.b;
        }
    }

    public yyp<List<CategoryInfo>> d(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("6147c78f", new Object[]{this, new Long(j), new Integer(i)});
        }
        return e(j, i, MaterialRequestPolicy.CACHE_NET, 300L);
    }

    public yyp<List<CategoryInfo>> e(long j, int i, MaterialRequestPolicy materialRequestPolicy, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("e17fb184", new Object[]{this, new Long(j), new Integer(i), materialRequestPolicy, new Long(j2)});
        }
        CategoryRequestParams categoryRequestParams = new CategoryRequestParams(j, i);
        categoryRequestParams.setRequestPolicy(materialRequestPolicy);
        categoryRequestParams.setCacheTime(j2);
        c(categoryRequestParams);
        return new k9i(categoryRequestParams, CategoryResponseModel.class).g().map(new v1a() { // from class: tb.w8i
            public final Object apply(Object obj) {
                List h;
                h = y8i.h((Response) obj);
                return h;
            }
        });
    }

    public yyp<MaterialListResponse> f(long j, String str, int i, int i2, int i3, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("cec159f1", new Object[]{this, new Long(j), str, new Integer(i), new Integer(i2), new Integer(i3), str2});
        }
        return g(j, str, i, i2, i3, str2, MaterialRequestPolicy.CACHE_NET, 300L);
    }

    public yyp<MaterialListResponse> g(long j, String str, int i, int i2, int i3, String str2, MaterialRequestPolicy materialRequestPolicy, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("2c193962", new Object[]{this, new Long(j), str, new Integer(i), new Integer(i2), new Integer(i3), str2, materialRequestPolicy, new Long(j2)});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("[");
            sb.append(str2);
            sb.append("]");
        }
        MaterialListRequestParams materialListRequestParams = new MaterialListRequestParams(j, str, i, i2, i3, sb.toString());
        materialListRequestParams.setRequestPolicy(materialRequestPolicy);
        materialListRequestParams.setCacheTime(j2);
        c(materialListRequestParams);
        return new k9i(materialListRequestParams, MaterialListResponse.class).g().map(new v1a() { // from class: tb.x8i
            public final Object apply(Object obj) {
                MaterialListResponse i4;
                i4 = y8i.i((Response) obj);
                return i4;
            }
        });
    }
}
