package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.model.InferContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.za  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1204za {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, InferContext> f2638a;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.security.ccrc.service.build.za$a */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final C1204za f2639a = new C1204za();

        public static /* synthetic */ C1204za a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1204za) ipChange.ipc$dispatch("e36fdb4b", new Object[0]);
            }
            return f2639a;
        }
    }

    public static C1204za a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C1204za) ipChange.ipc$dispatch("e36fdb4b", new Object[0]) : a.f2639a;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f2638a.remove(str);
        }
    }

    public C1204za() {
        this.f2638a = new HashMap<>();
    }

    public void a(InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d8239e", new Object[]{this, inferContext});
        } else {
            this.f2638a.put(inferContext.eventId, inferContext);
        }
    }

    public InferContext a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InferContext) ipChange.ipc$dispatch("35391628", new Object[]{this, str}) : this.f2638a.get(str);
    }
}
