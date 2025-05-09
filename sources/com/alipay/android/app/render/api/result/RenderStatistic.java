package com.alipay.android.app.render.api.result;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RenderStatistic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f3486a = 0;
    public long b = 0;
    public long c = 0;

    public void appendDownLoadTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fdd0ae", new Object[]{this, new Long(j)});
        } else {
            this.f3486a += j;
        }
    }

    public void appendLoadTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803aa130", new Object[]{this, new Long(j)});
        } else {
            this.b += j;
        }
    }

    public long getDownloadTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fc34e6", new Object[]{this})).longValue();
        }
        return this.f3486a;
    }

    public long getParseTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12cd80e5", new Object[]{this})).longValue();
        }
        return this.b - this.f3486a;
    }

    public long getRenderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4212574", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public void setRenderTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6da9ab8", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }
}
