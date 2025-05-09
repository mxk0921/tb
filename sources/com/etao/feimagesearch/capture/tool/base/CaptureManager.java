package com.etao.feimagesearch.capture.tool.base;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import tb.ckf;
import tb.n53;
import tb.njg;
import tb.r73;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final n53 f4686a;
    public final njg b = a.b(CaptureManager$hybridMsgManager$2.INSTANCE);
    public final njg c = a.b(CaptureManager$viewEventManager$2.INSTANCE);

    static {
        t2o.a(481296747);
    }

    public CaptureManager(n53 n53Var, boolean z) {
        ckf.g(n53Var, "datasource");
        this.f4686a = n53Var;
    }

    public final n53 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n53) ipChange.ipc$dispatch("181e7c37", new Object[]{this});
        }
        return this.f4686a;
    }

    public final r73 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r73) ipChange.ipc$dispatch("418020d1", new Object[]{this});
        }
        return (r73) this.c.getValue();
    }
}
