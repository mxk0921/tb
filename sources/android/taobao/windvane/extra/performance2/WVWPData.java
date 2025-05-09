package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.og8;
import tb.t2o;
import tb.v7t;
import tb.x74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVWPData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = og8.b();
    public static final String REQUEST_HTML = "requestHtml";
    public static final String REQUEST_JS = "requestJs";
    public static final String RESPONSE_HTML = "responseHtml";
    public static final String RESPONSE_JS = "responseJs";
    private static final String TAG = "WVWPData";
    public long timeLoadurl;
    public boolean ucBkpg;
    public WeakReference<IWVWebView> webviewWeakRef;
    public String pageCurrentStatus = "";
    public String t2 = "0";
    public String realRenderType = "0";
    public String realGpuType = "0";
    public String initRenderType = "0";
    public String initGpuType = "0";
    public String progress = "0";
    public String probableReason = "";
    public String htmlError = "";
    public String jsError = "";
    public String stack = "";
    public String jsErrorCode = "";
    private int blockHtml = 0;
    private int blockJs = 0;
    private String historyStatus = "";

    static {
        t2o.a(989856015);
    }

    public WVWPData(IWVWebView iWVWebView) {
        this.webviewWeakRef = new WeakReference<>(iWVWebView);
    }

    private boolean isPreInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7f41d4", new Object[]{this})).booleanValue();
        }
        WeakReference<IWVWebView> weakReference = this.webviewWeakRef;
        if (weakReference == null) {
            return false;
        }
        try {
            IWVWebView iWVWebView = weakReference.get();
            if (iWVWebView instanceof IPerformance) {
                return ((IPerformance) iWVWebView).isPreInit();
            }
            return false;
        } catch (Throwable th) {
            v7t.d(TAG, x74.i(th));
            return false;
        }
    }

    public void addProbableReason(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab69ffe5", new Object[]{this, str});
        } else if (!isPreInit()) {
            this.probableReason += str + ";";
        } else {
            v7t.d(TAG, "isPreInit, abort addProbableReason " + str);
        }
    }

    public void setHtmlError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442264eb", new Object[]{this, new Integer(i), str});
            return;
        }
        String valueOf = String.valueOf(i);
        if (!isPreInit()) {
            this.htmlError = valueOf;
            v7t.d(TAG, "setHtmlError " + valueOf + " ,url:" + str);
            return;
        }
        v7t.d(TAG, "isPreInit, abort setHtmlError " + valueOf + " ,url:" + str);
    }

    public void setJsErrorCode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78345fdc", new Object[]{this, new Integer(i), str});
            return;
        }
        String valueOf = String.valueOf(i);
        if (!isPreInit()) {
            this.jsErrorCode = valueOf;
            v7t.d(TAG, "jsErrorCode " + valueOf + " ,url:" + str);
            return;
        }
        v7t.d(TAG, "isPreInit, abort set jsErrorCode " + valueOf + " ,url:" + str);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("WVWPData{ucBkpg=");
        sb.append(this.ucBkpg);
        sb.append(",pageCurrentStatus=");
        sb.append(this.pageCurrentStatus);
        sb.append(",probableReason=");
        sb.append(this.probableReason);
        sb.append(",htmlError=");
        sb.append(this.htmlError);
        sb.append(",jsErrorCode=");
        sb.append(this.jsErrorCode);
        sb.append(",jsError=");
        sb.append(this.jsError);
        sb.append(",stack=");
        sb.append(this.stack);
        sb.append(",t2=");
        sb.append(this.t2);
        sb.append(",realRenderType=");
        sb.append(this.realRenderType);
        sb.append(",initRenderType=");
        sb.append(this.initRenderType);
        sb.append(",realGpuType=");
        sb.append(this.realGpuType);
        sb.append(",initGpuType=");
        sb.append(this.initGpuType);
        sb.append(",progress=");
        sb.append(this.progress);
        if (DEBUG) {
            sb.append(",historyStatus=");
            sb.append(this.historyStatus);
        }
        sb.append("}");
        return sb.toString();
    }

    public void setPageCurrentStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e9ef4b", new Object[]{this, str});
            return;
        }
        if (DEBUG) {
            this.historyStatus += str + ";";
        }
        if (RESPONSE_HTML.equals(str)) {
            this.blockHtml--;
        }
        if (RESPONSE_JS.equals(str)) {
            this.blockJs--;
        }
        if (REQUEST_HTML.equals(str)) {
            this.blockHtml++;
            this.pageCurrentStatus = str;
        }
        if (REQUEST_JS.equals(str)) {
            this.blockJs++;
            this.pageCurrentStatus = str;
        }
        if (this.blockHtml <= 0 && this.blockJs <= 0) {
            this.pageCurrentStatus = str;
        }
    }
}
