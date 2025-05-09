package com.taobao.umipublish.ayscpublish;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.ServiceImpl;
import com.taobao.umipublish.util.RemoteEnvUtil;
import tb.kdp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13976a;

    /* compiled from: Taobao */
    @ServiceImpl("com.taobao.umipublish.ayscpublish.UmiPublishTaskManagerRemote")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void restoreAsyncPublishFromTask();
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.umipublish.ayscpublish.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0793b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final b f13977a = new b();

        static {
            t2o.a(944766981);
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7c8f3a44", new Object[0]);
            }
            return f13977a;
        }
    }

    static {
        t2o.a(944766979);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2e1bfedf", new Object[0]);
        }
        return C0793b.a();
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a37c97", new Object[]{this});
            return;
        }
        if (RemoteEnvUtil.c("guangguang", false)) {
            ((a) kdp.a(a.class, new Object[0])).restoreAsyncPublishFromTask();
        }
    }
}
