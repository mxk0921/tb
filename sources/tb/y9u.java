package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31928a = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final y9u f31929a = new y9u();

        static {
            t2o.a(790626494);
        }

        public static /* synthetic */ y9u a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y9u) ipChange.ipc$dispatch("8f3b5fbc", new Object[0]);
            }
            return f31929a;
        }
    }

    static {
        t2o.a(790626493);
    }

    public static y9u f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y9u) ipChange.ipc$dispatch("bb4b25f7", new Object[0]);
        }
        return a.a();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce749dd", new Object[]{this})).booleanValue();
        }
        return a9l.w().c();
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df725b59", new Object[]{this, str})).booleanValue();
        }
        return a9l.w().d(str);
    }

    public boolean c(String str, BaseConfigItem baseConfigItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b234189", new Object[]{this, str, baseConfigItem, new Boolean(z)})).booleanValue();
        }
        return a9l.w().q(str, baseConfigItem, z);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9b56f", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f31928a)) {
            this.f31928a = UTDevice.getUtdid(PopLayer.getReference().getApp());
        }
        return this.f31928a;
    }

    public boolean e(String str, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95fb8191", new Object[]{this, str, baseConfigItem})).booleanValue();
        }
        return a9l.w().r(str, baseConfigItem);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
        } else {
            a9l.w().h0();
        }
    }
}
