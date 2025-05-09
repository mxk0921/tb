package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.ckf;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AutoDetectExtraInfoCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_INFO_KEY = "plt_autodetect_extraInfo";

    /* renamed from: a  reason: collision with root package name */
    public String f4760a;
    public static final a Companion = new a(null);
    public static final njg<AutoDetectExtraInfoCache> b = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, AutoDetectExtraInfoCache$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296993);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final AutoDetectExtraInfoCache a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AutoDetectExtraInfoCache) ipChange.ipc$dispatch("3f284dc", new Object[]{this});
            }
            return (AutoDetectExtraInfoCache) AutoDetectExtraInfoCache.a().getValue();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296992);
    }

    public /* synthetic */ AutoDetectExtraInfoCache(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return b;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f4760a = "";
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d6b4ff", new Object[]{this});
        }
        return this.f4760a;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52c69a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "value");
        this.f4760a = str;
    }

    public AutoDetectExtraInfoCache() {
        this.f4760a = "";
    }
}
