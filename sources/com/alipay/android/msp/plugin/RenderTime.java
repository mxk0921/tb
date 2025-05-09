package com.alipay.android.msp.plugin;

import com.alipay.android.app.render.api.result.RenderStatistic;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RenderTime {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RenderStatistic f3720a = new RenderStatistic();
    public long b;

    public long getDownloadTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fc34e6", new Object[]{this})).longValue();
        }
        return this.f3720a.getDownloadTime();
    }

    public RenderStatistic getInnerStatistic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderStatistic) ipChange.ipc$dispatch("ef789f3d", new Object[]{this});
        }
        return this.f3720a;
    }

    public long getParseTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12cd80e5", new Object[]{this})).longValue();
        }
        return this.f3720a.getParseTime();
    }

    public long getRenderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4212574", new Object[]{this})).longValue();
        }
        return this.f3720a.getRenderTime();
    }

    public long getShowTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2462d5b", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public void setShowTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29565cb1", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }
}
