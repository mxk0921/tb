package com.taobao.themis.taobao.account;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import mtopsdk.mtop.intf.Mtop;
import tb.bbs;
import tb.ckf;
import tb.nyn;
import tb.p8s;
import tb.rid;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/taobao/account/TMSAccountAdapter;", "Lcom/taobao/themis/kernel/adapter/IAccountAdapter;", "<init>", "()V", "", "isLogin", "()Z", "Ltb/bbs;", "instance", "(Ltb/bbs;)Z", "", "getUserId", "(Ltb/bbs;)Ljava/lang/String;", "getNick", "getUserAvatar", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSAccountAdapter implements IAccountAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249413);
        t2o.a(839909458);
    }

    public final Mtop a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("255bc38a", new Object[]{this});
        }
        Mtop instance = Mtop.instance(Mtop.Id.INNER, ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext());
        ckf.f(instance, "instance(\n            Mt…licationContext\n        )");
        return instance;
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public String getNick(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c0afe24", new Object[]{this, bbsVar});
        }
        rid a2 = nyn.a(a());
        ckf.f(a2, "getLogin(getMtop())");
        if (a2.getLoginContext() != null) {
            return a2.getLoginContext().c;
        }
        return "";
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public String getUserAvatar(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c3b0863", new Object[]{this, bbsVar});
        }
        try {
            return Login.getHeadPicLink();
        } catch (Throwable th) {
            TMSLogger.c("TMSAccountAdapter", "getUserAvatar has Error", th);
            return null;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public String getUserId(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17bcb2e1", new Object[]{this, bbsVar});
        }
        rid a2 = nyn.a(a());
        ckf.f(a2, "getLogin(getMtop())");
        if (a2.getLoginContext() != null) {
            return a2.getLoginContext().b;
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public boolean isLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue() : Login.getSid() != null;
    }

    @Override // com.taobao.themis.kernel.adapter.IAccountAdapter
    public boolean isLogin(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a31c306", new Object[]{this, bbsVar})).booleanValue() : nyn.d(a(), null);
    }
}
