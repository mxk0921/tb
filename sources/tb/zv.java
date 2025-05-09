package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class zv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f33034a;

        static {
            t2o.a(83886116);
        }

        public byte[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("5fca5f1a", new Object[]{this});
            }
            return this.f33034a;
        }

        public a b(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("88b9f428", new Object[]{this, bArr});
            }
            this.f33034a = bArr;
            return this;
        }
    }

    static {
        t2o.a(83886115);
        t2o.a(83886124);
    }

    public abstract void a(JSONObject jSONObject, a aVar, smc smcVar);
}
