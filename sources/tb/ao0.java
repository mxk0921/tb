package tb;

import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ao0<INPUT extends UMFBaseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final INPUT f15891a;
    public final String b;
    public final a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a<OUTPUT extends Serializable> {
        void onComplete();

        void onData(OUTPUT output);

        void onError(String str, String str2, mi miVar);
    }

    static {
        t2o.a(301990090);
    }

    public ao0(String str, INPUT input, a aVar) {
        this.f15891a = input;
        this.b = str;
        this.c = aVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.b;
    }

    public INPUT b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INPUT) ((UMFBaseIO) ipChange.ipc$dispatch("77869163", new Object[]{this}));
        }
        return this.f15891a;
    }

    public List<IAURAInputField> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4b471bd3", new Object[]{this});
        }
        return null;
    }

    public a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c65c811a", new Object[]{this});
        }
        return this.c;
    }
}
