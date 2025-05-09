package com.taobao.themis.inside;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.uniapp.solution.page.TMSUniAppPageSolution;
import com.taobao.themis.web.solution.TMSLegacyWebSolution;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.abs;
import tb.cds;
import tb.h8s;
import tb.t2o;
import tb.vcs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Context mContext;
    private static volatile b mDefaultInitLister;
    private static volatile boolean isInitializing = false;
    private static volatile boolean isInitialized = false;
    private static volatile List<b> mInitListeners = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.inside.TMSSDK.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe4ff082", new Object[]{this});
            } else {
                vcs.a();
            }
        }

        @Override // com.taobao.themis.inside.TMSSDK.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310b018a", new Object[]{this});
            } else {
                vcs.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        t2o.a(837812245);
    }

    private static void InitListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74eae3f6", new Object[0]);
            return;
        }
        if (mInitListeners != null) {
            for (b bVar : mInitListeners) {
                if (bVar != null) {
                    bVar.b();
                }
            }
        }
        isInitializing = false;
        isInitialized = true;
        if (mInitListeners != null) {
            for (b bVar2 : mInitListeners) {
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
        }
    }

    public static synchronized Context getContext() {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
            }
            return mContext;
        }
    }

    public static synchronized void init(Context context) {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
                return;
            }
            if (!isInitialized && !isInitializing) {
                isInitializing = true;
                mContext = context;
                initContainerNecessary(context);
            }
        }
    }

    private static synchronized void initContainerNecessary(Context context) {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("325c3ce3", new Object[]{context});
                return;
            }
            initDefaultInitListener();
            h8s.w(context);
            abs.b(context);
            cds.c(TMSSolutionType.WEB_SINGLE_PAGE, TMSLegacyWebSolution.class);
            cds.c(TMSSolutionType.UNIAPP, TMSUniAppPageSolution.class);
            InitListeners();
        }
    }

    private static void initDefaultInitListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f6a99c", new Object[0]);
        } else if (mDefaultInitLister == null) {
            mDefaultInitLister = new a();
            mInitListeners.add(mDefaultInitLister);
        }
    }

    public static synchronized boolean isInitialized() {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
            }
            return isInitialized;
        }
    }

    public static synchronized void init(Context context, b bVar) {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f11ee95", new Object[]{context, bVar});
                return;
            }
            if (!isInitialized && !isInitializing) {
                isInitializing = true;
                mInitListeners.add(bVar);
                initContainerNecessary(context);
            } else if (isInitialized) {
                bVar.b();
                bVar.a();
            } else {
                mInitListeners.add(bVar);
            }
        }
    }
}
