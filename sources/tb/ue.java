package tb;

import com.alibaba.ability.MegaUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f29318a = 1.0f;

    static {
        t2o.a(98566146);
    }

    public final void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5cda31", new Object[]{this, sVar});
            return;
        }
        ckf.g(sVar, "instance");
        sVar.B(2000, this.f29318a);
    }

    public final void c(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce5f0b5", new Object[]{this, map});
            return;
        }
        Float k = MegaUtils.k(map, "rate", null);
        if (k != null) {
            float floatValue = k.floatValue();
            if (floatValue < 0.5f || floatValue > 2.0f) {
                throw new RuntimeException("rate value invalid:" + floatValue);
            }
            this.f29318a = floatValue;
        }
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
        }
        return new JSONObject(a.k(jpu.a("rate", Float.valueOf(this.f29318a))));
    }
}
