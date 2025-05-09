package com.ut.share.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.SharePlatform;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareAppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String name;
    private int resId;
    private SharePlatform spt;

    static {
        t2o.a(662700055);
    }

    public ShareAppInfo() {
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public int getResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4752aa1f", new Object[]{this})).intValue();
        }
        return this.resId;
    }

    public SharePlatform getSpt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharePlatform) ipChange.ipc$dispatch("d7fb12fd", new Object[]{this});
        }
        return this.spt;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public void setResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1275c63", new Object[]{this, new Integer(i)});
        } else {
            this.resId = i;
        }
    }

    public void setSpt(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81d982b", new Object[]{this, sharePlatform});
        } else {
            this.spt = sharePlatform;
        }
    }

    public ShareAppInfo(SharePlatform sharePlatform, String str, int i) {
        this.spt = sharePlatform;
        this.name = str;
        this.resId = i;
    }
}
