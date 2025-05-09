package com.taobao.themis.taobao.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter;
import com.taobao.themis.kernel.preload.a;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.h8s;
import tb.p9s;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/taobao/lifecycle/TBInstanceLifecycleAdapter;", "Lcom/taobao/themis/kernel/adapter/IInstanceLifecycleAdapter;", "<init>", "()V", "Ltb/bbs;", "instance", "Ltb/xhv;", "onCreate", "(Ltb/bbs;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBInstanceLifecycleAdapter implements IInstanceLifecycleAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249536);
        t2o.a(839909473);
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onCreate(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcffab5e", new Object[]{this, bbsVar});
        } else {
            ckf.g(bbsVar, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onDestroy(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a51cbe", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        a.d();
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onPause(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8eebfa", new Object[]{this, bbsVar});
        } else {
            ckf.g(bbsVar, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onResume(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4d454f", new Object[]{this, bbsVar});
        } else {
            ckf.g(bbsVar, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onStart(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5636c366", new Object[]{this, bbsVar});
        } else {
            ckf.g(bbsVar, "instance");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter
    public void onStop(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf3dea4", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        if (h8s.f(bbsVar.I(), "pauseAndRestartInitTask").d()) {
            p9s.c();
            p9s.a();
            p9s.d();
            p9s.b();
        }
    }
}
