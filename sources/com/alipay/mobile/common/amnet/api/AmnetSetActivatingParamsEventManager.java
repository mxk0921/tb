package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.ActivatingParams;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetSetActivatingParamsEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AmnetSetActivatingParamsEventManager b;

    /* renamed from: a  reason: collision with root package name */
    public List<AmnetSetActivatingParamsListener> f3885a;

    public static final AmnetSetActivatingParamsEventManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetSetActivatingParamsEventManager) ipChange.ipc$dispatch("1d669588", new Object[0]);
        }
        AmnetSetActivatingParamsEventManager amnetSetActivatingParamsEventManager = b;
        if (amnetSetActivatingParamsEventManager != null) {
            return amnetSetActivatingParamsEventManager;
        }
        synchronized (AmnetSetActivatingParamsEventManager.class) {
            try {
                AmnetSetActivatingParamsEventManager amnetSetActivatingParamsEventManager2 = b;
                if (amnetSetActivatingParamsEventManager2 != null) {
                    return amnetSetActivatingParamsEventManager2;
                }
                AmnetSetActivatingParamsEventManager amnetSetActivatingParamsEventManager3 = new AmnetSetActivatingParamsEventManager();
                b = amnetSetActivatingParamsEventManager3;
                return amnetSetActivatingParamsEventManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<AmnetSetActivatingParamsListener> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<AmnetSetActivatingParamsListener> list = this.f3885a;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            try {
                List<AmnetSetActivatingParamsListener> list2 = this.f3885a;
                if (list2 != null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(1);
                this.f3885a = arrayList;
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(AmnetSetActivatingParamsListener amnetSetActivatingParamsListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8ee0a9", new Object[]{this, amnetSetActivatingParamsListener});
        } else if (amnetSetActivatingParamsListener != null) {
            List<AmnetSetActivatingParamsListener> a2 = a();
            if (a2.contains(amnetSetActivatingParamsListener)) {
                LogCatUtil.info("AmnetSetActivatingParamsEventManager", "[addListener] Do not add , repeated listener = ".concat(amnetSetActivatingParamsListener.getClass().getName()));
                return;
            }
            a2.add(amnetSetActivatingParamsListener);
            LogCatUtil.info("AmnetSetActivatingParamsEventManager", "[addListener] index = " + (a2.size() - 1) + ", listener = " + amnetSetActivatingParamsListener.getClass().getName());
        }
    }

    public final List<AmnetSetActivatingParamsListener> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<AmnetSetActivatingParamsListener> list = this.f3885a;
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public void onAfterSetActivatingParamsEvent(ActivatingParams activatingParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade096fe", new Object[]{this, activatingParams});
            return;
        }
        List<AmnetSetActivatingParamsListener> b2 = b();
        for (int i = 0; i < b2.size(); i++) {
            try {
                if (b2.get(i) == null) {
                    LogCatUtil.warn("AmnetSetActivatingParamsEventManager", "[onAfter] listener is null,  index = " + i);
                } else {
                    b2.get(i).onAfterSetActivatingParamsEvent(activatingParams);
                }
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetSetActivatingParamsEventManager", "[onAfter] Exception = " + th.toString());
            }
        }
    }
}
