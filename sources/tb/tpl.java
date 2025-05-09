package tb;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28859a;
    public float b;
    public final float c;
    public final float d;
    public final float e;
    public float f = 0.0f;
    public float g = 0.0f;
    public spl h;
    public ScaleGestureDetector i;
    public GestureDetector j;
    public List<lya> k;
    public boolean l;
    public rpl m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452985124);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 307521857) {
                return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            }
            if (hashCode == 2050069395) {
                return new Boolean(super.onDoubleTap((MotionEvent) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/avplayer/pano/PanoVideoUtils$GestureListener");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            float width = (f / tpl.d(tpl.this).getWidth()) * tpl.a(tpl.this);
            float height = (f2 / tpl.d(tpl.this).getHeight()) * tpl.a(tpl.this);
            tpl tplVar = tpl.this;
            tplVar.q(tpl.a(tplVar), tpl.b(tpl.this) - height, tpl.c(tpl.this) + width, true);
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    static {
        t2o.a(452985122);
    }

    public tpl(Context context, String str, spl splVar, rpl rplVar) {
        int i;
        this.f28859a = 0;
        this.b = 85.0f;
        this.c = 95.0f;
        this.d = 25.0f;
        this.e = 0.001f;
        if ("ERP".equals(str)) {
            i = 1;
        } else {
            i = 2;
        }
        this.f28859a = i;
        this.h = splVar;
        this.m = rplVar;
        this.i = new ScaleGestureDetector(context, new c());
        this.j = new GestureDetector(context, new b());
        this.b = g();
        this.c = i();
        this.d = k();
        this.e = j();
    }

    public static /* synthetic */ float a(tpl tplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe431299", new Object[]{tplVar})).floatValue();
        }
        return tplVar.b;
    }

    public static /* synthetic */ float b(tpl tplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("380db478", new Object[]{tplVar})).floatValue();
        }
        return tplVar.f;
    }

    public static /* synthetic */ float c(tpl tplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71d85657", new Object[]{tplVar})).floatValue();
        }
        return tplVar.g;
    }

    public static /* synthetic */ spl d(tpl tplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spl) ipChange.ipc$dispatch("fd80426c", new Object[]{tplVar});
        }
        return tplVar.h;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.i = null;
        this.j = null;
        this.m = null;
        this.h = null;
        this.k = null;
    }

    public boolean f(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ScaleGestureDetector scaleGestureDetector = this.i;
        if (!(scaleGestureDetector == null || this.j == null)) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            if (!this.i.isInProgress()) {
                this.j.onTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cf31165", new Object[]{this})).floatValue();
        }
        return ew0.t(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoERPDefaultFov", "85.0"));
    }

    public HashMap<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("95ff2881", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("FOV", "" + this.b);
        hashMap.put("latitude", "" + this.f);
        hashMap.put("longitude", "" + this.g);
        return hashMap;
    }

    public final float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42e37a2", new Object[]{this})).floatValue();
        }
        return ew0.t(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoERPMaxFov", "95.0"));
    }

    public final float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b556050", new Object[]{this})).floatValue();
        }
        return ew0.t(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoFovChange", "0.01"));
    }

    public final float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3ce7074", new Object[]{this})).floatValue();
        }
        return ew0.t(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoERPMinFov", "25.0"));
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4605aebc", new Object[]{this})).intValue();
        }
        return this.f28859a;
    }

    public final void p(List<lya> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b84162", new Object[]{this, list});
            return;
        }
        this.k = list;
        this.l = true;
        m();
    }

    public void q(float f, float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709c4e26", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Boolean(z)});
        } else if (z) {
            if (Math.abs(f - this.b) >= this.e || Math.abs(f2 - this.f) >= this.e || Math.abs(f3 - this.g) >= this.e) {
                if (Math.abs(1.0f + f) < 1.0E-8d) {
                    f = this.b;
                }
                float max = Math.max(this.d, Math.min(f, this.c));
                this.b = max;
                float f4 = f2 % 180.0f;
                this.f = f4;
                float f5 = f3 % 360.0f;
                this.g = f5;
                this.l = true;
                this.h.setFov(max, f4, f5);
                this.h.refreshScreen();
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        n();
        m();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452985125);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/pano/PanoVideoUtils$ScaleListener");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            if (scaleGestureDetector == null) {
                return false;
            }
            float a2 = tpl.a(tpl.this) / scaleGestureDetector.getScaleFactor();
            tpl tplVar = tpl.this;
            tplVar.q(a2, tpl.b(tplVar), tpl.c(tpl.this), true);
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "onScale " + scaleGestureDetector.getScaleFactor());
            return true;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83daa2", new Object[]{this});
        } else if (this.l) {
            this.l = false;
            List<lya> list = this.k;
            if (!(list == null || list.size() == 0)) {
                new ArrayList();
                List<mya> hitTest = this.h.hitTest(this.k);
                if (hitTest != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (mya myaVar : hitTest) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", (Object) myaVar.f24389a.f23641a);
                        jSONObject.put("latitude", (Object) Float.valueOf(myaVar.f24389a.b));
                        jSONObject.put("longitude", (Object) Float.valueOf(myaVar.f24389a.c));
                        jSONObject.put("screen_x", (Object) Float.valueOf(myaVar.b));
                        jSONObject.put("screen_y", (Object) Float.valueOf(myaVar.c));
                        jSONArray.add(jSONObject);
                    }
                    this.m.onAnchorListUpdate(jSONArray);
                }
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a61b145", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("FOV", "" + this.b);
        hashMap.put("latitude", "" + this.f);
        hashMap.put("longitude", "" + this.g);
        this.m.onFovChange(hashMap);
        this.l = true;
    }

    public void r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97af191e", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            Object obj = jSONObject.get("FOV");
            Object obj2 = jSONObject.get("latitude");
            Object obj3 = jSONObject.get("longitude");
            if (obj != null && obj2 != null && obj3 != null) {
                q(ew0.t(String.valueOf(obj)), ew0.t(String.valueOf(obj2)), ew0.t(String.valueOf(obj3)), true);
            }
        }
    }

    public void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8467d69f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("array");
            int size = jSONArray == null ? 0 : jSONArray.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                try {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    if (jSONObject2 != null) {
                        lya lyaVar = new lya();
                        lyaVar.f23641a = jSONObject2.getString("id");
                        lyaVar.b = jSONObject2.getFloat("latitude").floatValue();
                        lyaVar.c = jSONObject2.getFloat("longitude").floatValue();
                        arrayList.add(lyaVar);
                    }
                } catch (JSONException e) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, e.toString());
                }
            }
            if (arrayList.size() > 0) {
                p(arrayList);
            }
        }
    }
}
