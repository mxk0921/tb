package com.taobao.message.biz.share;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.Contacts;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ShareGoodsParams extends ShareParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String extendInfo;
    private String shareDesc;
    private String shareItemId;
    private String sharePicUrl;
    private String sharePrice;

    static {
        t2o.a(529530893);
    }

    public ShareGoodsParams(List<Contacts> list, String str, String str2, String str3, String str4, String str5) {
        super(list, str);
        this.shareItemId = str2;
        this.sharePicUrl = str3;
        this.sharePrice = str4;
        this.shareDesc = str5;
    }

    public static /* synthetic */ Object ipc$super(ShareGoodsParams shareGoodsParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/biz/share/ShareGoodsParams");
    }

    public String getExtendInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("915112db", new Object[]{this});
        }
        return this.extendInfo;
    }

    public String getShareDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1881edf", new Object[]{this});
        }
        return this.shareDesc;
    }

    public String getShareItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e229e842", new Object[]{this});
        }
        return this.shareItemId;
    }

    public String getSharePicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cca42cab", new Object[]{this});
        }
        return this.sharePicUrl;
    }

    public String getSharePrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc031659", new Object[]{this});
        }
        return this.sharePrice;
    }

    public void setExtendInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbacffb", new Object[]{this, str});
        } else {
            this.extendInfo = str;
        }
    }
}
