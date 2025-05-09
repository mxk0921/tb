package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class Cache implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String expires;
    private long maxAge = 604800;

    static {
        t2o.a(839909819);
    }

    public final String getExpires() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6d7b6bb", new Object[]{this});
        }
        return this.expires;
    }

    public final long getMaxAge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4ddf7ec", new Object[]{this})).longValue();
        }
        return this.maxAge;
    }

    public final void setExpires(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22a983", new Object[]{this, str});
        } else {
            this.expires = str;
        }
    }

    public final void setMaxAge(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d46f140", new Object[]{this, new Long(j)});
        } else {
            this.maxAge = j;
        }
    }
}
