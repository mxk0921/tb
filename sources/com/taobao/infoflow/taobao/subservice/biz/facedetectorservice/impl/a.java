package com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.cw6;
import tb.e75;
import tb.fve;
import tb.get;
import tb.j3h;
import tb.jx8;
import tb.mx8;
import tb.t2o;
import tb.zb2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBLiveOpenCardView f10746a;
    public AutoSelectView b;
    public MNNCVExecutor c;
    public long e;
    public d f;
    public volatile String g;
    public FaceDetectorConfig i;
    public volatile boolean d = false;
    public final com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.b h = new com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.b();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0567a implements MNNCVExecutor.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0567a() {
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.g
        public void onResult(MRTRuntimeException mRTRuntimeException) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                return;
            }
            a aVar = a.this;
            if (mRTRuntimeException != null) {
                z = false;
            }
            a.d(aVar, z);
            if (mRTRuntimeException != null) {
                a.i(a.this, mRTRuntimeException.errorCode, mRTRuntimeException.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBLiveOpenCardView f10749a;
        public final /* synthetic */ j3h b;

        public c(TBLiveOpenCardView tBLiveOpenCardView, j3h j3hVar) {
            this.f10749a = tBLiveOpenCardView;
            this.b = j3hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.e(a.this, this.f10749a, this.b.s);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10750a;
        public TBLiveOpenCardView b;
        private final j3h c;
        private boolean d = true;

        static {
            t2o.a(491782339);
        }

        public d(String str, TBLiveOpenCardView tBLiveOpenCardView, JSONObject jSONObject) {
            this.f10750a = str;
            this.b = tBLiveOpenCardView;
            j3h e = a.a(a.this).e(str);
            this.c = e;
            e.c = System.currentTimeMillis();
            e.a(jSONObject);
        }

        public static /* synthetic */ j3h a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j3h) ipChange.ipc$dispatch("87ea5c31", new Object[]{dVar});
            }
            return dVar.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!a.b(a.this)) {
                a.f(a.this);
            }
            if (TextUtils.equals(this.f10750a, a.g(a.this))) {
                this.d = true ^ a.h(a.this, this, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private View f10751a;
        private j3h b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.a$e$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0568a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0568a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e.a(e.this).setScaleX(1.0f);
                e.a(e.this).setScaleY(1.0f);
            }
        }

        static {
            t2o.a(491782340);
        }

        public e(View view, j3h j3hVar) {
            this.f10751a = view;
            this.b = j3hVar;
        }

        public static /* synthetic */ View a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("f2e280fb", new Object[]{eVar});
            }
            return eVar.f10751a;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            j3h j3hVar = this.b;
            if (j3hVar != null) {
                j3hVar.b();
            }
            View view = this.f10751a;
            if (view != null && view.getScaleX() != 1.0f) {
                get.a().h(new RunnableC0568a());
            }
        }
    }

    static {
        t2o.a(491782335);
    }

    public static /* synthetic */ com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.b a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.b) ipChange.ipc$dispatch("342d95e7", new Object[]{aVar});
        }
        return aVar.h;
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a248dddc", new Object[]{aVar})).booleanValue();
        }
        return aVar.d;
    }

    public static /* synthetic */ FaceDetectorConfig c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectorConfig) ipChange.ipc$dispatch("26a3d7d5", new Object[]{aVar});
        }
        return aVar.i;
    }

    public static /* synthetic */ boolean d(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a520aebe", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.d = z;
        return z;
    }

    public static /* synthetic */ void e(a aVar, ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fc2ed3", new Object[]{aVar, viewGroup, rect});
        } else {
            aVar.m(viewGroup, rect);
        }
    }

    public static /* synthetic */ void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f43a59", new Object[]{aVar});
        } else {
            aVar.o();
        }
    }

    public static /* synthetic */ String g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc33ad06", new Object[]{aVar});
        }
        return aVar.g;
    }

    public static /* synthetic */ boolean h(a aVar, Runnable runnable, TBLiveOpenCardView tBLiveOpenCardView, j3h j3hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a70b09f", new Object[]{aVar, runnable, tBLiveOpenCardView, j3hVar, new Boolean(z)})).booleanValue();
        }
        return aVar.p(runnable, tBLiveOpenCardView, j3hVar, z);
    }

    public static /* synthetic */ void i(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594be06f", new Object[]{aVar, new Integer(i), str});
        } else {
            aVar.l(i, str);
        }
    }

    public static /* synthetic */ void j(a aVar, TBLiveOpenCardView tBLiveOpenCardView, j3h j3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b533df", new Object[]{aVar, tBLiveOpenCardView, j3hVar});
        } else {
            aVar.n(tBLiveOpenCardView, j3hVar);
        }
    }

    public static /* synthetic */ long k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfa3c1d4", new Object[]{aVar})).longValue();
        }
        return aVar.e;
    }

    public final void l(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9950fa", new Object[]{this, new Integer(i), str});
        } else {
            mx8.a(mx8.LIVE_ALGO_FAILURE_DETAIL, String.valueOf(i), str);
        }
    }

    public final void m(ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0183837", new Object[]{this, viewGroup, rect});
        } else if (viewGroup != null && rect != null) {
            AutoSelectView autoSelectView = this.b;
            if (autoSelectView == null) {
                AutoSelectView autoSelectView2 = new AutoSelectView(viewGroup.getContext(), rect);
                this.b = autoSelectView2;
                viewGroup.addView(autoSelectView2);
            } else if (autoSelectView.getParent() == null) {
                viewGroup.addView(this.b);
                this.b.setRect(rect);
            } else if (this.b.getParent() == viewGroup) {
                this.b.setRect(rect);
            } else {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
                viewGroup.addView(this.b);
                this.b.setRect(rect);
            }
        }
    }

    public final void n(TBLiveOpenCardView tBLiveOpenCardView, j3h j3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08b8258", new Object[]{this, tBLiveOpenCardView, j3hVar});
        } else if (j3hVar != null && tBLiveOpenCardView != null) {
            FaceDetectorConfig faceDetectorConfig = this.i;
            if (faceDetectorConfig != null && faceDetectorConfig.h() && cw6.b() && j3hVar.s != null) {
                get.a().h(new c(tBLiveOpenCardView, j3hVar));
            }
            FaceDetectorConfig faceDetectorConfig2 = this.i;
            if (faceDetectorConfig2 != null && faceDetectorConfig2.i()) {
                jx8.j(tBLiveOpenCardView, j3hVar);
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e726c74", new Object[]{this});
            return;
        }
        MNNCVExecutor mNNCVExecutor = new MNNCVExecutor("live_show_grounding_c");
        this.c = mNNCVExecutor;
        mNNCVExecutor.g(new C0567a());
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        if (this.f != null) {
            get.a().j(this.f);
        }
        this.f10746a = null;
        MNNCVExecutor mNNCVExecutor = this.c;
        if (mNNCVExecutor != null) {
            mNNCVExecutor.e();
            this.d = false;
        }
        r();
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        }
    }

    public void s(FaceDetectorConfig faceDetectorConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce237b1", new Object[]{this, faceDetectorConfig});
            return;
        }
        this.i = faceDetectorConfig;
        this.h.f(faceDetectorConfig.c());
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2230dafb", new Object[]{this});
            return;
        }
        d dVar = this.f;
        if (dVar != null && d.a(dVar) != null) {
            d.a(this.f).z = true;
        }
    }

    public void u(TBLiveOpenCardView tBLiveOpenCardView, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b16f226", new Object[]{this, tBLiveOpenCardView, jSONObject, jSONObject2});
        } else if (jx8.h()) {
            this.f10746a = tBLiveOpenCardView;
            if (tBLiveOpenCardView != null) {
                if (jSONObject == null) {
                    str = "";
                } else {
                    str = jSONObject.getString("sectionBizCode");
                }
                this.g = str;
                if (this.f != null) {
                    get.a().j(this.f);
                }
                this.h.f(this.i.c());
                this.f = new d(this.g, this.f10746a, jSONObject2);
                get.a().e(this.f);
            }
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d4d86c", new Object[]{this});
            return;
        }
        if (this.f != null) {
            get.a().j(this.f);
            get a2 = get.a();
            d dVar = this.f;
            a2.e(new e(dVar.b, d.a(dVar)));
            this.f = null;
        }
        r();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j3h f10748a;
        public final /* synthetic */ long b;
        public final /* synthetic */ TBLiveOpenCardView c;
        public final /* synthetic */ Bitmap d;
        public final /* synthetic */ Runnable e;

        public b(j3h j3hVar, long j, TBLiveOpenCardView tBLiveOpenCardView, Bitmap bitmap, Runnable runnable) {
            this.f10748a = j3hVar;
            this.b = j;
            this.c = tBLiveOpenCardView;
            this.d = bitmap;
            this.e = runnable;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else if (!TextUtils.equals(this.f10748a.d, a.g(a.this))) {
                a.i(a.this, 4001, mx8.LIVE_ALGO_FAILURE_BIZCODE_ERROR);
            } else {
                if (mRTRuntimeException != null) {
                    a.i(a.this, mRTRuntimeException.errorCode, mRTRuntimeException.getMessage());
                    this.f10748a.g++;
                } else {
                    mx8.a(mx8.LIVE_SINGLE_FRAME_DURATION, String.valueOf(System.currentTimeMillis() - this.b), "");
                    if (map == null || !TextUtils.equals(String.valueOf(map.get(UTConstant.Args.UT_PROPERTY_SUCCESS)), "1")) {
                        this.f10748a.g++;
                        a.i(a.this, 4002, mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
                    } else {
                        j3h j3hVar = this.f10748a;
                        j3hVar.l = j3hVar.f;
                        Object obj = map.get(UploadConstants.BIZ_CODE);
                        if (!(obj instanceof String)) {
                            a.i(a.this, 4001, mx8.LIVE_ALGO_FAILURE_NO_BIZCODE);
                            return;
                        } else if (!((String) obj).equals(a.g(a.this))) {
                            a.i(a.this, 4001, mx8.LIVE_ALGO_FAILURE_BIZCODE_ERROR);
                            return;
                        } else {
                            Rect e = jx8.e(map, this.c);
                            a.a(a.this).d(this.f10748a, e != null, e, this.d.getWidth(), this.d.getHeight(), this.c.getLeft(), this.c.getTop());
                            a.j(a.this, this.c, this.f10748a);
                            String valueOf = String.valueOf(System.currentTimeMillis() - a.k(a.this));
                            if (e == null) {
                                z = false;
                            }
                            mx8.a(mx8.LIVE_TOTAL_DURATION, valueOf, String.valueOf(z));
                        }
                    }
                }
                j3h j3hVar2 = this.f10748a;
                if (!j3hVar2.t && j3hVar2.f - j3hVar2.l < a.c(a.this).c().getDetectionContinuedErrorCloseThreshold()) {
                    get.a().g(this.e, this.f10748a.v);
                }
            }
        }
    }

    public final boolean p(Runnable runnable, TBLiveOpenCardView tBLiveOpenCardView, j3h j3hVar, boolean z) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10c6ca4c", new Object[]{this, runnable, tBLiveOpenCardView, j3hVar, new Boolean(z)})).booleanValue();
        }
        if (j3hVar == null) {
            fve.e("FaceDetectMission", "faceInfo is null");
            l(1100, "faceInfo is null");
            return false;
        } else if (!this.d) {
            fve.e("FaceDetectMission", "mnn引擎未初始化");
            j3hVar.A = "1101";
            return false;
        } else if (tBLiveOpenCardView == null) {
            fve.e("FaceDetectMission", "view is null");
            j3hVar.A = "1102";
            return false;
        } else if (this.c == null) {
            fve.e("FaceDetectMission", "mExecutor is null");
            j3hVar.A = "1103";
            return false;
        } else {
            this.e = System.currentTimeMillis();
            Bitmap d2 = jx8.d(tBLiveOpenCardView);
            if (d2 == null) {
                fve.e("FaceDetectMission", "cropBitmap is null");
                j3hVar.A = "1104";
                get.a().g(runnable, j3hVar.v);
                return false;
            } else if (!z || ((a2 = zb2.a(d2)) != null && a2.length >= d2.getWidth() * d2.getHeight() * 0.5d)) {
                Map<String, Object> b2 = jx8.b(d2, j3hVar.d);
                long currentTimeMillis = System.currentTimeMillis();
                j3hVar.f++;
                this.c.j(b2, new b(j3hVar, currentTimeMillis, tBLiveOpenCardView, d2, runnable));
                return true;
            } else {
                fve.e("FaceDetectMission", "cropBitmap size error");
                get.a().g(runnable, j3hVar.v);
                j3hVar.A = e75.VIDEO_NO_COPYRIGHT_CODE;
                return false;
            }
        }
    }
}
