package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.b;
import com.taobao.tao.sharepanel.weex.component.QRImageView;
import com.taobao.tao.sharepanel.weex.component.QRImageViewWeex2;
import com.taobao.tao.sharepanel.weex.component.ScreenShotView;
import com.taobao.tao.sharepanel.weex.component.ScreenShotViewWeex2;
import com.taobao.tao.sharepanel.weex.component.ScrollViewWeex2;
import com.taobao.tao.sharepanel.weex.component.ShareChannelView;
import com.taobao.tao.sharepanel.weex.component.ShareFriendView;
import com.taobao.tao.sharepanel.weex.component.ShareToolView;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.taobao.weex.ui.IFComponentHolder;
import com.taobao.weex.ui.SimpleComponentHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ComponentBridge";

    static {
        t2o.a(666894580);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1a5fd4", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ShareChannelView.class, new ShareChannelView.a()), false, "shareChannelView");
        } catch (WXException e) {
            e.printStackTrace();
            fwr.b(TAG, "initComponent ShareChannelView err " + e.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ShareFriendView.class, new ShareFriendView.a()), false, "shareFriendView");
        } catch (WXException e2) {
            e2.printStackTrace();
            fwr.b(TAG, "initComponent ShareFriendView err " + e2.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ShareToolView.class, new ShareToolView.a()), false, "shareToolView");
        } catch (WXException e3) {
            e3.printStackTrace();
            fwr.b(TAG, "initComponent ShareToolView err " + e3.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(QRImageView.class, new QRImageView.c()), false, "qrImageView");
            b.d().h("qrimageview", QRImageViewWeex2.class);
        } catch (WXException e4) {
            e4.printStackTrace();
            fwr.b(TAG, "initComponent ShareToolView err " + e4.getMessage());
        }
        try {
            WXSDKEngine.registerComponent((IFComponentHolder) new SimpleComponentHolder(ScreenShotView.class, new ScreenShotView.a()), false, "screenShotView");
            b.d().h("screenshotview", ScreenShotViewWeex2.class);
            b.d().h("sharescrollview", ScrollViewWeex2.class);
        } catch (WXException e5) {
            e5.printStackTrace();
            fwr.b(TAG, "initComponent ScreenShotView err " + e5.getMessage());
        }
    }
}
