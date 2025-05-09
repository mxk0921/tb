package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.alibaba.wukong.plugin.remote.TaobaoRemoteSoPluginManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.ca  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1150ca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2583a = "WuKongSoManager";
    public final HashMap<String, Boolean> b = new HashMap<>();
    public ITaobaoRemoteSoService c;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.security.ccrc.service.build.ca$a */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2584a;
        public String b;

        public a() {
        }

        public /* synthetic */ a(C1147ba baVar) {
        }
    }

    public C1150ca() {
        try {
            Object newInstance = TaobaoRemoteSoPluginManager.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof ITaobaoRemoteSoService) {
                this.c = (ITaobaoRemoteSoService) newInstance;
            }
        } catch (Throwable unused) {
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.b.containsKey(str) && this.b.get(str).booleanValue()) {
            return true;
        }
        if (b(str).f2584a) {
            this.b.put(str, Boolean.TRUE);
            return true;
        }
        ITaobaoRemoteSoService iTaobaoRemoteSoService = this.c;
        if (iTaobaoRemoteSoService == null || !iTaobaoRemoteSoService.isRemoteSoLoaded(str)) {
            return false;
        }
        this.b.put(str, Boolean.TRUE);
        return true;
    }

    private a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("392a0a6c", new Object[]{this, str});
        }
        a aVar = new a(null);
        try {
            System.loadLibrary(str);
            aVar.f2584a = true;
            aVar.b = "success";
            return aVar;
        } catch (Throwable th) {
            aVar.f2584a = false;
            aVar.b = th.getMessage();
            return aVar;
        }
    }

    public void a(String str, OnRemoteSoLoadListener onRemoteSoLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbbfb07", new Object[]{this, str, onRemoteSoLoadListener});
            return;
        }
        a b = b(str);
        if (b.f2584a) {
            this.b.put(str, Boolean.TRUE);
            onRemoteSoLoadListener.onResult(str, true, b.b);
        } else if (a(str)) {
            this.b.put(str, Boolean.TRUE);
            onRemoteSoLoadListener.onResult(str, true, "success");
        } else {
            ITaobaoRemoteSoService iTaobaoRemoteSoService = this.c;
            if (iTaobaoRemoteSoService == null) {
                onRemoteSoLoadListener.onResult(str, false, "remote so service is null");
            } else {
                iTaobaoRemoteSoService.loadRemoteSo(str, new C1147ba(this, onRemoteSoLoadListener));
            }
        }
    }
}
