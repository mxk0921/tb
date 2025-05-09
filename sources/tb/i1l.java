package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.observe.OpenArchObservableStateCompareResult;
import kotlin.Metadata;
import tb.i3d;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltb/i1l;", "Ltb/i3d;", "", "value", "<init>", "(Ljava/lang/Boolean;)V", "", "value1", "value2", TplMsg.VALUE_T_NATIVE_RETURN, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i1l implements i3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f21042a;
    private final String b = "Undetermined";

    static {
        t2o.a(1004536535);
        t2o.a(1004536533);
    }

    public i1l(Boolean bool) {
        this.f21042a = bool;
    }

    @Override // tb.i3d
    public OpenArchObservableStateCompareResult a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchObservableStateCompareResult) ipChange.ipc$dispatch("23e6173b", new Object[]{this, obj, obj2});
        }
        return i3d.a.a(this, obj, obj2);
    }

    @Override // tb.i3d
    public boolean b(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d50d7dd0", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Boolean;
        }
        if (!z) {
            return false;
        }
        if (obj2 == null) {
            z2 = true;
        } else {
            z2 = obj2 instanceof Boolean;
        }
        if (z2 && obj != null && obj2 != null && ckf.b(obj, obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public Boolean getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1aa10bbf", new Object[]{this});
        }
        return this.f21042a;
    }

    @Override // tb.i3d
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }
}
