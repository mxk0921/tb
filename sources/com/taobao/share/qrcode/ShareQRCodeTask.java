package com.taobao.share.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.ut.share.utils.ShareUtils;
import tb.blo;
import tb.bwr;
import tb.md8;
import tb.nd8;
import tb.r0u;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareQRCodeTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f11760a = new Handler(Looper.getMainLooper());
    public final Context b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.share.qrcode.ShareQRCodeTask$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11761a;
        public final /* synthetic */ a b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Bitmap d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.share.qrcode.ShareQRCodeTask$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                r0u.a(ShareQRCodeTask.a(ShareQRCodeTask.this), Localization.q(R.string.taobao_app_1010_1_18124));
                AnonymousClass1 r0 = AnonymousClass1.this;
                a aVar = r0.b;
                if (aVar != null) {
                    aVar.a(17, null, r0.c, r0.f11761a);
                }
            }
        }

        public AnonymousClass1(String str, a aVar, boolean z, Bitmap bitmap, int i, int i2) {
            this.f11761a = str;
            this.b = aVar;
            this.c = z;
            this.d = bitmap;
            this.e = i;
            this.f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                final long currentTimeMillis = System.currentTimeMillis();
                if (TextUtils.isEmpty(this.f11761a)) {
                    ShareQRCodeTask.b(ShareQRCodeTask.this).post(new a());
                    return;
                }
                EncodeCallback encodeCallback = new EncodeCallback() { // from class: com.taobao.share.qrcode.ShareQRCodeTask.1.2

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.share.qrcode.ShareQRCodeTask$1$2$a */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                    public class a implements Runnable {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public a() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            r0u.a(ShareQRCodeTask.a(ShareQRCodeTask.this), Localization.q(R.string.taobao_app_1010_1_18124));
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            a aVar = r0.b;
                            if (aVar != null) {
                                aVar.a(17, null, r0.c, r0.f11761a);
                            }
                        }
                    }

                    @Override // android.os.IInterface
                    public IBinder asBinder() {
                        return null;
                    }

                    @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
                    public void onError(EncodeError encodeError) {
                        TBS.Ext.commitEvent("Share_Exception", 19999, "qrcode", "err", Localization.q(R.string.taobao_app_1010_1_18132), encodeError.errorMessage);
                        ShareQRCodeTask.b(ShareQRCodeTask.this).post(new a());
                    }

                    @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
                    public void onSuccess(BitmapHolder bitmapHolder) throws RemoteException {
                        TLog.logi("ShareQRCodeScanView", "generateCode get QRcode success");
                        ShareQRCodeTask.b(ShareQRCodeTask.this).post(new b(bitmapHolder));
                    }

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.share.qrcode.ShareQRCodeTask$1$2$b */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                    public class b implements Runnable {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ BitmapHolder f11764a;

                        public b(BitmapHolder bitmapHolder) {
                            this.f11764a = bitmapHolder;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            int i = 0;
                            boolean z = true;
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            BitmapHolder bitmapHolder = this.f11764a;
                            if (!(bitmapHolder == null || bitmapHolder.encodeResult == null)) {
                                z = false;
                            }
                            if (z) {
                                r0u.a(ShareQRCodeTask.a(ShareQRCodeTask.this), Localization.q(R.string.taobao_app_1010_1_18124));
                            }
                            AnonymousClass1 r2 = AnonymousClass1.this;
                            a aVar = r2.b;
                            if (aVar == null) {
                                return;
                            }
                            if (z) {
                                aVar.a(17, null, r2.c, r2.f11761a);
                                return;
                            }
                            TBS.Ext.commitEvent("Share_Exception", 19999, "qrcode", "info", Localization.q(R.string.taobao_app_1010_1_18121));
                            AnonymousClass1 r22 = AnonymousClass1.this;
                            r22.b.a(16, this.f11764a.encodeResult, r22.c, r22.f11761a);
                            TBShareContent e = bwr.h().e();
                            if (e != null) {
                                if (!AnonymousClass1.this.c) {
                                    i = 3;
                                }
                                TBS.Ext.commitEvent("Page_Share", 19999, "QRCodeShow", null, null, e.businessId + "," + e.templateId + "," + AnonymousClass1.this.f11761a + "," + i + "," + ShareBizAdapter.getInstance().getLogin().getUserId());
                                StringBuilder sb = new StringBuilder();
                                sb.append(e.businessId);
                                sb.append(",");
                                sb.append(e.templateId);
                                sb.append(",");
                                sb.append(System.currentTimeMillis() - currentTimeMillis);
                                sb.append(",");
                                sb.append(z);
                                TBS.Ext.commitEvent("UT", 19999, "Page_Share-QRCodeShow", null, null, sb.toString());
                            }
                        }
                    }
                };
                if (!this.c) {
                    ShareQRCodeTask shareQRCodeTask = ShareQRCodeTask.this;
                    int i = 132;
                    if (shareQRCodeTask.d(ShareQRCodeTask.a(shareQRCodeTask), 50.0f) > 132) {
                        ShareQRCodeTask shareQRCodeTask2 = ShareQRCodeTask.this;
                        i = shareQRCodeTask2.d(ShareQRCodeTask.a(shareQRCodeTask2), 50.0f);
                    }
                    md8.c(ShareQRCodeTask.a(ShareQRCodeTask.this)).a(blo.g(false), this.f11761a, 3, new MaSizeType(0, 0, i), true, encodeCallback);
                } else if (this.d != null) {
                    nd8 c = nd8.c(ShareQRCodeTask.a(ShareQRCodeTask.this));
                    byte[] bmpToByteArray = ShareUtils.bmpToByteArray(this.d, false);
                    int width = this.d.getWidth();
                    int height = this.d.getHeight();
                    String str = this.f11761a;
                    int rowBytes = this.d.getRowBytes();
                    ShareQRCodeTask shareQRCodeTask3 = ShareQRCodeTask.this;
                    c.a(1, bmpToByteArray, width, height, str, rowBytes, 0, shareQRCodeTask3.d(ShareQRCodeTask.a(shareQRCodeTask3), this.e), 'Q', 0, encodeCallback, this.f);
                } else {
                    md8 c2 = md8.c(ShareQRCodeTask.a(ShareQRCodeTask.this));
                    String g = blo.g(true);
                    String str2 = this.f11761a;
                    ShareQRCodeTask shareQRCodeTask4 = ShareQRCodeTask.this;
                    c2.a(g, str2, 0, new MaSizeType(0, 0, shareQRCodeTask4.d(ShareQRCodeTask.a(shareQRCodeTask4), this.e)), false, encodeCallback);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(int i, Bitmap bitmap, boolean z, String str);
    }

    static {
        t2o.a(665845828);
    }

    public ShareQRCodeTask(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Context a(ShareQRCodeTask shareQRCodeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d78472ee", new Object[]{shareQRCodeTask});
        }
        return shareQRCodeTask.b;
    }

    public static /* synthetic */ Handler b(ShareQRCodeTask shareQRCodeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3fd1f4d1", new Object[]{shareQRCodeTask});
        }
        return shareQRCodeTask.f11760a;
    }

    public void c(String str, int i, int i2, Bitmap bitmap, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6aaea", new Object[]{this, str, new Integer(i), new Integer(i2), bitmap, aVar, new Boolean(z)});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new AnonymousClass1(str, aVar, z, bitmap, i2, i));
        }
    }

    public int d(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{this, context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
