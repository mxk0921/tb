package com.taobao.android.editionswitcher.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.a3w;
import tb.f4b;
import tb.kca;
import tb.r78;
import tb.s1c;
import tb.s78;
import tb.t1c;
import tb.t2o;
import tb.t78;
import tb.t7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class EditionSwitchServiceImpl implements t1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(456130660);
        t2o.a(456130608);
    }

    @Override // tb.t1c
    public void addChangeVersionListener(s1c s1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6dc02a", new Object[]{this, s1cVar});
        } else {
            kca.e().a(s1cVar);
        }
    }

    @Override // tb.t1c
    public void doChangeVersion(s78 s78Var, t7l t7lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdebfcac", new Object[]{this, s78Var, t7lVar});
        } else {
            r78.b().a(s78Var, t7lVar);
        }
    }

    @Override // tb.t1c
    public boolean isSpecifyVersionCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53791a3", new Object[]{this, str})).booleanValue();
        }
        return kca.e().g(str);
    }

    @Override // tb.t1c
    public void onVersionResponse(t78 t78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb26df5", new Object[]{this, t78Var});
        } else {
            kca.e().j(t78Var);
        }
    }

    public a3w queryByVersionCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("3db06cce", new Object[]{this, str});
        }
        return kca.e().f(str);
    }

    @Override // tb.t1c
    public void removeChangeVersionListener(s1c s1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e55ef0d", new Object[]{this, s1cVar});
        } else {
            kca.e().m(s1cVar);
        }
    }

    public void updateVersionInfo(Context context, List<a3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175e2215", new Object[]{this, context, list});
        } else {
            kca.e().q(list);
        }
    }

    @Override // tb.t1c
    public a3w queryCurrentVersionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("6e662709", new Object[]{this});
        }
        if (!f4b.b("editionSwitchNotifyUcp", true)) {
            return null;
        }
        return kca.e().k();
    }
}
