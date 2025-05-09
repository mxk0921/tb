package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSDownloaderNetworkType;
import com.taobao.kmp.kernel.serviceinterface.KSDownloaderRequestType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20341a;
    public final KSDownloaderRequestType b = KSDownloaderRequestType.GET;
    public final KSDownloaderNetworkType c = KSDownloaderNetworkType.ANY;

    static {
        t2o.a(1002438862);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c297ea94", new Object[]{this});
        }
        return null;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return null;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
        }
        return null;
    }

    public final KSDownloaderRequestType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSDownloaderRequestType) ipChange.ipc$dispatch("c8726488", new Object[]{this});
        }
        return this.b;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f9a2a64", new Object[]{this})).intValue();
        }
        return 1000;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f20341a;
    }

    public final KSDownloaderNetworkType g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSDownloaderNetworkType) ipChange.ipc$dispatch("c4b8a0ee", new Object[]{this});
        }
        return this.c;
    }

    public final Long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("ba4453d7", new Object[]{this});
        }
        return null;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.f20341a = str;
        }
    }
}
