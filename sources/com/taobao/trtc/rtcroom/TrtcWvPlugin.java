package com.taobao.trtc.rtcroom;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.SystemClock;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.FailedBinderCallBack;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.trtc.call.TrtcCallImpl;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.rtcroom.TrtcWvPlugin;
import com.taobao.trtc.rtcroom.c;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import tb.iu2;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.t4p;
import tb.vrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcWvPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PERMISSION_REQUEST_CODE_FOR_RTC_ROOM = 126;
    private static final int PERMISSION_REQUEST_CODE_FOR_RTC_ROOM_MAKE_CALL = 127;
    private static final String TAG = TrtcWvPlugin.class.getName();
    private WVCallBackContext mCallBack;
    private Runnable makeCallRunnable;

    static {
        t2o.a(395313629);
    }

    private boolean checkCallExist() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4abac31c", new Object[]{this})).booleanValue();
        }
        if (c.v() || !c.D().K()) {
            return false;
        }
        synchronized (c.D().x()) {
            if (c.D().G() != null) {
                z = true;
            }
        }
        return z;
    }

    private boolean checkEngineInitialized(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c668ba1f", new Object[]{this, str})).booleanValue();
        }
        if (c.D() != null && c.D().K()) {
            return true;
        }
        String str2 = TAG;
        TrtcLog.i(str2, "action: " + str + " | WvEngine is not initialized");
        return false;
    }

    private a floatWindow(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9d307141", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("floatWindow")) {
            return c.D().z(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a hangUp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e3573aa0", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("hangUp")) {
            return c.D().H(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    public static /* synthetic */ Object ipc$super(TrtcWvPlugin trtcWvPlugin, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1811143243:
                super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/rtcroom/TrtcWvPlugin");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeCall$2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0a7db2", new Object[]{this, jSONObject});
        } else {
            makeCall(jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notify2Js$0(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2239300", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        if (z) {
            String str3 = TAG;
            TrtcLog.j(str3, "<<<<<< Notify2JS(Main)|alive:" + this.isAlive + ", " + str + "|" + str2);
        }
        WVStandardEventCenter.postNotificationToJS(this.mWebView, str, str2);
    }

    private a muteAudio(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("316daa10", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("muteAudio")) {
            return c.D().N(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a requestPermission(ArrayList<Integer> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3d1aea02", new Object[]{this, arrayList, new Integer(i)});
        }
        a aVar = new a();
        Activity activity = getActivity();
        if (activity == null) {
            TrtcLog.i(TAG, "get activity null");
            return aVar.c(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == 1) {
                arrayList2.add("android.permission.RECORD_AUDIO");
            } else if (intValue == 2) {
                arrayList2.add(t4p.CAMERA);
            } else if (intValue == 4) {
                arrayList2.add("android.permission.READ_PHONE_STATE");
            }
        }
        if (arrayList2.size() == 0) {
            aVar.c(-103);
            return aVar;
        }
        ActivityCompat.requestPermissions(activity, (String[]) arrayList2.toArray(new String[0]), i);
        return aVar.c(200);
    }

    private a screenInteraction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("59a940e7", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("screenInteraction")) {
            return c.D().o0(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a switchPlayout(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("580d8d27", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("switchPlayout")) {
            return c.D().u0(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a updateFloatConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8cf99218", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("updateFloatWindowConfig")) {
            return c.D().v0(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    public void callBack2JS(String str, org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e22a397", new Object[]{this, str, jSONObject});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.d(str, jSONObject);
        nswVar.k();
        String str2 = TAG;
        TrtcLog.j(str2, "<<<<<< callback2JS | " + nswVar.m());
        WVCallBackContext wVCallBackContext = this.mCallBack;
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nswVar);
        }
    }

    public a checkPermission(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("70ac04a9", new Object[]{this, new Integer(i)});
        }
        a aVar = new a();
        aVar.c(200);
        if (i == 1) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.RECORD_AUDIO") != 0) {
                aVar.c(-105);
            }
        } else if (i == 2) {
            if (ContextCompat.checkSelfPermission(getContext(), t4p.CAMERA) != 0) {
                aVar.c(-104);
            }
        } else if (i == 4) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.READ_PHONE_STATE") != 0) {
                aVar.c(BSError.BSDIFF_NEW_FILE_OPEN_FAILED);
            }
        } else if (i == 5) {
            if (!PermissionActivity.e(getContext())) {
                aVar.c(BSError.BSDIFF_NEW_FILE_WRITE_FAILED);
            }
        } else if (i != 3) {
            aVar.c(-103);
        }
        return aVar;
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        String str = TAG;
        TrtcLog.j(str, "initialize");
        c.D().w0(this);
        if (checkCallExist()) {
            c.D().s0("initialize");
        } else {
            TrtcLog.h(str, "initialize::Call not exist");
        }
    }

    public void notify2Js(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba04e90d", new Object[]{this, str, jSONObject});
        } else {
            notify2Js(str, jSONObject, true);
        }
    }

    public void notifyError2Js(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ef462a", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        jSONObject.put("msg", (Object) str);
        notify2Js("onError", jSONObject);
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        String str = TAG;
        TrtcLog.j(str, "onDestroy");
        if (checkCallExist()) {
            c.D().q0("onDestroy");
        } else {
            TrtcLog.h(str, "onDestroy::Call not exist");
        }
        super.onDestroy();
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        String str = TAG;
        TrtcLog.j(str, "onPause, " + this);
        super.onPause();
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        String str = TAG;
        TrtcLog.j(str, "onResume, " + this);
        super.onResume();
    }

    public void sendResult(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385394b7", new Object[]{this, new Integer(i)});
        } else {
            sendResult(i, "");
        }
    }

    private void queryStats() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3d49be", new Object[]{this});
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (c.D() == null) {
                jSONObject.put("stats", 0);
            } else {
                synchronized (c.D().x()) {
                    if (!(!checkEngineInitialized("queryStats") || c.D().w() == null || c.D().G() == null)) {
                        c.g G = c.D().G();
                        if (G != null) {
                            jSONObject.put("stats", G.b.ordinal());
                            if (G.b == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                                jSONObject.put("duration", SystemClock.elapsedRealtime() - G.f13970a);
                            } else {
                                jSONObject.put("duration", 0);
                            }
                            jSONObject.put("remoteId", G.c);
                            jSONObject.put(FailedBinderCallBack.CALLER_ID, G.d);
                            jSONObject.put("muteMic", G.e);
                            jSONObject.put("mutePlayout", G.f);
                            jSONObject.put("playoutMode", G.g);
                            jSONObject.put("networkType", c.D().E());
                            jSONObject.put("floatWindow", c.D().C());
                            jSONObject.put("screenInteraction", c.D().F());
                        }
                    }
                    jSONObject.put("stats", 0);
                }
            }
            callBack2JS("callStats", jSONObject);
        } catch (Throwable unused) {
        }
    }

    private a sendData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cad9731b", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("sendData")) {
            return c.D().p0(jSONObject, 1);
        }
        return new a(-106, "uninitialized");
    }

    public void notify2Js(final String str, JSONObject jSONObject, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8698eb67", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        final String jSONString = jSONObject != null ? jSONObject.toJSONString() : "";
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: tb.ymu
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcWvPlugin.this.lambda$notify2Js$0(z, str, jSONString);
                }
            });
            return;
        }
        if (z) {
            String str2 = TAG;
            TrtcLog.j(str2, "<<<<<< Notify2JS|alive:" + this.isAlive + ", " + str + "|" + jSONString);
        }
        WVStandardEventCenter.postNotificationToJS(this.mWebView, str, jSONString);
    }

    public void sendResult(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a79ec1", new Object[]{this, new Integer(i), str});
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("code", i);
            if (TextUtils.isEmpty(str)) {
                if (i == -103) {
                    str = "invalid params";
                } else if (i != 200) {
                    str = "none";
                } else {
                    str = "success";
                }
            }
            jSONObject.put("msg", str);
            callBack2JS("result", jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f13954a;
        public String b;

        static {
            t2o.a(395313630);
        }

        public a() {
            this.f13954a = 200;
            this.b = "";
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4aecf810", new Object[]{aVar})).intValue();
            }
            return aVar.f13954a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("126e8124", new Object[]{aVar});
            }
            return aVar.b;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b29c721e", new Object[]{this, new Integer(i)});
            }
            if (i != 200) {
                c.D().y(i, "");
            }
            this.f13954a = i;
            return this;
        }

        public a d(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("341c4568", new Object[]{this, new Integer(i), str});
            }
            if (i != 200) {
                c.D().y(i, str);
            }
            this.f13954a = i;
            this.b = str;
            return this;
        }

        public a(int i, String str) {
            this.f13954a = i;
            this.b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermission$1(boolean z, Intent intent) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e443843c", new Object[]{this, new Boolean(z), intent});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("permissionType", (Object) 5);
        if (z) {
            i = 1;
        }
        jSONObject.put("result", (Object) Integer.valueOf(i));
        notify2Js("onRequestPermissionResult", jSONObject);
    }

    private void requestOverlayPermission(PermissionActivity.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc9998e", new Object[]{this, bVar});
            return;
        }
        try {
            TrtcLog.j(TAG, "start permission activity");
            PermissionActivity.l(bVar);
            Intent intent = new Intent(getContext(), PermissionActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_OVERLAY, true);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_OVERLAY_WITH_DIALOG, false);
            getContext().startActivity(intent);
        } catch (Exception e) {
            String str = TAG;
            TrtcLog.i(str, "start permission activity e: " + e.getMessage());
        }
    }

    private a makeCall(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f259d941", new Object[]{this, jSONObject});
        }
        if (!checkEngineInitialized("makeCall")) {
            return new a(-106, "uninitialized");
        }
        if (c.D().w().b) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (a.a(checkPermission(1)) != 200) {
                arrayList.add(1);
            }
            if (vrf.c(jSONObject.getJSONObject("callParams"), "callMode", 0) == 1 && a.a(checkPermission(2)) != 200) {
                arrayList.add(2);
            }
            if (!arrayList.isEmpty()) {
                synchronized (this) {
                    this.makeCallRunnable = new Runnable() { // from class: tb.zmu
                        @Override // java.lang.Runnable
                        public final void run() {
                            TrtcWvPlugin.this.lambda$makeCall$2(jSONObject);
                        }
                    };
                }
                return requestPermission(arrayList, 127);
            }
        }
        return c.D().M(jSONObject);
    }

    @Override // tb.kpw
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        String str = TAG;
        TrtcLog.j(str, "onRequestPermissionsResult: code: " + i + ", permission: " + Arrays.toString(strArr) + ", result: " + Arrays.toString(iArr));
        if (i == 126) {
            int length = strArr.length;
            int i4 = 0;
            while (i3 < length) {
                String str2 = strArr[i3];
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    i2 = 1;
                } else if (str2.equals(t4p.CAMERA)) {
                    i2 = 2;
                } else {
                    i4++;
                    i3++;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("permissionType", (Object) Integer.valueOf(i2));
                if (iArr[i4] == 0) {
                    jSONObject.put("result", (Object) 1);
                } else {
                    jSONObject.put("result", (Object) 2);
                }
                notify2Js("onRequestPermissionResult", jSONObject);
                i4++;
                i3++;
            }
        } else if (i == 127) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i3 < length2) {
                if (iArr[i3] != 0) {
                    synchronized (this) {
                        this.makeCallRunnable = null;
                    }
                    if (strArr[i5].equals("android.permission.RECORD_AUDIO")) {
                        notifyError2Js(-105, "audio permission deny");
                        return;
                    } else if (strArr[i5].equals(t4p.CAMERA)) {
                        notifyError2Js(-104, "video permission deny");
                        return;
                    } else {
                        return;
                    }
                } else {
                    i5++;
                    i3++;
                }
            }
            synchronized (this) {
                this.makeCallRunnable.run();
                this.makeCallRunnable = null;
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        char c = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str3 = TAG;
        TrtcLog.j(str3, ">>>>>> action: " + str + ", params: " + str2 + ", plugin: " + this);
        this.mCallBack = wVCallBackContext;
        try {
            a aVar = null;
            JSONObject parseObject = !TextUtils.isEmpty(str2) ? JSON.parseObject(str2) : null;
            switch (str.hashCode()) {
                case -1696811668:
                    if (str.equals("floatWindow")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1270090235:
                    if (str.equals("updateFloatWindowConfig")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224575315:
                    if (str.equals("hangUp")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -783779322:
                    if (str.equals("screenInteraction")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -179242825:
                    if (str.equals("queryStats")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 39996780:
                    if (str.equals("makeCall")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 686218487:
                    if (str.equals(iu2.CALENDAR_EVENT_PERMISSION_CHECK)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 746581438:
                    if (str.equals(TBRunTimePermission.REQUEST_PERMISSION_API_NAME)) {
                        break;
                    }
                    c = 65535;
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1132708157:
                    if (str.equals("muteAudio")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1246965586:
                    if (str.equals("sendData")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1262683590:
                    if (str.equals("switchPlayout")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1784465137:
                    if (str.equals("deInitialize")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    aVar = c.D().I(this, parseObject);
                    break;
                case 1:
                    c.u();
                    break;
                case 2:
                    aVar = checkPermission(parseObject);
                    break;
                case 3:
                    aVar = requestPermission(parseObject);
                    break;
                case 4:
                    queryStats();
                    break;
                case 5:
                    aVar = makeCall(parseObject);
                    break;
                case 6:
                    aVar = hangUp(parseObject);
                    break;
                case 7:
                    aVar = sendData(parseObject);
                    break;
                case '\b':
                    aVar = muteAudio(parseObject);
                    break;
                case '\t':
                    aVar = switchPlayout(parseObject);
                    break;
                case '\n':
                    aVar = floatWindow(parseObject);
                    break;
                case 11:
                    aVar = updateFloatConfig(parseObject);
                    break;
                case '\f':
                    aVar = screenInteraction(parseObject);
                    break;
                default:
                    TrtcLog.i(str3, "WvExecute action: " + str + " not implemented");
                    aVar = new a();
                    aVar.d(-101, "action not implemented");
                    break;
            }
            if (aVar != null) {
                sendResult(a.a(aVar), a.b(aVar));
            }
        } catch (Throwable th) {
            String str4 = "action: " + str + " exception: " + th.getMessage();
            TrtcLog.i(TAG, str4);
            this.mCallBack.error(str4);
        }
        return true;
    }

    private a checkPermission(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c91bd696", new Object[]{this, jSONObject});
        }
        a aVar = new a();
        if (jSONObject == null) {
            return aVar.c(-103);
        }
        return checkPermission(jSONObject.getIntValue("permissionType"));
    }

    private a requestPermission(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("aba7902f", new Object[]{this, jSONObject});
        }
        a aVar = new a();
        if (jSONObject == null) {
            return aVar.c(-103);
        }
        int intValue = jSONObject.getIntValue("permissionType");
        if (intValue == 5) {
            requestOverlayPermission(new PermissionActivity.b() { // from class: tb.anu
                @Override // com.taobao.trtc.impl.PermissionActivity.b
                public final void a(boolean z, Intent intent) {
                    TrtcWvPlugin.this.lambda$requestPermission$1(z, intent);
                }
            });
            return aVar;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(intValue));
        return requestPermission(arrayList, 126);
    }
}
