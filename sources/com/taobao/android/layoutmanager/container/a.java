package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout;
import tb.gl4;
import tb.lgs;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8186a;
    public final lgs.b b;
    public final BaseContainerFragment c;
    public boolean d;

    static {
        t2o.a(502267991);
    }

    public a(Context context, BaseContainerFragment baseContainerFragment, lgs.b bVar) {
        this.f8186a = context;
        this.c = baseContainerFragment;
        this.b = bVar;
    }

    public boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad396080", new Object[]{this, activity})).booleanValue();
        }
        boolean o = nwv.o(this.b.b.getQueryParameter("animated"), true);
        if (!o || activity == null) {
            return o;
        }
        return nwv.o(activity.getIntent().getStringExtra("animated"), true);
    }

    public void c(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e22a14", new Object[]{this, nVar});
        }
    }

    public void b(Activity activity, BaseContainerFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2358b0", new Object[]{this, activity, bVar});
            return;
        }
        boolean o = nwv.o(this.b.b.getQueryParameter(gl4.CONFIG_PULL_DOWN), false);
        bVar.onFinish();
        if (o) {
            if (activity != null) {
                activity.overridePendingTransition(0, this.d ? 0 : 17432577);
            }
        } else if (activity != null && !a(activity)) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27df9926", new Object[]{this, activity});
            return;
        }
        ViewGroup v2 = this.c.v2();
        v2.setClickable(true);
        boolean o = nwv.o(this.b.b.getQueryParameter(gl4.CONFIG_PULL_DOWN), false);
        if (v2 instanceof PullDownCloseLayout) {
            ((PullDownCloseLayout) v2).setForbidGesture(true ^ o);
        }
    }
}
