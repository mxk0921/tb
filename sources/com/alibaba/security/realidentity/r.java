package com.alibaba.security.realidentity;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.algo.jni.CommonUtilJni;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r extends t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "r";

    /* renamed from: a  reason: collision with root package name */
    public final CommonUtilJni f2787a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final r f2788a = new r();

        public static /* synthetic */ r a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r) ipChange.ipc$dispatch("8e56e74c", new Object[0]);
            }
            return f2788a;
        }
    }

    public static r a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("8e56e74c", new Object[0]) : b.a();
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/r");
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (b()) {
            this.f2787a.initToken(str);
        }
    }

    public byte[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("792658a9", new Object[]{this, str});
        }
        if (!b() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f2787a.makeStrResult(str);
    }

    public r() {
        this.f2787a = new CommonUtilJni();
    }

    public byte[] a(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("46b9287a", new Object[]{this, bArr, str, str2}) : this.f2787a.makeResult(bArr, str, str2);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : m2.a().b();
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        if (str == null) {
            str = "";
        }
        if (b()) {
            this.f2787a.bh(i, str);
        }
    }

    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        if (!b()) {
            return null;
        }
        return this.f2787a.genKeyToken(str);
    }

    public byte[] a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c189af1", new Object[]{this, new Boolean(z)});
        }
        if (!b()) {
            return null;
        }
        return this.f2787a.dumpBh(z);
    }

    public String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{this, bArr});
        }
        if (!b()) {
            return null;
        }
        return this.f2787a.dp(bArr, bArr.length);
    }

    public byte[] a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d5108ff3", new Object[]{this, context, str});
        }
        if (b()) {
            return this.f2787a.genVersionTag(str, g2.f2719a, g2.b);
        }
        return null;
    }
}
