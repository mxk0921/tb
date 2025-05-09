package com.taobao.android.scancode.common.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.scancode.common.util.Scancode;
import tb.kpw;
import tb.nsw;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScancodeCallback extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAME_SCAN = "scan";
    public static final String ACTION_NAME_SCAN_FACE = "scanFace";
    public static final String PARAM_CODE = "code";
    public static final String PARAM_TYPE = "type";
    private static final String TAG = "scan_common_ScancodeCallback";
    private volatile Scancode scancode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Scancode.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9324a;

        public a(ScancodeCallback scancodeCallback, WVCallBackContext wVCallBackContext) {
            this.f9324a = wVCallBackContext;
        }

        @Override // com.taobao.android.scancode.common.util.Scancode.a
        public void a(ScancodeResult scancodeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f59040", new Object[]{this, scancodeResult});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("code", scancodeResult.code);
            ScancodeType scancodeType = scancodeResult.type;
            if (scancodeType != null) {
                nswVar.b("type", scancodeType.toString());
            }
            nswVar.b("url", scancodeResult.url);
            nswVar.b("detectResult", scancodeResult.detectResult);
            nswVar.b("resourceURL", scancodeResult.resourceURL);
            nswVar.k();
            v7t.d(ScancodeCallback.TAG, "scanResult:-- " + nswVar.m());
            this.f9324a.success(nswVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Scancode.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9325a;

        public b(ScancodeCallback scancodeCallback, WVCallBackContext wVCallBackContext) {
            this.f9325a = wVCallBackContext;
        }

        @Override // com.taobao.android.scancode.common.util.Scancode.a
        public void a(ScancodeResult scancodeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f59040", new Object[]{this, scancodeResult});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("code", scancodeResult.code);
            ScancodeType scancodeType = scancodeResult.type;
            if (scancodeType != null) {
                nswVar.b("type", scancodeType.toString());
            }
            nswVar.b("url", scancodeResult.url);
            nswVar.b("detectResult", scancodeResult.detectResult);
            nswVar.b("resourceURL", scancodeResult.resourceURL);
            nswVar.k();
            this.f9325a.success(nswVar.m());
        }
    }

    public static /* synthetic */ Object ipc$super(ScancodeCallback scancodeCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/scancode/common/jsbridge/ScancodeCallback");
        }
    }

    public Scancode checkScancodeIfExist(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scancode) ipChange.ipc$dispatch("6ac1e9a7", new Object[]{this, context});
        }
        if (this.scancode == null) {
            this.scancode = new Scancode(context);
        }
        return this.scancode;
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        v7t.i(TAG, "call initialize ~~~");
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        v7t.d(TAG, "onDestroy");
        if (this.scancode != null) {
            this.scancode.f();
            this.scancode = null;
        }
    }

    @WindVaneInterface
    public void scan(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c14d4b", new Object[]{this, wVCallBackContext, str});
            return;
        }
        v7t.d(TAG, "call scan");
        checkScancodeIfExist(this.mContext).g(new a(this, wVCallBackContext));
    }

    @WindVaneInterface
    public void scanFace(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9619108", new Object[]{this, wVCallBackContext, str});
        } else {
            checkScancodeIfExist(this.mContext).h(new b(this, wVCallBackContext), str, ScancodeType.FACE);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        v7t.d(TAG, "execute: action=" + str);
        if (str.equals("scan")) {
            scan(wVCallBackContext, str2);
            return true;
        } else if (!str.equals(ACTION_NAME_SCAN_FACE)) {
            return false;
        } else {
            scanFace(wVCallBackContext, str2);
            return true;
        }
    }
}
