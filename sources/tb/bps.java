package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.Map;
import tb.lgs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bps extends e0o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_EXTPARAMS = "extParams";
    public static final String CONFIG_ITEMIDS = "itemIds";
    public static final String CONFIG_LAUNCH = "sLaunch";
    public static final String ITEM_ID_PLACE_HOLDER = "__ITEMID__";
    public static final String RENDER_RESULT_HAS_DW_INSTANCE = "hasDWInstance";
    public static final String RENDER_RESULT_IS_FROM_CACHE = "isFromCache";
    public static final String RENDER_RESULT_IS_LOCAL_VIDEO = "isLocalVideo";
    public static final String TABID_FOLLOW = "follow";
    public static final String TABID_HOME = "home";
    public static final String TABID_INNERLIVE = "innerLive";
    public static final String TABID_NEW_FOLLOW = "newFollow";
    public static final String TABID_VIDEO = "video";

    static {
        t2o.a(502268063);
    }

    public bps(lgs.b bVar) {
        super(bVar);
    }

    public static /* synthetic */ Object ipc$super(bps bpsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/intercept/Tab2RenderIntercept");
    }

    public static Uri s(Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("765bb256", new Object[]{uri});
        }
        if (uri == null || (queryParameter = uri.getQueryParameter("extParams")) == null || !queryParameter.contains(ITEM_ID_PLACE_HOLDER)) {
            return uri;
        }
        String queryParameter2 = uri.getQueryParameter("itemIds");
        if (!TextUtils.isEmpty(queryParameter2)) {
            return nwv.w0(uri, "extParams", queryParameter.replace(ITEM_ID_PLACE_HOLDER, queryParameter2));
        }
        return uri;
    }

    public static Uri t(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ee0fcadd", new Object[]{uri});
        }
        if (uri == null || !TextUtils.equals(uri.getPath(), "/guangguang/index.htm")) {
            return uri;
        }
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            str = query + "&source=outside&tnode=page_guangguang%3FnavbarHide%3Dtrue%26initDataKey%3Dguangguang%26immersive%3Dtrue%26pageTrack%3Dfalse";
        } else {
            str = "source=outside&tnode=page_guangguang%3FnavbarHide%3Dtrue%26initDataKey%3Dguangguang%26immersive%3Dtrue%26pageTrack%3Dfalse";
        }
        return Uri.parse("https://h5.m.taobao.com/tnode/index.htm?" + str);
    }

    @Override // tb.e0o
    public void j(Context context, Object obj, Object obj2, lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d459e8f2", new Object[]{this, context, obj, obj2, bVar});
        }
    }

    @Override // tb.e0o
    public void k(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978b779", new Object[]{this, nVar});
        }
    }

    @Override // tb.e0o
    public void l(Context context, TNodeView tNodeView, Object obj, lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50be3a1", new Object[]{this, context, tNodeView, obj, bVar});
        }
    }

    @Override // tb.e0o
    public void m(Context context, n nVar, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7598859f", new Object[]{this, context, nVar, str, str2, map});
        }
    }

    @Override // tb.e0o
    public void n(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c1db50", new Object[]{this, context, obj});
        }
    }

    @Override // tb.e0o
    public void o(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bdcadb", new Object[]{this, context, obj});
        }
    }

    public static boolean w(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c1a29e6", new Object[]{uri})).booleanValue();
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("tnode");
            if (!TextUtils.isEmpty(queryParameter)) {
                return TextUtils.equals("guangguang", Uri.parse(queryParameter).getQueryParameter(gl4.CONFIG_INIT_DATA_KEY));
            }
        }
        return false;
    }

    public static boolean u(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42dcbc6", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        return v(uri) && TextUtils.equals(uri.getQueryParameter(CONFIG_LAUNCH), "0");
    }

    public static boolean v(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c563ead8", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.equals(path, "/guangguang/index.htm")) {
            return true;
        }
        if (!ufs.r(path)) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("tnode");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        String path2 = Uri.parse(queryParameter).getPath();
        return TextUtils.equals(gol.GUANGGUANG_SHORT_LINK, path2) || (path2 != null && path2.contains("/guangguang/"));
    }

    public static boolean x(String str, String str2) {
        String str3;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17c91048", new Object[]{str, str2})).booleanValue();
        }
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        String queryParameter = parse.getQueryParameter(CONFIG_LAUNCH);
        String queryParameter2 = parse2.getQueryParameter(CONFIG_LAUNCH);
        String queryParameter3 = parse.getQueryParameter("extParams");
        String queryParameter4 = parse2.getQueryParameter("extParams");
        String queryParameter5 = parse.getQueryParameter("tabid");
        String queryParameter6 = parse2.getQueryParameter("tabid");
        if (!TextUtils.equals(queryParameter, queryParameter2) || !TextUtils.equals(queryParameter3, queryParameter4) || !TextUtils.equals(queryParameter5, queryParameter6)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder("sameUrl:");
        sb.append(z);
        if (z) {
            str3 = "";
        } else {
            str3 = "firstExtParams :" + queryParameter3 + " secondExtParams:" + queryParameter4;
        }
        sb.append(str3);
        tfs.g("Tab2RenderIntercept", sb.toString());
        return z;
    }
}
