package com.alipay.android.app.helper;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Tid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String key;
    private String tid;
    private long time;

    public String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.tid;
    }

    public String getTidSeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("771675cf", new Object[]{this});
        }
        return this.key;
    }

    public long getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return this.time;
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return TextUtils.isEmpty(this.tid);
    }

    public void setTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30138b9e", new Object[]{this, str});
        } else {
            this.tid = str;
        }
    }

    public void setTidSeed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bbccef", new Object[]{this, str});
        } else {
            this.key = str;
        }
    }

    public void setTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcccc9", new Object[]{this, new Long(j)});
        } else {
            this.time = j;
        }
    }
}
