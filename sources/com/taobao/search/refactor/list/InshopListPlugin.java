package com.taobao.search.refactor.list;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.search.refactor.list.InshopListPlugin;
import kotlin.a;
import tb.ckf;
import tb.d1a;
import tb.euc;
import tb.i6p;
import tb.mbf;
import tb.njg;
import tb.t2o;
import tb.ww1;
import tb.xjh;
import tb.zlo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class InshopListPlugin extends ww1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final njg e;

    static {
        t2o.a(815792895);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InshopListPlugin(final MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
        this.e = a.b(new d1a() { // from class: tb.daz
            @Override // tb.d1a
            public final Object invoke() {
                mbf o;
                o = InshopListPlugin.o(MetaListWidget.this);
                return o;
            }
        });
    }

    public static /* synthetic */ Object ipc$super(InshopListPlugin inshopListPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/list/InshopListPlugin");
    }

    public static final mbf o(MetaListWidget metaListWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbf) ipChange.ipc$dispatch("6fa89994", new Object[]{metaListWidget});
        }
        ckf.g(metaListWidget, "$widget");
        return mbf.CREATOR.a(metaListWidget.v2());
    }

    @Override // tb.ww1
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b693f8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            a().subscribeScopeEvent(this, "childPageWidget");
            a().subscribeEvent(this);
        }
    }

    public final void onEventMainThread(i6p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81baeaa", new Object[]{this, aVar});
        } else {
            a().Q();
        }
    }

    public final mbf p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbf) ipChange.ipc$dispatch("539ea877", new Object[]{this});
        }
        Object value = this.e.getValue();
        ckf.f(value, "getValue(...)");
        return (mbf) value;
    }

    public final void onEventMainThread(zlo zloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e83711d", new Object[]{this, zloVar});
        } else {
            ((euc) a().t2()).getRecyclerView().setBackgroundColor(0);
        }
    }

    public final void onEventMainThread(xjh xjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403d8e70", new Object[]{this, xjhVar});
            return;
        }
        ckf.g(xjhVar, "event");
        p().K2(xjhVar.f31426a, xjhVar.b);
    }
}
