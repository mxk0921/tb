package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import tb.gl4;
import tb.lgs;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267992);
    }

    public b(Context context, BaseContainerFragment baseContainerFragment, lgs.b bVar) {
        super(context, baseContainerFragment, bVar);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -551331664) {
            super.b((Activity) objArr[0], (BaseContainerFragment.b) objArr[1]);
            return null;
        } else if (hashCode == 668965158) {
            super.d((Activity) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/layoutmanager/container/DefaultContainerLifecycle");
        }
    }

    @Override // com.taobao.android.layoutmanager.container.a
    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27df9926", new Object[]{this, activity});
            return;
        }
        super.d(activity);
        if (activity != null && !a(activity)) {
            activity.overridePendingTransition(0, 0);
        }
        if (!nwv.o(this.b.b.getQueryParameter(gl4.CONFIG_FULLTRANSPARENT), false)) {
            this.c.v2().setBackgroundColor(-1);
        }
    }

    @Override // com.taobao.android.layoutmanager.container.a
    public void b(Activity activity, BaseContainerFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2358b0", new Object[]{this, activity, bVar});
            return;
        }
        boolean a2 = a(activity);
        boolean o = nwv.o(this.b.b.getQueryParameter(gl4.CONFIG_PULL_DOWN), false);
        if (!a2 || o) {
            super.b(activity, bVar);
        } else {
            bVar.onFinish();
        }
    }
}
