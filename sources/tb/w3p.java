package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class w3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final w3p INSTANCE = new w3p();

    static {
        t2o.a(815792315);
    }

    public final void a(BaseCellBean baseCellBean, StringBuilder sb, StringBuilder sb2, StringBuilder sb3, StringBuilder sb4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc630bfd", new Object[]{this, baseCellBean, sb, sb2, sb3, sb4});
        } else if (ckf.b(baseCellBean.cardType, "item")) {
            if (baseCellBean.isExposed) {
                sb.append(baseCellBean.itemId);
                sb.append(',');
                if (baseCellBean.isP4p) {
                    sb2.append("p,");
                } else {
                    sb2.append("m,");
                }
            } else {
                sb3.append(baseCellBean.itemId);
                sb3.append(',');
                if (baseCellBean.isP4p) {
                    sb4.append("p,");
                } else {
                    sb4.append("m,");
                }
            }
        }
    }

    public final jp8 d(otf otfVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jp8) ipChange.ipc$dispatch("e8604845", new Object[]{this, otfVar});
        }
        ckf.g(otfVar, "jarvis");
        Map<String, Object> s2 = otfVar.s2();
        if (s2 != null) {
            Object obj = s2.get(yj4.PARAM_SEARCH_KEYWORD_POS);
            i = srl.e(obj instanceof String ? (String) obj : null, -1);
        } else {
            i = otfVar.u2();
        }
        if (i >= 0) {
            return c(otfVar, i);
        }
        return jp8.Companion.a();
    }

    public final void e(Map<String, ? super String> map, JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed0ce9de", new Object[]{this, map, jSONObject, str});
        } else if (jSONObject != null) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                jSONObject2 = (JSONObject) obj;
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    ckf.f(entry, "next(...)");
                    Map.Entry<String, Object> entry2 = entry;
                    String key = entry2.getKey();
                    Object value = entry2.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        map.put(key, value.toString());
                    }
                }
            }
        }
    }

    public final void f(int i, BaseCellBean baseCellBean, BaseSearchResult baseSearchResult, otf otfVar, JSONObject jSONObject) {
        int i2;
        int i3;
        int i4;
        Map<String, ? super String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db42dd9a", new Object[]{this, new Integer(i), baseCellBean, baseSearchResult, otfVar, jSONObject});
            return;
        }
        ckf.g(baseCellBean, "replaceItem");
        ckf.g(baseSearchResult, "totalResult");
        ckf.g(otfVar, "jarvis");
        if (i >= 0 && i <= baseSearchResult.getCellsCount()) {
            BaseCellBean baseCellBean2 = baseSearchResult.getCells().get(i);
            fjm w2 = otfVar.w2(i);
            if (w2 != null) {
                i2 = w2.a();
            } else {
                i2 = baseCellBean2.pageNo;
            }
            if (w2 != null) {
                i3 = w2.b();
            } else {
                i3 = baseCellBean2.pagePos;
            }
            if (w2 != null) {
                i4 = w2.c();
            } else {
                i4 = baseCellBean2.pageSize;
            }
            baseCellBean.pageNo = i2;
            baseCellBean.pagePos = i3;
            baseCellBean.pageSize = i4;
            if (baseCellBean instanceof SFAuctionBaseCellBean) {
                AuctionBaseBean auctionBaseBean = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean;
                auctionBaseBean.page = i2;
                auctionBaseBean.pagePos = i3;
                map = auctionBaseBean.utLogMap;
            } else if (baseCellBean instanceof MuiseCellBean) {
                map = h19.d(((MuiseCellBean) baseCellBean).mMuiseBean.model, "utLogMap");
            } else {
                map = baseCellBean instanceof M3CellBean ? ((M3CellBean) baseCellBean).getUtLogMap() : null;
            }
            if (map != null) {
                map.put("srp_seq", String.valueOf(baseCellBean.pageNo));
                map.put("srp_pos", String.valueOf(baseCellBean.pagePos));
                map.put("replaced_nid", baseCellBean2.itemId);
                if (baseCellBean2.isExposed) {
                    map.put("replace_expose", "true");
                }
                String str = baseCellBean.itemId;
                ckf.f(str, "itemId");
                e(map, jSONObject, str);
            }
            baseSearchResult.getCells().set(i, baseCellBean);
            asi asiVar = baseCellBean2.combo;
            if (asiVar != null) {
                asiVar.A(i, baseCellBean);
            }
        }
    }

    public final String b(otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e1ab78", new Object[]{this, otfVar});
        }
        ckf.g(otfVar, "jarvis");
        xgd x2 = otfVar.x2();
        StringBuilder sb = new StringBuilder();
        for (String str : x2.b().keySet()) {
            if (!otfVar.E2(str)) {
                sb.append(str);
                sb.append(',');
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : x2.c().keySet()) {
            if (!otfVar.E2(str2)) {
                sb2.append(str2);
                sb2.append(',');
            }
        }
        HashMap hashMap = new HashMap();
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            hashMap.put("m", sb.toString());
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
            hashMap.put("p", sb2.toString());
        }
        String jSONString = JSON.toJSONString(hashMap);
        ckf.f(jSONString, "toJSONString(...)");
        return jSONString;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[LOOP:3: B:40:0x00dc->B:41:0x00de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.jp8 c(tb.otf r18, int r19) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w3p.c(tb.otf, int):tb.jp8");
    }
}
