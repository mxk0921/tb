package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PreLoadModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bucketId;
    private List<PreLoadItem> items;
    private String bizName = "new_detail";
    private String sourceFrom = "InfoFlow";
    private String pageIndex = "-1";

    static {
        t2o.a(491782426);
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.bizName;
    }

    public String getBucketId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this});
        }
        return this.bucketId;
    }

    public List<PreLoadItem> getItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
        }
        return this.items;
    }

    public String getPageIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("483184c", new Object[]{this});
        }
        return this.pageIndex;
    }

    public String getSourceFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("916d1f7e", new Object[]{this});
        }
        return this.sourceFrom;
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public void setBucketId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7a7278", new Object[]{this, str});
        } else {
            this.bucketId = str;
        }
    }

    public void setItems(List<PreLoadItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
        } else {
            this.items = list;
        }
    }

    public void setPageIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dad12", new Object[]{this, str});
        } else {
            this.pageIndex = str;
        }
    }

    public void setSourceFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132057b8", new Object[]{this, str});
        } else {
            this.sourceFrom = str;
        }
    }
}
