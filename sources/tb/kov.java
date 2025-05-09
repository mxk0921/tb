package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngine;
import com.taobao.android.turbo.model.PageModel;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class kov {
    public static final a Companion = new a(null);
    public static final String TAG = "UrlUtil";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455474);
        }

        public a() {
        }

        public final boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("259e93aa", new Object[]{this, str})).booleanValue();
            }
            if (TextUtils.equals(str, "/tnode/index.htm") || TextUtils.equals(str, "/tnode/index.html") || TextUtils.equals(str, "/tnode/multipage/index.htm")) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean b(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b42dcbc6", new Object[]{this, uri})).booleanValue();
            }
            if (uri == null) {
                return false;
            }
            return c(uri) && TextUtils.equals(uri.getQueryParameter(bps.CONFIG_LAUNCH), "0");
        }

        public final boolean d(Uri uri, String str, boolean z) {
            Object pageData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e107aee8", new Object[]{this, uri, str, new Boolean(z)})).booleanValue();
            }
            ckf.g(str, "targetTabId");
            if (uri == null || (z && !b(uri))) {
                return false;
            }
            String queryParameter = uri.getQueryParameter("tabid");
            if (TextUtils.equals(queryParameter, str)) {
                return true;
            }
            if (TextUtils.isEmpty(queryParameter)) {
                TurboEngine g = spu.Companion.g();
                String selectedTabId = (g == null || (pageData = g.getPageData()) == null) ? null : ((PageModel) pageData).getSelectedTabId();
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, kov.TAG, "tabId is empty, uri:" + uri, null, 4, null);
                return TextUtils.equals(selectedTabId, str);
            }
            return false;
        }

        public final boolean c(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c563ead8", new Object[]{this, uri})).booleanValue();
            }
            if (uri != null) {
                String path = uri.getPath();
                if (TextUtils.equals(path, "/guangguang/index.htm")) {
                    return true;
                }
                if (a(path)) {
                    String queryParameter = uri.getQueryParameter("tnode");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        Uri parse = Uri.parse(queryParameter);
                        ckf.f(parse, "Uri.parse(tnodeQuery)");
                        String path2 = parse.getPath();
                        if (!TextUtils.equals(gol.GUANGGUANG_SHORT_LINK, path2)) {
                            return path2 != null && wsq.O(path2, "/guangguang/", false, 2, null);
                        }
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static {
        t2o.a(916455473);
    }
}
