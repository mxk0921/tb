package com.taobao.wireless.security.sdk.initialize;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.initialize.IInitializeComponent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a implements IInitializeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<C0823a> f14178a = new HashSet();
    private Object b = new Object();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.wireless.security.sdk.initialize.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0823a implements IInitializeComponent.IInitFinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IInitializeComponent.IInitFinishListener f14179a;

        static {
            t2o.a(659554448);
            t2o.a(659554364);
        }

        public C0823a(a aVar, IInitializeComponent.IInitFinishListener iInitFinishListener) {
            this.f14179a = iInitFinishListener;
        }

        @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent.IInitFinishListener
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                this.f14179a.onError();
            }
        }

        @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent.IInitFinishListener
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                this.f14179a.onSuccess();
            }
        }
    }

    static {
        t2o.a(659554447);
        t2o.a(659554445);
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public synchronized void initializeAsync(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6a1fd5", new Object[]{this, context});
        } else {
            SecurityGuardManager.getInitializer().initializeAsync(context);
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public synchronized void loadLibraryAsync(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201a83fa", new Object[]{this, context});
        } else {
            SecurityGuardManager.getInitializer().initializeAsync(context);
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public synchronized int loadLibrarySync(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3364d5e4", new Object[]{this, context})).intValue();
        }
        try {
            return SecurityGuardManager.getInitializer().loadLibrarySync(context);
        } catch (SecException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public void registerInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270b39d7", new Object[]{this, iInitFinishListener});
        } else if (iInitFinishListener != null) {
            C0823a aVar = new C0823a(this, iInitFinishListener);
            synchronized (this.b) {
                this.f14178a.add(aVar);
            }
            try {
                SecurityGuardManager.getInitializer().registerInitFinishListener(aVar);
            } catch (SecException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public void unregisterInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        C0823a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816715f0", new Object[]{this, iInitFinishListener});
        } else if (iInitFinishListener != null) {
            synchronized (this.b) {
                try {
                    Iterator<C0823a> it = this.f14178a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aVar = null;
                            break;
                        }
                        aVar = it.next();
                        if (aVar.f14179a == iInitFinishListener) {
                            break;
                        }
                    }
                    if (aVar != null) {
                        this.f14178a.remove(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (aVar != null) {
                try {
                    SecurityGuardManager.getInitializer().unregisterInitFinishListener(aVar);
                } catch (SecException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public int initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1dcfb84", new Object[]{this, context})).intValue();
        }
        try {
            return SecurityGuardManager.getInitializer().initialize(context);
        } catch (SecException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public boolean isSoValid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e723466f", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public void loadLibraryAsync(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c86344", new Object[]{this, context, str});
            return;
        }
        try {
            SecurityGuardManager.getInitializer().loadLibraryAsync(context, str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public int loadLibrarySync(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85e4c56e", new Object[]{this, context, str})).intValue();
        }
        try {
            return SecurityGuardManager.getInitializer().loadLibrarySync(context, str);
        } catch (SecException e) {
            e.printStackTrace();
            return 1;
        }
    }
}
