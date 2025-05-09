package com.taobao.android.weex.west;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import tb.acq;
import tb.dwh;
import tb.f4x;
import tb.fxh;
import tb.q6x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WestPageActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeexInstance f9931a;
    public WeexInstance b;
    public FrameLayout c;
    public String d;
    public TextView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f9932a;
        public final /* synthetic */ String b;
        public final /* synthetic */ f4x c;
        public final /* synthetic */ f4x d;

        public a(Bitmap bitmap, String str, f4x f4xVar, f4x f4xVar2) {
            this.f9932a = bitmap;
            this.b = str;
            this.c = f4xVar;
            this.d = f4xVar2;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                WestPageActivity.l3(this.f9932a, this.b, this.c, this.d);
            } else {
                f4x f4xVar = this.d;
                if (f4xVar != null) {
                    f4xVar.b(new Object[0]);
                }
            }
        }
    }

    static {
        t2o.a(982515981);
    }

    public static /* synthetic */ Object ipc$super(WestPageActivity westPageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/west/WestPageActivity");
        }
    }

    public static /* synthetic */ void l3(Bitmap bitmap, String str, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26bef7d", new Object[]{bitmap, str, f4xVar, f4xVar2});
        } else {
            v3(bitmap, str, f4xVar, f4xVar2);
        }
    }

    public static void u3(String str, q6x q6xVar, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8e503e", new Object[]{str, q6xVar, f4xVar, f4xVar2});
            return;
        }
        View renderView = q6xVar.getRenderView();
        if (renderView instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) renderView;
            Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(surfaceView, createBitmap, new a(createBitmap, str, f4xVar, f4xVar2), new Handler(Looper.getMainLooper()));
        } else if (renderView instanceof TextureView) {
            Bitmap bitmap = ((TextureView) renderView).getBitmap();
            if (bitmap != null) {
                v3(bitmap, str, f4xVar, f4xVar2);
            } else if (f4xVar2 != null) {
                f4xVar2.b(new Object[0]);
            }
        } else if (f4xVar2 != null) {
            f4xVar2.b(new Object[0]);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public boolean m3(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7be7266", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance == null) {
            return false;
        }
        View rootView = weexInstance.getRootView();
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis2, 0, f, f2, 0);
        MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis, uptimeMillis2 + 1, 1, f, f2, 0);
        rootView.dispatchTouchEvent(obtain);
        rootView.dispatchTouchEvent(obtain2);
        return true;
    }

    public final void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7a73a9", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout frameLayout2 = new FrameLayout(this);
        this.c = frameLayout2;
        frameLayout.addView(frameLayout2, -1, -1);
        TextView textView = new TextView(this);
        this.e = textView;
        textView.setText("WestPageActivity");
        this.e.setBackgroundColor(Color.argb(80, 0, 0, 255));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        frameLayout.addView(this.e, layoutParams);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c66914", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        String queryParameter = data.getQueryParameter("driverUrl");
        this.d = queryParameter;
        if (TextUtils.isEmpty(queryParameter)) {
            this.d = "https://dev.o.alicdn.com/weex/west-driver/index.js?weex_cache_disabled=true";
            data = data.buildUpon().appendQueryParameter("driverUrl", this.d).build();
        }
        WeexInstance a2 = b.a(this, data.toString(), WeexInstanceMode.SCRIPT, WeexRenderType.NONE, null, null);
        this.f9931a = a2;
        a2.initWithURL(this.d);
        this.f9931a.render(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        b.d().c(getApplication());
        setSupportActionBar(null);
        n3();
        o3();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WeexInstance weexInstance = this.f9931a;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
        WeexInstance weexInstance2 = this.b;
        if (weexInstance2 != null) {
            weexInstance2.destroy();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WeexInstance weexInstance = this.f9931a;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
        WeexInstance weexInstance2 = this.b;
        if (weexInstance2 != null) {
            weexInstance2.onActivityPause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        WeexInstance weexInstance = this.f9931a;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
        WeexInstance weexInstance2 = this.b;
        if (weexInstance2 != null) {
            weexInstance2.onActivityResume();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        WeexInstance weexInstance = this.f9931a;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
        }
        WeexInstance weexInstance2 = this.b;
        if (weexInstance2 != null) {
            weexInstance2.onActivityStart();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WeexInstance weexInstance = this.f9931a;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
        WeexInstance weexInstance2 = this.b;
        if (weexInstance2 != null) {
            weexInstance2.onActivityStop();
        }
    }

    public void p3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f688dc", new Object[]{this, jSONObject});
        } else {
            this.b.dispatchEvent(WeexEventTarget.WINDOW_TARGET, "westtestpage", b.e().b(jSONObject));
        }
    }

    public void q3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e64a9f", new Object[]{this, jSONObject});
        } else {
            this.f9931a.dispatchEvent(WeexEventTarget.WINDOW_TARGET, "westtestpage", b.e().b(jSONObject));
        }
    }

    public void r3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43520b4e", new Object[]{this, str});
        } else {
            this.e.setText(str);
        }
    }

    public void t3(String str, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7230239a", new Object[]{this, str, f4xVar, f4xVar2});
            return;
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            q6x q6xVar = (q6x) weexInstance.getExtend(q6x.class);
            if (q6xVar == null) {
                if (f4xVar2 != null) {
                    f4xVar2.b(new Object[0]);
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                u3(str, q6xVar, f4xVar, f4xVar2);
            } else if (f4xVar2 != null) {
                f4xVar2.b(new Object[0]);
            }
        } else if (f4xVar2 != null) {
            f4xVar2.b(new Object[0]);
        }
    }

    public static void v3(Bitmap bitmap, String str, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d3728", new Object[]{bitmap, str, f4xVar, f4xVar2});
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            if (f4xVar != null) {
                f4xVar.b(new Object[0]);
            }
            dwh.f("[West]", "write pic: " + str);
        } catch (IOException e) {
            if (f4xVar2 != null) {
                f4xVar2.b(new Object[0]);
            }
            dwh.i(e);
        }
    }

    public boolean s3(JSONObject jSONObject) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e54b69", new Object[]{this, jSONObject})).booleanValue();
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.destroy();
            this.b = null;
            this.c.removeAllViews();
        }
        String string = jSONObject.getString("bundleUrl");
        String string2 = jSONObject.getString("scriptUrl");
        JSONObject jSONObject2 = jSONObject.getJSONObject("initData");
        JSONArray jSONArray = jSONObject.getJSONArray("preExecute");
        Float f = jSONObject.getFloat("width");
        Float f2 = jSONObject.getFloat("height");
        WeexInstance a2 = b.a(this, string, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, null);
        this.b = a2;
        View rootView = a2.getRootView();
        if (f == null || f2 == null) {
            this.c.addView(rootView, -1, -1);
        } else {
            this.c.addView(rootView, (int) fxh.i(this, f.floatValue()), (int) fxh.i(this, f2.floatValue()));
        }
        if (TextUtils.isEmpty(string2)) {
            this.b.initWithEmpty();
        } else {
            this.b.initWithURL(string2);
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String string3 = jSONObject3.getString("url");
                Object obj = jSONObject3.get("script");
                if (obj instanceof byte[]) {
                    bArr = (byte[]) obj;
                } else if (obj instanceof String) {
                    bArr = ((String) obj).getBytes();
                }
                this.b.execute(bArr, string3);
            }
        }
        this.b.render(b.e().b(jSONObject2));
        return true;
    }
}
