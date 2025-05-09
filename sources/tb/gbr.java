package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.WindowType;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gbr implements IDeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f19874a = TBDeviceUtils.p(o.J());
    public static final boolean b = TBDeviceUtils.P(o.J());

    static {
        t2o.a(502267938);
        t2o.a(503316582);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        chb g = c21.g();
        if (g != null) {
            return g.getInt("deviceLevel", -1);
        }
        return -1;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        if (a() == 2) {
            return true;
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93870fca", new Object[]{this})).booleanValue();
        }
        return b;
    }

    public final int d(WindowType windowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15e02381", new Object[]{this, windowType})).intValue();
        }
        if (windowType == WindowType.MIN) {
            return 0;
        }
        if (windowType == WindowType.SMALL) {
            return 1;
        }
        if (windowType == WindowType.MEDIUM) {
            return 2;
        }
        if (windowType == WindowType.LARGE) {
            return 3;
        }
        return 4;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        return UTDevice.getUtdid(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("800f189c", new Object[]{this})).booleanValue();
        }
        return true ^ TBAutoSizeConfig.x().T(o.J());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13b6b708", new Object[]{this})).booleanValue();
        }
        if (l() || c()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public Rect j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c964b9c0", new Object[]{this, activity});
        }
        return rhx.a(activity);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("416987e0", new Object[]{this})).intValue();
        }
        return a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e76299e6", new Object[]{this})).booleanValue();
        }
        return f19874a;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public JSONObject m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3afe8667", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceLevel", (Object) Integer.valueOf(a()));
        return jSONObject;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public boolean n(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84f3e29a", new Object[]{this, activity})).booleanValue();
        }
        return olq.d(activity);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public int o(Activity activity) {
        WindowType windowType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33f0217e", new Object[]{this, activity})).intValue();
        }
        if (i()) {
            windowType = TBAutoSizeConfig.x().M(activity);
        } else {
            windowType = WindowType.MIN;
        }
        return d(windowType);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo
    public float p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("528b0c17", new Object[]{this, context})).floatValue();
        }
        if (context instanceof Activity) {
            return TBAutoSizeConfig.x().A((Activity) context);
        }
        Activity a2 = od0.D().f().a();
        if (a2 instanceof Activity) {
            return TBAutoSizeConfig.x().A(a2);
        }
        return 1.0f;
    }
}
