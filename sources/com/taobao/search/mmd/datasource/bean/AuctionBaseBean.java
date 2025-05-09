package com.taobao.search.mmd.datasource.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AuctionBaseBean extends SearchListBaseBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String clickTrace;
    public String daySold;
    public int delayTime;
    public String h5Url;
    public boolean hideCountDown;
    public boolean hidePriceUndline;
    public String ifsUrl;
    public boolean isClicked;
    public boolean isCollected;
    public boolean isP4p;
    public String itemId;
    public Map<String, String> jarvisData;
    public String locType;
    public String localPrice;
    public transient BaseCellBean mOutterBean;
    public String o2oShopId;
    public String originPrice;
    public String p4pContentUrl;
    public String p4pPid;
    public String p4pUrl;
    public String picUrl;
    public String postFee;
    public String preTitleColor;
    public String preTitleText;
    public String prefetchImgRatio;
    public String price;
    public String priceColor;
    public int priceIconHeight;
    public String priceIconSuffixColor;
    public String priceIconSuffixText;
    public String priceIconUrl;
    public int priceIconWidth;
    public String pricePrefix;
    public String priceUnit;
    public String realSales;
    public String selled;
    public String shopCoupon;
    public boolean showVideoIcon;
    public String skuId;
    public List<String> summaryTipList;
    public String title;
    public String uprightImgAspectRatio;
    public String userId;
    public String videoCover;
    public int videoHeight;
    public String videoIcon;
    public String videoId;
    public String videoUrl;
    public int videoWidth;
    public int wfDelayTime;
    public boolean wfHideCountDown;
    public String wfPicUrl;
    public boolean wfShowVideoIcon;
    public String wfTitle;
    public String wfVideoCover;
    public String wfVideoId;
    public String wfVideoUrl;
    public final List<IconBean> titleIconList = new ArrayList();
    public final List<IconBean> waterfallIconArray = new ArrayList();
    public final List<IconBean> listIconArray = new ArrayList();
    public final List<IconBean> videoIconList = new ArrayList();
    public final Set<String> iconSet = new HashSet();
    public Map<String, String> extraParams = new HashMap();
    public Map<String, String> trace = new HashMap();
    public Map<String, String> utLogMap = new HashMap();

    static {
        t2o.a(815792496);
    }

    public static /* synthetic */ Object ipc$super(AuctionBaseBean auctionBaseBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/datasource/bean/AuctionBaseBean");
    }

    public boolean isContainsIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e493e97", new Object[]{this, str})).booleanValue();
        }
        return this.iconSet.contains(str);
    }
}
