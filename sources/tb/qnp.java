package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qnp extends azg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355759);
    }

    public static /* synthetic */ Object ipc$super(qnp qnpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/opencontext/Shop2FLiveConfig");
    }

    @Override // tb.azg
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e23a9f", new Object[]{this});
        }
        return "ShopLoftActivity";
    }

    @Override // tb.azg
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca9f8259", new Object[]{this});
        }
        return "shop2fLive";
    }

    @Override // tb.azg
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e981077", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.azg
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3be4880", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.azg
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac577c55", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
