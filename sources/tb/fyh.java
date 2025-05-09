package tb;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.newsku.maccolor.SkuScreenVesselFragment;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fyh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VESSEL_METHOD_CLOSE_PAGE = "close_page";
    public static final String VESSEL_METHOD_CLOSE_PAGE_ANDROID = "close_page_android";
    public static final String VESSEL_METHOD_MAP_KEY = "method";
    public static final String VESSEL_METHOD_NAME_GET_DETAIL_MAC_DATA = "get_detail_mac_data";
    public static final String VESSEL_METHOD_NAME_SET_DETAIL_MAC_VID = "set_detail_mac_vid";

    /* renamed from: a  reason: collision with root package name */
    public final Context f19628a;
    public JSONObject b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ask
        public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
                return;
            }
            tgh.b("MacColorSelectVesselHodler", "发生降级，关闭DetailFullScreenVesselFragment");
            fyh.a(fyh.this);
        }

        @Override // tb.ask
        public void onLoadError(g4w g4wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            } else {
                onDowngrade(null, null);
            }
        }

        @Override // tb.ask
        public void onLoadFinish(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            }
        }

        @Override // tb.ask
        public void onLoadStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements i4w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f19630a;

        public b(c cVar) {
            this.f19630a = cVar;
        }

        @Override // tb.i4w
        public void u2(Map<String, Object> map, cbo cboVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef7dc0c", new Object[]{this, map, cboVar});
            } else {
                fyh.b(fyh.this, this.f19630a, map, cboVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    static {
        t2o.a(443547663);
    }

    public fyh(Context context) {
        this.f19628a = context;
    }

    public static /* synthetic */ void a(fyh fyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a251f890", new Object[]{fyhVar});
        } else {
            fyhVar.c();
        }
    }

    public static /* synthetic */ void b(fyh fyhVar, c cVar, Map map, cbo cboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7635a5a3", new Object[]{fyhVar, cVar, map, cboVar});
        } else {
            fyhVar.i(cVar, map, cboVar);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        SkuScreenVesselFragment f = f();
        if (f != null) {
            f.dismiss();
        }
    }

    public final ask d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ask) ipChange.ipc$dispatch("118c57ea", new Object[]{this, cVar});
        }
        return new a();
    }

    public final i4w e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i4w) ipChange.ipc$dispatch("5834ea3c", new Object[]{this, cVar});
        }
        return new b(cVar);
    }

    public final SkuScreenVesselFragment f() {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuScreenVesselFragment) ipChange.ipc$dispatch("c3dc8433", new Object[]{this});
        }
        Context context = this.f19628a;
        if (context == null || !(context instanceof FragmentActivity) || (findFragmentByTag = ((FragmentActivity) context).getSupportFragmentManager().findFragmentByTag("SkuFullScreenVesselFragment")) == null || !(findFragmentByTag instanceof SkuScreenVesselFragment)) {
            return null;
        }
        return (SkuScreenVesselFragment) findFragmentByTag;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72381e6", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject("macSKUInfos");
        }
        return jSONObject;
    }

    public final void h(cbo cboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aea4e6d", new Object[]{this, cboVar});
        } else if (cboVar != null) {
            cboVar.invoke(g());
        }
    }

    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52aa4e64", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public void k(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804ba6e4", new Object[]{this, str, cVar});
            return;
        }
        SkuScreenVesselFragment u2 = SkuScreenVesselFragment.u2();
        if (u2 != null) {
            u2.r2(str);
            u2.A2(d(cVar));
            u2.B2(e(cVar));
            u2.show(((FragmentActivity) this.f19628a).getSupportFragmentManager(), "SkuFullScreenVesselFragment");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r4.equals(tb.fyh.VESSEL_METHOD_NAME_SET_DETAIL_MAC_VID) == false) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(tb.fyh.c r8, java.util.Map<java.lang.String, java.lang.Object> r9, tb.cbo r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.fyh.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "d4836920"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            r4.ipc$dispatch(r5, r6)
            return
        L_0x001b:
            if (r9 != 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.String r4 = "method"
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L_0x0081
            java.lang.Object r4 = r9.get(r4)
            if (r4 == 0) goto L_0x0081
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x0081
            java.lang.String r4 = (java.lang.String) r4
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -2061682570: goto L_0x005d;
                case -1054326874: goto L_0x0052;
                case -574727713: goto L_0x0047;
                case 1732795568: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r0 = -1
            goto L_0x0067
        L_0x003d:
            java.lang.String r1 = "set_detail_mac_vid"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0067
            goto L_0x003b
        L_0x0047:
            java.lang.String r0 = "get_detail_mac_data"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x003b
        L_0x0050:
            r0 = 2
            goto L_0x0067
        L_0x0052:
            java.lang.String r0 = "close_page_android"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x005b
            goto L_0x003b
        L_0x005b:
            r0 = 1
            goto L_0x0067
        L_0x005d:
            java.lang.String r0 = "close_page"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x003b
        L_0x0066:
            r0 = 0
        L_0x0067:
            switch(r0) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007a;
                case 3: goto L_0x006b;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x0081
        L_0x006b:
            java.lang.String r10 = "value"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            com.taobao.android.detail.wrapper.activity.MacColorActivity$a r8 = (com.taobao.android.detail.wrapper.activity.MacColorActivity.a) r8
            r8.a(r9)
            return
        L_0x007a:
            r7.h(r10)
            return
        L_0x007e:
            r7.c()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fyh.i(tb.fyh$c, java.util.Map, tb.cbo):void");
    }
}
