package tb;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicImageViewHolder;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hsm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PHENIX_PLAVEHOLDER_PIC_BIZ_CODE = "1510";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f20873a;

        static {
            t2o.a(352321874);
            t2o.a(620757101);
        }

        public a(String str) {
            this.f20873a = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                return false;
            }
            txj.e(txj.TAG_RENDER, "预加载图片" + this.f20873a + "成功: " + succPhenixEvent.getUrl());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f20874a;

        static {
            t2o.a(352321875);
            t2o.a(774897702);
        }

        public b(String str) {
            this.f20874a = str;
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
            } else {
                txj.e(txj.TAG_RENDER, "预加载视频完成videoId：".concat(this.f20874a).concat("长度:").concat(String.valueOf(i)));
            }
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            } else {
                txj.e(txj.TAG_RENDER, "开始预加载视频：".concat(str).concat(" ，videoId：").concat(this.f20874a));
            }
        }
    }

    static {
        t2o.a(352321873);
    }

    public static HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a88784d0", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userId", oj7.a());
        hashMap.put("playScenes", "newdetail");
        hashMap.put("from", "newdetail_native");
        hashMap.put("videoChannel", "newDetailNative");
        return hashMap;
    }

    public static String b(Context context, String str, TaobaoImageUrlStrategy.ImageBlur imageBlur) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a01c19", new Object[]{context, str, imageBlur});
        }
        return c(context, str, imageBlur, false);
    }

    public static String c(Context context, String str, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13a18bf3", new Object[]{context, str, imageBlur, new Boolean(z)});
        }
        if (imageBlur != null) {
            z2 = false;
        } else if (!z) {
            return null;
        } else {
            imageBlur = TaobaoImageUrlStrategy.ImageBlur.b200;
        }
        ImageStrategyConfig a2 = ImageStrategyConfig.u("default").k(imageBlur).a();
        double d = Resources.getSystem().getDisplayMetrics().density;
        int b2 = (int) (cxo.b(context) * d);
        int a3 = (int) (cxo.a(context) * d);
        if (z2) {
            return ImageStrategyDecider.decideUrl(str, Integer.valueOf(b2 / 3), Integer.valueOf(a3 / 3), a2);
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(b2), Integer.valueOf(a3), a2);
    }

    public static String d(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a00241f", new Object[]{context, str, new Boolean(z)});
        }
        ImageStrategyConfig a2 = ImageStrategyConfig.w("default", PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).o(z).a();
        double d = Resources.getSystem().getDisplayMetrics().density;
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf((int) (cxo.b(context) * d)), Integer.valueOf((int) (cxo.a(context) * d)), a2);
    }

    public static void i(Context context, ue7 ue7Var) {
        g9e A0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e101caef", new Object[]{context, ue7Var});
            return;
        }
        Application application = Globals.getApplication();
        if (application != null) {
            f(application, ue7Var);
            if (ue7Var != null && (A0 = ue7Var.A0()) != null && A0.isDataValid()) {
                String d = d(application, A0.e(), ue7Var.Q0());
                if (!TextUtils.isEmpty(d)) {
                    s0m.B().T(d).heightScale(ue7Var.Q0()).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("video下沉")).fetch();
                    txj.e(txj.TAG_RENDER, "视频下沉发起视频封面预加载图片成功: " + d);
                }
                txj.e(txj.TAG_MEDIA_CONTROLLER, "preloadVideoNew =====>" + A0.h() + " start ");
                wmm.a(application, ue7Var);
            }
        }
    }

    public static String j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8aef7127", new Object[]{context, str});
        }
        double d = Resources.getSystem().getDisplayMetrics().density;
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf((int) (cxo.b(context) * d)), Integer.valueOf((int) (cxo.a(context) * d)), null);
    }

    public static boolean e(Context context, JSONArray jSONArray, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f459dd12", new Object[]{context, jSONArray, imageBlur, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (jSONArray == null) {
            txj.e(txj.TAG_RENDER, "imageInfos为空，不预加载图片");
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("url");
                String j = j(context, string);
                if (!TextUtils.isEmpty(j)) {
                    s0m.B().T(j).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("image")).fetch();
                    txj.e(txj.TAG_RENDER, "发起图片预加载: " + j);
                    z2 = true;
                }
                if (!z || !r19.C()) {
                    str = c(context, string, imageBlur, z);
                } else {
                    str = r19.X();
                }
                if (!TextUtils.isEmpty(str)) {
                    s0m.B().T(str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("imageGaussian")).fetch();
                }
            }
        }
        return z2;
    }

    public static boolean g(otm otmVar, Context context, JSONObject jSONObject, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbb26960", new Object[]{otmVar, context, jSONObject, imageBlur, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            txj.e(txj.TAG_RENDER, "PreloadMediaUtils.preloadMedia context为空");
        }
        if (jSONObject == null) {
            txj.e(txj.TAG_RENDER, "PreloadMediaUtils.preloadMedia preloadData为空");
            return false;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("images");
        JSONArray jSONArray2 = jSONObject.getJSONArray("videos");
        boolean e = e(context, jSONArray, imageBlur, z);
        boolean h = h(otmVar, context, jSONArray2, imageBlur, true, z);
        if (e || h) {
            HashMap hashMap = new HashMap();
            hashMap.put("preloadImgSuccess", String.valueOf(e));
            hashMap.put("preloadVideosSuccess", String.valueOf(h));
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_PRELOAD_MEDIA_SUCCESS, hashMap);
        }
        return true;
    }

    public static void f(Context context, ue7 ue7Var) {
        p0i p0iVar;
        List<u0i> list;
        u0i u0iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859939e9", new Object[]{context, ue7Var});
        } else if (ue7Var != null && (p0iVar = ue7Var.w0) != null && (list = p0iVar.b) != null && !((ArrayList) list).isEmpty() && (u0iVar = (u0i) ((ArrayList) ue7Var.w0.b).get(0)) != null && MainPicImageViewHolder.l.equals(u0iVar.e()) && (u0iVar instanceof ome)) {
            ome omeVar = (ome) u0iVar;
            String d = d(context, omeVar.e, ue7Var.Q0());
            if (!TextUtils.isEmpty(d)) {
                s0m.B().T(d).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).heightScale(ue7Var.Q0()).succListener(new a("image")).fetch();
                s0m.B().T(j(context, omeVar.e)).bitmapProcessors(true, new yf2(context, ue7Var.C().N().x(), 2)).fetch();
                txj.e(txj.TAG_RENDER, "新版主图发起图片预加载: " + d);
            }
        }
    }

    public static boolean h(otm otmVar, Context context, JSONArray jSONArray, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z, boolean z2) {
        int i;
        boolean z3;
        String str;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4d67c2b", new Object[]{otmVar, context, jSONArray2, imageBlur, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (jSONArray2 == null) {
            txj.e(txj.TAG_RENDER, "videoInfos为空，不预加载视频");
            return false;
        }
        int i2 = 0;
        boolean z4 = false;
        while (i2 < jSONArray.size()) {
            JSONObject jSONObject = jSONArray2.getJSONObject(i2);
            if (jSONObject != null) {
                String string = jSONObject.getString("videoThumbnailURL");
                String j = j(context, string);
                if (!TextUtils.isEmpty(j)) {
                    s0m.B().T(j).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("video")).fetch();
                    txj.e(txj.TAG_RENDER, "发起视频封面预加载图片成功: " + j);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z2 || !r19.C()) {
                    str = c(context, string, imageBlur, z2);
                } else {
                    str = r19.X();
                }
                if (!TextUtils.isEmpty(str)) {
                    s0m.B().T(str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("videoGaussian")).fetch();
                }
                String string2 = jSONObject.getString("videoId");
                if (!TextUtils.isEmpty(string2)) {
                    if (otmVar != null) {
                        otmVar.b(context, string2, z);
                    } else {
                        e95.a(context, string2, a(), 512000, new b(string2));
                        txj.e(txj.TAG_RENDER, "发起视频预加载成功: " + string2);
                    }
                    if (z3) {
                        i = 1;
                        z4 = true;
                        i2 += i;
                        jSONArray2 = jSONArray;
                    }
                }
            }
            i = 1;
            i2 += i;
            jSONArray2 = jSONArray;
        }
        return z4;
    }
}
