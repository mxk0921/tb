package com.taobao.message.lab.comfrm.aura;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ContainerPreLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Container> mContainerKey2Container;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final ContainerPreLoader instance = new ContainerPreLoader();

        static {
            t2o.a(537919517);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ ContainerPreLoader access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContainerPreLoader) ipChange.ipc$dispatch("af7173ba", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(537919515);
    }

    public static /* synthetic */ Map access$200(ContainerPreLoader containerPreLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70571e6e", new Object[]{containerPreLoader});
        }
        return containerPreLoader.mContainerKey2Container;
    }

    public static ContainerPreLoader getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerPreLoader) ipChange.ipc$dispatch("20970294", new Object[0]);
        }
        return SingletonHolder.access$100();
    }

    public Container find(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("740c4a42", new Object[]{this, activity, str});
        }
        if (!ApplicationUtil.isDebug() || VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
            Container remove = this.mContainerKey2Container.remove(str);
            if (remove != null) {
                remove.attachPage(activity);
            }
            return remove;
        }
        throw new RuntimeException("非主线程调用ContainerPreLoader");
    }

    public String preload(Intent intent, String str, String str2, boolean z, Map<String, Object> map, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d596b84e", new Object[]{this, intent, str, str2, new Boolean(z), map, new Boolean(z2), new Boolean(z3)});
        }
        if (!ApplicationUtil.isDebug() || VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
            TraceUtil.beginSection("ContainerPreLoad");
            final Container container = new Container(intent, str, (String) null, str2, map, (String) null);
            container.setUseRemote(z);
            TraceUtil.beginSection("PreLoad-StartLoadStateAndViewObject");
            container.initSource();
            container.sendFirstAction();
            TraceUtil.endTrace();
            final String containerKey = container.getContainerKey();
            this.mContainerKey2Container.put(containerKey, container);
            TraceUtil.endTrace();
            if (z3) {
                container.enableSnapshot();
            }
            if (z2) {
                UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.ContainerPreLoader.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Container container2 = (Container) ContainerPreLoader.access$200(ContainerPreLoader.this).remove(containerKey);
                        Container container3 = container;
                        if (container2 == container3) {
                            container3.dispose();
                        }
                    }
                }, 30000L);
            }
            return containerKey;
        }
        throw new RuntimeException("非主线程调用ContainerPreLoader");
    }

    private ContainerPreLoader() {
        this.mContainerKey2Container = new HashMap();
    }
}
