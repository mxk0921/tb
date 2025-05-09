package tb;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.dmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hmf extends ViewWidget<FrameLayout, IrpDatasource, hmf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final dmf.a l;
    public FrameLayout m;
    public dmf n;
    public boolean o;
    public final a p = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements dmf.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dmf.a
        public void B(boolean z, Integer num, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947e57d0", new Object[]{this, new Boolean(z), num, str});
                return;
            }
            dmf.a q0 = hmf.this.q0();
            if (q0 != null) {
                q0.B(z, num, str);
            }
            if (!z) {
                hmf.h0(hmf.this);
            }
        }

        @Override // tb.dmf.a
        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c43c0ff9", new Object[]{this});
                return;
            }
            dmf.a q0 = hmf.this.q0();
            if (q0 != null) {
                q0.k();
            }
        }

        @Override // tb.dmf.a
        public void n(boolean z, Integer num, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27e57c1e", new Object[]{this, new Boolean(z), num, str});
                return;
            }
            dmf.a q0 = hmf.this.q0();
            if (q0 != null) {
                q0.n(z, num, str);
            }
        }

        @Override // tb.dmf.a
        public int u(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("df098bad", new Object[]{this, new Integer(i)})).intValue();
            }
            dmf.a q0 = hmf.this.q0();
            if (q0 == null) {
                return 0;
            }
            return q0.u(i);
        }

        @Override // tb.dmf.a
        public void j(boolean z, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83f249dc", new Object[]{this, new Boolean(z), view});
                return;
            }
            ckf.g(view, "containerView");
            FrameLayout i0 = hmf.i0(hmf.this);
            if (i0 != null) {
                i0.addView(view, 0);
                dmf.a q0 = hmf.this.q0();
                if (q0 != null) {
                    q0.j(z, view);
                    return;
                }
                return;
            }
            ckf.y("mRootView");
            throw null;
        }
    }

    static {
        t2o.a(481297231);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar, dmf.a aVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.l = aVar;
    }

    public static final /* synthetic */ void h0(hmf hmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b17820", new Object[]{hmfVar});
        } else {
            hmfVar.l0();
        }
    }

    public static final /* synthetic */ FrameLayout i0(hmf hmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("804282e5", new Object[]{hmfVar});
        }
        return hmfVar.m;
    }

    public static /* synthetic */ Object ipc$super(hmf hmfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1794064906) {
            super.M();
            return null;
        } else if (hashCode == 731174045) {
            super.L();
            return null;
        } else if (hashCode == 1083424568) {
            super.K();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/newresult/widget/hybird/IrpHybridWidget");
        }
    }

    public final void A0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f800c10f", new Object[]{this, new Float(f)});
            return;
        }
        FrameLayout X = X();
        if (X != null) {
            X.setTranslationY(f);
        }
    }

    public final void B0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d1b959", new Object[]{this, jSONArray});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.n(jSONArray);
        }
    }

    public final void C0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe748a9", new Object[]{this, new Boolean(z)});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.o(z);
        }
    }

    public final void D0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a5e9c7", new Object[]{this, jSONObject});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.p(jSONObject);
        }
    }

    public final void E0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4de993", new Object[]{this, jSONObject});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.q(jSONObject);
        }
    }

    @Override // tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.K();
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.b();
        }
    }

    @Override // tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        super.L();
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.g();
        }
    }

    @Override // tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
            return;
        }
        super.M();
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.h();
        }
    }

    public final Map<String, String> j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9640bf7", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("innative", "1");
        linkedHashMap.put("biz_type", "pai");
        linkedHashMap.put("pltv", "1");
        linkedHashMap.put("nativeReq", "true");
        linkedHashMap.put("subSearchType", "imageText_v2");
        String G = W().G();
        if (!TextUtils.isEmpty(G)) {
            linkedHashMap.put("shopId", G);
        }
        String F = W().F();
        if (!TextUtils.isEmpty(F)) {
            linkedHashMap.put("sellerId", F);
        }
        String z = W().z("cat");
        if (z == null) {
            z = "";
        }
        linkedHashMap.put("cat", z);
        linkedHashMap.put(wxi.KEY_PHOTO_FROM, W().B().getArg());
        linkedHashMap.put("pssource", W().y());
        linkedHashMap.put("ttid", caa.n());
        linkedHashMap.put("utd_id", caa.o(E()));
        linkedHashMap.put("rainbow", e0.b());
        linkedHashMap.put("triggerElder", String.valueOf(W().Y()));
        linkedHashMap.putAll(W().A());
        if (W().K() != null && !W().V()) {
            Activity E = E();
            Uri K = W().K();
            String p0 = p0(E, K == null ? null : K.toString());
            if (!TextUtils.isEmpty(p0)) {
                linkedHashMap.put("meta_info", p0);
            }
        }
        return linkedHashMap;
    }

    public final boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a592f586", new Object[]{this})).booleanValue();
        }
        dmf dmfVar = this.n;
        if (dmfVar == null) {
            return false;
        }
        return dmfVar.a();
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa3f57d", new Object[]{this});
            return;
        }
        this.o = true;
        dmf.a aVar = this.l;
        if (aVar != null) {
            aVar.k();
        }
        r0(true);
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc3b192", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            dmf dmfVar = this.n;
            if (dmfVar != null) {
                dmfVar.b();
            }
            this.n = null;
            return;
        }
        ckf.y("mRootView");
        throw null;
    }

    public final void n0(String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d14d86", new Object[]{this, str, str2, map});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.c(str, str2, map);
        }
    }

    public final void o0(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
        } else {
            n0(pg1.ATOM_EXT_window, str, map);
        }
    }

    public final dmf.a q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dmf.a) ipChange.ipc$dispatch("6e6af801", new Object[]{this});
        }
        return this.l;
    }

    public final void r0(boolean z) {
        dmf dmfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668941d3", new Object[]{this, new Boolean(z)});
            return;
        }
        pmf.z0();
        m0();
        if (W().X()) {
            dmfVar = new fmf(this.p);
        } else if (z) {
            dmfVar = new gmf(this.p);
        } else {
            dmfVar = new emf(this.p);
        }
        this.n = dmfVar;
        dmfVar.f(E(), j0());
    }

    public final boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a6c976", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public final boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f4973be", new Object[]{this})).booleanValue();
        }
        dmf dmfVar = this.n;
        if (dmfVar == null) {
            return false;
        }
        return dmfVar.e();
    }

    public final void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c929fe1", new Object[]{this});
        } else {
            r0(lg4.l2());
        }
    }

    /* renamed from: v0 */
    public FrameLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(E());
        this.m = frameLayout;
        return frameLayout;
    }

    public final void w0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.i(num);
        }
    }

    public final void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25551593", new Object[]{this, new Boolean(z)});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.m(z);
        }
    }

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2d4985", new Object[]{this});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.k();
        }
    }

    public final void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc4b939", new Object[]{this});
            return;
        }
        dmf dmfVar = this.n;
        if (dmfVar != null) {
            dmfVar.l();
        }
    }

    public final String p0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11a4f1fc", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            ckf.d(str);
        } else if (TextUtils.equals(parse.getScheme(), "file")) {
            str = parse.getPath();
        } else if (TextUtils.equals(parse.getScheme(), "content")) {
            try {
                Cursor query = MediaStore.Images.Media.query(context.getContentResolver(), parse, new String[]{"_data"}, null, null, null);
                if (!(query == null || !query.moveToFirst() || query.getCount() == 0)) {
                    str = query.getString(0);
                    query.close();
                }
                str = "";
                query.close();
            } catch (Exception unused) {
                str = "";
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ckf.d(str);
            jSONObject.put("path", str);
            ExifInterface exifInterface = new ExifInterface(str);
            String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE);
            if (!TextUtils.isEmpty(attribute)) {
                jSONObject.put("manufacturer", attribute);
            }
            String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL);
            if (!TextUtils.isEmpty(attribute2)) {
                jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, attribute2);
            }
            String attribute3 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH);
            if (!TextUtils.isEmpty(attribute3)) {
                jSONObject.put("width", attribute3);
            }
            String attribute4 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH);
            if (!TextUtils.isEmpty(attribute4)) {
                jSONObject.put("height", attribute4);
            }
            if (exifInterface.getLatLong(new float[2])) {
                jSONObject.put("GPS", "true");
            } else {
                jSONObject.put("GPS", "false");
            }
            String jSONObject2 = jSONObject.toString();
            ckf.f(jSONObject2, "meta.toString()");
            return URLEncoder.encode(jSONObject2, "UTF-8");
        } catch (Throwable unused2) {
            return "";
        }
    }
}
