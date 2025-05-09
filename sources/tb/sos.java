package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bridge.TTFloatViewWeexModule;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.floatview.TTReplaceLiveFloatController;
import com.taobao.android.detail.ttdetail.floatview.TTVesselWeexViewDecorator;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sos {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int h = 3;
    public static final boolean i;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f28191a;
    public final Activity b;
    public JSONArray c;
    public jxd d;
    public final FrameLayout e;
    public final List<TTVesselWeexViewDecorator> f = new ArrayList();
    public TTReplaceLiveFloatController g;

    static {
        t2o.a(912261799);
        try {
            WXSDKEngine.registerModule("alix_message", TTFloatViewWeexModule.class);
            i = true;
        } catch (Throwable th) {
            tgh.c("TTWeexFloatViewController", "initBridge error", th);
        }
    }

    public sos(Context context, ze7 ze7Var, FrameLayout frameLayout) {
        this.b = (Activity) context;
        this.f28191a = ze7Var;
        this.e = frameLayout;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b0031a", new Object[]{this, view});
        } else if (this.e.indexOfChild(view) <= -1 && view != null) {
            this.e.addView(view);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eca425", new Object[]{this});
            return;
        }
        List<TTVesselWeexViewDecorator> list = this.f;
        if (list != null && ((ArrayList) list).size() != 0) {
            Iterator it = ((ArrayList) this.f).iterator();
            while (it.hasNext()) {
                TTVesselWeexViewDecorator tTVesselWeexViewDecorator = (TTVesselWeexViewDecorator) it.next();
                if (tTVesselWeexViewDecorator != null) {
                    tTVesselWeexViewDecorator.g();
                }
            }
        }
    }

    public final void c(TTVesselWeexViewDecorator tTVesselWeexViewDecorator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45001f", new Object[]{this, tTVesselWeexViewDecorator});
        } else if (tTVesselWeexViewDecorator != null && tTVesselWeexViewDecorator.i() != null) {
            VesselWeexView i2 = tTVesselWeexViewDecorator.i();
            i2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            tTVesselWeexViewDecorator.s(i2);
            if (this.e != null) {
                if (nj7.i(this.f28191a.c())) {
                    i2.setAutoResize(true);
                }
                this.e.addView(i2);
            }
        }
    }

    public final void d() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c52dc4", new Object[]{this});
        } else if (this.c != null) {
            int size = ((ArrayList) this.f).size();
            int i2 = h;
            if (size < i2) {
                int size2 = this.c.size() - ((ArrayList) this.f).size();
                int size3 = i2 - ((ArrayList) this.f).size();
                if (size2 >= size3) {
                    size2 = size3;
                }
                if (size2 > 0) {
                    for (int i3 = 0; i3 < size2; i3++) {
                        TTVesselWeexViewDecorator tTVesselWeexViewDecorator = new TTVesselWeexViewDecorator(this.b, this.f28191a);
                        ((ArrayList) this.f).add(tTVesselWeexViewDecorator);
                        b();
                        c(tTVesselWeexViewDecorator);
                    }
                } else if (size2 < 0) {
                    for (int i4 = 0; i4 < Math.abs(size2); i4++) {
                        if (((ArrayList) this.f).size() > 0) {
                            TTVesselWeexViewDecorator tTVesselWeexViewDecorator2 = (TTVesselWeexViewDecorator) ((ArrayList) this.f).get(0);
                            if (!(tTVesselWeexViewDecorator2 == null || (frameLayout = this.e) == null)) {
                                frameLayout.removeView(tTVesselWeexViewDecorator2.j());
                            }
                            TTVesselWeexViewDecorator tTVesselWeexViewDecorator3 = (TTVesselWeexViewDecorator) ((ArrayList) this.f).remove(0);
                            if (tTVesselWeexViewDecorator3 != null) {
                                tTVesselWeexViewDecorator3.l();
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d286eb35", new Object[]{this, jSONObject})).booleanValue();
        }
        jxd jxdVar = this.d;
        if (jxdVar == null || !((TTReplaceLiveFloatController) jxdVar).e(jSONObject)) {
            if (vbl.o0()) {
                if (this.g == null) {
                    this.g = new TTReplaceLiveFloatController(this.b, this.f28191a);
                }
                if (this.g.e(jSONObject)) {
                    a(this.g.c());
                    return true;
                }
            }
            return false;
        }
        a(((TTReplaceLiveFloatController) this.d).c());
        return true;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        List<TTVesselWeexViewDecorator> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                TTVesselWeexViewDecorator tTVesselWeexViewDecorator = (TTVesselWeexViewDecorator) it.next();
                if (tTVesselWeexViewDecorator != null) {
                    tTVesselWeexViewDecorator.l();
                }
            }
        }
        TTReplaceLiveFloatController tTReplaceLiveFloatController = this.g;
        if (tTReplaceLiveFloatController != null) {
            tTReplaceLiveFloatController.b();
        }
    }

    public void h(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11eb030a", new Object[]{this, jSONArray});
        } else if (jSONArray == null || jSONArray.isEmpty()) {
            i();
        } else {
            try {
                if (jSONArray.size() > 0 && !((JSONObject) jSONArray.get(0)).isEmpty()) {
                    e(jSONArray);
                }
            } catch (Throwable th) {
                tgh.c("TTWeexFloatViewController", "onRefresh", th);
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1787d04", new Object[]{this});
            return;
        }
        List<TTVesselWeexViewDecorator> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                TTVesselWeexViewDecorator tTVesselWeexViewDecorator = (TTVesselWeexViewDecorator) it.next();
                if (tTVesselWeexViewDecorator != null) {
                    this.e.removeView(tTVesselWeexViewDecorator.i());
                }
            }
        }
        TTReplaceLiveFloatController tTReplaceLiveFloatController = this.g;
        if (!(tTReplaceLiveFloatController == null || tTReplaceLiveFloatController.c() == null)) {
            this.e.removeView(this.g.c());
        }
        jxd jxdVar = this.d;
        if (jxdVar != null && ((TTReplaceLiveFloatController) jxdVar).c() != null) {
            this.e.removeView(((TTReplaceLiveFloatController) this.d).c());
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f34d22", new Object[]{this});
            return;
        }
        List<TTVesselWeexViewDecorator> list = this.f;
        if (list != null && ((ArrayList) list).size() != 0) {
            Iterator it = ((ArrayList) this.f).iterator();
            while (it.hasNext()) {
                TTVesselWeexViewDecorator tTVesselWeexViewDecorator = (TTVesselWeexViewDecorator) it.next();
                if (tTVesselWeexViewDecorator != null) {
                    tTVesselWeexViewDecorator.r();
                }
            }
        }
    }

    public void k(jxd jxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1168cc80", new Object[]{this, jxdVar});
        } else {
            this.d = jxdVar;
        }
    }

    public final void l(String str) {
        JSONObject umbParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1e5d27", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Seller seller = (Seller) this.f28191a.e().f(Seller.class);
        Item item = (Item) this.f28191a.e().f(Item.class);
        Params params = (Params) this.f28191a.e().f(Params.class);
        String str2 = "";
        String string = (params == null || (umbParams = params.getUmbParams()) == null) ? str2 : umbParams.getString("aliBizName");
        jSONObject.put("sellerType", (Object) (seller == null ? str2 : seller.getShopTypeOriginal()));
        if (item != null) {
            str2 = item.getItemId();
        }
        jSONObject.put("itemId", (Object) str2);
        jSONObject.put("bizName", (Object) string);
        jSONObject.put(OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE, (Object) "weexFloat");
        jSONObject.put("floatUrl", (Object) str);
        UtUtils.f(19999, "exposure_component_event_info", jSONObject);
    }

    public final void e(JSONArray jSONArray) {
        JSONArray jSONArray2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea0fe5", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            this.c = jSONArray;
            if (i && WXEnvironment.isCPUSupport()) {
                j();
                d();
                List<TTVesselWeexViewDecorator> list = this.f;
                if (!(list == null || ((ArrayList) list).isEmpty() || (jSONArray2 = this.c) == null || jSONArray2.isEmpty())) {
                    for (int i2 = 0; i2 < this.c.size() && ((ArrayList) this.f).size() > i2; i2++) {
                        TTVesselWeexViewDecorator tTVesselWeexViewDecorator = (TTVesselWeexViewDecorator) ((ArrayList) this.f).get(i2);
                        if (!(tTVesselWeexViewDecorator == null || (jSONObject = this.c.getJSONObject(i2)) == null || f(jSONObject))) {
                            String string = jSONObject.getString("url");
                            jSONObject.getString("type");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                            try {
                                tTVesselWeexViewDecorator.k(string, jSONObject2);
                                l(string + "&_weexfloatParams=" + URLEncoder.encode(JSON.toJSONString(jSONObject2)));
                            } catch (Throwable th) {
                                tgh.c("TTWeexFloatViewController", "loadWeexPage", th);
                            }
                        }
                    }
                }
            }
        }
    }
}
