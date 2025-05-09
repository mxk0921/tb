package com.taobao.themis.inside.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.themis.kernel.adapter.ICrashCatchAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/inside/adapter/TCrashAdapter;", "Lcom/taobao/themis/kernel/adapter/ICrashCatchAdapter;", "<init>", "()V", "Lcom/taobao/themis/kernel/adapter/ICrashCatchAdapter$a;", DataReceiveMonitor.CB_LISTENER, "Ltb/xhv;", "addJavaCrashListener", "(Lcom/taobao/themis/kernel/adapter/ICrashCatchAdapter$a;)V", "removeJavaCrashListener", "", "key", "value", "addHeaderInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TCrashAdapter implements ICrashCatchAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<ICrashCatchAdapter.a, JvmUncaughtCrashListener> f13525a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ICrashCatchAdapter.a f13526a;

        public a(ICrashCatchAdapter.a aVar) {
            this.f13526a = aVar;
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public final Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            return this.f13526a.onJvmUncaughtCrash(thread, th);
        }
    }

    static {
        t2o.a(837812268);
        t2o.a(839909463);
    }

    @Override // com.taobao.themis.kernel.adapter.ICrashCatchAdapter
    public void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(str, str2);
    }

    @Override // com.taobao.themis.kernel.adapter.ICrashCatchAdapter
    public void addJavaCrashListener(ICrashCatchAdapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ff6f79", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        a aVar2 = new a(aVar);
        this.f13525a.put(aVar, aVar2);
        TCrashSDK.instance().addJvmUncaughtCrashListener(aVar2);
    }

    @Override // com.taobao.themis.kernel.adapter.ICrashCatchAdapter
    public void removeJavaCrashListener(ICrashCatchAdapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d24b36", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        JvmUncaughtCrashListener jvmUncaughtCrashListener = (JvmUncaughtCrashListener) ((LinkedHashMap) this.f13525a).get(aVar);
        if (jvmUncaughtCrashListener != null) {
            TCrashSDK.instance().removeJvmUncaughtCrashListener(jvmUncaughtCrashListener);
            this.f13525a.remove(aVar);
        }
    }
}
