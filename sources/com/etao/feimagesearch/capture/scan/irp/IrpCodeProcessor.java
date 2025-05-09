package com.etao.feimagesearch.capture.scan.irp;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.util.ScancodeController;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.HashMap;
import tb.agh;
import tb.hvm;
import tb.jso;
import tb.nmd;
import tb.t2o;
import tb.zlf;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IrpCodeProcessor implements hvm, LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.taobao.scancode.gateway.util.a f4676a;
    public final FragmentActivity b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements nmd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f4677a;

        public a(IrpCodeProcessor irpCodeProcessor, HashMap hashMap) {
            this.f4677a = hashMap;
        }

        @Override // tb.nmd
        public HashMap<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("5f815aaa", new Object[]{this});
            }
            return this.f4677a;
        }
    }

    static {
        t2o.a(481296713);
        t2o.a(760217732);
        t2o.a(481296694);
    }

    public IrpCodeProcessor(FragmentActivity fragmentActivity, HashMap<String, String> hashMap) {
        this.b = fragmentActivity;
        this.f4676a = a(fragmentActivity, hashMap);
        fragmentActivity.getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        agh.h("_scancode_IrpCodeProcessor", "onDestroy");
        this.b.getLifecycle().removeObserver(this);
        zlf.a().c(this.b);
        zmf.g().h();
    }

    public final com.taobao.taobao.scancode.gateway.util.a a(FragmentActivity fragmentActivity, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taobao.scancode.gateway.util.a) ipChange.ipc$dispatch("cf52cbd4", new Object[]{this, fragmentActivity, hashMap});
        }
        jso jsoVar = new jso();
        jsoVar.j(fragmentActivity);
        com.taobao.taobao.scancode.gateway.util.a aVar = new com.taobao.taobao.scancode.gateway.util.a(jsoVar, new ScancodeController(this), fragmentActivity, new a(this, hashMap));
        aVar.G("Page_ScanHome");
        return aVar;
    }

    public boolean b(FragmentActivity fragmentActivity, MaResult maResult, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c761d71", new Object[]{this, fragmentActivity, maResult, str})).booleanValue();
        }
        return this.f4676a.s(maResult, null, str);
    }

    @Override // tb.hvm
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
        }
    }

    @Override // tb.hvm
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        }
    }
}
