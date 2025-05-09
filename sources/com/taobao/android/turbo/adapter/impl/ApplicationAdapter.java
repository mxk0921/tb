package com.taobao.android.turbo.adapter.impl;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.TBFragmentTabHost;
import tb.a07;
import tb.hhb;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ApplicationAdapter implements hhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final njg f9721a = kotlin.a.b(ApplicationAdapter$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601184);
        }

        public a() {
        }

        public final ApplicationAdapter a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("73f49ec9", new Object[]{this});
            } else {
                value = ApplicationAdapter.b().getValue();
            }
            return (ApplicationAdapter) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601183);
        t2o.a(919601163);
    }

    public static final /* synthetic */ njg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("fb99327c", new Object[0]);
        }
        return f9721a;
    }

    @Override // tb.hhb
    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("51a25fe3", new Object[]{this});
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o == null || !(o.getContext() instanceof Activity)) {
            return null;
        }
        Context context = o.getContext();
        if (context != null) {
            return (Activity) context;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }
}
