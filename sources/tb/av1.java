package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class av1 extends q22 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FUNCTION_BTN_HIDE = "hide";
    public static final String FUNCTION_BTN_SHOW = "show";
    public static final String FUNCTION_CLOSE = "close";
    public static final String FUNCTION_OPEN = "open";

    /* renamed from: a  reason: collision with root package name */
    public final String f16021a;
    public final String b;

    static {
        t2o.a(481296662);
    }

    public av1(String str, String str2) {
        this.f16021a = str;
        this.b = str2;
    }

    public static /* synthetic */ Object ipc$super(av1 av1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/msg/BaseFunctionOperateMsg");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d058e7d6", new Object[]{this});
        }
        return this.f16021a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4a8c6f6", new Object[]{this});
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fddd0302", new Object[]{this})).booleanValue();
        }
        return "show".equals(this.f16021a);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa86b317", new Object[]{this})).booleanValue();
        }
        return "open".equals(this.b);
    }
}
