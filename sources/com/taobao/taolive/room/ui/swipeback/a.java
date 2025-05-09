package com.taobao.taolive.room.ui.swipeback;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.ui.swipeback.SwipeBackLayout;
import java.lang.ref.WeakReference;
import tb.kyv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a implements SwipeBackLayout.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f13245a;

    static {
        t2o.a(779093278);
        t2o.a(779093276);
    }

    public a(Activity activity) {
        this.f13245a = new WeakReference<>(activity);
    }

    @Override // com.taobao.taolive.room.ui.swipeback.SwipeBackLayout.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0372d2", new Object[]{this});
        }
    }

    @Override // com.taobao.taolive.room.ui.swipeback.SwipeBackLayout.b
    public void b(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683f699", new Object[]{this, new Integer(i), new Float(f)});
        }
    }

    @Override // com.taobao.taolive.room.ui.swipeback.SwipeBackLayout.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb541b7", new Object[]{this});
            return;
        }
        Activity activity = this.f13245a.get();
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
    }

    @Override // com.taobao.taolive.room.ui.swipeback.SwipeBackLayout.b
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fbf8d9", new Object[]{this, new Integer(i)});
            return;
        }
        Activity activity = this.f13245a.get();
        if (activity != null) {
            kyv.a(activity);
        }
    }
}
