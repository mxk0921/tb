package com.taobao.browser.jsbridge.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CameraActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAMERA_TYPE = "cameraType";
    public static final String MASK_HEIGHT = "maskHeight";
    public static final String MASK_URL = "maskUrl";
    public static final String MASK_WIDTH = "maskWidth";
    public static final String PATH = "path";
    public CameraController controller;

    static {
        t2o.a(619708555);
    }

    public static /* synthetic */ Object ipc$super(CameraActivity cameraActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/ui/CameraActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        CameraController cameraController = this.controller;
        if (cameraController != null) {
            cameraController.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.controller = new CameraController(this);
        if (extras != null) {
            this.controller.initData((String) extras.get("path"), (String) extras.get(CAMERA_TYPE), (String) extras.get(MASK_URL), (String) extras.get(MASK_WIDTH), (String) extras.get(MASK_HEIGHT));
        }
        setContentView(this.controller);
    }
}
