package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z60 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACCIDENT_SLIDE_X_FACTOR = "accidentSlideXFactor";
    public static final String KEY_ENABLE_ACCIDENT_SLIDE = "enableAccidentSlide";

    /* renamed from: a  reason: collision with root package name */
    public final int f32561a;
    public boolean b;
    public float c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final z60 f32562a = new z60();

        static {
            t2o.a(729810091);
        }

        public static /* synthetic */ z60 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z60) ipChange.ipc$dispatch("74b84154", new Object[0]);
            }
            return f32562a;
        }
    }

    static {
        t2o.a(729810089);
    }

    public static z60 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z60) ipChange.ipc$dispatch("bc97293a", new Object[0]);
        }
        return b.a();
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2543b012", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89d9433c", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b9375cf3", new Object[]{this});
        }
        JSONObject d = e0p.d();
        if (d == null) {
            return null;
        }
        return d.getJSONObject("ext");
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec33ca0", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d427dc94", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            uqa.b("AccidentSlide", "parseConfig", "config is null");
        } else {
            uqa.b("AccidentSlide", "parseConfig", jSONObject.toString());
            if (jSONObject.containsKey(KEY_ENABLE_ACCIDENT_SLIDE)) {
                try {
                    this.b = jSONObject.getBooleanValue(KEY_ENABLE_ACCIDENT_SLIDE);
                } catch (Throwable th) {
                    uqa.b("AccidentSlide", "parseConfig", "isEnable error : " + th.getMessage());
                }
            }
            if (jSONObject.containsKey(KEY_ACCIDENT_SLIDE_X_FACTOR)) {
                try {
                    this.c = jSONObject.getFloatValue(KEY_ACCIDENT_SLIDE_X_FACTOR);
                } catch (Throwable th2) {
                    uqa.b("AccidentSlide", "parseConfig", "accidentSlideXFactor error :" + th2.getMessage());
                }
            }
            if (jSONObject.containsKey("accidentSlideYDistance")) {
                try {
                    this.d = jSONObject.getIntValue("accidentSlideYDistance");
                } catch (Throwable th3) {
                    uqa.b("AccidentSlide", "parseConfig", "accidentSlideYFactor error :" + th3.getMessage());
                }
            }
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e187978", new Object[]{this});
            return;
        }
        this.b = false;
        this.c = this.f32561a;
        this.d = DensityUtil.dip2px(Globals.getApplication(), 0.0f);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
            return;
        }
        g();
        f(d());
    }

    public z60() {
        this.f32561a = 3;
        this.b = false;
        this.c = 3;
        this.d = DensityUtil.dip2px(Globals.getApplication(), 0.0f);
    }
}
