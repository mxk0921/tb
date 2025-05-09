package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s4i implements hkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mjb f27791a;
    public BootImageInfo b;
    public final vn2 c = new vn2("Market");
    public int d = 2002;

    static {
        t2o.a(736100372);
        t2o.a(736100365);
    }

    public final void a(JSONObject jSONObject, List<qt7> list, List<BootImageInfo> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4487d2", new Object[]{this, jSONObject, list, list2});
            return;
        }
        JSONObject j = ph2.j(jSONObject);
        if (j != null) {
            try {
                BootImageInfo bootImageInfo = (BootImageInfo) JSON.parseObject(j.toJSONString(), BootImageInfo.class);
                if (bootImageInfo != null) {
                    if (!TextUtils.isEmpty(bootImageInfo.imgUrl)) {
                        list.add(new qt7(bootImageInfo.imgUrl, 1, bootImageInfo.enable4G));
                    }
                    if (!TextUtils.isEmpty(bootImageInfo.videoUrl)) {
                        list.add(new qt7(bootImageInfo.videoUrl, 0, bootImageInfo.enable4G));
                    }
                    list2.add(bootImageInfo);
                }
            } catch (Exception e) {
                tm1.b("2ARCH_MarketBootImage", "addGeneralDownloadData:onDownload parse Error: ", e);
            }
        }
    }

    public final void b(JSONObject jSONObject, List<qt7> list, List<BootImageInfo> list2) {
        BootImageInfo bootImageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6671d2a7", new Object[]{this, jSONObject, list, list2});
            return;
        }
        JSONArray k = ph2.k(jSONObject);
        if (!(k == null || k.isEmpty())) {
            for (int i = 0; i < k.size(); i++) {
                JSONObject jSONObject2 = k.getJSONObject(i);
                if (jSONObject2 != null) {
                    try {
                        bootImageInfo = (BootImageInfo) JSON.parseObject(jSONObject2.toJSONString(), BootImageInfo.class);
                    } catch (Exception e) {
                        tm1.b("2ARCH_MarketBootImage", "addOriginalDownloadData parse bootImageInfo error  ", e);
                        bootImageInfo = null;
                    }
                    if (bootImageInfo != null) {
                        list.add(new qt7(bootImageInfo.imgUrl, 1, bootImageInfo.enable4G));
                        list.add(new qt7(bootImageInfo.videoUrl, 0, bootImageInfo.enable4G));
                        list2.add(bootImageInfo);
                    }
                }
            }
        }
    }

    public final boolean c(BootImageInfo bootImageInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed93b579", new Object[]{this, bootImageInfo, new Integer(i)})).booleanValue();
        }
        if (!f(bootImageInfo, i) || !d(bootImageInfo, i) || !e(bootImageInfo) || !this.c.d(bootImageInfo)) {
            return false;
        }
        return true;
    }

    public final boolean e(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb0233d", new Object[]{this, bootImageInfo})).booleanValue();
        }
        long g = di2.g();
        if (g < bootImageInfo.gmtStartMs || g > bootImageInfo.gmtEndMs || TextUtils.isEmpty(bootImageInfo.itemId)) {
            return false;
        }
        return true;
    }

    public final boolean f(BootImageInfo bootImageInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f12b002c", new Object[]{this, bootImageInfo, new Integer(i)})).booleanValue();
        }
        if (bootImageInfo.coldStart && i == 1000) {
            return true;
        }
        if (!bootImageInfo.hotStart || i != 1001) {
            return false;
        }
        return true;
    }

    public final boolean g(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6704ead1", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
        }
        JSONObject j = ph2.j(jSONObject);
        if (j == null) {
            tm1.a("2ARCH_MarketBootImage", "chooseInfoByGeneralSplash splashContent null:  ");
            return false;
        }
        try {
            BootImageInfo bootImageInfo = (BootImageInfo) JSON.parseObject(j.toJSONString(), BootImageInfo.class);
            if (bootImageInfo == null) {
                tm1.a("2ARCH_MarketBootImage", "chooseInfoByGeneralSplash: bootImageInfo null: ");
                return false;
            } else if (!c(bootImageInfo, i)) {
                tm1.a("2ARCH_MarketBootImage", "chooseInfoByGeneralSplash: not available: ");
                return false;
            } else {
                this.b = bootImageInfo;
                bootImageInfo.exposureParam = ph2.i(jSONObject);
                BootImageInfo bootImageInfo2 = this.b;
                bootImageInfo2.sceneType = "Market";
                this.d = 2001;
                i(bootImageInfo2);
                return true;
            }
        } catch (Exception e) {
            tm1.b("2ARCH_MarketBootImage", "chooseInfoByGeneralSplash: parse Error: ", e);
            return false;
        }
    }

    @Override // tb.hkb
    public String getBusinessCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ffdf296", new Object[]{this});
        }
        return "Market";
    }

    public final boolean h(JSONObject jSONObject, int i) {
        BootImageInfo bootImageInfo;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21a61332", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
        }
        JSONArray k = ph2.k(jSONObject);
        if (k == null || k.isEmpty()) {
            tm1.a("2ARCH_MarketBootImage", "chooseInfoByOriginalSplash content null:  ");
            return false;
        }
        boolean z = false;
        while (true) {
            if (i2 >= k.size()) {
                break;
            }
            JSONObject jSONObject2 = k.getJSONObject(i2);
            if (jSONObject2 != null) {
                try {
                    bootImageInfo = (BootImageInfo) JSON.parseObject(jSONObject2.toJSONString(), BootImageInfo.class);
                } catch (Exception e) {
                    tm1.b("2ARCH_MarketBootImage", "chooseInfoByOriginalSplash parse bootImageInfo error  ", e);
                    bootImageInfo = null;
                }
                if (bootImageInfo != null && (z = c(bootImageInfo, i))) {
                    this.b = bootImageInfo;
                    bootImageInfo.sceneType = "Market";
                    this.d = 2001;
                    i(bootImageInfo);
                    break;
                }
            }
            i2++;
        }
        return z;
    }

    @Override // tb.hkb
    public void instantiate(mjb mjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933fde58", new Object[]{this, mjbVar});
            return;
        }
        tm1.a("2ARCH_MarketBootImage", "instantiate: ");
        this.c.e();
        this.f27791a = mjbVar;
    }

    @Override // tb.ckc
    public void onCreateView(BootImageInfo bootImageInfo, ei2 ei2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529c79f3", new Object[]{this, bootImageInfo, ei2Var, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_MarketBootImage", "onCreateView: ");
        if (BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType)) {
            ei2Var.b().setBackgroundResource(R.drawable.splash);
            ImageView c = ei2Var.c();
            c.setScaleType(ImageView.ScaleType.FIT_START);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c.getLayoutParams();
            marginLayoutParams.topMargin = 120;
            c.setLayoutParams(marginLayoutParams);
        }
        this.f27791a.c(2001);
    }

    @Override // tb.ckc
    public void onDownload(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2161d64", new Object[]{this, list, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_MarketBootImage", "Market:onDownload: ");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : list) {
            if (jSONObject != null) {
                if (jSONObject.getBooleanValue("enableGeneralSplash")) {
                    a(jSONObject, arrayList, arrayList2);
                } else {
                    b(jSONObject, arrayList, arrayList2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.c.g(arrayList2);
            this.f27791a.i(arrayList, "Market");
        }
    }

    @Override // tb.ckc
    public void onStart(List<JSONObject> list, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270aeca8", new Object[]{this, list, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_MarketBootImage", "onStart ---->  " + i);
        this.d = 2002;
        for (JSONObject jSONObject : list) {
            if (jSONObject != null) {
                boolean booleanValue = jSONObject.getBooleanValue("enableGeneralSplash");
                tm1.a("2ARCH_MarketBootImage", "onStart enableGeneralSplash:  " + booleanValue);
                if (booleanValue) {
                    z = g(jSONObject, i);
                } else {
                    z = h(jSONObject, i);
                }
                if (z) {
                    break;
                }
            }
        }
        this.f27791a.d(this.b, i, this.d);
    }

    @Override // tb.ckc
    public void onTerminate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        tm1.a("2ARCH_MarketBootImage", "onTerminate: ");
        this.f27791a.b(2001);
    }

    public final boolean d(BootImageInfo bootImageInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f773e09d", new Object[]{this, bootImageInfo, new Integer(i)})).booleanValue();
        }
        if (TextUtils.equals("image", bootImageInfo.bizType)) {
            return true;
        }
        if (i == 1000) {
            return BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType);
        }
        return BootImageInfo.BIZ_TYPE_VIDEO.equals(bootImageInfo.bizType) || BootImageInfo.BIZ_TYPE_VIDEO_ICON.equals(bootImageInfo.bizType);
    }

    @Override // tb.ckc
    public void onViewShown(ei2 ei2Var, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc759ce", new Object[]{this, ei2Var, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_MarketBootImage", "onViewShown: ");
        BootImageInfo bootImageInfo = this.b;
        if (bootImageInfo == null) {
            tm1.a("2ARCH_MarketBootImage", "onViewShown mBootImageInfo null: ");
            this.f27791a.a(2002);
            return;
        }
        this.c.f(bootImageInfo);
        JSONObject jSONObject = this.b.exposureParam;
        if (i != 1000) {
            z = false;
        }
        o4v.a(jSONObject, z);
        o4v.b(this.b.exposureParam);
        this.f27791a.a(2001);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        if (r4.equals("image") == false) goto L_0x0045;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.taobao.bootimage.data.BootImageInfo r8) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.s4i.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "728bbfff"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r7
            r0[r1] = r8
            r3.ipc$dispatch(r4, r0)
            return
        L_0x0015:
            com.taobao.bootimage.arch.flow.view.SkipStyle r3 = new com.taobao.bootimage.arch.flow.view.SkipStyle
            r3.<init>()
            int r4 = com.taobao.taobao.R.string.taobao_app_1000_1_17005
            java.lang.String r4 = com.alibaba.ability.localization.Localization.q(r4)
            r3.skipText = r4
            java.lang.String r4 = "#ffffff"
            int r4 = android.graphics.Color.parseColor(r4)
            r3.skipTextColor = r4
            java.lang.String r4 = "#ff4400"
            int r4 = android.graphics.Color.parseColor(r4)
            r3.countTimeTextColor = r4
            r3.skipTextIsBold = r2
            r3.countTimeTextIsBold = r2
            r3.isHide = r2
            java.lang.String r4 = r8.bizType
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1824432991: goto L_0x0068;
                case -35894372: goto L_0x005c;
                case 100313435: goto L_0x0053;
                case 893939253: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            r0 = -1
            goto L_0x0072
        L_0x0047:
            java.lang.String r0 = "videoNoIcon"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x0045
        L_0x0051:
            r0 = 3
            goto L_0x0072
        L_0x0053:
            java.lang.String r2 = "image"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0072
            goto L_0x0045
        L_0x005c:
            java.lang.String r0 = "videoHaveIcon"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x0045
        L_0x0066:
            r0 = 1
            goto L_0x0072
        L_0x0068:
            java.lang.String r0 = "coldStartAd"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x0045
        L_0x0071:
            r0 = 0
        L_0x0072:
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x007d;
                case 2: goto L_0x0076;
                case 3: goto L_0x007d;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x008a
        L_0x0076:
            r0 = 15
            r3.skipTextSize = r0
            r3.countTimeTextSize = r0
            goto L_0x008a
        L_0x007d:
            int r0 = com.taobao.taobao.R.drawable.bootimage_close_bg
            r3.background = r0
            r0 = 13
            r3.skipTextSize = r0
            r3.countTimeTextSize = r0
            goto L_0x008a
        L_0x0088:
            r3.isHide = r1
        L_0x008a:
            r8.skipStyle = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s4i.i(com.taobao.bootimage.data.BootImageInfo):void");
    }
}
