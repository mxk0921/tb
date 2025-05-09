package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import java.io.File;
import tb.c5x;
import tb.d9x;
import tb.f2u;
import tb.g4w;
import tb.lor;
import tb.t2o;
import tb.uu7;
import tb.uyv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderWeexView extends VesselView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TBOrderWeexView.class.getSimpleName();
    private long mLoadStartTime;
    private String mMd5;
    private boolean mNeedValidateMd5;
    private c mOnLoadListener;
    private String mPageName;
    private String mUrl;
    private float rectRadius;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends uu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9131a;
        public final /* synthetic */ VesselType b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.order.bundle.widget.TBOrderWeexView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0472a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f9132a;

            public RunnableC0472a(String str) {
                this.f9132a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!d9x.a(TBOrderWeexView.this.getContext())) {
                    int i = "md5CheckFail".equals(this.f9132a) ? 3 : 2;
                    if (TBOrderWeexView.access$100(TBOrderWeexView.this) != null) {
                        TBOrderWeexView.access$100(TBOrderWeexView.this).d(a.this.f9131a, i, null);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends AsyncTask<Object, Object, String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ File f9133a;

            public b(File file) {
                this.f9133a = file;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/TBOrderWeexView$1$2");
            }

            /* renamed from: a */
            public String doInBackground(Object[] objArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("db0124f4", new Object[]{this, objArr});
                }
                String d = d9x.d(this.f9133a.getPath());
                if (d == null) {
                    d9x.b(this.f9133a.getPath());
                }
                return d;
            }

            /* renamed from: b */
            public void onPostExecute(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fe870167", new Object[]{this, str});
                } else if (!d9x.a(TBOrderWeexView.this.getContext())) {
                    if (str != null) {
                        if (TBOrderWeexView.access$100(TBOrderWeexView.this) != null) {
                            TBOrderWeexView.access$100(TBOrderWeexView.this).a(a.this.f9131a);
                        }
                        System.currentTimeMillis();
                        TBOrderWeexView.access$200(TBOrderWeexView.this);
                        a aVar = a.this;
                        TBOrderWeexView.this.loadData(aVar.b, str);
                    } else if (TBOrderWeexView.access$100(TBOrderWeexView.this) != null) {
                        TBOrderWeexView.access$100(TBOrderWeexView.this).d(a.this.f9131a, 4, null);
                    }
                }
            }
        }

        public a(String str, VesselType vesselType) {
            this.f9131a = str;
            this.b = vesselType;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/TBOrderWeexView$1");
        }

        @Override // tb.uu7
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            lor.d(TBOrderWeexView.access$000(), "WeexDownloader", "onFail", str, new String[0]);
            TBOrderWeexView.this.post(new RunnableC0472a(str));
        }

        @Override // tb.uu7
        public void d(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b6b55e2", new Object[]{this, file});
            } else if (!d9x.a(TBOrderWeexView.this.getContext())) {
                lor.d(TBOrderWeexView.access$000(), "WeexDownloader", "onSuccess", file.getName(), new String[0]);
                new b(file).execute(new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - TBOrderWeexView.access$200(TBOrderWeexView.this);
            if (TBOrderWeexView.access$100(TBOrderWeexView.this) != null) {
                TBOrderWeexView.access$100(TBOrderWeexView.this).b(TBOrderWeexView.access$300(TBOrderWeexView.this), currentTimeMillis);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        public static final int ERROR_DOWNLOAD_FILE_CODE = 2;
        public static final int ERROR_JSBUNDLE_ERROR_CODE = 5;
        public static final int ERROR_READ_FILE_CODE = 4;
        public static final int ERROR_URL_CODE = 1;
        public static final int ERROR_VALIDATE_MD5_CODE = 3;
        public static final int ERROR_VESSEL_LOAD_CODE = 7;
        public static final int ERROR_WEEX_OTHER_CODE = 8;
        public static final int ERROR_WEEX_SYNTAX_CODE = 6;

        void a(String str);

        void b(String str, long j);

        void c(String str);

        void d(String str, int i, String str2);
    }

    static {
        t2o.a(713031995);
    }

    public TBOrderWeexView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ c access$100(TBOrderWeexView tBOrderWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e0393c7b", new Object[]{tBOrderWeexView});
        }
        return tBOrderWeexView.mOnLoadListener;
    }

    public static /* synthetic */ long access$200(TBOrderWeexView tBOrderWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4907488", new Object[]{tBOrderWeexView})).longValue();
        }
        return tBOrderWeexView.mLoadStartTime;
    }

    public static /* synthetic */ String access$300(TBOrderWeexView tBOrderWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("936a206b", new Object[]{tBOrderWeexView});
        }
        return tBOrderWeexView.mUrl;
    }

    private void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
            return;
        }
        Rect rect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        float f = this.rectRadius;
        path.addRoundRect(new RectF(rect.left + 0.0f, rect.top + 0.0f, rect.right - 0.0f, rect.bottom - 0.0f), f, f, Path.Direction.CW);
        canvas.clipPath(path);
    }

    public static /* synthetic */ Object ipc$super(TBOrderWeexView tBOrderWeexView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == -1014233709) {
            super.onLoadFinish((View) objArr[0]);
            return null;
        } else if (hashCode == 912003601) {
            super.onLoadError((g4w) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/widget/TBOrderWeexView");
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        beforeDraw(canvas);
        super.draw(canvas);
    }

    @Override // com.taobao.vessel.VesselView, com.taobao.vessel.base.VesselBaseView, tb.ask
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        super.onLoadFinish(view);
        post(new b());
    }

    public void setOnLoadListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb557c76", new Object[]{this, cVar});
        } else {
            this.mOnLoadListener = cVar;
        }
    }

    public TBOrderWeexView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void loadCard(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3a64bb", new Object[]{this, str, str2, str3});
            return;
        }
        lor.c(TAG, "loadCard", "pageName =" + str, "url = " + str2, "md5 = " + str3);
        if (!this.mNeedValidateMd5) {
            str3 = null;
        } else if (TextUtils.isEmpty(str3)) {
            str3 = "NOT ALLOW EMPTY";
        }
        VesselType m = uyv.m(str2);
        if (m.equals(VesselType.Web)) {
            c cVar = this.mOnLoadListener;
            if (cVar != null) {
                cVar.d(str2, 1, null);
                return;
            }
            return;
        }
        this.mLoadStartTime = System.currentTimeMillis();
        this.mPageName = str;
        this.mUrl = str2;
        this.mMd5 = str3;
        c cVar2 = this.mOnLoadListener;
        if (cVar2 != null) {
            cVar2.c(str2);
        }
        new c5x(getContext().getApplicationContext(), str, str3, uyv.n(str2), new a(str2, m)).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // com.taobao.vessel.VesselView, com.taobao.vessel.base.VesselBaseView, tb.ask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLoadError(tb.g4w r5) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.order.bundle.widget.TBOrderWeexView.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "365c1211"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            super.onLoadError(r5)
            java.lang.String r1 = r5.b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = r5.b
            java.lang.String r3 = "createInstanceSyntaxError"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x002e
            r1 = 5
            goto L_0x003c
        L_0x002e:
            java.lang.String r1 = r5.b
            java.lang.String r3 = "callJSTypeError"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x003a
            r1 = 6
            goto L_0x003c
        L_0x003a:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x003c:
            if (r1 != r2) goto L_0x0043
            java.lang.String r5 = r5.b
            r1 = 8
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            com.taobao.android.order.bundle.widget.TBOrderWeexView$c r2 = r4.mOnLoadListener
            if (r2 == 0) goto L_0x004d
            java.lang.String r3 = r4.mUrl
            r2.d(r3, r1, r5)
        L_0x004d:
            java.lang.String r1 = com.taobao.android.order.bundle.widget.TBOrderWeexView.TAG
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = "onLoadError"
            tb.lor.d(r1, r2, r5, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.widget.TBOrderWeexView.onLoadError(tb.g4w):void");
    }

    public TBOrderWeexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNeedValidateMd5 = true;
        this.rectRadius = 12.0f;
        setWillNotDraw(false);
        setDowngradeEnable(false);
        this.rectRadius = f2u.f(getContext(), this.rectRadius);
    }
}
