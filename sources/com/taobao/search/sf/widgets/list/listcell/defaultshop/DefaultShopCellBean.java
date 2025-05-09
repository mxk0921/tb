package com.taobao.search.sf.widgets.list.listcell.defaultshop;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bql;
import tb.ckf;
import tb.h1p;
import tb.t2o;
import tb.tsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DefaultShopCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<JSONObject> auctions;
    private String cellSpm;
    private JSONArray detailTrace;
    private String innerAuctionIds;
    private String logo;
    private String originTItemType;
    private String sellerId;
    private String shopId;
    private String title;
    private JSONObject utLogMap;
    private Map<String, String> utParams;

    static {
        t2o.a(815793635);
    }

    public DefaultShopCellBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Object ipc$super(DefaultShopCellBean defaultShopCellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/defaultshop/DefaultShopCellBean");
    }

    public final List<JSONObject> getAuctions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3de4ad1a", new Object[]{this});
        }
        return this.auctions;
    }

    public final String getCellSpm(CommonBaseDatasource commonBaseDatasource, int i) {
        CommonSearchResult commonSearchResult;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c2b4628", new Object[]{this, commonBaseDatasource, new Integer(i)});
        }
        String str = this.cellSpm;
        if (str == null || str.length() == 0) {
            Map<String, String> map = (commonBaseDatasource == null || (commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult()) == null || (mainInfo = commonSearchResult.getMainInfo()) == null) ? null : mainInfo.pageTraceArgs;
            if (map != null) {
                String str2 = map.get("spm-cnt");
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder();
                    ckf.d(str2);
                    sb.append(tsq.E(str2, ".0.0", "", false, 4, null));
                    sb.append(".shoplist.");
                    sb.append(i);
                    this.cellSpm = sb.toString();
                }
            }
        }
        String str3 = this.cellSpm;
        return str3 == null ? "" : str3;
    }

    public final JSONArray getDetailTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("24890acb", new Object[]{this});
        }
        return this.detailTrace;
    }

    public final String getLogo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfcecf78", new Object[]{this});
        }
        return this.logo;
    }

    public final String getOriginTItemType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6b5b154", new Object[]{this});
        }
        return this.originTItemType;
    }

    public final String getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return this.sellerId;
    }

    public final String getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return this.shopId;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final Map<String, String> getUTParams(CommonBaseDatasource commonBaseDatasource, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("167fb6a", new Object[]{this, commonBaseDatasource, new Integer(i)});
        }
        if (this.utParams == null) {
            Map<String, String> a2 = bql.a(this.utLogMap);
            this.utParams = a2;
            if (commonBaseDatasource != null) {
                ckf.d(a2);
                a2.put(h1p.LIST_PARAM_KEY, commonBaseDatasource.getKeyword() + '_' + this.abtest + '_' + this.rn);
                CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
                if (commonSearchResult != null) {
                    Map<String, String> map = this.utParams;
                    ckf.d(map);
                    map.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
                    com.alibaba.fastjson.JSONObject jSONObject = commonSearchResult.pageInfo;
                    if (jSONObject != null) {
                        Map<String, String> map2 = this.utParams;
                        ckf.d(map2);
                        map2.put("for_bts", jSONObject.getString("for_bts"));
                    }
                }
            }
            Map<String, String> map3 = this.utParams;
            ckf.d(map3);
            map3.put(h1p.LIST_TYPE_KEY, "search");
            Map<String, String> map4 = this.utParams;
            ckf.d(map4);
            map4.put("tItemType", this.type);
            String str = this.originTItemType;
            if (!(str == null || str.length() == 0)) {
                Map<String, String> map5 = this.utParams;
                ckf.d(map5);
                String str2 = this.originTItemType;
                ckf.d(str2);
                map5.put("originTItemType", str2);
            }
            Map<String, String> map6 = this.utParams;
            ckf.d(map6);
            map6.put("index", String.valueOf(i));
            Map<String, String> map7 = this.utParams;
            ckf.d(map7);
            map7.put("srp_seq", String.valueOf(this.pageNo));
            Map<String, String> map8 = this.utParams;
            ckf.d(map8);
            map8.put("srp_pos", String.valueOf(i));
            Map<String, String> map9 = this.utParams;
            ckf.d(map9);
            map9.put("s_isEl", "1");
            String innerAuctionIds = getInnerAuctionIds();
            if (!TextUtils.isEmpty(innerAuctionIds)) {
                Map<String, String> map10 = this.utParams;
                ckf.d(map10);
                map10.put("x_item_ids", innerAuctionIds);
            }
        }
        return this.utParams;
    }

    public final JSONObject getUtLogMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4fa14d62", new Object[]{this});
        }
        return this.utLogMap;
    }

    public final void setAuctions(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54546f8a", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.auctions = list;
    }

    public final void setDetailTrace(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3298353", new Object[]{this, jSONArray});
        } else {
            this.detailTrace = jSONArray;
        }
    }

    public final void setLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, str});
        } else {
            this.logo = str;
        }
    }

    public final void setOriginTItemType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea284e0a", new Object[]{this, str});
        } else {
            this.originTItemType = str;
        }
    }

    public final void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId = str;
        }
    }

    public final void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final void setUtLogMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c4883e", new Object[]{this, jSONObject});
        } else {
            this.utLogMap = jSONObject;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DefaultShopCellBean(java.lang.String r10, java.lang.String r11, java.util.List r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, org.json.JSONObject r16, org.json.JSONArray r17, int r18, tb.a07 r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r10
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r11
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0023
            r5 = r2
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002b
        L_0x002a:
            r6 = r14
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r15
        L_0x0031:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x0038
            r7 = r8
            goto L_0x003a
        L_0x0038:
            r7 = r16
        L_0x003a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r8 = r17
        L_0x0041:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r2
            r17 = r7
            r18 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.defaultshop.DefaultShopCellBean.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONArray, int, tb.a07):void");
    }

    private final String getInnerAuctionIds() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e37e13e4", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.innerAuctionIds)) {
            if (this.auctions.size() > 0) {
                StringBuilder sb = new StringBuilder();
                int size = this.auctions.size();
                for (int i = 0; i < size; i++) {
                    String optString = this.auctions.get(i).optString("nid");
                    ckf.f(optString, "optString(...)");
                    if (!TextUtils.isEmpty(optString)) {
                        sb.append(optString);
                        sb.append(",");
                    }
                }
                str = sb.deleteCharAt(sb.length() - 1).toString();
                ckf.d(str);
            } else {
                str = "";
            }
            this.innerAuctionIds = str;
        }
        return this.innerAuctionIds;
    }

    public DefaultShopCellBean(String str, String str2, List<JSONObject> list, String str3, String str4, String str5, JSONObject jSONObject, JSONArray jSONArray) {
        ckf.g(list, "auctions");
        this.title = str;
        this.logo = str2;
        this.auctions = list;
        this.sellerId = str3;
        this.shopId = str4;
        this.originTItemType = str5;
        this.utLogMap = jSONObject;
        this.detailTrace = jSONArray;
        this.innerAuctionIds = "";
    }
}
