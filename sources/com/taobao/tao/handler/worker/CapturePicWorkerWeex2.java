package com.taobao.tao.handler.worker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.TextureView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.share.ui.engine.render.b;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.share.ui.engine.weex.a;
import com.taobao.share.ui.engine.weex.c;
import com.taobao.tao.sharepanel.weex.component.ShareScrollViewView;
import org.json.JSONObject;
import tb.fwr;
import tb.q6x;
import tb.t2o;
import tb.upd;
import tb.whp;
import tb.yhp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CapturePicWorkerWeex2 extends yhp implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_TYPE_CODE = "code";
    public static final String CHANNEL_TYPE_PIC = "picture";
    public final WeexBizView b;
    public WeexInstance c;
    public WeexInstance d;
    public String e;
    public int f;
    public int g;
    public double h;
    public double i;
    public boolean l;
    public boolean j = false;
    public boolean k = false;
    public boolean m = false;
    public String n = null;
    public final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.taobao.tao.handler.worker.CapturePicWorkerWeex2.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/CapturePicWorkerWeex2$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            boolean m = CapturePicWorkerWeex2.this.m(intent.getStringExtra("data"));
            if (!CapturePicWorkerWeex2.this.k()) {
                CapturePicWorkerWeex2.d(CapturePicWorkerWeex2.this).b.g = m;
                CapturePicWorkerWeex2.g(CapturePicWorkerWeex2.this).j(context, null, CapturePicWorkerWeex2.e(CapturePicWorkerWeex2.this), CapturePicWorkerWeex2.f(CapturePicWorkerWeex2.this));
            }
        }
    };

    static {
        t2o.a(666894453);
        t2o.a(667942970);
    }

    public CapturePicWorkerWeex2(whp whpVar) {
        super(whpVar);
        b bVar = whpVar.b;
        this.b = bVar.d;
        bVar.f(this);
    }

    public static /* synthetic */ whp d(CapturePicWorkerWeex2 capturePicWorkerWeex2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("5492b0c7", new Object[]{capturePicWorkerWeex2});
        }
        return capturePicWorkerWeex2.f32102a;
    }

    public static /* synthetic */ boolean e(CapturePicWorkerWeex2 capturePicWorkerWeex2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b241c00a", new Object[]{capturePicWorkerWeex2})).booleanValue();
        }
        return capturePicWorkerWeex2.m;
    }

    public static /* synthetic */ String f(CapturePicWorkerWeex2 capturePicWorkerWeex2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46e9ffdb", new Object[]{capturePicWorkerWeex2});
        }
        return capturePicWorkerWeex2.n;
    }

    public static /* synthetic */ whp g(CapturePicWorkerWeex2 capturePicWorkerWeex2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("5f2999ca", new Object[]{capturePicWorkerWeex2});
        }
        return capturePicWorkerWeex2.f32102a;
    }

    public static /* synthetic */ Object ipc$super(CapturePicWorkerWeex2 capturePicWorkerWeex2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/CapturePicWorkerWeex2");
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97620cf", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    @Override // com.taobao.share.ui.engine.weex.a
    public Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("aaa87d19", new Object[]{this});
        }
        if (this.l) {
            return j();
        }
        try {
            return h(this.c, this.b.getMeasuredWidth(), this.b.getMeasuredHeight(), this.f, this.g, (int) this.h, (int) this.i);
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
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationContext()).unregisterReceiver(this.o);
        }
    }

    public final Bitmap h(WeexInstance weexInstance, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("65e5e7ae", new Object[]{this, weexInstance, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        if (weexInstance == null) {
            return null;
        }
        try {
            Bitmap bitmap = ((TextureView) ((q6x) weexInstance.getExtend(q6x.class)).getRenderView()).getBitmap();
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("CapturePicWorkerWeex2", "getBitmapFromView err:" + th.getMessage());
            return null;
        }
    }

    public Bitmap i(c.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fddbf38b", new Object[]{this, bVar, new Boolean(z)});
        }
        int i = this.f;
        double d = this.h;
        int i2 = (int) (i + d);
        int i3 = this.g;
        double d2 = this.i;
        return h(this.d, i2, (int) (i3 + d2), i, i3, (int) d, (int) d2);
    }

    public final Bitmap j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("200af835", new Object[]{this});
        }
        return i(null, false);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23739405", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationContext()).registerReceiver(this.o, new IntentFilter(TBWeexShare.ACTION_SAVE_SHARE_IMAGE));
        }
    }

    public boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d9f020", new Object[]{this, str})).booleanValue();
        }
        try {
            int measuredWidth = this.b.getMeasuredWidth();
            int measuredHeight = this.b.getMeasuredHeight();
            JSONObject jSONObject = new JSONObject(str);
            this.f = jSONObject.optInt("x");
            this.g = jSONObject.optInt("y");
            double optDouble = jSONObject.optDouble("w");
            this.h = optDouble;
            if (optDouble <= 1.0d) {
                this.h = measuredWidth * optDouble;
            }
            double optDouble2 = jSONObject.optDouble("h");
            this.i = optDouble2;
            if (optDouble2 <= 1.0d) {
                this.i = measuredHeight * optDouble2;
            }
            this.j = jSONObject.optBoolean("hideBottomTip");
            boolean optBoolean = jSONObject.optBoolean("imageShare");
            this.e = jSONObject.optString("scrollerRefName");
            this.k = jSONObject.optBoolean("prepareLastFrame");
            jSONObject.optString("imgBgColor");
            this.l = true ^ TextUtils.isEmpty(this.e);
            upd shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk("");
            if (shareWeexSdk != null) {
                this.c = shareWeexSdk.d();
            }
            this.d = ShareScrollViewView.wxsdkInstance;
            this.m = jSONObject.optBoolean("transparentWatermark");
            this.n = jSONObject.optString("shortUrl");
            return optBoolean;
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("CapturePicWorkerWeex2", "setSnapShotParams err:" + th.getMessage());
            return false;
        }
    }
}
