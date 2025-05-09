package tb;

import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.IrpCodeProcessor;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zlf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile zlf b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, IrpCodeProcessor> f32846a = new HashMap<>(5);

    static {
        t2o.a(481296712);
    }

    public static zlf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zlf) ipChange.ipc$dispatch("204f6d7e", new Object[0]);
        }
        if (b == null) {
            synchronized (zlf.class) {
                try {
                    if (b == null) {
                        b = new zlf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public IrpCodeProcessor b(FragmentActivity fragmentActivity, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpCodeProcessor) ipChange.ipc$dispatch("f84329be", new Object[]{this, fragmentActivity, hashMap});
        }
        int hashCode = fragmentActivity.hashCode();
        IrpCodeProcessor irpCodeProcessor = this.f32846a.get(Integer.valueOf(hashCode));
        if (irpCodeProcessor != null) {
            return irpCodeProcessor;
        }
        agh.h("_scancode_IrpCodeProcessCache", "create processor");
        IrpCodeProcessor irpCodeProcessor2 = new IrpCodeProcessor(fragmentActivity, hashMap);
        this.f32846a.put(Integer.valueOf(hashCode), irpCodeProcessor2);
        return irpCodeProcessor2;
    }

    public void c(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f475305e", new Object[]{this, fragmentActivity});
            return;
        }
        agh.h("_scancode_IrpCodeProcessCache", "removeProcessor");
        this.f32846a.remove(Integer.valueOf(fragmentActivity.hashCode()));
    }
}
