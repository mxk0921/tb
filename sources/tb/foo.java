package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.i1q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class foo implements i1q.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SkinConfig f19443a;
    public final Map<String, Map<String, String>> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b1q.a(foo.b(foo.this).skinCode)) {
                b1q.d(foo.b(foo.this).skinCode);
            }
        }
    }

    static {
        t2o.a(464519228);
        t2o.a(464519197);
    }

    public foo(SkinConfig skinConfig, Map<String, Map<String, String>> map) {
        this.f19443a = skinConfig;
        this.b = map;
    }

    public static /* synthetic */ SkinConfig b(foo fooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("a17dbe35", new Object[]{fooVar});
        }
        return fooVar.f19443a;
    }

    @Override // tb.i1q.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1170927", new Object[]{this});
            return;
        }
        k1q.q().z(this.b);
        Coordinator.execute(new a());
        g1q.h().o();
        TLog.loge("festival", "", "notifyUpdate");
    }

    @Override // tb.i1q.b
    public void onFailure(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
        } else {
            TLog.loge("SUTPreloadListener", "onFailure", str2);
        }
    }
}
