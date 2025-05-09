package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.ShareQRCodeTask;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import io.unicorn.plugin.platform.WeexPlatformView;
import tb.kp6;
import tb.oj8;
import tb.t2o;
import tb.xx4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class QRImageViewWeex2 extends WeexPlatformView implements kp6.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    private Bitmap mBitmap;
    private kp6 mDataBinder;
    public String mPlatform;
    public String mQrType;
    public Boolean mQr4ScanOnly = Boolean.FALSE;
    public ImageView mImageView = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ShareQRCodeTask.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.share.qrcode.ShareQRCodeTask.a
        public void a(int i, Bitmap bitmap, boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5840d252", new Object[]{this, new Integer(i), bitmap, new Boolean(z), str});
            } else if (QRImageViewWeex2.access$000(QRImageViewWeex2.this) != null) {
                QRImageViewWeex2.access$000(QRImageViewWeex2.this).l(bitmap);
                QRImageViewWeex2.access$000(QRImageViewWeex2.this).m(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f12770a;

        public b(ImageView imageView) {
            this.f12770a = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f12770a.setImageBitmap(QRImageViewWeex2.access$100(QRImageViewWeex2.this));
            QRImageViewWeex2.access$200(QRImageViewWeex2.this, "qrcodedrawsuccess", oj8.EMPTY_EVENT);
        }
    }

    static {
        t2o.a(666894588);
        t2o.a(667942931);
    }

    public QRImageViewWeex2(Context context, int i) {
        super(context, i);
        this.context = context;
    }

    public static /* synthetic */ kp6 access$000(QRImageViewWeex2 qRImageViewWeex2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kp6) ipChange.ipc$dispatch("72489376", new Object[]{qRImageViewWeex2});
        }
        return qRImageViewWeex2.mDataBinder;
    }

    public static /* synthetic */ Bitmap access$100(QRImageViewWeex2 qRImageViewWeex2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("79f03aff", new Object[]{qRImageViewWeex2});
        }
        return qRImageViewWeex2.mBitmap;
    }

    public static /* synthetic */ void access$200(QRImageViewWeex2 qRImageViewWeex2, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa5e266", new Object[]{qRImageViewWeex2, str, obj});
        } else {
            qRImageViewWeex2.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ Object ipc$super(QRImageViewWeex2 qRImageViewWeex2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/component/QRImageViewWeex2");
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.mImageView == null) {
            ImageView imageView = new ImageView(this.context);
            this.mImageView = imageView;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            Bitmap f = this.mDataBinder.f();
            this.mBitmap = f;
            if (f != null && !f.isRecycled()) {
                this.mImageView.setImageBitmap(this.mBitmap);
            }
        }
        return this.mImageView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        xx4 xx4Var = new xx4(null);
        if (this.mQr4ScanOnly.booleanValue()) {
            this.mDataBinder = new kp6();
        } else {
            this.mDataBinder = ((WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel()).f12764a;
        }
        this.mDataBinder.a(this);
        xx4Var.e(this.mPlatform, this.mQrType, this.mQr4ScanOnly.booleanValue(), new a());
    }

    @Override // tb.kp6.c
    public void onQrData(Bitmap bitmap) {
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697ac39d", new Object[]{this, bitmap});
            return;
        }
        this.mBitmap = bitmap;
        ImageView imageView = (ImageView) getView();
        if (imageView != null && (bitmap2 = this.mBitmap) != null && !bitmap2.isRecycled()) {
            imageView.post(new b(imageView));
        }
    }

    @WXComponentProp(name = "platform")
    public void setPlatform(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3a6bc6", new Object[]{this, str});
        } else {
            this.mPlatform = str;
        }
    }

    @WXComponentProp(name = "qr4ScanOnly")
    public void setQr4ScanOnly(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de07206b", new Object[]{this, str});
        } else if ("true".equals(str)) {
            this.mQr4ScanOnly = Boolean.TRUE;
        }
    }

    @WXComponentProp(name = "qrType")
    public void setQrType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c60dece", new Object[]{this, str});
        } else {
            this.mQrType = str;
        }
    }
}
