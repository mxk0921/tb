package com.taobao.themis.open.permission.auth.ui;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.utils.CommonExtKt;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class LocalAuthDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f13659a;
    public final String b;
    public final a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onCancel();

        void onConfirm();
    }

    static {
        t2o.a(843055349);
    }

    public LocalAuthDialog(Activity activity, String str, a aVar) {
        ckf.g(activity, "activity");
        ckf.g(str, "content");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.f13659a = activity;
        this.b = str;
        this.c = aVar;
    }

    public final Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f13659a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.b;
    }

    public final a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7b21a521", new Object[]{this});
        }
        return this.c;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            CommonExtKt.o(new LocalAuthDialog$show$1(this));
        }
    }
}
