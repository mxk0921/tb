package com.taobao.share.ui.engine.weex;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.share.ui.engine.weex.b;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import com.ut.share.business.ShareBusiness;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.d4x;
import tb.doh;
import tb.fwr;
import tb.kip;
import tb.kwr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NOTCH_IN_SCREEN_VIVO = 32;
    public static final int VIVO_NOTCH = 32;

    /* renamed from: a  reason: collision with root package name */
    public static final String f11784a = "WeexRender";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements WeexBizView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeexBizView f11785a;
        public final /* synthetic */ b.c b;

        public a(WeexBizView weexBizView, b.c cVar) {
            this.f11785a = weexBizView;
            this.b = cVar;
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d1f986", new Object[]{this, str, map});
                return;
            }
            c.a();
            this.f11785a.clear();
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void b(WeexBizView weexBizView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e81cc09", new Object[]{this, weexBizView});
                return;
            }
            c.a();
            this.b.getDowngradeListener().onDowngrade();
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void c(WeexBizView weexBizView, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4569b455", new Object[]{this, weexBizView, view});
            } else {
                c.a();
            }
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.b
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            } else {
                this.f11785a.clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(667942980);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f11784a;
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("823d14bb", new Object[]{context})).intValue();
        }
        if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
            return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
        }
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x018d
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    public static int d(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.share.ui.engine.weex.c.d(android.content.Context):int");
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62877d47", new Object[]{context})).booleanValue();
        }
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static WeexBizView h(Activity activity, String str, b.c cVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBizView) ipChange.ipc$dispatch("a6be1dde", new Object[]{activity, str, cVar, str2});
        }
        WeexBizView weexBizView = new WeexBizView(activity);
        weexBizView.init(new a(weexBizView, cVar), str2);
        weexBizView.render(str, null);
        return weexBizView;
    }

    public static boolean i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49f8e5bf", new Object[]{activity})).booleanValue();
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).getContext().getPackageName();
                if (viewGroup.getChildAt(i).getId() != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(viewGroup.getChildAt(i).getId()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static VesselView j(Activity activity, b.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("3139617f", new Object[]{activity, cVar, str});
        }
        VesselView vesselView = new VesselView(activity);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap hashMap = new HashMap();
        hashMap.put("height", Integer.valueOf(d(activity)));
        if (vesselView.findViewWithTag("WebMaskView") == null) {
            vesselView.setOnLoadListener(new com.taobao.share.ui.engine.weex.b(cVar, new WebMaskView(vesselView, str), str));
        }
        vesselView.setLayoutParams(layoutParams);
        vesselView.loadUrl(VesselType.Weex, str, hashMap);
        return vesselView;
    }

    public static boolean e(Context context) {
        if ("false".equals(OrangeConfig.getInstance().getConfig("android_share", "checkHasNotchInScreenAtVIVO", "true"))) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static VesselView g(Activity activity, String str, b.c cVar, String str2) {
        VesselView vesselView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("eecbe5de", new Object[]{activity, str, cVar, str2});
        }
        String d = doh.d(str);
        if ("true".equals(kip.A())) {
            String str3 = "";
            if (TextUtils.isEmpty(str3)) {
                str3 = ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationContext().getFilesDir().getAbsolutePath() + File.separator + d + d4x.KEY_SHARE_PANEL_JS;
            }
            if ("true".equals(kwr.b(activity, d + d4x.KEY_SHARE_PANEL))) {
                try {
                    if (new File(str3).exists()) {
                        vesselView = j(activity, cVar, "file://" + str3);
                        fwr.e("render weex url by file cache,path=" + str3);
                    } else {
                        VesselView j = j(activity, cVar, str);
                        fwr.e("render weex url by url, url=" + str);
                        vesselView = j;
                    }
                } catch (Throwable th) {
                    VesselView j2 = j(activity, cVar, str);
                    fwr.e("render weex url by file downgrade NETWORK, url=" + str + "downgrade info =" + th.toString());
                    vesselView = j2;
                }
            } else {
                vesselView = j(activity, cVar, str);
                fwr.e("render weex url by netowrk, url=" + str);
            }
            ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_LOAD_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
            d4x.e(ShareBizAdapter.getInstance().getAppEnv().getApplication(), str, d + d4x.KEY_SHARE_PANEL_JS, d + d4x.KEY_SHARE_PANEL, true);
            return vesselView;
        }
        VesselView j3 = j(activity, cVar, str);
        fwr.e("orange close, render weex url by netowrk,url=" + str);
        return j3;
    }
}
