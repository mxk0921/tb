package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler.VipModulePageUTBean;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTBVIPSLIDERLAYOUTHANDLER = -7015569066931863254L;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, VipModulePageUTBean> f29774a = new ConcurrentHashMap();
    public DMComponent b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f29775a;
        public final /* synthetic */ DMComponent b;

        public a(Map map, DMComponent dMComponent) {
            this.f29775a = map;
            this.b = dMComponent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Map.Entry entry : this.f29775a.entrySet()) {
                JSONArray jSONArray = (JSONArray) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                if (!(jSONArray == null || jSONObject == null)) {
                    jSONArray.add(jSONObject);
                }
            }
            JSONObject data = this.b.getData();
            if (data != null) {
                this.b.writeBackDataAndReloadEvent(data, true);
            }
        }
    }

    static {
        t2o.a(745538105);
    }

    public static /* synthetic */ Object ipc$super(v46 v46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/eventHandler/vipModuleSliderLayoutEventHandler/DXMtbVipSliderLayoutEventHandler");
    }

    public final void a(VipModulePageUTBean vipModulePageUTBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59c9a68", new Object[]{this, vipModulePageUTBean, new Integer(i)});
            return;
        }
        vipModulePageUTBean.arg1 = "mytao_membercenter_exp";
        ((ConcurrentHashMap) this.f29774a).put(Integer.valueOf(i), vipModulePageUTBean);
    }

    public final void b(VipModulePageUTBean vipModulePageUTBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a2e064", new Object[]{this, vipModulePageUTBean, new Integer(i)});
            return;
        }
        JSONObject jSONObject = vipModulePageUTBean.args;
        if (jSONObject != null) {
            jSONObject.put("spm", (Object) "a2113w.27227112.6391534620.1");
            jSONObject.put("scm", (Object) "20140623.1.2.33");
            jSONObject.put("index", (Object) String.valueOf(i));
        }
    }

    public final void c(VipModulePageUTBean vipModulePageUTBean, JSONArray jSONArray, Map<JSONArray, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461533bb", new Object[]{this, vipModulePageUTBean, jSONArray, map});
            return;
        }
        vipModulePageUTBean.arg1 = "mytao_membercenter_click";
        JSONObject jSONObject = (JSONObject) JSON.toJSON(vipModulePageUTBean);
        if (jSONObject != null) {
            jSONObject.remove(VipModulePageUTBean.K_HAS_EXPOSURE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tag", "userTrack");
            jSONObject2.put("type", "userTrack");
            jSONObject2.put("fields", (Object) jSONObject);
            map.put(jSONArray, jSONObject2);
        }
    }

    public void d(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb02a0b", new Object[]{this, dMComponent});
            return;
        }
        f(dMComponent);
        e(dMComponent);
    }

    public final void f(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f454c028", new Object[]{this, dMComponent});
            return;
        }
        this.b = dMComponent;
        new JSONObject().putAll(this.b.getFields());
        synchronized (this.f29774a) {
            ((ConcurrentHashMap) this.f29774a).clear();
        }
    }

    public final void g(VipModulePageUTBean vipModulePageUTBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35af2cda", new Object[]{this, vipModulePageUTBean});
        } else {
            vipModulePageUTBean.hasExposure = true;
        }
    }

    public final void e(DMComponent dMComponent) {
        VipModulePageUTBean vipModulePageUTBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41953b61", new Object[]{this, dMComponent});
            return;
        }
        JSONObject events = dMComponent.getEvents();
        if (events != null) {
            HashMap hashMap = new HashMap();
            int i = -1;
            while (true) {
                i++;
                String concat = "openVipCenterLoop_".concat(String.valueOf(i));
                if (events.containsKey(concat)) {
                    JSONArray c = trf.c(events, concat);
                    if (c != null) {
                        Iterator<Object> it = c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof JSONObject) {
                                    JSONObject jSONObject = (JSONObject) next;
                                    if ("userTrack".equals(jSONObject.getString("tag")) && (vipModulePageUTBean = (VipModulePageUTBean) JSON.toJavaObject(jSONObject.getJSONObject("fields"), VipModulePageUTBean.class)) != null) {
                                        b(vipModulePageUTBean, i);
                                        a(vipModulePageUTBean.clone(), i);
                                        c(vipModulePageUTBean.clone(), c, hashMap);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    uuu.a(new a(hashMap, dMComponent));
                    return;
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        s32.c().i("DXMtbVipSliderLayoutEventHandler");
        if (objArr != null && objArr.length >= 1 && dXRuntimeContext != null) {
            String str = (String) objArr[0];
            DXSliderLayout dXSliderLayout = (DXSliderLayout) dXRuntimeContext.W();
            if (h9z.EVENT_ON_APPEAR.equals(str)) {
                dXSliderLayout.startTimer();
            } else if ("onDisAppear".equals(str)) {
                dXSliderLayout.stopTimer();
            } else if ("onPageChange".equals(str) && (dXEvent instanceof DXPageChangeEvent)) {
                int i = ((DXPageChangeEvent) dXEvent).pageIndex;
                synchronized (this.f29774a) {
                    try {
                        VipModulePageUTBean vipModulePageUTBean = (VipModulePageUTBean) ((ConcurrentHashMap) this.f29774a).get(Integer.valueOf(i));
                        if (vipModulePageUTBean != null && !vipModulePageUTBean.hasExposure) {
                            TBS.Ext.commitEvent(vipModulePageUTBean.page, 2201, vipModulePageUTBean.arg1, null, null, suv.i(vipModulePageUTBean.args));
                            g(vipModulePageUTBean);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
