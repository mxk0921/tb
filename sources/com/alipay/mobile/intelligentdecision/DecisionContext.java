package com.alipay.mobile.intelligentdecision;

import android.content.Context;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecisionContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile DecisionContext c;

    /* renamed from: a  reason: collision with root package name */
    public Context f4224a;
    public String b;

    public static DecisionContext getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecisionContext) ipChange.ipc$dispatch("9fb05722", new Object[0]);
        }
        if (c == null) {
            synchronized (DecisionContext.class) {
                try {
                    if (c == null) {
                        c = new DecisionContext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void attachContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
        } else {
            this.f4224a = context;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f4224a;
    }

    public String getCurrentUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae6810c", new Object[]{this});
        }
        DecisionLogcat.b("DecisionContext", "get uid:" + this.b);
        return this.b;
    }

    public void setCurrentUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d327ea", new Object[]{this, str});
            return;
        }
        this.b = str;
        DecisionLogcat.b("DecisionContext", "setCurrentUid uid:" + str);
    }
}
