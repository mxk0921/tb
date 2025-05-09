package com.etao.feimagesearch.history;

import android.net.Uri;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.mh1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuctionItemVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int allowanceStatus;
    public String auctionURL;
    public String duration;
    public String fileUrl;
    public boolean isVideo;
    @JSONField(name = "item_id")
    public String itemId;
    public Map<String, String> mExtraJSKV;
    public Integer mSource;
    public String photofrom;
    @JSONField(name = mh1.PRD_PICURL)
    public Uri picPath;
    public String price;
    public String priceWithRate;
    public String spuId;
    public String srpTarget;
    public Long timeStr;
    public String uniqpid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum ItemSource {
        REMOTE_TFS(0, "远程tfs key"),
        LOCAL_ALBUM(1, "本地相册");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String mDesc;
        private int mValue;

        ItemSource(int i, String str) {
            this.mValue = i;
            this.mDesc = str;
        }

        public static /* synthetic */ Object ipc$super(ItemSource itemSource, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/history/AuctionItemVO$ItemSource");
        }

        public static ItemSource valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ItemSource) ipChange.ipc$dispatch("89efd1dd", new Object[]{str});
            }
            return (ItemSource) Enum.valueOf(ItemSource.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.mValue;
        }
    }

    static {
        t2o.a(481296941);
    }

    public AuctionItemVO deepClone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionItemVO) ipChange.ipc$dispatch("4eb0cb48", new Object[]{this});
        }
        AuctionItemVO auctionItemVO = new AuctionItemVO();
        auctionItemVO.picPath = this.picPath;
        auctionItemVO.price = this.price;
        auctionItemVO.priceWithRate = this.priceWithRate;
        auctionItemVO.auctionURL = this.auctionURL;
        auctionItemVO.uniqpid = this.uniqpid;
        auctionItemVO.itemId = this.itemId;
        auctionItemVO.spuId = this.spuId;
        auctionItemVO.srpTarget = this.srpTarget;
        auctionItemVO.timeStr = this.timeStr;
        auctionItemVO.photofrom = this.photofrom;
        auctionItemVO.mExtraJSKV = this.mExtraJSKV;
        auctionItemVO.isVideo = this.isVideo;
        auctionItemVO.duration = this.duration;
        auctionItemVO.fileUrl = this.fileUrl;
        auctionItemVO.mSource = this.mSource;
        auctionItemVO.allowanceStatus = this.allowanceStatus;
        return auctionItemVO;
    }

    public boolean hasAllowance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62347829", new Object[]{this})).booleanValue();
        }
        if (this.allowanceStatus == 1) {
            return true;
        }
        return false;
    }
}
