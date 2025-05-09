package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import java.util.Map;
import tb.gy;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pox extends psi<y64, XslSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String d = "";
    public String e = "2.0";
    public String f = "wxrcmd";
    public boolean g = false;

    static {
        t2o.a(993002058);
    }

    public static /* synthetic */ Object ipc$super(pox poxVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2059423178) {
            super.w((MetaResult) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == 1039858050) {
            return super.s((Map) objArr[0], (gy.c) objArr[1]);
        } else {
            if (hashCode == 1720926436) {
                super.v((BaseSearchResult) objArr[0]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/xsl/module/XslResultAdapter");
        }
    }

    @Override // tb.psi
    public r5j.a B(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j.a) ipChange.ipc$dispatch("91c0f517", new Object[]{this, map});
        }
        return new r5j.a(this.d, this.e, this.f);
    }

    public void F(XslSearchResult xslSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456360e6", new Object[]{this, xslSearchResult, jSONObject});
        } else {
            super.w(xslSearchResult, jSONObject);
        }
    }

    /* renamed from: G */
    public void v(XslSearchResult xslSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46ad50e", new Object[]{this, xslSearchResult});
        } else if (this.g) {
            super.v(xslSearchResult);
        } else if (xslSearchResult.getCellsCount() == 0) {
            xslSearchResult.getMainInfo().finish = true;
        }
    }

    public void I(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555e5c73", new Object[]{this, str, str2});
            return;
        }
        this.d = str;
        this.e = str2;
    }

    public void J(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4e6f7d", new Object[]{this, str, str2, str3});
            return;
        }
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a266751", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    @Override // tb.psi, tb.q02
    public r5j.a s(Map<String, String> map, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j.a) ipChange.ipc$dispatch("3dfaf982", new Object[]{this, map, cVar});
        }
        if (this.g) {
            return super.s(map, cVar);
        }
        return new r5j.a(this.d, this.e, this.f);
    }

    public pox(yko ykoVar) {
        super(ykoVar, null);
    }

    /* renamed from: H */
    public void w(XslSearchResult xslSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479e5cc5", new Object[]{this, xslSearchResult, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("result");
        if (!(jSONArray == null || jSONArray.size() <= 0 || jSONArray.getJSONObject(0) == null)) {
            F(xslSearchResult, jSONArray.getJSONObject(0));
        }
        xslSearchResult.setCurrentData(jSONObject);
    }
}
