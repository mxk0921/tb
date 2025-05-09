package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.CardModel;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class l18 extends CardModel {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23050a;
    public final mjn b = ua7.INSTANCE.a();
    public String c;
    public JSONObject d;

    static {
        t2o.a(918552665);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(l18.class, "dxVersion", "getDxVersion()J", 0);
        dun.f(mutablePropertyReference1Impl);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl};
    }

    public l18() {
        setRenderMode("dx");
    }

    public static /* synthetic */ Object ipc$super(l18 l18Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/model/DxCardModel");
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8f062fb", new Object[]{this});
        }
        return this.d;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec979de4", new Object[]{this});
        }
        String str = this.f23050a;
        if (str != null) {
            return str;
        }
        ckf.y("dxName");
        throw null;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d073594", new Object[]{this});
        }
        String str = this.c;
        if (str != null) {
            return str;
        }
        ckf.y("dxUrl");
        throw null;
    }

    public final long d() {
        Object b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            b = ipChange.ipc$dispatch("103de869", new Object[]{this});
        } else {
            b = ((a8k) this.b).b(this, $$delegatedProperties[0]);
        }
        return ((Number) b).longValue();
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ce21e9", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46060c12", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f23050a = str;
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b812ca", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.c = str;
    }

    public final void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7604fb", new Object[]{this, new Long(j)});
        } else {
            ((a8k) this.b).a(this, $$delegatedProperties[0], Long.valueOf(j));
        }
    }
}
