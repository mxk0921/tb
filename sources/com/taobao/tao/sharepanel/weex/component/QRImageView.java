package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.ShareQRCodeTask;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kp6;
import tb.oj8;
import tb.t2o;
import tb.xx4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class QRImageView extends WXComponent<ImageView> implements kp6.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap mBitmap;
    private kp6 mDataBinder;

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
            } else if (QRImageView.access$000(QRImageView.this) != null) {
                QRImageView.access$000(QRImageView.this).l(bitmap);
                QRImageView.access$000(QRImageView.this).m(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f12768a;

        public b(ImageView imageView) {
            this.f12768a = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f12768a.setImageBitmap(QRImageView.access$100(QRImageView.this));
            if (QRImageView.this.getEvents().contains("qrcodedrawsuccess")) {
                QRImageView.this.fireEvent("qrcodedrawsuccess", oj8.EMPTY_EVENT);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(666894587);
            t2o.a(985661647);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData});
            }
            return new QRImageView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    static {
        t2o.a(666894584);
        t2o.a(667942931);
    }

    public QRImageView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        xx4 xx4Var = new xx4(null);
        String optString = basicComponentData.getAttrs().optString("platform");
        String optString2 = basicComponentData.getAttrs().optString("qrType");
        boolean equals = TextUtils.equals("true", basicComponentData.getAttrs().optString("qr4ScanOnly"));
        if (equals) {
            this.mDataBinder = new kp6();
        } else {
            this.mDataBinder = ((WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel()).f12764a;
        }
        this.mDataBinder.a(this);
        xx4Var.e(optString, optString2, equals, new a());
    }

    public static /* synthetic */ kp6 access$000(QRImageView qRImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kp6) ipChange.ipc$dispatch("ca4a5991", new Object[]{qRImageView});
        }
        return qRImageView.mDataBinder;
    }

    public static /* synthetic */ Bitmap access$100(QRImageView qRImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ebf7f3c", new Object[]{qRImageView});
        }
        return qRImageView.mBitmap;
    }

    public static /* synthetic */ Object ipc$super(QRImageView qRImageView, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/component/QRImageView");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.mDataBinder = null;
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
        ImageView hostView = getHostView();
        if (hostView != null && (bitmap2 = this.mBitmap) != null && !bitmap2.isRecycled()) {
            hostView.post(new b(hostView));
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public ImageView initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a5b11369", new Object[]{this, context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Bitmap f = this.mDataBinder.f();
        this.mBitmap = f;
        if (f != null && !f.isRecycled()) {
            imageView.setImageBitmap(this.mBitmap);
        }
        return imageView;
    }
}
