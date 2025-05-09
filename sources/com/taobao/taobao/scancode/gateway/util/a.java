package com.taobao.taobao.scancode.gateway.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.taobao.util.Globals;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.constants.LoginUrlConstants;
import com.taobao.orange.OrangeConfig;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness;
import com.taobao.taobao.scancode.barcode.business.GetQRMedicineUrlBussiness;
import com.taobao.taobao.scancode.barcode.object.recommend.GetQRMedicineUrlRequest;
import com.taobao.taobao.scancode.common.mtop.resp.CainiaoLdDetailH5AuthGetResp;
import com.taobao.taobao.scancode.common.mtop.resp.PailitaoRecommendResp;
import com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter;
import com.taobao.taobao.scancode.gateway.activity.ResultViewController;
import com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaTBAntiFakeResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.b84;
import tb.djh;
import tb.dso;
import tb.hvm;
import tb.ip1;
import tb.jzu;
import tb.mzu;
import tb.nmd;
import tb.nyu;
import tb.o1g;
import tb.p1g;
import tb.p1p;
import tb.pkv;
import tb.qso;
import tb.rso;
import tb.ssw;
import tb.sw6;
import tb.t2o;
import tb.tiq;
import tb.ufl;
import tb.usj;
import tb.xs0;
import tb.y7b;
import tb.y7t;
import tb.yoj;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a extends sw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ufl i;
    public String j;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taobao.scancode.gateway.util.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0735a implements UrlRouter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f12929a;
        public final /* synthetic */ boolean b;

        public C0735a(Bundle bundle, boolean z) {
            this.f12929a = bundle;
            this.b = z;
        }

        @Override // com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter.a
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
            } else {
                a.f(a.this, str, this.f12929a, this.b);
            }
        }

        @Override // com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter.a
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                a.f(a.this, str, this.f12929a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements UrlModifyAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f12930a;
        public final /* synthetic */ boolean b;

        public b(Bundle bundle, boolean z) {
            this.f12930a = bundle;
            this.b = z;
        }

        @Override // com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41c87a6f", new Object[]{this, str});
                return;
            }
            try {
                a.f(a.this, str, this.f12930a, this.b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                hvm hvmVar = a.this.f32351a;
                if (hvmVar != null) {
                    hvmVar.startPreview();
                }
            } catch (Throwable th) {
                Log.e("DecodeProcessor", "some exceptions happened after invoking login url check.", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBMaterialDialog f12932a;

        public d(TBMaterialDialog tBMaterialDialog) {
            this.f12932a = tBMaterialDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f12932a.dismiss();
            a.this.f32351a.startPreview();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements GetMedicineUrlBussiness.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f12933a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ ip1 c;
        public final /* synthetic */ MaResult d;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taobao.scancode.gateway.util.a$e$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0736a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0736a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                hvm hvmVar = a.this.f32351a;
                if (hvmVar != null) {
                    hvmVar.startPreview();
                }
            }
        }

        public e(Activity activity, Context context, ip1 ip1Var, MaResult maResult) {
            this.f12933a = activity;
            this.b = context;
            this.c = ip1Var;
            this.d = maResult;
        }

        @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89233c62", new Object[]{this});
                return;
            }
            LayoutInflater layoutInflater = this.f12933a.getLayoutInflater();
            Context context = this.b;
            qso.a(layoutInflater, context, context.getResources().getString(R.string.scancode_server_error));
            new Handler().postDelayed(new RunnableC0736a(), 2500L);
        }

        @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b49463b", new Object[]{this, str});
            } else {
                this.c.a(this.d.getText(), 3, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends y7b<CainiaoLdDetailH5AuthGetResp> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaResult f12935a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taobao.scancode.gateway.util.a$f$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0737a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ CainiaoLdDetailH5AuthGetResp c;

            public C0737a(CainiaoLdDetailH5AuthGetResp cainiaoLdDetailH5AuthGetResp) {
                this.c = cainiaoLdDetailH5AuthGetResp;
            }

            public static /* synthetic */ Object ipc$super(C0737a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/util/CustomDecodeResultProcesser$15$1");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                CainiaoLdDetailH5AuthGetResp cainiaoLdDetailH5AuthGetResp = this.c;
                if (cainiaoLdDetailH5AuthGetResp == null || cainiaoLdDetailH5AuthGetResp.getData() == null || TextUtils.isEmpty(this.c.getData().getResult())) {
                    f fVar = f.this;
                    a.i(a.this, fVar.f12935a);
                    return;
                }
                String result = this.c.getData().getResult();
                a aVar = a.this;
                if (!yoj.b(aVar.b, aVar.e).d(result)) {
                    f fVar2 = f.this;
                    a.h(a.this, fVar2.f12935a);
                }
            }
        }

        public f(MaResult maResult) {
            this.f12935a = maResult;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/util/CustomDecodeResultProcesser$15");
        }

        @Override // tb.y7b
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1df753c", new Object[]{this, th});
            } else {
                a.j(a.this, this.f12935a);
            }
        }

        /* renamed from: d */
        public void a(CainiaoLdDetailH5AuthGetResp cainiaoLdDetailH5AuthGetResp, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dba31cc", new Object[]{this, cainiaoLdDetailH5AuthGetResp, str});
            } else {
                a.this.b.runOnUiThread(new C0737a(cainiaoLdDetailH5AuthGetResp));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType;

        static {
            int[] iArr = new int[ScancodeType.values().length];
            $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType = iArr;
            try {
                iArr[ScancodeType.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.MEDICINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.GEN3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FragmentActivity fragmentActivity = a.this.b;
            if (fragmentActivity != null) {
                fragmentActivity.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FragmentActivity fragmentActivity = a.this.b;
            if (fragmentActivity != null) {
                fragmentActivity.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(a aVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12938a;
        public final /* synthetic */ MaResult b;

        public k(View view, MaResult maResult) {
            this.f12938a = view;
            this.b = maResult;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a aVar = a.this;
            ResultViewController resultViewController = aVar.g;
            if (resultViewController != null) {
                resultViewController.e(aVar.b, this.f12938a, 2);
            }
            a aVar2 = a.this;
            a.d(aVar2, aVar2.b, this.b, 1);
            jzu.i("Page_PhotoSearchTake", "GoProduct", "barcode", this.b.getText(), "barcode_type", MaType.EXPRESS.name());
            hvm hvmVar = a.this.f32351a;
            if (hvmVar != null) {
                hvmVar.startPreview();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12939a;
        public final /* synthetic */ MaResult b;

        public l(View view, MaResult maResult) {
            this.f12939a = view;
            this.b = maResult;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a aVar = a.this;
            ResultViewController resultViewController = aVar.g;
            if (resultViewController != null) {
                resultViewController.e(aVar.b, this.f12939a, 2);
            }
            jzu.i("Page_PhotoSearchTake", "GoExpress", "barcode", this.b.getText(), "barcode_type", MaType.EXPRESS.name());
            a.this.b(this.b);
            hvm hvmVar = a.this.f32351a;
            if (hvmVar != null) {
                hvmVar.startPreview();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12940a;
        public final /* synthetic */ MaResult b;

        public m(View view, MaResult maResult) {
            this.f12940a = view;
            this.b = maResult;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a aVar = a.this;
            ResultViewController resultViewController = aVar.g;
            if (resultViewController != null) {
                resultViewController.e(aVar.b, this.f12940a, 2);
            }
            jzu.i("Page_PhotoSearchTake", "Close", "barcode", this.b.getText(), "barcode_type", MaType.EXPRESS.name());
            hvm hvmVar = a.this.f32351a;
            if (hvmVar != null) {
                hvmVar.startPreview();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements xs0.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12941a;
        public final /* synthetic */ MaResult b;
        public final /* synthetic */ Context c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taobao.scancode.gateway.util.a$n$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0738a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f12942a;

            public RunnableC0738a(String str) {
                this.f12942a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str = n.this.f12941a;
                if (str == null || str.equals(this.f12942a) || TextUtils.isEmpty(this.f12942a) || this.f12942a.startsWith("alipays://")) {
                    a.e(a.this, new MaResult(n.this.b.getType(), n.this.f12941a), false);
                    return;
                }
                try {
                    n nVar = n.this;
                    yoj.b(nVar.c, a.this.e).d(this.f12942a);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public n(String str, MaResult maResult, Context context) {
            this.f12941a = str;
            this.b = maResult;
            this.c = context;
        }

        @Override // tb.xs0.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33557d00", new Object[]{this, str});
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC0738a(str));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements GetQRMedicineUrlBussiness.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12943a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taobao.scancode.gateway.util.a$o$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0739a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0739a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                hvm hvmVar = a.this.f32351a;
                if (hvmVar != null) {
                    hvmVar.startPreview();
                }
            }
        }

        public o(Context context) {
            this.f12943a = context;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89233c62", new Object[]{this});
                return;
            }
            LayoutInflater layoutInflater = a.this.b.getLayoutInflater();
            Context context = this.f12943a;
            qso.a(layoutInflater, context, context.getResources().getString(R.string.scancode_server_error));
            new Handler().postDelayed(new RunnableC0739a(), 2500L);
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b49463b", new Object[]{this, str});
            } else {
                yoj.b(this.f12943a, a.this.e).d(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class p extends y7b<PailitaoRecommendResp> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p(a aVar) {
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/util/CustomDecodeResultProcesser$9");
        }

        @Override // tb.y7b
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1df753c", new Object[]{this, th});
            } else {
                y7t.a("DecodeProcessor", "antiFraudRequest: onHttpLoadingFailed");
            }
        }

        /* renamed from: d */
        public void a(PailitaoRecommendResp pailitaoRecommendResp, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("584a04c5", new Object[]{this, pailitaoRecommendResp, str});
            } else {
                y7t.a("DecodeProcessor", "antiFraudRequest: onHttpLoadingEnded");
            }
        }
    }

    static {
        t2o.a(760217699);
    }

    public a(ufl uflVar, ScancodeController scancodeController, FragmentActivity fragmentActivity, nmd nmdVar) {
        super(scancodeController, fragmentActivity, uflVar.f(), uflVar.d(), nmdVar);
        this.i = uflVar;
        this.g = new ResultViewController(fragmentActivity);
    }

    public static /* synthetic */ void d(a aVar, Activity activity, MaResult maResult, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf7dcd0", new Object[]{aVar, activity, maResult, new Integer(i2)});
        } else {
            aVar.o(activity, maResult, i2);
        }
    }

    public static /* synthetic */ boolean e(a aVar, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed09ea72", new Object[]{aVar, maResult, new Boolean(z)})).booleanValue();
        }
        return aVar.y(maResult, z);
    }

    public static /* synthetic */ void f(a aVar, String str, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f647fd", new Object[]{aVar, str, bundle, new Boolean(z)});
        } else {
            aVar.D(str, bundle, z);
        }
    }

    public static /* synthetic */ void g(a aVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456e77a9", new Object[]{aVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public static /* synthetic */ void h(a aVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1dbc6a", new Object[]{aVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public static /* synthetic */ void i(a aVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cd012b", new Object[]{aVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1085924686) {
            super.b((MaResult) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/util/CustomDecodeResultProcesser");
    }

    public static /* synthetic */ void j(a aVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927c45ec", new Object[]{aVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643bb62", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        CT ct = CT.Button;
        TBS.Adv.ctrlClicked(ct, "HuoyanCatch", "costTime=" + currentTimeMillis);
    }

    public final void D(String str, Bundle bundle, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbb8a0f", new Object[]{this, str, bundle, new Boolean(z)});
            return;
        }
        k(this.b.getApplicationContext(), str);
        if (TextUtils.indexOf(str, "http://ma.taobao.com/rl") == 0 || TextUtils.indexOf(str, "ma.taobao.com/rl") == 0) {
            str = LoginUrlConstants.getScanLoginUrl() + MyUrlEncoder.encod(str, "UTF-8");
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.trim();
        }
        if (z) {
            str2 = "_tbScancodeApproach_=photo";
        } else {
            str2 = "_tbScancodeApproach_=scan";
        }
        String a2 = nyu.a(str, str2);
        if (djh.b(this.b.getApplicationContext(), a2)) {
            new Handler(Looper.getMainLooper()).postDelayed(new c(), 10000L);
            return;
        }
        y7t.a("DecodeProcessor", "nav:" + a2);
        yoj.b(this.b, this.e).e(bundle).d(a2);
    }

    public final void E(ScancodeResult scancodeResult, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa2fe87", new Object[]{this, scancodeResult, maResult, new Boolean(z)});
        } else {
            dso.f(this.b.getApplication(), scancodeResult, maResult, z);
        }
    }

    public final boolean F(ScancodeResult scancodeResult, MaResult maResult) {
        ScancodeType scancodeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c047ca5", new Object[]{this, scancodeResult, maResult})).booleanValue();
        }
        ScancodeType scancodeType2 = scancodeResult.type;
        if (scancodeType2 != ScancodeType.QR && scancodeType2 != ScancodeType.PRODUCT && scancodeType2 != ScancodeType.MEDICINE && rso.d() && (scancodeType = scancodeResult.type) != ScancodeType.EXPRESS && scancodeType != ScancodeType.GEN3) {
            return false;
        }
        if (!usj.c(this.b.getApplicationContext())) {
            l();
            E(scancodeResult, maResult, false);
            return true;
        }
        E(scancodeResult, maResult, true);
        return false;
    }

    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void H(nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c1d46d", new Object[]{this, nmdVar});
        } else {
            this.e = nmdVar;
        }
    }

    @Override // tb.sw6
    public void b(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b9e54e", new Object[]{this, maResult});
        } else if (!usj.c(this.b)) {
            this.f.h(this.b);
        } else if (Login.checkSessionValid()) {
            v(maResult);
        } else {
            w(maResult);
        }
    }

    public final void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32dd5cfe", new Object[]{this, context, str});
        } else if (rso.b()) {
            o1g.a(context, 31821L, str, new p(this));
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfa35ca", new Object[]{this});
        } else if (!this.b.isFinishing()) {
            TBS.Adv.ctrlClickedOnPage("ScanHome", CT.Button, "neterror");
            View inflate = this.b.getLayoutInflater().inflate(R.layout.scancode_gateway_no_network_history_alert, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.btn_confirm);
            TBMaterialDialog build = new TBMaterialDialog.Builder(this.b.getApplicationContext()).customView(inflate, false).build();
            build.setCancelable(false);
            ViewProxy.setOnClickListener(findViewById, new d(build));
            Context applicationContext = this.b.getApplicationContext();
            ((TextView) inflate.findViewById(R.id.tips)).setText(applicationContext.getResources().getString(R.string.scancode_gateway_no_network_history_tips, applicationContext.getResources().getString(R.string.uik_icon_time)));
            build.getWindow().setLayout(DensityUtil.dip2px(applicationContext, 298.0f), DensityUtil.dip2px(applicationContext, 210.0f));
            build.show();
        }
    }

    public final ScancodeResult n(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScancodeResult) ipChange.ipc$dispatch("cf4f9fca", new Object[]{this, maResult});
        }
        if (maResult == null) {
            return null;
        }
        ScancodeResult scancodeResult = new ScancodeResult();
        scancodeResult.code = maResult.getText();
        scancodeResult.type = rso.n(maResult);
        if (!this.i.e().a(scancodeResult.type)) {
            return null;
        }
        return scancodeResult;
    }

    public final void o(Activity activity, MaResult maResult, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3939c8da", new Object[]{this, activity, maResult, new Integer(i2)});
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        ip1 ip1Var = new ip1(activity, this.i.h(), this.e);
        if (i2 == 1) {
            ip1Var.a(maResult.getText(), 1, null);
        } else {
            new GetMedicineUrlBussiness(new e(activity, applicationContext, ip1Var, maResult), maResult.getText()).handleMedicine();
        }
    }

    public final boolean p(Activity activity, ScancodeType scancodeType, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e0cd85", new Object[]{this, activity, scancodeType, maResult})).booleanValue();
        }
        int i2 = g.$SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[scancodeType.ordinal()];
        if (i2 == 1) {
            o(activity, maResult, 1);
        } else if (i2 == 2) {
            o(activity, maResult, 2);
        } else if (i2 != 3) {
            return t(maResult);
        } else {
            x(activity.getApplicationContext(), maResult);
        }
        return true;
    }

    public boolean q(Activity activity, MaResult maResult, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b28b3c", new Object[]{this, activity, maResult, str})).booleanValue();
        }
        ScancodeType n2 = rso.n(maResult);
        if (n2 == null) {
            return false;
        }
        B(maResult, str);
        return p(activity, n2, maResult);
    }

    public final boolean r(MaResult maResult, KakaLibImageWrapper kakaLibImageWrapper, String str) {
        FragmentActivity fragmentActivity;
        ResultViewController resultViewController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9344feb", new Object[]{this, maResult, kakaLibImageWrapper, str})).booleanValue();
        }
        ScancodeResult n2 = n(maResult);
        if (n2 == null) {
            hvm hvmVar = this.f32351a;
            if (hvmVar != null) {
                hvmVar.startPreview();
            }
            return true;
        }
        hvm hvmVar2 = this.f32351a;
        if (hvmVar2 != null) {
            hvmVar2.stopPreview();
        }
        if (u(n2)) {
            return true;
        }
        if (!(n2.type == ScancodeType.TB_4G || (resultViewController = this.g) == null)) {
            resultViewController.h();
        }
        tiq.a(n2.type.toString(), System.currentTimeMillis());
        A();
        B(maResult, str);
        if (!TextUtils.isEmpty(this.i.c())) {
            b84.a(this.b, this.i.c(), n2);
            FragmentActivity fragmentActivity2 = this.b;
            if (fragmentActivity2 != null) {
                fragmentActivity2.finish();
            }
            return false;
        } else if (this.c != null && a(maResult)) {
            if (this.d && (fragmentActivity = this.b) != null) {
                fragmentActivity.finish();
            }
            return false;
        } else if (F(n2, maResult)) {
            return true;
        } else {
            if (this.i.i() && z(n2)) {
                return true;
            }
            b84.b(this.b, maResult.getText(), maResult.getType());
            return p(this.b, n2.type, maResult);
        }
    }

    public boolean s(MaResult maResult, KakaLibImageWrapper kakaLibImageWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdeb98c", new Object[]{this, maResult, kakaLibImageWrapper, str})).booleanValue();
        }
        try {
            return r(maResult, kakaLibImageWrapper, str);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean t(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c96d43e", new Object[]{this, maResult})).booleanValue();
        }
        if (MaType.QR == maResult.getType() || MaType.TB_ANTI_FAKE == maResult.getType() || MaType.TB_4G == maResult.getType()) {
            return y(maResult, true);
        }
        if (MaType.EXPRESS == maResult.getType()) {
            View inflate = this.b.getLayoutInflater().inflate(R.layout.plt_scan_dialog_express_choose, (ViewGroup) null);
            ViewProxy.setOnTouchListener(inflate, new j(this));
            View findViewById = inflate.findViewById(R.id.fl_hint_container);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
            gradientDrawable.setCornerRadius(p1p.a(6.5f));
            findViewById.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(p1p.a(6.5f));
            gradientDrawable2.setColor(Color.parseColor("#F3F6F8"));
            View findViewById2 = inflate.findViewById(R.id.btn_scan_product);
            findViewById2.setBackground(gradientDrawable2);
            ViewProxy.setOnClickListener(findViewById2, new k(inflate, maResult));
            View findViewById3 = inflate.findViewById(R.id.btn_scan_express);
            findViewById3.setBackground(gradientDrawable2);
            ViewProxy.setOnClickListener(findViewById3, new l(inflate, maResult));
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.btn_close);
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN019iypvt1bsfVo4ORaC_!!6000000003521-49-tps-144-144.webp");
            tUrlImageView.setOnClickListener(new m(inflate, maResult));
            ResultViewController resultViewController = this.g;
            if (resultViewController != null) {
                resultViewController.e(this.b, inflate, 1);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_PhotoSearchTake", 2201, "Page_PhotoSearchTake_Express-ChooseView", "", "", new HashMap(1)).build());
            }
            return false;
        }
        hvm hvmVar = this.f32351a;
        if (hvmVar != null) {
            hvmVar.startPreview();
        }
        return true;
    }

    public final void v(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac66a1b6", new Object[]{this, maResult});
            return;
        }
        String text = maResult.getText();
        Uri.Builder buildUpon = Uri.parse("pages/logistic/logistic").buildUpon();
        buildUpon.appendQueryParameter("appName", "TAOBAOMINIAPP").appendQueryParameter("mailNo", text).appendQueryParameter("from", "shoutaosaoyisao").appendQueryParameter("querySourceId", "68719484962");
        String builder = buildUpon.toString();
        Uri.Builder buildUpon2 = Uri.parse("https://m.duanqu.com/").buildUpon();
        buildUpon2.appendQueryParameter("_ariver_appid", "11509317").appendQueryParameter("query", "from=shoutaosaoyisao").appendQueryParameter("page", builder);
        if (!yoj.b(this.b, this.e).d(buildUpon2.toString())) {
            g(this, maResult);
        }
    }

    public final boolean z(ScancodeResult scancodeResult) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec83e09", new Object[]{this, scancodeResult})).booleanValue();
        }
        if (TextUtils.isEmpty(this.i.b())) {
            return false;
        }
        String b2 = this.i.b();
        if (!this.i.b().contains("?")) {
            str = b2 + "?";
        } else {
            str = b2 + "&";
        }
        rso.a(this.b.getApplicationContext(), str + "mActivityId=" + this.i.a() + "&type=" + this.i.g() + "&content=" + scancodeResult.code, this.e);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        r7 = tb.p1g.c(r7, r3, "b.tb.cn");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.taobao.scancode.gateway.util.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r8)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r6
            r8[r0] = r7
            r7 = 2
            r8[r7] = r3
            java.lang.String r7 = "d6d2e475"
            r2.ipc$dispatch(r7, r8)
            return
        L_0x001d:
            if (r7 == 0) goto L_0x002f
            java.lang.String r2 = "HTTPS"
            boolean r3 = r7.startsWith(r2)
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = "https"
            java.lang.String r7 = r7.replaceFirst(r2, r3)
            goto L_0x0040
        L_0x002f:
            if (r7 == 0) goto L_0x0040
            java.lang.String r2 = "HTTP"
            boolean r3 = r7.startsWith(r2)
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = "http"
            java.lang.String r7 = r7.replaceFirst(r2, r3)
        L_0x0040:
            com.taobao.orange.OrangeConfig r2 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r3 = ""
            java.lang.String r4 = "android_scancode_client"
            java.lang.String r5 = "host_switch_list"
            java.lang.String r2 = r2.getConfig(r4, r5, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x008b
            java.net.URL r3 = new java.net.URL     // Catch: Exception -> 0x0078
            r3.<init>(r7)     // Catch: Exception -> 0x0078
            java.lang.String r3 = r3.getHost()     // Catch: Exception -> 0x0078
            java.lang.String r4 = "\\|"
            java.lang.String[] r2 = r2.split(r4)     // Catch: Exception -> 0x0078
            int r4 = r2.length     // Catch: Exception -> 0x0078
        L_0x0065:
            if (r1 >= r4) goto L_0x008b
            r5 = r2[r1]     // Catch: Exception -> 0x0078
            boolean r5 = r5.equalsIgnoreCase(r3)     // Catch: Exception -> 0x0078
            if (r5 == 0) goto L_0x0076
            java.lang.String r0 = "b.tb.cn"
            java.lang.String r7 = tb.p1g.c(r7, r3, r0)     // Catch: Exception -> 0x0078
            goto L_0x008b
        L_0x0076:
            int r1 = r1 + r0
            goto L_0x0065
        L_0x0078:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " unsafe strCode :"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DecodeProcessor"
            tb.y7t.a(r1, r0)
        L_0x008b:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "comeFromType"
            java.lang.String r2 = "scan"
            r0.putString(r1, r2)
            boolean r1 = tb.rso.q()
            if (r1 == 0) goto L_0x00b6
            java.lang.String r8 = "code"
            r0.putString(r8, r7)
            androidx.fragment.app.FragmentActivity r7 = r6.b
            tb.nmd r8 = r6.e
            tb.yoj r7 = tb.yoj.b(r7, r8)
            tb.yoj r7 = r7.e(r0)
            java.lang.String r8 = "http://tb.cn/n/scancode/qr_result"
            r7.d(r8)
            goto L_0x00d2
        L_0x00b6:
            boolean r1 = com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter.c(r7)
            if (r1 == 0) goto L_0x00c5
            com.taobao.taobao.scancode.gateway.util.a$a r1 = new com.taobao.taobao.scancode.gateway.util.a$a
            r1.<init>(r0, r8)
            com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter.b(r7, r1)
            goto L_0x00d2
        L_0x00c5:
            com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter r1 = new com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter
            r1.<init>()
            com.taobao.taobao.scancode.gateway.util.a$b r2 = new com.taobao.taobao.scancode.gateway.util.a$b
            r2.<init>(r0, r8)
            r1.f(r7, r2)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobao.scancode.gateway.util.a.C(java.lang.String, boolean):void");
    }

    public final void m(ScancodeType scancodeType, Map<String, Object> map) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a0e9c", new Object[]{this, scancodeType, map});
            return;
        }
        String[] strArr = new String[map.size()];
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            i2++;
            strArr[i2] = entry.getKey() + "=" + entry.getValue();
        }
        String str = this.j;
        CT ct = CT.Button;
        TBS.Adv.ctrlClickedOnPage(str, ct, "Button-CodeRecognize-" + scancodeType.name(), strArr);
        HashMap hashMap = new HashMap(map);
        Object obj = map.get("spm-cnt");
        if (obj != null) {
            hashMap.put("spm", obj);
        }
        mzu.p(this.j, "Button-GotCode", hashMap);
        HashMap hashMap2 = new HashMap(hashMap.size());
        for (Map.Entry entry2 : hashMap.entrySet()) {
            hashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        mzu.h(this.j, "Button-GotCode", hashMap2);
    }

    public final boolean u(ScancodeResult scancodeResult) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ea5e3af", new Object[]{this, scancodeResult})).booleanValue();
        }
        if (scancodeResult != null && (str2 = scancodeResult.code) != null && str2.startsWith("{\"dynamicdeploy\":")) {
            JSONObject jSONObject = JSON.parseObject(scancodeResult.code).getJSONObject("dynamicdeploy");
            pkv.getInstance(Globals.getApplication()).triggerDynamicDeployment(jSONObject.getString("targetversion"), jSONObject.getString("url"));
            new Handler(Looper.getMainLooper()).post(new h());
            return true;
        } else if (scancodeResult == null || (str = scancodeResult.code) == null || !str.startsWith("{\"dynamicInstall\":")) {
            return false;
        } else {
            pkv.getInstance(Globals.getApplication()).triggerBundleDownload(JSON.parseObject(scancodeResult.code).getJSONObject("dynamicInstall").getString("url"));
            new Handler(Looper.getMainLooper()).post(new i());
            return true;
        }
    }

    public final boolean y(MaResult maResult, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f93aa92e", new Object[]{this, maResult, new Boolean(z)})).booleanValue();
        }
        String text = maResult.getText();
        Context applicationContext = this.b.getApplicationContext();
        xs0 xs0Var = new xs0(applicationContext);
        if (z && xs0Var.c(text, new n(text, maResult, applicationContext))) {
            return false;
        }
        if (p1g.d(text)) {
            if (!TextUtils.equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_white_list_for_important_activity", ""), "true") || ssw.g(text) || ssw.j(text)) {
                C(text, maResult instanceof AlbumMaResult);
                this.f32351a.stopPreview();
                return false;
            }
            TBMaterialDialog build = new TBMaterialDialog.Builder(this.b).build();
            build.setCancelable(true);
            build.setTitle(Localization.q(R.string.taobao_app_1007_1_18640));
            if (rso.h()) {
                str = Localization.q(R.string.taobao_app_1007_1_18642);
            } else {
                str = Localization.q(R.string.taobao_app_1007_1_18637) + text + Localization.q(R.string.taobao_app_1007_1_18638);
            }
            build.setContent(str);
            build.setCanceledOnTouchOutside(true);
            build.show();
            return true;
        } else if (GetQRMedicineUrlRequest.isQRMedicneCode(text)) {
            new GetQRMedicineUrlBussiness(new o(applicationContext), text).handleMedicine();
            return true;
        } else {
            this.f.f(this.b, maResult);
            return false;
        }
    }

    public final void B(MaResult maResult, String str) {
        HashMap<String, String> hashMap;
        String hiddenData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ac0858", new Object[]{this, maResult, str});
            return;
        }
        ScancodeType n2 = rso.n(maResult);
        if (n2 != null) {
            try {
                String text = maResult.getText();
                if (MaType.TB_ANTI_FAKE == maResult.getType() && (maResult instanceof MaTBAntiFakeResult)) {
                    MaTBAntiFakeResult maTBAntiFakeResult = (MaTBAntiFakeResult) maResult;
                    if (maTBAntiFakeResult.exist() && (hiddenData = maTBAntiFakeResult.getHiddenData()) != null) {
                        text = text + hiddenData;
                    }
                }
                String lowerCase = n2.name().toLowerCase(Locale.getDefault());
                if (maResult.getType() == MaType.GEN3) {
                    if (!TextUtils.isEmpty(text) && text.length() >= 3) {
                        if (TextUtils.equals(text.substring(0, 2), "0_")) {
                            lowerCase = "anti_fake";
                        } else {
                            lowerCase = "qr";
                        }
                    }
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                nmd nmdVar = this.e;
                if (nmdVar == null) {
                    hashMap = new HashMap<>(2);
                } else {
                    hashMap = nmdVar.a();
                }
                String str2 = hashMap.get("spm");
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                if (rso.l()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putAll(hashMap);
                    try {
                        str3 = URLEncoder.encode(jSONObject.toJSONString(), "utf-8");
                    } catch (Exception unused) {
                    }
                }
                HashMap hashMap2 = new HashMap(16);
                hashMap2.put("content", text);
                hashMap2.put("type", lowerCase);
                hashMap2.put("scanFrom", str);
                hashMap2.putAll(hashMap);
                hashMap2.put("spm-cnt", str2);
                hashMap2.put("utLogMap", str3);
                m(n2, hashMap2);
            } catch (Throwable unused2) {
            }
        }
    }

    public final void x(Context context, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41f60a4", new Object[]{this, context, maResult});
        } else if (maResult != null && !TextUtils.isEmpty(maResult.getText())) {
            String text = maResult.getText();
            if (TextUtils.equals(text.substring(0, 2), "2_") || TextUtils.equals(text.substring(0, 1), "=")) {
                Bundle bundle = new Bundle();
                bundle.putString("comeFromType", "scan");
                yoj.b(context, this.e).e(bundle).d("//s.tb.cn/o/0/".concat(text));
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("android_scancode_client", "gen3_domain", "");
            if (TextUtils.isEmpty(config)) {
                config = "//m.tb.cn/";
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("comeFromType", "scan");
            yoj e2 = yoj.b(context, this.e).e(bundle2);
            e2.d(config + text);
        }
    }

    public final void w(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8b6451", new Object[]{this, maResult});
            return;
        }
        String text = maResult.getText();
        HashMap hashMap = new HashMap(2);
        hashMap.put("querySourceId", "68719484962");
        o1g.b(this.b, text, "", "0", "0", "", "", "TAOSAOYISAO", "", JSON.toJSONString(hashMap), new f(maResult));
    }
}
