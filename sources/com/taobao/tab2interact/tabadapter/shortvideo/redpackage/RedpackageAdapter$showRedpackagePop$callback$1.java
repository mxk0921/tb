package com.taobao.tab2interact.tabadapter.shortvideo.redpackage;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.g1a;
import tb.jpu;
import tb.v3i;
import tb.xhv;
import tb.yfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RedpackageAdapter$showRedpackagePop$callback$1 implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RedpackageAdapter f11870a;
    public final /* synthetic */ boolean b;

    public RedpackageAdapter$showRedpackagePop$callback$1(RedpackageAdapter redpackageAdapter, boolean z) {
        this.f11870a = redpackageAdapter;
        this.b = z;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map) {
        a(map);
        return xhv.INSTANCE;
    }

    public void a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
            return;
        }
        ckf.g(map, "data");
        Object obj = map.get("tokenCount");
        if (obj != null) {
            RedpackageAdapter.j0(this.f11870a, this.b, obj);
            RedpackageAdapter.k0(this.f11870a, "opened", v3i.f(jpu.a("94268", map)));
            RedpackageAdapter.O(this.f11870a, true);
            RedpackageAdapter.V(this.f11870a, yfm.POP_RED_PACKAGE_RESULT, map, new RedpackageAdapter$showRedpackagePop$callback$1$invoke$1(this, obj));
        }
    }
}
