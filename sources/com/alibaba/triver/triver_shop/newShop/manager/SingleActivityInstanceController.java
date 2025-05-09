package com.alibaba.triver.triver_shop.newShop.manager;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import tb.ckf;
import tb.lcf;
import tb.npp;
import tb.r54;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SingleActivityInstanceController<A extends Activity> extends lcf<A> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509581);
    }

    public SingleActivityInstanceController() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(SingleActivityInstanceController singleActivityInstanceController, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/manager/SingleActivityInstanceController");
    }

    /* renamed from: l */
    public void a(A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e42ad6f", new Object[]{this, a2});
            return;
        }
        ckf.g(a2, "instance");
        b(a2);
        r54.E(new SingleActivityInstanceController$addInstance$1((Activity) i()), 500L);
    }

    public final Activity m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("96fb3d1d", new Object[]{this});
        }
        try {
            return (Activity) d();
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(b.a(th)));
            if (th2 == null) {
                return null;
            }
            npp.Companion.c("catching block has error", th2);
            return null;
        }
    }

    /* renamed from: n */
    public void j(A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9e7492", new Object[]{this, a2});
            return;
        }
        ckf.g(a2, "instance");
        h(a2);
    }
}
