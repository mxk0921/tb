package com.alipay.android.msp.framework.dynfun;

import android.util.Pair;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UtilsMig;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NativeTplRuntimeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = true;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<TplIdentity, WeakReference<FBDocument>> f3603a = new ConcurrentHashMap<>();

    public static TplIdentity a(TplIdentity tplIdentity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TplIdentity) ipChange.ipc$dispatch("dc6283e6", new Object[]{tplIdentity});
        }
        for (TplIdentity tplIdentity2 : f3603a.keySet()) {
            if (TplIdentity.matchSpec(tplIdentity, tplIdentity2)) {
                return tplIdentity2;
            }
        }
        return null;
    }

    public static List<TplIdentity> b(TplIdentity tplIdentity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5258521", new Object[]{tplIdentity});
        }
        ArrayList arrayList = new ArrayList();
        for (TplIdentity tplIdentity2 : f3603a.keySet()) {
            if (TplIdentity.matchSpec(tplIdentity, tplIdentity2)) {
                arrayList.add(tplIdentity2);
            }
        }
        return arrayList;
    }

    public static boolean drmEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c604402d", new Object[0])).booleanValue();
        }
        return DynConstants.drmEnabled();
    }

    public static synchronized void garbageRemoval(int i) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0618fc5", new Object[]{new Integer(i)});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "garbageRemoval", "bizCtxId=".concat(String.valueOf(i)));
            for (TplIdentity tplIdentity : b(TplIdentity.generateSpec(null, Integer.valueOf(i), null))) {
                f3603a.remove(tplIdentity);
            }
            for (TplIdentity tplIdentity2 : f3603a.keySet()) {
                ConcurrentHashMap<TplIdentity, WeakReference<FBDocument>> concurrentHashMap = f3603a;
                if (((FBDocument) UtilsMig.deref(concurrentHashMap.get(tplIdentity2))) == null) {
                    concurrentHashMap.remove(tplIdentity2);
                }
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "garbageRemoval", "curr=" + f3603a);
        }
    }

    public static synchronized void unregisterTpl(TplIdentity tplIdentity) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4cb9d74", new Object[]{tplIdentity});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "id=".concat(String.valueOf(tplIdentity)));
            ConcurrentHashMap<TplIdentity, WeakReference<FBDocument>> concurrentHashMap = f3603a;
            concurrentHashMap.remove(tplIdentity);
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "curr=" + concurrentHashMap);
        }
    }

    public static List<Pair<TplIdentity, FBDocument>> findAllTpl(TplIdentity tplIdentity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6c81e7", new Object[]{tplIdentity});
        }
        LogUtil.record(1, "NativeTplRuntimeManager", TplMsg.CALL_N_FIND_ALL_TPL, "spec=" + tplIdentity + ", curr=" + f3603a);
        ArrayList arrayList = new ArrayList();
        List<TplIdentity> b = b(tplIdentity);
        if (b.isEmpty()) {
            return arrayList;
        }
        for (TplIdentity tplIdentity2 : b) {
            FBDocument fBDocument = (FBDocument) UtilsMig.deref(f3603a.get(tplIdentity2));
            if (fBDocument != null) {
                arrayList.add(new Pair(tplIdentity2, fBDocument));
            }
        }
        LogUtil.record(1, "NativeTplRuntimeManager", TplMsg.CALL_N_FIND_ALL_TPL, "found=".concat(String.valueOf(arrayList)));
        return arrayList;
    }

    public static Pair<TplIdentity, FBDocument> findOneTpl(TplIdentity tplIdentity) {
        FBDocument fBDocument;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a008eeaf", new Object[]{tplIdentity});
        }
        StringBuilder sb = new StringBuilder("spec=");
        sb.append(tplIdentity);
        sb.append(", curr=");
        ConcurrentHashMap<TplIdentity, WeakReference<FBDocument>> concurrentHashMap = f3603a;
        sb.append(concurrentHashMap);
        LogUtil.record(1, "NativeTplRuntimeManager", "findOneTpl", sb.toString());
        TplIdentity a2 = a(tplIdentity);
        if (a2 == null || (fBDocument = (FBDocument) UtilsMig.deref(concurrentHashMap.get(a2))) == null) {
            return null;
        }
        LogUtil.record(1, "NativeTplRuntimeManager", "findOneTpl", "found=" + a2 + "," + fBDocument);
        return new Pair<>(a2, fBDocument);
    }

    public static synchronized void registerTpl(TplIdentity tplIdentity, WeakReference<FBDocument> weakReference) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("703e1923", new Object[]{tplIdentity, weakReference});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "registerTpl", "id=" + tplIdentity + " ref=" + weakReference);
            if (tplIdentity != null) {
                FBDocument fBDocument = (FBDocument) UtilsMig.deref(weakReference);
                if (fBDocument != null) {
                    unregisterTpl(fBDocument);
                }
                ConcurrentHashMap<TplIdentity, WeakReference<FBDocument>> concurrentHashMap = f3603a;
                concurrentHashMap.put(tplIdentity, weakReference);
                LogUtil.record(1, "NativeTplRuntimeManager", "registerTpl", "curr=" + concurrentHashMap);
            }
        }
    }

    public static synchronized void unregisterTpl(FBDocument fBDocument) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f322242", new Object[]{fBDocument});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "doc=".concat(String.valueOf(fBDocument)));
            for (TplIdentity tplIdentity : f3603a.keySet()) {
                ConcurrentHashMap<TplIdentity, WeakReference<FBDocument>> concurrentHashMap = f3603a;
                if (((FBDocument) UtilsMig.deref(concurrentHashMap.get(tplIdentity))) == fBDocument) {
                    concurrentHashMap.remove(tplIdentity);
                }
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "curr=" + f3603a);
        }
    }
}
