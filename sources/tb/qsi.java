package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.crosstips.CrossTipsBean;
import com.taobao.search.sf.widgets.list.listcell.crosstips.CrossTipsWidget;
import java.util.Map;
import tb.gy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qsi extends jrh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public g1a<? super String, xhv> E;

    static {
        t2o.a(815793401);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsi(boolean z, yko ykoVar, xno xnoVar) {
        super(z, ykoVar, xnoVar);
        ckf.g(ykoVar, "core");
    }

    public static /* synthetic */ Object ipc$super(qsi qsiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1078239640) {
            super.I((CommonSearchResult) objArr[0]);
            return null;
        } else if (hashCode == -475115448) {
            super.b((Map) objArr[0], (gy.c) objArr[1]);
            return null;
        } else if (hashCode == -425948335) {
            super.doNewSearch((asi) objArr[0], ((Boolean) objArr[1]).booleanValue(), (JSONObject) objArr[2], (Map) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/datasource/inshop/MetaShopDataSource");
        }
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f76fb66", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public void I(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbb5e68", new Object[]{this, commonSearchResult});
            return;
        }
        super.I(commonSearchResult);
        g1a<? super String, xhv> g1aVar = this.E;
        if (g1aVar != null) {
            g1aVar.invoke(getParamStr("q"));
        }
    }

    @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
    public void R(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e11544e", new Object[]{this, map});
        }
    }

    /* renamed from: f1 */
    public void doNewSearch(frh frhVar, boolean z, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa2e7a5", new Object[]{this, frhVar, new Boolean(z), jSONObject, map});
            return;
        }
        postEvent(new CrossTipsWidget.a(false));
        super.doNewSearch(frhVar, z, jSONObject, map);
    }

    public final void h1(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1225283", new Object[]{this, g1aVar});
        } else {
            this.E = g1aVar;
        }
    }

    @Override // tb.gy
    public boolean hasNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39d52367", new Object[]{this})).booleanValue();
        }
        return true ^ getPager().serverFinished();
    }

    @Override // tb.g1i
    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293ea437", new Object[]{this});
        } else {
            h6p.k(this, "InshopSearch");
        }
    }

    @Override // tb.jrh
    public void z0(Map<String, String> map, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4478454", new Object[]{this, map, cVar});
        } else {
            ckf.g(map, "params");
        }
    }

    @Override // tb.g1i, com.taobao.search.sf.datasource.CommonBaseDatasource
    public void b(Map<String, String> map, gy.c cVar) {
        int i;
        String str;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ae5048", new Object[]{this, map, cVar});
            return;
        }
        ckf.g(map, "params");
        super.b(map, cVar);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        ResultMainInfoBean mainInfo = commonSearchResult != null ? commonSearchResult.getMainInfo() : null;
        if (mainInfo == null || (i2 = mainInfo.totalResult) <= 0) {
            i = Integer.MAX_VALUE;
        } else {
            int i3 = mainInfo.pageSize;
            if (i2 % i3 > 0) {
                i = (i2 / i3) + 1;
            } else {
                i = i2 / i3;
            }
        }
        if (getPager().getCurrentPage() >= i) {
            map.put("inshopRouter", "inshop_cross");
            map.put(upx.PAGE_NUMBER, String.valueOf((getPager().getCurrentPage() - i) + 1));
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) getLastSearchResult();
            if (commonSearchResult2 == null || (str = commonSearchResult2.crossShopRecPvUuid) == null) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("pvUuid", str);
            }
            map.put("clickItemIds", u().f());
            map.put("exposedItemIds", g1());
        }
    }

    public final String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e21ed2ce", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int min = Math.min(commonSearchResult.getCellsCount(), 15);
        for (int i = 0; i < min; i++) {
            BaseCellBean cell = commonSearchResult.getCell(i);
            if (cell instanceof CrossTipsBean) {
                break;
            }
            String str = cell.itemId;
            if (ckf.b(cell.cardType, "item") && !TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }
}
