package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CustomInfoMap f5000a;
    public Object b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f5001a = new a();

        public b a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b196cfcb", new Object[]{this, str, str2});
            }
            this.f5001a.f5000a.putPreDefEntry(str, str2);
            return this;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cdebe41a", new Object[]{this});
            }
            return this.f5001a;
        }

        public b c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5ff66897", new Object[]{this, obj});
            }
            this.f5001a.b = obj;
            return this;
        }
    }

    public CustomInfoMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomInfoMap) ipChange.ipc$dispatch("a4ec1749", new Object[]{this});
        }
        return this.f5000a;
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
        return "FBDelayedUpdateOptions{customInfo=" + this.f5000a + '}';
    }

    public a() {
        this.f5000a = CustomInfoMap.a();
    }
}
