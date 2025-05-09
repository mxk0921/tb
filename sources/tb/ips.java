package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ips extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21499a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21500a;

        public a(String str) {
            this.f21500a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.tao.navigation.a.i0("cart", NavigationTabMsgMode.DEFAULT, this.f21500a);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.tao.navigation.a.i0("cart", NavigationTabMsgMode.DEFAULT, "0");
            }
        }
    }

    static {
        t2o.a(478150969);
    }

    public static /* synthetic */ Object ipc$super(ips ipsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/TabBadgeNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        String string = jSONObject.getString("type");
        String str4 = "";
        if (string == null) {
            string = str4;
        }
        int hashCode = string.hashCode();
        if (hashCode != 2402104) {
            if (hashCode == 64313583 && string.equals("COUNT")) {
                String string2 = jSONObject.getString("count");
                if (string2 != null) {
                    str4 = string2;
                }
                this.f21499a.post(new a(str4));
                return true;
            }
        } else if (string.equals("NONE")) {
            this.f21499a.post(b.INSTANCE);
            return true;
        }
        return false;
    }
}
