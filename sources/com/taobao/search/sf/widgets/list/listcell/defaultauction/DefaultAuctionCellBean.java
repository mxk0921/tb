package com.taobao.search.sf.widgets.list.listcell.defaultauction;

import androidx.core.app.FrameMetricsAggregator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.Map;
import org.json.JSONObject;
import tb.bql;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DefaultAuctionCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String auctionUrl;
    private String img;
    private String originTItemType;
    private String price;
    private String priceUnit;
    private String title;
    private String uprightImg;
    private String uprightImgAspectRatio;
    private JSONObject utLogMap;
    private Map<String, String> utParams;

    static {
        t2o.a(815793632);
    }

    public DefaultAuctionCellBean() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ Object ipc$super(DefaultAuctionCellBean defaultAuctionCellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/defaultauction/DefaultAuctionCellBean");
    }

    public final String getAuctionUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4f09c17", new Object[]{this});
        }
        return this.auctionUrl;
    }

    public final String getImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fae7b08c", new Object[]{this});
        }
        return this.img;
    }

    public final String getOriginTItemType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6b5b154", new Object[]{this});
        }
        return this.originTItemType;
    }

    public final String getPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3a46146", new Object[]{this});
        }
        return this.price;
    }

    public final String getPriceUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("639dd3a2", new Object[]{this});
        }
        return this.priceUnit;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final Map<String, String> getUTParams(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fed1de56", new Object[]{this, new Integer(i)});
        }
        if (this.utParams == null) {
            Map<String, String> a2 = bql.a(this.utLogMap);
            this.utParams = a2;
            ckf.d(a2);
            a2.put("tItemType", this.type);
            String str = this.originTItemType;
            if (!(str == null || str.length() == 0)) {
                Map<String, String> map = this.utParams;
                ckf.d(map);
                String str2 = this.originTItemType;
                ckf.d(str2);
                map.put("originTItemType", str2);
            }
            Map<String, String> map2 = this.utParams;
            ckf.d(map2);
            map2.put("index", String.valueOf(i));
            Map<String, String> map3 = this.utParams;
            ckf.d(map3);
            map3.put("srp_seq", String.valueOf(this.pageNo));
            Map<String, String> map4 = this.utParams;
            ckf.d(map4);
            map4.put("srp_pos", String.valueOf(i));
            Map<String, String> map5 = this.utParams;
            ckf.d(map5);
            map5.put("s_isEl", "1");
        }
        return this.utParams;
    }

    public final String getUprightImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c5b0a61", new Object[]{this});
        }
        return this.uprightImg;
    }

    public final String getUprightImgAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e5cdfe", new Object[]{this});
        }
        return this.uprightImgAspectRatio;
    }

    public final JSONObject getUtLogMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4fa14d62", new Object[]{this});
        }
        return this.utLogMap;
    }

    public final void setAuctionUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200c6e3f", new Object[]{this, str});
        } else {
            this.auctionUrl = str;
        }
    }

    public final void setImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509b43d2", new Object[]{this, str});
        } else {
            this.img = str;
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

    public final void setPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc05d58", new Object[]{this, str});
        } else {
            this.price = str;
        }
    }

    public final void setPriceUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925a5c7c", new Object[]{this, str});
        } else {
            this.priceUnit = str;
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

    public final void setUprightImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5efc935", new Object[]{this, str});
        } else {
            this.uprightImg = str;
        }
    }

    public final void setUprightImgAspectRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2f1fa0", new Object[]{this, str});
        } else {
            this.uprightImgAspectRatio = str;
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
    public /* synthetic */ DefaultAuctionCellBean(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, org.json.JSONObject r17, java.lang.String r18, java.lang.String r19, int r20, tb.a07 r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r15
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r16
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = 0
            goto L_0x0037
        L_0x0035:
            r8 = r17
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r18
        L_0x003f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r2 = r19
        L_0x0046:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, java.lang.String, java.lang.String, int, tb.a07):void");
    }

    public DefaultAuctionCellBean(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7, String str8) {
        this.title = str;
        this.img = str2;
        this.uprightImg = str3;
        this.uprightImgAspectRatio = str4;
        this.priceUnit = str5;
        this.price = str6;
        this.utLogMap = jSONObject;
        this.originTItemType = str7;
        this.auctionUrl = str8;
    }
}
