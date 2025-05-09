package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class na8 implements c2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ucd f24606a;

    static {
        t2o.a(447741983);
    }

    public na8(ucd ucdVar) {
        this.f24606a = ucdVar;
    }

    @Override // tb.c2c
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce1a2d79", new Object[]{this});
        }
        return this.f24606a.a();
    }

    @Override // tb.c2c
    public int b(ha8 ha8Var, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50e8a7f6", new Object[]{this, ha8Var, map})).intValue();
        }
        return this.f24606a.b(map);
    }

    @Override // tb.c2c
    public int priority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8c08c1e", new Object[]{this})).intValue();
        }
        return this.f24606a.priority();
    }

    @Override // tb.c2c
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        String type = this.f24606a.type();
        if (c(type)) {
            return "business_preload";
        }
        return type;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df832cf9", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(z1x.PRE_RENDER, str) || TextUtils.equals(z1x.PRE_REQUEST, str) || TextUtils.equals("preLoadChunk", str);
    }
}
