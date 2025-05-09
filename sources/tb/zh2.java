package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zh2 implements mjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, lsd> f32768a = new HashMap();
    public int b = 1000;

    static {
        t2o.a(736100384);
        t2o.a(736100385);
    }

    @Override // tb.mjb
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29190544", new Object[]{this, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_Channel", "notifyTerminate: ");
        lsd lsdVar = (lsd) ((HashMap) this.f32768a).get(104);
        if (lsdVar != null) {
            tm1.a("2ARCH_Channel", "notifyTerminate stateNotify ");
            lsdVar.b(i);
        }
        usg.d().b().t();
    }

    @Override // tb.mjb
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fab6572", new Object[]{this, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_Channel", "notifyViewCreate: ");
        lsd lsdVar = (lsd) ((HashMap) this.f32768a).get(101);
        if (lsdVar == null) {
            tm1.a("2ARCH_Channel", "notifyViewCreate stateNotify null ");
        } else {
            lsdVar.c(i);
        }
    }

    @Override // tb.mjb
    public void d(BootImageInfo bootImageInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d6b375", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
            return;
        }
        tm1.a("2ARCH_Channel", "notifyOnStart: " + bootImageInfo);
        lsd lsdVar = (lsd) ((HashMap) this.f32768a).get(100);
        if (lsdVar == null) {
            tm1.a("2ARCH_Channel", "notifyOnStart stateNotify null ");
        } else {
            lsdVar.d(bootImageInfo, i, i2);
        }
    }

    @Override // tb.mjb
    public boolean e(psg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
        }
        return usg.d().b().p(aVar);
    }

    @Override // tb.mjb
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e539127", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_Channel", "notifyAnimationEnd: ");
        usg.d().b().c();
    }

    @Override // tb.mjb
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4073ee", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_Channel", "notifyAnimationStart: ");
        usg.d().b().d();
    }

    @Override // tb.mjb
    public void i(List<qt7> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9930d73", new Object[]{this, list, str});
            return;
        }
        tm1.a("2ARCH_Channel", "notifyDownload: " + str);
        if (list != null && !list.isEmpty()) {
            rh2.h(list, str);
        }
    }

    @Override // tb.mjb
    public void j(int i, lsd lsdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efa6ad8", new Object[]{this, new Integer(i), lsdVar});
        } else {
            ((HashMap) this.f32768a).put(Integer.valueOf(i), lsdVar);
        }
    }

    public final LinkedSplashData k(JSONObject jSONObject, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedSplashData) ipChange.ipc$dispatch("66cf52eb", new Object[]{this, jSONObject, bootImageInfo});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            return null;
        }
        String str = "topview_trace_" + SystemClock.uptimeMillis() + "_" + UTDevice.getUtdid(uy3.a());
        if (!TextUtils.isEmpty(bootImageInfo.itemId)) {
            str = str + "_" + bootImageInfo.itemId;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bootImageInfo);
        BootImageData bootImageData = new BootImageData();
        bootImageData.result = arrayList;
        return new LinkedSplashData(jSONObject2, str, bootImageData);
    }

    @Override // tb.mjb
    public boolean g(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cac902e", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
        }
        if (jSONObject == null) {
            tm1.a("2ARCH_Channel", "shouldShow: subSection null");
            return false;
        }
        JSONObject f = ph2.f(jSONObject);
        if (f == null) {
            tm1.a("2ARCH_Channel", "shouldShow: splash null");
            return false;
        }
        BootImageInfo bootImageInfo = (BootImageInfo) JSON.parseObject(f.toJSONString(), BootImageInfo.class);
        if (bootImageInfo == null) {
            tm1.a("2ARCH_Channel", "shouldShow: splashContentData null");
            return false;
        }
        LinkedSplashData k = k(jSONObject, bootImageInfo);
        if (k == null) {
            return false;
        }
        this.b = i;
        if (i != 1000) {
            return usg.d().b().r(k);
        }
        usg.d().b().n(k);
        return usg.d().b().q();
    }

    @Override // tb.mjb
    public void a(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83eb919", new Object[]{this, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_Channel", "notifyViewShown: ");
        qsg b = usg.d().b();
        if (this.b != 1000) {
            z = false;
        }
        b.s(z);
        lsd lsdVar = (lsd) ((HashMap) this.f32768a).get(102);
        if (lsdVar == null) {
            tm1.a("2ARCH_Channel", "notifyViewShown stateNotify null ");
        } else {
            lsdVar.a(i);
        }
    }
}
