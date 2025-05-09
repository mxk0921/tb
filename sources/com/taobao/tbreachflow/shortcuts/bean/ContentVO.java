package com.taobao.tbreachflow.shortcuts.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ContentVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String id;
    private List<ItemVO> itemList;
    private long nextRefreshTime;
    private boolean success;

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public List<ItemVO> getItemList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this});
        }
        return this.itemList;
    }

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue();
        }
        return this.nextRefreshTime;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setItemList(List<ItemVO> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcaf8cb", new Object[]{this, list});
        } else {
            this.itemList = list;
        }
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.success = z;
        }
    }
}
