package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.ner;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/TBPubKitUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "appId", "Landroid/graphics/Bitmap;", IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, "Ltb/xhv;", "jumpToTBHome", "(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "addFoot", "(Ljava/lang/String;)V", "Lcom/taobao/themis/pub_kit/utils/TBPubKitUtils$a;", "callback", "getHomeData", "(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/themis/pub_kit/utils/TBPubKitUtils$a;)V", "a", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBPubKitUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TBPubKitUtils INSTANCE = new TBPubKitUtils();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onResult(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ner.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f13745a;

        public b(a aVar) {
            this.f13745a = aVar;
        }

        @Override // tb.ner.c
        public final void onResult(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
            } else {
                this.f13745a.onResult(jSONObject);
            }
        }
    }

    static {
        t2o.a(845152396);
    }

    private TBPubKitUtils() {
    }

    @JvmStatic
    public static final void addFoot(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f6be00", new Object[]{str});
        } else {
            com.taobao.themis.pub_kit.foot.a.a(str);
        }
    }

    @JvmStatic
    public static final void getHomeData(Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e7a9e4", new Object[]{context, str, aVar});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "appId");
        ckf.g(aVar, "callback");
        ner.j(context, str, null, new b(aVar));
    }

    @JvmStatic
    public static final void jumpToTBHome(Context context, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51996d9", new Object[]{context, str, bitmap});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "appId");
        ner.q(context, str, false, false, bitmap, null, null, 96, null);
    }
}
