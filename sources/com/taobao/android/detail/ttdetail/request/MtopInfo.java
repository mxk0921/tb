package com.taobao.android.detail.ttdetail.request;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;
import tb.v7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile int f6873a = 0;
    public List<byte[]> b;
    public volatile MtopResponse c;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface DataStatusValue {
    }

    static {
        t2o.a(912262148);
    }

    public MtopResponse a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("46f2105d", new Object[]{this});
        }
        return this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.f6873a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa9d4b46", new Object[]{this});
        }
        int i = this.f6873a;
        if (i == 1) {
            return "STREAMING";
        }
        if (i == 2) {
            return "SUCCESS";
        }
        if (i != 3) {
            return v7b.DEFAULT_HTTPS_ERROR_INVALID;
        }
        return "ERROR";
    }

    public MtopInfo d(List<byte[]> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("912231a9", new Object[]{this, list});
        }
        this.b = list;
        return this;
    }

    public MtopInfo e(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("9e7b6797", new Object[]{this, mtopResponse});
        }
        this.c = mtopResponse;
        return this;
    }

    public MtopInfo f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("a00246f0", new Object[]{this, new Integer(i)});
        }
        if (!(i == 0 || i == 1 || i == 2 || i == 3)) {
            i = 0;
        }
        this.f6873a = i;
        return this;
    }
}
