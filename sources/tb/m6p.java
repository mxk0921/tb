package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.musie.InterceptFrameLayout;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m6p extends b7x implements GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String j;
    public String k;
    public GestureDetector l;

    static {
        t2o.a(815793672);
    }

    public m6p(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(m6p m6pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2064087969:
                return super.v2((WeexBean) objArr[0]);
            case -506257491:
                super.findAllViews();
                return null;
            case 523666796:
                return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case 1021735943:
                super.bindWithData((WeexBean) objArr[0]);
                return null;
            case 1618343666:
                return super.onCreateView();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/SearchWeexModWidget");
        }
    }

    public final void H2(JSONObject jSONObject) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (c = h19.c(jSONObject, "keys")) != null) {
            for (int i = 0; i < c.size(); i++) {
                String string = c.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    K2().clearParam(string);
                }
            }
        }
    }

    public void I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
        } else {
            postEvent(new a08());
        }
    }

    public String J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf806360", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().e().getLastSearchResult();
        if (commonSearchResult != null) {
            return commonSearchResult.nxRawIcon;
        }
        return "";
    }

    public final CommonBaseDatasource K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonBaseDatasource) ipChange.ipc$dispatch("ca6da478", new Object[]{this});
        }
        return (CommonBaseDatasource) getModel().e();
    }

    public final void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660601e9", new Object[]{this});
            return;
        }
        BaseTypedBean c = c().n().c(JSON.parseObject(((BaseSearchResult) getModel().e().getTotalSearchResult()).getExtMod("sideMod")), (BaseSearchResult) getModel().e().getTotalSearchResult());
        TemplateBean template = getModel().e().getTemplate(c.type);
        if (template != null && (c instanceof MuiseBean)) {
            new lcj(getActivity(), (ude) getRoot(), getModel(), template, (ViewGroup) getActivity().getWindow().getDecorView(), new l6p(this)).bindWithData((MuiseBean) c);
        }
    }

    public final void N2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                K2().setParam(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    public final void O2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68626144", new Object[]{this, jSONObject});
            return;
        }
        BaseTypedBean c = c().n().c(jSONObject, (BaseSearchResult) getModel().e().getTotalSearchResult());
        TemplateBean template = getModel().e().getTemplate(c.type);
        if (template != null) {
            if (c instanceof WeexBean) {
                new n84(getActivity(), this, getModel(), template, (ViewGroup) getView(), new k4k()).bindWithData((WeexBean) c);
            } else if (c instanceof MuiseBean) {
                new c64(getActivity(), this, getModel(), template, (ViewGroup) getView(), new k4k()).bindWithData((MuiseBean) c);
            }
        }
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        if (getView() instanceof sif) {
            this.l = new GestureDetector(getActivity().getApplicationContext(), this);
            ((sif) getView()).setOnInterceptTouchEventListener(new x6a(this.l));
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (o4p.z1()) {
            qkn.d(u2(), null, getActivity(), -1, getModel().e());
        }
        return false;
    }

    @Override // tb.b7x
    /* renamed from: q2 */
    public void bindWithData(WeexBean weexBean) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce67407", new Object[]{this, weexBean});
            return;
        }
        if (weexBean != null) {
            str = weexBean.type;
        } else {
            str = "";
        }
        this.j = str;
        this.k = w2().version;
        super.bindWithData(weexBean);
    }

    @Override // tb.b7x
    public Map<String, Object> v2(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84f8845f", new Object[]{this, weexBean});
        }
        Map<String, Object> v2 = super.v2(weexBean);
        String J2 = J2();
        if (!(v2 == null || J2 == null)) {
            v2.put("iconData", J2);
        }
        return v2;
    }

    @Override // tb.b7x
    /* renamed from: y2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        if (!o4p.z1()) {
            return super.onCreateView();
        }
        InterceptFrameLayout interceptFrameLayout = new InterceptFrameLayout(getActivity());
        interceptFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return interceptFrameLayout;
    }

    @Override // tb.b7x
    public void z2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
            return;
        }
        map.put("pageName", c2v.getInstance().getCurrentPageName());
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(amo.DIMENSION_BUSINESS_NAME, zvr.v());
        arrayMap.put("tItemType", this.j);
        arrayMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        arrayMap.put(amo.DIMENSION_JSVERSION, this.k);
        try {
            String str = this.j;
            arrayMap.put("rainbow", oen.n("tbAndroid" + str + "EnableLT"));
        } catch (Exception unused) {
            c4p.n("SearchWeexModWidget", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
    }

    public final void G2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    K2().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    public final void M2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    K2().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r9.equals("addParams") == false) goto L_0x0036;
     */
    @Override // tb.b7x, tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, tb.f64.a r11, tb.f64.a r12) {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 5
            r5 = 1
            com.android.alibaba.ip.runtime.IpChange r6 = tb.m6p.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0025
            java.lang.String r7 = "1f36856c"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r8
            r4[r5] = r9
            r4[r2] = r10
            r4[r1] = r11
            r4[r0] = r12
            java.lang.Object r9 = r6.ipc$dispatch(r7, r4)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0025:
            boolean r11 = super.K(r9, r10, r11, r12)
            if (r11 != 0) goto L_0x00b6
            r9.hashCode()
            r12 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -1688932813: goto L_0x0088;
                case -956863702: goto L_0x007c;
                case -703324040: goto L_0x0070;
                case -376755062: goto L_0x0065;
                case -102588025: goto L_0x005c;
                case -33915294: goto L_0x0050;
                case 485970056: goto L_0x0044;
                case 1098537456: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x0092
        L_0x0038:
            java.lang.String r0 = "removeSelf"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0042
            goto L_0x0036
        L_0x0042:
            r0 = 7
            goto L_0x0092
        L_0x0044:
            java.lang.String r0 = "setParams"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004e
            goto L_0x0036
        L_0x004e:
            r0 = 6
            goto L_0x0092
        L_0x0050:
            java.lang.String r0 = "openFilter"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x005a
            goto L_0x0036
        L_0x005a:
            r0 = 5
            goto L_0x0092
        L_0x005c:
            java.lang.String r1 = "addParams"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0092
            goto L_0x0036
        L_0x0065:
            java.lang.String r0 = "closeDropLayer"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x006e
            goto L_0x0036
        L_0x006e:
            r0 = 3
            goto L_0x0092
        L_0x0070:
            java.lang.String r0 = "openDropLayer"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x007a
            goto L_0x0036
        L_0x007a:
            r0 = 2
            goto L_0x0092
        L_0x007c:
            java.lang.String r0 = "removeParams"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0086
            goto L_0x0036
        L_0x0086:
            r0 = 1
            goto L_0x0092
        L_0x0088:
            java.lang.String r0 = "clearParams"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0091
            goto L_0x0036
        L_0x0091:
            r0 = 0
        L_0x0092:
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a6;
                case 4: goto L_0x00a2;
                case 5: goto L_0x009e;
                case 6: goto L_0x009a;
                case 7: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x00b6
        L_0x0096:
            r8.destroyAndRemoveFromParent()
            goto L_0x00b7
        L_0x009a:
            r8.N2(r10)
            goto L_0x00b7
        L_0x009e:
            r8.L2()
            goto L_0x00b7
        L_0x00a2:
            r8.G2(r10)
            goto L_0x00b7
        L_0x00a6:
            r8.I2()
            goto L_0x00b7
        L_0x00aa:
            r8.O2(r10)
            goto L_0x00b7
        L_0x00ae:
            r8.M2(r10)
            goto L_0x00b7
        L_0x00b2:
            r8.H2(r10)
            goto L_0x00b7
        L_0x00b6:
            r5 = r11
        L_0x00b7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m6p.K(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }
}
