package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PrivacyAuthGetParam implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<a> authListParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f3383a;
        public final String[] b;

        public a(String str, String[] strArr) {
            this.f3383a = str;
            this.b = strArr;
        }

        public String[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("ecbd9164", new Object[]{this});
            }
            return this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this});
            }
            return this.f3383a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AuthData{sceneCode='" + this.f3383a + "', permissions=" + Arrays.toString(this.b) + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<a> f3384a = new ArrayList();

        public static /* synthetic */ List a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e7479486", new Object[]{bVar});
            }
            return bVar.f3384a;
        }

        public b b(String str, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2e2894b2", new Object[]{this, str, strArr});
            }
            ((ArrayList) this.f3384a).add(new a(str, strArr));
            return this;
        }

        public PrivacyAuthGetParam c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PrivacyAuthGetParam) ipChange.ipc$dispatch("4ad183d4", new Object[]{this});
            }
            return new PrivacyAuthGetParam(this);
        }
    }

    private PrivacyAuthGetParam() {
        this(new b());
    }

    public List<a> getAuthListParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("738d6f1e", new Object[]{this});
        }
        return this.authListParams;
    }

    public PrivacyAuthGetParam(b bVar) {
        this.authListParams = b.a(bVar);
    }
}
