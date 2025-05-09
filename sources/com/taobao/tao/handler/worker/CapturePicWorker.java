package com.taobao.tao.handler.worker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.share.ui.engine.render.b;
import com.taobao.share.ui.engine.weex.a;
import com.taobao.share.ui.engine.weex.c;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.view.WXScrollView;
import java.util.Iterator;
import org.json.JSONObject;
import tb.fwr;
import tb.t2o;
import tb.whp;
import tb.yhp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CapturePicWorker extends yhp implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_TYPE_CODE = "code";
    public static final String CHANNEL_TYPE_PIC = "picture";
    public final VesselView b;
    public WXScrollView c;
    public String d;
    public int e;
    public int f;
    public double g;
    public boolean k;
    public String l;
    public double p;
    public boolean i = false;
    public boolean j = false;
    public final BroadcastReceiver m = new BroadcastReceiver() { // from class: com.taobao.tao.handler.worker.CapturePicWorker.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/CapturePicWorker$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            boolean k = CapturePicWorker.this.k(intent.getStringExtra("data"));
            if (!CapturePicWorker.this.i()) {
                CapturePicWorker.d(CapturePicWorker.this).b.g = k;
                CapturePicWorker.e(CapturePicWorker.this).i(context, null);
            }
        }
    };

    static {
        t2o.a(666894451);
        t2o.a(667942970);
    }

    public CapturePicWorker(whp whpVar) {
        super(whpVar);
        b bVar = whpVar.b;
        this.b = bVar.c;
        bVar.f(this);
    }

    public static /* synthetic */ whp d(CapturePicWorker capturePicWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("99008ff6", new Object[]{capturePicWorker});
        }
        return capturePicWorker.f32102a;
    }

    public static /* synthetic */ whp e(CapturePicWorker capturePicWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("518d5055", new Object[]{capturePicWorker});
        }
        return capturePicWorker.f32102a;
    }

    public static /* synthetic */ Object ipc$super(CapturePicWorker capturePicWorker, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/CapturePicWorker");
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97620cf", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("aaa87d19", new Object[]{this});
        }
        if (this.k) {
            return g();
        }
        try {
            return f(this.b, this.b.getMeasuredWidth(), this.b.getMeasuredHeight(), this.e, this.f, (int) this.g, (int) this.p);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8dc1543", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationContext()).unregisterReceiver(this.m);
        }
    }

    public final Bitmap f(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7481c97e", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        try {
            Bitmap.Config config = Bitmap.Config.RGB_565;
            if (i * i2 <= 41472000) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            Canvas canvas = new Canvas(createBitmap);
            if (!TextUtils.isEmpty(this.l)) {
                canvas.drawColor(Color.parseColor(this.l));
            }
            if (view == null) {
                return null;
            }
            view.draw(canvas);
            return Bitmap.createBitmap(createBitmap, i3, i4, i5, i6);
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("CapturePicWorker", "getBitmapFromView err:" + th.getMessage());
            return null;
        }
    }

    public final Bitmap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("200af835", new Object[]{this});
        }
        return h(null, false);
    }

    public Bitmap h(c.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fddbf38b", new Object[]{this, bVar, new Boolean(z)});
        }
        int i = (int) (this.e + this.g);
        int i2 = (int) (this.f + this.p);
        WXScrollView wXScrollView = this.c;
        if (wXScrollView != null && wXScrollView.getChildAt(0) != null && i == 0 && i2 == 0) {
            i = this.c.getChildAt(0).getMeasuredWidth();
            i2 = this.c.getChildAt(0).getMeasuredHeight();
            this.g = i;
            this.p = i2;
        }
        return f(this.c, i, i2, this.e, this.f, (int) this.g, (int) this.p);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23739405", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationContext()).registerReceiver(this.m, new IntentFilter(TBWeexShare.ACTION_SAVE_SHARE_IMAGE));
        }
    }

    public final void l(WXVContainer wXVContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343b0a58", new Object[]{this, wXVContainer});
        } else if (this.c == null) {
            for (int childCount = wXVContainer.getChildCount() - 1; childCount >= 0; childCount--) {
                WXComponent child = wXVContainer.getChild(childCount);
                if (TextUtils.equals(child.getBasicComponentData().getAttrs().optString("screenshot"), this.d)) {
                    this.c = (WXScrollView) child.getHostView().getInnerView();
                    return;
                }
                if (child instanceof WXVContainer) {
                    l((WXVContainer) child);
                }
            }
        }
    }

    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d9f020", new Object[]{this, str})).booleanValue();
        }
        try {
            int measuredWidth = this.b.getMeasuredWidth();
            int measuredHeight = this.b.getMeasuredHeight();
            JSONObject jSONObject = new JSONObject(str);
            this.e = jSONObject.optInt("x");
            this.f = jSONObject.optInt("y");
            double optDouble = jSONObject.optDouble("w");
            this.g = optDouble;
            if (optDouble <= 1.0d) {
                this.g = measuredWidth * optDouble;
            }
            double optDouble2 = jSONObject.optDouble("h");
            this.p = optDouble2;
            if (optDouble2 <= 1.0d) {
                this.p = measuredHeight * optDouble2;
            }
            this.i = jSONObject.optBoolean("hideBottomTip");
            boolean optBoolean = jSONObject.optBoolean("imageShare");
            this.d = jSONObject.optString("scrollerRefName");
            this.j = jSONObject.optBoolean("prepareLastFrame");
            this.l = jSONObject.optString("imgBgColor");
            boolean isEmpty = TextUtils.isEmpty(this.d);
            this.k = true ^ isEmpty;
            if (!isEmpty) {
                WXSDKInstance wXSDKInstance = null;
                this.c = null;
                VesselWeexView vesselWeexView = (VesselWeexView) this.b.getChildProxyView();
                vesselWeexView.setClipChildren(false);
                Iterator<WXSDKInstance> it = WXSDKManager.getInstance().getWXRenderManager().getAllInstances().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WXSDKInstance next = it.next();
                    if (next.getContainerView() == vesselWeexView.getChildView()) {
                        wXSDKInstance = next;
                        break;
                    }
                }
                if (wXSDKInstance != null) {
                    l((WXVContainer) wXSDKInstance.getRootComponent());
                }
            }
            return optBoolean;
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("CapturePicWorker", "setSnapShotParams err:" + th.getMessage());
            return false;
        }
    }
}
