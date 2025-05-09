package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.security.wukong.config.Algo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.downgrade.a;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.util.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lm2 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int b = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23405a = false;

    static {
        t2o.a(619708621);
        t2o.a(578814049);
    }

    public static synchronized void c() {
        synchronized (lm2.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57e66df", new Object[0]);
            } else {
                b++;
            }
        }
    }

    public static synchronized void e() {
        synchronized (lm2.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a869c3b", new Object[0]);
            } else {
                b--;
            }
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "BrowserFragmentProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        return d(intent, zmjVar.d());
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean a(String str) {
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("839fce38", new Object[]{this, str})).booleanValue();
        }
        fm2.b().c();
        fm2.b();
        gm2 gm2Var = fm2.commonConfig;
        if (!TextUtils.isEmpty(gm2Var.g)) {
            fm2.b();
            if (str.matches(gm2Var.g)) {
                try {
                    Uri parse = Uri.parse(str);
                    if (parse.getBooleanQueryParameter(vms.PROTOCOL_BIZ_CODE_PHA, false)) {
                        v7t.d("BFProcessor", "pha, abort");
                        y71.commitFail("BFProcessorAbort", 2, vms.PROTOCOL_BIZ_CODE_PHA, str);
                        return true;
                    }
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    if (queryParameterNames != null && queryParameterNames.contains("pha_manifest")) {
                        v7t.d("BFProcessor", "pha_manifest, abort");
                        y71.commitFail("BFProcessorAbort", 2, "pha_manifest", str);
                        return true;
                    } else if (!slo.VALUE_YES.equalsIgnoreCase(parse.getQueryParameter("disableNav")) && !"true".equalsIgnoreCase(parse.getQueryParameter("disableNav"))) {
                        v7t.d("BFProcessor", "not disableNav, abort");
                        y71.commitFail("BFProcessorAbort", 3, "disableNav", str);
                        return true;
                    } else if (!parse.getBooleanQueryParameter("status_bar_transparent", false)) {
                        v7t.d("BFProcessor", "not status_bar_transparent, abort");
                        y71.commitFail("BFProcessorAbort", 4, "status_bar_transparent", str);
                        return true;
                    } else if ("1".equals(parse.getQueryParameter(Algo.ALGO_TYPE_CPP))) {
                        v7t.d("BFProcessor", "cpp, abort");
                        y71.commitFail("BFProcessor", 1, Algo.ALGO_TYPE_CPP, str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("hybrid", false)) {
                        v7t.d("BFProcessor", "hybrid, abort");
                        y71.commitFail("BFProcessor", 2, "hybrid", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("forceAllH5", false)) {
                        v7t.d("BFProcessor", "forceAllH5, abort");
                        y71.commitFail("BFProcessor", 3, "forceAllH5", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("landscape", false)) {
                        v7t.d("BFProcessor", "landscape, abort");
                        y71.commitFail("BFProcessor", 4, "landscape", str);
                        return true;
                    } else {
                        try {
                            if (parse.getBooleanQueryParameter("wvUseSysWebView", false)) {
                                v7t.d("BFProcessor", "wvUseSysWebView, abort");
                                y71.commitFail("BFProcessor", 5, "wvUseSysWebView", str);
                                return true;
                            } else if (!parse.getBooleanQueryParameter("alloweWebViewHistoryBack", true)) {
                                v7t.d("BFProcessor", "alloweWebViewHistoryBack, abort");
                                y71.commitFail("BFProcessor", 6, "alloweWebViewHistoryBack", str);
                                return true;
                            } else if (parse.getBooleanQueryParameter("disallowback", false)) {
                                v7t.d("BFProcessor", "disallowback, abort");
                                y71.commitFail("BFProcessor", 7, "disallowback", str);
                                return true;
                            } else if (!parse.getBooleanQueryParameter("SAVE_FORMAT_DATA", true)) {
                                v7t.d("BFProcessor", "SAVE_FORMAT_DATA, abort");
                                y71.commitFail("BFProcessor", 8, "SAVE_FORMAT_DATA", str);
                                return true;
                            } else if (parse.getBooleanQueryParameter("waitUCPrepared", false)) {
                                v7t.d("BFProcessor", "waitUCPrepared, abort");
                                y71.commitFail("BFProcessor", 9, "waitUCPrepared", str);
                                return true;
                            } else if (parse.getBooleanQueryParameter("isPostUrl", false)) {
                                v7t.d("BFProcessor", "isPostUrl, abort");
                                y71.commitFail("BFProcessor", 10, "isPostUrl", str);
                                return true;
                            } else if (parse.getBooleanQueryParameter("hasCustomButton", false)) {
                                v7t.d("BFProcessor", "hasCustomButton, abort");
                                y71.commitFail("BFProcessor", 11, "hasCustomButton", str);
                                return true;
                            } else if (!TextUtils.isEmpty(parse.getQueryParameter(Constants.MYBROWSERTITLE))) {
                                v7t.d("BFProcessor", "myBrowserTitle, abort");
                                y71.commitFail("BFProcessor", 12, Constants.MYBROWSERTITLE, str);
                                return true;
                            } else if (parse.getBooleanQueryParameter(Constants.MYBROWSERHIDETITLE, false)) {
                                v7t.d("BFProcessor", "myBrowserHideTitle, abort");
                                y71.commitFail("BFProcessor", 13, Constants.MYBROWSERHIDETITLE, str);
                                return true;
                            } else if (!TextUtils.isEmpty(parse.getQueryParameter("customtitle"))) {
                                v7t.d("BFProcessor", "customtitle, abort");
                                y71.commitFail("BFProcessor", 14, "customtitle", str);
                                return true;
                            } else if (parse.getBooleanQueryParameter("is_refund_order_url", false)) {
                                v7t.d("BFProcessor", "is_refund_order_url, abort");
                                y71.commitFail("BFProcessor", 15, "is_refund_order_url", str);
                                return true;
                            } else if (parse.getBooleanQueryParameter("disableScreenShot", false)) {
                                v7t.d("BFProcessor", "disableScreenShot, abort");
                                y71.commitFail("BFProcessor", 16, "disableScreenShot", str);
                                return true;
                            } else if (TextUtils.isEmpty(parse.getQueryParameter(a.HARDWARE))) {
                                return false;
                            } else {
                                v7t.d("BFProcessor", "hardware, abort");
                                y71.commitFail("BFProcessor", 17, a.HARDWARE, str);
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            v7t.d("BFProcessor", "parse uri failed " + th);
                            y71.commitFail("BFProcessor", 18, "parse uri failed", th + " url==" + str);
                            return true;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        v7t.d("BFProcessor", "not match url, abort");
        StringBuilder sb = new StringBuilder("not match ");
        fm2.b();
        sb.append(gm2Var.g);
        y71.commitFail("BFProcessorAbort", 1, sb.toString(), str);
        return true;
    }

    public final String b(Context context, String str) {
        Throwable th;
        Exception e;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e72cc6b", new Object[]{this, context, str});
        }
        this.f23405a = false;
        if (!BrowserUtil.s(context) || !new File("/data/local/tmp/.meetinghook").exists()) {
            return str;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/data/local/tmp/.meetinghook"))));
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null && readLine.trim().length() > 0) {
                            String trim = readLine.trim();
                            if (!TextUtils.isEmpty(trim)) {
                                try {
                                    this.f23405a = true;
                                    v7t.d("BFProcessor", "meetinghook url=" + trim);
                                    str = trim;
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = trim;
                                    bufferedReader = bufferedReader;
                                    e.printStackTrace();
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    return str2;
                                }
                            }
                        }
                        try {
                            bufferedReader.close();
                            return str;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            return str;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        str2 = str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                str2 = str;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean d(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ec10bc", new Object[]{this, intent, context})).booleanValue();
        }
        try {
            if (nx9.n(context, "BrowserFragmentCountLimit")) {
                synchronized (this) {
                    if (b > 0) {
                        v7t.d("BFProcessor", "instanceCount limit " + b);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            v7t.d("BFProcessor", "error:" + th);
            th.printStackTrace();
            y71.commitFail("BFProcessor", 0, "nav Process error", th.toString() + " trace::" + x74.i(th));
        }
        if (!nx9.q(context)) {
            v7t.d("BFProcessor", "FragmentSwitch FragmentModel is not Open");
            return true;
        }
        if (!nx9.n(context, "BrowserFragment")) {
            v7t.d("BFProcessor", "FragmentSwitch BrowserFragment is not Open");
            int b2 = qp0.b();
            if (!nx9.n(context, "BrowserFragment_deviceLevel_" + b2)) {
                v7t.d("BFProcessor", "FragmentSwitch BrowserFragment_deviceLevel_" + b2 + " is not Open");
                return true;
            }
        }
        String b3 = b(context, intent.getDataString());
        v7t.d("BFProcessor", "BrowserFragmentProcessor process url=" + b3);
        if (TextUtils.isEmpty(b3) || a(b3)) {
            return true;
        }
        if (context instanceof bew) {
            context = ((bew) context).b();
            v7t.d("BFProcessor", "ViewContext getCurrentContext=" + context);
        }
        if (context instanceof SupportActivity) {
            Bundle bundle = new Bundle();
            bundle.putString(qxq.KEY_FRAGMENT_JUMP, "true");
            bundle.putString(qxq.KEY_FRAGMENT_NAME, "com.taobao.browser.fragment.BrowserFragment");
            bundle.putString(qxq.SUB_KEY_FRAGMENT_JUMP, "BrowserFragment");
            intent.putExtra(qxq.KEY_FRAGMENT_BUNDLE, bundle);
            if (this.f23405a) {
                intent.setData(Uri.parse(b3));
            }
            y71.commitSuccess("BFProcessorAbort", "BrowserFragment");
            v7t.d("BFProcessor", "try to start BrowserFragment " + intent.getDataString());
            return true;
        }
        v7t.d("BFProcessor", "context " + context);
        y71.commitFail("BFProcessorAbort", 5, "context:" + context, b3);
        return true;
    }
}
