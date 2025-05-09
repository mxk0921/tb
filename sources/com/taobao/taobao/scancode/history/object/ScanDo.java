package com.taobao.taobao.scancode.history.object;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScanDo implements IMTOPDataObject, Serializable {
    private MaResult decodeResult;
    private String desc;
    private int icon;
    private String link;
    private Boolean newLogic;
    private Product product;
    private long time;
    private String title;
    private int image = 1;
    private int type = 2;
    private boolean networkAvailable = true;

    static {
        t2o.a(760217756);
        t2o.a(589299906);
    }

    public MaResult getDecodeResult() {
        return this.decodeResult;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getImage() {
        return this.image;
    }

    public String getLink() {
        return this.link;
    }

    public String getLocalizationTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return "";
        }
        if (this.title.equals("淘宝网网址")) {
            return Localization.q(R.string.scancode_history_item_title_tb);
        }
        if (this.title.equals("天猫网网址")) {
            return Localization.q(R.string.scancode_history_item_title_tm);
        }
        if (this.title.equals("二维码内容")) {
            return Localization.q(R.string.scancode_history_item_title_qr);
        }
        if (this.title.equals("文本")) {
            return Localization.q(R.string.scancode_history_item_title_text);
        }
        if (this.title.equals("商品条形码")) {
            return Localization.q(R.string.scancode_history_item_title_product);
        }
        if (this.title.equals("药品条形码")) {
            return Localization.q(R.string.scancode_history_item_title_medicine);
        }
        if (this.title.equals("快递条形码")) {
            return Localization.q(R.string.scancode_history_item_title_express);
        }
        if (this.title.equals("普通条形码")) {
            return Localization.q(R.string.scancode_history_item_title_unknown_code);
        }
        return "";
    }

    public Product getProduct() {
        return this.product;
    }

    public long getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public boolean isNetworkAvailable() {
        return this.networkAvailable;
    }

    public Boolean isNewLogic() {
        return this.newLogic;
    }

    public void setDecodeResult(MaResult maResult) {
        this.decodeResult = maResult;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImage(int i) {
        this.image = i;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setNetworkAvailable(boolean z) {
        this.networkAvailable = z;
    }

    public void setNewLogic(Boolean bool) {
        this.newLogic = bool;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
