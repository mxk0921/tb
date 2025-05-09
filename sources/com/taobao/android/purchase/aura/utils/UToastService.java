package com.taobao.android.purchase.aura.utils;

import android.app.Activity;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.eo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UToastService implements eo.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f9227a;
        public final /* synthetic */ String b;

        public a(Activity activity, String str) {
            this.f9227a = activity;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f9227a, this.b, 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f9228a;
        public final /* synthetic */ String b;

        public b(Activity activity, String str) {
            this.f9228a = activity;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TBToast.makeText(this.f9228a, this.b, 3000L).show();
            } catch (Exception unused) {
                Toast.makeText(this.f9228a, this.b, 0).show();
            }
        }
    }

    static {
        t2o.a(708837573);
        t2o.a(81789268);
    }

    private void showSystemToast(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0ecb9e", new Object[]{this, activity, str});
        } else {
            activity.runOnUiThread(new a(activity, str));
        }
    }

    private void showUToast(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc543b2", new Object[]{this, activity, str});
        } else {
            activity.runOnUiThread(new b(activity, str));
        }
    }

    @Override // tb.eo.c
    public void showToast(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af33ec4d", new Object[]{this, activity, str});
        } else if ("true".equals(OrangeConfig.getInstance().getConfig("aura_purchase", "useSystemToast", "false"))) {
            showSystemToast(activity, str);
        } else {
            showUToast(activity, str);
        }
    }
}
