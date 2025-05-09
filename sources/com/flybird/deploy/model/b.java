package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CustomInfoMap f5002a;
    public Object b;

    /* compiled from: Taobao */
    /* renamed from: com.flybird.deploy.model.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class C0247b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f5003a = new b();

        public C0247b a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0247b) ipChange.ipc$dispatch("407d3f2b", new Object[]{this, str, str2});
            }
            this.f5003a.f5002a.putPreDefEntry(str, str2);
            return this;
        }

        public b b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a9a09bca", new Object[]{this});
            }
            return this.f5003a;
        }

        public C0247b c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0247b) ipChange.ipc$dispatch("5e10bfdf", new Object[]{this, obj});
            }
            this.f5003a.b = obj;
            return this;
        }
    }

    public CustomInfoMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomInfoMap) ipChange.ipc$dispatch("a4ec1749", new Object[]{this});
        }
        return this.f5002a;
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a7e544f9", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBEnhancedUpdateOptions{customInfo=" + this.f5002a + '}';
    }

    public b() {
        this.f5002a = CustomInfoMap.a();
    }
}
