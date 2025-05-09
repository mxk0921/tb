package com.taobao.message.biz.share;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.Contacts;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ShareParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<Contacts> contacts;
    private String shareRemark;
    private String shareUrl;

    static {
        t2o.a(529530895);
    }

    public ShareParams(List<Contacts> list, String str) {
        this.contacts = list;
        this.shareUrl = str;
    }

    public List<Contacts> getContacts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ff466277", new Object[]{this});
        }
        return this.contacts;
    }

    public String getShareRemark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab50fb90", new Object[]{this});
        }
        return this.shareRemark;
    }

    public String getShareUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("732de433", new Object[]{this});
        }
        return this.shareUrl;
    }

    public void setContacts(List<Contacts> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2965cd", new Object[]{this, list});
        } else {
            this.contacts = list;
        }
    }

    public void setShareRemark(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d685a54e", new Object[]{this, str});
        } else {
            this.shareRemark = str;
        }
    }

    public void setShareUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6bfca3", new Object[]{this, str});
        } else {
            this.shareUrl = str;
        }
    }
}
