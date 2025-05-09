package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SDKConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DATA = "data";
    public static final String KEY_HEADER = "header";
    public static final String KEY_METHOD = "method";
    public static final String KEY_URL = "url";
    public static final String METHOD_POST = "POST";
    public static final int MSG_ERR = -1;
    public static final int MSG_OK = 1;
    public static final String RESULT_CONTENT = "content";
    public static final String RESULT_KEY = "ret";

    /* renamed from: a  reason: collision with root package name */
    public WVCallBackContext f27240a;
    public final Context b = SDKConfig.getInstance().getGlobalContext();
    public final Handler c = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ByteArrayOutputStream f27242a;

        public b() {
            this.f27242a = new ByteArrayOutputStream();
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else {
                this.f27242a.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            Message obtainMessage = rb.a(rb.this).obtainMessage();
            Bundle bundle = new Bundle();
            try {
                if (finishEvent.getHttpCode() > 0) {
                    obtainMessage.what = 1;
                    bundle.putString("content", new String(this.f27242a.toByteArray(), "UTF-8"));
                } else {
                    obtainMessage.what = -1;
                }
            } catch (UnsupportedEncodingException unused) {
                TBSdkLog.e("ANetBridge", "ByteArray -> String Error");
            }
            bundle.putInt("status_code", finishEvent.getHttpCode());
            bundle.putString("status", finishEvent.getDesc());
            obtainMessage.setData(bundle);
            rb.a(rb.this).sendMessage(obtainMessage);
        }

        public /* synthetic */ b(rb rbVar, a aVar) {
            this();
        }
    }

    public static /* synthetic */ Handler a(rb rbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fa2ea7ea", new Object[]{rbVar});
        }
        return rbVar.c;
    }

    public static /* synthetic */ WVCallBackContext b(rb rbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("72bba378", new Object[]{rbVar});
        }
        return rbVar.f27240a;
    }

    public final RequestImpl c(String str) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestImpl) ipChange.ipc$dispatch("a420140a", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("method");
            RequestImpl requestImpl = new RequestImpl(string);
            requestImpl.setMethod(string2);
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string3 = optJSONObject.getString(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                        requestImpl.addHeader(next, string3);
                    }
                }
            }
            if ("POST".equals(string2)) {
                String string4 = jSONObject.getString("data");
                if (!StringUtils.isBlank(string4)) {
                    try {
                        bArr = string4.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                        bArr = null;
                    }
                    if (bArr != null) {
                        requestImpl.setBodyEntry(new ByteArrayEntry(bArr));
                    }
                }
            }
            return requestImpl;
        } catch (JSONException unused) {
            TBSdkLog.e("ANetBridge", "parseParams error, param=" + str);
            return null;
        }
    }

    public void d(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93822c35", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (TBSdkLog.isPrintLog()) {
            TBSdkLog.d("ANetBridge", "Send Params: " + str);
        }
        this.f27240a = wVCallBackContext;
        RequestImpl c = c(str);
        if (c == null) {
            this.c.sendEmptyMessage(-1);
        }
        new DegradableNetwork(this.b).asyncSend(c, null, null, new b(this, null));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mtop/wvplugin/ANetBridge$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            Bundle data = message.getData();
            nsw nswVar = new nsw();
            nswVar.b("status_code", String.valueOf(data.getInt("status_code", 0)));
            String string = data.getString("status");
            if (TextUtils.isEmpty(string)) {
                nswVar.b("status", string);
            }
            int i = message.what;
            if (i == -1) {
                nswVar.c(rb.RESULT_KEY, new JSONArray().put("HY_FAILED"));
                rb.b(rb.this).error(nswVar);
            } else if (i == 1) {
                nswVar.c(rb.RESULT_KEY, new JSONArray().put("HY_SUCCESS"));
                nswVar.b("content", data.getString("content"));
                rb.b(rb.this).success(nswVar);
            }
        }
    }
}
