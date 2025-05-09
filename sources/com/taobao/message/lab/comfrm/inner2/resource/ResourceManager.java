package com.taobao.message.lab.comfrm.inner2.resource;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.a07;
import tb.c04;
import tb.ckf;
import tb.dun;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceManager;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceManager;", "<init>", "()V", "", "filePartyName", "", "providerPriority", "Ltb/xhv;", "cacheFileName", "(Ljava/lang/String;I)V", "Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceChangeSchema;", "data", "considerNotifyResourceChanged", "(Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceChangeSchema;)V", "filePartName", "fetchResource", "(Ljava/lang/String;)Ljava/lang/String;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "isResourceChanged", "()Z", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "resourceProvider", "addResourceProvider", "(Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;)V", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;", "observer", "subscribeResourceChange", "(Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "resourceFileNameMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "resourceProviderList", "Ljava/util/List;", "resourceChanged", "Z", "resourceChangeObserver", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;", "Ljava/util/Comparator;", "comparator", "Ljava/util/Comparator;", "Companion", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ResourceManager implements IResourceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private static final List<Class<? extends IResourceProvider>> injectedResourceProviderList = new ArrayList();
    private volatile IResourceChangeObserver resourceChangeObserver;
    private volatile boolean resourceChanged;
    private final ConcurrentHashMap<String, Integer> resourceFileNameMap = new ConcurrentHashMap<>();
    private final List<IResourceProvider> resourceProviderList = new ArrayList();
    private final Comparator<IResourceProvider> comparator = ResourceManager$comparator$1.INSTANCE;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/ResourceManager$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "resourceProvider", "Ltb/xhv;", "injectResourceProvider", "(Ljava/lang/Class;)V", "", "injectedResourceProviderList", "Ljava/util/List;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(537919738);
        }

        private Companion() {
        }

        public final void injectResourceProvider(Class<? extends IResourceProvider> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db8d27c6", new Object[]{this, cls});
                return;
            }
            ckf.g(cls, "resourceProvider");
            synchronized (dun.b(ResourceManager.class)) {
                ResourceManager.access$getInjectedResourceProviderList$cp().add(cls);
            }
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(537919736);
        t2o.a(537919729);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceManager() {
        synchronized (dun.b(ResourceManager.class)) {
            try {
                Iterator<T> it = injectedResourceProviderList.iterator();
                while (it.hasNext()) {
                    this.resourceProviderList.add(((Class) it.next()).newInstance());
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.resourceProviderList.add(new PatchResourceProvider());
        this.resourceProviderList.add(new ReleaseResourceProvider());
        c04.u(this.resourceProviderList, this.comparator);
        for (IResourceProvider iResourceProvider : this.resourceProviderList) {
            iResourceProvider.subscribeResourceChange(new IResourceChangeObserver() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourceManager$$special$$inlined$forEach$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver
                public void notifyResourceChanged(ResourceChangeSchema resourceChangeSchema) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c82e0b94", new Object[]{this, resourceChangeSchema});
                        return;
                    }
                    ckf.g(resourceChangeSchema, "data");
                    ResourceManager.access$considerNotifyResourceChanged(ResourceManager.this, resourceChangeSchema);
                }
            });
        }
    }

    public static final /* synthetic */ void access$considerNotifyResourceChanged(ResourceManager resourceManager, ResourceChangeSchema resourceChangeSchema) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2883afe7", new Object[]{resourceManager, resourceChangeSchema});
        } else {
            resourceManager.considerNotifyResourceChanged(resourceChangeSchema);
        }
    }

    public static final /* synthetic */ List access$getInjectedResourceProviderList$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9dc09212", new Object[0]);
        }
        return injectedResourceProviderList;
    }

    private final void cacheFileName(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf5a0a9", new Object[]{this, str, new Integer(i)});
            return;
        }
        String name = new File(str).getName();
        if (name != null) {
            if (name.length() <= 0) {
                name = null;
            }
            if (name != null) {
                this.resourceFileNameMap.put(name, Integer.valueOf(i));
            }
        }
    }

    private final synchronized void considerNotifyResourceChanged(ResourceChangeSchema resourceChangeSchema) {
        Integer num;
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e18ffc5b", new Object[]{this, resourceChangeSchema});
                return;
            }
            int mode = resourceChangeSchema.getMode();
            if (mode == 0) {
                this.resourceChanged = true;
                IResourceChangeObserver iResourceChangeObserver = this.resourceChangeObserver;
                if (iResourceChangeObserver != null) {
                    iResourceChangeObserver.notifyResourceChanged(resourceChangeSchema);
                }
            } else if (mode == 1) {
                int providerPriority = resourceChangeSchema.getProviderPriority();
                List<String> changedFileNameList = resourceChangeSchema.getChangedFileNameList();
                if (changedFileNameList != null) {
                    for (String str : changedFileNameList) {
                        ConcurrentHashMap<String, Integer> concurrentHashMap = this.resourceFileNameMap;
                        Integer num2 = null;
                        if (!concurrentHashMap.containsKey(str)) {
                            concurrentHashMap = null;
                        }
                        if (!(concurrentHashMap == null || (num = concurrentHashMap.get(str)) == null)) {
                            if (ckf.i(providerPriority, num.intValue()) >= 0) {
                                num2 = num;
                            }
                            if (num2 != null) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    this.resourceChanged = true;
                    IResourceChangeObserver iResourceChangeObserver2 = this.resourceChangeObserver;
                    if (iResourceChangeObserver2 != null) {
                        iResourceChangeObserver2.notifyResourceChanged(resourceChangeSchema);
                    }
                }
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceManager
    public void addResourceProvider(IResourceProvider iResourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0c9072", new Object[]{this, iResourceProvider});
            return;
        }
        ckf.g(iResourceProvider, "resourceProvider");
        synchronized (this) {
            this.resourceProviderList.add(iResourceProvider);
            c04.u(this.resourceProviderList, this.comparator);
            xhv xhvVar = xhv.INSTANCE;
        }
        iResourceProvider.subscribeResourceChange(new IResourceChangeObserver() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourceManager$addResourceProvider$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver
            public void notifyResourceChanged(ResourceChangeSchema resourceChangeSchema) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c82e0b94", new Object[]{this, resourceChangeSchema});
                    return;
                }
                ckf.g(resourceChangeSchema, "data");
                ResourceManager.access$considerNotifyResourceChanged(ResourceManager.this, resourceChangeSchema);
            }
        });
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                for (IResourceProvider iResourceProvider : this.resourceProviderList) {
                    iResourceProvider.dispose();
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.resourceChanged = false;
        this.resourceChangeObserver = null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceManager
    public synchronized String fetchResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f10447", new Object[]{this, str});
        }
        ckf.g(str, "filePartName");
        TraceUtil.beginSection("LOAD:".concat(str));
        Iterator<T> it = this.resourceProviderList.iterator();
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                IResourceProvider iResourceProvider = (IResourceProvider) it.next();
                String fetchResource = iResourceProvider.fetchResource(str);
                if (fetchResource != null) {
                    if (fetchResource.length() > 0) {
                        str2 = fetchResource;
                    }
                    if (str2 != null) {
                        cacheFileName(str, iResourceProvider.getPriority());
                        TraceUtil.endTrace();
                        return str2;
                    }
                }
            } else {
                TraceUtil.endTrace();
                return null;
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceManager
    public boolean isResourceChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ddea2c7", new Object[]{this})).booleanValue();
        }
        return this.resourceChanged;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, iResourceChangeObserver});
            return;
        }
        ckf.g(iResourceChangeObserver, "observer");
        this.resourceChangeObserver = iResourceChangeObserver;
    }
}
