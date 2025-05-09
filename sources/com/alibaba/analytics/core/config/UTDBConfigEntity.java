package com.alibaba.analytics.core.config;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rf8;
import tb.t2o;

/* compiled from: Taobao */
@TableName("onlineconfig")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTDBConfigEntity extends rf8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("groupname")
    private String mGroupname = null;
    @Column("content")
    private String mContent = null;
    @Column("timestamp")
    private long mConfTimestamp = 0;
    @Ingore
    private boolean mIs304 = false;

    static {
        t2o.a(962592835);
    }

    public static /* synthetic */ Object ipc$super(UTDBConfigEntity uTDBConfigEntity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/config/UTDBConfigEntity");
    }

    public String getConfContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8605d0da", new Object[]{this});
        }
        return this.mContent;
    }

    public long getConfTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9741f517", new Object[]{this})).longValue();
        }
        return this.mConfTimestamp;
    }

    public String getGroupname() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("820f70a5", new Object[]{this});
        }
        return this.mGroupname;
    }

    public boolean is304() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58f16618", new Object[]{this})).booleanValue();
        }
        return this.mIs304;
    }

    public void set304Flag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607c2e8", new Object[]{this});
        } else {
            this.mIs304 = true;
        }
    }

    public void setConfContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526b7944", new Object[]{this, str});
        } else {
            this.mContent = str;
        }
    }

    public void setConfTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e828a80d", new Object[]{this, new Long(j)});
        } else {
            this.mConfTimestamp = j;
        }
    }

    public void setGroupname(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421c5fd9", new Object[]{this, str});
        } else {
            this.mGroupname = str;
        }
    }
}
