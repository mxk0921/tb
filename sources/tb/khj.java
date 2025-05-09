package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class khj extends rs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f22670a;
    public String b;
    public String c;
    public int d;

    static {
        t2o.a(482344993);
    }

    public static /* synthetic */ Object ipc$super(khj khjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/model/NNModelConfig");
    }

    public abstract String a();

    public abstract boolean b();

    public abstract String c();

    public abstract String d();

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdc1b687", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f22670a) || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
            return false;
        }
        return true;
    }
}
