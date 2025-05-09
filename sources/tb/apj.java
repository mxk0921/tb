package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.bootimage.linked.LinkedSplashData;
import java.util.HashMap;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class apj implements psg, q1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LinkedSplashData f15919a;
    public JSONObject b;
    public boolean d;
    public long f;
    public final r4u i;
    public boolean c = false;
    public boolean g = false;
    public boolean h = false;
    public final int e = mve.c("keepSearchTextKey", 10000);

    static {
        t2o.a(491782705);
        t2o.a(736100448);
        t2o.a(491782722);
    }

    public apj(p1e p1eVar) {
        this.i = new r4u(p1eVar);
    }

    @Override // tb.psg
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6a55f9", new Object[]{this});
        }
    }

    @Override // tb.q1e
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a9a1c29", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.psg
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daf1e05e", new Object[]{this});
        }
        return "searchText";
    }

    @Override // tb.psg
    public void f(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae02dd", new Object[]{this, linkedSplashData});
        } else {
            fve.e(obq.SPLASH_BUSINESS_TAG, "onReceiveData-> 收到闪屏解析完成数据的回调");
        }
    }

    @Override // tb.q1e
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public final void j() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582f9b93", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("ext")) != null) {
            o(jSONObject);
            n(jSONObject);
        }
    }

    public final boolean l() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61876a62", new Object[]{this})).booleanValue();
        }
        boolean i = this.i.i();
        StringBuilder sb = new StringBuilder("NaviBarCallbackImp#hasPop-> ");
        if (i) {
            str = "有";
        } else {
            str = "没有";
        }
        sb.append(str);
        sb.append("浮层");
        fve.e(obq.SPLASH_BUSINESS_TAG, sb.toString());
        return i;
    }

    public final boolean m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b8a2580", new Object[]{this})).booleanValue();
        }
        boolean j = this.i.j();
        StringBuilder sb = new StringBuilder("NaviBarCallbackImp#hasTaoPwd-> ");
        if (j) {
            str = "有";
        } else {
            str = "没有";
        }
        sb.append(str);
        sb.append("淘口令");
        fve.e(obq.SPLASH_BUSINESS_TAG, sb.toString());
        return j;
    }

    public final void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b68b", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.b.getJSONObject("item");
        if (jSONObject2 != null) {
            p(jSONObject2.getJSONObject("0"), jSONObject);
            p(jSONObject2.getJSONObject("1"), jSONObject);
        }
    }

    public final void o(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eb6ddc", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject3 = this.b.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("args")) != null) {
            jSONObject2.put("ext", (Object) jSONObject);
        }
    }

    @Override // tb.psg
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
        } else {
            fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onAnimationStart-> 闪屏缩放动画开始----");
        }
    }

    public final void p(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92cddc9", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && (jSONObject3 = jSONObject.getJSONObject("clickParam")) != null) {
            jSONObject3.put("ext", (Object) jSONObject2);
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bda0e116", new Object[]{this})).booleanValue();
        }
        boolean h = this.i.h();
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#isAtHomeTab->：" + h);
        return h;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.psg
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            return;
        }
        if (this.f15919a != null) {
            this.c = true;
            this.d = true;
            fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onTerminate-> 闪屏结束 mLinkedSplashData有效，需要更新底纹词");
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onTerminate->-> 插入底纹");
        q();
    }

    @Override // tb.psg
    public boolean g(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54bc039b", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.g = true;
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldColdStartShow->：");
        return t(linkedSplashData, true);
    }

    @Override // tb.psg
    public boolean h(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c8cb58", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.g = false;
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldHotStartShow->：");
        return t(linkedSplashData, r());
    }

    @Override // tb.psg
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            return;
        }
        boolean m = m();
        HashMap hashMap = new HashMap();
        hashMap.put("name", "AnimationEnd");
        hashMap.put("code", 1);
        hashMap.put("hasTaoPwd", Boolean.valueOf(m));
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#onAnimationEnd-> 闪屏缩放动画结束----, args：" + hashMap);
    }

    @Override // tb.psg
    public boolean e(psg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
        }
        boolean l = l();
        boolean m = m();
        aVar.getClass();
        if (psg.a.FROM_CLOSE.equals(null) || l || m) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> mSearchTextObject 用户点了闪屏跳过，或者当前有pop：" + l + " 或者有淘口令" + m + "不再执行缩放动画");
            return false;
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null && jSONObject.containsKey("ext")) {
            JSONObject jSONObject2 = this.b.getJSONObject("ext");
            if (jSONObject2 != null && jSONObject2.containsKey("sectionBizCode") && jSONObject2.containsKey("viewTag")) {
                InteractLocationData e = this.i.e(jSONObject2.getString("sectionBizCode"), jSONObject2.getString("viewTag"));
                if (e != null) {
                    aVar.f26271a = e.width;
                    aVar.b = e.height;
                    aVar.c = e.positionX;
                    aVar.d = e.positionY;
                    aVar.e = this.i.d();
                    fve.e(obq.SPLASH_BUSINESS_TAG, "shouldAnimate-> 拿到目标view坐标信息，可以展示动画。");
                    return true;
                }
                fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> locationData为空，禁用动画。");
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> mSearchTextObject.ext 缺少 bizCode 或者 viewTag 关键字段，禁用动画。");
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldAnimate-> mSearchTextObject 对象为null 或者没有 ext 关键字段，禁用动画。");
        return false;
    }

    public JSONObject k() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a82aafa3", new Object[]{this});
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp -> keepAdSearchInPeriodTime 获取topView底纹 coldStartInsert ,isColdStart " + this.g);
        if (!this.h) {
            return null;
        }
        if (this.g && SystemClock.elapsedRealtime() - this.f <= this.e) {
            z = true;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp -> keepAdSearchInPeriodTime 是否需要保持底纹词 " + z);
        if (z) {
            return this.i.k(this.b);
        }
        return null;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46fe415", new Object[]{this});
            return;
        }
        boolean l = l();
        boolean m = m();
        if (this.f15919a == null || m || !this.d || l) {
            StringBuilder sb = new StringBuilder("NaviBarCallbackImp-> mLinkedSplashData对象为空：");
            sb.append(this.f15919a == null);
            sb.append(" isNeedUpdateSearchText 是：");
            sb.append(this.d);
            sb.append(" 有淘口令：");
            sb.append(m);
            sb.append(" 有pop：");
            sb.append(l);
            sb.append("闪屏结束，不再塞底纹词");
            fve.e(obq.SPLASH_BUSINESS_TAG, sb.toString());
        } else {
            if (this.g) {
                this.f = SystemClock.elapsedRealtime();
                fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp-> 冷起插入底纹计时————————————" + this.f);
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp-> 开始更新底纹词————————————");
            boolean n = this.i.n(this.b);
            HashMap hashMap = new HashMap();
            hashMap.put("name", "AnimationBegin");
            if (n) {
                hashMap.put("code", 0);
                hashMap.put("error", "updateSliderData==false");
            } else {
                hashMap.put("code", 1);
            }
            fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp-> 结束更新底纹词———————————— args:" + hashMap);
        }
        this.d = false;
        this.h = true;
    }

    public final boolean t(LinkedSplashData linkedSplashData, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b9c21b2", new Object[]{this, linkedSplashData, new Boolean(z)})).booleanValue();
        }
        this.f15919a = linkedSplashData;
        this.b = linkedSplashData.getLinkedData("searchText");
        j();
        boolean m = m();
        boolean l = l();
        if (z && !m && !l) {
            z2 = true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "ShouldShow");
        hashMap.put("code", 1);
        hashMap.put("atHomeTab", Boolean.valueOf(z));
        hashMap.put("noPop", Boolean.valueOf(!l));
        hashMap.put("splashShouldShow", Boolean.valueOf(z2));
        hashMap.put("hasTaoPwd", Boolean.valueOf(m));
        t4u.a("NaviBarAnimation", "", hashMap);
        fve.e(obq.SPLASH_BUSINESS_TAG, "NaviBarCallbackImp#shouldShow-> 是否展示缩放动画：" + hashMap);
        return z2;
    }
}
