package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.gtw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCNetworkDelegate implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHANGE_WEBVIEW_URL = 276;
    private static final int RECEIVE_RESPONSE_CODE = 274;
    private static final int REMOVE_WEBVIEW_CODE = 275;
    private static final int SEND_REQUEST_CODE = 273;
    private static final String TAG = "UCNetworkDelegate";
    private static UCNetworkDelegate instance = new UCNetworkDelegate();
    private ConcurrentHashMap<WeakReference<WVUCWebView>, String> mWebViewsInfoMap = new ConcurrentHashMap<>();
    private Handler mHandler = new WVThread("Windvane", this).getHandler();

    static {
        t2o.a(989856079);
    }

    private UCNetworkDelegate() {
    }

    private void assembleRequestData(Hashtable<String, String> hashtable, String str, String str2, WeakReference<WVUCWebView> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c810a37", new Object[]{this, hashtable, str, str2, weakReference});
            return;
        }
        WVUCWebView wVUCWebView = weakReference.get();
        if (wVUCWebView != null) {
            wVUCWebView.insertH5MonitorData(str, "url", TextUtils.isEmpty(str) ? "" : str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            wVUCWebView.insertH5MonitorData(str, "referrer", str2);
            wVUCWebView.insertH5MonitorData(str, "start", String.valueOf(Long.parseLong(hashtable.get("start")) - wVUCWebView.mPageStart));
        }
    }

    private void assembleResponseData(Hashtable<String, String> hashtable, String str, WeakReference<WVUCWebView> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317cc157", new Object[]{this, hashtable, str, weakReference});
            return;
        }
        WVUCWebView wVUCWebView = weakReference.get();
        if (wVUCWebView != null) {
            wVUCWebView.insertH5MonitorData(str, "statusCode", hashtable.get("statusCode"));
            wVUCWebView.insertH5MonitorData(str, "end", String.valueOf(Long.parseLong(hashtable.get("end")) - wVUCWebView.mPageStart));
        }
    }

    private void dealReceiveResponse(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980334db", new Object[]{this, obj});
        } else if (obj instanceof Hashtable) {
            Hashtable<String, String> hashtable = (Hashtable) obj;
            String h = gtw.h(gtw.j(hashtable.get("url")));
            Enumeration<WeakReference<WVUCWebView>> keys = this.mWebViewsInfoMap.keys();
            while (keys.hasMoreElements()) {
                WeakReference<WVUCWebView> nextElement = keys.nextElement();
                String str = this.mWebViewsInfoMap.get(nextElement);
                if (str != null && str.contains(h)) {
                    assembleResponseData(hashtable, h, nextElement);
                    return;
                }
            }
            Enumeration<WeakReference<WVUCWebView>> keys2 = this.mWebViewsInfoMap.keys();
            while (keys2.hasMoreElements()) {
                WeakReference<WVUCWebView> nextElement2 = keys2.nextElement();
                WVUCWebView wVUCWebView = nextElement2.get();
                if (wVUCWebView != null && wVUCWebView.containsH5MonitorData(h)) {
                    assembleResponseData(hashtable, h, nextElement2);
                    return;
                }
            }
        }
    }

    private void dealRemoveWebView(Object obj) {
        ConcurrentHashMap<WeakReference<WVUCWebView>, String> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e1f1cc", new Object[]{this, obj});
        } else if ((obj instanceof WVUCWebView) && (concurrentHashMap = this.mWebViewsInfoMap) != null) {
            Enumeration<WeakReference<WVUCWebView>> keys = concurrentHashMap.keys();
            while (keys.hasMoreElements()) {
                WeakReference<WVUCWebView> nextElement = keys.nextElement();
                WVUCWebView wVUCWebView = nextElement.get();
                if (wVUCWebView != null && obj.equals(wVUCWebView)) {
                    this.mWebViewsInfoMap.remove(nextElement);
                    return;
                }
            }
        }
    }

    private void dealSendRequest(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3afc3e", new Object[]{this, obj});
        } else if (obj instanceof Hashtable) {
            Hashtable<String, String> hashtable = (Hashtable) obj;
            String h = gtw.h(gtw.j(hashtable.get("url")));
            String j = gtw.j(hashtable.get("referrer"));
            if (!TextUtils.isEmpty(j)) {
                if (this.mWebViewsInfoMap.containsValue(j)) {
                    Enumeration<WeakReference<WVUCWebView>> keys = this.mWebViewsInfoMap.keys();
                    while (keys.hasMoreElements()) {
                        WeakReference<WVUCWebView> nextElement = keys.nextElement();
                        if (nextElement.get() != null && this.mWebViewsInfoMap.get(nextElement).equals(j)) {
                            assembleRequestData(hashtable, h, j, nextElement);
                            return;
                        }
                    }
                    return;
                }
                Enumeration<WeakReference<WVUCWebView>> keys2 = this.mWebViewsInfoMap.keys();
                while (keys2.hasMoreElements()) {
                    WeakReference<WVUCWebView> nextElement2 = keys2.nextElement();
                    if (nextElement2.get() != null && nextElement2.get().containsH5MonitorData(j)) {
                        assembleRequestData(hashtable, h, j, nextElement2);
                        return;
                    }
                }
            } else if (this.mWebViewsInfoMap.containsValue(h)) {
                Enumeration<WeakReference<WVUCWebView>> keys3 = this.mWebViewsInfoMap.keys();
                while (keys3.hasMoreElements()) {
                    WeakReference<WVUCWebView> nextElement3 = keys3.nextElement();
                    nextElement3.get();
                    if (nextElement3.get() != null && this.mWebViewsInfoMap.get(nextElement3).equals(h)) {
                        assembleRequestData(hashtable, h, j, nextElement3);
                        return;
                    }
                }
            }
        }
    }

    private void dealUrlChange(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c790b56", new Object[]{this, obj});
        } else if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            if ((arrayList.get(0) instanceof WVUCWebView) && (arrayList.get(1) instanceof String)) {
                WVUCWebView wVUCWebView = (WVUCWebView) arrayList.get(0);
                String h = gtw.h(gtw.j((String) arrayList.get(1)));
                Enumeration<WeakReference<WVUCWebView>> keys = this.mWebViewsInfoMap.keys();
                while (keys.hasMoreElements()) {
                    WeakReference<WVUCWebView> nextElement = keys.nextElement();
                    WVUCWebView wVUCWebView2 = nextElement.get();
                    if (wVUCWebView2 != null && wVUCWebView.equals(wVUCWebView2)) {
                        wVUCWebView2.clearH5MonitorData();
                        this.mWebViewsInfoMap.put(nextElement, h);
                        return;
                    }
                }
                this.mWebViewsInfoMap.put(new WeakReference<>(wVUCWebView), h);
            }
        }
    }

    public static synchronized UCNetworkDelegate getInstance() {
        synchronized (UCNetworkDelegate.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UCNetworkDelegate) ipChange.ipc$dispatch("a1bd8f8c", new Object[0]);
            }
            return instance;
        }
    }

    public String getBizCodeByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c8e1c21", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Enumeration<WeakReference<WVUCWebView>> keys = this.mWebViewsInfoMap.keys();
        while (keys.hasMoreElements()) {
            WeakReference<WVUCWebView> nextElement = keys.nextElement();
            WVUCWebView wVUCWebView = nextElement.get();
            if (wVUCWebView != null && str.equals(gtw.i(this.mWebViewsInfoMap.get(nextElement)))) {
                v7t.i(TAG, "Get bizCode : " + wVUCWebView.bizCode);
                return wVUCWebView.bizCode;
            }
        }
        return "";
    }

    public ConcurrentHashMap<WeakReference<WVUCWebView>, String> getWebViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("706b2a8f", new Object[]{this});
        }
        return this.mWebViewsInfoMap;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 273:
                dealSendRequest(message.obj);
                break;
            case 274:
                dealReceiveResponse(message.obj);
                break;
            case 275:
                dealRemoveWebView(message.obj);
            case 276:
                dealUrlChange(message.obj);
                break;
        }
        return false;
    }

    public void onFinish(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c0a94", new Object[]{this, new Integer(i), str});
        } else if (this.mWebViewsInfoMap != null && str != null) {
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = 274;
            Hashtable hashtable = new Hashtable();
            hashtable.put("url", str);
            String valueOf = String.valueOf(i);
            hashtable.put("statusCode", valueOf);
            hashtable.put("end", String.valueOf(System.currentTimeMillis()));
            obtainMessage.obj = hashtable;
            v7t.a(TAG, "onFinish : " + str + " statusCode: " + valueOf);
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    public void onSendRequest(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3cb0e0", new Object[]{this, map, str});
        } else if (this.mWebViewsInfoMap != null && map != null && str != null) {
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = 273;
            Hashtable hashtable = new Hashtable();
            hashtable.put("url", str);
            String str2 = map.get(HttpConstant.REFERER);
            hashtable.put("referrer", TextUtils.isEmpty(str2) ? "" : str2);
            hashtable.put("start", String.valueOf(System.currentTimeMillis()));
            obtainMessage.obj = hashtable;
            v7t.a(TAG, "onSendRequest : " + str + " Referer: " + str2);
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    public void onUrlChange(WVUCWebView wVUCWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ddf152", new Object[]{this, wVUCWebView, str});
            return;
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = 276;
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVUCWebView);
        arrayList.add(str);
        obtainMessage.obj = arrayList;
        this.mHandler.sendMessage(obtainMessage);
    }

    public void removeWebview(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29cde3d", new Object[]{this, wVUCWebView});
            return;
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = 275;
        obtainMessage.obj = wVUCWebView;
        this.mHandler.sendMessage(obtainMessage);
    }
}
