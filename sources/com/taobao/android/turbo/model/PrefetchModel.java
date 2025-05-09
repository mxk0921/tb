package com.taobao.android.turbo.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/taobao/android/turbo/model/PrefetchModel;", "", "()V", "clientConfig", "", "", "getClientConfig", "()Ljava/util/Map;", "setClientConfig", "(Ljava/util/Map;)V", "ctrRankScore", "", "getCtrRankScore", "()F", "setCtrRankScore", "(F)V", "disablePreloading", "", "getDisablePreloading", "()Z", "setDisablePreloading", "(Z)V", "limit", "", "getLimit", "()I", "setLimit", "(I)V", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PrefetchModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> clientConfig;
    private float ctrRankScore;
    private boolean disablePreloading;
    private int limit = Integer.MAX_VALUE;

    static {
        t2o.a(916455481);
    }

    public final Map<String, String> getClientConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eaf7dd1f", new Object[]{this});
        }
        return this.clientConfig;
    }

    public final float getCtrRankScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8af54212", new Object[]{this})).floatValue();
        }
        return this.ctrRankScore;
    }

    public final boolean getDisablePreloading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c984c96", new Object[]{this})).booleanValue();
        }
        return this.disablePreloading;
    }

    public final int getLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6753ebff", new Object[]{this})).intValue();
        }
        return this.limit;
    }

    public final void setClientConfig(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49429f4f", new Object[]{this, map});
        } else {
            this.clientConfig = map;
        }
    }

    public final void setCtrRankScore(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af497652", new Object[]{this, new Float(f)});
        } else {
            this.ctrRankScore = f;
        }
    }

    public final void setDisablePreloading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b5948e", new Object[]{this, new Boolean(z)});
        } else {
            this.disablePreloading = z;
        }
    }

    public final void setLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14e5683", new Object[]{this, new Integer(i)});
        } else {
            this.limit = i;
        }
    }
}
